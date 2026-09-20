package org.jfree.chart.plot;

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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint1 = multiplePiePlot0.getAggregatedItemsPaint();
        java.awt.Image image2 = null;
        multiplePiePlot0.setBackgroundImage(image2);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(paint1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = null;
        multiplePiePlot7.setBackgroundPaint(paint8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent10);
        multiplePiePlot7.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Paint paint18 = null;
        multiplePiePlot17.setBackgroundPaint(paint18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        multiplePiePlot17.drawBackground(graphics2D22, rectangle2D23);
        org.jfree.chart.util.TableOrder tableOrder25 = multiplePiePlot17.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder25);
        java.awt.Paint paint27 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNotNull(tableOrder25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent21);
        java.awt.Font font23 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        double double18 = multiplePiePlot1.getLimit();
        float float19 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot1.getLegendItems();
        java.lang.Object obj21 = null;
        boolean boolean22 = multiplePiePlot1.equals(obj21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot1.drawBackground(graphics2D23, rectangle2D24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot1.setDataset(categoryDataset26);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) 10, (int) ' ', plotRenderingInfo11);
        multiplePiePlot1.zoom(10.0d);
        double double15 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot16.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot16.getDataset();
        java.awt.Font font19 = multiplePiePlot16.getNoDataMessageFont();
        double double20 = multiplePiePlot16.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        float float23 = multiplePiePlot22.getBackgroundImageAlpha();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.awt.Paint paint27 = null;
        multiplePiePlot26.setBackgroundPaint(paint27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot26.notifyListeners(plotChangeEvent29);
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot26.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        float float34 = multiplePiePlot33.getBackgroundImageAlpha();
        multiplePiePlot26.setParent((org.jfree.chart.plot.Plot) multiplePiePlot33);
        float float36 = multiplePiePlot33.getBackgroundAlpha();
        boolean boolean38 = multiplePiePlot33.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint39 = multiplePiePlot33.getOutlinePaint();
        multiplePiePlot22.setBackgroundPaint(paint39);
        java.awt.Paint paint41 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot22.setAggregatedItemsPaint(paint41);
        multiplePiePlot16.setAggregatedItemsPaint(paint41);
        java.awt.Paint paint44 = multiplePiePlot16.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint44);
        org.jfree.chart.JFreeChart jFreeChart46 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(jFreeChart46);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(tableOrder17);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent4 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent6);
        org.junit.Assert.assertNull(categoryDataset1);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        double double14 = multiplePiePlot1.getLimit();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot1.handleClick((int) (short) 10, (int) (byte) -1, plotRenderingInfo19);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot1.getDataset();
        float float18 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Image image19 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint20 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent23);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset1);
        java.awt.Paint paint3 = multiplePiePlot2.getOutlinePaint();
        java.awt.Stroke stroke4 = null;
        multiplePiePlot2.setOutlineStroke(stroke4);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Paint paint9 = null;
        multiplePiePlot8.setBackgroundPaint(paint9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = null;
        multiplePiePlot12.setBackgroundPaint(paint13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent15);
        multiplePiePlot12.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot12.getPieChart();
        multiplePiePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot0.setPieChart(jFreeChart19);
        float float22 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        int int17 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot1.handleClick((int) '#', 100, plotRenderingInfo20);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.awt.Image image18 = null;
        multiplePiePlot1.setBackgroundImage(image18);
        java.awt.Stroke stroke20 = multiplePiePlot1.getOutlineStroke();
        java.lang.Class<?> wildcardClass21 = stroke20.getClass();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        float float22 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot1.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        boolean boolean25 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj26 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        plot6.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.awt.Image image25 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.zoom((double) 10.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(image25);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        multiplePiePlot1.setForegroundAlpha((float) (short) 10);
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot15.getOutlinePaint();
        java.awt.Stroke stroke17 = null;
        multiplePiePlot15.setOutlineStroke(stroke17);
        double double19 = multiplePiePlot15.getLimit();
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot15.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot15.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot15.getPieChart();
        plot6.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot15.getPieChart();
        multiplePiePlot15.setLimit(0.0d);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder20);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(jFreeChart24);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str17 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent21);
        java.lang.String str23 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D23, rectangle2D24);
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Multiple Pie Plot" + "'", str20, "Multiple Pie Plot");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent19);
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        double double18 = multiplePiePlot1.getLimit();
        java.awt.Font font19 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent23);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setForegroundAlpha((float) 0);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot10.getDataset();
        java.lang.String str22 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        boolean boolean25 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint26 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(paint26);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        java.awt.Paint paint18 = multiplePiePlot0.getAggregatedItemsPaint();
        multiplePiePlot0.setLimit((-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Image image23 = null;
        multiplePiePlot22.setBackgroundImage(image23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot22.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Font font28 = multiplePiePlot22.getNoDataMessageFont();
        org.jfree.chart.util.TableOrder tableOrder29 = multiplePiePlot22.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder29);
        boolean boolean31 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(tableOrder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        java.awt.Paint paint16 = multiplePiePlot9.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Paint paint20 = null;
        multiplePiePlot19.setBackgroundPaint(paint20);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent22);
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot19.getRootPlot();
        java.lang.String str25 = plot24.getNoDataMessage();
        java.awt.Paint paint26 = plot24.getNoDataMessagePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        plot24.axisChanged(axisChangeEvent27);
        java.awt.Stroke stroke29 = plot24.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        plot24.markerChanged(markerChangeEvent30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.awt.Paint paint34 = multiplePiePlot33.getOutlinePaint();
        java.awt.Stroke stroke35 = null;
        multiplePiePlot33.setOutlineStroke(stroke35);
        double double37 = multiplePiePlot33.getLimit();
        org.jfree.chart.util.TableOrder tableOrder38 = multiplePiePlot33.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection39 = multiplePiePlot33.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot33.getPieChart();
        plot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot33);
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot33.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart42);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder38);
        org.junit.Assert.assertNotNull(legendItemCollection39);
        org.junit.Assert.assertNotNull(jFreeChart40);
        org.junit.Assert.assertNotNull(jFreeChart42);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot1.handleClick((int) (short) 10, (int) (byte) 0, plotRenderingInfo25);
        java.lang.String str27 = multiplePiePlot1.getNoDataMessage();
        java.awt.Font font28 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        float float9 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom((double) (byte) 1);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D12, rectangle2D13, point2D14, plotState15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.awt.Paint paint16 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        java.awt.Image image23 = null;
        multiplePiePlot1.setBackgroundImage(image23);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Paint paint17 = null;
        multiplePiePlot16.setBackgroundPaint(paint17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot16.drawBackground(graphics2D21, rectangle2D22);
        java.lang.Comparable comparable24 = multiplePiePlot16.getAggregatedItemsKey();
        org.jfree.chart.util.TableOrder tableOrder25 = multiplePiePlot16.getDataExtractOrder();
        boolean boolean26 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot16);
        java.lang.Comparable comparable27 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.awt.Paint paint30 = null;
        multiplePiePlot29.setBackgroundPaint(paint30);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot29.notifyListeners(plotChangeEvent32);
        org.jfree.chart.plot.Plot plot34 = multiplePiePlot29.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        float float37 = multiplePiePlot36.getBackgroundImageAlpha();
        multiplePiePlot29.setParent((org.jfree.chart.plot.Plot) multiplePiePlot36);
        java.awt.Paint paint39 = multiplePiePlot29.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset40 = multiplePiePlot29.getDataset();
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint43 = null;
        multiplePiePlot29.setOutlinePaint(paint43);
        org.jfree.chart.JFreeChart jFreeChart45 = multiplePiePlot29.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset46 = multiplePiePlot29.getDataset();
        float float47 = multiplePiePlot29.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = multiplePiePlot29.getInsets();
        java.awt.Paint paint49 = multiplePiePlot29.getAggregatedItemsPaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot29);
        org.jfree.chart.LegendItemCollection legendItemCollection51 = multiplePiePlot29.getLegendItems();
        multiplePiePlot29.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "Other" + "'", comparable24, "Other");
        org.junit.Assert.assertNotNull(tableOrder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + "Other" + "'", comparable27, "Other");
        org.junit.Assert.assertNotNull(plot34);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNull(categoryDataset40);
        org.junit.Assert.assertNotNull(jFreeChart45);
        org.junit.Assert.assertNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(legendItemCollection51);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        float float17 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        float float30 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint31 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font32 = multiplePiePlot1.getNoDataMessageFont();
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
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.Plot plot7 = null;
        multiplePiePlot1.setParent(plot7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Paint paint11 = null;
        multiplePiePlot10.setBackgroundPaint(paint11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        java.awt.Font font16 = multiplePiePlot10.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot10.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent18);
        int int20 = multiplePiePlot10.getBackgroundImageAlignment();
        java.awt.Stroke stroke21 = multiplePiePlot10.getOutlineStroke();
        int int22 = multiplePiePlot10.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot10.drawBackgroundImage(graphics2D23, rectangle2D24);
        boolean boolean26 = multiplePiePlot10.isOutlineVisible();
        java.awt.Image image27 = null;
        multiplePiePlot10.setBackgroundImage(image27);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent30 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent30);
        java.awt.Paint paint32 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        double double6 = multiplePiePlot1.getLimit();
        java.awt.Stroke stroke7 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Font font10 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.Object obj15 = null;
        boolean boolean16 = multiplePiePlot8.equals(obj15);
        java.awt.Paint paint17 = multiplePiePlot8.getBackgroundPaint();
        int int18 = multiplePiePlot8.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.awt.Paint paint26 = multiplePiePlot16.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot16.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot16.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Image image30 = null;
        multiplePiePlot16.setBackgroundImage(image30);
        float float32 = multiplePiePlot16.getBackgroundAlpha();
        multiplePiePlot16.setBackgroundImageAlpha((float) (byte) 1);
        boolean boolean35 = multiplePiePlot16.isOutlineVisible();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        java.awt.Paint paint39 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent40 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent40);
        java.awt.Paint paint42 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNull(categoryDataset28);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.awt.Paint paint28 = null;
        multiplePiePlot27.setBackgroundPaint(paint28);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent30);
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot27.getRootPlot();
        java.lang.String str33 = plot32.getNoDataMessage();
        float float34 = plot32.getForegroundAlpha();
        java.awt.Paint paint35 = plot32.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint35);
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot1.getPieChart();
        boolean boolean38 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(jFreeChart37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        boolean boolean12 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent16);
        java.lang.Comparable comparable18 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.awt.Image image14 = null;
        multiplePiePlot1.setBackgroundImage(image14);
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0.0d + "'", comparable13, 0.0d);
        org.junit.Assert.assertNotNull(tableOrder16);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        float float37 = multiplePiePlot36.getBackgroundImageAlpha();
        java.awt.Paint paint38 = multiplePiePlot36.getBackgroundPaint();
        int int39 = multiplePiePlot36.getBackgroundImageAlignment();
        multiplePiePlot36.setBackgroundImageAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        java.awt.Paint paint44 = null;
        multiplePiePlot43.setBackgroundPaint(paint44);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        multiplePiePlot43.notifyListeners(plotChangeEvent46);
        multiplePiePlot43.setForegroundAlpha(0.0f);
        float float50 = multiplePiePlot43.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot51 = multiplePiePlot43.getParent();
        java.lang.Object obj52 = null;
        boolean boolean53 = multiplePiePlot43.equals(obj52);
        java.awt.Paint paint54 = multiplePiePlot43.getAggregatedItemsPaint();
        multiplePiePlot36.setBackgroundPaint(paint54);
        multiplePiePlot1.setOutlinePaint(paint54);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.5f + "'", float50 == 0.5f);
        org.junit.Assert.assertNull(plot51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent25 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent25);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo18);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent15);
        java.awt.Stroke stroke17 = multiplePiePlot1.getOutlineStroke();
        java.lang.Comparable comparable18 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint19 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackground(graphics2D20, rectangle2D21);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        boolean boolean20 = plot14.isSubplot();
        org.jfree.chart.plot.Plot plot21 = plot14.getParent();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(plot21);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint20 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        java.awt.Stroke stroke23 = multiplePiePlot1.getOutlineStroke();
        java.awt.Image image24 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint25 = multiplePiePlot1.getNoDataMessagePaint();
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
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        double double11 = multiplePiePlot1.getLimit();
        java.awt.Image image12 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(image12);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        float float31 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNotNull(plot32);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.awt.Paint paint15 = multiplePiePlot1.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot10.setBackgroundAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke22 = multiplePiePlot1.getOutlineStroke();
        boolean boolean23 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Image image26 = null;
        multiplePiePlot25.setBackgroundImage(image26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = multiplePiePlot25.getDatasetGroup();
        multiplePiePlot25.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot25.getRootPlot();
        multiplePiePlot25.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.awt.Paint paint36 = null;
        multiplePiePlot35.setBackgroundPaint(paint36);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent38 = null;
        multiplePiePlot35.notifyListeners(plotChangeEvent38);
        org.jfree.chart.plot.Plot plot40 = multiplePiePlot35.getRootPlot();
        java.lang.String str41 = plot40.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup42 = plot40.getDatasetGroup();
        plot40.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = plot40.getDrawingSupplier();
        multiplePiePlot25.setDrawingSupplier(drawingSupplier45);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier45);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertNotNull(plot40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNotNull(drawingSupplier45);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = null;
        multiplePiePlot9.setBackgroundPaint(paint10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        multiplePiePlot9.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart16);
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
        java.lang.Object obj29 = multiplePiePlot26.clone();
        multiplePiePlot26.setOutlineVisible(false);
        java.awt.Paint paint32 = multiplePiePlot26.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint32);
        java.lang.String str34 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Multiple Pie Plot" + "'", str34, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart35);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        multiplePiePlot1.setNoDataMessage("Other");
        java.awt.Paint paint18 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D23, rectangle2D24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot8.setDataset(categoryDataset26);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Multiple Pie Plot" + "'", str20, "Multiple Pie Plot");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        multiplePiePlot1.zoom((double) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot1.setDataset(categoryDataset23);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent15);
        java.awt.Stroke stroke17 = multiplePiePlot1.getOutlineStroke();
        double double18 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Paint paint21 = null;
        multiplePiePlot20.setBackgroundPaint(paint21);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent23);
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot20.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        float float28 = multiplePiePlot27.getBackgroundImageAlpha();
        multiplePiePlot20.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        java.awt.Paint paint30 = multiplePiePlot20.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent31);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent33);
        org.jfree.chart.LegendItemCollection legendItemCollection35 = multiplePiePlot20.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent36);
        org.jfree.chart.util.TableOrder tableOrder38 = multiplePiePlot20.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot20.getInsets();
        multiplePiePlot20.setBackgroundImageAlpha((float) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.awt.Paint paint45 = null;
        multiplePiePlot44.setBackgroundPaint(paint45);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = null;
        multiplePiePlot44.notifyListeners(plotChangeEvent47);
        org.jfree.chart.plot.Plot plot49 = multiplePiePlot44.getRootPlot();
        java.awt.Font font50 = multiplePiePlot44.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = multiplePiePlot44.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        multiplePiePlot44.notifyListeners(plotChangeEvent52);
        multiplePiePlot44.setBackgroundImageAlignment((int) (byte) -1);
        int int56 = multiplePiePlot44.getBackgroundImageAlignment();
        multiplePiePlot44.setOutlineVisible(false);
        java.awt.Paint paint59 = multiplePiePlot44.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint59);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertNotNull(tableOrder38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(plot49);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(drawingSupplier51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.awt.Paint paint27 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint28 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(legendItemCollection29);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        java.awt.Paint paint4 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        float float20 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset21);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setBackgroundAlpha((float) 15);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Image image14 = null;
        multiplePiePlot13.setBackgroundImage(image14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot13.getDatasetGroup();
        double double17 = multiplePiePlot13.getLimit();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        multiplePiePlot13.datasetChanged(datasetChangeEvent18);
        java.awt.Paint paint20 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot13.setBackgroundImageAlignment((int) ' ');
        java.awt.Paint paint23 = multiplePiePlot13.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint23);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        java.awt.Stroke stroke23 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        double double26 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D16, rectangle2D17);
        float float19 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        boolean boolean15 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(datasetGroup16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Paint paint14 = null;
        multiplePiePlot13.setBackgroundPaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        java.awt.Font font19 = multiplePiePlot13.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot13.getDrawingSupplier();
        multiplePiePlot13.setBackgroundImageAlignment((int) (byte) 10);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot13.drawBackgroundImage(graphics2D23, rectangle2D24);
        boolean boolean26 = multiplePiePlot1.equals((java.lang.Object) rectangle2D24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.awt.Paint paint29 = multiplePiePlot28.getOutlinePaint();
        java.awt.Stroke stroke30 = null;
        multiplePiePlot28.setOutlineStroke(stroke30);
        double double32 = multiplePiePlot28.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot28.notifyListeners(plotChangeEvent33);
        org.jfree.chart.LegendItemCollection legendItemCollection35 = multiplePiePlot28.getLegendItems();
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot28.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot28.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        java.awt.Paint paint41 = null;
        multiplePiePlot40.setBackgroundPaint(paint41);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        multiplePiePlot40.notifyListeners(plotChangeEvent43);
        java.awt.Paint paint45 = null;
        multiplePiePlot40.setOutlinePaint(paint45);
        java.lang.String str47 = multiplePiePlot40.getNoDataMessage();
        java.awt.Image image48 = multiplePiePlot40.getBackgroundImage();
        multiplePiePlot40.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        java.awt.Paint paint51 = multiplePiePlot40.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint51);
        boolean boolean53 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertNotNull(jFreeChart37);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(image48);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.awt.Stroke stroke17 = plot12.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Paint paint20 = null;
        multiplePiePlot19.setBackgroundPaint(paint20);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent22);
        java.awt.Stroke stroke24 = null;
        multiplePiePlot19.setOutlineStroke(stroke24);
        java.awt.Paint paint26 = multiplePiePlot19.getBackgroundPaint();
        int int27 = multiplePiePlot19.getBackgroundImageAlignment();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot19.getDrawingSupplier();
        plot12.setDrawingSupplier(drawingSupplier28);
        java.awt.Paint paint30 = plot12.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = plot12.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(drawingSupplier28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(drawingSupplier31);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D21, rectangle2D22);
        java.awt.Paint paint24 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.util.TableOrder tableOrder25 = multiplePiePlot1.getDataExtractOrder();
        float float26 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(tableOrder25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.awt.Stroke stroke17 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        float float21 = multiplePiePlot20.getBackgroundImageAlpha();
        java.awt.Paint paint22 = multiplePiePlot20.getBackgroundPaint();
        int int23 = multiplePiePlot20.getBackgroundImageAlignment();
        float float24 = multiplePiePlot20.getBackgroundImageAlpha();
        int int25 = multiplePiePlot20.getBackgroundImageAlignment();
        multiplePiePlot20.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint28 = multiplePiePlot20.getNoDataMessagePaint();
        plot18.setNoDataMessagePaint(paint28);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        double double6 = multiplePiePlot1.getLimit();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        plot11.setForegroundAlpha((float) (-1));
        java.awt.Stroke stroke14 = plot11.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0L);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        java.lang.Comparable comparable18 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.lang.String str21 = multiplePiePlot0.getPlotType();
        java.lang.Comparable comparable22 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot0.handleClick((int) (byte) 100, 100, plotRenderingInfo25);
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str17 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent21);
        multiplePiePlot1.setForegroundAlpha((float) 100);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setForegroundAlpha((float) 100L);
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
        java.awt.Paint paint31 = multiplePiePlot16.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint31);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(tableOrder12);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot1.handleClick(0, 0, plotRenderingInfo20);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(jFreeChart22);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        double double18 = multiplePiePlot1.getLimit();
        float float19 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot1.getLegendItems();
        java.lang.Object obj21 = null;
        boolean boolean22 = multiplePiePlot1.equals(obj21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Image image25 = null;
        multiplePiePlot24.setBackgroundImage(image25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot24.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.awt.Paint paint30 = multiplePiePlot29.getOutlinePaint();
        java.awt.Stroke stroke31 = null;
        multiplePiePlot29.setOutlineStroke(stroke31);
        double double33 = multiplePiePlot29.getLimit();
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot29.getDataExtractOrder();
        multiplePiePlot24.setDataExtractOrder(tableOrder34);
        multiplePiePlot24.setNoDataMessage("hi!");
        float float38 = multiplePiePlot24.getForegroundAlpha();
        float float39 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        java.awt.Paint paint42 = null;
        multiplePiePlot41.setBackgroundPaint(paint42);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent44);
        org.jfree.chart.plot.Plot plot46 = multiplePiePlot41.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        float float49 = multiplePiePlot48.getBackgroundImageAlpha();
        multiplePiePlot41.setParent((org.jfree.chart.plot.Plot) multiplePiePlot48);
        java.awt.Paint paint51 = multiplePiePlot41.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        multiplePiePlot41.notifyListeners(plotChangeEvent52);
        org.jfree.chart.plot.Plot plot54 = multiplePiePlot41.getParent();
        multiplePiePlot41.setBackgroundImageAlpha((float) 1);
        multiplePiePlot41.zoom(0.0d);
        boolean boolean59 = multiplePiePlot41.isSubplot();
        java.awt.Paint paint60 = multiplePiePlot41.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot62 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset61);
        java.awt.Image image63 = null;
        multiplePiePlot62.setBackgroundImage(image63);
        java.awt.Graphics2D graphics2D65 = null;
        java.awt.geom.Rectangle2D rectangle2D66 = null;
        multiplePiePlot62.drawBackgroundImage(graphics2D65, rectangle2D66);
        java.lang.String str68 = multiplePiePlot62.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent69 = null;
        multiplePiePlot62.datasetChanged(datasetChangeEvent69);
        multiplePiePlot62.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset73 = multiplePiePlot62.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets74 = multiplePiePlot62.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset75 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot76 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset75);
        java.awt.Paint paint77 = null;
        multiplePiePlot76.setBackgroundPaint(paint77);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent79 = null;
        multiplePiePlot76.notifyListeners(plotChangeEvent79);
        multiplePiePlot76.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart83 = multiplePiePlot76.getPieChart();
        multiplePiePlot62.setPieChart(jFreeChart83);
        multiplePiePlot41.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart83);
        java.awt.Paint paint86 = multiplePiePlot41.getOutlinePaint();
        multiplePiePlot24.setAggregatedItemsPaint(paint86);
        multiplePiePlot1.setOutlinePaint(paint86);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder34);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(plot46);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNull(paint51);
        org.junit.Assert.assertNotNull(plot54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(paint60);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(categoryDataset73);
        org.junit.Assert.assertNotNull(rectangleInsets74);
        org.junit.Assert.assertNotNull(jFreeChart83);
        org.junit.Assert.assertNotNull(paint86);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint5 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(jFreeChart24);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        multiplePiePlot1.setLimit((double) (-1));
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNull(plot18);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        double double23 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNull(categoryDataset25);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint13 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Paint paint16 = null;
        multiplePiePlot15.setBackgroundPaint(paint16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent18);
        java.awt.Stroke stroke20 = null;
        multiplePiePlot15.setOutlineStroke(stroke20);
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
        java.awt.Paint paint33 = multiplePiePlot23.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot23.getDataset();
        multiplePiePlot23.setForegroundAlpha((float) 100);
        java.awt.Paint paint37 = multiplePiePlot23.getAggregatedItemsPaint();
        multiplePiePlot15.setBackgroundPaint(paint37);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot15.getInsets();
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        multiplePiePlot15.drawOutline(graphics2D40, rectangle2D41);
        org.jfree.chart.util.TableOrder tableOrder43 = multiplePiePlot15.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent44);
        float float46 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot15.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart47);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(tableOrder43);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart47);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.awt.Paint paint13 = multiplePiePlot12.getOutlinePaint();
        java.awt.Stroke stroke14 = null;
        multiplePiePlot12.setOutlineStroke(stroke14);
        double double16 = multiplePiePlot12.getLimit();
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot12.getDataExtractOrder();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot12.drawOutline(graphics2D18, rectangle2D19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Paint paint23 = null;
        multiplePiePlot22.setBackgroundPaint(paint23);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot22.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getBackgroundImageAlpha();
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot29);
        java.awt.Paint paint32 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot22.getDataset();
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str36 = multiplePiePlot22.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.awt.Paint paint39 = null;
        multiplePiePlot38.setBackgroundPaint(paint39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        java.awt.Paint paint43 = null;
        multiplePiePlot42.setBackgroundPaint(paint43);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        multiplePiePlot42.notifyListeners(plotChangeEvent45);
        multiplePiePlot42.setForegroundAlpha((float) (short) 10);
        org.jfree.chart.JFreeChart jFreeChart49 = multiplePiePlot42.getPieChart();
        multiplePiePlot38.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        multiplePiePlot22.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        multiplePiePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        multiplePiePlot1.setPieChart(jFreeChart49);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0f);
        int int56 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        multiplePiePlot1.setDataset(categoryDataset57);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder17);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(jFreeChart49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint11 = multiplePiePlot10.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint11);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        multiplePiePlot1.zoom((double) '4');
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        java.awt.Paint paint24 = multiplePiePlot1.getOutlinePaint();
        java.awt.Paint paint25 = multiplePiePlot1.getOutlinePaint();
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
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
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
        java.awt.Paint paint27 = plot26.getBackgroundPaint();
        java.awt.Paint paint28 = plot26.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint28);
        float float30 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        double double23 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot16.drawBackground(graphics2D21, rectangle2D22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot16.setInsets(rectangleInsets24);
        multiplePiePlot1.setInsets(rectangleInsets24);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.awt.Paint paint31 = multiplePiePlot30.getOutlinePaint();
        java.awt.Stroke stroke32 = null;
        multiplePiePlot30.setOutlineStroke(stroke32);
        double double34 = multiplePiePlot30.getLimit();
        multiplePiePlot30.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        float float39 = multiplePiePlot38.getBackgroundImageAlpha();
        java.awt.Paint paint40 = multiplePiePlot38.getBackgroundPaint();
        multiplePiePlot30.setAggregatedItemsPaint(paint40);
        org.jfree.chart.plot.Plot plot42 = multiplePiePlot30.getParent();
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 100.0d);
        boolean boolean45 = multiplePiePlot1.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(plot42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Paint paint23 = null;
        multiplePiePlot22.setBackgroundPaint(paint23);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        float float29 = multiplePiePlot28.getBackgroundImageAlpha();
        java.awt.Paint paint30 = multiplePiePlot28.getBackgroundPaint();
        java.awt.Font font31 = multiplePiePlot28.getNoDataMessageFont();
        multiplePiePlot22.setNoDataMessageFont(font31);
        multiplePiePlot22.setBackgroundAlpha((float) (byte) 1);
        java.awt.Paint paint35 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.chart.util.TableOrder tableOrder36 = multiplePiePlot22.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder36);
        java.awt.Image image38 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNotNull(tableOrder36);
        org.junit.Assert.assertNull(image38);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.awt.Paint paint16 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            float float18 = plot17.getForegroundAlpha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        java.lang.Object obj12 = null;
        boolean boolean13 = multiplePiePlot1.equals(obj12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot15.getOutlinePaint();
        java.awt.Stroke stroke17 = null;
        multiplePiePlot15.setOutlineStroke(stroke17);
        double double19 = multiplePiePlot15.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.awt.Image image22 = null;
        multiplePiePlot21.setBackgroundImage(image22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        multiplePiePlot21.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Font font27 = multiplePiePlot21.getNoDataMessageFont();
        multiplePiePlot21.setLimit((double) '4');
        java.awt.Paint paint30 = multiplePiePlot21.getNoDataMessagePaint();
        multiplePiePlot15.setAggregatedItemsPaint(paint30);
        multiplePiePlot1.setNoDataMessagePaint(paint30);
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(plot33);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        float float5 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (byte) -1, plotRenderingInfo10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        multiplePiePlot1.zoom((double) (short) 100);
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
        double double32 = multiplePiePlot13.getLimit();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        multiplePiePlot13.handleClick((-1), 1, plotRenderingInfo35);
        org.jfree.chart.util.TableOrder tableOrder37 = multiplePiePlot13.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder37);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder37);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke3 = null;
        multiplePiePlot1.setOutlineStroke(stroke3);
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.zoom((double) (short) 10);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
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
        int int24 = multiplePiePlot14.getBackgroundImageAlignment();
        java.awt.Stroke stroke25 = multiplePiePlot14.getOutlineStroke();
        int int26 = multiplePiePlot14.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        multiplePiePlot14.drawBackgroundImage(graphics2D27, rectangle2D28);
        multiplePiePlot14.setBackgroundImageAlpha(0.0f);
        java.lang.String str32 = multiplePiePlot14.getNoDataMessage();
        multiplePiePlot14.setLimit((double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(rectangleInsets35);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.awt.Image image19 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint20 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot1.drawBackground(graphics2D21, rectangle2D22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Paint paint17 = null;
        multiplePiePlot16.setBackgroundPaint(paint17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot16.drawBackground(graphics2D21, rectangle2D22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot16.setInsets(rectangleInsets24);
        multiplePiePlot12.setInsets(rectangleInsets24, true);
        java.awt.Stroke stroke28 = multiplePiePlot12.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke28);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot1.drawBackground(graphics2D10, rectangle2D11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.awt.Paint paint20 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image21 = null;
        multiplePiePlot1.setBackgroundImage(image21);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot10.getDataset();
        java.lang.String str22 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot1.getDataset();
        java.awt.Paint paint26 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNull(paint26);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 15.0d);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        double double24 = multiplePiePlot1.getLimit();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint28 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot1.handleClick((int) '4', (int) (short) 10, plotRenderingInfo21);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.awt.Paint paint18 = multiplePiePlot0.getAggregatedItemsPaint();
        multiplePiePlot0.setLimit((-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot0.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent22);
        multiplePiePlot0.setNoDataMessage("Other");
        multiplePiePlot0.setBackgroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot0.handleClick(1, (-1), plotRenderingInfo30);
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryDataset21);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setNoDataMessage("");
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot1.handleClick((int) (short) 0, (int) (byte) -1, plotRenderingInfo17);
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        multiplePiePlot1.zoom((double) (short) -1);
        multiplePiePlot1.zoom((double) '#');
        java.awt.Font font23 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        multiplePiePlot1.zoom((double) (short) 0);
        java.lang.Object obj23 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        java.lang.Comparable comparable22 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent23);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        float float33 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = multiplePiePlot1.getInsets();
        java.lang.Comparable comparable35 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.String str36 = multiplePiePlot1.getNoDataMessage();
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
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + "Other" + "'", comparable35, "Other");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        java.awt.Paint paint18 = multiplePiePlot0.getAggregatedItemsPaint();
        multiplePiePlot0.setLimit((-1.0d));
        multiplePiePlot0.setOutlineVisible(true);
        multiplePiePlot0.zoom((double) (-1L));
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        java.lang.Object obj12 = multiplePiePlot1.clone();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 100);
        java.awt.Font font15 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) "");
        float float13 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setLimit((double) 0.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str5 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(drawingSupplier4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint20 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot1.handleClick((int) (short) 10, (int) (byte) 0, plotRenderingInfo25);
        multiplePiePlot1.setLimit((double) 10L);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Stroke stroke6 = null;
        multiplePiePlot1.setOutlineStroke(stroke6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        float float2 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = multiplePiePlot1.getDataset();
        multiplePiePlot1.zoom((-1.0d));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Object obj8 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        java.lang.String str11 = multiplePiePlot1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        java.lang.String str14 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Multiple Pie Plot" + "'", str11, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        java.lang.String str22 = plot14.getNoDataMessage();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent11);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        double double18 = multiplePiePlot1.getLimit();
        float float19 = multiplePiePlot1.getBackgroundAlpha();
        float float20 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Paint paint23 = null;
        multiplePiePlot22.setBackgroundPaint(paint23);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot22.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        float float30 = multiplePiePlot29.getBackgroundImageAlpha();
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot29);
        java.awt.Paint paint32 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot22.getDataset();
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        java.lang.String str36 = multiplePiePlot22.getNoDataMessage();
        multiplePiePlot22.zoom((double) 100);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent39);
        java.awt.Stroke stroke41 = multiplePiePlot22.getOutlineStroke();
        boolean boolean42 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot22);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot10.getDataset();
        java.lang.String str22 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        boolean boolean25 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent26);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        multiplePiePlot1.zoom(0.0d);
        float float14 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        multiplePiePlot1.handleClick((-1), (int) (byte) 1, plotRenderingInfo37);
        org.jfree.chart.LegendItemCollection legendItemCollection39 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(legendItemCollection39);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        double double25 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = multiplePiePlot1.getDatasetGroup();
        double double5 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setForegroundAlpha((float) (short) 1);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        java.awt.Font font13 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Paint paint16 = null;
        multiplePiePlot15.setBackgroundPaint(paint16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent18);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot15.getRootPlot();
        java.awt.Font font21 = multiplePiePlot15.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = multiplePiePlot15.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent23);
        int int25 = multiplePiePlot15.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot15.getDatasetGroup();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.awt.Paint paint31 = null;
        multiplePiePlot30.setBackgroundPaint(paint31);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot30.notifyListeners(plotChangeEvent33);
        java.awt.Stroke stroke35 = multiplePiePlot30.getOutlineStroke();
        multiplePiePlot30.setForegroundAlpha((-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        float float40 = multiplePiePlot39.getBackgroundImageAlpha();
        java.awt.Paint paint41 = multiplePiePlot39.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        java.awt.Paint paint44 = null;
        multiplePiePlot43.setBackgroundPaint(paint44);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        multiplePiePlot43.notifyListeners(plotChangeEvent46);
        org.jfree.chart.plot.Plot plot48 = multiplePiePlot43.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        float float51 = multiplePiePlot50.getBackgroundImageAlpha();
        multiplePiePlot43.setParent((org.jfree.chart.plot.Plot) multiplePiePlot50);
        float float53 = multiplePiePlot50.getBackgroundAlpha();
        boolean boolean55 = multiplePiePlot50.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint56 = multiplePiePlot50.getOutlinePaint();
        multiplePiePlot39.setBackgroundPaint(paint56);
        java.awt.Paint paint58 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot39.setAggregatedItemsPaint(paint58);
        multiplePiePlot30.setAggregatedItemsPaint(paint58);
        multiplePiePlot15.setNoDataMessagePaint(paint58);
        multiplePiePlot1.setNoDataMessagePaint(paint58);
        java.awt.Graphics2D graphics2D63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D63, rectangle2D64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.5f + "'", float40 == 0.5f);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(plot48);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.5f + "'", float51 == 0.5f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 15, plotRenderingInfo23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean26 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint27 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(paint27);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image9 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Paint paint15 = null;
        multiplePiePlot14.setBackgroundPaint(paint15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot14.getRootPlot();
        java.lang.String str20 = plot19.getNoDataMessage();
        float float21 = plot19.getForegroundAlpha();
        java.awt.Paint paint22 = plot19.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint22);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset2 = multiplePiePlot0.getDataset();
        java.awt.Font font3 = multiplePiePlot0.getNoDataMessageFont();
        double double4 = multiplePiePlot0.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        float float7 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint8 = multiplePiePlot6.getBackgroundPaint();
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
        multiplePiePlot6.setBackgroundPaint(paint23);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot6.setAggregatedItemsPaint(paint25);
        multiplePiePlot0.setAggregatedItemsPaint(paint25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent28);
        boolean boolean30 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNull(categoryDataset1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        multiplePiePlot1.zoom((double) 1.0f);
        multiplePiePlot1.zoom((double) (short) 1);
        java.awt.Paint paint18 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot1.getLegendItems();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        java.awt.geom.Point2D point2D22 = null;
        org.jfree.chart.plot.PlotState plotState23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D20, rectangle2D21, point2D22, plotState23, plotRenderingInfo24);
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
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection19);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        multiplePiePlot1.setLimit((double) 'a');
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(tableOrder15);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        java.awt.Font font16 = plot12.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        boolean boolean12 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundImageAlignment((int) '#');
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        java.awt.Font font14 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot1.handleClick(10, (int) '4', plotRenderingInfo17);
        java.awt.Paint paint19 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot1.getDatasetGroup();
        java.awt.Font font21 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.awt.Paint paint33 = null;
        multiplePiePlot32.setBackgroundPaint(paint33);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        multiplePiePlot32.notifyListeners(plotChangeEvent35);
        multiplePiePlot32.setForegroundAlpha((float) (short) 10);
        java.awt.Paint paint39 = multiplePiePlot32.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint39);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent41);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.awt.Paint paint18 = multiplePiePlot8.getOutlinePaint();
        boolean boolean19 = multiplePiePlot8.isSubplot();
        java.lang.String str20 = multiplePiePlot8.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        multiplePiePlot1.setOutlineVisible(true);
        boolean boolean20 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = null;
        multiplePiePlot1.setBackgroundPaint(paint2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent4);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setOutlinePaint(paint6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot10.getDataset();
        java.lang.String str22 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNull(categoryDataset25);
    }
}

