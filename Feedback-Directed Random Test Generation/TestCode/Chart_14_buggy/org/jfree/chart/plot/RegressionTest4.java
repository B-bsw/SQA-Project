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
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getDomainTickBandPaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D8, rectangle2D9);
        org.jfree.data.xy.XYDataset xYDataset11 = xYPlot0.getDataset();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D12, rectangle2D13);
        xYPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(xYDataset11);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        xYPlot0.setBackgroundAlpha((float) 1);
        java.awt.Paint paint8 = xYPlot0.getDomainZeroBaselinePaint();
        xYPlot0.setDomainCrosshairVisible(false);
        java.awt.geom.Point2D point2D11 = xYPlot0.getQuadrantOrigin();
        xYPlot0.setRangeZeroBaselineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        boolean boolean19 = categoryPlot18.getDrawSharedDomainAxis();
        int int20 = categoryPlot18.getDatasetCount();
        java.util.List list21 = categoryPlot18.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        categoryPlot18.setRenderer((int) (byte) 0, categoryItemRenderer23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot18.getRenderer((int) ' ');
        boolean boolean27 = categoryPlot18.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        java.util.List list29 = categoryPlot18.getCategoriesForAxis(categoryAxis28);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis33, valueAxis34, categoryItemRenderer35);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.util.Layer layer40 = null;
        categoryPlot36.drawRangeMarkers(graphics2D37, rectangle2D38, (int) (short) -1, layer40);
        categoryPlot36.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.axis.AxisSpace axisSpace46 = null;
        org.jfree.chart.axis.AxisSpace axisSpace47 = categoryPlot36.calculateDomainAxisSpace(graphics2D44, rectangle2D45, axisSpace46);
        org.jfree.chart.axis.AxisSpace axisSpace48 = categoryPlot18.calculateRangeAxisSpace(graphics2D30, rectangle2D31, axisSpace47);
        xYPlot0.setFixedRangeAxisSpace(axisSpace48);
        org.jfree.chart.plot.Plot plot50 = null;
        xYPlot0.setParent(plot50);
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint53 = null;
        xYPlot52.setDomainTickBandPaint(paint53);
        org.jfree.chart.util.RectangleEdge rectangleEdge55 = xYPlot52.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener56 = null;
        xYPlot52.addChangeListener(plotChangeListener56);
        java.awt.Paint paint58 = xYPlot52.getRangeTickBandPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent59 = null;
        xYPlot52.markerChanged(markerChangeEvent59);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = xYPlot52.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = xYPlot52.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets62, false);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(point2D11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(list21);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(axisSpace47);
        org.junit.Assert.assertNotNull(axisSpace48);
        org.junit.Assert.assertNotNull(rectangleEdge55);
        org.junit.Assert.assertNull(paint58);
        org.junit.Assert.assertNull(xYItemRenderer61);
        org.junit.Assert.assertNotNull(rectangleInsets62);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        int int15 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        boolean boolean24 = categoryPlot23.getDrawSharedDomainAxis();
        org.jfree.data.general.DatasetGroup datasetGroup25 = categoryPlot23.getDatasetGroup();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot23.setDomainAxis(categoryAxis26);
        categoryPlot23.setWeight((int) ' ');
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = categoryPlot23.getDomainMarkers((int) ' ', layer31);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset35, categoryAxis36, valueAxis37, categoryItemRenderer38);
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        org.jfree.chart.util.Layer layer43 = null;
        categoryPlot39.drawRangeMarkers(graphics2D40, rectangle2D41, (int) (short) -1, layer43);
        categoryPlot39.setBackgroundAlpha((float) 100L);
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = categoryPlot39.getDomainAxisForDataset((int) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = null;
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer55 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = new org.jfree.chart.plot.CategoryPlot(categoryDataset52, categoryAxis53, valueAxis54, categoryItemRenderer55);
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.util.Layer layer60 = null;
        categoryPlot56.drawRangeMarkers(graphics2D57, rectangle2D58, (int) (short) -1, layer60);
        categoryPlot56.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke64 = categoryPlot56.getRangeCrosshairStroke();
        categoryPlot56.setWeight((int) (short) 10);
        categoryPlot56.clearDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo70 = null;
        org.jfree.chart.plot.XYPlot xYPlot71 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint72 = null;
        xYPlot71.setDomainTickBandPaint(paint72);
        org.jfree.chart.util.RectangleEdge rectangleEdge74 = xYPlot71.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener75 = null;
        xYPlot71.addChangeListener(plotChangeListener75);
        xYPlot71.setBackgroundAlpha((float) 1);
        java.awt.Paint paint79 = xYPlot71.getDomainZeroBaselinePaint();
        xYPlot71.setDomainCrosshairVisible(false);
        java.awt.geom.Point2D point2D82 = xYPlot71.getQuadrantOrigin();
        categoryPlot56.zoomDomainAxes((double) 10.0f, (double) 0L, plotRenderingInfo70, point2D82);
        categoryPlot39.zoomRangeAxes((double) (byte) -1, (double) (-1L), plotRenderingInfo51, point2D82);
        categoryPlot23.zoomDomainAxes((double) '#', plotRenderingInfo34, point2D82, true);
        xYPlot0.zoomDomainAxes((double) (byte) -1, plotRenderingInfo18, point2D82);
        xYPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.util.Layer layer91 = null;
        java.util.Collection collection92 = xYPlot0.getDomainMarkers(0, layer91);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNull(categoryAxis48);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertNotNull(rectangleEdge74);
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertNotNull(point2D82);
        org.junit.Assert.assertNull(collection92);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineVisible(false);
        int int7 = xYPlot0.getRangeAxisCount();
        xYPlot0.setNoDataMessage("");
        xYPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        boolean boolean16 = categoryPlot15.getDrawSharedDomainAxis();
        int int17 = categoryPlot15.getDatasetCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        java.util.List list19 = categoryPlot15.getCategoriesForAxis(categoryAxis18);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint22 = null;
        xYPlot21.setDomainTickBandPaint(paint22);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = xYPlot21.getRangeAxisEdge();
        java.awt.Stroke stroke25 = xYPlot21.getDomainGridlineStroke();
        xYPlot21.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot21.clearDomainMarkers();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.util.Layer layer33 = null;
        xYPlot21.drawDomainMarkers(graphics2D30, rectangle2D31, (int) (short) 1, layer33);
        java.awt.Paint paint35 = xYPlot21.getDomainZeroBaselinePaint();
        java.awt.Stroke stroke36 = xYPlot21.getRangeZeroBaselineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        xYPlot21.removeChangeListener(plotChangeListener37);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder39 = xYPlot21.getSeriesRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot(categoryDataset41, categoryAxis42, valueAxis43, categoryItemRenderer44);
        boolean boolean46 = categoryPlot45.getDrawSharedDomainAxis();
        int int47 = categoryPlot45.getDatasetCount();
        java.awt.Paint paint48 = categoryPlot45.getRangeCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray50 = new org.jfree.chart.axis.ValueAxis[] { valueAxis49 };
        categoryPlot45.setRangeAxes(valueAxisArray50);
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = categoryPlot45.getDomainAxis();
        org.jfree.chart.axis.AxisSpace axisSpace53 = categoryPlot45.getFixedDomainAxisSpace();
        categoryPlot45.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation56 = categoryPlot45.getDomainAxisLocation();
        xYPlot21.setDomainAxisLocation((int) (byte) 100, axisLocation56);
        categoryPlot15.setDomainAxisLocation((int) ' ', axisLocation56);
        xYPlot0.setRangeAxisLocation(axisLocation56, false);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(seriesRenderingOrder39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(valueAxisArray50);
        org.junit.Assert.assertArrayEquals(valueAxisArray50, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNull(categoryAxis52);
        org.junit.Assert.assertNull(axisSpace53);
        org.junit.Assert.assertNotNull(axisLocation56);
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
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.util.List list7 = categoryPlot4.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer9);
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot4.getDomainAxisLocation();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map16 = categoryPlot4.drawAxes(graphics2D12, rectangle2D13, rectangle2D14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(axisLocation11);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        java.lang.String str9 = xYPlot0.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        boolean boolean15 = categoryPlot14.getDrawSharedDomainAxis();
        int int16 = categoryPlot14.getDatasetCount();
        java.util.List list17 = categoryPlot14.getCategories();
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint19 = null;
        xYPlot18.setDomainTickBandPaint(paint19);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = xYPlot18.getRangeAxisEdge();
        java.awt.Stroke stroke22 = xYPlot18.getDomainGridlineStroke();
        xYPlot18.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot18.clearDomainMarkers();
        xYPlot18.clearDomainMarkers((int) (short) 1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        xYPlot18.removeChangeListener(plotChangeListener29);
        java.awt.Font font31 = xYPlot18.getNoDataMessageFont();
        categoryPlot14.setNoDataMessageFont(font31);
        xYPlot0.setNoDataMessageFont(font31);
        int int34 = xYPlot0.getWeight();
        org.jfree.chart.util.Layer layer35 = null;
        java.util.Collection collection36 = xYPlot0.getRangeMarkers(layer35);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XY Plot" + "'", str9, "XY Plot");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(collection36);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        java.lang.String str9 = xYPlot0.getPlotType();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        xYPlot0.notifyListeners(plotChangeEvent10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        int int13 = xYPlot0.getIndexOf(xYItemRenderer12);
        boolean boolean14 = xYPlot0.isRangeZoomable();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        boolean boolean22 = categoryPlot21.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis24 = categoryPlot21.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot21.zoomRangeAxes(1.0d, plotRenderingInfo26, point2D27);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        categoryPlot21.setRenderer(10, categoryItemRenderer30, false);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot21.getDomainAxisEdge(0);
        categoryPlot21.setRangeCrosshairValue((double) '4', false);
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot21.getDomainAxisEdge((int) 'a');
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        org.jfree.chart.axis.AxisSpace axisSpace42 = categoryPlot21.calculateAxisSpace(graphics2D40, rectangle2D41);
        org.jfree.chart.axis.AxisSpace axisSpace43 = xYPlot0.calculateRangeAxisSpace(graphics2D15, rectangle2D16, axisSpace42);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation44 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = xYPlot0.removeAnnotation(xYAnnotation44, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XY Plot" + "'", str9, "XY Plot");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertNotNull(axisSpace42);
        org.junit.Assert.assertNotNull(axisSpace43);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        boolean boolean5 = xYPlot0.isDomainGridlinesVisible();
        java.awt.Paint paint6 = xYPlot0.getRangeCrosshairPaint();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        xYPlot11.setRangeCrosshairValue((double) 1.0f);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        boolean boolean21 = categoryPlot20.getDrawSharedDomainAxis();
        int int22 = categoryPlot20.getDatasetCount();
        java.util.List list23 = categoryPlot20.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot20.setRenderer((int) (byte) 0, categoryItemRenderer25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot20.getRenderer((int) ' ');
        boolean boolean29 = categoryPlot20.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        java.util.List list31 = categoryPlot20.getCategoriesForAxis(categoryAxis30);
        xYPlot11.drawRangeGridlines(graphics2D14, rectangle2D15, list31);
        boolean boolean33 = xYPlot11.isRangeCrosshairLockedOnData();
        xYPlot11.setRangeZeroBaselineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = xYPlot11.getAxisOffset();
        xYPlot0.setInsets(rectangleInsets36, false);
        int int39 = xYPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(list23);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineVisible(false);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.Layer layer10 = null;
        xYPlot0.drawRangeMarkers(graphics2D7, rectangle2D8, (int) '#', layer10);
        xYPlot0.setRangeCrosshairVisible(false);
        java.awt.Image image14 = xYPlot0.getBackgroundImage();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = xYPlot0.getRenderer();
        xYPlot0.clearDomainMarkers();
        boolean boolean17 = xYPlot0.isDomainZeroBaselineVisible();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map22 = xYPlot0.drawAxes(graphics2D18, rectangle2D19, rectangle2D20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNull(xYItemRenderer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        java.util.List list8 = categoryPlot4.getCategoriesForAxis(categoryAxis7);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot4.getRangeAxisEdge();
        categoryPlot4.mapDatasetToDomainAxis(15, (int) (byte) 100);
        categoryPlot4.clearDomainAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot4.setRenderer(categoryItemRenderer14);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint17 = null;
        xYPlot16.setDomainTickBandPaint(paint17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot16.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        xYPlot16.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = xYPlot16.getRangeTickBandPaint();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint26 = null;
        xYPlot25.setDomainTickBandPaint(paint26);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = xYPlot25.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        xYPlot25.addChangeListener(plotChangeListener29);
        xYPlot25.setBackgroundAlpha((float) 1);
        java.awt.Paint paint33 = xYPlot25.getDomainZeroBaselinePaint();
        xYPlot25.setDomainCrosshairVisible(false);
        java.awt.geom.Point2D point2D36 = xYPlot25.getQuadrantOrigin();
        xYPlot25.setRangeZeroBaselineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis40, valueAxis41, categoryItemRenderer42);
        boolean boolean44 = categoryPlot43.getDrawSharedDomainAxis();
        int int45 = categoryPlot43.getDatasetCount();
        java.util.List list46 = categoryPlot43.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer48 = null;
        categoryPlot43.setRenderer((int) (byte) 0, categoryItemRenderer48);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = categoryPlot43.getRenderer((int) ' ');
        boolean boolean52 = categoryPlot43.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = null;
        java.util.List list54 = categoryPlot43.getCategoriesForAxis(categoryAxis53);
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer60 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot61 = new org.jfree.chart.plot.CategoryPlot(categoryDataset57, categoryAxis58, valueAxis59, categoryItemRenderer60);
        java.awt.Graphics2D graphics2D62 = null;
        java.awt.geom.Rectangle2D rectangle2D63 = null;
        org.jfree.chart.util.Layer layer65 = null;
        categoryPlot61.drawRangeMarkers(graphics2D62, rectangle2D63, (int) (short) -1, layer65);
        categoryPlot61.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D69 = null;
        java.awt.geom.Rectangle2D rectangle2D70 = null;
        org.jfree.chart.axis.AxisSpace axisSpace71 = null;
        org.jfree.chart.axis.AxisSpace axisSpace72 = categoryPlot61.calculateDomainAxisSpace(graphics2D69, rectangle2D70, axisSpace71);
        org.jfree.chart.axis.AxisSpace axisSpace73 = categoryPlot43.calculateRangeAxisSpace(graphics2D55, rectangle2D56, axisSpace72);
        xYPlot25.setFixedRangeAxisSpace(axisSpace73);
        org.jfree.chart.axis.AxisSpace axisSpace75 = xYPlot16.calculateDomainAxisSpace(graphics2D23, rectangle2D24, axisSpace73);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace73, true);
        categoryPlot4.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(point2D36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(list46);
        org.junit.Assert.assertNull(categoryItemRenderer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(axisSpace72);
        org.junit.Assert.assertNotNull(axisSpace73);
        org.junit.Assert.assertNotNull(axisSpace75);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.util.List list7 = categoryPlot4.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot4.setRenderer(categoryItemRenderer11);
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint14 = null;
        xYPlot13.setDomainTickBandPaint(paint14);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = xYPlot13.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        xYPlot13.addChangeListener(plotChangeListener17);
        java.awt.Paint paint19 = xYPlot13.getRangeTickBandPaint();
        java.awt.Paint paint20 = xYPlot13.getRangeZeroBaselinePaint();
        boolean boolean21 = xYPlot13.isRangeZeroBaselineVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = xYPlot13.getRenderer((int) (byte) 100);
        boolean boolean24 = xYPlot13.isRangeZoomable();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint28 = null;
        xYPlot27.setDomainTickBandPaint(paint28);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = xYPlot27.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        xYPlot27.addChangeListener(plotChangeListener31);
        xYPlot27.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint37 = null;
        xYPlot36.setDomainTickBandPaint(paint37);
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = xYPlot36.getRangeAxisEdge();
        java.awt.Stroke stroke40 = xYPlot36.getDomainGridlineStroke();
        xYPlot36.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation();
        xYPlot27.setDomainAxisLocation((int) (byte) 1, axisLocation43);
        xYPlot27.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis48, valueAxis49, categoryItemRenderer50);
        categoryPlot51.mapDatasetToRangeAxis((int) ' ', (int) 'a');
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer60 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot61 = new org.jfree.chart.plot.CategoryPlot(categoryDataset57, categoryAxis58, valueAxis59, categoryItemRenderer60);
        java.awt.Graphics2D graphics2D62 = null;
        java.awt.geom.Rectangle2D rectangle2D63 = null;
        org.jfree.chart.util.Layer layer65 = null;
        categoryPlot61.drawRangeMarkers(graphics2D62, rectangle2D63, (int) (short) -1, layer65);
        categoryPlot61.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D69 = null;
        java.awt.geom.Rectangle2D rectangle2D70 = null;
        org.jfree.chart.axis.AxisSpace axisSpace71 = null;
        org.jfree.chart.axis.AxisSpace axisSpace72 = categoryPlot61.calculateDomainAxisSpace(graphics2D69, rectangle2D70, axisSpace71);
        org.jfree.chart.axis.AxisSpace axisSpace73 = categoryPlot51.calculateRangeAxisSpace(graphics2D55, rectangle2D56, axisSpace71);
        xYPlot27.setFixedDomainAxisSpace(axisSpace73, true);
        org.jfree.chart.axis.AxisSpace axisSpace76 = xYPlot13.calculateDomainAxisSpace(graphics2D25, rectangle2D26, axisSpace73);
        categoryPlot4.setFixedDomainAxisSpace(axisSpace73);
        org.jfree.chart.axis.CategoryAxis categoryAxis78 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray79 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis78 };
        categoryPlot4.setDomainAxes(categoryAxisArray79);
        java.awt.Graphics2D graphics2D81 = null;
        java.awt.geom.Rectangle2D rectangle2D82 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo83 = null;
        categoryPlot4.drawAnnotations(graphics2D81, rectangle2D82, plotRenderingInfo83);
        java.awt.Graphics2D graphics2D85 = null;
        java.awt.geom.Rectangle2D rectangle2D86 = null;
        categoryPlot4.drawDomainGridlines(graphics2D85, rectangle2D86);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(xYItemRenderer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNotNull(axisSpace72);
        org.junit.Assert.assertNotNull(axisSpace73);
        org.junit.Assert.assertNotNull(axisSpace76);
        org.junit.Assert.assertNotNull(categoryAxisArray79);
        org.junit.Assert.assertArrayEquals(categoryAxisArray79, new org.jfree.chart.axis.CategoryAxis[] { null });
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        int int8 = categoryPlot4.getDatasetCount();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot4.getFixedLegendItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(legendItemCollection9);
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
        java.awt.Stroke stroke5 = xYPlot4.getOutlineStroke();
        xYPlot4.clearDomainMarkers();
        xYPlot4.setDomainCrosshairLockedOnData(false);
        java.awt.Stroke stroke9 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        xYPlot16.clearRangeMarkers();
        boolean boolean18 = xYPlot16.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot16.getRangeAxisLocation((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        categoryPlot25.mapDatasetToRangeAxis((int) ' ', (int) 'a');
        xYPlot16.setParent((org.jfree.chart.plot.Plot) categoryPlot25);
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = xYPlot16.getDomainMarkers((int) (byte) 100, layer31);
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint34 = null;
        xYPlot33.setDomainTickBandPaint(paint34);
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = xYPlot33.getRangeAxisEdge();
        java.awt.Stroke stroke37 = xYPlot33.getDomainGridlineStroke();
        xYPlot33.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot33.clearDomainMarkers();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.util.Layer layer45 = null;
        xYPlot33.drawDomainMarkers(graphics2D42, rectangle2D43, (int) (short) 1, layer45);
        java.awt.Paint paint47 = xYPlot33.getDomainZeroBaselinePaint();
        java.awt.Stroke stroke48 = xYPlot33.getRangeZeroBaselineStroke();
        java.awt.Paint paint49 = xYPlot33.getRangeZeroBaselinePaint();
        xYPlot16.setNoDataMessagePaint(paint49);
        java.awt.geom.Point2D point2D51 = xYPlot16.getQuadrantOrigin();
        xYPlot4.zoomRangeAxes((double) (-1.0f), plotRenderingInfo11, point2D51);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNotNull(rectangleEdge36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(point2D51);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        int int1 = xYPlot0.getDatasetCount();
        java.awt.Paint paint2 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis7, categoryItemRenderer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.util.Layer layer13 = null;
        categoryPlot9.drawRangeMarkers(graphics2D10, rectangle2D11, (int) (short) -1, layer13);
        categoryPlot9.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke17 = categoryPlot9.getRangeCrosshairStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        java.util.List list19 = categoryPlot9.getCategoriesForAxis(categoryAxis18);
        xYPlot0.drawDomainTickBands(graphics2D3, rectangle2D4, list19);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = xYPlot0.getFixedLegendItems();
        xYPlot0.clearRangeMarkers();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent23 = null;
        xYPlot0.rendererChanged(rendererChangeEvent23);
        xYPlot0.setRangeZeroBaselineVisible(false);
        boolean boolean27 = xYPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        int int29 = xYPlot0.getDomainAxisIndex(valueAxis28);
        xYPlot0.clearDomainMarkers();
        xYPlot0.zoom((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(legendItemCollection21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        xYPlot0.configureDomainAxes();
        org.jfree.data.xy.XYDataset xYDataset9 = xYPlot0.getDataset();
        org.jfree.chart.axis.AxisSpace axisSpace10 = xYPlot0.getFixedRangeAxisSpace();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot(xYDataset11, valueAxis12, valueAxis13, xYItemRenderer14);
        xYPlot15.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        int int19 = xYPlot15.getIndexOf(xYItemRenderer18);
        java.awt.Paint paint20 = xYPlot15.getDomainZeroBaselinePaint();
        xYPlot0.setOutlinePaint(paint20);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        xYPlot0.setRangeAxis(0, valueAxis23);
        float float25 = xYPlot0.getBackgroundImageAlpha();
        java.awt.Paint paint26 = xYPlot0.getRangeTickBandPaint();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(xYDataset9);
        org.junit.Assert.assertNull(axisSpace10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNull(paint26);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineVisible(false);
        int int7 = xYPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot0.getDomainAxisLocation(15);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        xYPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint10 = null;
        xYPlot9.setDomainTickBandPaint(paint10);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot9.getRangeAxisEdge();
        java.awt.Stroke stroke13 = xYPlot9.getDomainGridlineStroke();
        xYPlot9.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation16 = xYPlot9.getRangeAxisLocation();
        xYPlot0.setDomainAxisLocation((int) (byte) 1, axisLocation16);
        xYPlot0.setBackgroundAlpha((float) (short) -1);
        double double20 = xYPlot0.getRangeCrosshairValue();
        xYPlot0.setDomainCrosshairValue(0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot4.removeDomainMarker((int) (byte) 100, marker10, layer11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getRangeMarkers(layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.XYPlot xYPlot8 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint9 = null;
        xYPlot8.setDomainTickBandPaint(paint9);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = xYPlot8.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        xYPlot8.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = xYPlot8.getRangeTickBandPaint();
        xYPlot8.configureRangeAxes();
        xYPlot8.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot8.setDomainAxis(0, valueAxis19);
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot(xYDataset21, valueAxis22, valueAxis23, xYItemRenderer24);
        xYPlot25.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint30 = null;
        xYPlot29.setDomainTickBandPaint(paint30);
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = xYPlot29.getRangeAxisEdge();
        java.awt.Stroke stroke33 = xYPlot29.getDomainGridlineStroke();
        xYPlot29.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation37 = xYPlot29.getDomainAxisLocation((int) (short) 10);
        xYPlot25.setRangeAxisLocation((int) (short) 0, axisLocation37, false);
        xYPlot8.setRangeAxisLocation(axisLocation37, false);
        xYPlot0.setDomainAxisLocation(axisLocation37, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = xYPlot0.getInsets();
        java.awt.Font font45 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        xYPlot0.setNoDataMessageFont(font45);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(axisSpace7);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(rectangleEdge32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(font45);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        xYPlot0.setFixedDomainAxisSpace(axisSpace4);
        xYPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = null;
        int int9 = xYPlot0.getIndexOf(xYItemRenderer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        xYPlot16.setRangeCrosshairValue((double) 1.0f);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        boolean boolean26 = categoryPlot25.getDrawSharedDomainAxis();
        int int27 = categoryPlot25.getDatasetCount();
        java.util.List list28 = categoryPlot25.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        categoryPlot25.setRenderer((int) (byte) 0, categoryItemRenderer30);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = categoryPlot25.getRenderer((int) ' ');
        boolean boolean34 = categoryPlot25.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        java.util.List list36 = categoryPlot25.getCategoriesForAxis(categoryAxis35);
        xYPlot16.drawRangeGridlines(graphics2D19, rectangle2D20, list36);
        xYPlot0.drawDomainGridlines(graphics2D10, rectangle2D11, list36);
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = xYPlot0.getRangeAxisEdge(1);
        org.jfree.chart.LegendItemCollection legendItemCollection41 = xYPlot0.getLegendItems();
        float float42 = xYPlot0.getBackgroundImageAlpha();
        java.awt.Paint paint43 = xYPlot0.getDomainZeroBaselinePaint();
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.axis.AxisSpace axisSpace46 = xYPlot0.calculateAxisSpace(graphics2D44, rectangle2D45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis48, valueAxis49, categoryItemRenderer50);
        boolean boolean52 = categoryPlot51.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis54 = categoryPlot51.getRangeAxisForDataset((int) (byte) 100);
        java.awt.Paint paint55 = categoryPlot51.getRangeGridlinePaint();
        org.jfree.chart.util.Layer layer56 = null;
        java.util.Collection collection57 = categoryPlot51.getDomainMarkers(layer56);
        categoryPlot51.mapDatasetToRangeAxis((int) (byte) 10, (int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        categoryPlot51.setRangeAxis(valueAxis61);
        org.jfree.chart.plot.PlotOrientation plotOrientation63 = categoryPlot51.getOrientation();
        org.jfree.chart.event.PlotChangeListener plotChangeListener64 = null;
        categoryPlot51.addChangeListener(plotChangeListener64);
        java.awt.Stroke stroke66 = categoryPlot51.getRangeGridlineStroke();
        categoryPlot51.setWeight((int) (short) 1);
        java.awt.Stroke stroke69 = categoryPlot51.getRangeCrosshairStroke();
        xYPlot0.setDomainCrosshairStroke(stroke69);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(list28);
        org.junit.Assert.assertNull(categoryItemRenderer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(rectangleEdge40);
        org.junit.Assert.assertNotNull(legendItemCollection41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(axisSpace46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(valueAxis54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNull(collection57);
        org.junit.Assert.assertNotNull(plotOrientation63);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(stroke69);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getRangeAxisLocation();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        boolean boolean16 = categoryPlot15.getDrawSharedDomainAxis();
        int int17 = categoryPlot15.getDatasetCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        java.util.List list19 = categoryPlot15.getCategoriesForAxis(categoryAxis18);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        categoryPlot15.datasetChanged(datasetChangeEvent20);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        java.util.List list23 = categoryPlot15.getCategoriesForAxis(categoryAxis22);
        xYPlot0.drawDomainGridlines(graphics2D9, rectangle2D10, list23);
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer5 = null;
        xYPlot0.setRenderer(xYItemRenderer5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot0.getRangeAxisForDataset((int) (byte) 0);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot0.getRangeAxisIndex(valueAxis9);
        java.awt.Paint paint11 = xYPlot0.getRangeCrosshairPaint();
        xYPlot0.clearDomainMarkers();
        xYPlot0.setForegroundAlpha((float) (short) 0);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        java.awt.Paint paint14 = xYPlot0.getDomainZeroBaselinePaint();
        java.awt.Stroke stroke15 = xYPlot0.getRangeZeroBaselineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        xYPlot0.removeChangeListener(plotChangeListener16);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder18 = xYPlot0.getSeriesRenderingOrder();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xYPlot0.removeAnnotation(xYAnnotation19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(seriesRenderingOrder18);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.mapDatasetToDomainAxis((int) '4', (int) (byte) 10);
        java.awt.Stroke stroke12 = xYPlot0.getRangeZeroBaselineStroke();
        java.awt.Paint paint13 = xYPlot0.getRangeGridlinePaint();
        boolean boolean14 = xYPlot0.isDomainZoomable();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint18 = null;
        xYPlot17.setDomainTickBandPaint(paint18);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = xYPlot17.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        xYPlot17.addChangeListener(plotChangeListener21);
        xYPlot17.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint27 = null;
        xYPlot26.setDomainTickBandPaint(paint27);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = xYPlot26.getRangeAxisEdge();
        java.awt.Stroke stroke30 = xYPlot26.getDomainGridlineStroke();
        xYPlot26.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation();
        xYPlot17.setDomainAxisLocation((int) (byte) 1, axisLocation33);
        xYPlot17.setOutlineVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint40 = null;
        xYPlot39.setDomainTickBandPaint(paint40);
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = xYPlot39.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        xYPlot39.addChangeListener(plotChangeListener43);
        xYPlot39.setBackgroundAlpha((float) 1);
        java.awt.Paint paint47 = xYPlot39.getDomainZeroBaselinePaint();
        xYPlot39.setDomainCrosshairVisible(false);
        java.awt.geom.Point2D point2D50 = xYPlot39.getQuadrantOrigin();
        xYPlot17.zoomRangeAxes((double) (short) 0, plotRenderingInfo38, point2D50, false);
        xYPlot0.zoomRangeAxes((double) ' ', plotRenderingInfo16, point2D50);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = xYPlot0.removeAnnotation(xYAnnotation54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(rectangleEdge42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(point2D50);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        xYPlot0.clearDomainMarkers((int) (short) 1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        xYPlot0.removeChangeListener(plotChangeListener11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        xYPlot0.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        xYPlot0.setRenderer(xYItemRenderer15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = xYPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(legendItemCollection17);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        xYPlot0.mapDatasetToDomainAxis((int) '4', (int) (byte) 10);
        java.awt.Stroke stroke12 = xYPlot0.getRangeZeroBaselineStroke();
        java.awt.Paint paint13 = xYPlot0.getRangeGridlinePaint();
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = xYPlot0.getRangeMarkers(10, layer16);
        boolean boolean18 = xYPlot0.isDomainCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
        xYPlot4.setRangeCrosshairValue((double) 1.0f);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        boolean boolean14 = categoryPlot13.getDrawSharedDomainAxis();
        int int15 = categoryPlot13.getDatasetCount();
        java.util.List list16 = categoryPlot13.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot13.setRenderer((int) (byte) 0, categoryItemRenderer18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot13.getRenderer((int) ' ');
        boolean boolean22 = categoryPlot13.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        java.util.List list24 = categoryPlot13.getCategoriesForAxis(categoryAxis23);
        xYPlot4.drawRangeGridlines(graphics2D7, rectangle2D8, list24);
        xYPlot4.setDomainCrosshairValue(100.0d, true);
        boolean boolean29 = xYPlot4.isRangeZeroBaselineVisible();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = xYPlot0.getFixedRangeAxisSpace();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        xYPlot0.drawZeroRangeBaseline(graphics2D7, rectangle2D8);
        java.awt.Paint paint10 = xYPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = xYPlot0.getRenderer();
        boolean boolean15 = xYPlot0.isRangeZeroBaselineVisible();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(xYItemRenderer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = xYPlot0.getRangeMarkers(layer5);
        java.awt.Paint paint7 = xYPlot0.getRangeGridlinePaint();
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        xYPlot0.setRangeGridlineStroke(stroke8);
        xYPlot0.clearRangeAxes();
        double double11 = xYPlot0.getDomainCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.Plot plot9 = null;
        xYPlot0.setParent(plot9);
        org.jfree.chart.axis.AxisSpace axisSpace11 = xYPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot0.getDomainAxis();
        int int13 = xYPlot0.getDomainAxisCount();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        xYPlot18.clearRangeMarkers();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        xYPlot18.drawZeroRangeBaseline(graphics2D20, rectangle2D21);
        boolean boolean23 = xYPlot18.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.data.Range range25 = xYPlot18.getDataRange(valueAxis24);
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint27 = null;
        xYPlot26.setDomainTickBandPaint(paint27);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = xYPlot26.getRangeAxisEdge();
        java.awt.Stroke stroke30 = xYPlot26.getDomainGridlineStroke();
        xYPlot26.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        boolean boolean34 = xYPlot26.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint36 = null;
        xYPlot35.setDomainTickBandPaint(paint36);
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = xYPlot35.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        xYPlot35.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = xYPlot35.getRangeTickBandPaint();
        java.awt.Paint paint42 = xYPlot35.getRangeZeroBaselinePaint();
        boolean boolean43 = xYPlot35.isRangeZeroBaselineVisible();
        xYPlot35.mapDatasetToDomainAxis((int) '4', (int) (byte) 10);
        java.awt.Stroke stroke47 = xYPlot35.getRangeZeroBaselineStroke();
        java.awt.Paint paint48 = xYPlot35.getRangeGridlinePaint();
        xYPlot26.setNoDataMessagePaint(paint48);
        xYPlot26.setDomainCrosshairValue((double) (byte) 0, false);
        java.awt.Paint paint53 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot26.setRangeTickBandPaint(paint53);
        java.awt.Paint paint55 = xYPlot26.getDomainGridlinePaint();
        xYPlot18.setDomainTickBandPaint(paint55);
        xYPlot0.setRangeCrosshairPaint(paint55);
        org.jfree.chart.plot.Marker marker58 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = xYPlot0.removeDomainMarker(marker58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(range25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        categoryPlot4.clearAnnotations();
        int int7 = categoryPlot4.getRangeAxisCount();
        categoryPlot4.setRangeCrosshairVisible(false);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot4.render(graphics2D10, rectangle2D11, 0, plotRenderingInfo13);
        java.awt.Stroke stroke15 = categoryPlot4.getDomainGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        xYPlot0.setDomainCrosshairValue((double) 0);
        java.awt.Paint paint8 = xYPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot0.getRangeAxisIndex(valueAxis9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer5 = null;
        xYPlot0.setRenderer(xYItemRenderer5);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        xYPlot0.setDataset(100, xYDataset8);
        xYPlot0.setDomainCrosshairValue((double) 1L, true);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint15 = null;
        xYPlot14.setDomainTickBandPaint(paint15);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = xYPlot14.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        xYPlot14.addChangeListener(plotChangeListener18);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray20 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot14.setRenderers(xYItemRendererArray20);
        xYPlot0.setRenderers(xYItemRendererArray20);
        boolean boolean23 = xYPlot0.isRangeGridlinesVisible();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.util.Layer layer27 = null;
        xYPlot0.drawRangeMarkers(graphics2D24, rectangle2D25, (int) (short) -1, layer27);
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint31 = null;
        xYPlot30.setDomainTickBandPaint(paint31);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = xYPlot30.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        xYPlot30.addChangeListener(plotChangeListener34);
        java.awt.Paint paint36 = xYPlot30.getRangeTickBandPaint();
        xYPlot30.configureRangeAxes();
        xYPlot30.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        xYPlot30.setDomainAxis(0, valueAxis41);
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint44 = null;
        xYPlot43.setDomainTickBandPaint(paint44);
        org.jfree.chart.util.RectangleEdge rectangleEdge46 = xYPlot43.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        xYPlot43.addChangeListener(plotChangeListener47);
        java.awt.Paint paint49 = xYPlot43.getRangeTickBandPaint();
        java.awt.Paint paint50 = xYPlot43.getRangeZeroBaselinePaint();
        boolean boolean51 = xYPlot43.isRangeZeroBaselineVisible();
        xYPlot43.mapDatasetToDomainAxis((int) '4', (int) (byte) 10);
        java.awt.Stroke stroke55 = xYPlot43.getRangeZeroBaselineStroke();
        java.awt.Paint paint56 = xYPlot43.getRangeGridlinePaint();
        xYPlot30.setRangeZeroBaselinePaint(paint56);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.setQuadrantPaint(15, paint56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (15) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(xYItemRendererArray20);
        org.junit.Assert.assertArrayEquals(xYItemRendererArray20, new org.jfree.chart.renderer.xy.XYItemRenderer[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertNotNull(rectangleEdge46);
        org.junit.Assert.assertNull(paint49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.util.Layer layer20 = null;
        categoryPlot16.drawRangeMarkers(graphics2D17, rectangle2D18, (int) (short) -1, layer20);
        int int22 = categoryPlot16.getDomainAxisCount();
        java.awt.Stroke stroke23 = categoryPlot16.getDomainGridlineStroke();
        categoryPlot4.setDomainGridlineStroke(stroke23);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = categoryPlot4.getDomainAxis((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNull(categoryAxis28);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot0.getDomainAxisLocation((int) (short) 10);
        xYPlot0.setRangeCrosshairLockedOnData(true);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        xYPlot0.drawZeroDomainBaseline(graphics2D11, rectangle2D12);
        java.lang.Object obj14 = xYPlot0.clone();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setRangeZeroBaselineVisible(false);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.Layer layer10 = null;
        xYPlot0.drawRangeMarkers(graphics2D7, rectangle2D8, (int) '#', layer10);
        xYPlot0.setRangeCrosshairVisible(false);
        xYPlot0.clearDomainMarkers(10);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        int int15 = xYPlot0.getBackgroundImageAlignment();
        xYPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint19 = null;
        xYPlot18.setDomainTickBandPaint(paint19);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = xYPlot18.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        xYPlot18.addChangeListener(plotChangeListener22);
        java.awt.Paint paint24 = xYPlot18.getRangeTickBandPaint();
        java.awt.Paint paint25 = xYPlot18.getRangeZeroBaselinePaint();
        boolean boolean26 = xYPlot18.isRangeZeroBaselineVisible();
        java.lang.String str27 = xYPlot18.getPlotType();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        xYPlot18.notifyListeners(plotChangeEvent28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        boolean boolean35 = categoryPlot34.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis37 = categoryPlot34.getRangeAxisForDataset((int) (byte) 100);
        java.awt.Paint paint38 = categoryPlot34.getRangeGridlinePaint();
        xYPlot18.setDomainTickBandPaint(paint38);
        xYPlot0.setDomainGridlinePaint(paint38);
        java.awt.Paint paint41 = xYPlot0.getRangeGridlinePaint();
        int int42 = xYPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "XY Plot" + "'", str27, "XY Plot");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(valueAxis37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke12 = categoryPlot4.getRangeCrosshairStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot4.getDataset((int) (byte) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot4.getRenderer();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        boolean boolean21 = categoryPlot20.getDrawSharedDomainAxis();
        int int22 = categoryPlot20.getDatasetCount();
        java.util.List list23 = categoryPlot20.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot20.setRenderer((int) (byte) 0, categoryItemRenderer25);
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint28 = null;
        xYPlot27.setDomainTickBandPaint(paint28);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = xYPlot27.getRangeAxisEdge();
        java.awt.Stroke stroke31 = xYPlot27.getDomainGridlineStroke();
        categoryPlot20.setRangeGridlineStroke(stroke31);
        org.jfree.chart.util.SortOrder sortOrder33 = categoryPlot20.getRowRenderingOrder();
        categoryPlot4.setColumnRenderingOrder(sortOrder33);
        org.jfree.chart.axis.AxisSpace axisSpace35 = categoryPlot4.getFixedDomainAxisSpace();
        categoryPlot4.clearRangeMarkers();
        int int37 = categoryPlot4.getDatasetCount();
        org.jfree.chart.util.Layer layer39 = null;
        java.util.Collection collection40 = categoryPlot4.getDomainMarkers((int) '#', layer39);
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot4.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot4.getOrientation();
        boolean boolean43 = categoryPlot4.isRangeZoomable();
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(list23);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(sortOrder33);
        org.junit.Assert.assertNull(axisSpace35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(collection40);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertNotNull(plotOrientation42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomRangeAxes(1.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot4.setRenderer(10, categoryItemRenderer13, false);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        xYPlot21.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint26 = null;
        xYPlot25.setDomainTickBandPaint(paint26);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = xYPlot25.getRangeAxisEdge();
        java.awt.Stroke stroke29 = xYPlot25.getDomainGridlineStroke();
        xYPlot25.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot25.getDomainAxisLocation((int) (short) 10);
        xYPlot21.setRangeAxisLocation((int) (short) 0, axisLocation33, false);
        categoryPlot4.setDomainAxisLocation(1, axisLocation33);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        categoryPlot4.setRangeAxis(100, valueAxis38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = categoryPlot4.getDataset();
        boolean boolean41 = categoryPlot4.isRangeCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset42 = categoryPlot4.getDataset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        categoryPlot4.setRenderer(categoryItemRenderer43, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(categoryDataset40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(categoryDataset42);
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
        xYPlot4.clearRangeMarkers();
        boolean boolean6 = xYPlot4.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot4.getRangeAxisLocation((int) (byte) 1);
        java.awt.Paint paint9 = xYPlot4.getDomainCrosshairPaint();
        xYPlot4.setDomainCrosshairValue((double) (short) 1, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        java.lang.String str9 = xYPlot0.getPlotType();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        xYPlot0.notifyListeners(plotChangeEvent10);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRendererForDataset(xYDataset12);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XY Plot" + "'", str9, "XY Plot");
        org.junit.Assert.assertNull(xYItemRenderer13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke12 = categoryPlot4.getRangeCrosshairStroke();
        categoryPlot4.setWeight((int) (short) 10);
        categoryPlot4.setRangeCrosshairValue((double) (byte) 10, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        int int19 = categoryPlot4.getIndexOf(categoryItemRenderer18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        boolean boolean25 = categoryPlot24.getDrawSharedDomainAxis();
        int int26 = categoryPlot24.getDatasetCount();
        java.awt.Paint paint27 = categoryPlot24.getRangeCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] { valueAxis28 };
        categoryPlot24.setRangeAxes(valueAxisArray29);
        java.awt.Paint paint31 = categoryPlot24.getRangeGridlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection32 = categoryPlot24.getLegendItems();
        categoryPlot4.setFixedLegendItems(legendItemCollection32);
        java.awt.Paint paint34 = categoryPlot4.getOutlinePaint();
        int int35 = categoryPlot4.getDatasetCount();
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(valueAxisArray29);
        org.junit.Assert.assertArrayEquals(valueAxisArray29, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(legendItemCollection32);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
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
        xYPlot4.clearRangeMarkers();
        boolean boolean6 = xYPlot4.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation8 = xYPlot4.getRangeAxisLocation((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        categoryPlot13.mapDatasetToRangeAxis((int) ' ', (int) 'a');
        xYPlot4.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot4.getDomainMarkers((int) (byte) 100, layer19);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        xYPlot4.removeChangeListener(plotChangeListener21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = xYPlot4.getDatasetGroup();
        org.jfree.chart.LegendItemCollection legendItemCollection24 = xYPlot4.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(legendItemCollection24);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.awt.Paint paint7 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomRangeAxes((double) (short) -1, plotRenderingInfo9, point2D10);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot4.setDomainGridlinePaint(paint12);
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint15 = null;
        xYPlot14.setDomainTickBandPaint(paint15);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = xYPlot14.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        xYPlot14.addChangeListener(plotChangeListener18);
        java.awt.Paint paint20 = xYPlot14.getRangeTickBandPaint();
        java.awt.Paint paint21 = xYPlot14.getRangeZeroBaselinePaint();
        boolean boolean22 = xYPlot14.isRangeZeroBaselineVisible();
        java.lang.String str23 = xYPlot14.getPlotType();
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint26 = null;
        xYPlot25.setDomainTickBandPaint(paint26);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = xYPlot25.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        xYPlot25.addChangeListener(plotChangeListener29);
        xYPlot25.setBackgroundAlpha((float) 1);
        java.awt.Paint paint33 = xYPlot25.getDomainZeroBaselinePaint();
        xYPlot25.setDomainCrosshairVisible(false);
        boolean boolean36 = xYPlot25.isSubplot();
        xYPlot25.mapDatasetToRangeAxis(10, 0);
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint41 = null;
        xYPlot40.setDomainTickBandPaint(paint41);
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = xYPlot40.getRangeAxisEdge();
        java.awt.Stroke stroke44 = xYPlot40.getDomainGridlineStroke();
        xYPlot40.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation48 = xYPlot40.getDomainAxisLocation((int) (short) 10);
        xYPlot25.setDomainAxisLocation(axisLocation48);
        xYPlot14.setRangeAxisLocation((int) (byte) 0, axisLocation48);
        org.jfree.chart.LegendItemCollection legendItemCollection51 = xYPlot14.getLegendItems();
        categoryPlot4.setFixedLegendItems(legendItemCollection51);
        org.jfree.chart.plot.Plot plot53 = categoryPlot4.getParent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "XY Plot" + "'", str23, "XY Plot");
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(rectangleEdge43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertNotNull(legendItemCollection51);
        org.junit.Assert.assertNull(plot53);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        int int8 = categoryPlot4.getDatasetCount();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint10 = null;
        xYPlot9.setDomainTickBandPaint(paint10);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot9.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot9.addChangeListener(plotChangeListener13);
        xYPlot9.setBackgroundAlpha((float) 1);
        java.awt.Paint paint17 = xYPlot9.getDomainZeroBaselinePaint();
        categoryPlot4.setDomainGridlinePaint(paint17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace19, true);
        categoryPlot4.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot4.getRangeMarkers(layer24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(collection25);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        java.awt.Paint paint14 = xYPlot0.getDomainZeroBaselinePaint();
        java.awt.Paint paint15 = xYPlot0.getDomainGridlinePaint();
        xYPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.util.List list7 = categoryPlot4.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot4.getAxisOffset();
        categoryPlot4.setDrawSharedDomainAxis(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot4.setRenderer(categoryItemRenderer14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot4.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint20 = null;
        xYPlot19.setDomainTickBandPaint(paint20);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = xYPlot19.getRangeAxisEdge();
        java.awt.Stroke stroke23 = xYPlot19.getDomainGridlineStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        xYPlot19.setRenderer(xYItemRenderer24);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = xYPlot19.getDomainMarkers((int) '#', layer27);
        java.awt.Paint paint30 = xYPlot19.getQuadrantPaint(0);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis32, valueAxis33, categoryItemRenderer34);
        boolean boolean36 = categoryPlot35.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis38 = categoryPlot35.getRangeAxisForDataset((int) (byte) 100);
        java.awt.Paint paint39 = categoryPlot35.getRangeGridlinePaint();
        org.jfree.chart.util.Layer layer40 = null;
        java.util.Collection collection41 = categoryPlot35.getDomainMarkers(layer40);
        categoryPlot35.mapDatasetToRangeAxis((int) (byte) 10, (int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        categoryPlot35.setRangeAxis(valueAxis45);
        org.jfree.chart.plot.PlotOrientation plotOrientation47 = categoryPlot35.getOrientation();
        xYPlot19.setOrientation(plotOrientation47);
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation18, plotOrientation47);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(collection28);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(valueAxis38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(collection41);
        org.junit.Assert.assertNotNull(plotOrientation47);
        org.junit.Assert.assertNotNull(rectangleEdge49);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.awt.Paint paint7 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] { valueAxis8 };
        categoryPlot4.setRangeAxes(valueAxisArray9);
        java.awt.Paint paint11 = categoryPlot4.getRangeGridlinePaint();
        float float12 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot13 = categoryPlot4.getRootPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot4.setRangeAxis(100, valueAxis15, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot4.setRenderer((int) '4', categoryItemRenderer19, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertArrayEquals(valueAxisArray9, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.util.List list7 = categoryPlot4.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer9);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint12 = null;
        xYPlot11.setDomainTickBandPaint(paint12);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot11.getRangeAxisEdge();
        java.awt.Stroke stroke15 = xYPlot11.getDomainGridlineStroke();
        categoryPlot4.setRangeGridlineStroke(stroke15);
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = categoryPlot4.getRangeMarkers((int) (byte) -1, layer18);
        categoryPlot4.clearRangeMarkers((int) (byte) 10);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        categoryPlot4.drawDomainGridlines(graphics2D22, rectangle2D23);
        categoryPlot4.setRangeCrosshairValue((double) '#', false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(collection19);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.util.List list7 = categoryPlot4.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer9);
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint12 = null;
        xYPlot11.setDomainTickBandPaint(paint12);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot11.getRangeAxisEdge();
        java.awt.Stroke stroke15 = xYPlot11.getDomainGridlineStroke();
        categoryPlot4.setRangeGridlineStroke(stroke15);
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot4.getRowRenderingOrder();
        categoryPlot4.setWeight((int) (short) 0);
        org.jfree.chart.plot.Plot plot20 = categoryPlot4.getRootPlot();
        org.jfree.chart.plot.Marker marker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = categoryPlot4.removeRangeMarker((int) (byte) 100, marker22, layer23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        int int10 = categoryPlot4.getDomainAxisCount();
        categoryPlot4.clearDomainMarkers(0);
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot4.getRangeAxis();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(valueAxis13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomRangeAxes(1.0d, plotRenderingInfo9, point2D10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot4.getDataset();
        categoryPlot4.clearRangeMarkers((int) '#');
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint16 = null;
        xYPlot15.setDomainTickBandPaint(paint16);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot15.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        xYPlot15.addChangeListener(plotChangeListener19);
        xYPlot15.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint25 = null;
        xYPlot24.setDomainTickBandPaint(paint25);
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = xYPlot24.getRangeAxisEdge();
        java.awt.Stroke stroke28 = xYPlot24.getDomainGridlineStroke();
        xYPlot24.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot24.getRangeAxisLocation();
        xYPlot15.setDomainAxisLocation((int) (byte) 1, axisLocation31);
        categoryPlot4.setDomainAxisLocation(axisLocation31);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.util.Layer layer37 = null;
        categoryPlot4.drawRangeMarkers(graphics2D34, rectangle2D35, (int) (short) 100, layer37);
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = categoryPlot4.getDomainAxisEdge((int) (short) 0);
        boolean boolean41 = categoryPlot4.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(rectangleEdge40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomRangeAxes(1.0d, plotRenderingInfo9, point2D10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot4.getDataset();
        boolean boolean14 = categoryPlot4.equals((java.lang.Object) 1.0d);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        categoryPlot4.drawDomainGridlines(graphics2D15, rectangle2D16);
        java.awt.Stroke stroke18 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Paint paint19 = categoryPlot4.getRangeCrosshairPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.awt.Stroke stroke7 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Paint paint8 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint10 = null;
        xYPlot9.setDomainTickBandPaint(paint10);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot9.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot9.addChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = xYPlot9.getRangeTickBandPaint();
        java.awt.Paint paint16 = xYPlot9.getDomainTickBandPaint();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.util.Layer layer27 = null;
        categoryPlot23.drawRangeMarkers(graphics2D24, rectangle2D25, (int) (short) -1, layer27);
        categoryPlot23.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke31 = categoryPlot23.getRangeCrosshairStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        java.util.List list33 = categoryPlot23.getCategoriesForAxis(categoryAxis32);
        xYPlot9.drawRangeGridlines(graphics2D17, rectangle2D18, list33);
        java.awt.Image image35 = null;
        xYPlot9.setBackgroundImage(image35);
        xYPlot9.configureDomainAxes();
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        xYPlot42.setRangeCrosshairValue((double) 1.0f);
        java.awt.Paint paint45 = xYPlot42.getDomainCrosshairPaint();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder46 = xYPlot42.getDatasetRenderingOrder();
        xYPlot9.setDatasetRenderingOrder(datasetRenderingOrder46);
        categoryPlot4.setDatasetRenderingOrder(datasetRenderingOrder46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(datasetRenderingOrder46);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.util.List list7 = categoryPlot4.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot4.setRenderer(categoryItemRenderer11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint16 = null;
        xYPlot15.setDomainTickBandPaint(paint16);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot15.getRangeAxisEdge();
        java.awt.Stroke stroke19 = xYPlot15.getDomainGridlineStroke();
        xYPlot15.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        boolean boolean23 = xYPlot15.isRangeZeroBaselineVisible();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis28, categoryItemRenderer29);
        boolean boolean31 = categoryPlot30.getDrawSharedDomainAxis();
        int int32 = categoryPlot30.getDatasetCount();
        java.util.List list33 = categoryPlot30.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot30.setRenderer((int) (byte) 0, categoryItemRenderer35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = categoryPlot30.getAxisOffset();
        categoryPlot30.setDrawSharedDomainAxis(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        categoryPlot30.setRenderer(categoryItemRenderer40, false);
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        org.jfree.chart.plot.XYPlot xYPlot45 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint46 = null;
        xYPlot45.setDomainTickBandPaint(paint46);
        org.jfree.chart.util.RectangleEdge rectangleEdge48 = xYPlot45.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        xYPlot45.addChangeListener(plotChangeListener49);
        java.awt.Paint paint51 = xYPlot45.getRangeTickBandPaint();
        java.awt.Paint paint52 = xYPlot45.getRangeZeroBaselinePaint();
        boolean boolean53 = xYPlot45.isRangeZeroBaselineVisible();
        java.lang.String str54 = xYPlot45.getPlotType();
        org.jfree.chart.util.RectangleEdge rectangleEdge56 = xYPlot45.getRangeAxisEdge(100);
        xYPlot45.setDomainCrosshairLockedOnData(false);
        java.awt.Graphics2D graphics2D59 = null;
        java.awt.geom.Rectangle2D rectangle2D60 = null;
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis62 = null;
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer64 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = new org.jfree.chart.plot.CategoryPlot(categoryDataset61, categoryAxis62, valueAxis63, categoryItemRenderer64);
        java.awt.Graphics2D graphics2D66 = null;
        java.awt.geom.Rectangle2D rectangle2D67 = null;
        org.jfree.chart.util.Layer layer69 = null;
        categoryPlot65.drawRangeMarkers(graphics2D66, rectangle2D67, (int) (short) -1, layer69);
        categoryPlot65.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D73 = null;
        java.awt.geom.Rectangle2D rectangle2D74 = null;
        org.jfree.chart.axis.AxisSpace axisSpace75 = null;
        org.jfree.chart.axis.AxisSpace axisSpace76 = categoryPlot65.calculateDomainAxisSpace(graphics2D73, rectangle2D74, axisSpace75);
        org.jfree.chart.axis.AxisSpace axisSpace77 = xYPlot45.calculateRangeAxisSpace(graphics2D59, rectangle2D60, axisSpace75);
        org.jfree.chart.axis.AxisSpace axisSpace78 = categoryPlot30.calculateRangeAxisSpace(graphics2D43, rectangle2D44, axisSpace77);
        org.jfree.chart.axis.AxisSpace axisSpace79 = xYPlot15.calculateDomainAxisSpace(graphics2D24, rectangle2D25, axisSpace77);
        org.jfree.chart.axis.AxisSpace axisSpace80 = categoryPlot4.calculateRangeAxisSpace(graphics2D13, rectangle2D14, axisSpace79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(list33);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(rectangleEdge48);
        org.junit.Assert.assertNull(paint51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "XY Plot" + "'", str54, "XY Plot");
        org.junit.Assert.assertNotNull(rectangleEdge56);
        org.junit.Assert.assertNotNull(axisSpace76);
        org.junit.Assert.assertNotNull(axisSpace77);
        org.junit.Assert.assertNotNull(axisSpace78);
        org.junit.Assert.assertNotNull(axisSpace79);
        org.junit.Assert.assertNotNull(axisSpace80);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke12 = categoryPlot4.getRangeCrosshairStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot4.getDataset((int) (byte) 10);
        categoryPlot4.configureRangeAxes();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot4.drawBackgroundImage(graphics2D16, rectangle2D17);
        int int19 = categoryPlot4.getWeight();
        java.util.List list20 = categoryPlot4.getAnnotations();
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot(xYDataset21, valueAxis22, valueAxis23, xYItemRenderer24);
        boolean boolean26 = xYPlot25.isRangeZoomable();
        int int27 = xYPlot25.getRangeAxisCount();
        org.jfree.chart.LegendItemCollection legendItemCollection28 = xYPlot25.getFixedLegendItems();
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint30 = null;
        xYPlot29.setDomainTickBandPaint(paint30);
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = xYPlot29.getRangeAxisEdge();
        java.awt.Stroke stroke33 = xYPlot29.getDomainGridlineStroke();
        xYPlot29.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot29.clearDomainMarkers();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.util.Layer layer41 = null;
        xYPlot29.drawDomainMarkers(graphics2D38, rectangle2D39, (int) (short) 1, layer41);
        boolean boolean43 = xYPlot29.isDomainCrosshairVisible();
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint47 = null;
        xYPlot46.setDomainTickBandPaint(paint47);
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = xYPlot46.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener50 = null;
        xYPlot46.addChangeListener(plotChangeListener50);
        xYPlot46.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint56 = null;
        xYPlot55.setDomainTickBandPaint(paint56);
        org.jfree.chart.util.RectangleEdge rectangleEdge58 = xYPlot55.getRangeAxisEdge();
        java.awt.Stroke stroke59 = xYPlot55.getDomainGridlineStroke();
        xYPlot55.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation62 = xYPlot55.getRangeAxisLocation();
        xYPlot46.setDomainAxisLocation((int) (byte) 1, axisLocation62);
        xYPlot46.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset66 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis67 = null;
        org.jfree.chart.axis.ValueAxis valueAxis68 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer69 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot70 = new org.jfree.chart.plot.CategoryPlot(categoryDataset66, categoryAxis67, valueAxis68, categoryItemRenderer69);
        categoryPlot70.mapDatasetToRangeAxis((int) ' ', (int) 'a');
        java.awt.Graphics2D graphics2D74 = null;
        java.awt.geom.Rectangle2D rectangle2D75 = null;
        org.jfree.data.category.CategoryDataset categoryDataset76 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis77 = null;
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer79 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot80 = new org.jfree.chart.plot.CategoryPlot(categoryDataset76, categoryAxis77, valueAxis78, categoryItemRenderer79);
        java.awt.Graphics2D graphics2D81 = null;
        java.awt.geom.Rectangle2D rectangle2D82 = null;
        org.jfree.chart.util.Layer layer84 = null;
        categoryPlot80.drawRangeMarkers(graphics2D81, rectangle2D82, (int) (short) -1, layer84);
        categoryPlot80.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D88 = null;
        java.awt.geom.Rectangle2D rectangle2D89 = null;
        org.jfree.chart.axis.AxisSpace axisSpace90 = null;
        org.jfree.chart.axis.AxisSpace axisSpace91 = categoryPlot80.calculateDomainAxisSpace(graphics2D88, rectangle2D89, axisSpace90);
        org.jfree.chart.axis.AxisSpace axisSpace92 = categoryPlot70.calculateRangeAxisSpace(graphics2D74, rectangle2D75, axisSpace90);
        xYPlot46.setFixedDomainAxisSpace(axisSpace92, true);
        org.jfree.chart.axis.AxisSpace axisSpace95 = xYPlot29.calculateRangeAxisSpace(graphics2D44, rectangle2D45, axisSpace92);
        xYPlot25.setFixedRangeAxisSpace(axisSpace95);
        categoryPlot4.setFixedRangeAxisSpace(axisSpace95);
        boolean boolean98 = categoryPlot4.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(rectangleEdge32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rectangleEdge49);
        org.junit.Assert.assertNotNull(rectangleEdge58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(axisLocation62);
        org.junit.Assert.assertNotNull(axisSpace91);
        org.junit.Assert.assertNotNull(axisSpace92);
        org.junit.Assert.assertNotNull(axisSpace95);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.util.List list7 = categoryPlot4.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer9);
        java.awt.Font font11 = categoryPlot4.getNoDataMessageFont();
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint16 = null;
        xYPlot15.setDomainTickBandPaint(paint16);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot15.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        xYPlot15.addChangeListener(plotChangeListener19);
        xYPlot15.setBackgroundAlpha((float) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = xYPlot15.getLegendItems();
        categoryPlot4.setFixedLegendItems(legendItemCollection23);
        categoryPlot4.setNoDataMessage("");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        categoryPlot4.notifyListeners(plotChangeEvent27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis33, valueAxis34, categoryItemRenderer35);
        boolean boolean37 = categoryPlot36.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis39 = categoryPlot36.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        categoryPlot36.zoomRangeAxes(1.0d, plotRenderingInfo41, point2D42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = categoryPlot36.getDataset();
        java.awt.Stroke stroke45 = categoryPlot36.getRangeCrosshairStroke();
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint47 = null;
        xYPlot46.setDomainTickBandPaint(paint47);
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = xYPlot46.getRangeAxisEdge();
        java.awt.Stroke stroke50 = xYPlot46.getDomainGridlineStroke();
        boolean boolean51 = xYPlot46.isDomainGridlinesVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge52 = xYPlot46.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset53 = null;
        xYPlot46.setDataset(xYDataset53);
        java.awt.Paint paint55 = xYPlot46.getDomainZeroBaselinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = null;
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot60 = new org.jfree.chart.plot.CategoryPlot(categoryDataset56, categoryAxis57, valueAxis58, categoryItemRenderer59);
        java.awt.Graphics2D graphics2D61 = null;
        java.awt.geom.Rectangle2D rectangle2D62 = null;
        org.jfree.chart.util.Layer layer64 = null;
        categoryPlot60.drawRangeMarkers(graphics2D61, rectangle2D62, (int) (short) -1, layer64);
        categoryPlot60.setBackgroundAlpha((float) 100L);
        org.jfree.chart.axis.CategoryAxis categoryAxis69 = categoryPlot60.getDomainAxisForDataset((int) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis71 = null;
        org.jfree.chart.axis.ValueAxis valueAxis72 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer73 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot(categoryDataset70, categoryAxis71, valueAxis72, categoryItemRenderer73);
        boolean boolean75 = categoryPlot74.getDrawSharedDomainAxis();
        int int76 = categoryPlot74.getDatasetCount();
        java.util.List list77 = categoryPlot74.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer79 = null;
        categoryPlot74.setRenderer((int) (byte) 0, categoryItemRenderer79);
        org.jfree.chart.util.RectangleInsets rectangleInsets81 = categoryPlot74.getAxisOffset();
        categoryPlot74.setDrawSharedDomainAxis(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer84 = null;
        categoryPlot74.setRenderer(categoryItemRenderer84, false);
        org.jfree.chart.axis.AxisLocation axisLocation88 = categoryPlot74.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder89 = categoryPlot74.getDatasetRenderingOrder();
        categoryPlot60.setDatasetRenderingOrder(datasetRenderingOrder89);
        xYPlot46.setDatasetRenderingOrder(datasetRenderingOrder89);
        java.awt.Paint paint92 = xYPlot46.getRangeZeroBaselinePaint();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawRangeLine(graphics2D29, rectangle2D30, (double) (byte) 1, stroke45, paint92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNull(categoryDataset44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(rectangleEdge49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(rectangleEdge52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNull(categoryAxis69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(list77);
        org.junit.Assert.assertNotNull(rectangleInsets81);
        org.junit.Assert.assertNotNull(axisLocation88);
        org.junit.Assert.assertNotNull(datasetRenderingOrder89);
        org.junit.Assert.assertNotNull(paint92);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        xYPlot0.setBackgroundAlpha((float) 1);
        java.awt.Paint paint8 = xYPlot0.getDomainZeroBaselinePaint();
        xYPlot0.setDomainCrosshairVisible(false);
        java.awt.geom.Point2D point2D11 = xYPlot0.getQuadrantOrigin();
        xYPlot0.setDomainCrosshairValue(0.0d, false);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.util.Layer layer23 = null;
        categoryPlot19.drawRangeMarkers(graphics2D20, rectangle2D21, (int) (short) -1, layer23);
        categoryPlot19.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        org.jfree.chart.axis.AxisSpace axisSpace30 = categoryPlot19.calculateDomainAxisSpace(graphics2D27, rectangle2D28, axisSpace29);
        xYPlot0.setFixedRangeAxisSpace(axisSpace29, false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        xYPlot0.notifyListeners(plotChangeEvent33);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(point2D11);
        org.junit.Assert.assertNotNull(axisSpace30);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomRangeAxes(1.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot4.setRenderer(10, categoryItemRenderer13, false);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot4.getDomainAxisEdge(0);
        categoryPlot4.setRangeCrosshairValue((double) '4', false);
        java.awt.Image image21 = null;
        categoryPlot4.setBackgroundImage(image21);
        org.jfree.chart.plot.XYPlot xYPlot23 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint24 = null;
        xYPlot23.setDomainTickBandPaint(paint24);
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = xYPlot23.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        xYPlot23.addChangeListener(plotChangeListener27);
        xYPlot23.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint33 = null;
        xYPlot32.setDomainTickBandPaint(paint33);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = xYPlot32.getRangeAxisEdge();
        java.awt.Stroke stroke36 = xYPlot32.getDomainGridlineStroke();
        xYPlot32.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation39 = xYPlot32.getRangeAxisLocation();
        xYPlot23.setDomainAxisLocation((int) (byte) 1, axisLocation39);
        xYPlot23.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis44, valueAxis45, categoryItemRenderer46);
        categoryPlot47.mapDatasetToRangeAxis((int) ' ', (int) 'a');
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer56 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot(categoryDataset53, categoryAxis54, valueAxis55, categoryItemRenderer56);
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        org.jfree.chart.util.Layer layer61 = null;
        categoryPlot57.drawRangeMarkers(graphics2D58, rectangle2D59, (int) (short) -1, layer61);
        categoryPlot57.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D65 = null;
        java.awt.geom.Rectangle2D rectangle2D66 = null;
        org.jfree.chart.axis.AxisSpace axisSpace67 = null;
        org.jfree.chart.axis.AxisSpace axisSpace68 = categoryPlot57.calculateDomainAxisSpace(graphics2D65, rectangle2D66, axisSpace67);
        org.jfree.chart.axis.AxisSpace axisSpace69 = categoryPlot47.calculateRangeAxisSpace(graphics2D51, rectangle2D52, axisSpace67);
        xYPlot23.setFixedDomainAxisSpace(axisSpace69, true);
        categoryPlot4.setFixedRangeAxisSpace(axisSpace69);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer73 = categoryPlot4.getRenderer();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(axisLocation39);
        org.junit.Assert.assertNotNull(axisSpace68);
        org.junit.Assert.assertNotNull(axisSpace69);
        org.junit.Assert.assertNull(categoryItemRenderer73);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        int int10 = categoryPlot4.getDomainAxisCount();
        java.awt.Stroke stroke11 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot4.mapDatasetToDomainAxis(10, (int) (short) 10);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = categoryPlot4.removeRangeMarker(0, marker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke12 = categoryPlot4.getRangeCrosshairStroke();
        categoryPlot4.setWeight((int) (short) 10);
        categoryPlot4.setRangeCrosshairValue((double) (byte) 10, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        int int19 = categoryPlot4.getIndexOf(categoryItemRenderer18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        categoryPlot4.drawAnnotations(graphics2D20, rectangle2D21, plotRenderingInfo22);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = categoryPlot4.getAxisOffset();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot4.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(axisLocation26);
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
        xYPlot4.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer7 = null;
        int int8 = xYPlot4.getIndexOf(xYItemRenderer7);
        java.awt.Paint paint9 = xYPlot4.getDomainZeroBaselinePaint();
        java.util.List list10 = xYPlot4.getAnnotations();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xYPlot4.removeAnnotation(xYAnnotation11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        java.awt.Paint paint14 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        int int16 = xYPlot0.getDomainAxisIndex(valueAxis15);
        org.jfree.data.xy.XYDataset xYDataset17 = xYPlot0.getDataset();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        boolean boolean25 = categoryPlot24.getDrawSharedDomainAxis();
        int int26 = categoryPlot24.getDatasetCount();
        java.util.List list27 = categoryPlot24.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot24.setRenderer((int) (byte) 0, categoryItemRenderer29);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = categoryPlot24.getRenderer((int) ' ');
        boolean boolean33 = categoryPlot24.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        java.util.List list35 = categoryPlot24.getCategoriesForAxis(categoryAxis34);
        xYPlot0.drawDomainTickBands(graphics2D18, rectangle2D19, list35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.util.Layer layer45 = null;
        categoryPlot41.drawRangeMarkers(graphics2D42, rectangle2D43, (int) (short) -1, layer45);
        categoryPlot41.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke49 = categoryPlot41.getRangeCrosshairStroke();
        org.jfree.data.category.CategoryDataset categoryDataset51 = categoryPlot41.getDataset((int) (byte) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer52 = categoryPlot41.getRenderer();
        org.jfree.data.xy.XYDataset xYDataset54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = null;
        org.jfree.chart.plot.XYPlot xYPlot58 = new org.jfree.chart.plot.XYPlot(xYDataset54, valueAxis55, valueAxis56, xYItemRenderer57);
        xYPlot58.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint63 = null;
        xYPlot62.setDomainTickBandPaint(paint63);
        org.jfree.chart.util.RectangleEdge rectangleEdge65 = xYPlot62.getRangeAxisEdge();
        java.awt.Stroke stroke66 = xYPlot62.getDomainGridlineStroke();
        xYPlot62.setForegroundAlpha(10.0f);
        org.jfree.chart.axis.AxisLocation axisLocation70 = xYPlot62.getDomainAxisLocation((int) (short) 10);
        xYPlot58.setRangeAxisLocation((int) (short) 0, axisLocation70, false);
        categoryPlot41.setRangeAxisLocation(100, axisLocation70);
        xYPlot0.setDomainAxisLocation(axisLocation70, false);
        org.jfree.chart.axis.ValueAxis valueAxis76 = null;
        org.jfree.data.Range range77 = xYPlot0.getDataRange(valueAxis76);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(xYDataset17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(list27);
        org.junit.Assert.assertNull(categoryItemRenderer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNull(categoryDataset51);
        org.junit.Assert.assertNull(categoryItemRenderer52);
        org.junit.Assert.assertNotNull(rectangleEdge65);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(axisLocation70);
        org.junit.Assert.assertNull(range77);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        int int6 = categoryPlot4.getDatasetCount();
        java.awt.Paint paint7 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] { valueAxis8 };
        categoryPlot4.setRangeAxes(valueAxisArray9);
        java.awt.Paint paint11 = categoryPlot4.getRangeGridlinePaint();
        float float12 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot13 = categoryPlot4.getRootPlot();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot4.getRangeAxisLocation((int) (byte) 100);
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint17 = null;
        xYPlot16.setDomainTickBandPaint(paint17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot16.getRangeAxisEdge();
        java.awt.Stroke stroke20 = xYPlot16.getDomainGridlineStroke();
        xYPlot16.setRangeZeroBaselineVisible(false);
        java.awt.Paint paint23 = xYPlot16.getRangeCrosshairPaint();
        categoryPlot4.setOutlinePaint(paint23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawOutline(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertArrayEquals(valueAxisArray9, new org.jfree.chart.axis.ValueAxis[] { null });
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint23);
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
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        xYPlot4.drawBackgroundImage(graphics2D5, rectangle2D6);
        xYPlot4.setDomainCrosshairLockedOnData(true);
        double double10 = xYPlot4.getDomainCrosshairValue();
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint12 = null;
        xYPlot11.setDomainTickBandPaint(paint12);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = xYPlot11.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        xYPlot11.addChangeListener(plotChangeListener15);
        java.awt.Paint paint17 = xYPlot11.getRangeTickBandPaint();
        java.awt.Paint paint18 = xYPlot11.getRangeZeroBaselinePaint();
        boolean boolean19 = xYPlot11.isRangeZeroBaselineVisible();
        java.awt.Paint paint20 = xYPlot11.getRangeGridlinePaint();
        xYPlot4.setRangeCrosshairPaint(paint20);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        xYPlot0.setBackgroundAlpha((float) 1);
        java.awt.Paint paint8 = xYPlot0.getDomainZeroBaselinePaint();
        xYPlot0.setDomainCrosshairVisible(false);
        java.awt.geom.Point2D point2D11 = xYPlot0.getQuadrantOrigin();
        xYPlot0.setRangeZeroBaselineVisible(true);
        boolean boolean14 = xYPlot0.isDomainCrosshairLockedOnData();
        boolean boolean15 = xYPlot0.isDomainCrosshairLockedOnData();
        java.awt.Stroke stroke16 = xYPlot0.getRangeCrosshairStroke();
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = xYPlot0.getRangeMarkers((int) (byte) 100, layer18);
        org.jfree.chart.plot.Marker marker20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot0.addDomainMarker(marker20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(point2D11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(collection19);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        java.awt.Paint paint14 = xYPlot0.getDomainZeroBaselinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        int int16 = xYPlot0.getDomainAxisIndex(valueAxis15);
        org.jfree.data.xy.XYDataset xYDataset17 = xYPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot0.setRangeAxis((int) (byte) 10, valueAxis19);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = xYPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(xYDataset17);
        org.junit.Assert.assertNotNull(legendItemCollection21);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setDomainCrosshairVisible(false);
        org.jfree.data.xy.XYDataset xYDataset7 = xYPlot0.getDataset();
        java.awt.Paint paint8 = xYPlot0.getDomainCrosshairPaint();
        java.awt.Paint paint9 = xYPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(xYDataset7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomRangeAxes(1.0d, plotRenderingInfo9, point2D10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot4.getDataset();
        categoryPlot4.clearRangeMarkers((int) '#');
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot4.getRangeAxis();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.util.Layer layer12 = null;
        xYPlot0.drawDomainMarkers(graphics2D9, rectangle2D10, (int) (short) 1, layer12);
        boolean boolean14 = xYPlot0.isDomainCrosshairVisible();
        int int15 = xYPlot0.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        boolean boolean22 = categoryPlot21.getDrawSharedDomainAxis();
        int int23 = categoryPlot21.getDatasetCount();
        java.util.List list24 = categoryPlot21.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot21.setRenderer((int) (byte) 0, categoryItemRenderer26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot21.getAxisOffset();
        categoryPlot21.setDrawSharedDomainAxis(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot21.setRenderer(categoryItemRenderer31, false);
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot21.getRangeAxisLocation((int) (byte) 10);
        xYPlot0.setRangeAxisLocation(0, axisLocation35, true);
        java.awt.Paint paint38 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.setBackgroundImageAlignment((-1));
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint42 = null;
        xYPlot41.setDomainTickBandPaint(paint42);
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = xYPlot41.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener45 = null;
        xYPlot41.addChangeListener(plotChangeListener45);
        java.awt.Paint paint47 = xYPlot41.getRangeTickBandPaint();
        xYPlot41.configureRangeAxes();
        boolean boolean49 = xYPlot41.isDomainZoomable();
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint51 = null;
        xYPlot50.setDomainTickBandPaint(paint51);
        org.jfree.chart.util.RectangleEdge rectangleEdge53 = xYPlot50.getRangeAxisEdge();
        java.awt.Stroke stroke54 = xYPlot50.getDomainGridlineStroke();
        org.jfree.chart.util.Layer layer55 = null;
        java.util.Collection collection56 = xYPlot50.getRangeMarkers(layer55);
        java.awt.Paint paint57 = xYPlot50.getRangeGridlinePaint();
        java.awt.Stroke stroke58 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        xYPlot50.setRangeGridlineStroke(stroke58);
        xYPlot41.setOutlineStroke(stroke58);
        xYPlot0.setDomainCrosshairStroke(stroke58);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder62 = xYPlot0.getSeriesRenderingOrder();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(rectangleEdge44);
        org.junit.Assert.assertNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(rectangleEdge53);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNull(collection56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNotNull(seriesRenderingOrder62);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.setDomainCrosshairVisible(false);
        int int7 = xYPlot0.getSeriesCount();
        boolean boolean8 = xYPlot0.isRangeCrosshairLockedOnData();
        xYPlot0.setRangeZeroBaselineVisible(false);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.util.Layer layer20 = null;
        categoryPlot16.drawRangeMarkers(graphics2D17, rectangle2D18, (int) (short) -1, layer20);
        int int22 = categoryPlot16.getDomainAxisCount();
        java.awt.Stroke stroke23 = categoryPlot16.getDomainGridlineStroke();
        categoryPlot4.setDomainGridlineStroke(stroke23);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot4.getRangeAxisEdge();
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot4.getDomainMarkers(layer27);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot4.setRenderer(categoryItemRenderer29);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNull(collection28);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        java.awt.Stroke stroke12 = categoryPlot4.getRangeCrosshairStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot4.getDataset((int) (byte) 10);
        categoryPlot4.configureRangeAxes();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot4.drawBackgroundImage(graphics2D16, rectangle2D17);
        categoryPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot4.getRangeMarkers((int) 'a', layer22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot4.setDataset((int) 'a', categoryDataset25);
        categoryPlot4.setDrawSharedDomainAxis(true);
        categoryPlot4.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        int int8 = categoryPlot4.getDatasetCount();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint10 = null;
        xYPlot9.setDomainTickBandPaint(paint10);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot9.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot9.addChangeListener(plotChangeListener13);
        xYPlot9.setBackgroundAlpha((float) 1);
        java.awt.Paint paint17 = xYPlot9.getDomainZeroBaselinePaint();
        categoryPlot4.setDomainGridlinePaint(paint17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace19, true);
        categoryPlot4.setDrawSharedDomainAxis(true);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.data.Range range26 = categoryPlot4.getDataRange(valueAxis25);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor27 = categoryPlot4.getDomainGridlinePosition();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertNotNull(categoryAnchor27);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke4 = xYPlot0.getDomainGridlineStroke();
        xYPlot0.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint10 = null;
        xYPlot9.setDomainTickBandPaint(paint10);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot9.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot9.addChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = xYPlot9.getRangeTickBandPaint();
        java.awt.Paint paint16 = xYPlot9.getRangeZeroBaselinePaint();
        boolean boolean17 = xYPlot9.isRangeZeroBaselineVisible();
        xYPlot9.mapDatasetToDomainAxis((int) '4', (int) (byte) 10);
        java.awt.Stroke stroke21 = xYPlot9.getRangeZeroBaselineStroke();
        java.awt.Paint paint22 = xYPlot9.getRangeGridlinePaint();
        xYPlot0.setNoDataMessagePaint(paint22);
        xYPlot0.setDomainCrosshairValue((double) (byte) 0, false);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot0.setRangeTickBandPaint(paint27);
        xYPlot0.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        boolean boolean35 = categoryPlot34.getDrawSharedDomainAxis();
        int int36 = categoryPlot34.getDatasetCount();
        java.util.List list37 = categoryPlot34.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        categoryPlot34.setRenderer((int) (byte) 0, categoryItemRenderer39);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = categoryPlot34.getRenderer((int) ' ');
        boolean boolean43 = categoryPlot34.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        java.util.List list45 = categoryPlot34.getCategoriesForAxis(categoryAxis44);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot(categoryDataset48, categoryAxis49, valueAxis50, categoryItemRenderer51);
        java.awt.Graphics2D graphics2D53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        org.jfree.chart.util.Layer layer56 = null;
        categoryPlot52.drawRangeMarkers(graphics2D53, rectangle2D54, (int) (short) -1, layer56);
        categoryPlot52.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        org.jfree.chart.axis.AxisSpace axisSpace62 = null;
        org.jfree.chart.axis.AxisSpace axisSpace63 = categoryPlot52.calculateDomainAxisSpace(graphics2D60, rectangle2D61, axisSpace62);
        org.jfree.chart.axis.AxisSpace axisSpace64 = categoryPlot34.calculateRangeAxisSpace(graphics2D46, rectangle2D47, axisSpace63);
        xYPlot0.setFixedDomainAxisSpace(axisSpace63, true);
        xYPlot0.setWeight((int) (byte) 100);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(list37);
        org.junit.Assert.assertNull(categoryItemRenderer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(axisSpace63);
        org.junit.Assert.assertNotNull(axisSpace64);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.configureRangeAxes();
        boolean boolean8 = xYPlot0.isDomainZoomable();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        categoryPlot14.mapDatasetToRangeAxis((int) ' ', (int) 'a');
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.util.Layer layer28 = null;
        categoryPlot24.drawRangeMarkers(graphics2D25, rectangle2D26, (int) (short) -1, layer28);
        categoryPlot24.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        org.jfree.chart.axis.AxisSpace axisSpace34 = null;
        org.jfree.chart.axis.AxisSpace axisSpace35 = categoryPlot24.calculateDomainAxisSpace(graphics2D32, rectangle2D33, axisSpace34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = categoryPlot14.calculateRangeAxisSpace(graphics2D18, rectangle2D19, axisSpace34);
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot14.getDomainAxisLocation((int) (byte) -1);
        xYPlot0.setRangeAxisLocation((int) (byte) 0, axisLocation38);
        xYPlot0.setDomainZeroBaselineVisible(false);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(axisSpace35);
        org.junit.Assert.assertNotNull(axisSpace36);
        org.junit.Assert.assertNotNull(axisLocation38);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomRangeAxes(1.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot4.setRenderer(10, categoryItemRenderer13, false);
        categoryPlot4.setDrawSharedDomainAxis(true);
        categoryPlot4.clearRangeAxes();
        categoryPlot4.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint22 = null;
        xYPlot21.setDomainTickBandPaint(paint22);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = xYPlot21.getRangeAxisEdge();
        java.awt.Stroke stroke25 = xYPlot21.getDomainGridlineStroke();
        xYPlot21.mapDatasetToRangeAxis((int) (byte) -1, (int) (byte) 1);
        xYPlot21.clearDomainMarkers();
        xYPlot21.clearDomainMarkers((int) (short) 1);
        org.jfree.chart.axis.ValueAxis valueAxis32 = xYPlot21.getRangeAxis();
        org.jfree.data.general.DatasetGroup datasetGroup33 = xYPlot21.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis35, valueAxis36, categoryItemRenderer37);
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.util.Layer layer42 = null;
        categoryPlot38.drawRangeMarkers(graphics2D39, rectangle2D40, (int) (short) -1, layer42);
        categoryPlot38.setBackgroundAlpha((float) 100L);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        org.jfree.chart.axis.AxisSpace axisSpace48 = null;
        org.jfree.chart.axis.AxisSpace axisSpace49 = categoryPlot38.calculateDomainAxisSpace(graphics2D46, rectangle2D47, axisSpace48);
        xYPlot21.setFixedDomainAxisSpace(axisSpace48, true);
        boolean boolean52 = xYPlot21.isDomainCrosshairVisible();
        java.awt.Paint paint53 = xYPlot21.getRangeZeroBaselinePaint();
        categoryPlot4.setDomainGridlinePaint(paint53);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = null;
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis56, valueAxis57, categoryItemRenderer58);
        boolean boolean60 = categoryPlot59.getDrawSharedDomainAxis();
        int int61 = categoryPlot59.getDatasetCount();
        java.awt.Paint paint62 = categoryPlot59.getRangeCrosshairPaint();
        int int63 = categoryPlot59.getWeight();
        org.jfree.chart.axis.CategoryAxis categoryAxis65 = categoryPlot59.getDomainAxisForDataset(0);
        java.awt.Stroke stroke66 = categoryPlot59.getOutlineStroke();
        categoryPlot4.setDomainGridlineStroke(stroke66);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertNotNull(axisSpace49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(categoryAxis65);
        org.junit.Assert.assertNotNull(stroke66);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        xYPlot0.configureRangeAxes();
        boolean boolean8 = xYPlot0.isDomainZoomable();
        org.jfree.chart.plot.XYPlot xYPlot9 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint10 = null;
        xYPlot9.setDomainTickBandPaint(paint10);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = xYPlot9.getRangeAxisEdge();
        java.awt.Stroke stroke13 = xYPlot9.getDomainGridlineStroke();
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = xYPlot9.getRangeMarkers(layer14);
        java.awt.Paint paint16 = xYPlot9.getRangeGridlinePaint();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        xYPlot9.setRangeGridlineStroke(stroke17);
        xYPlot0.setOutlineStroke(stroke17);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot0.getRangeAxis(10);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        xYPlot0.drawAnnotations(graphics2D22, rectangle2D23, plotRenderingInfo24);
        int int26 = xYPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        java.awt.Paint paint1 = null;
        xYPlot0.setDomainTickBandPaint(paint1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = xYPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        xYPlot0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = xYPlot0.getRangeTickBandPaint();
        java.awt.Paint paint7 = xYPlot0.getRangeZeroBaselinePaint();
        boolean boolean8 = xYPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot0.getRenderer((int) (byte) 100);
        java.awt.geom.Point2D point2D11 = xYPlot0.getQuadrantOrigin();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot0.getRendererForDataset(xYDataset12);
        java.awt.Paint paint14 = xYPlot0.getRangeTickBandPaint();
        java.awt.Stroke stroke15 = xYPlot0.getRangeGridlineStroke();
        int int16 = xYPlot0.getWeight();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = xYPlot0.getRenderer();
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(point2D11);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(xYItemRenderer17);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.Layer layer8 = null;
        categoryPlot4.drawRangeMarkers(graphics2D5, rectangle2D6, (int) (short) -1, layer8);
        categoryPlot4.setBackgroundAlpha((float) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.util.Layer layer20 = null;
        categoryPlot16.drawRangeMarkers(graphics2D17, rectangle2D18, (int) (short) -1, layer20);
        int int22 = categoryPlot16.getDomainAxisCount();
        java.awt.Stroke stroke23 = categoryPlot16.getDomainGridlineStroke();
        categoryPlot4.setDomainGridlineStroke(stroke23);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot4.getRangeAxisEdge();
        categoryPlot4.setAnchorValue((double) (byte) 0, false);
        int int30 = categoryPlot4.getRangeAxisCount();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }
}

