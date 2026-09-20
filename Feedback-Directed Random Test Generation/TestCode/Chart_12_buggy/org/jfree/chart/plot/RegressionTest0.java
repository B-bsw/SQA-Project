package org.jfree.chart.plot;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        java.awt.Font font4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.chart.JFreeChart jFreeChart8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D3, rectangle2D4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha((float) '#');
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        java.lang.Class<?> wildcardClass1 = rectangleInsets0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Point2D point2D7 = null;
        org.jfree.chart.plot.PlotState plotState8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D5, rectangle2D6, point2D7, plotState8, plotRenderingInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.lang.Object obj11 = multiplePiePlot8.clone();
        multiplePiePlot8.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        // The following exception was thrown during execution in test generation
        try {
            plot6.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        java.awt.Font font15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot5.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        multiplePiePlot5.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float15 = multiplePiePlot12.getBackgroundAlpha();
        boolean boolean17 = multiplePiePlot12.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint18 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint18);
        java.lang.Class<?> wildcardClass20 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        java.lang.Class<?> wildcardClass8 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        plot14.axisChanged(axisChangeEvent17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot14.drawBackground(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        double double17 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable18 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        multiplePiePlot8.setNoDataMessagePaint(paint18);
        double double20 = multiplePiePlot8.getLimit();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.drawOutline(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        java.lang.Class<?> wildcardClass13 = plot12.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        double double6 = multiplePiePlot1.getLimit();
        java.lang.Object obj7 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        double double6 = multiplePiePlot1.getLimit();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        boolean boolean13 = plot12.isOutlineVisible();
        java.awt.Paint paint14 = plot12.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot12.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D2, rectangle2D3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.lang.String str13 = multiplePiePlot1.getNoDataMessage();
        java.lang.Class<?> wildcardClass14 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        multiplePiePlot8.zoom((double) 100.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint17);
        multiplePiePlot1.zoom((double) 15);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot8.getInsets();
        float float16 = multiplePiePlot8.getBackgroundAlpha();
        java.lang.Object obj17 = multiplePiePlot8.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        java.lang.Class<?> wildcardClass11 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        java.lang.Object obj12 = multiplePiePlot1.clone();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        org.jfree.chart.JFreeChart jFreeChart11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        plot6.axisChanged(axisChangeEvent7);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        java.awt.Paint paint13 = plot12.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNull(datasetGroup20);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot1.getDataExtractOrder();
        java.lang.Class<?> wildcardClass23 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setForegroundAlpha((-1.0f));
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((-1.0d));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        float float8 = multiplePiePlot1.getForegroundAlpha();
        float float9 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        double double6 = multiplePiePlot1.getLimit();
        java.awt.Stroke stroke7 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot1.handleClick(100, (int) ' ', plotRenderingInfo6);
        java.lang.Object obj8 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        java.awt.Font font15 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font15);
        java.lang.String str17 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image18 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(image18);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setBackgroundImageAlignment((int) '4');
        float float20 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        java.awt.Paint paint18 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image19 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = plot14.getBackgroundPaint();
        java.awt.Image image16 = null;
        plot14.setBackgroundImage(image16);
        int int18 = plot14.getBackgroundImageAlignment();
        // The following exception was thrown during execution in test generation
        try {
            plot14.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        double double6 = multiplePiePlot1.getLimit();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot1.drawBackground(graphics2D16, rectangle2D17);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        plot6.axisChanged(axisChangeEvent9);
        java.awt.Stroke stroke11 = plot6.getOutlineStroke();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Paint paint12 = null;
        multiplePiePlot11.setBackgroundPaint(paint12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot11.setOutlineStroke(stroke16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Paint paint20 = null;
        multiplePiePlot19.setBackgroundPaint(paint20);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent22);
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot19.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        float float27 = multiplePiePlot26.getBackgroundImageAlpha();
        multiplePiePlot19.setParent((org.jfree.chart.plot.Plot) multiplePiePlot26);
        java.awt.Paint paint29 = multiplePiePlot19.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot19.getDataset();
        multiplePiePlot19.setForegroundAlpha((float) 100);
        java.awt.Paint paint33 = multiplePiePlot19.getAggregatedItemsPaint();
        multiplePiePlot11.setBackgroundPaint(paint33);
        multiplePiePlot1.setAggregatedItemsPaint(paint33);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D36, rectangle2D37);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.zoom((double) 0.5f);
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset1);
        java.awt.Paint paint3 = multiplePiePlot2.getOutlinePaint();
        java.awt.Stroke stroke4 = null;
        multiplePiePlot2.setOutlineStroke(stroke4);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot2);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot2.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup8 = plot6.getDatasetGroup();
        plot6.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        plot6.drawBackground(graphics2D11, rectangle2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        float float16 = multiplePiePlot15.getBackgroundImageAlpha();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        java.awt.Font font18 = multiplePiePlot15.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot15.getRootPlot();
        double double20 = multiplePiePlot15.getLimit();
        java.awt.Stroke stroke21 = multiplePiePlot15.getOutlineStroke();
        plot6.setOutlineStroke(stroke21);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        java.awt.Image image17 = null;
        multiplePiePlot1.setBackgroundImage(image17);
        java.lang.Comparable comparable19 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Other" + "'", comparable19, "Other");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Image image17 = null;
        multiplePiePlot1.setBackgroundImage(image17);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setBackgroundAlpha((float) 0L);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.lang.Class<?> wildcardClass20 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Paint paint5 = null;
        multiplePiePlot4.setBackgroundPaint(paint5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot4.getRootPlot();
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot4.setPieChart(jFreeChart19);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        java.lang.Class<?> wildcardClass22 = multiplePiePlot0.getClass();
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        multiplePiePlot1.setNoDataMessage("");
        int int19 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        boolean boolean13 = plot12.isOutlineVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        plot12.axisChanged(axisChangeEvent14);
        // The following exception was thrown during execution in test generation
        try {
            plot12.setBackgroundImageAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        java.awt.Font font3 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.util.TableOrder tableOrder4 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Paint paint7 = null;
        multiplePiePlot6.setBackgroundPaint(paint7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot6.notifyListeners(plotChangeEvent9);
        java.awt.Stroke stroke11 = null;
        multiplePiePlot6.setOutlineStroke(stroke11);
        java.awt.Paint paint13 = multiplePiePlot6.getBackgroundPaint();
        java.lang.String str14 = multiplePiePlot6.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot6.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier15);
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(tableOrder4);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        plot6.axisChanged(axisChangeEvent9);
        java.awt.Stroke stroke11 = plot6.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        plot6.markerChanged(markerChangeEvent12);
        float float14 = plot6.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) 0);
        java.lang.Class<?> wildcardClass8 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Image image17 = null;
        multiplePiePlot1.setBackgroundImage(image17);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 100);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        multiplePiePlot9.setForegroundAlpha((float) (-1L));
        java.awt.Image image21 = null;
        multiplePiePlot9.setBackgroundImage(image21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot9.getRootPlot();
        float float24 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Paint paint25 = multiplePiePlot9.getNoDataMessagePaint();
        plot6.setBackgroundPaint(paint25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = plot6.getDatasetGroup();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(datasetGroup27);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot8.getInsets();
        float float16 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        float float20 = multiplePiePlot17.getBackgroundAlpha();
        boolean boolean22 = multiplePiePlot17.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint23 = multiplePiePlot17.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot17.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24, false);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D27, rectangle2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint16 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(jFreeChart19);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.lang.String str14 = multiplePiePlot8.getNoDataMessage();
        float float15 = multiplePiePlot8.getBackgroundAlpha();
        float float16 = multiplePiePlot8.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Paint paint12 = null;
        multiplePiePlot11.setBackgroundPaint(paint12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getBackgroundImageAlpha();
        multiplePiePlot11.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint21 = multiplePiePlot11.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot11.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot11.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier24);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(jFreeChart26);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, (int) (short) 100, plotRenderingInfo20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.awt.geom.Point2D point2D24 = null;
        org.jfree.chart.plot.PlotState plotState25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D22, rectangle2D23, point2D24, plotState25, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        multiplePiePlot1.handleClick(1, 1, plotRenderingInfo4);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        java.awt.Image image21 = null;
        multiplePiePlot1.setBackgroundImage(image21);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent13);
        float float15 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        java.awt.Paint paint18 = null;
        multiplePiePlot13.setOutlinePaint(paint18);
        java.awt.Paint paint20 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint20);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot8.setForegroundAlpha((float) '4');
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot8.setDataset(categoryDataset17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.plot.PlotState plotState22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.draw(graphics2D19, rectangle2D20, point2D21, plotState22, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        java.awt.Font font21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        multiplePiePlot1.setNoDataMessage("");
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        float float7 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        int int16 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint23 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot13.getRootPlot();
        boolean boolean25 = plot24.isOutlineVisible();
        org.jfree.chart.plot.Plot plot26 = plot24.getRootPlot();
        boolean boolean27 = plot24.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = plot24.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets28, true);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(categoryDataset28);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint16 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot8.getInsets();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot8.datasetChanged(datasetChangeEvent16);
        java.awt.Image image18 = null;
        multiplePiePlot8.setBackgroundImage(image18);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot5.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        multiplePiePlot5.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float15 = multiplePiePlot12.getBackgroundAlpha();
        boolean boolean17 = multiplePiePlot12.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint18 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint18);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        int int14 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        multiplePiePlot0.zoom((double) (short) 10);
        org.junit.Assert.assertNull(categoryDataset1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawBackground(graphics2D11, rectangle2D12);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = datasetGroup14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot1.getDatasetGroup();
        java.lang.Object obj8 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint23 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot13.getRootPlot();
        boolean boolean25 = plot24.isOutlineVisible();
        org.jfree.chart.plot.Plot plot26 = plot24.getRootPlot();
        boolean boolean27 = plot24.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = plot24.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets28, true);
        java.lang.String str31 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundAlpha((float) 10L);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.lang.String str14 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot8.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot8.getDataset();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNull(categoryDataset16);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        java.lang.Class<?> wildcardClass16 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Paint paint12 = null;
        multiplePiePlot11.setBackgroundPaint(paint12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent14);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot11.setOutlineStroke(stroke16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Paint paint20 = null;
        multiplePiePlot19.setBackgroundPaint(paint20);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent22);
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot19.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        float float27 = multiplePiePlot26.getBackgroundImageAlpha();
        multiplePiePlot19.setParent((org.jfree.chart.plot.Plot) multiplePiePlot26);
        java.awt.Paint paint29 = multiplePiePlot19.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot19.getDataset();
        multiplePiePlot19.setForegroundAlpha((float) 100);
        java.awt.Paint paint33 = multiplePiePlot19.getAggregatedItemsPaint();
        multiplePiePlot11.setBackgroundPaint(paint33);
        multiplePiePlot1.setAggregatedItemsPaint(paint33);
        java.lang.String str36 = multiplePiePlot1.getPlotType();
        java.awt.Image image37 = multiplePiePlot1.getBackgroundImage();
        float float38 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Multiple Pie Plot" + "'", str36, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = plot14.getOutlineStroke();
        int int20 = plot14.getBackgroundImageAlignment();
        java.awt.Font font21 = plot14.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = null;
        multiplePiePlot23.setBackgroundPaint(paint24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent26);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot23.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        float float31 = multiplePiePlot30.getBackgroundImageAlpha();
        multiplePiePlot23.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        multiplePiePlot23.setForegroundAlpha((float) (-1L));
        java.awt.Image image35 = null;
        multiplePiePlot23.setBackgroundImage(image35);
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot23.getRootPlot();
        float float38 = multiplePiePlot23.getBackgroundAlpha();
        java.awt.Paint paint39 = multiplePiePlot23.getOutlinePaint();
        plot14.setBackgroundPaint(paint39);
        plot14.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNotNull(plot37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        float float17 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(tableOrder15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        boolean boolean13 = plot12.isOutlineVisible();
        org.jfree.chart.plot.Plot plot14 = plot12.getRootPlot();
        boolean boolean15 = plot12.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = plot12.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        plot12.handleClick((int) '#', 0, plotRenderingInfo19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        plot12.handleClick(0, (int) ' ', plotRenderingInfo23);
        float float25 = plot12.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = null;
        multiplePiePlot7.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot7.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint17 = multiplePiePlot14.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint17);
        int int19 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        java.awt.Image image17 = null;
        multiplePiePlot1.setBackgroundImage(image17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.plot.PlotState plotState22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D19, rectangle2D20, point2D21, plotState22, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        float float10 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        float float9 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Paint paint17 = null;
        multiplePiePlot16.setBackgroundPaint(paint17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot16.setOutlinePaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Paint paint25 = null;
        multiplePiePlot24.setBackgroundPaint(paint25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent27);
        java.awt.Stroke stroke29 = multiplePiePlot24.getOutlineStroke();
        multiplePiePlot16.setOutlineStroke(stroke29);
        multiplePiePlot1.setOutlineStroke(stroke29);
        multiplePiePlot1.setOutlineVisible(false);
        boolean boolean35 = multiplePiePlot1.equals((java.lang.Object) false);
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot18.drawBackground(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setNoDataMessage("Other");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        float float19 = multiplePiePlot16.getBackgroundAlpha();
        boolean boolean21 = multiplePiePlot16.equals((java.lang.Object) 1.0d);
        java.lang.String str22 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.util.TableOrder tableOrder23 = multiplePiePlot16.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder23);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tableOrder23);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup8 = plot6.getDatasetGroup();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        plot6.markerChanged(markerChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        java.awt.Font font15 = multiplePiePlot12.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot12.getRootPlot();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot12.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot12.getDrawingSupplier();
        java.awt.Font font21 = multiplePiePlot12.getNoDataMessageFont();
        plot6.setNoDataMessageFont(font21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.drawOutline(graphics2D23, rectangle2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Paint paint17 = null;
        multiplePiePlot16.setBackgroundPaint(paint17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot16.setOutlinePaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Paint paint25 = null;
        multiplePiePlot24.setBackgroundPaint(paint25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent27);
        java.awt.Stroke stroke29 = multiplePiePlot24.getOutlineStroke();
        multiplePiePlot16.setOutlineStroke(stroke29);
        multiplePiePlot1.setOutlineStroke(stroke29);
        multiplePiePlot1.setOutlineVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) 0);
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.lang.String str13 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setNoDataMessage("Other");
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.Point2D point2D25 = null;
        org.jfree.chart.plot.PlotState plotState26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D23, rectangle2D24, point2D25, plotState26, plotRenderingInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup19 = plot18.getDatasetGroup();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        plot18.axisChanged(axisChangeEvent20);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(datasetGroup19);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Paint paint21 = null;
        multiplePiePlot20.setBackgroundPaint(paint21);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot20.drawBackground(graphics2D25, rectangle2D26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot20.setInsets(rectangleInsets28);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent30 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent30);
        multiplePiePlot20.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.awt.Paint paint36 = null;
        multiplePiePlot35.setBackgroundPaint(paint36);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent38 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent38);
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        multiplePiePlot35.drawBackground(graphics2D40, rectangle2D41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot35.setInsets(rectangleInsets43);
        multiplePiePlot20.setInsets(rectangleInsets43);
        multiplePiePlot1.setInsets(rectangleInsets43);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(rectangleInsets43);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot7.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        plot6.axisChanged(axisChangeEvent9);
        java.awt.Stroke stroke11 = plot6.getOutlineStroke();
        plot6.setForegroundAlpha((float) (byte) 100);
        java.lang.Object obj14 = plot6.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot1.handleClick(1, (int) (short) 100, plotRenderingInfo22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D19, rectangle2D20);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint16 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(drawingSupplier19);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent18);
        java.lang.Class<?> wildcardClass20 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot8.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Image image15 = null;
        multiplePiePlot14.setBackgroundImage(image15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot14.getDatasetGroup();
        multiplePiePlot14.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot14.getRootPlot();
        multiplePiePlot14.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Paint paint25 = null;
        multiplePiePlot24.setBackgroundPaint(paint25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot24.getRootPlot();
        java.lang.String str30 = plot29.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup31 = plot29.getDatasetGroup();
        plot29.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = plot29.getDrawingSupplier();
        multiplePiePlot14.setDrawingSupplier(drawingSupplier34);
        multiplePiePlot8.setDrawingSupplier(drawingSupplier34);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(drawingSupplier34);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        java.awt.Font font10 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.Class<?> wildcardClass11 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot1.handleClick(0, (int) '#', plotRenderingInfo18);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.chart.util.TableOrder tableOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(legendItemCollection25);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.zoom((double) 0.5f);
        java.lang.Class<?> wildcardClass22 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup8 = plot6.getDatasetGroup();
        plot6.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = plot6.getDrawingSupplier();
        plot6.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Class<?> wildcardClass21 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) (byte) 0, plotRenderingInfo11);
        java.awt.Paint paint13 = multiplePiePlot1.getOutlinePaint();
        boolean boolean14 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getBackgroundPaint();
        java.awt.Font font11 = multiplePiePlot8.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot8.getRootPlot();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Stroke stroke17 = multiplePiePlot8.getOutlineStroke();
        plot6.setOutlineStroke(stroke17);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0L);
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getBackgroundImageAlpha();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        java.awt.Font font10 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font10);
        java.lang.Comparable comparable12 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint16 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNull(paint16);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener5);
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Paint paint16 = null;
        multiplePiePlot15.setBackgroundPaint(paint16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent18);
        multiplePiePlot15.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot15.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot15.handleClick((int) ' ', (int) (byte) 0, plotRenderingInfo25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.awt.Paint paint29 = null;
        multiplePiePlot28.setBackgroundPaint(paint29);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot28.notifyListeners(plotChangeEvent31);
        java.awt.Stroke stroke33 = null;
        multiplePiePlot28.setOutlineStroke(stroke33);
        java.awt.Paint paint35 = multiplePiePlot28.getBackgroundPaint();
        java.lang.String str36 = multiplePiePlot28.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = multiplePiePlot28.getDrawingSupplier();
        multiplePiePlot15.setDrawingSupplier(drawingSupplier37);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier37);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Multiple Pie Plot" + "'", str36, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier37);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        multiplePiePlot10.setForegroundAlpha((float) (short) 10);
        java.awt.Paint paint17 = multiplePiePlot10.getAggregatedItemsPaint();
        multiplePiePlot10.setBackgroundImageAlignment(1);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Paint paint22 = multiplePiePlot21.getOutlinePaint();
        java.awt.Stroke stroke23 = null;
        multiplePiePlot21.setOutlineStroke(stroke23);
        double double25 = multiplePiePlot21.getLimit();
        org.jfree.chart.util.TableOrder tableOrder26 = multiplePiePlot21.getDataExtractOrder();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        multiplePiePlot21.drawOutline(graphics2D27, rectangle2D28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.awt.Paint paint32 = null;
        multiplePiePlot31.setBackgroundPaint(paint32);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent34);
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot31.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        float float39 = multiplePiePlot38.getBackgroundImageAlpha();
        multiplePiePlot31.setParent((org.jfree.chart.plot.Plot) multiplePiePlot38);
        java.awt.Paint paint41 = multiplePiePlot31.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset42 = multiplePiePlot31.getDataset();
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str45 = multiplePiePlot31.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        java.awt.Paint paint48 = null;
        multiplePiePlot47.setBackgroundPaint(paint48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        java.awt.Paint paint52 = null;
        multiplePiePlot51.setBackgroundPaint(paint52);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent54 = null;
        multiplePiePlot51.notifyListeners(plotChangeEvent54);
        multiplePiePlot51.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart58 = multiplePiePlot51.getPieChart();
        multiplePiePlot47.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        multiplePiePlot31.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        multiplePiePlot21.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        multiplePiePlot10.setPieChart(jFreeChart58);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder26);
        org.junit.Assert.assertNotNull(plot36);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(categoryDataset42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(jFreeChart58);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 10);
        java.awt.Font font10 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        java.lang.Class<?> wildcardClass12 = stroke11.getClass();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        float float13 = multiplePiePlot1.getForegroundAlpha();
        java.lang.Class<?> wildcardClass14 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot1.getDataset();
        java.lang.Object obj20 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot7.getDataset();
        int int10 = multiplePiePlot7.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot7.axisChanged(axisChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = null;
        multiplePiePlot7.setParent(plot13);
        float float15 = multiplePiePlot7.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Paint paint18 = multiplePiePlot17.getOutlinePaint();
        multiplePiePlot7.setAggregatedItemsPaint(paint18);
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        java.awt.Paint paint18 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(jFreeChart19);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 10);
        java.awt.Font font10 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        float float20 = multiplePiePlot17.getBackgroundAlpha();
        boolean boolean22 = multiplePiePlot17.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint23 = multiplePiePlot17.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot17.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24, false);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.awt.geom.Point2D point2D29 = null;
        org.jfree.chart.plot.PlotState plotState30 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D27, rectangle2D28, point2D29, plotState30, plotRenderingInfo31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((-1.0d));
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        java.lang.Class<?> wildcardClass7 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot5.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        multiplePiePlot5.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float15 = multiplePiePlot12.getBackgroundAlpha();
        boolean boolean17 = multiplePiePlot12.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint18 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint18);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = multiplePiePlot23.getOutlinePaint();
        java.awt.Stroke stroke25 = null;
        multiplePiePlot23.setOutlineStroke(stroke25);
        double double27 = multiplePiePlot23.getLimit();
        org.jfree.chart.util.TableOrder tableOrder28 = multiplePiePlot23.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder28);
        org.jfree.chart.util.TableOrder tableOrder30 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image31 = null;
        multiplePiePlot1.setBackgroundImage(image31);
        float float33 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder28);
        org.junit.Assert.assertNotNull(tableOrder30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean14 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0.0d + "'", comparable13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Paint paint26 = null;
        multiplePiePlot25.setBackgroundPaint(paint26);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot25.notifyListeners(plotChangeEvent28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot25.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.awt.Image image33 = null;
        multiplePiePlot32.setBackgroundImage(image33);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        multiplePiePlot32.drawBackgroundImage(graphics2D35, rectangle2D36);
        java.lang.String str38 = multiplePiePlot32.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent39 = null;
        multiplePiePlot32.datasetChanged(datasetChangeEvent39);
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset43 = multiplePiePlot32.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = multiplePiePlot32.getInsets();
        multiplePiePlot25.setInsets(rectangleInsets44);
        multiplePiePlot1.setInsets(rectangleInsets44, false);
        org.jfree.chart.JFreeChart jFreeChart48 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(categoryDataset43);
        org.junit.Assert.assertNotNull(rectangleInsets44);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        multiplePiePlot8.setNoDataMessagePaint(paint18);
        java.lang.String str20 = multiplePiePlot8.getPlotType();
        java.lang.String str21 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot8.setDataset(categoryDataset22);
        float float24 = multiplePiePlot8.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Multiple Pie Plot" + "'", str20, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot9.drawBackground(graphics2D14, rectangle2D15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets20);
        multiplePiePlot1.setLimit((double) 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent21);
        org.jfree.chart.util.TableOrder tableOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = plot14.getBackgroundPaint();
        plot14.setBackgroundImageAlignment((int) (byte) 1);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) (-1L));
        int int10 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        java.lang.Object obj14 = null;
        boolean boolean15 = multiplePiePlot1.equals(obj14);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = plot14.getOutlineStroke();
        int int20 = plot14.getBackgroundImageAlignment();
        java.awt.Image image21 = plot14.getBackgroundImage();
        boolean boolean22 = plot14.isSubplot();
        java.awt.Paint paint23 = plot14.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Paint paint26 = null;
        multiplePiePlot25.setBackgroundPaint(paint26);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot25.notifyListeners(plotChangeEvent28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot25.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        float float33 = multiplePiePlot32.getBackgroundImageAlpha();
        multiplePiePlot25.setParent((org.jfree.chart.plot.Plot) multiplePiePlot32);
        java.awt.Paint paint35 = multiplePiePlot25.getBackgroundPaint();
        multiplePiePlot25.setBackgroundAlpha(0.5f);
        multiplePiePlot25.setForegroundAlpha((float) 100);
        java.awt.Paint paint40 = multiplePiePlot25.getNoDataMessagePaint();
        plot14.setBackgroundPaint(paint40);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setForegroundAlpha((float) 100);
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        boolean boolean13 = plot12.isOutlineVisible();
        org.jfree.chart.plot.Plot plot14 = plot12.getRootPlot();
        boolean boolean15 = plot12.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = plot12.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        plot12.handleClick((int) '#', 0, plotRenderingInfo19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = plot12.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(drawingSupplier21);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint16 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) '#', plotRenderingInfo20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = null;
        multiplePiePlot23.setBackgroundPaint(paint24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent26);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot23.getRootPlot();
        java.awt.Font font29 = multiplePiePlot23.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = multiplePiePlot23.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent31);
        int int33 = multiplePiePlot23.getBackgroundImageAlignment();
        java.awt.Stroke stroke34 = multiplePiePlot23.getOutlineStroke();
        int int35 = multiplePiePlot23.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        multiplePiePlot23.drawBackgroundImage(graphics2D36, rectangle2D37);
        org.jfree.chart.plot.Plot plot39 = multiplePiePlot23.getParent();
        double double40 = multiplePiePlot23.getLimit();
        java.awt.Paint paint41 = multiplePiePlot23.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint41);
        java.lang.String str43 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertNull(plot39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent1);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Paint paint5 = null;
        multiplePiePlot4.setBackgroundPaint(paint5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot4.getRootPlot();
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot4.setPieChart(jFreeChart19);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        java.awt.Image image22 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNull(image22);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setNoDataMessage("Other");
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint20 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot10.getParent();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        multiplePiePlot10.drawBackground(graphics2D22, rectangle2D23);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(plot26);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) 100);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot1.handleClick(10, (int) (short) 1, plotRenderingInfo22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        java.awt.Stroke stroke2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot0.setDataset(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (short) 100, plotRenderingInfo10);
        java.lang.Class<?> wildcardClass12 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setNoDataMessage("Other");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        float float10 = multiplePiePlot9.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot9.getDataset();
        multiplePiePlot9.zoom((-1.0d));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent14);
        float float16 = multiplePiePlot9.getForegroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        float float18 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        java.awt.Paint paint16 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        java.awt.Paint paint19 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot1.setDataset(categoryDataset20);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        float float25 = multiplePiePlot1.getBackgroundAlpha();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Image image9 = null;
        multiplePiePlot8.setBackgroundImage(image9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.lang.String str14 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot8.datasetChanged(datasetChangeEvent15);
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot8.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot8.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets20);
        java.lang.Class<?> wildcardClass22 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint20 = multiplePiePlot10.getBackgroundPaint();
        multiplePiePlot10.setBackgroundAlpha(0.5f);
        multiplePiePlot10.setForegroundAlpha((float) 100);
        java.awt.Paint paint25 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint25);
        java.lang.String str27 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Paint paint12 = null;
        multiplePiePlot11.setBackgroundPaint(paint12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        java.lang.String str17 = plot16.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup18 = plot16.getDatasetGroup();
        plot16.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = plot16.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier21);
        java.lang.Comparable comparable23 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + "Other" + "'", comparable23, "Other");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.lang.Object obj11 = multiplePiePlot8.clone();
        multiplePiePlot8.setOutlineVisible(false);
        multiplePiePlot8.setBackgroundImageAlignment((int) 'a');
        java.awt.Stroke stroke16 = multiplePiePlot8.getOutlineStroke();
        java.lang.String str17 = multiplePiePlot8.getPlotType();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        float float19 = plot14.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        plot14.drawBackgroundImage(graphics2D20, rectangle2D21);
        plot14.setForegroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint17 = multiplePiePlot1.getBackgroundPaint();
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsKey(comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        java.awt.Paint paint16 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        float float20 = multiplePiePlot19.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot19.getDataset();
        multiplePiePlot19.zoom((-1.0d));
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot19.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24, false);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent27);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        boolean boolean13 = plot12.isOutlineVisible();
        org.jfree.chart.plot.Plot plot14 = plot12.getRootPlot();
        boolean boolean15 = plot12.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = plot12.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        plot12.handleClick((int) '#', 0, plotRenderingInfo19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        plot12.handleClick(0, (int) ' ', plotRenderingInfo23);
        boolean boolean25 = plot12.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setLimit((double) (byte) 0);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent16);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.awt.Paint paint4 = null;
        multiplePiePlot3.setBackgroundPaint(paint4);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot3.notifyListeners(plotChangeEvent6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot3.getRootPlot();
        java.lang.String str9 = plot8.getNoDataMessage();
        java.awt.Paint paint10 = plot8.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot8.setInsets(rectangleInsets11, false);
        multiplePiePlot0.setInsets(rectangleInsets11, true);
        multiplePiePlot0.setLimit(0.0d);
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        float float19 = plot14.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        plot14.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Image image23 = plot14.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(image23);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        java.awt.Stroke stroke2 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke2);
        java.awt.Image image4 = null;
        multiplePiePlot0.setBackgroundImage(image4);
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = plot14.getOutlineStroke();
        int int20 = plot14.getBackgroundImageAlignment();
        java.awt.Image image21 = plot14.getBackgroundImage();
        boolean boolean22 = plot14.isSubplot();
        java.awt.Paint paint23 = plot14.getOutlinePaint();
        org.jfree.chart.plot.Plot plot24 = plot14.getRootPlot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(plot24);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot8.getDatasetGroup();
        java.lang.String str13 = multiplePiePlot8.getPlotType();
        java.awt.Font font14 = multiplePiePlot8.getNoDataMessageFont();
        float float15 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot9.setForegroundAlpha((float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Font font6 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        java.lang.Object obj15 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        float float25 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection26);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        int int19 = plot14.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        multiplePiePlot1.setLimit((double) '#');
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent21);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent23);
        java.lang.String str25 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) 100);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent20);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint19 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot9.getDataset();
        multiplePiePlot9.setForegroundAlpha((float) 100);
        java.awt.Paint paint23 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot1.getInsets();
        java.lang.String str26 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Multiple Pie Plot" + "'", str26, "Multiple Pie Plot");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        java.lang.String str16 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Multiple Pie Plot" + "'", str16, "Multiple Pie Plot");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        java.awt.Paint paint24 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot8.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot8.setDataset(categoryDataset13);
        java.lang.Class<?> wildcardClass15 = multiplePiePlot8.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        multiplePiePlot1.zoom(0.0d);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        double double20 = multiplePiePlot1.getLimit();
        java.awt.Font font21 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        java.awt.Font font19 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.Plot plot7 = null;
        multiplePiePlot1.setParent(plot7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        java.lang.String str10 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = plot14.getOutlineStroke();
        int int20 = plot14.getBackgroundImageAlignment();
        java.awt.Font font21 = plot14.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = null;
        multiplePiePlot23.setBackgroundPaint(paint24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent26);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot23.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        float float31 = multiplePiePlot30.getBackgroundImageAlpha();
        multiplePiePlot23.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        multiplePiePlot23.setForegroundAlpha((float) (-1L));
        java.awt.Image image35 = null;
        multiplePiePlot23.setBackgroundImage(image35);
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot23.getRootPlot();
        float float38 = multiplePiePlot23.getBackgroundAlpha();
        java.awt.Paint paint39 = multiplePiePlot23.getOutlinePaint();
        plot14.setBackgroundPaint(paint39);
        java.lang.Class<?> wildcardClass41 = paint39.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNotNull(plot37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image24 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        float float19 = plot14.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        plot14.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.lang.String str23 = plot14.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup3 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        float float5 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundAlpha((float) 0);
        multiplePiePlot1.setForegroundAlpha((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent18);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot8.setForegroundAlpha((float) '4');
        java.lang.Comparable comparable17 = multiplePiePlot8.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Image image20 = null;
        multiplePiePlot19.setBackgroundImage(image20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot19.getDatasetGroup();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        java.awt.Font font25 = multiplePiePlot19.getNoDataMessageFont();
        multiplePiePlot8.setNoDataMessageFont(font25);
        multiplePiePlot8.setForegroundAlpha((float) (short) 100);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        float float25 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.Point2D point2D28 = null;
        org.jfree.chart.plot.PlotState plotState29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D26, rectangle2D27, point2D28, plotState29, plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Image image28 = null;
        multiplePiePlot1.setBackgroundImage(image28);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(legendItemCollection25);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackground(graphics2D17, rectangle2D18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent20);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setNoDataMessage("Other");
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint20 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot10.getParent();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        multiplePiePlot10.drawBackground(graphics2D22, rectangle2D23);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundAlpha((float) 15);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart26);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        float float8 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint10 = plot9.getNoDataMessagePaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundImageAlignment(1);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot12.getRootPlot();
        java.lang.String str18 = plot17.getNoDataMessage();
        java.awt.Paint paint19 = plot17.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot17.setInsets(rectangleInsets20, false);
        multiplePiePlot1.setInsets(rectangleInsets20, true);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = plot9.getNoDataMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot1.handleClick(10, (int) (short) -1, plotRenderingInfo18);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot8.setDataset(categoryDataset14);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent16);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot1.getPieChart();
        java.awt.Image image19 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint1 = multiplePiePlot0.getAggregatedItemsPaint();
        java.awt.Image image2 = null;
        multiplePiePlot0.setBackgroundImage(image2);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlignment(15);
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Paint paint9 = null;
        multiplePiePlot8.setBackgroundPaint(paint9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Paint paint18 = null;
        multiplePiePlot17.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Paint paint22 = null;
        multiplePiePlot21.setBackgroundPaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent24);
        multiplePiePlot21.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot8.setPieChart(jFreeChart28);
        multiplePiePlot1.setPieChart(jFreeChart28);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(jFreeChart28);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        float float20 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot1.handleClick((int) (short) 10, 0, plotRenderingInfo21);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        float float10 = multiplePiePlot1.getBackgroundAlpha();
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        java.awt.geom.Point2D point2D5 = null;
        org.jfree.chart.plot.PlotState plotState6 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D3, rectangle2D4, point2D5, plotState6, plotRenderingInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        plot15.handleClick((int) (short) 100, 100, plotRenderingInfo18);
        // The following exception was thrown during execution in test generation
        try {
            plot15.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setLimit((double) (short) 10);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        java.lang.Class<?> wildcardClass16 = stroke14.getClass();
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent21);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent23);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        java.awt.Stroke stroke26 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        multiplePiePlot1.handleClick((int) (byte) 0, 0, plotRenderingInfo29);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setNoDataMessage("Other");
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        float float10 = multiplePiePlot9.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot9.getDataset();
        multiplePiePlot9.zoom((-1.0d));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent14);
        float float16 = multiplePiePlot9.getForegroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot9.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setForegroundAlpha((float) 100);
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundImageAlignment((-1));
        java.awt.Paint paint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsPaint(paint18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot8.setForegroundAlpha((float) '4');
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot8.getLegendItems();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        multiplePiePlot1.setLimit((double) (-1L));
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(categoryDataset19);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setLimit(10.0d);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        boolean boolean13 = plot12.isOutlineVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        plot12.axisChanged(axisChangeEvent14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        plot12.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint19 = plot12.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot20 = plot12.getRootPlot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Paint paint5 = null;
        multiplePiePlot4.setBackgroundPaint(paint5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot4.getRootPlot();
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot4.setPieChart(jFreeChart19);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Image image24 = null;
        multiplePiePlot23.setBackgroundImage(image24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot23.getDatasetGroup();
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = multiplePiePlot23.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier29);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertNotNull(drawingSupplier29);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        float float10 = multiplePiePlot9.getBackgroundImageAlpha();
        java.awt.Paint paint11 = multiplePiePlot9.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        multiplePiePlot1.zoom((double) 10.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        float float11 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setForegroundAlpha((float) 1);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint18 = null;
        multiplePiePlot1.setBackgroundPaint(paint18);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getBackgroundImageAlpha();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        java.awt.Font font10 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font10);
        java.lang.Comparable comparable12 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        multiplePiePlot1.setBackgroundAlpha(1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        java.awt.Image image19 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        multiplePiePlot1.zoom((double) (short) 1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent9);
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Paint paint18 = null;
        multiplePiePlot17.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Paint paint22 = null;
        multiplePiePlot21.setBackgroundPaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent24);
        multiplePiePlot21.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot1.getDataExtractOrder();
        java.lang.String str32 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(tableOrder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Multiple Pie Plot" + "'", str32, "Multiple Pie Plot");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setLimit(0.0d);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(datasetGroup16);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = plot14.getOutlineStroke();
        int int20 = plot14.getBackgroundImageAlignment();
        java.awt.Font font21 = plot14.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot14.drawOutline(graphics2D22, rectangle2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        java.awt.Paint paint21 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean22 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) '#');
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        boolean boolean20 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        org.jfree.chart.JFreeChart jFreeChart23 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        java.lang.Class<?> wildcardClass17 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Paint paint17 = null;
        multiplePiePlot16.setBackgroundPaint(paint17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent19);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot16.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        float float24 = multiplePiePlot23.getBackgroundImageAlpha();
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot23);
        float float26 = multiplePiePlot23.getBackgroundAlpha();
        boolean boolean28 = multiplePiePlot23.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint29 = multiplePiePlot23.getOutlinePaint();
        multiplePiePlot12.setBackgroundPaint(paint29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot12.setAggregatedItemsPaint(paint31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.awt.Paint paint35 = multiplePiePlot34.getOutlinePaint();
        java.awt.Stroke stroke36 = null;
        multiplePiePlot34.setOutlineStroke(stroke36);
        double double38 = multiplePiePlot34.getLimit();
        org.jfree.chart.util.TableOrder tableOrder39 = multiplePiePlot34.getDataExtractOrder();
        multiplePiePlot12.setDataExtractOrder(tableOrder39);
        org.jfree.chart.util.TableOrder tableOrder41 = multiplePiePlot12.getDataExtractOrder();
        java.awt.Image image42 = null;
        multiplePiePlot12.setBackgroundImage(image42);
        float float44 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = multiplePiePlot12.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets45, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder39);
        org.junit.Assert.assertNotNull(tableOrder41);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets45);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setOutlineVisible(false);
        multiplePiePlot1.setNoDataMessage("Other");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint23 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot13.getDataset();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str27 = multiplePiePlot13.getNoDataMessage();
        java.awt.Paint paint28 = multiplePiePlot13.getNoDataMessagePaint();
        java.awt.Paint paint29 = multiplePiePlot13.getAggregatedItemsPaint();
        java.lang.String str30 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart31);
        java.lang.Comparable comparable33 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(jFreeChart31);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + "Other" + "'", comparable33, "Other");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = plot6.isOutlineVisible();
        java.awt.Image image8 = null;
        plot6.setBackgroundImage(image8);
        java.awt.Image image10 = null;
        plot6.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint23 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent26 = null;
        multiplePiePlot13.datasetChanged(datasetChangeEvent26);
        multiplePiePlot13.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot13.setDataset(categoryDataset30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot13.setInsets(rectangleInsets32);
        plot6.setInsets(rectangleInsets32, false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        double double12 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Paint paint15 = null;
        multiplePiePlot14.setBackgroundPaint(paint15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot14.getRootPlot();
        java.awt.Font font20 = multiplePiePlot14.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot14.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent22);
        multiplePiePlot14.setBackgroundImageAlignment((int) (byte) -1);
        int int26 = multiplePiePlot14.getBackgroundImageAlignment();
        java.awt.Stroke stroke27 = multiplePiePlot14.getOutlineStroke();
        boolean boolean28 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot1.handleClick((int) (byte) 0, (int) (byte) -1, plotRenderingInfo31);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        float float10 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        java.awt.Paint paint12 = multiplePiePlot1.getBackgroundPaint();
        float float13 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot8.axisChanged(axisChangeEvent14);
        float float16 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent17);
        multiplePiePlot8.zoom((double) (byte) 0);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        boolean boolean17 = plot16.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Image image18 = null;
        multiplePiePlot17.setBackgroundImage(image18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot17.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Font font23 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot17.setLimit((double) '4');
        java.awt.Paint paint26 = multiplePiePlot17.getNoDataMessagePaint();
        boolean boolean27 = multiplePiePlot17.isOutlineVisible();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.lang.String str29 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Multiple Pie Plot" + "'", str29, "Multiple Pie Plot");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup8 = plot6.getDatasetGroup();
        java.lang.Object obj9 = plot6.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        java.awt.Font font15 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font15);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = null;
        multiplePiePlot7.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot7.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        float float17 = multiplePiePlot14.getBackgroundAlpha();
        boolean boolean19 = multiplePiePlot14.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint20 = multiplePiePlot14.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets21, false);
        java.lang.Comparable comparable24 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "Other" + "'", comparable24, "Other");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(tableOrder8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = plot14.getBackgroundImage();
        float float16 = plot14.getBackgroundAlpha();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot14.setOutlineStroke(stroke17);
        java.awt.Stroke stroke19 = plot14.getOutlineStroke();
        int int20 = plot14.getBackgroundImageAlignment();
        java.awt.Image image21 = plot14.getBackgroundImage();
        plot14.zoom((double) (-1.0f));
        plot14.setForegroundAlpha((float) '#');
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNull(image21);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        plot6.axisChanged(axisChangeEvent9);
        java.awt.Stroke stroke11 = plot6.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Image image14 = null;
        multiplePiePlot13.setBackgroundImage(image14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot13.getDatasetGroup();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        java.awt.Font font19 = multiplePiePlot13.getNoDataMessageFont();
        plot6.setNoDataMessageFont(font19);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets7);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot8.getDatasetGroup();
        java.awt.Image image13 = multiplePiePlot8.getBackgroundImage();
        boolean boolean14 = multiplePiePlot8.isOutlineVisible();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        multiplePiePlot9.setForegroundAlpha((float) (-1L));
        java.awt.Image image21 = null;
        multiplePiePlot9.setBackgroundImage(image21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot9.getRootPlot();
        float float24 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Paint paint25 = multiplePiePlot9.getNoDataMessagePaint();
        plot6.setBackgroundPaint(paint25);
        java.lang.Class<?> wildcardClass27 = plot6.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.awt.Stroke stroke16 = null;
        multiplePiePlot1.setOutlineStroke(stroke16);
        java.awt.Paint paint18 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getBackgroundImageAlpha();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        java.awt.Font font10 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font10);
        java.lang.Comparable comparable12 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Image image18 = null;
        multiplePiePlot17.setBackgroundImage(image18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot17.getDatasetGroup();
        multiplePiePlot17.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = plot23.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier24);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(legendItemCollection26);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        java.lang.Comparable comparable18 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        float float20 = multiplePiePlot1.getForegroundAlpha();
        float float21 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 10 + "'", comparable18, (byte) 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Paint paint7 = multiplePiePlot6.getOutlinePaint();
        java.awt.Stroke stroke8 = null;
        multiplePiePlot6.setOutlineStroke(stroke8);
        double double10 = multiplePiePlot6.getLimit();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot6.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder11);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder17);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Paint paint5 = null;
        multiplePiePlot4.setBackgroundPaint(paint5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot4.getRootPlot();
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot4.setPieChart(jFreeChart19);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        java.lang.Class<?> wildcardClass22 = jFreeChart19.getClass();
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) '4');
        multiplePiePlot1.zoom((double) (byte) 100);
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Paint paint15 = null;
        multiplePiePlot14.setBackgroundPaint(paint15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot14.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        float float22 = multiplePiePlot21.getBackgroundImageAlpha();
        multiplePiePlot14.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        float float24 = multiplePiePlot21.getBackgroundAlpha();
        boolean boolean26 = multiplePiePlot21.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint27 = multiplePiePlot21.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot21.getInsets();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        multiplePiePlot21.datasetChanged(datasetChangeEvent29);
        java.awt.Paint paint31 = multiplePiePlot21.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint31);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(tableOrder12);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) 100);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Paint paint22 = null;
        multiplePiePlot21.setBackgroundPaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent24);
        multiplePiePlot21.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot21.handleClick((int) ' ', (int) (byte) 0, plotRenderingInfo31);
        java.awt.Paint paint33 = multiplePiePlot21.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint33);
        java.awt.Image image35 = null;
        multiplePiePlot1.setBackgroundImage(image35);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Paint paint16 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        java.lang.Object obj18 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        java.awt.Paint paint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessagePaint(paint18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = multiplePiePlot1.equals(obj20);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(legendItemCollection22);
        org.junit.Assert.assertNull(categoryDataset23);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        float float10 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNull(stroke11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        plot6.axisChanged(axisChangeEvent9);
        plot6.setBackgroundImageAlignment((int) (byte) 100);
        plot6.setOutlineVisible(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        plot6.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot5.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        multiplePiePlot5.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float15 = multiplePiePlot12.getBackgroundAlpha();
        boolean boolean17 = multiplePiePlot12.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint18 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint18);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot1.getInsets();
        java.lang.String str23 = multiplePiePlot1.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup24 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertNull(datasetGroup24);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup8 = plot6.getDatasetGroup();
        plot6.setOutlineVisible(true);
        java.awt.Paint paint11 = plot6.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot12 = plot6.getParent();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Paint paint26 = null;
        multiplePiePlot25.setBackgroundPaint(paint26);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot25.notifyListeners(plotChangeEvent28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot25.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.awt.Image image33 = null;
        multiplePiePlot32.setBackgroundImage(image33);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        multiplePiePlot32.drawBackgroundImage(graphics2D35, rectangle2D36);
        java.lang.String str38 = multiplePiePlot32.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent39 = null;
        multiplePiePlot32.datasetChanged(datasetChangeEvent39);
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset43 = multiplePiePlot32.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = multiplePiePlot32.getInsets();
        multiplePiePlot25.setInsets(rectangleInsets44);
        multiplePiePlot1.setInsets(rectangleInsets44, false);
        org.jfree.chart.util.TableOrder tableOrder48 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(categoryDataset43);
        org.junit.Assert.assertNotNull(rectangleInsets44);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Font font6 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.Class<?> wildcardClass15 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        java.lang.Class<?> wildcardClass26 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        java.lang.Object obj17 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        float float8 = multiplePiePlot7.getBackgroundImageAlpha();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        java.awt.Font font10 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font10);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 1);
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundAlpha((float) ' ');
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.awt.Paint paint4 = null;
        multiplePiePlot3.setBackgroundPaint(paint4);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot3.notifyListeners(plotChangeEvent6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot3.getRootPlot();
        java.lang.String str9 = plot8.getNoDataMessage();
        java.awt.Paint paint10 = plot8.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot8.setInsets(rectangleInsets11, false);
        multiplePiePlot0.setInsets(rectangleInsets11, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent16);
        multiplePiePlot0.setForegroundAlpha((float) (short) -1);
        java.lang.String str20 = multiplePiePlot0.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        float float23 = multiplePiePlot22.getBackgroundImageAlpha();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        java.awt.Paint paint25 = multiplePiePlot22.getNoDataMessagePaint();
        java.awt.Paint paint26 = multiplePiePlot22.getNoDataMessagePaint();
        multiplePiePlot0.setOutlinePaint(paint26);
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setOutlineVisible(true);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        java.awt.Font font15 = multiplePiePlot9.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot9.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent17);
        int int19 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Stroke stroke20 = multiplePiePlot9.getOutlineStroke();
        int int21 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        multiplePiePlot9.drawBackgroundImage(graphics2D22, rectangle2D23);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent25);
        java.lang.String str27 = multiplePiePlot9.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.awt.Paint paint30 = null;
        multiplePiePlot29.setBackgroundPaint(paint30);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot29.notifyListeners(plotChangeEvent32);
        multiplePiePlot29.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot29.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        multiplePiePlot29.handleClick((int) ' ', (int) (byte) 0, plotRenderingInfo39);
        java.awt.Paint paint41 = multiplePiePlot29.getOutlinePaint();
        multiplePiePlot9.setNoDataMessagePaint(paint41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.awt.Paint paint45 = null;
        multiplePiePlot44.setBackgroundPaint(paint45);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = null;
        multiplePiePlot44.notifyListeners(plotChangeEvent47);
        org.jfree.chart.plot.Plot plot49 = multiplePiePlot44.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        float float52 = multiplePiePlot51.getBackgroundImageAlpha();
        multiplePiePlot44.setParent((org.jfree.chart.plot.Plot) multiplePiePlot51);
        java.awt.Paint paint54 = multiplePiePlot44.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent55 = null;
        multiplePiePlot44.notifyListeners(plotChangeEvent55);
        org.jfree.chart.plot.Plot plot57 = multiplePiePlot44.getParent();
        java.awt.Image image58 = plot57.getBackgroundImage();
        float float59 = plot57.getBackgroundAlpha();
        java.awt.Stroke stroke60 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot57.setOutlineStroke(stroke60);
        java.awt.Stroke stroke62 = plot57.getOutlineStroke();
        int int63 = plot57.getBackgroundImageAlignment();
        java.awt.Font font64 = plot57.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        java.awt.Paint paint67 = null;
        multiplePiePlot66.setBackgroundPaint(paint67);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent69 = null;
        multiplePiePlot66.notifyListeners(plotChangeEvent69);
        org.jfree.chart.plot.Plot plot71 = multiplePiePlot66.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset72 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot73 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset72);
        float float74 = multiplePiePlot73.getBackgroundImageAlpha();
        multiplePiePlot66.setParent((org.jfree.chart.plot.Plot) multiplePiePlot73);
        multiplePiePlot66.setForegroundAlpha((float) (-1L));
        java.awt.Image image78 = null;
        multiplePiePlot66.setBackgroundImage(image78);
        org.jfree.chart.plot.Plot plot80 = multiplePiePlot66.getRootPlot();
        float float81 = multiplePiePlot66.getBackgroundAlpha();
        java.awt.Paint paint82 = multiplePiePlot66.getOutlinePaint();
        plot57.setBackgroundPaint(paint82);
        multiplePiePlot9.setNoDataMessagePaint(paint82);
        multiplePiePlot1.setOutlinePaint(paint82);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(jFreeChart36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(plot49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.5f + "'", float52 == 0.5f);
        org.junit.Assert.assertNull(paint54);
        org.junit.Assert.assertNotNull(plot57);
        org.junit.Assert.assertNull(image58);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 15 + "'", int63 == 15);
        org.junit.Assert.assertNotNull(font64);
        org.junit.Assert.assertNotNull(plot71);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.5f + "'", float74 == 0.5f);
        org.junit.Assert.assertNotNull(plot80);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 1.0f + "'", float81 == 1.0f);
        org.junit.Assert.assertNotNull(paint82);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Paint paint18 = null;
        multiplePiePlot17.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Paint paint22 = null;
        multiplePiePlot21.setBackgroundPaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent24);
        multiplePiePlot21.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        java.lang.Object obj31 = multiplePiePlot1.clone();
        multiplePiePlot1.setLimit((double) 'a');
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.chart.util.TableOrder tableOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        int int14 = multiplePiePlot1.getBackgroundImageAlignment();
        double double15 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint20 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot10.getRootPlot();
        boolean boolean22 = plot21.isOutlineVisible();
        org.jfree.chart.plot.Plot plot23 = plot21.getRootPlot();
        boolean boolean24 = plot21.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = plot21.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        plot21.handleClick((int) '#', 0, plotRenderingInfo28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        plot21.handleClick(0, (int) ' ', plotRenderingInfo32);
        multiplePiePlot1.setParent(plot21);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot8.setForegroundAlpha((float) '4');
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot8.setDataset(categoryDataset17);
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot8.setAggregatedItemsPaint(paint19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot8.getDatasetGroup();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(datasetGroup21);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        float float20 = multiplePiePlot1.getBackgroundImageAlpha();
        int int21 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(jFreeChart22);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Paint paint12 = null;
        multiplePiePlot11.setBackgroundPaint(paint12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getBackgroundImageAlpha();
        multiplePiePlot11.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint21 = multiplePiePlot11.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot11.getDataset();
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str25 = multiplePiePlot11.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.awt.Paint paint28 = null;
        multiplePiePlot27.setBackgroundPaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.awt.Paint paint32 = null;
        multiplePiePlot31.setBackgroundPaint(paint32);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent34);
        multiplePiePlot31.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart38 = multiplePiePlot31.getPieChart();
        multiplePiePlot27.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        multiplePiePlot11.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(jFreeChart38);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        float float14 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        float float16 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.zoom((-1.0d));
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) 100);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 'a');
        java.awt.Image image22 = null;
        multiplePiePlot1.setBackgroundImage(image22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup3 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setLimit((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(plot7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setForegroundAlpha(1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        java.lang.Object obj15 = multiplePiePlot1.clone();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.notifyListeners(plotChangeEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) (-1L));
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        java.awt.Paint paint16 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font17 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str18 = multiplePiePlot1.getPlotType();
        java.lang.Object obj19 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        plot6.axisChanged(axisChangeEvent9);
        java.awt.Stroke stroke11 = plot6.getOutlineStroke();
        java.awt.Paint paint12 = plot6.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            plot6.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setLimit((double) 15);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((-1.0d));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener9);
        multiplePiePlot1.setBackgroundImageAlignment(0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = null;
        multiplePiePlot7.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot7.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        float float15 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        float float17 = multiplePiePlot14.getBackgroundAlpha();
        boolean boolean19 = multiplePiePlot14.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint20 = multiplePiePlot14.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets21, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot1.handleClick(15, (int) (short) 10, plotRenderingInfo26);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(tableOrder16);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint19 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot9.getDataset();
        multiplePiePlot9.setForegroundAlpha((float) 100);
        java.awt.Paint paint23 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNull(stroke10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.lang.Object obj11 = multiplePiePlot8.clone();
        multiplePiePlot8.setOutlineVisible(false);
        multiplePiePlot8.setBackgroundImageAlignment((int) 'a');
        java.awt.Stroke stroke16 = multiplePiePlot8.getOutlineStroke();
        multiplePiePlot8.setNoDataMessage("");
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setLimit((double) 10.0f);
        int int6 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        float float10 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot8.getInsets();
        java.awt.Paint paint16 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot8.handleClick((int) (byte) 100, (int) 'a', plotRenderingInfo19);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot1.getBackgroundPaint();
        float float17 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint18 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setForegroundAlpha(1.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot1.handleClick(0, (int) (byte) -1, plotRenderingInfo21);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent23);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        boolean boolean13 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tableOrder14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        int int20 = multiplePiePlot17.getBackgroundImageAlignment();
        java.awt.Paint paint21 = multiplePiePlot17.getOutlinePaint();
        java.awt.Image image22 = null;
        multiplePiePlot17.setBackgroundImage(image22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent24);
        java.awt.Stroke stroke26 = multiplePiePlot17.getOutlineStroke();
        java.awt.Paint paint27 = multiplePiePlot17.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint27);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent29);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Image image18 = null;
        multiplePiePlot17.setBackgroundImage(image18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot17.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Font font23 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot17.setLimit((double) '4');
        java.awt.Paint paint26 = multiplePiePlot17.getNoDataMessagePaint();
        boolean boolean27 = multiplePiePlot17.isOutlineVisible();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Image image29 = null;
        multiplePiePlot17.setBackgroundImage(image29);
        java.awt.Font font31 = multiplePiePlot17.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) 100);
        java.lang.String str18 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot1.getDatasetGroup();
        int int14 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, (int) (byte) 10, plotRenderingInfo11);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Paint paint9 = null;
        multiplePiePlot8.setBackgroundPaint(paint9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        java.lang.String str14 = plot13.getNoDataMessage();
        java.awt.Paint paint15 = plot13.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        plot13.axisChanged(axisChangeEvent16);
        java.awt.Stroke stroke18 = plot13.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke18);
        double double20 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        java.awt.Paint paint16 = plot15.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 1);
        boolean boolean20 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit(1.0d);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(plot23);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        multiplePiePlot1.setBackgroundImageAlpha((float) 1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent17);
        java.awt.Image image19 = null;
        multiplePiePlot1.setBackgroundImage(image19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot5.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        multiplePiePlot5.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float15 = multiplePiePlot12.getBackgroundAlpha();
        boolean boolean17 = multiplePiePlot12.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint18 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint18);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setAggregatedItemsPaint(paint20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot1.getInsets();
        java.lang.Object obj23 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) 100);
        java.awt.Paint paint18 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font19 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot1.getDatasetGroup();
        java.awt.Font font21 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) false);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        boolean boolean13 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot8.getInsets();
        multiplePiePlot8.zoom((double) (short) -1);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot8.getDataExtractOrder();
        boolean boolean19 = multiplePiePlot8.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        java.awt.Font font3 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Paint paint4 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint5 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        float float24 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D25, rectangle2D26);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        boolean boolean19 = plot18.isOutlineVisible();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((-1.0d));
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        plot6.axisChanged(axisChangeEvent9);
        java.awt.Stroke stroke11 = plot6.getOutlineStroke();
        java.awt.Paint paint12 = plot6.getBackgroundPaint();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        plot6.drawBackground(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        multiplePiePlot1.setOutlineVisible(true);
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) 10 + "'", comparable11, (byte) 10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = null;
        multiplePiePlot23.setBackgroundPaint(paint24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent26);
        java.awt.Stroke stroke28 = null;
        multiplePiePlot23.setOutlineStroke(stroke28);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot23);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        multiplePiePlot23.datasetChanged(datasetChangeEvent31);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent26);
        float float28 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) false);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint23 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent24);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot13.getParent();
        java.awt.Paint paint27 = multiplePiePlot13.getOutlinePaint();
        float float28 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot13.setDataset(categoryDataset29);
        multiplePiePlot13.setNoDataMessage("Other");
        boolean boolean33 = multiplePiePlot1.equals((java.lang.Object) "Other");
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) 0);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot9.setOutlinePaint(paint14);
        java.awt.Paint paint16 = multiplePiePlot9.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint16);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot1.setDataset(categoryDataset20);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        multiplePiePlot5.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        multiplePiePlot1.setLimit((double) (byte) 10);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNotNull(jFreeChart16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        multiplePiePlot1.setLimit((double) (-1L));
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0d);
        multiplePiePlot1.setLimit((-1.0d));
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot8.getDatasetGroup();
        multiplePiePlot8.setBackgroundImageAlignment((int) '4');
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot8.getParent();
        multiplePiePlot8.zoom((double) (-1L));
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setLimit(10.0d);
        float float21 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets20);
        java.awt.Paint paint22 = multiplePiePlot1.getOutlinePaint();
        boolean boolean23 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) 0);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        java.lang.String str16 = plot15.getNoDataMessage();
        java.awt.Paint paint17 = plot15.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        plot15.axisChanged(axisChangeEvent18);
        java.awt.Stroke stroke20 = plot15.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke20);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(tableOrder8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint19 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot9.getDataset();
        multiplePiePlot9.setForegroundAlpha((float) 100);
        java.awt.Paint paint23 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint23);
        int int25 = multiplePiePlot1.getBackgroundImageAlignment();
        double double26 = multiplePiePlot1.getLimit();
        java.awt.Paint paint27 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Object obj28 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Paint paint24 = null;
        multiplePiePlot23.setBackgroundPaint(paint24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot23.notifyListeners(plotChangeEvent26);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot23.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        float float31 = multiplePiePlot30.getBackgroundImageAlpha();
        multiplePiePlot23.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        float float33 = multiplePiePlot30.getBackgroundAlpha();
        boolean boolean35 = multiplePiePlot30.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint36 = multiplePiePlot30.getOutlinePaint();
        multiplePiePlot30.setForegroundAlpha((float) '4');
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        multiplePiePlot30.setDataset(categoryDataset39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot30.setAggregatedItemsPaint(paint41);
        multiplePiePlot1.setNoDataMessagePaint(paint41);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent1);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Paint paint5 = null;
        multiplePiePlot4.setBackgroundPaint(paint5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot4.getRootPlot();
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot4.setPieChart(jFreeChart19);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier22);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot1.setDataset(categoryDataset21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(plot23);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        float float10 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNull(stroke11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (short) 100, plotRenderingInfo10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        float float14 = multiplePiePlot13.getBackgroundImageAlpha();
        java.awt.Paint paint15 = multiplePiePlot13.getBackgroundPaint();
        java.awt.Font font16 = multiplePiePlot13.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot13.getRootPlot();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot13.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot13.getDrawingSupplier();
        java.awt.Font font22 = multiplePiePlot13.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font22);
        java.awt.Stroke stroke24 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        double double11 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Paint paint25 = null;
        multiplePiePlot24.setBackgroundPaint(paint25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent27);
        multiplePiePlot24.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot24.getPieChart();
        multiplePiePlot13.setPieChart(jFreeChart31);
        java.awt.Paint paint33 = multiplePiePlot13.getAggregatedItemsPaint();
        java.awt.Paint paint34 = multiplePiePlot13.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint34);
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(jFreeChart36);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Paint paint7 = multiplePiePlot6.getOutlinePaint();
        java.awt.Stroke stroke8 = null;
        multiplePiePlot6.setOutlineStroke(stroke8);
        double double10 = multiplePiePlot6.getLimit();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot6.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder11);
        java.lang.Object obj13 = multiplePiePlot1.clone();
        multiplePiePlot1.setLimit((double) '4');
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Paint paint19 = null;
        multiplePiePlot18.setBackgroundPaint(paint19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent21);
        java.awt.Paint paint23 = null;
        multiplePiePlot18.setOutlinePaint(paint23);
        java.awt.Paint paint25 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint26 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint26);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        double double19 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent20);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        multiplePiePlot1.zoom((double) (short) 10);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(plot26);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setNoDataMessage("Other");
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        float float18 = multiplePiePlot17.getBackgroundImageAlpha();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint20 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot10.getParent();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        multiplePiePlot10.drawBackground(graphics2D22, rectangle2D23);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot1.getPieChart();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D27, rectangle2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart26);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        java.lang.Object obj15 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        java.awt.Font font15 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font15);
        java.lang.String str17 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setForegroundAlpha((float) 100L);
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Paint paint18 = null;
        multiplePiePlot17.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Paint paint22 = null;
        multiplePiePlot21.setBackgroundPaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent24);
        multiplePiePlot21.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        float float31 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        multiplePiePlot1.setNoDataMessage("Other");
        java.lang.Comparable comparable21 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "Other" + "'", comparable21, "Other");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10L);
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot8.setForegroundAlpha((float) '4');
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot8.setDataset(categoryDataset17);
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot8.setAggregatedItemsPaint(paint19);
        java.lang.Object obj21 = multiplePiePlot8.clone();
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.setAggregatedItemsKey(comparable22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot1.getParent();
        java.awt.Font font24 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        java.awt.Font font3 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D19, rectangle2D20);
        double double22 = multiplePiePlot1.getLimit();
        java.lang.String str23 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot24);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Paint paint17 = null;
        multiplePiePlot16.setBackgroundPaint(paint17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot16.setOutlinePaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Paint paint25 = null;
        multiplePiePlot24.setBackgroundPaint(paint25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent27);
        java.awt.Stroke stroke29 = multiplePiePlot24.getOutlineStroke();
        multiplePiePlot16.setOutlineStroke(stroke29);
        multiplePiePlot1.setOutlineStroke(stroke29);
        multiplePiePlot1.setOutlineVisible(false);
        boolean boolean34 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        java.lang.Object obj19 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D19, rectangle2D20);
        double double22 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Paint paint25 = null;
        multiplePiePlot24.setBackgroundPaint(paint25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot24.getRootPlot();
        java.awt.Font font30 = multiplePiePlot24.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot24.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot24.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets32);
        java.awt.Paint paint34 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(drawingSupplier31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Paint paint6 = null;
        multiplePiePlot5.setBackgroundPaint(paint6);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot5.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        multiplePiePlot5.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.lang.Object obj15 = multiplePiePlot12.clone();
        multiplePiePlot12.setOutlineVisible(false);
        java.awt.Paint paint18 = multiplePiePlot12.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        multiplePiePlot1.setForegroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint14 = multiplePiePlot13.getAggregatedItemsPaint();
        java.awt.Image image15 = null;
        multiplePiePlot13.setBackgroundImage(image15);
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot13.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder17);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(tableOrder17);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint18 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (short) 100, plotRenderingInfo10);
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        java.awt.Stroke stroke13 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets20);
        java.awt.Paint paint22 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot1.handleClick(15, (int) '#', plotRenderingInfo25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(drawingSupplier27);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        double double17 = multiplePiePlot1.getLimit();
        boolean boolean18 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setLimit((double) 0L);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 100);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = plot6.isOutlineVisible();
        float float8 = plot6.getBackgroundAlpha();
        java.awt.Image image9 = null;
        plot6.setBackgroundImage(image9);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setLimit((double) 0L);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setBackgroundAlpha((float) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Paint paint12 = null;
        multiplePiePlot11.setBackgroundPaint(paint12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        float float19 = multiplePiePlot18.getBackgroundImageAlpha();
        multiplePiePlot11.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint21 = multiplePiePlot11.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot11.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot11.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot11.getDrawingSupplier();
        java.lang.String str25 = multiplePiePlot11.getPlotType();
        java.awt.Paint paint26 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint26);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot1.handleClick(1, 10, plotRenderingInfo19);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        multiplePiePlot1.setOutlineVisible(false);
        double double11 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setNoDataMessage("");
        int int28 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Paint paint18 = null;
        multiplePiePlot17.setBackgroundPaint(paint18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Paint paint22 = null;
        multiplePiePlot21.setBackgroundPaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent24);
        multiplePiePlot21.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Paint paint34 = null;
        multiplePiePlot33.setBackgroundPaint(paint34);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        multiplePiePlot33.notifyListeners(plotChangeEvent36);
        java.awt.Stroke stroke38 = null;
        multiplePiePlot33.setOutlineStroke(stroke38);
        java.awt.Paint paint40 = multiplePiePlot33.getBackgroundPaint();
        java.lang.String str41 = multiplePiePlot33.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = multiplePiePlot33.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier42);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent44);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(tableOrder31);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Multiple Pie Plot" + "'", str41, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier42);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        float float17 = multiplePiePlot16.getBackgroundImageAlpha();
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint19 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot9.getDataset();
        multiplePiePlot9.setForegroundAlpha((float) 100);
        java.awt.Paint paint23 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot1.getInsets();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        multiplePiePlot1.drawOutline(graphics2D26, rectangle2D27);
        java.lang.String str29 = multiplePiePlot1.getNoDataMessage();
        java.awt.Stroke stroke30 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection31 = multiplePiePlot1.getLegendItems();
        java.lang.Object obj32 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNotNull(legendItemCollection31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getParent();
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(tableOrder17);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint13 = multiplePiePlot1.getOutlinePaint();
        float float14 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) '4');
        java.awt.Paint paint10 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        int int15 = multiplePiePlot12.getBackgroundImageAlignment();
        java.awt.Paint paint16 = multiplePiePlot12.getOutlinePaint();
        java.awt.Image image17 = null;
        multiplePiePlot12.setBackgroundImage(image17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent19);
        java.lang.String str21 = multiplePiePlot12.getPlotType();
        java.awt.Paint paint22 = multiplePiePlot12.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        java.awt.Image image11 = multiplePiePlot1.getBackgroundImage();
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) '4');
        multiplePiePlot1.zoom((double) (byte) 100);
        java.awt.Paint paint12 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 1);
        boolean boolean20 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jFreeChart21);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10L);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        float float24 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D25, rectangle2D26);
        multiplePiePlot1.setLimit((double) (byte) 10);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        float float10 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean11 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        float float23 = multiplePiePlot20.getBackgroundAlpha();
        boolean boolean25 = multiplePiePlot20.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint26 = multiplePiePlot20.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot20.getInsets();
        multiplePiePlot20.zoom((double) (short) -1);
        java.awt.Paint paint30 = multiplePiePlot20.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint30);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.plot.PlotState plotState20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D17, rectangle2D18, point2D19, plotState20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setLimit(10.0d);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(plot19);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(0.5f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(plot19);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        float float13 = multiplePiePlot12.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        java.awt.Font font15 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font15);
        java.lang.String str17 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        java.awt.Image image23 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint24 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot8.getDatasetGroup();
        java.awt.Image image13 = multiplePiePlot8.getBackgroundImage();
        multiplePiePlot8.setForegroundAlpha((float) (byte) -1);
        java.lang.String str16 = multiplePiePlot8.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        java.awt.Paint paint21 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Object obj22 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlignment(15);
        java.lang.Object obj17 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Paint paint16 = null;
        multiplePiePlot15.setBackgroundPaint(paint16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent18);
        multiplePiePlot15.setForegroundAlpha((float) (short) 10);
        java.awt.Paint paint22 = multiplePiePlot15.getAggregatedItemsPaint();
        multiplePiePlot15.setBackgroundImageAlignment(1);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Paint paint27 = multiplePiePlot26.getOutlinePaint();
        java.awt.Stroke stroke28 = null;
        multiplePiePlot26.setOutlineStroke(stroke28);
        double double30 = multiplePiePlot26.getLimit();
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot26.getDataExtractOrder();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        multiplePiePlot26.drawOutline(graphics2D32, rectangle2D33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.awt.Paint paint37 = null;
        multiplePiePlot36.setBackgroundPaint(paint37);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot36.notifyListeners(plotChangeEvent39);
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot36.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        float float44 = multiplePiePlot43.getBackgroundImageAlpha();
        multiplePiePlot36.setParent((org.jfree.chart.plot.Plot) multiplePiePlot43);
        java.awt.Paint paint46 = multiplePiePlot36.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset47 = multiplePiePlot36.getDataset();
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str50 = multiplePiePlot36.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        java.awt.Paint paint53 = null;
        multiplePiePlot52.setBackgroundPaint(paint53);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        java.awt.Paint paint57 = null;
        multiplePiePlot56.setBackgroundPaint(paint57);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent59 = null;
        multiplePiePlot56.notifyListeners(plotChangeEvent59);
        multiplePiePlot56.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart63 = multiplePiePlot56.getPieChart();
        multiplePiePlot52.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart63);
        multiplePiePlot36.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart63);
        multiplePiePlot26.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart63);
        multiplePiePlot15.setPieChart(jFreeChart63);
        multiplePiePlot1.setPieChart(jFreeChart63);
        multiplePiePlot1.setLimit((double) 15);
        float float71 = multiplePiePlot1.getBackgroundImageAlpha();
        double double72 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder31);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNull(categoryDataset47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(jFreeChart63);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.5f + "'", float71 == 0.5f);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 15.0d + "'", double72 == 15.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        java.awt.Paint paint16 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNull(categoryDataset20);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D11, rectangle2D12);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.lang.String str7 = plot6.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup8 = plot6.getDatasetGroup();
        plot6.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = plot6.getDrawingSupplier();
        // The following exception was thrown during execution in test generation
        try {
            plot6.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint23 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot13.getRootPlot();
        boolean boolean25 = plot24.isOutlineVisible();
        org.jfree.chart.plot.Plot plot26 = plot24.getRootPlot();
        boolean boolean27 = plot24.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = plot24.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets28, true);
        java.lang.Class<?> wildcardClass31 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Stroke stroke15 = multiplePiePlot1.getOutlineStroke();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Paint paint7 = multiplePiePlot6.getOutlinePaint();
        java.awt.Stroke stroke8 = null;
        multiplePiePlot6.setOutlineStroke(stroke8);
        double double10 = multiplePiePlot6.getLimit();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot6.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder11);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint16 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot8.setForegroundAlpha((float) '4');
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot8.setDataset(categoryDataset17);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        multiplePiePlot8.datasetChanged(datasetChangeEvent19);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float11 = multiplePiePlot8.getBackgroundAlpha();
        boolean boolean13 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint14 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot8.setForegroundAlpha((float) '4');
        multiplePiePlot8.setNoDataMessage("Other");
        boolean boolean19 = multiplePiePlot8.isOutlineVisible();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        multiplePiePlot1.setBackgroundImageAlignment((int) '4');
        java.awt.Stroke stroke21 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        float float9 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        float float23 = multiplePiePlot1.getForegroundAlpha();
        float float24 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
    }
}

