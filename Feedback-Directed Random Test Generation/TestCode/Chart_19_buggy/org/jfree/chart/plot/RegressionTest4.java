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
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        java.awt.Paint paint11 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setRangeGridlineStroke(stroke13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        categoryPlot19.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot19.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo23, point2D24);
        java.awt.Paint paint26 = categoryPlot19.getDomainGridlinePaint();
        categoryPlot4.setBackgroundPaint(paint26);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        int int29 = categoryPlot4.getIndexOf(categoryItemRenderer28);
        categoryPlot4.clearRangeMarkers((int) (short) -1);
        categoryPlot4.setBackgroundAlpha((float) 0L);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot4.zoomDomainAxes((double) (short) -1, plotRenderingInfo35, point2D36, false);
        boolean boolean39 = categoryPlot4.isDomainZoomable();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        java.awt.Paint paint11 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setRangeGridlineStroke(stroke13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        categoryPlot19.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot19.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo23, point2D24);
        java.awt.Paint paint26 = categoryPlot19.getDomainGridlinePaint();
        categoryPlot4.setBackgroundPaint(paint26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.util.Layer layer31 = null;
        categoryPlot4.drawRangeMarkers(graphics2D28, rectangle2D29, (int) (byte) 10, layer31);
        org.jfree.chart.util.SortOrder sortOrder33 = categoryPlot4.getRowRenderingOrder();
        boolean boolean34 = categoryPlot4.isRangeCrosshairVisible();
        categoryPlot4.setRangeCrosshairValue((double) '#');
        org.jfree.chart.plot.Plot plot37 = categoryPlot4.getRootPlot();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(sortOrder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(plot37);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        java.awt.Paint paint11 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setRangeGridlineStroke(stroke13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot4.zoomDomainAxes((double) 0L, plotRenderingInfo16, point2D17, false);
        java.awt.Stroke stroke20 = categoryPlot4.getRangeCrosshairStroke();
        double double21 = categoryPlot4.getRangeCrosshairValue();
        categoryPlot4.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        categoryPlot28.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot28.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo32, point2D33);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        categoryPlot28.setDomainAxis((int) ' ', categoryAxis36, false);
        categoryPlot28.clearDomainMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = categoryPlot28.getDomainAxisForDataset(10);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        categoryPlot46.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        java.awt.geom.Point2D point2D51 = null;
        categoryPlot46.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo50, point2D51);
        java.awt.Paint paint53 = categoryPlot46.getDomainGridlinePaint();
        categoryPlot28.setRangeCrosshairPaint(paint53);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent55 = null;
        categoryPlot28.rendererChanged(rendererChangeEvent55);
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        categoryPlot28.setRangeAxis(valueAxis57);
        float float59 = categoryPlot28.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        org.jfree.chart.axis.AxisSpace axisSpace62 = categoryPlot28.calculateAxisSpace(graphics2D60, rectangle2D61);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace62);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis41);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.5f + "'", float59 == 0.5f);
        org.junit.Assert.assertNotNull(axisSpace62);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis12, false);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot4.setBackgroundPaint(paint15);
        java.awt.Paint paint17 = categoryPlot4.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot4.zoomDomainAxes((double) (short) -1, plotRenderingInfo19, point2D20, true);
        categoryPlot4.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        int int26 = categoryPlot4.getRangeAxisIndex(valueAxis25);
        org.jfree.chart.axis.AxisLocation axisLocation28 = null;
        categoryPlot4.setDomainAxisLocation((int) (byte) 1, axisLocation28, false);
        categoryPlot4.setBackgroundImageAlignment((int) ' ');
        categoryPlot4.clearAnnotations();
        java.lang.Object obj34 = categoryPlot4.clone();
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        java.awt.Paint paint11 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot4.getDrawingSupplier();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setRangeGridlineStroke(stroke13);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setDomainGridlineStroke(stroke15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot4.calculateAxisSpace(graphics2D17, rectangle2D18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        categoryPlot24.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot24.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo28, point2D29);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        categoryPlot24.setDomainAxis((int) ' ', categoryAxis32, false);
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot24.setBackgroundPaint(paint35);
        java.awt.Paint paint37 = categoryPlot24.getBackgroundPaint();
        categoryPlot4.setDomainGridlinePaint(paint37);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot4.getDomainAxisLocation((int) (byte) 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(axisSpace19);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(axisLocation40);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis12, false);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot4.setBackgroundPaint(paint15);
        java.awt.Paint paint17 = categoryPlot4.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot4.setRangeAxes(valueAxisArray19);
        categoryPlot4.setRangeGridlinesVisible(false);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.util.Layer layer26 = null;
        categoryPlot4.drawDomainMarkers(graphics2D23, rectangle2D24, (int) '4', layer26);
        categoryPlot4.setWeight((int) (short) 0);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor30 = categoryPlot4.getDomainGridlinePosition();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.data.Range range32 = categoryPlot4.getDataRange(valueAxis31);
        categoryPlot4.setAnchorValue((double) (-1L), true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertArrayEquals(valueAxisArray19, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNotNull(categoryAnchor30);
        org.junit.Assert.assertNull(range32);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis12, false);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot4.setBackgroundPaint(paint15);
        java.awt.Paint paint17 = categoryPlot4.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot4.setRangeAxes(valueAxisArray19);
        categoryPlot4.setRangeGridlinesVisible(false);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.util.Layer layer26 = null;
        categoryPlot4.drawDomainMarkers(graphics2D23, rectangle2D24, (int) '4', layer26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot4.getDataset((int) (short) 10);
        int int30 = categoryPlot4.getDatasetCount();
        categoryPlot4.clearDomainAxes();
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertArrayEquals(valueAxisArray19, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis12, false);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot4.setBackgroundPaint(paint15);
        java.awt.Paint paint17 = categoryPlot4.getBackgroundPaint();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot4.getOrientation();
        categoryPlot4.clearDomainAxes();
        categoryPlot4.configureDomainAxes();
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(plotOrientation18);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomDomainAxes((double) '#', (double) 0L, plotRenderingInfo8, point2D9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot4.setDomainAxis((int) ' ', categoryAxis12, false);
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot4.getDomainAxisForDataset(10);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot4.setDomainAxis((int) '4', categoryAxis20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = categoryPlot4.getPlotType();
// flaky "1) test2009(org.jfree.chart.plot.RegressionTest4)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertNotNull(axisLocation18);
    }
}
