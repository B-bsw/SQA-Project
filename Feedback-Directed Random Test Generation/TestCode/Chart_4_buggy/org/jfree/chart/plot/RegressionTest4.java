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
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot4.getDomainMarkers(layer10);
        double double12 = xYPlot4.getDomainCrosshairValue();
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot13.getAxisOffset();
        xYPlot4.setInsets(rectangleInsets14, true);
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        boolean boolean20 = xYPlot4.removeDomainMarker(1, marker18, layer19);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        boolean boolean8 = xYPlot4.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        boolean boolean14 = xYPlot13.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot13.setRangeAxis(valueAxis15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        xYPlot13.addChangeListener(plotChangeListener17);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        xYPlot13.axisChanged(axisChangeEvent19);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = xYPlot13.getLegendItems();
        java.awt.Paint paint22 = xYPlot13.getDomainGridlinePaint();
        xYPlot4.setDomainTickBandPaint(paint22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = xYPlot4.getDatasetGroup();
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        int int26 = xYPlot4.indexOf(xYDataset25);
        boolean boolean27 = xYPlot4.isOutlineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        xYPlot4.setDomainAxis((int) (byte) 10, valueAxis29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        java.awt.Paint paint8 = xYPlot4.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier9, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot4.getDomainAxisEdge();
        xYPlot4.setDomainCrosshairValue((double) '#', false);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = xYPlot4.getDomainMarkers((int) (short) 1, layer17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNull(collection18);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        boolean boolean8 = xYPlot4.isOutlineVisible();
        int int9 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.configureRangeAxes();
        org.jfree.chart.plot.Plot plot11 = xYPlot4.getRootPlot();
        float float12 = xYPlot4.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot4.getRangeAxisEdge((int) (byte) 100);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = xYPlot4.getRangeAxisEdge((-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(rectangleEdge16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot4.getRangeAxisLocation((int) (byte) -1);
        int int9 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation(15);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = xYPlot4.getDomainAxisEdge(1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.util.Layer layer17 = null;
        xYPlot4.drawDomainMarkers(graphics2D14, rectangle2D15, (int) (byte) 1, layer17);
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot4.getRangeAxisLocation((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(axisLocation21);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        java.awt.Paint paint15 = xYPlot14.getRangeMinorGridlinePaint();
        xYPlot4.setRangeZeroBaselinePaint(paint15);
        xYPlot4.setDomainCrosshairVisible(true);
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot4.setDomainGridlineStroke(stroke20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets22, false);
        java.awt.Image image25 = null;
        xYPlot4.setBackgroundImage(image25);
        xYPlot4.setDomainCrosshairVisible(false);
        java.awt.Stroke stroke29 = xYPlot4.getDomainCrosshairStroke();
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        xYPlot4.setDomainCrosshairValue((double) 10L);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot4.setRenderer(xYItemRenderer12);
        java.awt.Paint paint14 = xYPlot4.getDomainCrosshairPaint();
        java.awt.Stroke stroke15 = xYPlot4.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        boolean boolean21 = xYPlot20.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        int int23 = xYPlot20.getRangeAxisIndex(valueAxis22);
        xYPlot20.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        boolean boolean29 = xYPlot20.removeDomainMarker((int) (short) -1, marker27, layer28);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray31 = new org.jfree.chart.axis.ValueAxis[] { valueAxis30 };
        xYPlot20.setRangeAxes(valueAxisArray31);
        xYPlot4.setRangeAxes(valueAxisArray31);
        xYPlot4.mapDatasetToRangeAxis(100, (int) ' ');
        org.jfree.chart.util.Layer layer38 = null;
        java.util.Collection collection39 = xYPlot4.getDomainMarkers((int) (short) 100, layer38);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        xYPlot4.addChangeListener(plotChangeListener40);
        org.jfree.chart.axis.ValueAxis valueAxis43 = xYPlot4.getDomainAxisForDataset(0);
        java.awt.Paint paint44 = xYPlot4.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(valueAxisArray31);
        org.junit.Assert.assertArrayEquals(valueAxisArray31, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNull(collection39);
        org.junit.Assert.assertNull(valueAxis43);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        boolean boolean13 = xYPlot4.removeDomainMarker((int) (short) -1, marker11, layer12);
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        boolean boolean19 = xYPlot18.isDomainGridlinesVisible();
        java.awt.Stroke stroke20 = xYPlot18.getRangeMinorGridlineStroke();
        java.awt.Stroke stroke21 = xYPlot18.getDomainMinorGridlineStroke();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        org.jfree.chart.axis.AxisSpace axisSpace25 = xYPlot18.calculateRangeAxisSpace(graphics2D22, rectangle2D23, axisSpace24);
        xYPlot4.setFixedRangeAxisSpace(axisSpace25);
        xYPlot4.setRangeMinorGridlinesVisible(false);
        xYPlot4.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(axisSpace25);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        xYPlot4.zoom((double) (-1));
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot4.getRendererForDataset(xYDataset12);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        xYPlot4.setRenderer(xYItemRenderer14);
        org.jfree.chart.plot.Marker marker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xYPlot4.removeRangeMarker(marker16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(xYItemRenderer13);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        java.awt.Paint paint8 = xYPlot4.getBackgroundPaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        xYPlot4.drawAnnotations(graphics2D9, rectangle2D10, plotRenderingInfo11);
        boolean boolean13 = xYPlot4.isNotify();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        xYPlot4.removeChangeListener(plotChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot4.getDomainMarkers(layer10);
        int int12 = xYPlot4.getWeight();
        int int13 = xYPlot4.getRendererCount();
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = xYPlot4.getDomainMarkers(layer14);
        xYPlot4.setDomainCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.plot.Marker marker23 = null;
        boolean boolean24 = xYPlot22.removeDomainMarker(marker23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot22.getRangeAxisLocation((int) (byte) -1);
        int int27 = xYPlot22.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot22.getDomainAxisLocation(15);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        org.jfree.chart.plot.CrosshairState crosshairState34 = null;
        boolean boolean35 = xYPlot22.render(graphics2D30, rectangle2D31, (int) (byte) 10, plotRenderingInfo33, crosshairState34);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent36 = null;
        xYPlot22.datasetChanged(datasetChangeEvent36);
        float float38 = xYPlot22.getBackgroundImageAlpha();
        org.jfree.data.xy.XYDataset xYDataset39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot(xYDataset39, valueAxis40, valueAxis41, xYItemRenderer42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        java.awt.geom.Point2D point2D46 = null;
        xYPlot43.zoomRangeAxes(0.0d, plotRenderingInfo45, point2D46, false);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        xYPlot43.setFixedDomainAxisSpace(axisSpace49);
        java.awt.Stroke stroke51 = xYPlot43.getDomainZeroBaselineStroke();
        xYPlot22.setDomainMinorGridlineStroke(stroke51);
        xYPlot4.setDomainGridlineStroke(stroke51);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.5f + "'", float38 == 0.5f);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        int int13 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = xYPlot14.getAxisOffset();
        xYPlot4.setInsets(rectangleInsets15, true);
        xYPlot4.clearRangeMarkers((int) (short) 10);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = xYPlot4.getDomainMarkers(100, layer21);
        java.awt.Paint paint23 = xYPlot4.getRangeMinorGridlinePaint();
        xYPlot4.setDomainZeroBaselineVisible(true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        boolean boolean10 = xYPlot4.isOutlineVisible();
        java.awt.Stroke stroke11 = xYPlot4.getDomainGridlineStroke();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot4.getFixedRangeAxisSpace();
        xYPlot4.clearDomainMarkers();
        xYPlot4.setDomainCrosshairValue((double) 10L);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        boolean boolean22 = xYPlot21.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        xYPlot21.setRangeAxis(valueAxis23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = xYPlot21.getDatasetGroup();
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        xYPlot21.setFixedDomainAxisSpace(axisSpace26);
        boolean boolean28 = xYPlot21.canSelectByPoint();
        java.awt.Paint paint29 = xYPlot21.getBackgroundPaint();
        boolean boolean30 = xYPlot21.isRangeCrosshairVisible();
        java.awt.Stroke stroke31 = xYPlot21.getDomainCrosshairStroke();
        xYPlot4.setRangeMinorGridlineStroke(stroke31);
        xYPlot4.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        boolean boolean13 = xYPlot4.removeDomainMarker((int) (short) -1, marker11, layer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14, true);
        xYPlot4.setBackgroundImageAlpha((float) 0L);
        org.jfree.data.xy.XYDataset xYDataset19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot(xYDataset19, valueAxis20, valueAxis21, xYItemRenderer22);
        org.jfree.chart.plot.Marker marker24 = null;
        boolean boolean25 = xYPlot23.removeDomainMarker(marker24);
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot23.getRangeAxisLocation((int) (byte) -1);
        int int28 = xYPlot23.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation30 = xYPlot23.getDomainAxisLocation(15);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        org.jfree.chart.plot.CrosshairState crosshairState35 = null;
        boolean boolean36 = xYPlot23.render(graphics2D31, rectangle2D32, (int) (byte) 10, plotRenderingInfo34, crosshairState35);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent37 = null;
        xYPlot23.datasetChanged(datasetChangeEvent37);
        float float39 = xYPlot23.getBackgroundImageAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation41 = xYPlot23.getRangeAxisLocation(15);
        org.jfree.data.xy.XYDataset xYDataset42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot(xYDataset42, valueAxis43, valueAxis44, xYItemRenderer45);
        boolean boolean47 = xYPlot46.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        xYPlot46.setRangeAxis(valueAxis48);
        org.jfree.chart.event.PlotChangeListener plotChangeListener50 = null;
        xYPlot46.addChangeListener(plotChangeListener50);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent52 = null;
        xYPlot46.axisChanged(axisChangeEvent52);
        xYPlot46.setBackgroundImageAlpha(1.0f);
        org.jfree.data.xy.XYDataset xYDataset57 = null;
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer60 = null;
        org.jfree.chart.plot.XYPlot xYPlot61 = new org.jfree.chart.plot.XYPlot(xYDataset57, valueAxis58, valueAxis59, xYItemRenderer60);
        boolean boolean62 = xYPlot61.isRangeCrosshairLockedOnData();
        java.awt.Stroke stroke63 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot61.setOutlineStroke(stroke63);
        org.jfree.chart.axis.AxisLocation axisLocation66 = xYPlot61.getDomainAxisLocation(10);
        xYPlot46.setRangeAxisLocation((int) (short) 0, axisLocation66);
        double double68 = xYPlot46.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D69 = null;
        java.awt.geom.Rectangle2D rectangle2D70 = null;
        xYPlot46.drawQuadrants(graphics2D69, rectangle2D70);
        org.jfree.chart.axis.AxisLocation axisLocation72 = xYPlot46.getRangeAxisLocation();
        xYPlot23.setRangeAxisLocation(axisLocation72);
        xYPlot4.setDomainAxisLocation(axisLocation72, true);
        boolean boolean76 = xYPlot4.canSelectByPoint();
        java.awt.Graphics2D graphics2D77 = null;
        java.awt.geom.Rectangle2D rectangle2D78 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo80 = null;
        org.jfree.chart.plot.CrosshairState crosshairState81 = null;
        boolean boolean82 = xYPlot4.render(graphics2D77, rectangle2D78, (int) (byte) 1, plotRenderingInfo80, crosshairState81);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertNotNull(axisLocation66);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeCrosshairLockedOnData();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot4.setOutlineStroke(stroke6);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        boolean boolean13 = xYPlot12.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        int int15 = xYPlot12.getRangeAxisIndex(valueAxis14);
        xYPlot12.setDomainMinorGridlinesVisible(false);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.plot.Marker marker23 = null;
        boolean boolean24 = xYPlot22.removeDomainMarker(marker23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot22.getRangeAxisLocation((int) (byte) -1);
        int int27 = xYPlot22.getBackgroundImageAlignment();
        xYPlot22.setRangeMinorGridlinesVisible(true);
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = null;
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot(xYDataset30, valueAxis31, valueAxis32, xYItemRenderer33);
        boolean boolean35 = xYPlot34.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        int int37 = xYPlot34.getRangeAxisIndex(valueAxis36);
        java.awt.Stroke stroke38 = xYPlot34.getDomainGridlineStroke();
        xYPlot22.setDomainZeroBaselineStroke(stroke38);
        xYPlot12.setDomainZeroBaselineStroke(stroke38);
        xYPlot4.setRangeGridlineStroke(stroke38);
        java.util.List list42 = xYPlot4.getAnnotations();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Paint paint5 = xYPlot4.getRangeMinorGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot4.setRangeAxis((int) ' ', valueAxis7, false);
        xYPlot4.setRangeCrosshairVisible(false);
        java.awt.geom.Point2D point2D12 = xYPlot4.getQuadrantOrigin();
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot4.getFixedRangeAxisSpace();
        int int14 = xYPlot4.getWeight();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(point2D12);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot4.getRangeAxisLocation((int) (byte) -1);
        int int9 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation(15);
        java.awt.Stroke stroke12 = xYPlot4.getOutlineStroke();
        java.awt.Stroke stroke13 = xYPlot4.getDomainCrosshairStroke();
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.RenderingSource renderingSource17 = null;
        xYPlot4.select(100.0d, (double) 0, rectangle2D16, renderingSource17);
        org.jfree.data.xy.XYDataset xYDataset19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot(xYDataset19, valueAxis20, valueAxis21, xYItemRenderer22);
        boolean boolean24 = xYPlot23.isDomainGridlinesVisible();
        double double25 = xYPlot23.getDomainCrosshairValue();
        boolean boolean26 = xYPlot23.isDomainGridlinesVisible();
        java.awt.Paint paint27 = xYPlot23.getDomainZeroBaselinePaint();
        xYPlot4.setRangeGridlinePaint(paint27);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        xYPlot4.removeChangeListener(plotChangeListener29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        java.awt.Paint paint8 = xYPlot4.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier9, true);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.util.Layer layer15 = null;
        xYPlot4.drawDomainMarkers(graphics2D12, rectangle2D13, 100, layer15);
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot4.getRangeAxis(100);
        xYPlot4.setNoDataMessage("");
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        xYPlot4.setDataset((int) 'a', xYDataset22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(valueAxis18);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        java.awt.Paint paint10 = xYPlot4.getDomainTickBandPaint();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset(xYDataset12);
        double double14 = xYPlot4.getDomainCrosshairValue();
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(0, marker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot4.getRangeAxisLocation((int) (byte) -1);
        int int9 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray12 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot4.setRenderers(xYItemRendererArray12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = xYPlot4.getDomainAxisEdge((int) (byte) 0);
        java.awt.Paint paint16 = xYPlot4.getRangeGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot22.zoomRangeAxes(0.0d, plotRenderingInfo24, point2D25, false);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = xYPlot22.getDomainMarkers(layer28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        xYPlot22.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot22.getDomainAxisLocation((int) ' ');
        xYPlot4.setDomainAxisLocation(10, axisLocation33);
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        boolean boolean40 = xYPlot39.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        int int42 = xYPlot39.getRangeAxisIndex(valueAxis41);
        xYPlot39.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker46 = null;
        org.jfree.chart.util.Layer layer47 = null;
        boolean boolean48 = xYPlot39.removeDomainMarker((int) (short) -1, marker46, layer47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        xYPlot39.setFixedDomainAxisSpace(axisSpace49, true);
        xYPlot39.setBackgroundImageAlpha((float) 0L);
        java.awt.Stroke stroke54 = xYPlot39.getOutlineStroke();
        int int55 = xYPlot39.getSeriesCount();
        org.jfree.chart.axis.ValueAxis valueAxis57 = xYPlot39.getRangeAxisForDataset(0);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder58 = xYPlot39.getDatasetRenderingOrder();
        xYPlot4.setDatasetRenderingOrder(datasetRenderingOrder58);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray12);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray12, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(valueAxis57);
        org.junit.Assert.assertNotNull(datasetRenderingOrder58);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        double double6 = xYPlot4.getDomainCrosshairValue();
        xYPlot4.setDomainPannable(true);
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        int int11 = xYPlot4.getRangeAxisIndex(valueAxis10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        java.awt.Paint paint8 = xYPlot4.getDomainCrosshairPaint();
        xYPlot4.setDomainCrosshairValue((double) 10.0f, true);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        boolean boolean18 = xYPlot17.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot17.setRangeAxis(valueAxis19);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        xYPlot17.addChangeListener(plotChangeListener21);
        java.awt.Paint paint23 = xYPlot17.getDomainTickBandPaint();
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        org.jfree.chart.plot.Marker marker30 = null;
        boolean boolean31 = xYPlot29.removeDomainMarker(marker30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot29.getRangeAxisLocation((int) (byte) -1);
        xYPlot17.setRangeAxisLocation(0, axisLocation33, false);
        xYPlot4.setRangeAxisLocation((int) 'a', axisLocation33);
        xYPlot4.mapDatasetToDomainAxis((int) (short) 1, (int) (short) -1);
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        xYPlot4.setDomainAxis(valueAxis40);
        xYPlot4.configureDomainAxes();
        java.awt.Stroke stroke43 = xYPlot4.getRangeZeroBaselineStroke();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        xYPlot4.zoom((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot4.getRangeAxis((-1));
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        boolean boolean19 = xYPlot18.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot18.setRangeAxis(valueAxis20);
        java.awt.Paint paint22 = xYPlot18.getDomainCrosshairPaint();
        xYPlot4.setRangeMinorGridlinePaint(paint22);
        java.awt.Paint paint24 = xYPlot4.getBackgroundPaint();
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = xYPlot4.getDomainMarkers((int) (byte) 100, layer26);
        org.jfree.data.xy.XYDataset xYDataset28 = xYPlot4.getDataset();
        java.awt.Paint paint29 = xYPlot4.getDomainCrosshairPaint();
        java.util.List list30 = xYPlot4.getAnnotations();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNull(xYDataset28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot4.getDomainMarkers(layer10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier12);
        java.awt.Paint paint14 = xYPlot4.getRangeMinorGridlinePaint();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        xYPlot4.drawZeroRangeBaseline(graphics2D15, rectangle2D16);
        java.awt.Paint paint18 = xYPlot4.getDomainTickBandPaint();
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot4.getRangeAxisLocation((int) (byte) -1);
        int int9 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation(15);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = xYPlot4.getDomainAxisEdge(1);
        xYPlot4.setRangeZeroBaselineVisible(true);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        boolean boolean21 = xYPlot20.isDomainGridlinesVisible();
        java.awt.Stroke stroke22 = xYPlot20.getDomainCrosshairStroke();
        xYPlot20.clearRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot28.zoomRangeAxes(0.0d, plotRenderingInfo30, point2D31, false);
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = xYPlot28.getDomainMarkers(layer34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        xYPlot28.setDrawingSupplier(drawingSupplier36);
        org.jfree.chart.axis.AxisLocation axisLocation39 = xYPlot28.getDomainAxisLocation((int) ' ');
        xYPlot20.setDomainAxisLocation(axisLocation39, false);
        xYPlot4.setDomainAxisLocation(axisLocation39, true);
        org.jfree.chart.LegendItemCollection legendItemCollection44 = xYPlot4.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertNotNull(axisLocation39);
        org.junit.Assert.assertNotNull(legendItemCollection44);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        boolean boolean14 = xYPlot4.removeDomainMarker((int) (byte) 1, marker11, layer12, true);
        boolean boolean15 = xYPlot4.canSelectByRegion();
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        double double10 = xYPlot4.getDomainCrosshairValue();
        boolean boolean11 = xYPlot4.isDomainCrosshairVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.chart.axis.AxisSpace axisSpace10 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier12, false);
        java.awt.Paint paint15 = xYPlot4.getDomainTickBandPaint();
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        int int13 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = xYPlot14.getAxisOffset();
        xYPlot4.setInsets(rectangleInsets15, true);
        xYPlot4.clearRangeMarkers((int) (short) 10);
        xYPlot4.setRangeCrosshairValue((double) 100L);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        double double6 = xYPlot4.getDomainCrosshairValue();
        xYPlot4.setDomainPannable(true);
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        int int10 = xYPlot4.indexOf(xYDataset9);
        java.awt.Font font11 = xYPlot4.getNoDataMessageFont();
        java.awt.Stroke stroke12 = xYPlot4.getDomainZeroBaselineStroke();
        org.jfree.chart.plot.Marker marker13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        java.awt.Stroke stroke6 = xYPlot4.getDomainCrosshairStroke();
        xYPlot4.clearRangeAxes();
        xYPlot4.setBackgroundAlpha((float) (-1L));
        xYPlot4.setDomainPannable(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        java.awt.Paint paint8 = xYPlot4.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier9, true);
        boolean boolean12 = xYPlot4.isDomainCrosshairLockedOnData();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        int int14 = xYPlot4.getDomainAxisIndex(valueAxis13);
        java.awt.Stroke stroke15 = xYPlot4.getDomainMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot4.setDomainAxis(valueAxis16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        xYPlot4.drawAnnotations(graphics2D18, rectangle2D19, plotRenderingInfo20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        java.awt.Stroke stroke8 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis();
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = xYPlot4.getDomainMarkers((int) (byte) 10, layer11);
        xYPlot4.setWeight((int) (byte) 10);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        org.jfree.chart.plot.CrosshairState crosshairState19 = null;
        boolean boolean20 = xYPlot4.render(graphics2D15, rectangle2D16, (int) (short) -1, plotRenderingInfo18, crosshairState19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        xYPlot4.drawBackgroundImage(graphics2D21, rectangle2D22);
        java.awt.Font font24 = xYPlot4.getNoDataMessageFont();
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        boolean boolean30 = xYPlot29.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        int int32 = xYPlot29.getRangeAxisIndex(valueAxis31);
        xYPlot29.setDomainGridlinesVisible(false);
        boolean boolean35 = xYPlot29.isOutlineVisible();
        java.awt.Stroke stroke36 = xYPlot29.getDomainGridlineStroke();
        xYPlot4.setRangeCrosshairStroke(stroke36);
        boolean boolean38 = xYPlot4.isOutlineVisible();
        boolean boolean39 = xYPlot4.isDomainPannable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        java.awt.Paint paint15 = xYPlot14.getRangeMinorGridlinePaint();
        xYPlot4.setRangeZeroBaselinePaint(paint15);
        xYPlot4.setDomainCrosshairVisible(true);
        java.awt.Stroke stroke19 = xYPlot4.getOutlineStroke();
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = xYPlot4.getDomainMarkers((int) '4', layer21);
        java.awt.Paint paint23 = xYPlot4.getRangeGridlinePaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        xYPlot4.setRenderer(xYItemRenderer24);
        java.lang.String str26 = xYPlot4.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = xYPlot4.getAxisOffset();
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation5 = xYPlot4.getRangeAxisLocation();
        xYPlot4.setForegroundAlpha((-1.0f));
        org.jfree.chart.plot.Plot plot8 = xYPlot4.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getRangeAxis();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        boolean boolean15 = xYPlot14.isDomainGridlinesVisible();
        java.awt.Stroke stroke16 = xYPlot14.getDomainCrosshairStroke();
        xYPlot14.clearRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot22.zoomRangeAxes(0.0d, plotRenderingInfo24, point2D25, false);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = xYPlot22.getDomainMarkers(layer28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        xYPlot22.setDrawingSupplier(drawingSupplier30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot22.getDomainAxisLocation((int) ' ');
        xYPlot14.setDomainAxisLocation(axisLocation33, false);
        xYPlot4.setRangeAxisLocation(axisLocation33);
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        boolean boolean43 = xYPlot42.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        xYPlot42.setRangeAxis(valueAxis44);
        org.jfree.chart.event.PlotChangeListener plotChangeListener46 = null;
        xYPlot42.addChangeListener(plotChangeListener46);
        double double48 = xYPlot42.getDomainCrosshairValue();
        java.awt.Paint paint49 = xYPlot42.getRangeTickBandPaint();
        org.jfree.chart.axis.ValueAxis valueAxis51 = xYPlot42.getDomainAxis((int) ' ');
        xYPlot42.setDomainPannable(false);
        java.util.List list54 = xYPlot42.getAnnotations();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.mapDatasetToDomainAxes(0, list54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNull(paint49);
        org.junit.Assert.assertNull(valueAxis51);
        org.junit.Assert.assertNotNull(list54);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        java.awt.Paint paint15 = xYPlot14.getRangeMinorGridlinePaint();
        xYPlot4.setRangeZeroBaselinePaint(paint15);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        xYPlot4.setRenderer((int) (byte) 0, xYItemRenderer18, true);
        xYPlot4.clearDomainMarkers();
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        double double10 = xYPlot4.getDomainCrosshairValue();
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot4.getDomainAxis((int) ' ');
        xYPlot4.setDomainPannable(false);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot4.drawQuadrants(graphics2D16, rectangle2D17);
        org.jfree.chart.plot.Marker marker19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker(marker19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(valueAxis13);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainMinorGridlinesVisible(false);
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.RenderingSource renderingSource13 = null;
        xYPlot4.select((double) 10, (double) (-1L), rectangle2D12, renderingSource13);
        xYPlot4.setDomainZeroBaselineVisible(true);
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        boolean boolean20 = xYPlot4.removeDomainMarker((int) (short) 1, marker18, layer19);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        xYPlot4.setRangeAxis((int) '4', valueAxis22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        java.awt.Paint paint15 = xYPlot14.getRangeMinorGridlinePaint();
        xYPlot4.setRangeZeroBaselinePaint(paint15);
        xYPlot4.setDomainCrosshairVisible(true);
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot4.setDomainGridlineStroke(stroke20);
        boolean boolean22 = xYPlot4.isDomainMinorGridlinesVisible();
        boolean boolean23 = xYPlot4.isDomainZoomable();
        boolean boolean24 = xYPlot4.isRangeZoomable();
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        boolean boolean27 = xYPlot4.removeDomainMarker(marker25, layer26);
        java.awt.Paint paint28 = xYPlot4.getRangeMinorGridlinePaint();
        java.awt.Stroke stroke29 = xYPlot4.getRangeMinorGridlineStroke();
        java.awt.geom.Point2D point2D30 = xYPlot4.getQuadrantOrigin();
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(point2D30);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        xYPlot4.zoom((double) (-1));
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.plot.Marker marker18 = null;
        boolean boolean19 = xYPlot17.removeDomainMarker(marker18);
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot17.getRangeAxisLocation((int) (byte) -1);
        int int22 = xYPlot17.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot17.getDomainAxisLocation(15);
        xYPlot4.setRangeAxisLocation(0, axisLocation24, false);
        java.awt.Font font27 = xYPlot4.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = xYPlot4.getDatasetGroup();
        org.jfree.chart.axis.AxisSpace axisSpace9 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace9);
        boolean boolean11 = xYPlot4.canSelectByPoint();
        java.awt.Paint paint12 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
        xYPlot4.setOutlinePaint(paint12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = xYPlot4.getDomainAxisEdge((int) '#');
        xYPlot4.clearAnnotations();
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        boolean boolean22 = xYPlot21.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        int int24 = xYPlot21.getRangeAxisIndex(valueAxis23);
        xYPlot21.setDomainMinorGridlinesVisible(false);
        double double27 = xYPlot21.getDomainCrosshairValue();
        boolean boolean28 = xYPlot21.isRangeZeroBaselineVisible();
        java.awt.geom.Point2D point2D29 = xYPlot21.getQuadrantOrigin();
        boolean boolean30 = xYPlot4.equals((java.lang.Object) xYPlot21);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        int int32 = xYPlot21.indexOf(xYDataset31);
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot(xYDataset33, valueAxis34, valueAxis35, xYItemRenderer36);
        boolean boolean38 = xYPlot37.isDomainGridlinesVisible();
        xYPlot37.clearRangeMarkers(0);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder41 = xYPlot37.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot(xYDataset42, valueAxis43, valueAxis44, xYItemRenderer45);
        boolean boolean47 = xYPlot46.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        xYPlot46.setRangeAxis(valueAxis48);
        java.awt.Paint paint50 = xYPlot46.getBackgroundPaint();
        boolean boolean51 = xYPlot46.isOutlineVisible();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder52 = xYPlot46.getSeriesRenderingOrder();
        java.awt.Paint paint53 = xYPlot46.getNoDataMessagePaint();
        xYPlot37.setOutlinePaint(paint53);
        xYPlot21.setDomainCrosshairPaint(paint53);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder52);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        boolean boolean13 = xYPlot4.removeDomainMarker((int) (short) -1, marker11, layer12);
        boolean boolean14 = xYPlot4.isDomainGridlinesVisible();
        xYPlot4.setNotify(false);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.plot.Marker marker23 = null;
        boolean boolean24 = xYPlot22.removeDomainMarker(marker23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot22.getRangeAxisLocation((int) (byte) -1);
        org.jfree.data.xy.XYDataset xYDataset27 = xYPlot22.getDataset();
        boolean boolean28 = xYPlot22.isRangeZoomable();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray30 = new org.jfree.chart.renderer.xy.XYItemRenderer[] { xYItemRenderer29 };
        xYPlot22.setRenderers(xYItemRendererArray30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot22.getDomainAxisLocation((int) (short) 0);
        xYPlot4.setDomainAxisLocation((int) (byte) 0, axisLocation33);
        java.awt.Paint paint35 = xYPlot4.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNull(xYDataset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYItemRendererArray30);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray30, new org.jfree.chart.renderer.xy.XYItemRenderer[] { null });
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        boolean boolean10 = xYPlot4.isOutlineVisible();
        java.awt.Stroke stroke11 = xYPlot4.getDomainGridlineStroke();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot4.getFixedRangeAxisSpace();
        java.awt.Paint paint14 = xYPlot4.getDomainCrosshairPaint();
        boolean boolean15 = xYPlot4.isDomainCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        java.awt.Stroke stroke6 = xYPlot4.getDomainCrosshairStroke();
        xYPlot4.clearRangeAxes();
        xYPlot4.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        xYPlot4.setRangeAxis(valueAxis10);
        java.awt.Paint paint12 = xYPlot4.getRangeMinorGridlinePaint();
        boolean boolean13 = xYPlot4.canSelectByRegion();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot4.drawZeroRangeBaseline(graphics2D14, rectangle2D15);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.rendererChanged(rendererChangeEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot4.getDomainMarkers(layer10);
        int int12 = xYPlot4.getWeight();
        int int13 = xYPlot4.getRendererCount();
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = xYPlot4.getDomainMarkers(layer14);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = xYPlot4.getDomainMarkers((int) (byte) 10, layer17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = xYPlot4.getDatasetGroup();
        org.jfree.chart.plot.Marker marker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        boolean boolean23 = xYPlot4.removeDomainMarker((int) (byte) -1, marker21, layer22);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isRangeCrosshairLockedOnData();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot4.setOutlineStroke(stroke6);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation(10);
        java.awt.Font font10 = xYPlot4.getNoDataMessageFont();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot(xYDataset11, valueAxis12, valueAxis13, xYItemRenderer14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        xYPlot15.zoomRangeAxes(0.0d, plotRenderingInfo17, point2D18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = xYPlot15.getDomainMarkers(layer21);
        int int23 = xYPlot15.getWeight();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        boolean boolean29 = xYPlot28.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        int int31 = xYPlot28.getRangeAxisIndex(valueAxis30);
        xYPlot28.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker35 = null;
        org.jfree.chart.util.Layer layer36 = null;
        boolean boolean37 = xYPlot28.removeDomainMarker((int) (short) -1, marker35, layer36);
        java.awt.Paint paint38 = xYPlot28.getDomainMinorGridlinePaint();
        xYPlot15.setDomainCrosshairPaint(paint38);
        xYPlot4.setDomainTickBandPaint(paint38);
        org.jfree.chart.axis.ValueAxis valueAxis42 = xYPlot4.getDomainAxis(0);
        xYPlot4.configureDomainAxes();
        int int44 = xYPlot4.getSeriesCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(valueAxis42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot4.getRangeAxisLocation((int) (byte) -1);
        int int9 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation(15);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        org.jfree.chart.plot.CrosshairState crosshairState16 = null;
        boolean boolean17 = xYPlot4.render(graphics2D12, rectangle2D13, (int) (byte) 10, plotRenderingInfo15, crosshairState16);
        xYPlot4.setRangePannable(false);
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        boolean boolean25 = xYPlot24.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        int int27 = xYPlot24.getRangeAxisIndex(valueAxis26);
        xYPlot24.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker31 = null;
        org.jfree.chart.util.Layer layer32 = null;
        boolean boolean33 = xYPlot24.removeDomainMarker((int) (short) -1, marker31, layer32);
        org.jfree.chart.axis.AxisSpace axisSpace34 = null;
        xYPlot24.setFixedDomainAxisSpace(axisSpace34, true);
        xYPlot24.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = null;
        xYPlot24.setRenderer(xYItemRenderer39);
        org.jfree.data.xy.XYDataset xYDataset41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = null;
        org.jfree.chart.plot.XYPlot xYPlot45 = new org.jfree.chart.plot.XYPlot(xYDataset41, valueAxis42, valueAxis43, xYItemRenderer44);
        boolean boolean46 = xYPlot45.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        xYPlot45.setRangeAxis(valueAxis47);
        java.awt.Paint paint49 = xYPlot45.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier50 = null;
        xYPlot45.setDrawingSupplier(drawingSupplier50, true);
        java.awt.Graphics2D graphics2D53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        org.jfree.chart.util.Layer layer56 = null;
        xYPlot45.drawDomainMarkers(graphics2D53, rectangle2D54, 100, layer56);
        org.jfree.data.xy.XYDataset xYDataset59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer62 = null;
        org.jfree.chart.plot.XYPlot xYPlot63 = new org.jfree.chart.plot.XYPlot(xYDataset59, valueAxis60, valueAxis61, xYItemRenderer62);
        boolean boolean64 = xYPlot63.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis65 = null;
        xYPlot63.setRangeAxis(valueAxis65);
        org.jfree.chart.event.PlotChangeListener plotChangeListener67 = null;
        xYPlot63.addChangeListener(plotChangeListener67);
        java.awt.Paint paint69 = xYPlot63.getDomainTickBandPaint();
        org.jfree.data.xy.XYDataset xYDataset71 = null;
        org.jfree.chart.axis.ValueAxis valueAxis72 = null;
        org.jfree.chart.axis.ValueAxis valueAxis73 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer74 = null;
        org.jfree.chart.plot.XYPlot xYPlot75 = new org.jfree.chart.plot.XYPlot(xYDataset71, valueAxis72, valueAxis73, xYItemRenderer74);
        org.jfree.chart.plot.Marker marker76 = null;
        boolean boolean77 = xYPlot75.removeDomainMarker(marker76);
        org.jfree.chart.axis.AxisLocation axisLocation79 = xYPlot75.getRangeAxisLocation((int) (byte) -1);
        xYPlot63.setRangeAxisLocation(0, axisLocation79, false);
        xYPlot45.setDomainAxisLocation((int) (byte) 1, axisLocation79);
        org.jfree.chart.util.RectangleInsets rectangleInsets83 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot45.setInsets(rectangleInsets83);
        xYPlot24.setAxisOffset(rectangleInsets83);
        xYPlot4.setAxisOffset(rectangleInsets83);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(paint69);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(axisLocation79);
        org.junit.Assert.assertNotNull(rectangleInsets83);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot16.zoomRangeAxes(0.0d, plotRenderingInfo18, point2D19, false);
        boolean boolean22 = xYPlot16.isDomainZoomable();
        boolean boolean23 = xYPlot16.canSelectByPoint();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        xYPlot16.drawQuadrants(graphics2D24, rectangle2D25);
        java.awt.geom.Point2D point2D27 = xYPlot16.getQuadrantOrigin();
        xYPlot4.zoomRangeAxes((double) 10.0f, plotRenderingInfo11, point2D27);
        int int29 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.setForegroundAlpha((float) 1L);
        xYPlot4.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(point2D27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        xYPlot4.axisChanged(axisChangeEvent10);
        xYPlot4.setBackgroundImageAlpha(1.0f);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        boolean boolean20 = xYPlot19.isRangeCrosshairLockedOnData();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot19.setOutlineStroke(stroke21);
        org.jfree.chart.axis.AxisLocation axisLocation24 = xYPlot19.getDomainAxisLocation(10);
        xYPlot4.setRangeAxisLocation((int) (short) 0, axisLocation24);
        org.jfree.data.xy.XYDataset xYDataset26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot(xYDataset26, valueAxis27, valueAxis28, xYItemRenderer29);
        org.jfree.chart.plot.Marker marker31 = null;
        boolean boolean32 = xYPlot30.removeDomainMarker(marker31);
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot30.getRangeAxisLocation((int) (byte) -1);
        int int35 = xYPlot30.getBackgroundImageAlignment();
        xYPlot30.setRangeMinorGridlinesVisible(true);
        double double38 = xYPlot30.getRangeCrosshairValue();
        xYPlot30.setRangeGridlinesVisible(true);
        xYPlot30.clearDomainMarkers();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot(xYDataset44, valueAxis45, valueAxis46, xYItemRenderer47);
        boolean boolean49 = xYPlot48.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        int int51 = xYPlot48.getRangeAxisIndex(valueAxis50);
        xYPlot48.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker55 = null;
        org.jfree.chart.util.Layer layer56 = null;
        boolean boolean57 = xYPlot48.removeDomainMarker((int) (short) -1, marker55, layer56);
        org.jfree.data.xy.XYDataset xYDataset58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot(xYDataset58, valueAxis59, valueAxis60, xYItemRenderer61);
        boolean boolean63 = xYPlot62.isDomainGridlinesVisible();
        java.awt.Stroke stroke64 = xYPlot62.getRangeMinorGridlineStroke();
        java.awt.Stroke stroke65 = xYPlot62.getDomainMinorGridlineStroke();
        java.awt.Graphics2D graphics2D66 = null;
        java.awt.geom.Rectangle2D rectangle2D67 = null;
        org.jfree.chart.axis.AxisSpace axisSpace68 = null;
        org.jfree.chart.axis.AxisSpace axisSpace69 = xYPlot62.calculateRangeAxisSpace(graphics2D66, rectangle2D67, axisSpace68);
        xYPlot48.setFixedRangeAxisSpace(axisSpace69);
        org.jfree.chart.axis.AxisSpace axisSpace71 = xYPlot30.calculateDomainAxisSpace(graphics2D42, rectangle2D43, axisSpace69);
        xYPlot4.setFixedDomainAxisSpace(axisSpace71, false);
        org.jfree.chart.util.Layer layer74 = null;
        java.util.Collection collection75 = xYPlot4.getDomainMarkers(layer74);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(axisSpace69);
        org.junit.Assert.assertNotNull(axisSpace71);
        org.junit.Assert.assertNull(collection75);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainMinorGridlinesVisible(false);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.plot.Marker marker15 = null;
        boolean boolean16 = xYPlot14.removeDomainMarker(marker15);
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot14.getRangeAxisLocation((int) (byte) -1);
        int int19 = xYPlot14.getBackgroundImageAlignment();
        xYPlot14.setRangeMinorGridlinesVisible(true);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        boolean boolean27 = xYPlot26.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        int int29 = xYPlot26.getRangeAxisIndex(valueAxis28);
        java.awt.Stroke stroke30 = xYPlot26.getDomainGridlineStroke();
        xYPlot14.setDomainZeroBaselineStroke(stroke30);
        xYPlot4.setDomainZeroBaselineStroke(stroke30);
        xYPlot4.setRangePannable(true);
        java.awt.Font font35 = xYPlot4.getNoDataMessageFont();
        org.jfree.data.xy.XYDataset xYDataset36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = null;
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot(xYDataset36, valueAxis37, valueAxis38, xYItemRenderer39);
        boolean boolean41 = xYPlot40.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        int int43 = xYPlot40.getRangeAxisIndex(valueAxis42);
        xYPlot40.setDomainMinorGridlinesVisible(false);
        double double46 = xYPlot40.getDomainCrosshairValue();
        java.awt.Paint paint47 = xYPlot40.getOutlinePaint();
        java.awt.Paint paint48 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot40.setOutlinePaint(paint48);
        xYPlot4.setDomainZeroBaselinePaint(paint48);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        java.util.List list53 = null;
        xYPlot4.drawDomainGridlines(graphics2D51, rectangle2D52, list53);
        int int55 = xYPlot4.getWeight();
        org.jfree.chart.util.RectangleEdge rectangleEdge56 = xYPlot4.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.data.Range range58 = xYPlot4.getDataRange(valueAxis57);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge56);
        org.junit.Assert.assertNull(range58);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        double double6 = xYPlot4.getDomainCrosshairValue();
        java.awt.Paint paint7 = xYPlot4.getOutlinePaint();
        boolean boolean8 = xYPlot4.isDomainGridlinesVisible();
        boolean boolean9 = xYPlot4.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        xYPlot4.clearDomainMarkers((-1));
        xYPlot4.configureDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) '4');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        xYPlot4.notifyListeners(plotChangeEvent12);
        java.awt.Paint paint14 = xYPlot4.getDomainTickBandPaint();
        java.awt.Paint paint15 = xYPlot4.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        xYPlot4.setDomainCrosshairValue((double) 10L);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot4.setRenderer(xYItemRenderer12);
        java.awt.Paint paint14 = xYPlot4.getDomainCrosshairPaint();
        java.awt.Stroke stroke15 = xYPlot4.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        boolean boolean21 = xYPlot20.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        xYPlot20.setRangeAxis(valueAxis22);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        xYPlot20.addChangeListener(plotChangeListener24);
        xYPlot20.zoom((double) 0L);
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot20.getRangeAxis((-1));
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = null;
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot(xYDataset30, valueAxis31, valueAxis32, xYItemRenderer33);
        boolean boolean35 = xYPlot34.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        xYPlot34.setRangeAxis(valueAxis36);
        java.awt.Paint paint38 = xYPlot34.getDomainCrosshairPaint();
        xYPlot20.setRangeMinorGridlinePaint(paint38);
        java.awt.Paint paint40 = xYPlot20.getBackgroundPaint();
        xYPlot4.setRangeGridlinePaint(paint40);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.data.Range range43 = xYPlot4.getDataRange(valueAxis42);
        java.awt.Paint paint44 = xYPlot4.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(range43);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainMinorGridlinesVisible(false);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        xYPlot4.drawZeroRangeBaseline(graphics2D10, rectangle2D11);
        boolean boolean13 = xYPlot4.isRangeCrosshairLockedOnData();
        boolean boolean14 = xYPlot4.isRangeGridlinesVisible();
        xYPlot4.configureRangeAxes();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        xYPlot4.drawBackgroundImage(graphics2D16, rectangle2D17);
        boolean boolean19 = xYPlot4.isDomainZoomable();
        boolean boolean20 = xYPlot4.isRangePannable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Paint paint5 = xYPlot4.getRangeMinorGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot4.setRangeAxis((int) ' ', valueAxis7, false);
        xYPlot4.setRangeCrosshairVisible(false);
        double double12 = xYPlot4.getRangeCrosshairValue();
        org.jfree.data.xy.XYDataset xYDataset13 = xYPlot4.getDataset();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        boolean boolean19 = xYPlot18.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        int int21 = xYPlot18.getRangeAxisIndex(valueAxis20);
        xYPlot18.setDomainMinorGridlinesVisible(false);
        double double24 = xYPlot18.getDomainCrosshairValue();
        java.awt.Paint paint25 = xYPlot18.getOutlinePaint();
        xYPlot4.setRangeMinorGridlinePaint(paint25);
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        boolean boolean29 = xYPlot4.removeDomainMarker(marker27, layer28);
        boolean boolean30 = xYPlot4.isDomainCrosshairVisible();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(xYDataset13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        xYPlot4.clearDomainMarkers((-1));
        xYPlot4.configureDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot4.getDomainAxisEdge();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.util.List list15 = null;
        xYPlot4.drawRangeTickBands(graphics2D13, rectangle2D14, list15);
        java.awt.Stroke stroke17 = xYPlot4.getRangeZeroBaselineStroke();
        xYPlot4.zoom((double) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = xYPlot4.getRangeAxisEdge(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleEdge21);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        boolean boolean10 = xYPlot4.isDomainZoomable();
        boolean boolean11 = xYPlot4.canSelectByPoint();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        xYPlot4.drawQuadrants(graphics2D12, rectangle2D13);
        java.awt.geom.Point2D point2D15 = xYPlot4.getQuadrantOrigin();
        java.awt.Image image16 = xYPlot4.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        boolean boolean22 = xYPlot21.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        xYPlot21.setRangeAxis(valueAxis23);
        java.awt.Paint paint25 = xYPlot21.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        xYPlot21.setDrawingSupplier(drawingSupplier26, true);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.util.Layer layer32 = null;
        xYPlot21.drawDomainMarkers(graphics2D29, rectangle2D30, 100, layer32);
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        boolean boolean40 = xYPlot39.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        xYPlot39.setRangeAxis(valueAxis41);
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        xYPlot39.addChangeListener(plotChangeListener43);
        java.awt.Paint paint45 = xYPlot39.getDomainTickBandPaint();
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        org.jfree.chart.plot.Marker marker52 = null;
        boolean boolean53 = xYPlot51.removeDomainMarker(marker52);
        org.jfree.chart.axis.AxisLocation axisLocation55 = xYPlot51.getRangeAxisLocation((int) (byte) -1);
        xYPlot39.setRangeAxisLocation(0, axisLocation55, false);
        xYPlot21.setDomainAxisLocation((int) (byte) 1, axisLocation55);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot21.setInsets(rectangleInsets59);
        xYPlot4.setAxisOffset(rectangleInsets59);
        double double62 = xYPlot4.getDomainCrosshairValue();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point2D15);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(axisLocation55);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        boolean boolean8 = xYPlot4.isOutlineVisible();
        int int9 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.configureRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot(xYDataset11, valueAxis12, valueAxis13, xYItemRenderer14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        xYPlot15.zoomRangeAxes(0.0d, plotRenderingInfo17, point2D18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = xYPlot15.getDomainMarkers(layer21);
        int int23 = xYPlot15.getWeight();
        int int24 = xYPlot15.getRendererCount();
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = xYPlot15.getDomainMarkers(layer25);
        xYPlot15.setWeight((int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        xYPlot33.zoomRangeAxes(0.0d, plotRenderingInfo35, point2D36, false);
        org.jfree.chart.util.Layer layer39 = null;
        java.util.Collection collection40 = xYPlot33.getDomainMarkers(layer39);
        double double41 = xYPlot33.getDomainCrosshairValue();
        java.awt.Stroke stroke42 = xYPlot33.getDomainZeroBaselineStroke();
        org.jfree.data.xy.XYDataset xYDataset43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot(xYDataset43, valueAxis44, valueAxis45, xYItemRenderer46);
        java.awt.geom.Point2D point2D48 = xYPlot47.getQuadrantOrigin();
        java.awt.Paint paint49 = xYPlot47.getOutlinePaint();
        xYPlot33.setDomainGridlinePaint(paint49);
        java.awt.Paint paint51 = xYPlot33.getRangeMinorGridlinePaint();
        xYPlot15.setDomainZeroBaselinePaint(paint51);
        xYPlot4.setNoDataMessagePaint(paint51);
        float float54 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image55 = xYPlot4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNull(collection40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(point2D48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNull(image55);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        java.awt.Stroke stroke6 = xYPlot4.getDomainCrosshairStroke();
        xYPlot4.clearRangeAxes();
        xYPlot4.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        xYPlot4.setRangeAxis(valueAxis10);
        java.awt.Paint paint12 = xYPlot4.getRangeMinorGridlinePaint();
        boolean boolean13 = xYPlot4.isOutlineVisible();
        xYPlot4.setOutlineVisible(true);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xYPlot4.removeRangeMarker((int) (short) 10, marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        xYPlot4.axisChanged(axisChangeEvent10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = xYPlot4.getLegendItems();
        xYPlot4.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot4.getRangeAxis((int) (short) -1);
        boolean boolean17 = xYPlot4.isRangeZeroBaselineVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        boolean boolean13 = xYPlot4.removeDomainMarker((int) (short) -1, marker11, layer12);
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        boolean boolean19 = xYPlot18.isDomainGridlinesVisible();
        java.awt.Stroke stroke20 = xYPlot18.getRangeMinorGridlineStroke();
        java.awt.Stroke stroke21 = xYPlot18.getDomainMinorGridlineStroke();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        org.jfree.chart.axis.AxisSpace axisSpace25 = xYPlot18.calculateRangeAxisSpace(graphics2D22, rectangle2D23, axisSpace24);
        xYPlot4.setFixedRangeAxisSpace(axisSpace25);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot4.setDomainAxis((int) '4', valueAxis28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(axisSpace25);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker5 = null;
        boolean boolean6 = xYPlot4.removeDomainMarker(marker5);
        xYPlot4.clearDomainMarkers((-1));
        xYPlot4.configureDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot4.getDomainAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Paint paint18 = xYPlot17.getRangeMinorGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot17.setRangeAxis((int) ' ', valueAxis20, false);
        xYPlot17.setRangeCrosshairVisible(false);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        org.jfree.chart.plot.Marker marker30 = null;
        boolean boolean31 = xYPlot29.removeDomainMarker(marker30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        xYPlot29.markerChanged(markerChangeEvent32);
        java.awt.Stroke stroke34 = xYPlot29.getDomainCrosshairStroke();
        xYPlot17.setDomainZeroBaselineStroke(stroke34);
        org.jfree.data.xy.XYDataset xYDataset36 = null;
        xYPlot17.setDataset(xYDataset36);
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        org.jfree.chart.plot.Marker marker43 = null;
        boolean boolean44 = xYPlot42.removeDomainMarker(marker43);
        org.jfree.chart.axis.AxisLocation axisLocation46 = xYPlot42.getRangeAxisLocation((int) (byte) -1);
        int int47 = xYPlot42.getBackgroundImageAlignment();
        xYPlot42.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray50 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot42.setRenderers(xYItemRendererArray50);
        org.jfree.chart.util.RectangleEdge rectangleEdge53 = xYPlot42.getDomainAxisEdge((int) (byte) 0);
        java.awt.Paint paint54 = xYPlot42.getRangeGridlinePaint();
        xYPlot17.setDomainCrosshairPaint(paint54);
        xYPlot4.setDomainCrosshairPaint(paint54);
        xYPlot4.setRangeCrosshairValue((double) (short) 100, true);
        java.awt.Stroke stroke60 = xYPlot4.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(xYItemRendererArray50);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray50, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertNotNull(rectangleEdge53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(stroke60);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainMinorGridlinesVisible(false);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.plot.Marker marker15 = null;
        boolean boolean16 = xYPlot14.removeDomainMarker(marker15);
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot14.getRangeAxisLocation((int) (byte) -1);
        int int19 = xYPlot14.getBackgroundImageAlignment();
        xYPlot14.setRangeMinorGridlinesVisible(true);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        boolean boolean27 = xYPlot26.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        int int29 = xYPlot26.getRangeAxisIndex(valueAxis28);
        java.awt.Stroke stroke30 = xYPlot26.getDomainGridlineStroke();
        xYPlot14.setDomainZeroBaselineStroke(stroke30);
        xYPlot4.setDomainZeroBaselineStroke(stroke30);
        xYPlot4.setRangePannable(true);
        java.awt.geom.GeneralPath generalPath35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.RenderingSource renderingSource37 = null;
        xYPlot4.select(generalPath35, rectangle2D36, renderingSource37);
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        xYPlot4.drawZeroDomainBaseline(graphics2D39, rectangle2D40);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.util.Layer layer45 = null;
        xYPlot4.drawRangeMarkers(graphics2D42, rectangle2D43, 1, layer45);
        java.awt.Paint paint47 = xYPlot4.getDomainCrosshairPaint();
        org.jfree.data.xy.XYDataset xYDataset48 = null;
        xYPlot4.setDataset(xYDataset48);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        java.awt.Paint paint15 = xYPlot14.getRangeMinorGridlinePaint();
        xYPlot4.setRangeZeroBaselinePaint(paint15);
        xYPlot4.setDomainCrosshairVisible(true);
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot4.setDomainGridlineStroke(stroke20);
        boolean boolean22 = xYPlot4.isDomainMinorGridlinesVisible();
        boolean boolean23 = xYPlot4.isDomainZoomable();
        boolean boolean24 = xYPlot4.isRangeZoomable();
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        boolean boolean27 = xYPlot4.removeDomainMarker(marker25, layer26);
        java.awt.Paint paint28 = xYPlot4.getRangeMinorGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.plot.Plot plot30 = xYPlot4.getRootPlot();
        java.awt.Paint paint31 = xYPlot4.getRangeGridlinePaint();
        java.awt.Stroke stroke32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setRangeGridlineStroke(stroke32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        xYPlot4.setRangeAxis(valueAxis6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        xYPlot4.addChangeListener(plotChangeListener8);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        int int11 = xYPlot4.indexOf(xYDataset10);
        xYPlot4.mapDatasetToDomainAxis((int) (short) 0, 0);
        xYPlot4.setDomainCrosshairValue((double) 10.0f, false);
        xYPlot4.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo6, point2D7, false);
        boolean boolean10 = xYPlot4.isDomainZoomable();
        boolean boolean11 = xYPlot4.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot4.getDomainAxisForDataset(0);
        xYPlot4.setRangeGridlinesVisible(false);
        boolean boolean16 = xYPlot4.canSelectByPoint();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        xYPlot4.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        boolean boolean13 = xYPlot4.removeDomainMarker((int) (short) -1, marker11, layer12);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot19.zoomRangeAxes(0.0d, plotRenderingInfo21, point2D22, false);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = xYPlot19.getDomainMarkers(layer25);
        int int27 = xYPlot19.getWeight();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        xYPlot19.setRenderer((int) (byte) 10, xYItemRenderer29);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder31 = xYPlot19.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation32 = xYPlot19.getRangeAxisLocation();
        xYPlot4.setDomainAxisLocation(10, axisLocation32, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(seriesRenderingOrder31);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = xYPlot4.getRangeAxisIndex(valueAxis6);
        boolean boolean8 = xYPlot4.isOutlineVisible();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = xYPlot4.getDrawingSupplier();
        xYPlot4.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.geom.Point2D point2D5 = xYPlot4.getQuadrantOrigin();
        org.jfree.data.xy.XYDataset xYDataset6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = null;
        org.jfree.chart.plot.XYPlot xYPlot10 = new org.jfree.chart.plot.XYPlot(xYDataset6, valueAxis7, valueAxis8, xYItemRenderer9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        xYPlot10.zoomRangeAxes(0.0d, plotRenderingInfo12, point2D13, false);
        java.awt.Stroke stroke16 = xYPlot10.getRangeZeroBaselineStroke();
        xYPlot4.setRangeMinorGridlineStroke(stroke16);
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.data.Range range21 = xYPlot4.getDataRange(valueAxis20);
        boolean boolean22 = xYPlot4.isRangePannable();
        boolean boolean23 = xYPlot4.isSubplot();
        org.junit.Assert.assertNotNull(point2D5);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }
}

