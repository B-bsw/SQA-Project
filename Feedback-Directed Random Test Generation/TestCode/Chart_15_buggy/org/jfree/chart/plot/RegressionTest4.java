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
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        java.awt.Image image20 = null;
        piePlot1.setBackgroundImage(image20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        java.awt.Image image27 = null;
        piePlot23.setBackgroundImage(image27);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator29 = null;
        piePlot23.setToolTipGenerator(pieToolTipGenerator29);
        java.awt.Paint paint31 = piePlot23.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot23.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        boolean boolean38 = piePlot34.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot39 = piePlot34.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent40 = null;
        piePlot34.axisChanged(axisChangeEvent40);
        java.lang.String str42 = piePlot34.getNoDataMessage();
        java.awt.Image image43 = null;
        piePlot34.setBackgroundImage(image43);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        double double47 = piePlot46.getShadowYOffset();
        java.awt.Stroke stroke49 = piePlot46.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot46.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        piePlot53.setIgnoreNullValues(true);
        java.awt.Paint paint56 = piePlot53.getLabelPaint();
        java.awt.Image image57 = null;
        piePlot53.setBackgroundImage(image57);
        java.awt.Paint paint59 = piePlot53.getLabelShadowPaint();
        piePlot53.setLabelGap(0.0d);
        java.awt.Paint paint62 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot53.setLabelLinkPaint(paint62);
        piePlot46.setLabelPaint(paint62);
        piePlot34.setLabelLinkPaint(paint62);
        piePlot23.setOutlinePaint(paint62);
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = piePlot23.getLabelPadding();
        piePlot1.setSimpleLabelOffset(rectangleInsets67);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(plot39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4.0d + "'", double47 == 4.0d);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(rectangleInsets67);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        piePlot1.setOutlineVisible(false);
        float float7 = piePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot17.getSimpleLabelOffset();
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot17.setNoDataMessageFont(font22);
        piePlot1.setLabelFont(font22);
        boolean boolean25 = piePlot1.getIgnoreNullValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot1.getInsets();
        boolean boolean27 = piePlot1.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D28 = null;
        java.util.List list29 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.plot.PiePlotState piePlotState33 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D28, list29, (double) 0.0f, rectangle2D31, rectangle2D32, piePlotState33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.isCircular();
        boolean boolean13 = piePlot1.getIgnoreZeroValues();
        double double14 = piePlot1.getShadowYOffset();
        java.awt.Paint paint15 = piePlot1.getNoDataMessagePaint();
        double double16 = piePlot1.getShadowXOffset();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.plot.PlotState plotState20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D17, rectangle2D18, point2D19, plotState20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        piePlot1.removeChangeListener(plotChangeListener32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        java.awt.Image image39 = null;
        piePlot35.setBackgroundImage(image39);
        java.awt.Paint paint41 = piePlot35.getLabelShadowPaint();
        piePlot35.setShadowXOffset(90.0d);
        piePlot35.setForegroundAlpha(10.0f);
        piePlot35.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = piePlot35.getLabelPadding();
        piePlot1.setInsets(rectangleInsets49);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot1.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(rectangleInsets51);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.removeChangeListener(plotChangeListener10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNull(pieURLGenerator12);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot1.getDatasetGroup();
        piePlot1.setLabelGap(100.0d);
        double double12 = piePlot1.getMinimumArcAngleToDraw();
        piePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot1.setURLGenerator(pieURLGenerator16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        piePlot19.datasetChanged(datasetChangeEvent23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot26.handleClick((int) (byte) 0, 100, plotRenderingInfo31);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        piePlot26.setLabelBackgroundPaint(paint37);
        piePlot19.setLabelShadowPaint(paint37);
        java.awt.Stroke stroke40 = piePlot19.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = piePlot19.getDrawingSupplier();
        java.awt.Stroke stroke43 = piePlot19.lookupSectionOutlineStroke((java.lang.Comparable) (short) 100);
        piePlot1.setLabelOutlineStroke(stroke43);
        piePlot1.setStartAngle((double) 100.0f);
        java.lang.Comparable comparable48 = piePlot1.getSectionKey((int) ' ');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertEquals("'" + comparable48 + "' != '" + 32 + "'", comparable48, 32);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        piePlot1.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke26 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint27 = piePlot1.getOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = piePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot16.setDataset(pieDataset23);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot16);
        boolean boolean26 = piePlot16.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent32 = null;
        piePlot28.datasetChanged(datasetChangeEvent32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot28.getLabelPadding();
        piePlot16.setInsets(rectangleInsets34, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot16.getLabelPadding();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(rectangleInsets37);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot11.getSimpleLabelOffset();
        java.awt.Paint paint16 = piePlot11.getLabelBackgroundPaint();
        double double17 = piePlot11.getStartAngle();
        piePlot11.setCircular(true, false);
        piePlot11.setShadowXOffset(0.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot11.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        piePlot1.setDataset(pieDataset25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 90.0d + "'", double17 == 90.0d);
        org.junit.Assert.assertNotNull(drawingSupplier23);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        java.awt.Paint paint23 = piePlot14.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        piePlot1.setForegroundAlpha((float) '#');
        double double28 = piePlot1.getMaximumLabelWidth();
        int int29 = piePlot1.getPieIndex();
        boolean boolean30 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        piePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot32.getSimpleLabelOffset();
        java.awt.Font font37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot32.setNoDataMessageFont(font37);
        boolean boolean39 = piePlot32.getSectionOutlinesVisible();
        boolean boolean40 = piePlot32.getSimpleLabels();
        piePlot32.setExplodePercent((java.lang.Comparable) 97, 90.0d);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        java.awt.Stroke stroke47 = null;
        piePlot45.setSectionOutlineStroke((java.lang.Comparable) '#', stroke47);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent49 = null;
        piePlot45.axisChanged(axisChangeEvent49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = piePlot45.getDrawingSupplier();
        piePlot32.setDrawingSupplier(drawingSupplier51);
        piePlot1.setDrawingSupplier(drawingSupplier51);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0E-5d + "'", double33 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(drawingSupplier51);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke15 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot17.datasetChanged(datasetChangeEvent21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot24.handleClick((int) (byte) 0, 100, plotRenderingInfo29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        piePlot24.setLabelBackgroundPaint(paint35);
        piePlot17.setLabelShadowPaint(paint35);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot17);
        java.awt.Stroke stroke40 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) true);
        double double41 = piePlot17.getShadowXOffset();
        java.awt.Stroke stroke43 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetGroup datasetGroup44 = piePlot17.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNull(datasetGroup44);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        java.awt.Stroke stroke39 = piePlot24.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = null;
        piePlot24.setURLGenerator(pieURLGenerator40);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot1.getLegendLabelToolTipGenerator();
        piePlot1.setBackgroundImageAlpha(1.0f);
        double double11 = piePlot1.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot1.handleClick(35, (int) (byte) 0, plotRenderingInfo14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        piePlot1.setLabelGap((double) 10.0f);
        piePlot1.setLabelLinksVisible(true);
        double double14 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        piePlot16.datasetChanged(datasetChangeEvent20);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        piePlot16.addChangeListener(plotChangeListener22);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot16.getLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot1.setSimpleLabelOffset(rectangleInsets16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        java.awt.Paint paint25 = piePlot19.getLabelShadowPaint();
        piePlot19.setShadowXOffset(90.0d);
        piePlot19.setForegroundAlpha(10.0f);
        piePlot19.setCircular(true, false);
        double double33 = piePlot19.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot19.getLabelDistributor();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot19);
        java.awt.Font font36 = piePlot19.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = piePlot19.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.0d + "'", double33 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNull(pieURLGenerator37);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint6 = piePlot1.getSectionPaint((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setShadowXOffset(90.0d);
        piePlot8.setForegroundAlpha(10.0f);
        piePlot8.setCircular(true, false);
        java.awt.Paint paint22 = piePlot8.getLabelPaint();
        piePlot1.setShadowPaint(paint22);
        java.awt.Stroke stroke25 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint29 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (short) 100, true);
        java.awt.Paint paint31 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) (-1.0d));
        piePlot1.setStartAngle((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(paint31);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot1.getLabelDistributor();
        boolean boolean17 = piePlot1.getLabelLinksVisible();
        piePlot1.setCircular(false);
        piePlot1.setBackgroundImageAlignment(1);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot1.setDataset(pieDataset22);
        java.awt.Paint paint24 = piePlot1.getShadowPaint();
        java.awt.Stroke stroke25 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot1.getInsets();
        piePlot1.setStartAngle(1.0E-5d);
        int int16 = piePlot1.getPieIndex();
        org.jfree.chart.plot.Plot plot17 = piePlot1.getRootPlot();
        java.awt.Stroke stroke18 = piePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        int int8 = piePlot1.getPieIndex();
        piePlot1.setCircular(true);
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) '4');
        java.awt.Paint paint13 = piePlot1.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLegendLabelToolTipGenerator();
        piePlot1.setLabelGap((double) 10.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieSectionLabelGenerator14);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot17.getSimpleLabelOffset();
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot17.setNoDataMessageFont(font22);
        piePlot1.setLabelFont(font22);
        boolean boolean25 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint26 = piePlot1.getLabelOutlinePaint();
        java.awt.Paint paint27 = piePlot1.getShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setForegroundAlpha((float) 1);
        piePlot1.setCircular(false);
        piePlot1.setLabelLinksVisible(true);
        java.awt.Stroke stroke13 = null;
        piePlot1.setOutlineStroke(stroke13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.plot.PiePlotState piePlotState17 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D16, piePlotState17, pieLabelRecord18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator15);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.awt.Paint paint6 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke7 = piePlot1.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot1.handleClick((-1), (int) '4', plotRenderingInfo13);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator10);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(false);
        piePlot1.setSimpleLabels(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot1.getURLGenerator();
        java.awt.Paint paint18 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1);
        piePlot1.setStartAngle((double) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot1.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent37 = null;
        piePlot33.datasetChanged(datasetChangeEvent37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot33.addChangeListener(plotChangeListener39);
        piePlot33.setLabelGap((double) 10);
        piePlot33.setNoDataMessage("");
        java.awt.Font font45 = piePlot33.getNoDataMessageFont();
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        piePlot47.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        piePlot47.handleClick((int) (byte) 0, 100, plotRenderingInfo52);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getShadowYOffset();
        java.awt.Stroke stroke58 = piePlot55.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        double double61 = piePlot60.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent62 = null;
        piePlot60.notifyListeners(plotChangeEvent62);
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = piePlot60.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = piePlot60.getSimpleLabelOffset();
        piePlot55.setInsets(rectangleInsets65);
        piePlot47.setLabelPadding(rectangleInsets65);
        piePlot47.zoom((double) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier70 = piePlot47.getDrawingSupplier();
        java.awt.Stroke stroke71 = piePlot47.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset72 = null;
        org.jfree.chart.plot.PiePlot piePlot73 = new org.jfree.chart.plot.PiePlot(pieDataset72);
        double double74 = piePlot73.getMinimumArcAngleToDraw();
        piePlot73.setLabelLinkMargin((double) 'a');
        java.awt.Stroke stroke77 = piePlot73.getLabelLinkStroke();
        java.awt.Paint paint78 = piePlot73.getBackgroundPaint();
        piePlot47.setLabelShadowPaint(paint78);
        piePlot33.setOutlinePaint(paint78);
        piePlot1.setSectionPaint((java.lang.Comparable) 0.5f, paint78);
        boolean boolean82 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.0d + "'", double56 == 4.0d);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0E-5d + "'", double61 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets64);
        org.junit.Assert.assertNotNull(rectangleInsets65);
        org.junit.Assert.assertNotNull(drawingSupplier70);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0E-5d + "'", double74 == 1.0E-5d);
        org.junit.Assert.assertNotNull(stroke77);
        org.junit.Assert.assertNotNull(paint78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        piePlot1.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke26 = piePlot1.getBaseSectionOutlineStroke();
        java.lang.Class<?> wildcardClass27 = piePlot1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        double double5 = piePlot4.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        piePlot4.notifyListeners(plotChangeEvent6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot4.getSimpleLabelOffset();
        boolean boolean9 = piePlot4.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        piePlot11.setLabelPaint(paint17);
        piePlot4.setBackgroundPaint(paint17);
        piePlot0.setLabelPaint(paint17);
        java.lang.String str21 = piePlot0.getNoDataMessage();
        piePlot0.setShadowXOffset((double) '4');
        org.jfree.chart.util.Rotation rotation24 = piePlot0.getDirection();
        piePlot0.setExplodePercent((java.lang.Comparable) 0.4d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-5d + "'", double5 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(rotation24);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.isCircular();
        boolean boolean13 = piePlot1.getIgnoreZeroValues();
        double double14 = piePlot1.getShadowYOffset();
        java.awt.Paint paint15 = piePlot1.getNoDataMessagePaint();
        double double16 = piePlot1.getShadowXOffset();
        java.awt.Paint paint17 = piePlot1.getLabelOutlinePaint();
        java.awt.Paint paint18 = piePlot1.getLabelPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot1.handleClick((int) (byte) 0, (int) (short) 100, plotRenderingInfo21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot1.handleClick((int) '4', (int) (byte) 100, plotRenderingInfo14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot17.datasetChanged(datasetChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot17.getLabelPadding();
        piePlot1.setSimpleLabelOffset(rectangleInsets23);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot1.getURLGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot1.getLegendLabelToolTipGenerator();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator35 = null;
        piePlot29.setToolTipGenerator(pieToolTipGenerator35);
        piePlot29.setOutlineVisible(false);
        java.awt.Image image39 = null;
        piePlot29.setBackgroundImage(image39);
        java.awt.Paint paint41 = piePlot29.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        double double44 = piePlot43.getShadowYOffset();
        java.awt.Image image45 = piePlot43.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = piePlot43.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D47 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        piePlot43.drawBackgroundImage(graphics2D47, rectangle2D48);
        java.awt.Image image50 = null;
        piePlot43.setBackgroundImage(image50);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator52 = null;
        piePlot43.setLegendLabelURLGenerator(pieURLGenerator52);
        piePlot43.setLabelLinkMargin((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot();
        java.awt.Paint paint57 = piePlot56.getShadowPaint();
        piePlot43.setNoDataMessagePaint(paint57);
        piePlot29.setShadowPaint(paint57);
        piePlot1.setSectionPaint((java.lang.Comparable) (short) 100, paint57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator25);
        org.junit.Assert.assertNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.0d + "'", double44 == 4.0d);
        org.junit.Assert.assertNull(image45);
        org.junit.Assert.assertNull(pieURLGenerator46);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke25 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 100);
        piePlot1.setSimpleLabels(true);
        double double28 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        boolean boolean11 = piePlot1.getSectionOutlinesVisible();
        java.awt.Stroke stroke12 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator20 = null;
        piePlot14.setToolTipGenerator(pieToolTipGenerator20);
        boolean boolean22 = piePlot14.getIgnoreNullValues();
        java.awt.Paint paint23 = piePlot14.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot25.getLegendLabelGenerator();
        piePlot14.setLegendLabelGenerator(pieSectionLabelGenerator26);
        boolean boolean28 = piePlot14.isCircular();
        piePlot14.setBackgroundImageAlignment((int) (short) 1);
        piePlot14.setShadowYOffset((double) (byte) -1);
        double double33 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot14.getLabelPadding();
        float float35 = piePlot14.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot37.getLabelShadowPaint();
        java.awt.Image image44 = piePlot37.getBackgroundImage();
        java.awt.Paint paint45 = piePlot37.getBaseSectionPaint();
        java.awt.Paint paint46 = piePlot37.getBaseSectionPaint();
        java.awt.Paint paint47 = piePlot37.getBaseSectionPaint();
        piePlot14.setLabelPaint(paint47);
        int int49 = piePlot14.getPieIndex();
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        piePlot51.setIgnoreNullValues(true);
        java.awt.Paint paint54 = piePlot51.getLabelPaint();
        java.awt.Image image55 = null;
        piePlot51.setBackgroundImage(image55);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator57 = null;
        piePlot51.setToolTipGenerator(pieToolTipGenerator57);
        boolean boolean59 = piePlot51.getIgnoreNullValues();
        java.awt.Paint paint60 = piePlot51.getLabelPaint();
        double double61 = piePlot51.getLabelLinkMargin();
        boolean boolean62 = piePlot51.isCircular();
        boolean boolean63 = piePlot51.getIgnoreZeroValues();
        piePlot51.setMaximumLabelWidth((double) 0.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator66 = piePlot51.getLegendLabelToolTipGenerator();
        java.awt.Paint paint67 = piePlot51.getLabelBackgroundPaint();
        piePlot14.setShadowPaint(paint67);
        piePlot1.setNoDataMessagePaint(paint67);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.025d + "'", double61 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator66);
        org.junit.Assert.assertNotNull(paint67);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot6.notifyListeners(plotChangeEvent8);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint11 = piePlot6.getNoDataMessagePaint();
        piePlot6.setLabelGap(0.0d);
        java.awt.Paint paint16 = piePlot6.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelPaint(paint16);
        java.awt.Paint paint18 = piePlot1.getLabelLinkPaint();
        piePlot1.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot22.setToolTipGenerator(pieToolTipGenerator28);
        boolean boolean30 = piePlot22.getIgnoreZeroValues();
        java.awt.Paint paint31 = piePlot22.getShadowPaint();
        piePlot1.setLabelPaint(paint31);
        piePlot1.setExplodePercent((java.lang.Comparable) false, 4.0d);
        java.awt.Paint paint37 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 100);
        boolean boolean38 = piePlot1.getLabelLinksVisible();
        boolean boolean39 = piePlot1.getIgnoreZeroValues();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        piePlot1.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke26 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint27 = piePlot1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot1.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot30.handleClick((int) (byte) 0, 100, plotRenderingInfo35);
        java.awt.Paint paint37 = piePlot30.getBaseSectionPaint();
        org.jfree.chart.plot.Plot plot38 = piePlot30.getRootPlot();
        piePlot1.setParent(plot38);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(plot38);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        piePlot1.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot1.handleClick((int) 'a', (int) ' ', plotRenderingInfo14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = piePlot1.getLegendItems();
        piePlot1.setShadowXOffset((double) 100L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        java.awt.Paint paint29 = piePlot24.getLabelBackgroundPaint();
        double double30 = piePlot24.getStartAngle();
        java.awt.Paint paint31 = piePlot24.getLabelOutlinePaint();
        piePlot1.setLabelBackgroundPaint(paint31);
        piePlot1.setBackgroundAlpha((float) 1L);
        java.awt.Paint paint36 = piePlot1.getSectionPaint((java.lang.Comparable) (-1.0d));
        java.awt.Paint paint37 = piePlot1.getLabelBackgroundPaint();
        java.awt.Graphics2D graphics2D38 = null;
        org.jfree.chart.plot.PiePlotState piePlotState39 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord40 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D38, piePlotState39, pieLabelRecord40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator14);
        double double16 = piePlot1.getLabelGap();
        piePlot1.setStartAngle((double) (byte) 0);
        java.awt.Paint paint20 = piePlot1.lookupSectionPaint((java.lang.Comparable) 100);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = piePlot1.getToolTipGenerator();
        piePlot1.setNoDataMessage("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(pieToolTipGenerator21);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        boolean boolean6 = piePlot1.isSubplot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setURLGenerator(pieURLGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot1.setDataset(pieDataset9);
        java.awt.Paint paint12 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getShadowYOffset();
        java.awt.Stroke stroke12 = piePlot9.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot14.getSimpleLabelOffset();
        piePlot9.setInsets(rectangleInsets19);
        piePlot1.setLabelPadding(rectangleInsets19);
        piePlot1.zoom((double) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke27 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.5f, false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("Pie Plot");
        piePlot1.setMaximumLabelWidth(0.0d);
        piePlot1.setBackgroundAlpha((float) ' ');
        int int10 = piePlot1.getPieIndex();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        piePlot12.datasetChanged(datasetChangeEvent16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = null;
        piePlot19.setToolTipGenerator(pieToolTipGenerator25);
        boolean boolean27 = piePlot19.getIgnoreNullValues();
        java.awt.Paint paint28 = piePlot19.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot30.getLegendLabelGenerator();
        piePlot19.setLegendLabelGenerator(pieSectionLabelGenerator31);
        boolean boolean33 = piePlot19.isCircular();
        piePlot19.setBackgroundImageAlignment((int) (short) 1);
        piePlot19.setShadowYOffset((double) (byte) -1);
        double double38 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot19.getLabelPadding();
        piePlot12.setInsets(rectangleInsets39, false);
        piePlot1.setInsets(rectangleInsets39, false);
        piePlot1.setShadowXOffset((double) 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.14d + "'", double38 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot1.setSimpleLabelOffset(rectangleInsets16);
        piePlot1.setLabelGap(1.0E-5d);
        java.awt.Stroke stroke20 = piePlot1.getBaseSectionOutlineStroke();
        int int21 = piePlot1.getPieIndex();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        java.awt.Image image27 = null;
        piePlot23.setBackgroundImage(image27);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator29 = null;
        piePlot23.setToolTipGenerator(pieToolTipGenerator29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        piePlot23.setDataset(pieDataset31);
        boolean boolean33 = piePlot23.getLabelLinksVisible();
        piePlot23.setIgnoreZeroValues(true);
        double double36 = piePlot23.getLabelGap();
        boolean boolean37 = piePlot23.isOutlineVisible();
        boolean boolean38 = piePlot23.getIgnoreZeroValues();
        java.awt.Paint paint40 = piePlot23.lookupSectionOutlinePaint((java.lang.Comparable) "");
        piePlot1.setLabelBackgroundPaint(paint40);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.025d + "'", double36 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        double double14 = piePlot1.getMaximumLabelWidth();
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        boolean boolean21 = piePlot17.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot22 = piePlot17.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        piePlot17.axisChanged(axisChangeEvent23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = piePlot17.getDrawingSupplier();
        java.awt.Stroke stroke26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot17.setOutlineStroke(stroke26);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getShadowYOffset();
        java.awt.Stroke stroke32 = piePlot29.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        piePlot34.notifyListeners(plotChangeEvent36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot34.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot34.getSimpleLabelOffset();
        piePlot29.setInsets(rectangleInsets39);
        piePlot17.setInsets(rectangleInsets39, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator43 = null;
        piePlot17.setURLGenerator(pieURLGenerator43);
        java.awt.Paint paint45 = piePlot17.getBaseSectionOutlinePaint();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot17);
        piePlot1.setPieIndex((int) (byte) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent49 = null;
        piePlot1.axisChanged(axisChangeEvent49);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot1.getDatasetGroup();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setExplodePercent((java.lang.Comparable) 1.0d, (double) '4');
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot1.handleClick((int) (byte) 10, 0, plotRenderingInfo13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = piePlot1.getDataset();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D11, rectangle2D12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNull(pieDataset10);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setShadowXOffset(90.0d);
        piePlot29.setForegroundAlpha(10.0f);
        piePlot29.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset51 = null;
        piePlot44.setDataset(pieDataset51);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot44);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        piePlot55.notifyListeners(plotChangeEvent57);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot55.getSimpleLabelOffset();
        java.awt.Font font60 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot55.setNoDataMessageFont(font60);
        java.awt.Font font62 = piePlot55.getLabelFont();
        piePlot44.setNoDataMessageFont(font62);
        piePlot1.setNoDataMessageFont(font62);
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot65.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets66);
        java.awt.Stroke stroke68 = piePlot1.getLabelOutlineStroke();
        piePlot1.setBackgroundAlpha((float) (-1));
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator71 = null;
        piePlot1.setURLGenerator(pieURLGenerator71);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(rectangleInsets66);
        org.junit.Assert.assertNotNull(stroke68);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Paint paint14 = piePlot10.getNoDataMessagePaint();
        piePlot1.setLabelBackgroundPaint(paint14);
        java.awt.Stroke stroke16 = piePlot1.getLabelLinkStroke();
        piePlot1.setInteriorGap(0.025d);
        java.awt.Stroke stroke19 = piePlot1.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator14);
        double double16 = piePlot1.getLabelGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot1.getInsets();
        piePlot1.setShadowXOffset((double) (-1L));
        java.awt.Font font20 = piePlot1.getNoDataMessageFont();
        java.lang.Class<?> wildcardClass21 = piePlot1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot1.getLegendLabelToolTipGenerator();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = piePlot1.getToolTipGenerator();
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.PiePlotState piePlotState10 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D9, piePlotState10, pieLabelRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNull(pieToolTipGenerator8);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        java.awt.Paint paint9 = piePlot1.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        piePlot4.setNoDataMessage("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot4.getInsets();
        piePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot1.notifyListeners(plotChangeEvent11);
        boolean boolean13 = piePlot1.isSubplot();
        double double14 = piePlot1.getStartAngle();
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot1.notifyListeners(plotChangeEvent9);
        boolean boolean11 = piePlot1.getSectionOutlinesVisible();
        java.awt.Paint paint12 = piePlot1.getOutlinePaint();
        java.awt.Paint paint13 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        java.awt.Image image8 = piePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        piePlot1.markerChanged(markerChangeEvent9);
        java.awt.Stroke stroke11 = piePlot1.getLabelLinkStroke();
        java.lang.Comparable comparable13 = piePlot1.getSectionKey((int) (short) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        piePlot1.setLabelGap((double) 1.0f);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Image image14 = null;
        piePlot10.setBackgroundImage(image14);
        java.awt.Paint paint16 = piePlot10.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot10.setDataset(pieDataset17);
        double double19 = piePlot10.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot10.getLabelPadding();
        piePlot1.setInsets(rectangleInsets20, false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Paint paint8 = piePlot1.getBackgroundPaint();
        java.awt.Paint paint9 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot1.getOutlinePaint();
        double double12 = piePlot1.getShadowYOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        java.awt.Paint paint23 = piePlot14.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        piePlot1.setBackgroundAlpha((float) (short) 10);
        java.awt.Stroke stroke29 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 0.08d);
        piePlot1.setNoDataMessage("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNull(stroke29);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        double double3 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator4 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator4);
        piePlot1.setLabelGap((double) 15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        piePlot1.setStartAngle((double) 100L);
        piePlot1.setShadowXOffset((double) (short) 100);
        java.lang.Comparable comparable13 = piePlot1.getSectionKey((int) (byte) 100);
        piePlot1.setExplodePercent((java.lang.Comparable) 10.0d, (double) (short) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 100 + "'", comparable13, 100);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        double double5 = piePlot4.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        piePlot4.notifyListeners(plotChangeEvent6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot4.getSimpleLabelOffset();
        boolean boolean9 = piePlot4.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        piePlot11.setLabelPaint(paint17);
        piePlot4.setBackgroundPaint(paint17);
        piePlot0.setLabelPaint(paint17);
        java.lang.String str21 = piePlot0.getNoDataMessage();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = piePlot0.getLegendItems();
        piePlot0.setMinimumArcAngleToDraw((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-5d + "'", double5 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        java.awt.Paint paint10 = piePlot1.lookupSectionPaint((java.lang.Comparable) "", false);
        java.awt.Paint paint11 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot1.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = piePlot14.getToolTipGenerator();
        java.awt.Shape shape19 = piePlot14.getLegendItemShape();
        piePlot1.setLegendItemShape(shape19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator18);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint7 = piePlot1.getBackgroundPaint();
        org.junit.Assert.assertNull(pieToolTipGenerator6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        float float10 = piePlot1.getForegroundAlpha();
        boolean boolean11 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot1.setURLGenerator(pieURLGenerator12);
        piePlot1.setShadowYOffset((double) 10L);
        piePlot1.setOutlineVisible(true);
        piePlot1.setStartAngle((double) 32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        java.awt.Image image32 = null;
        piePlot28.setBackgroundImage(image32);
        java.awt.Paint paint34 = piePlot28.getLabelShadowPaint();
        piePlot28.setLabelGap(0.0d);
        float float37 = piePlot28.getForegroundAlpha();
        boolean boolean38 = piePlot28.getIgnoreZeroValues();
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot28.removeChangeListener(plotChangeListener39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = piePlot28.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier41);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(drawingSupplier41);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = null;
        piePlot24.setURLGenerator(pieURLGenerator39);
        double double41 = piePlot24.getLabelLinkMargin();
        java.awt.Paint paint42 = piePlot24.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.025d + "'", double41 == 0.025d);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Stroke stroke6 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        piePlot1.setLabelGap((double) 100.0f);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot10.getLegendLabelGenerator();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot10.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke13);
        piePlot10.setLabelGap((double) 0);
        piePlot10.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getShadowYOffset();
        java.awt.Image image28 = piePlot26.getBackgroundImage();
        java.awt.Stroke stroke29 = piePlot26.getLabelOutlineStroke();
        piePlot20.setLabelLinkStroke(stroke29);
        piePlot10.setBaseSectionOutlineStroke(stroke29);
        piePlot1.setOutlineStroke(stroke29);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        piePlot1.addChangeListener(plotChangeListener33);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        piePlot1.notifyListeners(plotChangeEvent35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot1.setSimpleLabelOffset(rectangleInsets16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        java.awt.Paint paint25 = piePlot19.getLabelShadowPaint();
        piePlot19.setShadowXOffset(90.0d);
        piePlot19.setForegroundAlpha(10.0f);
        piePlot19.setCircular(true, false);
        double double33 = piePlot19.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot19.getLabelDistributor();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot19);
        java.awt.Font font36 = piePlot19.getNoDataMessageFont();
        java.awt.Paint paint39 = piePlot19.lookupSectionOutlinePaint((java.lang.Comparable) (-1L), false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.0d + "'", double33 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        java.awt.Image image13 = null;
        piePlot9.setBackgroundImage(image13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot9.getLegendLabelToolTipGenerator();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = piePlot9.getToolTipGenerator();
        java.lang.String str17 = piePlot9.getNoDataMessage();
        java.awt.Font font18 = piePlot9.getNoDataMessageFont();
        boolean boolean19 = piePlot1.equals((java.lang.Object) font18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNull(pieToolTipGenerator16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot1.getLabelDistributor();
        boolean boolean17 = piePlot1.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        boolean boolean23 = piePlot19.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot24 = piePlot19.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        piePlot19.axisChanged(axisChangeEvent25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = piePlot19.getDrawingSupplier();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot19.setOutlineStroke(stroke28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getShadowYOffset();
        java.awt.Stroke stroke34 = piePlot31.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        double double37 = piePlot36.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent38 = null;
        piePlot36.notifyListeners(plotChangeEvent38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot36.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot36.getSimpleLabelOffset();
        piePlot31.setInsets(rectangleInsets41);
        piePlot19.setInsets(rectangleInsets41, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator45 = null;
        piePlot19.setURLGenerator(pieURLGenerator45);
        java.awt.Paint paint47 = piePlot19.getBaseSectionPaint();
        piePlot1.setBackgroundPaint(paint47);
        java.awt.Paint paint50 = piePlot1.getSectionPaint((java.lang.Comparable) 52);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0E-5d + "'", double37 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(paint50);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        piePlot1.setExplodePercent((java.lang.Comparable) 10L, (double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot1.getInsets();
        piePlot1.setShadowXOffset((double) (byte) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        java.awt.Stroke stroke16 = null;
        piePlot14.setSectionOutlineStroke((java.lang.Comparable) '#', stroke16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot19.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot19.getNoDataMessagePaint();
        piePlot19.setLabelGap(0.0d);
        java.awt.Paint paint29 = piePlot19.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot14.setLabelPaint(paint29);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint29);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = null;
        piePlot33.setLegendLabelURLGenerator(pieURLGenerator37);
        java.lang.Comparable comparable40 = piePlot33.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        piePlot33.drawBackgroundImage(graphics2D41, rectangle2D42);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor44 = piePlot33.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor44);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = piePlot1.getLabelPadding();
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        piePlot1.addChangeListener(plotChangeListener47);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 100 + "'", comparable40, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor44);
        org.junit.Assert.assertNotNull(rectangleInsets46);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot1.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator10);
        java.awt.Paint paint12 = piePlot1.getLabelShadowPaint();
        java.awt.Paint paint13 = piePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float13 = piePlot1.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLabelGenerator();
        piePlot1.setShadowXOffset((double) (byte) 10);
        double double17 = piePlot1.getLabelLinkMargin();
        piePlot1.setIgnoreZeroValues(false);
        java.awt.Paint paint20 = piePlot1.getShadowPaint();
        java.awt.Paint paint21 = piePlot1.getNoDataMessagePaint();
        piePlot1.setCircular(false, true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setShadowXOffset(90.0d);
        piePlot29.setForegroundAlpha(10.0f);
        piePlot29.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset51 = null;
        piePlot44.setDataset(pieDataset51);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot44);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        piePlot55.notifyListeners(plotChangeEvent57);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot55.getSimpleLabelOffset();
        java.awt.Font font60 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot55.setNoDataMessageFont(font60);
        java.awt.Font font62 = piePlot55.getLabelFont();
        piePlot44.setNoDataMessageFont(font62);
        piePlot1.setNoDataMessageFont(font62);
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot65.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets66);
        java.awt.Stroke stroke68 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.plot.Plot plot69 = piePlot1.getParent();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator70 = null;
        piePlot1.setURLGenerator(pieURLGenerator70);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(rectangleInsets66);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNull(plot69);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setExplodePercent((java.lang.Comparable) (-1.0d), (-1.0d));
        double double13 = piePlot1.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke15 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke16 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot1.getInsets();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        java.awt.Font font19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot14.setNoDataMessageFont(font19);
        piePlot1.setLabelFont(font19);
        piePlot1.setMinimumArcAngleToDraw((double) 100.0f);
        double double24 = piePlot1.getLabelGap();
        float float25 = piePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        java.awt.Font font19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot14.setNoDataMessageFont(font19);
        piePlot1.setLabelFont(font19);
        int int22 = piePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset23 = piePlot1.getDataset();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Image image29 = null;
        piePlot25.setBackgroundImage(image29);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator31 = null;
        piePlot25.setToolTipGenerator(pieToolTipGenerator31);
        boolean boolean33 = piePlot25.getIgnoreNullValues();
        piePlot25.setLabelLinkMargin((double) (short) -1);
        java.awt.Stroke stroke36 = piePlot25.getLabelLinkStroke();
        piePlot1.setOutlineStroke(stroke36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(pieDataset23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("Pie Plot");
        piePlot1.setMaximumLabelWidth(0.0d);
        piePlot1.setBackgroundAlpha((float) ' ');
        int int10 = piePlot1.getPieIndex();
        java.awt.Image image11 = null;
        piePlot1.setBackgroundImage(image11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke9 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100);
        piePlot1.setSectionOutlinesVisible(false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setSimpleLabels(true);
        piePlot0.zoom(0.08d);
        piePlot0.setLabelGap((double) 0.0f);
        boolean boolean7 = piePlot0.getIgnoreNullValues();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        boolean boolean8 = piePlot1.getSectionOutlinesVisible();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.awt.Paint paint11 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0.14d);
        java.awt.Stroke stroke12 = piePlot1.getLabelLinkStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot1.getURLGenerator();
        java.awt.Stroke stroke14 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint15 = piePlot1.getBaseSectionPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Paint paint15 = piePlot11.getNoDataMessagePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) 0, paint15);
        boolean boolean17 = piePlot1.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setForegroundAlpha((float) 1);
        double double9 = piePlot1.getStartAngle();
        boolean boolean10 = piePlot1.isOutlineVisible();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot12.getInsets();
        org.jfree.chart.plot.Plot plot15 = piePlot12.getRootPlot();
        piePlot12.setShadowXOffset((double) (byte) 1);
        java.awt.Paint paint18 = piePlot12.getLabelLinkPaint();
        piePlot1.setLabelShadowPaint(paint18);
        java.awt.Font font20 = piePlot1.getNoDataMessageFont();
        double double21 = piePlot1.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        java.awt.Stroke stroke4 = piePlot1.getLabelOutlineStroke();
        java.awt.Font font5 = piePlot1.getLabelFont();
        java.awt.Paint paint7 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setBaseSectionOutlineStroke(stroke4);
        piePlot1.setCircular(true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = null;
        piePlot1.setURLGenerator(pieURLGenerator20);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        piePlot4.setNoDataMessage("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot4.getInsets();
        piePlot1.setInsets(rectangleInsets9);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        boolean boolean16 = piePlot12.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot17 = piePlot12.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        piePlot12.axisChanged(axisChangeEvent18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = piePlot12.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot12.setDataset(pieDataset21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getShadowYOffset();
        java.awt.Stroke stroke27 = piePlot24.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot12.setBaseSectionOutlineStroke(stroke27);
        java.awt.Paint paint29 = piePlot12.getBaseSectionOutlinePaint();
        piePlot1.setLabelLinkPaint(paint29);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.chart.plot.Plot plot33 = piePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint34 = plot33.getBackgroundPaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(plot33);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint9 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        boolean boolean10 = piePlot1.getLabelLinksVisible();
        piePlot1.setLabelGap(0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        java.awt.Paint paint9 = piePlot1.getBaseSectionOutlinePaint();
        java.awt.Paint paint10 = piePlot1.getBackgroundPaint();
        java.awt.Paint paint13 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "hi!", false);
        java.awt.Paint paint14 = piePlot1.getLabelLinkPaint();
        java.awt.Stroke stroke15 = piePlot1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        java.awt.Font font7 = piePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot8 = piePlot1.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = piePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        double double14 = piePlot1.getShadowYOffset();
        double double15 = piePlot1.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot1.lookupSectionPaint((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot1.setDataset(pieDataset9);
        boolean boolean11 = piePlot1.getLabelLinksVisible();
        java.awt.Paint paint13 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot1.getInsets();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot1.getDatasetGroup();
        piePlot1.setLabelGap(100.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot1.getInsets();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        java.awt.Stroke stroke16 = null;
        piePlot14.setSectionOutlineStroke((java.lang.Comparable) '#', stroke16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot19.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot19.getNoDataMessagePaint();
        piePlot19.setLabelGap(0.0d);
        java.awt.Paint paint29 = piePlot19.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot14.setLabelPaint(paint29);
        java.awt.Paint paint31 = piePlot14.getLabelLinkPaint();
        piePlot14.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        java.awt.Image image39 = null;
        piePlot35.setBackgroundImage(image39);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator41 = null;
        piePlot35.setToolTipGenerator(pieToolTipGenerator41);
        boolean boolean43 = piePlot35.getIgnoreZeroValues();
        java.awt.Paint paint44 = piePlot35.getShadowPaint();
        piePlot14.setLabelPaint(paint44);
        piePlot14.setExplodePercent((java.lang.Comparable) false, 4.0d);
        piePlot14.zoom((double) (-1L));
        piePlot14.setCircular(false);
        double double53 = piePlot14.getMaximumLabelWidth();
        java.awt.Stroke stroke56 = piePlot14.lookupSectionOutlineStroke((java.lang.Comparable) ' ', true);
        piePlot1.setOutlineStroke(stroke56);
        java.awt.Paint paint58 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        java.lang.Object obj20 = piePlot1.clone();
        piePlot1.setCircular(false, false);
        piePlot1.setForegroundAlpha((float) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setShadowXOffset(90.0d);
        piePlot29.setForegroundAlpha(10.0f);
        piePlot29.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset51 = null;
        piePlot44.setDataset(pieDataset51);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot44);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        piePlot55.notifyListeners(plotChangeEvent57);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot55.getSimpleLabelOffset();
        java.awt.Font font60 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot55.setNoDataMessageFont(font60);
        java.awt.Font font62 = piePlot55.getLabelFont();
        piePlot44.setNoDataMessageFont(font62);
        piePlot1.setNoDataMessageFont(font62);
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot65.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets66);
        java.awt.Stroke stroke68 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener69 = null;
        piePlot1.addChangeListener(plotChangeListener69);
        piePlot1.setOutlineVisible(true);
        java.lang.String str73 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(rectangleInsets66);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        java.awt.Paint paint29 = piePlot24.getLabelBackgroundPaint();
        double double30 = piePlot24.getStartAngle();
        java.awt.Paint paint31 = piePlot24.getLabelOutlinePaint();
        piePlot1.setLabelBackgroundPaint(paint31);
        piePlot1.setBackgroundAlpha((float) 1L);
        java.awt.Paint paint36 = piePlot1.getSectionPaint((java.lang.Comparable) (-1.0d));
        piePlot1.setIgnoreNullValues(false);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator39 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator39);
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        piePlot1.removeChangeListener(plotChangeListener41);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(paint36);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot1.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot10.setToolTipGenerator(pieToolTipGenerator15);
        java.awt.Paint paint18 = piePlot10.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot20.notifyListeners(plotChangeEvent22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot20.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot20.getSimpleLabelOffset();
        boolean boolean26 = piePlot10.equals((java.lang.Object) rectangleInsets25);
        piePlot1.setLabelPadding(rectangleInsets25);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        piePlot1.axisChanged(axisChangeEvent28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setSimpleLabelOffset(rectangleInsets30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setBaseSectionOutlineStroke(stroke16);
        java.awt.Paint paint18 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset16 = piePlot1.getDataset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot1.getURLGenerator();
        piePlot1.setSectionOutlinesVisible(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(pieDataset16);
        org.junit.Assert.assertNull(pieURLGenerator17);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setInteriorGap(0.08d);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getStartAngle();
        java.awt.Stroke stroke14 = piePlot11.getSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot16.getSimpleLabelOffset();
        piePlot11.setInsets(rectangleInsets18);
        piePlot1.setInsets(rectangleInsets18);
        double double21 = piePlot1.getMaximumLabelWidth();
        java.awt.Stroke stroke22 = piePlot1.getBaseSectionOutlineStroke();
        float float23 = piePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getInteriorGap();
        org.jfree.chart.util.Rotation rotation5 = piePlot1.getDirection();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot1.addChangeListener(plotChangeListener6);
        double double8 = piePlot1.getStartAngle();
        java.awt.Font font9 = piePlot1.getLabelFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNotNull(rotation5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(pieURLGenerator10);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        int int8 = piePlot1.getPieIndex();
        piePlot1.setCircular(true);
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) '4');
        java.awt.Paint paint13 = piePlot1.getBaseSectionPaint();
        piePlot1.setMinimumArcAngleToDraw((double) 1L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot1.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot11.handleClick((int) (byte) 0, 100, plotRenderingInfo16);
        java.awt.Paint paint18 = piePlot11.getBaseSectionPaint();
        java.awt.Paint paint20 = piePlot11.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot11.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        piePlot24.datasetChanged(datasetChangeEvent28);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        piePlot24.addChangeListener(plotChangeListener30);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot24.getLabelGenerator();
        piePlot11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot1.handleClick((int) '4', 35, plotRenderingInfo37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator32);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        piePlot1.setExplodePercent((java.lang.Comparable) 10.0d, (double) (short) 10);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        double double22 = piePlot21.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        piePlot21.notifyListeners(plotChangeEvent23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot21.getSimpleLabelOffset();
        boolean boolean26 = piePlot21.getIgnoreNullValues();
        piePlot21.setForegroundAlpha((float) 1);
        piePlot21.setCircular(false);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = piePlot21.getLegendItems();
        org.jfree.chart.util.Rotation rotation32 = piePlot21.getDirection();
        piePlot21.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent40 = null;
        piePlot36.datasetChanged(datasetChangeEvent40);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot36.getLabelPadding();
        java.awt.Paint paint45 = piePlot36.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot21.setOutlinePaint(paint45);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState49 = piePlot1.initialise(graphics2D18, rectangle2D19, piePlot21, (java.lang.Integer) 1, plotRenderingInfo48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(legendItemCollection31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        org.jfree.chart.plot.Plot plot4 = piePlot1.getRootPlot();
        piePlot1.setShadowXOffset((double) (byte) 1);
        double double7 = piePlot1.getLabelGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Paint paint10 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.0d);
        boolean boolean11 = piePlot1.isCircular();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot1.addChangeListener(plotChangeListener12);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        java.awt.Font font8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setLabelFont(font8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) "", false);
        piePlot1.setLabelLinksVisible(true);
        java.awt.Font font15 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        int int7 = piePlot1.getPieIndex();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot9.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets11);
        java.awt.Stroke stroke14 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(stroke14);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        piePlot8.setLabelPaint(paint14);
        piePlot1.setBackgroundPaint(paint14);
        java.awt.Paint paint18 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 100.0f);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot1.setDataset(pieDataset21);
        java.awt.Stroke stroke23 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke15 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot17.datasetChanged(datasetChangeEvent21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot24.handleClick((int) (byte) 0, 100, plotRenderingInfo29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        piePlot24.setLabelBackgroundPaint(paint35);
        piePlot17.setLabelShadowPaint(paint35);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot17);
        java.awt.Stroke stroke40 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) true);
        double double41 = piePlot17.getShadowXOffset();
        piePlot17.setPieIndex((int) (short) 10);
        piePlot17.setLabelGap((double) (byte) 100);
        boolean boolean46 = piePlot17.isCircular();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setOutlineStroke(stroke10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot1.setURLGenerator(pieURLGenerator12);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        java.awt.Image image21 = null;
        piePlot17.setBackgroundImage(image21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = null;
        piePlot17.setToolTipGenerator(pieToolTipGenerator23);
        boolean boolean25 = piePlot17.getIgnoreNullValues();
        piePlot17.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot17.handleClick((int) 'a', (int) ' ', plotRenderingInfo30);
        org.jfree.chart.LegendItemCollection legendItemCollection32 = piePlot17.getLegendItems();
        java.awt.Paint paint33 = piePlot17.getLabelOutlinePaint();
        piePlot1.setBaseSectionOutlinePaint(paint33);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(legendItemCollection32);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Paint paint15 = piePlot11.getNoDataMessagePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) 0.025d, paint15);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(pieSectionLabelGenerator17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot17.getSimpleLabelOffset();
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot17.setNoDataMessageFont(font22);
        piePlot1.setLabelFont(font22);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot1.setBaseSectionPaint(paint25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot1.setDataset(pieDataset27);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        piePlot1.datasetChanged(datasetChangeEvent29);
        piePlot1.setSectionOutlinesVisible(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        java.awt.Paint paint23 = piePlot14.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        piePlot1.setBackgroundAlpha((float) (short) 10);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot1.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        piePlot1.datasetChanged(datasetChangeEvent31);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot1.getLabelDistributor();
        boolean boolean34 = piePlot1.isCircular();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        piePlot1.setStartAngle(0.14d);
        piePlot1.setExplodePercent((java.lang.Comparable) (-1), (double) 100.0f);
        java.awt.Stroke stroke30 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        java.awt.Paint paint21 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) false);
        piePlot1.setMaximumLabelWidth((-1.0d));
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot1.getLabelDistributor();
        piePlot1.setMinimumArcAngleToDraw((double) 10.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        int int8 = piePlot1.getPieIndex();
        piePlot1.setCircular(true);
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) '4');
        java.awt.Paint paint14 = null;
        piePlot1.setSectionPaint((java.lang.Comparable) (byte) 1, paint14);
        float float16 = piePlot1.getForegroundAlpha();
        java.awt.Paint paint17 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        piePlot1.setLabelGap((double) 10);
        piePlot1.setNoDataMessage("");
        java.awt.Font font13 = piePlot1.getNoDataMessageFont();
        piePlot1.setCircular(true);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getShadowYOffset();
        java.awt.Image image19 = piePlot17.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot17.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        piePlot17.drawBackgroundImage(graphics2D21, rectangle2D22);
        java.awt.Image image24 = null;
        piePlot17.setBackgroundImage(image24);
        java.awt.Stroke stroke28 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float29 = piePlot17.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot17.getLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator30);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNull(pieURLGenerator20);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator30);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot1.getLabelDistributor();
        boolean boolean17 = piePlot1.getLabelLinksVisible();
        double double18 = piePlot1.getLabelGap();
        java.lang.Comparable comparable20 = piePlot1.getSectionKey((int) (byte) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10 + "'", comparable20, 10);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot11.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets13, false);
        piePlot1.setShadowXOffset((double) (byte) 100);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = null;
        piePlot19.setToolTipGenerator(pieToolTipGenerator25);
        boolean boolean27 = piePlot19.getIgnoreNullValues();
        piePlot19.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        piePlot19.handleClick((int) 'a', (int) ' ', plotRenderingInfo32);
        java.awt.Paint paint34 = piePlot19.getNoDataMessagePaint();
        piePlot1.setLabelLinkPaint(paint34);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float13 = piePlot1.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLabelGenerator();
        piePlot1.setShadowXOffset((double) (byte) 10);
        double double17 = piePlot1.getLabelLinkMargin();
        piePlot1.setIgnoreZeroValues(false);
        java.awt.Paint paint20 = piePlot1.getShadowPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot1.setDataset(pieDataset21);
        piePlot1.setStartAngle(1.0E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setBaseSectionOutlineStroke(stroke16);
        java.awt.Stroke stroke18 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot24.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = piePlot24.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        double double44 = piePlot43.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot43.getSimpleLabelOffset();
        piePlot43.setNoDataMessage("Pie Plot");
        java.awt.Paint paint50 = piePlot43.lookupSectionOutlinePaint((java.lang.Comparable) 1, true);
        piePlot24.setOutlinePaint(paint50);
        java.awt.Font font52 = piePlot24.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0E-5d + "'", double44 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(font52);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        double double8 = piePlot1.getStartAngle();
        java.awt.Paint paint9 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelLinksVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot1.getInsets();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset23 = piePlot1.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getShadowYOffset();
        java.awt.Image image28 = piePlot26.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot26.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot26.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Image image33 = null;
        piePlot26.setBackgroundImage(image33);
        java.awt.Stroke stroke37 = piePlot26.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float38 = piePlot26.getForegroundAlpha();
        java.awt.Paint paint39 = piePlot26.getLabelPaint();
        double double40 = piePlot26.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        java.awt.Image image47 = null;
        piePlot43.setBackgroundImage(image47);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = null;
        piePlot43.setToolTipGenerator(pieToolTipGenerator49);
        boolean boolean51 = piePlot43.getIgnoreNullValues();
        java.awt.Paint paint52 = piePlot43.getLabelPaint();
        piePlot26.setSectionOutlinePaint((java.lang.Comparable) (short) 0, paint52);
        piePlot1.setBackgroundPaint(paint52);
        java.awt.Paint paint56 = piePlot1.getSectionPaint((java.lang.Comparable) '#');
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        piePlot1.removeChangeListener(plotChangeListener57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(pieDataset23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.08d + "'", double40 == 0.08d);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNull(paint56);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        java.awt.Stroke stroke23 = null;
        piePlot21.setSectionOutlineStroke((java.lang.Comparable) '#', stroke23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        piePlot26.notifyListeners(plotChangeEvent28);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator30 = piePlot26.getToolTipGenerator();
        java.awt.Paint paint31 = piePlot26.getNoDataMessagePaint();
        piePlot26.setLabelGap(0.0d);
        java.awt.Paint paint36 = piePlot26.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot21.setLabelPaint(paint36);
        java.awt.Paint paint38 = piePlot21.getLabelLinkPaint();
        piePlot21.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        piePlot21.setLabelShadowPaint(paint45);
        piePlot1.setBackgroundPaint(paint45);
        java.awt.Shape shape48 = piePlot1.getLegendItemShape();
        java.awt.Shape shape49 = piePlot1.getLegendItemShape();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertNotNull(shape49);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.isCircular();
        boolean boolean13 = piePlot1.getIgnoreZeroValues();
        double double14 = piePlot1.getShadowYOffset();
        piePlot1.zoom((double) 10.0f);
        java.awt.Paint paint18 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 1.0E-5d);
        double double19 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot1.getLabelDistributor();
        boolean boolean17 = piePlot1.isOutlineVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(pieURLGenerator18);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        piePlot1.setStartAngle((double) (byte) 0);
        java.awt.Image image17 = piePlot1.getBackgroundImage();
        java.awt.Paint paint18 = piePlot1.getLabelBackgroundPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        float float8 = piePlot1.getBackgroundImageAlpha();
        piePlot1.setForegroundAlpha((float) (-1));
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getShadowYOffset();
        java.awt.Stroke stroke15 = piePlot12.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot12.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        java.awt.Paint paint25 = piePlot19.getLabelShadowPaint();
        piePlot19.setLabelGap(0.0d);
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot19.setLabelLinkPaint(paint28);
        piePlot12.setLabelPaint(paint28);
        float float31 = piePlot12.getBackgroundAlpha();
        piePlot12.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset34 = piePlot12.getDataset();
        java.awt.Font font35 = piePlot12.getLabelFont();
        java.awt.Paint paint36 = piePlot12.getBaseSectionOutlinePaint();
        piePlot1.setOutlinePaint(paint36);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator38 = piePlot1.getLabelGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNull(pieDataset34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator38);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        boolean boolean10 = piePlot1.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getShadowYOffset();
        java.awt.Image image14 = piePlot12.getBackgroundImage();
        piePlot12.setIgnoreZeroValues(false);
        java.awt.Paint paint17 = piePlot12.getOutlinePaint();
        piePlot1.setNoDataMessagePaint(paint17);
        double double19 = piePlot1.getLabelGap();
        boolean boolean20 = piePlot1.getSimpleLabels();
        piePlot1.setNoDataMessage("Pie Plot");
        java.awt.Paint paint23 = piePlot1.getBaseSectionOutlinePaint();
        piePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot1.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot9.notifyListeners(plotChangeEvent11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot9.getSimpleLabelOffset();
        boolean boolean14 = piePlot9.getIgnoreNullValues();
        piePlot9.setForegroundAlpha((float) 1);
        double double17 = piePlot9.getStartAngle();
        boolean boolean18 = piePlot9.isOutlineVisible();
        java.awt.Stroke stroke19 = piePlot9.getLabelOutlineStroke();
        java.awt.Paint paint20 = piePlot9.getBaseSectionPaint();
        piePlot1.setShadowPaint(paint20);
        float float22 = piePlot1.getBackgroundImageAlpha();
        java.awt.Image image23 = piePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 90.0d + "'", double17 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNull(image23);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setForegroundAlpha((float) 1);
        double double9 = piePlot1.getStartAngle();
        boolean boolean10 = piePlot1.isOutlineVisible();
        java.awt.Stroke stroke11 = piePlot1.getLabelOutlineStroke();
        java.awt.Paint paint12 = piePlot1.getBaseSectionPaint();
        piePlot1.setLabelLinksVisible(true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        piePlot1.setStartAngle((double) (-1.0f));
        java.awt.Paint paint10 = piePlot1.getLabelBackgroundPaint();
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = piePlot1.getArcBounds(rectangle2D11, rectangle2D12, (double) (byte) 100, (double) 52, (double) 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(rectangle2D16);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        int int7 = piePlot1.getPieIndex();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot9.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets11);
        double double14 = piePlot1.getExplodePercent((java.lang.Comparable) 0.025d);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = null;
        piePlot16.setToolTipGenerator(pieToolTipGenerator22);
        java.awt.Paint paint24 = piePlot16.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot16.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot32 = piePlot27.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent33 = null;
        piePlot27.axisChanged(axisChangeEvent33);
        java.lang.String str35 = piePlot27.getNoDataMessage();
        java.awt.Image image36 = null;
        piePlot27.setBackgroundImage(image36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getShadowYOffset();
        java.awt.Stroke stroke42 = piePlot39.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot39.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        java.awt.Image image50 = null;
        piePlot46.setBackgroundImage(image50);
        java.awt.Paint paint52 = piePlot46.getLabelShadowPaint();
        piePlot46.setLabelGap(0.0d);
        java.awt.Paint paint55 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot46.setLabelLinkPaint(paint55);
        piePlot39.setLabelPaint(paint55);
        piePlot27.setLabelLinkPaint(paint55);
        piePlot16.setOutlinePaint(paint55);
        piePlot1.setOutlinePaint(paint55);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.0d + "'", double40 == 4.0d);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSimpleLabels(false);
        java.awt.Paint paint9 = piePlot1.lookupSectionPaint((java.lang.Comparable) (short) 100, true);
        boolean boolean10 = piePlot1.isSubplot();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot13.getInsets();
        double double16 = piePlot13.getLabelLinkMargin();
        java.awt.Paint paint17 = piePlot13.getShadowPaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) "Pie Plot", paint17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot24.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets29);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = piePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(legendItemCollection31);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot16.handleClick((int) (byte) 0, 100, plotRenderingInfo21);
        double double23 = piePlot16.getLabelGap();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent24 = null;
        piePlot16.axisChanged(axisChangeEvent24);
        java.awt.Font font26 = piePlot16.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font26);
        java.awt.Stroke stroke28 = piePlot1.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot11.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets13, false);
        piePlot1.setShadowXOffset((double) (byte) 100);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        java.awt.Paint paint25 = piePlot19.getLabelShadowPaint();
        piePlot1.setBaseSectionOutlinePaint(paint25);
        double double27 = piePlot1.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator21);
        java.awt.Stroke stroke25 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100, false);
        double double26 = piePlot1.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot1.getLabelGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator27);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        piePlot1.markerChanged(markerChangeEvent12);
        org.jfree.data.general.PieDataset pieDataset14 = piePlot1.getDataset();
        java.awt.Paint paint15 = piePlot1.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        piePlot16.setSimpleLabels(true);
        int int19 = piePlot16.getBackgroundImageAlignment();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot21.getInsets();
        double double24 = piePlot21.getInteriorGap();
        org.jfree.chart.util.Rotation rotation25 = piePlot21.getDirection();
        piePlot16.setDirection(rotation25);
        piePlot1.setDirection(rotation25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertNull(pieDataset14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08d + "'", double24 == 0.08d);
        org.junit.Assert.assertNotNull(rotation25);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.lang.String str3 = piePlot1.getNoDataMessage();
        double double4 = piePlot1.getInteriorGap();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNull(datasetGroup5);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        piePlot1.setForegroundAlpha((float) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot1.addChangeListener(plotChangeListener27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot30.getSimpleLabelOffset();
        piePlot30.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.Rotation rotation35 = piePlot30.getDirection();
        piePlot1.setDirection(rotation35);
        piePlot1.setStartAngle((-1.0d));
        java.awt.Graphics2D graphics2D39 = null;
        org.jfree.chart.plot.PiePlotState piePlotState40 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord41 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D39, piePlotState40, pieLabelRecord41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-5d + "'", double31 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(rotation35);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getShadowYOffset();
        java.awt.Stroke stroke12 = piePlot9.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot14.getSimpleLabelOffset();
        piePlot9.setInsets(rectangleInsets19);
        piePlot1.setLabelPadding(rectangleInsets19);
        piePlot1.zoom((double) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke25 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot1.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        java.awt.Paint paint20 = piePlot1.getOutlinePaint();
        piePlot1.setLabelGap((double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot1.getLabelDistributor();
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 97, false);
        piePlot1.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setShadowXOffset(90.0d);
        piePlot29.setForegroundAlpha(10.0f);
        piePlot29.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset51 = null;
        piePlot44.setDataset(pieDataset51);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot44);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        piePlot55.notifyListeners(plotChangeEvent57);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot55.getSimpleLabelOffset();
        java.awt.Font font60 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot55.setNoDataMessageFont(font60);
        java.awt.Font font62 = piePlot55.getLabelFont();
        piePlot44.setNoDataMessageFont(font62);
        piePlot1.setNoDataMessageFont(font62);
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot65.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets66);
        java.awt.Stroke stroke68 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener69 = null;
        piePlot1.addChangeListener(plotChangeListener69);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator71 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(rectangleInsets66);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNull(pieURLGenerator71);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot1.setSimpleLabelOffset(rectangleInsets16);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        java.awt.Stroke stroke24 = null;
        piePlot22.setSectionOutlineStroke((java.lang.Comparable) '#', stroke24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator31 = piePlot27.getToolTipGenerator();
        java.awt.Paint paint32 = piePlot27.getNoDataMessagePaint();
        piePlot27.setLabelGap(0.0d);
        java.awt.Paint paint37 = piePlot27.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot22.setLabelPaint(paint37);
        java.awt.Paint paint39 = piePlot22.getLabelLinkPaint();
        piePlot22.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        java.awt.Image image47 = null;
        piePlot43.setBackgroundImage(image47);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = null;
        piePlot43.setToolTipGenerator(pieToolTipGenerator49);
        boolean boolean51 = piePlot43.getIgnoreZeroValues();
        java.awt.Paint paint52 = piePlot43.getShadowPaint();
        piePlot22.setLabelPaint(paint52);
        piePlot1.setLabelShadowPaint(paint52);
        piePlot1.setLabelLinksVisible(false);
        int int57 = piePlot1.getBackgroundImageAlignment();
        piePlot1.setShadowYOffset((double) 10.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0E-5d + "'", double28 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 15 + "'", int57 == 15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float13 = piePlot1.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLabelGenerator();
        piePlot1.setShadowXOffset((double) (byte) 10);
        double double17 = piePlot1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot19.setLegendLabelURLGenerator(pieURLGenerator23);
        java.lang.Comparable comparable26 = piePlot19.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot19.drawBackgroundImage(graphics2D27, rectangle2D28);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor30 = piePlot19.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor30);
        boolean boolean32 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 100 + "'", comparable26, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        piePlot1.setExplodePercent((java.lang.Comparable) 10L, (double) 100L);
        java.awt.Font font12 = piePlot1.getLabelFont();
        java.awt.Paint paint13 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        java.awt.Paint paint9 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset11 = piePlot1.getDataset();
        piePlot1.setBackgroundImageAlignment((int) '4');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(pieDataset11);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot1.setDataset(pieDataset9);
        java.awt.Stroke stroke13 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        java.awt.Paint paint14 = piePlot1.getLabelBackgroundPaint();
        java.awt.Stroke stroke16 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) (short) 10);
        java.awt.Stroke stroke18 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Stroke stroke8 = piePlot1.getLabelLinkStroke();
        java.awt.Stroke stroke9 = piePlot1.getLabelLinkStroke();
        piePlot1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        java.awt.Paint paint23 = piePlot14.lookupSectionPaint((java.lang.Comparable) "", false);
        java.awt.Paint paint24 = piePlot14.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot14.getLegendLabelGenerator();
        piePlot14.setIgnoreZeroValues(true);
        boolean boolean28 = piePlot14.isCircular();
        java.awt.Paint paint30 = piePlot14.getSectionOutlinePaint((java.lang.Comparable) 100.0d);
        boolean boolean31 = piePlot14.isSubplot();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getShadowYOffset();
        java.awt.Stroke stroke37 = piePlot34.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot34.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Image image45 = null;
        piePlot41.setBackgroundImage(image45);
        java.awt.Paint paint47 = piePlot41.getLabelShadowPaint();
        piePlot41.setLabelGap(0.0d);
        java.awt.Paint paint50 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot41.setLabelLinkPaint(paint50);
        piePlot34.setLabelPaint(paint50);
        float float53 = piePlot34.getBackgroundAlpha();
        piePlot34.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent59 = null;
        piePlot57.notifyListeners(plotChangeEvent59);
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot57.getSimpleLabelOffset();
        java.awt.Paint paint62 = piePlot57.getLabelBackgroundPaint();
        double double63 = piePlot57.getStartAngle();
        java.awt.Paint paint64 = piePlot57.getLabelOutlinePaint();
        piePlot34.setLabelBackgroundPaint(paint64);
        piePlot34.setBackgroundAlpha((float) 1L);
        java.awt.Paint paint69 = piePlot34.getSectionPaint((java.lang.Comparable) (-1.0d));
        java.awt.Paint paint70 = piePlot34.getLabelBackgroundPaint();
        piePlot14.setSectionPaint((java.lang.Comparable) 10, paint70);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) '4', paint70);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.0d + "'", double35 == 4.0d);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0E-5d + "'", double58 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets61);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 90.0d + "'", double63 == 90.0d);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNull(paint69);
        org.junit.Assert.assertNotNull(paint70);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot17.getSimpleLabelOffset();
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot17.setNoDataMessageFont(font22);
        piePlot1.setLabelFont(font22);
        java.awt.Paint paint27 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 15, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.awt.Paint paint7 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setShadowXOffset(90.0d);
        piePlot29.setForegroundAlpha(10.0f);
        piePlot29.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset51 = null;
        piePlot44.setDataset(pieDataset51);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot44);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        piePlot55.notifyListeners(plotChangeEvent57);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot55.getSimpleLabelOffset();
        java.awt.Font font60 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot55.setNoDataMessageFont(font60);
        java.awt.Font font62 = piePlot55.getLabelFont();
        piePlot44.setNoDataMessageFont(font62);
        piePlot1.setNoDataMessageFont(font62);
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot65.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets66);
        java.awt.Stroke stroke68 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener69 = null;
        piePlot1.addChangeListener(plotChangeListener69);
        piePlot1.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D73 = null;
        java.awt.geom.Rectangle2D rectangle2D74 = null;
        java.awt.geom.Point2D point2D75 = null;
        org.jfree.chart.plot.PlotState plotState76 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo77 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D73, rectangle2D74, point2D75, plotState76, plotRenderingInfo77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(rectangleInsets66);
        org.junit.Assert.assertNotNull(stroke68);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setBackgroundImageAlignment((int) (byte) 1);
        java.awt.Font font23 = piePlot1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke15 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot17.datasetChanged(datasetChangeEvent21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot24.handleClick((int) (byte) 0, 100, plotRenderingInfo29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        piePlot24.setLabelBackgroundPaint(paint35);
        piePlot17.setLabelShadowPaint(paint35);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot17);
        java.awt.Stroke stroke40 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) true);
        double double41 = piePlot17.getShadowXOffset();
        java.awt.Graphics2D graphics2D42 = null;
        java.util.List list43 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        org.jfree.chart.plot.PiePlotState piePlotState47 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot17.drawSimpleLabels(graphics2D42, list43, (double) 35, rectangle2D45, rectangle2D46, piePlotState47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        java.awt.Paint paint8 = piePlot1.getLabelShadowPaint();
        java.awt.Paint paint9 = piePlot1.getLabelOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = piePlot1.getLegendItems();
        java.awt.Paint paint11 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Stroke stroke10 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        piePlot1.axisChanged(axisChangeEvent11);
        piePlot1.setSimpleLabels(false);
        piePlot1.setIgnoreNullValues(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        java.awt.Paint paint9 = piePlot1.getBaseSectionOutlinePaint();
        double double11 = piePlot1.getExplodePercent((java.lang.Comparable) 90.0d);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        piePlot1.markerChanged(markerChangeEvent12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        piePlot1.setLabelLinkMargin((double) 'a');
        java.awt.Stroke stroke5 = piePlot1.getLabelLinkStroke();
        int int6 = piePlot1.getPieIndex();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot1.handleClick(1, (int) '4', plotRenderingInfo9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        piePlot1.setForegroundAlpha((float) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot1.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        java.awt.Paint paint21 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) false);
        piePlot1.setMaximumLabelWidth((-1.0d));
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot1.getLabelDistributor();
        boolean boolean25 = piePlot1.getSectionOutlinesVisible();
        java.awt.Paint paint26 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.removeChangeListener(plotChangeListener10);
        piePlot1.setCircular(false);
        java.awt.Stroke stroke15 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Paint paint14 = piePlot10.getNoDataMessagePaint();
        piePlot1.setLabelBackgroundPaint(paint14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot1.setURLGenerator(pieURLGenerator16);
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = piePlot1.getArcBounds(rectangle2D18, rectangle2D19, (double) (byte) -1, (double) (short) 1, (double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        piePlot27.setDataset(pieDataset34);
        double double36 = piePlot27.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot27.getLabelPadding();
        java.awt.Image image38 = null;
        piePlot27.setBackgroundImage(image38);
        double double40 = piePlot27.getShadowYOffset();
        piePlot27.setIgnoreZeroValues(true);
        boolean boolean43 = piePlot1.equals((java.lang.Object) piePlot27);
        boolean boolean44 = piePlot27.getIgnoreNullValues();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(rectangle2D23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.08d + "'", double36 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.0d + "'", double40 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        java.awt.Image image19 = null;
        piePlot15.setBackgroundImage(image19);
        java.awt.Paint paint21 = piePlot15.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot15.setDataset(pieDataset22);
        java.awt.Paint paint24 = piePlot15.getBaseSectionPaint();
        piePlot1.setBaseSectionPaint(paint24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot21.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke24);
        piePlot21.setLabelGap((double) 0);
        piePlot21.setStartAngle((double) (-1.0f));
        java.awt.Paint paint30 = piePlot21.getLabelBackgroundPaint();
        piePlot1.setOutlinePaint(paint30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Stroke stroke36 = piePlot33.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot33.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        java.awt.Image image44 = null;
        piePlot40.setBackgroundImage(image44);
        java.awt.Paint paint46 = piePlot40.getLabelShadowPaint();
        piePlot40.setLabelGap(0.0d);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot40.setLabelLinkPaint(paint49);
        piePlot33.setLabelPaint(paint49);
        float float52 = piePlot33.getBackgroundAlpha();
        piePlot33.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset55 = piePlot33.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = piePlot33.getSimpleLabelOffset();
        piePlot1.setLabelPadding(rectangleInsets56);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNull(pieDataset55);
        org.junit.Assert.assertNotNull(rectangleInsets56);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        boolean boolean6 = piePlot1.isSubplot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setURLGenerator(pieURLGenerator7);
        java.awt.Graphics2D graphics2D9 = null;
        java.util.List list10 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlotState piePlotState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D9, list10, (double) (short) 10, rectangle2D12, rectangle2D13, piePlotState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setBaseSectionOutlineStroke(stroke16);
        java.awt.Paint paint18 = piePlot1.getBaseSectionOutlinePaint();
        java.awt.Paint paint19 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        piePlot21.setDataset(pieDataset28);
        double double30 = piePlot21.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot21.getLabelPadding();
        java.awt.Image image32 = null;
        piePlot21.setBackgroundImage(image32);
        double double34 = piePlot21.getLabelLinkMargin();
        java.awt.Paint paint35 = piePlot21.getOutlinePaint();
        java.awt.Paint paint36 = piePlot21.getBaseSectionOutlinePaint();
        piePlot1.setLabelBackgroundPaint(paint36);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.025d + "'", double34 == 0.025d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator11);
        piePlot1.setCircular(false, false);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        java.awt.Image image21 = null;
        piePlot17.setBackgroundImage(image21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = null;
        piePlot17.setToolTipGenerator(pieToolTipGenerator23);
        boolean boolean25 = piePlot17.getIgnoreNullValues();
        java.awt.Paint paint26 = piePlot17.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot28.getLegendLabelGenerator();
        piePlot17.setLegendLabelGenerator(pieSectionLabelGenerator29);
        boolean boolean31 = piePlot17.isCircular();
        piePlot17.setBackgroundImageAlignment((int) (short) 1);
        piePlot17.setShadowYOffset((double) (byte) -1);
        double double36 = piePlot17.getMaximumLabelWidth();
        piePlot17.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double41 = piePlot17.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke42 = piePlot17.getBaseSectionOutlineStroke();
        piePlot1.setOutlineStroke(stroke42);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.14d + "'", double36 == 0.14d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        boolean boolean8 = piePlot1.getSectionOutlinesVisible();
        boolean boolean9 = piePlot1.getSimpleLabels();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.addChangeListener(plotChangeListener10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot19.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot19.getNoDataMessagePaint();
        piePlot13.setLabelPaint(paint24);
        java.awt.Paint paint27 = piePlot13.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot13.setCircular(false);
        boolean boolean30 = piePlot1.equals((java.lang.Object) piePlot13);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        float float7 = piePlot1.getBackgroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot1.getInsets();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.isCircular();
        boolean boolean13 = piePlot1.getIgnoreZeroValues();
        double double14 = piePlot1.getShadowYOffset();
        piePlot1.setSimpleLabels(false);
        float float17 = piePlot1.getBackgroundImageAlpha();
        piePlot1.setShadowYOffset((double) (-1L));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float13 = piePlot1.getForegroundAlpha();
        java.awt.Paint paint14 = piePlot1.getLabelPaint();
        double double15 = piePlot1.getLabelLinkMargin();
        piePlot1.setNoDataMessage("");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot1.handleClick((int) (short) 1, 97, plotRenderingInfo20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        piePlot23.notifyListeners(plotChangeEvent25);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator27 = piePlot23.getToolTipGenerator();
        java.awt.Paint paint28 = piePlot23.getNoDataMessagePaint();
        piePlot23.setLabelGap(0.0d);
        java.awt.Paint paint33 = piePlot23.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        org.jfree.data.general.DatasetGroup datasetGroup34 = piePlot23.getDatasetGroup();
        double double35 = piePlot23.getInteriorGap();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot23);
        org.jfree.data.general.DatasetGroup datasetGroup37 = piePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(datasetGroup34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNull(datasetGroup37);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        java.awt.Image image9 = null;
        piePlot1.setBackgroundImage(image9);
        boolean boolean11 = piePlot1.getSimpleLabels();
        java.awt.Stroke stroke14 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) "Pie Plot", true);
        java.awt.Shape shape15 = piePlot1.getLegendItemShape();
        boolean boolean16 = piePlot1.isSubplot();
        java.awt.Stroke stroke17 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke18 = null;
        piePlot1.setLabelOutlineStroke(stroke18);
        double double20 = piePlot1.getMinimumArcAngleToDraw();
        piePlot1.setSimpleLabels(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNotNull(drawingSupplier23);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        java.awt.Paint paint10 = piePlot1.lookupSectionPaint((java.lang.Comparable) "", false);
        java.awt.Paint paint11 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot1.getLegendLabelGenerator();
        piePlot1.setIgnoreZeroValues(true);
        org.jfree.data.KeyedValues keyedValues15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PiePlotState piePlotState20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues15, graphics2D16, rectangle2D17, rectangle2D18, (float) (short) -1, piePlotState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot1.getDatasetGroup();
        java.awt.Paint paint17 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) '#');
        int int18 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint21 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        piePlot1.removeChangeListener(plotChangeListener32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        java.awt.Image image39 = null;
        piePlot35.setBackgroundImage(image39);
        java.awt.Paint paint41 = piePlot35.getLabelShadowPaint();
        piePlot35.setShadowXOffset(90.0d);
        piePlot35.setForegroundAlpha(10.0f);
        piePlot35.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = piePlot35.getLabelPadding();
        piePlot1.setInsets(rectangleInsets49);
        java.awt.Stroke stroke51 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator52 = piePlot1.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        java.awt.Paint paint57 = piePlot54.getLabelPaint();
        boolean boolean58 = piePlot54.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot59 = piePlot54.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent60 = null;
        piePlot54.axisChanged(axisChangeEvent60);
        java.lang.String str62 = piePlot54.getNoDataMessage();
        java.awt.Image image63 = null;
        piePlot54.setBackgroundImage(image63);
        org.jfree.data.general.PieDataset pieDataset65 = null;
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot(pieDataset65);
        double double67 = piePlot66.getShadowYOffset();
        java.awt.Stroke stroke69 = piePlot66.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot66.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset72 = null;
        org.jfree.chart.plot.PiePlot piePlot73 = new org.jfree.chart.plot.PiePlot(pieDataset72);
        piePlot73.setIgnoreNullValues(true);
        java.awt.Paint paint76 = piePlot73.getLabelPaint();
        java.awt.Image image77 = null;
        piePlot73.setBackgroundImage(image77);
        java.awt.Paint paint79 = piePlot73.getLabelShadowPaint();
        piePlot73.setLabelGap(0.0d);
        java.awt.Paint paint82 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot73.setLabelLinkPaint(paint82);
        piePlot66.setLabelPaint(paint82);
        piePlot54.setLabelLinkPaint(paint82);
        org.jfree.chart.util.RectangleInsets rectangleInsets86 = piePlot54.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets86);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNull(pieURLGenerator52);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(plot59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4.0d + "'", double67 == 4.0d);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertNotNull(rectangleInsets86);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint9 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot11.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot11.getSimpleLabelOffset();
        boolean boolean17 = piePlot1.equals((java.lang.Object) rectangleInsets16);
        float float18 = piePlot1.getForegroundAlpha();
        java.awt.Stroke stroke20 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 1.0d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(pieURLGenerator21);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        double double7 = piePlot1.getLabelGap();
        double double8 = piePlot1.getStartAngle();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        piePlot1.removeChangeListener(plotChangeListener32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        java.awt.Image image39 = null;
        piePlot35.setBackgroundImage(image39);
        java.awt.Paint paint41 = piePlot35.getLabelShadowPaint();
        piePlot35.setShadowXOffset(90.0d);
        piePlot35.setForegroundAlpha(10.0f);
        piePlot35.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = piePlot35.getLabelPadding();
        piePlot1.setInsets(rectangleInsets49);
        java.awt.Stroke stroke51 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.KeyedValues keyedValues52 = null;
        java.awt.Graphics2D graphics2D53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        org.jfree.chart.plot.PiePlotState piePlotState57 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues52, graphics2D53, rectangle2D54, rectangle2D55, 0.0f, piePlotState57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        java.awt.Paint paint23 = piePlot14.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        piePlot1.setForegroundAlpha((float) '#');
        java.awt.Font font28 = piePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        piePlot1.datasetChanged(datasetChangeEvent29);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        int int8 = piePlot1.getPieIndex();
        piePlot1.setCircular(true);
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) '4');
        java.awt.Stroke stroke13 = piePlot1.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        piePlot1.setNoDataMessage("Pie Plot");
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        java.awt.Image image11 = null;
        piePlot7.setBackgroundImage(image11);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator13 = null;
        piePlot7.setToolTipGenerator(pieToolTipGenerator13);
        boolean boolean15 = piePlot7.getIgnoreNullValues();
        java.awt.Stroke stroke16 = piePlot7.getLabelOutlineStroke();
        piePlot1.setBaseSectionOutlineStroke(stroke16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(datasetGroup21);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        piePlot1.setStartAngle((double) (byte) 0);
        java.awt.Image image17 = piePlot1.getBackgroundImage();
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        piePlot1.datasetChanged(datasetChangeEvent20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.isCircular();
        boolean boolean13 = piePlot1.getIgnoreZeroValues();
        java.awt.Paint paint15 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0.14d);
        boolean boolean16 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator14);
        double double16 = piePlot1.getLabelGap();
        java.awt.Image image17 = piePlot1.getBackgroundImage();
        java.awt.Paint paint18 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot1.getLabelPadding();
        piePlot1.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        double double18 = piePlot1.getShadowXOffset();
        java.awt.Paint paint19 = piePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = piePlot1.getDrawingSupplier();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot1.getURLGenerator();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        piePlot1.axisChanged(axisChangeEvent22);
        piePlot1.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNull(pieURLGenerator21);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setOutlineStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint13 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot1.getInsets();
        double double15 = piePlot1.getMaximumLabelWidth();
        piePlot1.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Paint paint5 = piePlot1.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getShadowYOffset();
        java.awt.Stroke stroke10 = piePlot7.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot7.setInteriorGap((double) (short) 0);
        java.awt.Stroke stroke14 = piePlot7.lookupSectionOutlineStroke((java.lang.Comparable) (short) 100);
        piePlot1.setLabelLinkStroke(stroke14);
        java.awt.Stroke stroke16 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke15 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot17.datasetChanged(datasetChangeEvent21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot24.handleClick((int) (byte) 0, 100, plotRenderingInfo29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        piePlot24.setLabelBackgroundPaint(paint35);
        piePlot17.setLabelShadowPaint(paint35);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot17);
        java.awt.Stroke stroke40 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) true);
        double double41 = piePlot17.getShadowXOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator42 = piePlot17.getLegendLabelURLGenerator();
        double double44 = piePlot17.getExplodePercent((java.lang.Comparable) 0.025d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator45 = piePlot17.getLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertNull(pieURLGenerator42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator45);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = piePlot1.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        boolean boolean21 = piePlot13.getIgnoreNullValues();
        java.awt.Stroke stroke22 = piePlot13.getLabelOutlineStroke();
        java.awt.Stroke stroke23 = piePlot13.getLabelOutlineStroke();
        java.awt.Stroke stroke26 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) 15, false);
        boolean boolean27 = piePlot13.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        boolean boolean33 = piePlot29.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot34 = piePlot29.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent35 = null;
        piePlot29.axisChanged(axisChangeEvent35);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        piePlot38.setIgnoreNullValues(true);
        java.awt.Paint paint41 = piePlot38.getLabelPaint();
        piePlot29.setBaseSectionPaint(paint41);
        org.jfree.data.general.DatasetGroup datasetGroup43 = piePlot29.getDatasetGroup();
        java.awt.Paint paint44 = piePlot29.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        java.awt.Image image50 = null;
        piePlot46.setBackgroundImage(image50);
        java.awt.Paint paint52 = piePlot46.getLabelShadowPaint();
        piePlot46.setShadowXOffset(90.0d);
        piePlot46.setForegroundAlpha(10.0f);
        piePlot46.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset60 = null;
        org.jfree.chart.plot.PiePlot piePlot61 = new org.jfree.chart.plot.PiePlot(pieDataset60);
        piePlot61.setIgnoreNullValues(true);
        java.awt.Paint paint64 = piePlot61.getLabelPaint();
        java.awt.Image image65 = null;
        piePlot61.setBackgroundImage(image65);
        java.awt.Paint paint67 = piePlot61.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset68 = null;
        piePlot61.setDataset(pieDataset68);
        piePlot46.setParent((org.jfree.chart.plot.Plot) piePlot61);
        org.jfree.data.general.PieDataset pieDataset71 = null;
        org.jfree.chart.plot.PiePlot piePlot72 = new org.jfree.chart.plot.PiePlot(pieDataset71);
        double double73 = piePlot72.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent74 = null;
        piePlot72.notifyListeners(plotChangeEvent74);
        org.jfree.chart.util.RectangleInsets rectangleInsets76 = piePlot72.getSimpleLabelOffset();
        java.awt.Paint paint77 = piePlot72.getLabelBackgroundPaint();
        piePlot61.setLabelPaint(paint77);
        piePlot61.setForegroundAlpha((float) (short) 0);
        java.awt.Paint paint81 = piePlot61.getLabelBackgroundPaint();
        piePlot29.setBackgroundPaint(paint81);
        piePlot13.setLabelShadowPaint(paint81);
        piePlot1.setBackgroundPaint(paint81);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(plot34);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(datasetGroup43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0E-5d + "'", double73 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets76);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertNotNull(paint81);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setShadowXOffset((double) 0.0f);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        double double10 = piePlot1.getLabelGap();
        java.awt.Stroke stroke11 = piePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        java.awt.Stroke stroke39 = piePlot24.getLabelOutlineStroke();
        java.lang.String str40 = piePlot24.getNoDataMessage();
        double double41 = piePlot24.getShadowYOffset();
        piePlot24.setIgnoreZeroValues(true);
        piePlot24.setIgnoreNullValues(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = piePlot24.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertNull(pieURLGenerator46);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot1.setDataset(pieDataset9);
        boolean boolean11 = piePlot1.getLabelLinksVisible();
        piePlot1.setIgnoreZeroValues(true);
        piePlot1.setSimpleLabels(false);
        piePlot1.setMaximumLabelWidth((double) 10L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        boolean boolean7 = piePlot1.getIgnoreZeroValues();
        float float8 = piePlot1.getBackgroundAlpha();
        double double9 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        piePlot1.setMinimumArcAngleToDraw((double) 15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Stroke stroke10 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        piePlot1.axisChanged(axisChangeEvent11);
        piePlot1.setNoDataMessage("hi!");
        piePlot1.setMaximumLabelWidth((double) (byte) 0);
        java.awt.Paint paint17 = piePlot1.getBaseSectionOutlinePaint();
        piePlot1.setPieIndex((int) '4');
        boolean boolean20 = piePlot1.getLabelLinksVisible();
        java.awt.Image image21 = piePlot1.getBackgroundImage();
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint23 = piePlot1.lookupSectionPaint(comparable22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(image21);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        java.awt.Paint paint21 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) false);
        piePlot1.setForegroundAlpha(100.0f);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = null;
        piePlot25.setLegendLabelURLGenerator(pieURLGenerator29);
        java.lang.Comparable comparable32 = piePlot25.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        piePlot25.drawBackgroundImage(graphics2D33, rectangle2D34);
        java.awt.Font font36 = piePlot25.getNoDataMessageFont();
        piePlot1.setLabelFont(font36);
        java.awt.Paint paint38 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 100 + "'", comparable32, 100);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setOutlineStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint13 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset14 = piePlot1.getDataset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieDataset14);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.awt.Paint paint6 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke7 = piePlot1.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        piePlot1.setPieIndex((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot18 = piePlot13.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        piePlot13.axisChanged(axisChangeEvent19);
        java.lang.String str21 = piePlot13.getNoDataMessage();
        java.awt.Image image22 = null;
        piePlot13.setBackgroundImage(image22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Image image29 = null;
        piePlot25.setBackgroundImage(image29);
        java.awt.Paint paint31 = piePlot25.getLabelShadowPaint();
        piePlot13.setLabelBackgroundPaint(paint31);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getShadowYOffset();
        java.awt.Image image36 = piePlot34.getBackgroundImage();
        piePlot34.setIgnoreZeroValues(false);
        java.awt.Paint paint39 = piePlot34.getOutlinePaint();
        piePlot13.setBackgroundPaint(paint39);
        piePlot1.setLabelPaint(paint39);
        double double42 = piePlot1.getLabelLinkMargin();
        java.awt.Paint paint43 = piePlot1.getShadowPaint();
        float float44 = piePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.0d + "'", double35 == 4.0d);
        org.junit.Assert.assertNull(image36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.025d + "'", double42 == 0.025d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        piePlot1.setCircular(true, false);
        piePlot1.setShadowXOffset(0.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = piePlot1.getDrawingSupplier();
        double double14 = piePlot1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot16.notifyListeners(plotChangeEvent18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot16.getSimpleLabelOffset();
        boolean boolean21 = piePlot16.getIgnoreNullValues();
        piePlot16.setForegroundAlpha((float) 1);
        piePlot16.setCircular(false);
        java.awt.Stroke stroke26 = piePlot16.getOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        java.awt.Image image32 = null;
        piePlot28.setBackgroundImage(image32);
        java.awt.Paint paint34 = piePlot28.getLabelShadowPaint();
        piePlot28.setShadowXOffset(90.0d);
        piePlot28.setForegroundAlpha(10.0f);
        piePlot28.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        java.awt.Image image47 = null;
        piePlot43.setBackgroundImage(image47);
        java.awt.Paint paint49 = piePlot43.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset50 = null;
        piePlot43.setDataset(pieDataset50);
        piePlot28.setParent((org.jfree.chart.plot.Plot) piePlot43);
        boolean boolean53 = piePlot43.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        piePlot55.setIgnoreNullValues(true);
        java.awt.Paint paint58 = piePlot55.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent59 = null;
        piePlot55.datasetChanged(datasetChangeEvent59);
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot55.getLabelPadding();
        piePlot43.setInsets(rectangleInsets61, false);
        piePlot16.setLabelPadding(rectangleInsets61);
        piePlot1.setLabelPadding(rectangleInsets61);
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator68 = piePlot67.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = piePlot67.getInsets();
        double double70 = piePlot67.getLabelLinkMargin();
        java.awt.Image image71 = null;
        piePlot67.setBackgroundImage(image71);
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = piePlot67.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets73);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(rectangleInsets61);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator68);
        org.junit.Assert.assertNotNull(rectangleInsets69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.025d + "'", double70 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets73);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        double double9 = piePlot1.getInteriorGap();
        boolean boolean10 = piePlot1.isCircular();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        java.awt.Paint paint10 = piePlot1.lookupSectionPaint((java.lang.Comparable) "", false);
        java.awt.Paint paint11 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot1.getLegendLabelGenerator();
        piePlot1.setIgnoreZeroValues(true);
        java.awt.Paint paint16 = piePlot1.getSectionPaint((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertNull(paint16);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        double double8 = piePlot1.getStartAngle();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        piePlot1.markerChanged(markerChangeEvent9);
        piePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        java.awt.Font font12 = piePlot1.getLabelFont();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setShadowXOffset((double) 0.0f);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.chart.plot.Plot plot9 = piePlot1.getParent();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        piePlot11.setNoDataMessage("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot11.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets16);
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.plot.PiePlotState piePlotState19 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D18, piePlotState19, pieLabelRecord20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot1.notifyListeners(plotChangeEvent8);
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = piePlot1.getArcBounds(rectangle2D10, rectangle2D11, (double) (byte) 10, 4.0d, (double) (short) 0);
        piePlot1.setLabelLinkMargin((double) 0.5f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNull(rectangle2D15);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.awt.Graphics2D graphics2D7 = null;
        java.util.List list8 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PiePlotState piePlotState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D7, list8, (double) ' ', rectangle2D10, rectangle2D11, piePlotState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = null;
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator8);
        java.awt.Stroke stroke11 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 10);
        java.awt.Paint paint12 = piePlot1.getBackgroundPaint();
        java.awt.Paint paint13 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot11.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets13, false);
        piePlot1.setShadowXOffset((double) (byte) 100);
        boolean boolean18 = piePlot1.getLabelLinksVisible();
        double double20 = piePlot1.getExplodePercent((java.lang.Comparable) 52);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float13 = piePlot1.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLabelGenerator();
        piePlot1.setShadowXOffset((double) (byte) 10);
        double double17 = piePlot1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot19.setLegendLabelURLGenerator(pieURLGenerator23);
        java.lang.Comparable comparable26 = piePlot19.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot19.drawBackgroundImage(graphics2D27, rectangle2D28);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor30 = piePlot19.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor30);
        piePlot1.zoom((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 100 + "'", comparable26, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor30);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        java.awt.Image image8 = piePlot1.getBackgroundImage();
        java.awt.Paint paint9 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint10 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint11 = piePlot1.getBaseSectionPaint();
        double double12 = piePlot1.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.025d + "'", double12 == 0.025d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        double double20 = piePlot1.getShadowYOffset();
        piePlot1.setBackgroundImageAlignment(32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("Pie Plot");
        piePlot1.setMaximumLabelWidth(0.0d);
        java.awt.Paint paint8 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot24.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = piePlot24.getLabelShadowPaint();
        double double42 = piePlot24.getShadowXOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot24.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = null;
        piePlot45.notifyListeners(plotChangeEvent47);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = piePlot45.getSimpleLabelOffset();
        java.awt.Paint paint50 = piePlot45.getLabelBackgroundPaint();
        double double51 = piePlot45.getStartAngle();
        piePlot45.setCircular(true, false);
        piePlot45.setShadowXOffset(0.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier57 = piePlot45.getDrawingSupplier();
        double double58 = piePlot45.getLabelLinkMargin();
        piePlot24.setParent((org.jfree.chart.plot.Plot) piePlot45);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.0d + "'", double42 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0E-5d + "'", double46 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 90.0d + "'", double51 == 90.0d);
        org.junit.Assert.assertNotNull(drawingSupplier57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.025d + "'", double58 == 0.025d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        java.awt.Font font8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setLabelFont(font8);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = piePlot12.getLabelShadowPaint();
        piePlot12.setLabelGap(0.0d);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot12.setLabelLinkPaint(paint21);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        java.awt.Stroke stroke27 = null;
        piePlot25.setSectionOutlineStroke((java.lang.Comparable) '#', stroke27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        piePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator34 = piePlot30.getToolTipGenerator();
        java.awt.Paint paint35 = piePlot30.getNoDataMessagePaint();
        piePlot30.setLabelGap(0.0d);
        java.awt.Paint paint40 = piePlot30.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot25.setLabelPaint(paint40);
        piePlot12.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint40);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 10, paint40);
        piePlot1.zoom((double) (short) 1);
        boolean boolean46 = piePlot1.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot1.getInsets();
        float float48 = piePlot1.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset49 = null;
        piePlot1.setDataset(pieDataset49);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-5d + "'", double31 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.removeChangeListener(plotChangeListener10);
        piePlot1.setCircular(false);
        java.awt.Paint paint14 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint9 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot11.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot11.getSimpleLabelOffset();
        boolean boolean17 = piePlot1.equals((java.lang.Object) rectangleInsets16);
        double double18 = piePlot1.getLabelLinkMargin();
        boolean boolean19 = piePlot1.isCircular();
        org.jfree.chart.plot.Plot plot20 = piePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        boolean boolean5 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint6 = piePlot1.getLabelPaint();
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D12 = piePlot1.getArcBounds(rectangle2D7, rectangle2D8, (double) (-1L), (double) 100.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset16 = piePlot1.getDataset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot1.removeChangeListener(plotChangeListener17);
        piePlot1.setLabelLinkMargin((double) (byte) 100);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = null;
        piePlot1.setURLGenerator(pieURLGenerator21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(pieDataset16);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot1.getLabelDistributor();
        piePlot1.setMinimumArcAngleToDraw((double) 97);
        piePlot1.setLabelLinkMargin((double) 100.0f);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getShadowYOffset();
        java.awt.Image image21 = piePlot19.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot19.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot19.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Image image26 = null;
        piePlot19.setBackgroundImage(image26);
        java.awt.Stroke stroke30 = piePlot19.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float31 = piePlot19.getForegroundAlpha();
        java.awt.Paint paint32 = piePlot19.getLabelPaint();
        double double33 = piePlot19.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        java.awt.Image image40 = null;
        piePlot36.setBackgroundImage(image40);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator42 = null;
        piePlot36.setToolTipGenerator(pieToolTipGenerator42);
        boolean boolean44 = piePlot36.getIgnoreNullValues();
        java.awt.Paint paint45 = piePlot36.getLabelPaint();
        piePlot19.setSectionOutlinePaint((java.lang.Comparable) (short) 0, paint45);
        piePlot1.setSectionPaint((java.lang.Comparable) 0.0f, paint45);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.08d + "'", double33 == 0.08d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        double double8 = piePlot1.getStartAngle();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint12 = piePlot1.getBaseSectionPaint();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        piePlot1.setExplodePercent((java.lang.Comparable) false, 0.4d);
        piePlot1.setSimpleLabels(false);
        java.awt.Paint paint14 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSimpleLabels(false);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        java.awt.Image image13 = null;
        piePlot9.setBackgroundImage(image13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot9.setToolTipGenerator(pieToolTipGenerator15);
        boolean boolean17 = piePlot9.getIgnoreNullValues();
        java.awt.Paint paint18 = piePlot9.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot20.getLegendLabelGenerator();
        piePlot9.setLegendLabelGenerator(pieSectionLabelGenerator21);
        boolean boolean23 = piePlot9.isCircular();
        piePlot9.setBackgroundImageAlignment((int) (short) 1);
        piePlot9.setShadowYOffset((double) (byte) -1);
        double double28 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot9.getLabelPadding();
        piePlot1.setInsets(rectangleInsets29);
        piePlot1.setSimpleLabels(true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setSimpleLabels(true);
        piePlot0.zoom(0.08d);
        piePlot0.setLabelGap((double) 0.0f);
        java.awt.Font font7 = piePlot0.getLabelFont();
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot6.notifyListeners(plotChangeEvent8);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint11 = piePlot6.getNoDataMessagePaint();
        piePlot6.setLabelGap(0.0d);
        java.awt.Paint paint16 = piePlot6.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelPaint(paint16);
        java.awt.Paint paint18 = piePlot1.getLabelLinkPaint();
        piePlot1.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot22.setToolTipGenerator(pieToolTipGenerator28);
        boolean boolean30 = piePlot22.getIgnoreZeroValues();
        java.awt.Paint paint31 = piePlot22.getShadowPaint();
        piePlot1.setLabelPaint(paint31);
        piePlot1.setExplodePercent((java.lang.Comparable) false, 4.0d);
        java.awt.Paint paint37 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 100);
        boolean boolean38 = piePlot1.getLabelLinksVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator39);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Stroke stroke6 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.plot.PiePlotState piePlotState8 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D7, piePlotState8, pieLabelRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setShadowXOffset(90.0d);
        piePlot8.setForegroundAlpha(10.0f);
        piePlot8.setCircular(true, false);
        double double22 = piePlot8.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot8.setSimpleLabelOffset(rectangleInsets23);
        piePlot8.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        java.awt.Stroke stroke31 = null;
        piePlot29.setSectionOutlineStroke((java.lang.Comparable) '#', stroke31);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        piePlot34.notifyListeners(plotChangeEvent36);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator38 = piePlot34.getToolTipGenerator();
        java.awt.Paint paint39 = piePlot34.getNoDataMessagePaint();
        piePlot34.setLabelGap(0.0d);
        java.awt.Paint paint44 = piePlot34.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot29.setLabelPaint(paint44);
        java.awt.Paint paint46 = piePlot29.getLabelLinkPaint();
        piePlot29.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        piePlot50.setIgnoreNullValues(true);
        java.awt.Paint paint53 = piePlot50.getLabelPaint();
        java.awt.Image image54 = null;
        piePlot50.setBackgroundImage(image54);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator56 = null;
        piePlot50.setToolTipGenerator(pieToolTipGenerator56);
        boolean boolean58 = piePlot50.getIgnoreZeroValues();
        java.awt.Paint paint59 = piePlot50.getShadowPaint();
        piePlot29.setLabelPaint(paint59);
        piePlot8.setLabelShadowPaint(paint59);
        java.awt.Paint paint64 = piePlot8.lookupSectionPaint((java.lang.Comparable) '4', false);
        piePlot1.setLabelShadowPaint(paint64);
        java.awt.Paint paint66 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(paint66);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        float float10 = piePlot1.getForegroundAlpha();
        boolean boolean11 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot1.setURLGenerator(pieURLGenerator12);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        boolean boolean19 = piePlot15.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator20 = null;
        piePlot15.setToolTipGenerator(pieToolTipGenerator20);
        java.awt.Paint paint23 = piePlot15.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        piePlot25.notifyListeners(plotChangeEvent27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot25.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot25.getSimpleLabelOffset();
        boolean boolean31 = piePlot15.equals((java.lang.Object) rectangleInsets30);
        double double32 = piePlot15.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        java.awt.Image image38 = null;
        piePlot34.setBackgroundImage(image38);
        java.awt.Paint paint40 = piePlot34.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        piePlot34.setDataset(pieDataset41);
        double double43 = piePlot34.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot34.getLabelPadding();
        piePlot15.setInsets(rectangleInsets44, false);
        java.awt.Stroke stroke48 = piePlot15.lookupSectionOutlineStroke((java.lang.Comparable) "");
        piePlot1.setOutlineStroke(stroke48);
        java.awt.Paint paint50 = piePlot1.getShadowPaint();
        java.awt.Paint paint51 = piePlot1.getBaseSectionOutlinePaint();
        double double53 = piePlot1.getExplodePercent((java.lang.Comparable) "Pie Plot");
        org.jfree.chart.plot.Plot plot54 = piePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.025d + "'", double32 == 0.025d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.08d + "'", double43 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(plot54);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        piePlot1.setCircular(true, false);
        piePlot1.setShadowYOffset(0.4d);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot14.getLegendLabelGenerator();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot14.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke17);
        piePlot14.setLabelGap((double) 0);
        java.awt.Paint paint21 = piePlot14.getLabelShadowPaint();
        double double22 = piePlot14.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint30 = piePlot24.getLabelShadowPaint();
        piePlot24.setLabelGap(0.0d);
        java.awt.Image image33 = piePlot24.getBackgroundImage();
        float float34 = piePlot24.getBackgroundImageAlpha();
        double double36 = piePlot24.getExplodePercent((java.lang.Comparable) 90.0d);
        java.awt.Paint paint37 = piePlot24.getLabelOutlinePaint();
        java.awt.Paint paint39 = piePlot24.getSectionOutlinePaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        boolean boolean46 = piePlot42.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot47 = piePlot42.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent48 = null;
        piePlot42.axisChanged(axisChangeEvent48);
        java.lang.String str50 = piePlot42.getNoDataMessage();
        java.awt.Image image51 = null;
        piePlot42.setBackgroundImage(image51);
        boolean boolean53 = piePlot42.isSubplot();
        java.awt.Paint paint56 = piePlot42.lookupSectionOutlinePaint((java.lang.Comparable) (-1L), false);
        piePlot24.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint56);
        piePlot14.setLabelBackgroundPaint(paint56);
        piePlot1.setLabelPaint(paint56);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(image33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(plot47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        float float6 = piePlot1.getForegroundAlpha();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        piePlot1.setLabelGap((double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        piePlot1.setLabelBackgroundPaint(paint12);
        piePlot1.setShadowYOffset((double) (byte) -1);
        org.jfree.data.general.PieDataset pieDataset16 = piePlot1.getDataset();
        java.awt.Paint paint18 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot1.setLabelLinksVisible(false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieDataset16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        java.awt.Stroke stroke39 = piePlot24.getLabelOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection40 = piePlot24.getLegendItems();
        piePlot24.setCircular(false, false);
        java.awt.Stroke stroke45 = piePlot24.getSectionOutlineStroke((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(legendItemCollection40);
        org.junit.Assert.assertNull(stroke45);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent1 = null;
        piePlot0.notifyListeners(plotChangeEvent1);
        piePlot0.setLabelLinksVisible(false);
        java.awt.Paint paint5 = piePlot0.getLabelBackgroundPaint();
        java.lang.Comparable comparable7 = piePlot0.getSectionKey((int) (byte) 0);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot0.datasetChanged(datasetChangeEvent8);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 0 + "'", comparable7, 0);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.awt.Paint paint6 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke7 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getShadowYOffset();
        java.awt.Stroke stroke12 = piePlot9.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot9.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        piePlot16.setLabelGap(0.0d);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot16.setLabelLinkPaint(paint25);
        piePlot9.setLabelPaint(paint25);
        float float28 = piePlot9.getBackgroundAlpha();
        piePlot9.setShadowXOffset((double) 0L);
        int int31 = piePlot9.getBackgroundImageAlignment();
        java.awt.Paint paint34 = piePlot9.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        piePlot1.setLabelShadowPaint(paint34);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot6.notifyListeners(plotChangeEvent8);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint11 = piePlot6.getNoDataMessagePaint();
        piePlot6.setLabelGap(0.0d);
        java.awt.Paint paint16 = piePlot6.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelPaint(paint16);
        java.awt.Paint paint18 = piePlot1.getLabelLinkPaint();
        double double19 = piePlot1.getStartAngle();
        int int20 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint21 = piePlot1.getLabelOutlinePaint();
        piePlot1.setNoDataMessage("");
        piePlot1.setCircular(true, true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        piePlot1.setLabelLinkMargin((double) 'a');
        java.awt.Stroke stroke5 = piePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Paint paint15 = piePlot11.getNoDataMessagePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) 0.025d, paint15);
        java.awt.Paint paint17 = piePlot1.getShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        java.awt.Paint paint23 = piePlot14.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        piePlot1.setForegroundAlpha((float) '#');
        double double28 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint29 = piePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot1.drawBackgroundImage(graphics2D30, rectangle2D31);
        piePlot1.setShadowXOffset((double) 32);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        java.awt.Image image40 = null;
        piePlot36.setBackgroundImage(image40);
        java.awt.Paint paint42 = piePlot36.getLabelShadowPaint();
        piePlot36.setLabelGap(0.0d);
        java.awt.Paint paint45 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot36.setLabelLinkPaint(paint45);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        java.awt.Stroke stroke51 = null;
        piePlot49.setSectionOutlineStroke((java.lang.Comparable) '#', stroke51);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        double double55 = piePlot54.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent56 = null;
        piePlot54.notifyListeners(plotChangeEvent56);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator58 = piePlot54.getToolTipGenerator();
        java.awt.Paint paint59 = piePlot54.getNoDataMessagePaint();
        piePlot54.setLabelGap(0.0d);
        java.awt.Paint paint64 = piePlot54.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot49.setLabelPaint(paint64);
        piePlot36.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint64);
        java.awt.Paint paint68 = piePlot36.lookupSectionOutlinePaint((java.lang.Comparable) 0.0f);
        piePlot1.setLabelBackgroundPaint(paint68);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0E-5d + "'", double55 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(paint68);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setForegroundAlpha((float) 1);
        piePlot1.setCircular(false);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = piePlot1.getLegendItems();
        org.jfree.chart.util.Rotation rotation12 = piePlot1.getDirection();
        piePlot1.setBackgroundImageAlignment((int) (byte) 1);
        boolean boolean15 = piePlot1.isCircular();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        double double7 = piePlot1.getStartAngle();
        piePlot1.setPieIndex((int) (short) 1);
        java.awt.Paint paint10 = piePlot1.getBackgroundPaint();
        piePlot1.setForegroundAlpha((float) 52);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        piePlot1.markerChanged(markerChangeEvent12);
        java.awt.Stroke stroke14 = piePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot15 = piePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        boolean boolean8 = piePlot1.isSubplot();
        java.awt.Paint paint11 = piePlot1.lookupSectionPaint((java.lang.Comparable) (byte) -1, true);
        piePlot1.setExplodePercent((java.lang.Comparable) 1.0f, 100.0d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot1.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot18.setToolTipGenerator(pieToolTipGenerator24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        piePlot18.setDataset(pieDataset26);
        java.awt.Stroke stroke30 = piePlot18.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke30);
        int int32 = piePlot1.getPieIndex();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        piePlot1.markerChanged(markerChangeEvent6);
        piePlot1.setShadowXOffset((double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Shape shape16 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        piePlot1.setLegendItemShape(shape16);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setBaseSectionOutlineStroke(stroke4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        java.awt.Stroke stroke39 = piePlot24.getLabelOutlineStroke();
        java.lang.String str40 = piePlot24.getNoDataMessage();
        double double41 = piePlot24.getShadowYOffset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent42 = null;
        piePlot24.notifyListeners(plotChangeEvent42);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        int int4 = piePlot1.getPieIndex();
        piePlot1.setNoDataMessage("");
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        boolean boolean12 = piePlot8.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot13 = piePlot8.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        piePlot8.axisChanged(axisChangeEvent14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = piePlot8.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot8.setDataset(pieDataset17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getShadowYOffset();
        java.awt.Stroke stroke23 = piePlot20.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot8.setBaseSectionOutlineStroke(stroke23);
        piePlot8.setOutlineVisible(false);
        java.awt.Stroke stroke27 = piePlot8.getBaseSectionOutlineStroke();
        piePlot1.setBaseSectionOutlineStroke(stroke27);
        double double29 = piePlot1.getStartAngle();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint31 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 90.0d + "'", double29 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        piePlot1.setLabelOutlinePaint(paint19);
        double double21 = piePlot1.getLabelGap();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        boolean boolean8 = piePlot1.getSectionOutlinesVisible();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        piePlot1.setStartAngle((double) 100L);
        java.awt.Paint paint11 = piePlot1.getSectionPaint((java.lang.Comparable) (-1L));
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        boolean boolean21 = piePlot13.getIgnoreZeroValues();
        java.awt.Paint paint22 = piePlot13.getShadowPaint();
        piePlot13.zoom((double) (-1.0f));
        double double25 = piePlot13.getMaximumLabelWidth();
        java.awt.Paint paint26 = piePlot13.getBaseSectionOutlinePaint();
        piePlot1.setOutlinePaint(paint26);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        java.awt.Paint paint8 = piePlot1.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot1.setDataset(pieDataset9);
        java.awt.Stroke stroke11 = piePlot1.getLabelOutlineStroke();
        java.awt.Paint paint12 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setOutlineStroke(stroke10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot1.setURLGenerator(pieURLGenerator12);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        piePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        piePlot1.setForegroundAlpha(100.0f);
        java.awt.Paint paint14 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.14d, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getShadowYOffset();
        java.awt.Stroke stroke19 = piePlot16.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot16.getLegendLabelGenerator();
        java.awt.Paint paint21 = piePlot16.getBackgroundPaint();
        piePlot16.setStartAngle((double) 0L);
        java.awt.Paint paint24 = piePlot16.getLabelOutlinePaint();
        piePlot1.setShadowPaint(paint24);
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.plot.PiePlotState piePlotState27 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord28 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D26, piePlotState27, pieLabelRecord28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Image image10 = piePlot8.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot8.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot8.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Image image15 = null;
        piePlot8.setBackgroundImage(image15);
        java.awt.Stroke stroke19 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float20 = piePlot8.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot8.getLabelGenerator();
        piePlot8.setShadowXOffset((double) (byte) 10);
        double double24 = piePlot8.getLabelLinkMargin();
        piePlot8.setIgnoreZeroValues(false);
        java.awt.Paint paint27 = piePlot8.getShadowPaint();
        java.awt.Paint paint28 = piePlot8.getNoDataMessagePaint();
        piePlot1.setBaseSectionOutlinePaint(paint28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setBaseSectionOutlineStroke(stroke16);
        piePlot1.setOutlineVisible(false);
        java.awt.Stroke stroke20 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot1.getLabelGenerator();
        float float22 = piePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.plot.PiePlotState piePlotState24 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D23, piePlotState24, pieLabelRecord25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator11);
        java.awt.Paint paint13 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        piePlot1.setForegroundAlpha((float) 0);
        java.awt.Paint paint27 = piePlot1.getLabelBackgroundPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot1.getLabelGenerator();
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D34 = piePlot1.getArcBounds(rectangle2D29, rectangle2D30, 0.0d, 90.0d, (double) 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator28);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        java.awt.Paint paint9 = piePlot1.getBaseSectionOutlinePaint();
        java.awt.Paint paint10 = piePlot1.getBackgroundPaint();
        java.awt.Paint paint13 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "hi!", false);
        java.awt.Paint paint14 = piePlot1.getLabelLinkPaint();
        boolean boolean15 = piePlot1.isCircular();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot1.setDataset(pieDataset16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        java.awt.Image image8 = piePlot1.getBackgroundImage();
        java.awt.Paint paint9 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint10 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint11 = piePlot1.getBaseSectionPaint();
        boolean boolean12 = piePlot1.isOutlineVisible();
        boolean boolean13 = piePlot1.getIgnoreNullValues();
        double double14 = piePlot1.getStartAngle();
        double double16 = piePlot1.getExplodePercent((java.lang.Comparable) 32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.KeyedValues keyedValues11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues11, graphics2D12, rectangle2D13, rectangle2D14, 0.0f, piePlotState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint5 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 97);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot16 = piePlot11.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        piePlot11.axisChanged(axisChangeEvent17);
        java.lang.String str19 = piePlot11.getNoDataMessage();
        java.awt.Image image20 = null;
        piePlot11.setBackgroundImage(image20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        java.awt.Image image27 = null;
        piePlot23.setBackgroundImage(image27);
        java.awt.Paint paint29 = piePlot23.getLabelShadowPaint();
        piePlot11.setLabelBackgroundPaint(paint29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = null;
        piePlot11.setURLGenerator(pieURLGenerator31);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        piePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(pieDataset10);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot1.getLegendLabelToolTipGenerator();
        piePlot1.setBackgroundImageAlpha(1.0f);
        double double11 = piePlot1.getLabelGap();
        java.awt.Paint paint12 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot1.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieSectionLabelGenerator13);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot1.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint31 = piePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        piePlot1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        piePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        piePlot1.removeChangeListener(plotChangeListener19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        java.awt.Paint paint8 = piePlot1.getLabelShadowPaint();
        java.awt.Paint paint9 = piePlot1.getLabelOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = piePlot1.getLegendItems();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot1.getURLGenerator();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNull(pieURLGenerator11);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        piePlot1.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke15 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot17.datasetChanged(datasetChangeEvent21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot24.handleClick((int) (byte) 0, 100, plotRenderingInfo29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        piePlot24.setLabelBackgroundPaint(paint35);
        piePlot17.setLabelShadowPaint(paint35);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot17);
        java.awt.Stroke stroke40 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) true);
        double double41 = piePlot17.getShadowXOffset();
        piePlot17.setPieIndex((int) (short) 10);
        org.jfree.chart.plot.Plot plot44 = null;
        piePlot17.setParent(plot44);
        java.awt.Paint paint46 = piePlot17.getShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        boolean boolean10 = piePlot1.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getShadowYOffset();
        java.awt.Image image14 = piePlot12.getBackgroundImage();
        piePlot12.setIgnoreZeroValues(false);
        java.awt.Paint paint17 = piePlot12.getOutlinePaint();
        piePlot1.setNoDataMessagePaint(paint17);
        double double19 = piePlot1.getLabelGap();
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint22 = piePlot1.lookupSectionOutlinePaint(comparable20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot1.getLabelDistributor();
        double double9 = piePlot1.getStartAngle();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        java.awt.Font font19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot14.setNoDataMessageFont(font19);
        piePlot1.setLabelFont(font19);
        piePlot1.setMinimumArcAngleToDraw((double) 100.0f);
        org.jfree.chart.plot.Plot plot24 = piePlot1.getRootPlot();
        java.awt.Paint paint25 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        boolean boolean21 = piePlot1.isOutlineVisible();
        piePlot1.setPieIndex((int) (byte) 100);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot1.addChangeListener(plotChangeListener24);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        java.awt.Paint paint6 = piePlot1.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot8.getSimpleLabelOffset();
        piePlot8.setNoDataMessage("Pie Plot");
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator20 = null;
        piePlot14.setToolTipGenerator(pieToolTipGenerator20);
        boolean boolean22 = piePlot14.getIgnoreNullValues();
        java.awt.Stroke stroke23 = piePlot14.getLabelOutlineStroke();
        piePlot8.setBaseSectionOutlineStroke(stroke23);
        piePlot1.setLabelLinkStroke(stroke23);
        java.awt.Paint paint26 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getShadowYOffset();
        java.awt.Image image18 = piePlot16.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot16.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Image image23 = null;
        piePlot16.setBackgroundImage(image23);
        java.awt.Stroke stroke27 = piePlot16.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float28 = piePlot16.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot16.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator29);
        piePlot1.setForegroundAlpha((float) (byte) 100);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot1.getLabelDistributor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator29);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        java.awt.Image image9 = null;
        piePlot1.setBackgroundImage(image9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        piePlot1.setLabelLinkMargin(0.0d);
        java.awt.Paint paint14 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        piePlot1.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot1.handleClick((int) 'a', (int) ' ', plotRenderingInfo14);
        boolean boolean16 = piePlot1.getSimpleLabels();
        boolean boolean17 = piePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        piePlot1.setCircular(true, false);
        piePlot1.setLabelGap((double) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot1.getLabelPadding();
        java.awt.Paint paint14 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        piePlot1.markerChanged(markerChangeEvent7);
        java.awt.Paint paint10 = null;
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) (byte) 10, paint10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset16 = piePlot1.getDataset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot1.removeChangeListener(plotChangeListener17);
        piePlot1.setLabelLinkMargin((double) (byte) 100);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        piePlot1.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(pieDataset16);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setOutlineStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint13 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot1.getInsets();
        double double15 = piePlot1.getMaximumLabelWidth();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        boolean boolean8 = piePlot1.getSectionOutlinesVisible();
        boolean boolean9 = piePlot1.getSimpleLabels();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.addChangeListener(plotChangeListener10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot19.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot19.getNoDataMessagePaint();
        piePlot13.setLabelPaint(paint24);
        java.awt.Paint paint27 = piePlot13.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot13.setCircular(false);
        boolean boolean30 = piePlot1.equals((java.lang.Object) piePlot13);
        piePlot13.setCircular(false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot1.getLabelDistributor();
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 97, false);
        boolean boolean16 = piePlot1.isOutlineVisible();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) ' ', false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        piePlot1.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke26 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot28.getSimpleLabelOffset();
        boolean boolean33 = piePlot28.getIgnoreNullValues();
        piePlot28.setForegroundAlpha((float) 1);
        piePlot28.setCircular(false);
        java.awt.Stroke stroke38 = piePlot28.getOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        java.awt.Image image44 = null;
        piePlot40.setBackgroundImage(image44);
        java.awt.Paint paint46 = piePlot40.getLabelShadowPaint();
        piePlot40.setShadowXOffset(90.0d);
        piePlot40.setForegroundAlpha(10.0f);
        piePlot40.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        piePlot55.setIgnoreNullValues(true);
        java.awt.Paint paint58 = piePlot55.getLabelPaint();
        java.awt.Image image59 = null;
        piePlot55.setBackgroundImage(image59);
        java.awt.Paint paint61 = piePlot55.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset62 = null;
        piePlot55.setDataset(pieDataset62);
        piePlot40.setParent((org.jfree.chart.plot.Plot) piePlot55);
        boolean boolean65 = piePlot55.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        piePlot67.setIgnoreNullValues(true);
        java.awt.Paint paint70 = piePlot67.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent71 = null;
        piePlot67.datasetChanged(datasetChangeEvent71);
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = piePlot67.getLabelPadding();
        piePlot55.setInsets(rectangleInsets73, false);
        piePlot28.setLabelPadding(rectangleInsets73);
        piePlot1.setLabelPadding(rectangleInsets73);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(rectangleInsets73);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float27 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setShadowXOffset(90.0d);
        piePlot29.setForegroundAlpha(10.0f);
        piePlot29.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset51 = null;
        piePlot44.setDataset(pieDataset51);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot44);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        piePlot55.notifyListeners(plotChangeEvent57);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot55.getSimpleLabelOffset();
        java.awt.Font font60 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot55.setNoDataMessageFont(font60);
        java.awt.Font font62 = piePlot55.getLabelFont();
        piePlot44.setNoDataMessageFont(font62);
        piePlot1.setNoDataMessageFont(font62);
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot65.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets66);
        java.awt.Stroke stroke68 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = piePlot1.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(rectangleInsets66);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNotNull(rectangleInsets69);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot1.getLabelDistributor();
        java.awt.Paint paint14 = piePlot1.getSectionPaint((java.lang.Comparable) (-1.0d));
        double double15 = piePlot1.getMaximumLabelWidth();
        piePlot1.setNoDataMessage("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        boolean boolean8 = piePlot1.isSubplot();
        java.awt.Paint paint11 = piePlot1.lookupSectionPaint((java.lang.Comparable) (byte) -1, true);
        piePlot1.setExplodePercent((java.lang.Comparable) 1.0f, 100.0d);
        piePlot1.setSectionOutlinesVisible(false);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        piePlot1.markerChanged(markerChangeEvent17);
        java.awt.Paint paint20 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot1.setDataset(pieDataset9);
        boolean boolean11 = piePlot1.getLabelLinksVisible();
        java.awt.Paint paint13 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot1.handleClick((int) (byte) 100, (int) (short) 0, plotRenderingInfo16);
        java.awt.Font font18 = piePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        java.awt.Paint paint8 = piePlot1.getLabelShadowPaint();
        java.awt.Image image9 = piePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        piePlot1.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke26 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setLabelGap(0.0d);
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot29.setLabelLinkPaint(paint38);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Image image45 = null;
        piePlot41.setBackgroundImage(image45);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator47 = null;
        piePlot41.setToolTipGenerator(pieToolTipGenerator47);
        piePlot41.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        boolean boolean56 = piePlot52.getIgnoreZeroValues();
        java.awt.Shape shape57 = piePlot52.getLegendItemShape();
        boolean boolean58 = piePlot41.equals((java.lang.Object) piePlot52);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot52);
        java.awt.Paint paint61 = piePlot29.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        piePlot1.setSectionPaint((java.lang.Comparable) (short) 10, paint61);
        java.awt.Paint paint65 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0L, true);
        piePlot1.setIgnoreNullValues(false);
        java.awt.Paint paint68 = null;
        piePlot1.setOutlinePaint(paint68);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(paint65);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.removeChangeListener(plotChangeListener10);
        java.awt.Paint paint12 = piePlot1.getLabelBackgroundPaint();
        piePlot1.setExplodePercent((java.lang.Comparable) "", 100.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getShadowYOffset();
        java.awt.Stroke stroke20 = piePlot17.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot17.getLegendLabelGenerator();
        piePlot17.setInteriorGap(0.08d);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot17.getLabelPadding();
        piePlot1.setInsets(rectangleInsets24, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot1.getDatasetGroup();
        piePlot1.setSectionOutlinesVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot1.getDatasetGroup();
        java.awt.Font font19 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        float float10 = piePlot1.getForegroundAlpha();
        boolean boolean11 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot1.setURLGenerator(pieURLGenerator12);
        piePlot1.setShadowYOffset((double) 10L);
        piePlot1.setOutlineVisible(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        piePlot1.axisChanged(axisChangeEvent18);
        org.jfree.chart.plot.Plot plot20 = piePlot1.getRootPlot();
        java.awt.Stroke stroke23 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 1.0E-5d, false);
        java.lang.Object obj24 = piePlot1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator14);
        double double16 = piePlot1.getLabelGap();
        java.awt.Image image17 = piePlot1.getBackgroundImage();
        java.awt.Paint paint18 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot1.getLabelPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot1.getInsets();
        java.awt.Paint paint21 = piePlot1.getBaseSectionPaint();
        boolean boolean22 = piePlot1.getSimpleLabels();
        java.awt.Paint paint23 = piePlot1.getShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        java.awt.Image image13 = null;
        piePlot9.setBackgroundImage(image13);
        java.awt.Paint paint15 = piePlot9.getLabelShadowPaint();
        java.awt.Paint paint18 = piePlot9.lookupSectionPaint((java.lang.Comparable) "", false);
        java.awt.Paint paint19 = piePlot9.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot9.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator20);
        org.jfree.data.general.PieDataset pieDataset22 = piePlot1.getDataset();
        double double23 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot25.getSimpleLabelOffset();
        piePlot25.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot25.getLabelPadding();
        piePlot1.setInsets(rectangleInsets30, true);
        piePlot1.setExplodePercent((java.lang.Comparable) 1L, (double) 100L);
        java.awt.Paint paint37 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0L);
        java.awt.Paint paint39 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertNull(pieDataset22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.08d + "'", double23 == 0.08d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint6 = piePlot1.getSectionPaint((java.lang.Comparable) (short) -1);
        double double7 = piePlot1.getStartAngle();
        boolean boolean8 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getShadowYOffset();
        java.awt.Stroke stroke13 = piePlot10.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot10.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        java.awt.Image image21 = null;
        piePlot17.setBackgroundImage(image21);
        java.awt.Paint paint23 = piePlot17.getLabelShadowPaint();
        piePlot17.setLabelGap(0.0d);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot17.setLabelLinkPaint(paint26);
        piePlot10.setLabelPaint(paint26);
        float float29 = piePlot10.getBackgroundAlpha();
        piePlot10.setShadowXOffset((double) 0L);
        int int32 = piePlot10.getBackgroundImageAlignment();
        java.awt.Paint paint35 = piePlot10.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float36 = piePlot10.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getShadowYOffset();
        java.awt.Stroke stroke41 = piePlot38.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot38.getDatasetGroup();
        boolean boolean43 = piePlot38.getIgnoreNullValues();
        piePlot38.setExplodePercent((java.lang.Comparable) 1.0d, (double) '4');
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot38.getSimpleLabelOffset();
        piePlot10.setInsets(rectangleInsets47);
        piePlot1.setLabelPadding(rectangleInsets47);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.0d + "'", double39 == 4.0d);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rectangleInsets47);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator14);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) (-1L), paint17);
        piePlot1.setStartAngle(0.0d);
        double double21 = piePlot1.getInteriorGap();
        java.awt.Paint paint22 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setForegroundAlpha((float) 1);
        double double9 = piePlot1.getStartAngle();
        boolean boolean10 = piePlot1.isOutlineVisible();
        java.awt.Paint paint11 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        java.awt.Stroke stroke4 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Stroke stroke6 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        piePlot8.notifyListeners(plotChangeEvent10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot8.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot8.getSimpleLabelOffset();
        java.awt.Paint paint14 = piePlot8.getLabelBackgroundPaint();
        float float15 = piePlot8.getBackgroundImageAlpha();
        piePlot8.setForegroundAlpha((float) (-1));
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        java.awt.Paint paint25 = piePlot19.getLabelShadowPaint();
        java.awt.Paint paint28 = piePlot19.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot8.setLabelOutlinePaint(paint28);
        piePlot1.setBaseSectionOutlinePaint(paint28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot16.setDataset(pieDataset23);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot16);
        piePlot16.setMinimumArcAngleToDraw((double) 10.0f);
        java.awt.Paint paint28 = piePlot16.getShadowPaint();
        double double29 = piePlot16.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot16.setLegendLabelGenerator(pieSectionLabelGenerator30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'generator' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        piePlot1.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot12.setToolTipGenerator(pieToolTipGenerator18);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot12.setDataset(pieDataset20);
        java.awt.Stroke stroke24 = piePlot12.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = piePlot12.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier25);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot29.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot29.getInsets();
        org.jfree.chart.plot.Plot plot32 = piePlot29.getRootPlot();
        piePlot29.setShadowXOffset((double) (byte) 1);
        java.awt.Image image35 = null;
        piePlot29.setBackgroundImage(image35);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        piePlot38.notifyListeners(plotChangeEvent40);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot38.getSimpleLabelOffset();
        java.awt.Paint paint43 = piePlot38.getLabelBackgroundPaint();
        double double44 = piePlot38.getStartAngle();
        java.awt.Paint paint45 = piePlot38.getLabelOutlinePaint();
        piePlot29.setLabelLinkPaint(paint45);
        piePlot1.setSectionPaint((java.lang.Comparable) (-1.0d), paint45);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0E-5d + "'", double39 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 90.0d + "'", double44 == 90.0d);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getShadowYOffset();
        java.awt.Stroke stroke13 = piePlot10.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Stroke stroke15 = piePlot10.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        piePlot1.setLabelOutlineStroke(stroke15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        java.awt.Paint paint24 = piePlot18.getLabelShadowPaint();
        piePlot18.setShadowXOffset(90.0d);
        piePlot18.setForegroundAlpha(10.0f);
        piePlot18.setCircular(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot18.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator39 = piePlot33.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent40 = null;
        piePlot33.datasetChanged(datasetChangeEvent40);
        java.awt.Stroke stroke42 = piePlot33.getBaseSectionOutlineStroke();
        java.awt.Paint paint45 = piePlot33.lookupSectionPaint((java.lang.Comparable) 0.4d, false);
        piePlot18.setShadowPaint(paint45);
        piePlot1.setLabelShadowPaint(paint45);
        java.lang.Class<?> wildcardClass48 = piePlot1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(pieSectionLabelGenerator39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        boolean boolean8 = piePlot1.getSectionOutlinesVisible();
        boolean boolean9 = piePlot1.getSimpleLabels();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.addChangeListener(plotChangeListener10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot19.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot19.getNoDataMessagePaint();
        piePlot13.setLabelPaint(paint24);
        java.awt.Paint paint27 = piePlot13.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot13.setCircular(false);
        boolean boolean30 = piePlot1.equals((java.lang.Object) piePlot13);
        java.awt.Stroke stroke32 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        piePlot4.setNoDataMessage("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot4.getInsets();
        piePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot1.notifyListeners(plotChangeEvent11);
        boolean boolean13 = piePlot1.isSubplot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLabelGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        float float8 = piePlot1.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot1.getInsets();
        java.awt.Paint paint10 = piePlot1.getLabelOutlinePaint();
        boolean boolean11 = piePlot1.getLabelLinksVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        piePlot1.setLabelGap(0.0d);
        piePlot1.setStartAngle((double) (short) 100);
        boolean boolean11 = piePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        piePlot1.removeChangeListener(plotChangeListener32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        java.awt.Image image39 = null;
        piePlot35.setBackgroundImage(image39);
        java.awt.Paint paint41 = piePlot35.getLabelShadowPaint();
        piePlot35.setShadowXOffset(90.0d);
        piePlot35.setForegroundAlpha(10.0f);
        piePlot35.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = piePlot35.getLabelPadding();
        piePlot1.setInsets(rectangleInsets49);
        java.awt.Stroke stroke51 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator52 = piePlot1.getURLGenerator();
        java.awt.Paint paint53 = piePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNull(pieURLGenerator52);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        java.awt.Paint paint9 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot13.getToolTipGenerator();
        java.awt.Paint paint18 = piePlot13.getNoDataMessagePaint();
        piePlot13.setLabelGap(0.0d);
        java.awt.Paint paint23 = piePlot13.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 0.0f, paint23);
        piePlot1.setCircular(false);
        java.awt.Paint paint27 = piePlot1.getLabelOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        java.awt.Stroke stroke16 = null;
        piePlot14.setSectionOutlineStroke((java.lang.Comparable) '#', stroke16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot19.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot19.getNoDataMessagePaint();
        piePlot19.setLabelGap(0.0d);
        java.awt.Paint paint29 = piePlot19.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot14.setLabelPaint(paint29);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint29);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = null;
        piePlot33.setLegendLabelURLGenerator(pieURLGenerator37);
        java.lang.Comparable comparable40 = piePlot33.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        piePlot33.drawBackgroundImage(graphics2D41, rectangle2D42);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor44 = piePlot33.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor44);
        double double46 = piePlot1.getLabelLinkMargin();
        boolean boolean47 = piePlot1.getIgnoreNullValues();
        piePlot1.setCircular(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 100 + "'", comparable40, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.025d + "'", double46 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        piePlot1.setLabelLinkMargin((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot1.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        java.awt.Paint paint24 = piePlot18.getLabelShadowPaint();
        piePlot18.setLabelGap(0.0d);
        float float27 = piePlot18.getForegroundAlpha();
        boolean boolean28 = piePlot18.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = null;
        piePlot18.setURLGenerator(pieURLGenerator29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        java.awt.Image image36 = null;
        piePlot32.setBackgroundImage(image36);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator38 = null;
        piePlot32.setToolTipGenerator(pieToolTipGenerator38);
        boolean boolean40 = piePlot32.getIgnoreNullValues();
        java.awt.Paint paint41 = piePlot32.getLabelPaint();
        double double42 = piePlot32.getLabelLinkMargin();
        java.awt.Font font43 = piePlot32.getLabelFont();
        piePlot18.setLabelFont(font43);
        java.lang.String str45 = piePlot18.getNoDataMessage();
        java.awt.Stroke stroke48 = piePlot18.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100, true);
        piePlot1.setLabelLinkStroke(stroke48);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.025d + "'", double42 == 0.025d);
        org.junit.Assert.assertNotNull(font43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        piePlot1.addChangeListener(plotChangeListener20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        java.awt.Image image21 = null;
        piePlot17.setBackgroundImage(image21);
        java.awt.Paint paint23 = piePlot17.getLabelShadowPaint();
        piePlot17.setShadowXOffset(90.0d);
        piePlot17.setForegroundAlpha(10.0f);
        piePlot17.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot17.getLabelPadding();
        piePlot1.setInsets(rectangleInsets31, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot24.addChangeListener(plotChangeListener39);
        java.awt.Paint paint41 = piePlot24.getLabelShadowPaint();
        double double42 = piePlot24.getShadowXOffset();
        java.awt.Paint paint43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_SHADOW_PAINT;
        piePlot24.setBaseSectionPaint(paint43);
        boolean boolean45 = piePlot24.getLabelLinksVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.0d + "'", double42 == 4.0d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setBaseSectionOutlineStroke(stroke16);
        java.awt.Paint paint18 = piePlot1.getBaseSectionOutlinePaint();
        java.awt.Paint paint19 = piePlot1.getLabelBackgroundPaint();
        java.awt.Paint paint20 = piePlot1.getLabelOutlinePaint();
        piePlot1.setSimpleLabels(false);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot24.handleClick((int) (byte) 0, 100, plotRenderingInfo29);
        java.awt.Paint paint31 = piePlot24.getBaseSectionPaint();
        java.awt.Paint paint33 = piePlot24.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot24.setCircular(false);
        boolean boolean36 = piePlot24.isCircular();
        java.awt.Paint paint37 = piePlot24.getLabelPaint();
        piePlot1.setLabelShadowPaint(paint37);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        java.awt.Image image10 = null;
        piePlot1.setBackgroundImage(image10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot13.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        java.awt.Image image24 = null;
        piePlot20.setBackgroundImage(image24);
        java.awt.Paint paint26 = piePlot20.getLabelShadowPaint();
        piePlot20.setLabelGap(0.0d);
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot20.setLabelLinkPaint(paint29);
        piePlot13.setLabelPaint(paint29);
        piePlot1.setLabelLinkPaint(paint29);
        piePlot1.setIgnoreNullValues(false);
        java.awt.Paint paint36 = piePlot1.lookupSectionPaint((java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot7.getToolTipGenerator();
        java.awt.Paint paint12 = piePlot7.getNoDataMessagePaint();
        piePlot1.setLabelPaint(paint12);
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint16 = piePlot1.getLabelPaint();
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        java.awt.Paint paint21 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) false);
        piePlot1.setForegroundAlpha(100.0f);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = null;
        piePlot25.setLegendLabelURLGenerator(pieURLGenerator29);
        java.lang.Comparable comparable32 = piePlot25.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        piePlot25.drawBackgroundImage(graphics2D33, rectangle2D34);
        java.awt.Font font36 = piePlot25.getNoDataMessageFont();
        piePlot1.setLabelFont(font36);
        java.lang.Object obj38 = piePlot1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 100 + "'", comparable32, 100);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot1.getLabelPadding();
        float float22 = piePlot1.getForegroundAlpha();
        piePlot1.setExplodePercent((java.lang.Comparable) 0.14d, (double) 1L);
        java.awt.Paint paint26 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        boolean boolean5 = piePlot1.getIgnoreNullValues();
        piePlot1.setBackgroundAlpha((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
        java.awt.Stroke stroke10 = piePlot1.getOutlineStroke();
        boolean boolean11 = piePlot1.getSimpleLabels();
        java.awt.Paint paint12 = piePlot1.getLabelOutlinePaint();
        org.jfree.chart.plot.Plot plot13 = piePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot16.setDataset(pieDataset23);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot16);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot27.getSimpleLabelOffset();
        java.awt.Paint paint32 = piePlot27.getLabelBackgroundPaint();
        piePlot16.setLabelPaint(paint32);
        piePlot16.setStartAngle((double) 1);
        float float36 = piePlot16.getBackgroundImageAlpha();
        boolean boolean37 = piePlot16.getIgnoreNullValues();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        piePlot16.drawBackgroundImage(graphics2D38, rectangle2D39);
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        piePlot42.setSimpleLabels(true);
        java.awt.Paint paint45 = piePlot42.getShadowPaint();
        piePlot16.setSectionPaint((java.lang.Comparable) 100L, paint45);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0E-5d + "'", double28 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        java.awt.Stroke stroke12 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float13 = piePlot1.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLabelGenerator();
        piePlot1.setShadowXOffset((double) (byte) 10);
        java.awt.Paint paint18 = piePlot1.lookupSectionPaint((java.lang.Comparable) (byte) 1);
        piePlot1.setSectionOutlinesVisible(true);
        piePlot1.zoom((double) 100.0f);
        piePlot1.setSimpleLabels(false);
        float float25 = piePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot16.setDataset(pieDataset23);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot16);
        org.jfree.chart.util.Rotation rotation26 = piePlot1.getDirection();
        piePlot1.setCircular(false);
        java.awt.Paint paint29 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rotation26);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        java.awt.Stroke stroke15 = null;
        piePlot13.setSectionOutlineStroke((java.lang.Comparable) '#', stroke15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = piePlot18.getToolTipGenerator();
        java.awt.Paint paint23 = piePlot18.getNoDataMessagePaint();
        piePlot18.setLabelGap(0.0d);
        java.awt.Paint paint28 = piePlot18.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot13.setLabelPaint(paint28);
        java.awt.Paint paint30 = piePlot13.getLabelLinkPaint();
        piePlot13.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        java.awt.Image image38 = null;
        piePlot34.setBackgroundImage(image38);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator40 = null;
        piePlot34.setToolTipGenerator(pieToolTipGenerator40);
        boolean boolean42 = piePlot34.getIgnoreZeroValues();
        java.awt.Paint paint43 = piePlot34.getShadowPaint();
        piePlot13.setLabelPaint(paint43);
        piePlot13.setExplodePercent((java.lang.Comparable) false, 4.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        piePlot13.handleClick(0, (int) (short) 1, plotRenderingInfo50);
        boolean boolean52 = piePlot13.getIgnoreNullValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = piePlot13.getSimpleLabelOffset();
        piePlot1.setSimpleLabelOffset(rectangleInsets53);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator55 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Paint paint56 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setLabelPaint(paint56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(rectangleInsets53);
        org.junit.Assert.assertNull(pieURLGenerator55);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getInteriorGap();
        piePlot1.setSimpleLabels(true);
        boolean boolean7 = piePlot1.getLabelLinksVisible();
        piePlot1.setBackgroundAlpha((float) (byte) -1);
        java.lang.Object obj10 = piePlot1.clone();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot1.getLabelDistributor();
        boolean boolean17 = piePlot1.getLabelLinksVisible();
        piePlot1.setCircular(false);
        boolean boolean20 = piePlot1.getSimpleLabels();
        piePlot1.setBackgroundAlpha((float) (-1L));
        piePlot1.setIgnoreNullValues(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        piePlot1.setForegroundAlpha((float) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot1.addChangeListener(plotChangeListener27);
        piePlot1.setShadowYOffset(0.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot1.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot6.notifyListeners(plotChangeEvent8);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint11 = piePlot6.getNoDataMessagePaint();
        piePlot6.setLabelGap(0.0d);
        java.awt.Paint paint16 = piePlot6.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelPaint(paint16);
        java.awt.Paint paint18 = piePlot1.getLabelLinkPaint();
        piePlot1.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot22.setToolTipGenerator(pieToolTipGenerator28);
        boolean boolean30 = piePlot22.getIgnoreZeroValues();
        java.awt.Paint paint31 = piePlot22.getShadowPaint();
        piePlot1.setLabelPaint(paint31);
        piePlot1.setExplodePercent((java.lang.Comparable) false, 4.0d);
        piePlot1.zoom((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        java.awt.Paint paint42 = piePlot39.getLabelPaint();
        java.awt.Image image43 = null;
        piePlot39.setBackgroundImage(image43);
        java.awt.Image image45 = piePlot39.getBackgroundImage();
        boolean boolean46 = piePlot39.isSubplot();
        java.awt.Paint paint49 = piePlot39.lookupSectionPaint((java.lang.Comparable) (byte) -1, true);
        piePlot39.setIgnoreNullValues(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener52 = null;
        piePlot39.addChangeListener(plotChangeListener52);
        boolean boolean54 = piePlot1.equals((java.lang.Object) piePlot39);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(image45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent1 = null;
        piePlot0.notifyListeners(plotChangeEvent1);
        boolean boolean3 = piePlot0.getIgnoreNullValues();
        boolean boolean4 = piePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getLegendLabelURLGenerator();
        piePlot1.setPieIndex((int) (short) 0);
        java.awt.Paint paint11 = piePlot1.getShadowPaint();
        piePlot1.setBackgroundImageAlignment(10);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot1.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        piePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Stroke stroke11 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        java.awt.Paint paint23 = piePlot14.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        piePlot1.setBackgroundAlpha((float) (short) 10);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot1.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Font font31 = piePlot1.getNoDataMessageFont();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        java.awt.Stroke stroke35 = null;
        piePlot33.setSectionOutlineStroke((java.lang.Comparable) '#', stroke35);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        piePlot38.notifyListeners(plotChangeEvent40);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator42 = piePlot38.getToolTipGenerator();
        java.awt.Paint paint43 = piePlot38.getNoDataMessagePaint();
        piePlot38.setLabelGap(0.0d);
        java.awt.Paint paint48 = piePlot38.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot33.setLabelPaint(paint48);
        java.awt.Paint paint50 = piePlot33.getLabelLinkPaint();
        piePlot33.setMaximumLabelWidth((double) (-1L));
        java.awt.Shape shape53 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot33.setLegendItemShape(shape53);
        piePlot1.setLegendItemShape(shape53);
        java.awt.Graphics2D graphics2D56 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.plot.PiePlotState piePlotState59 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D56, 10, rectangle2D58, piePlotState59, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0E-5d + "'", double39 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(shape53);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        piePlot1.setCircular(false);
        piePlot1.setForegroundAlpha((float) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint9 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        java.awt.Paint paint10 = piePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        piePlot1.zoom(1.0E-5d);
        boolean boolean8 = piePlot1.isCircular();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Image image14 = null;
        piePlot10.setBackgroundImage(image14);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot10.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot10.datasetChanged(datasetChangeEvent17);
        java.awt.Stroke stroke20 = piePlot10.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        java.awt.Paint paint21 = piePlot10.getBaseSectionPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot10.getLabelPadding();
        piePlot1.setInsets(rectangleInsets22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        piePlot1.handleClick(1, (int) '4', plotRenderingInfo26);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieSectionLabelGenerator16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getShadowYOffset();
        java.awt.Image image18 = piePlot16.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot16.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Image image23 = null;
        piePlot16.setBackgroundImage(image23);
        java.awt.Stroke stroke27 = piePlot16.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float28 = piePlot16.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot16.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator29);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        piePlot1.markerChanged(markerChangeEvent31);
        piePlot1.setShadowXOffset(1.0d);
        piePlot1.setShadowXOffset((double) 15);
        piePlot1.setStartAngle(90.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator29);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot6.notifyListeners(plotChangeEvent8);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint11 = piePlot6.getNoDataMessagePaint();
        piePlot6.setLabelGap(0.0d);
        java.awt.Paint paint16 = piePlot6.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelPaint(paint16);
        java.awt.Paint paint18 = piePlot1.getLabelLinkPaint();
        double double19 = piePlot1.getStartAngle();
        int int20 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint21 = piePlot1.getLabelOutlinePaint();
        piePlot1.setNoDataMessage("");
        java.lang.Object obj24 = piePlot1.clone();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setOutlineStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint15 = piePlot1.lookupSectionPaint((java.lang.Comparable) (byte) 0, true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator19);
        piePlot13.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot24.getLegendItemShape();
        boolean boolean30 = piePlot13.equals((java.lang.Object) piePlot24);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot24);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Image image35 = piePlot33.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getLegendLabelURLGenerator();
        java.awt.Font font37 = piePlot33.getNoDataMessageFont();
        piePlot24.setLabelFont(font37);
        java.awt.Paint paint39 = piePlot24.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Image image45 = null;
        piePlot41.setBackgroundImage(image45);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator47 = null;
        piePlot41.setToolTipGenerator(pieToolTipGenerator47);
        boolean boolean49 = piePlot41.getIgnoreNullValues();
        piePlot41.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        piePlot41.handleClick((int) 'a', (int) ' ', plotRenderingInfo54);
        java.awt.Paint paint56 = piePlot41.getNoDataMessagePaint();
        piePlot24.setBaseSectionPaint(paint56);
        java.awt.Paint paint58 = piePlot24.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot1.getLabelPadding();
        float float22 = piePlot1.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint30 = piePlot24.getLabelShadowPaint();
        piePlot24.setShadowXOffset(90.0d);
        piePlot24.setForegroundAlpha(10.0f);
        piePlot24.setCircular(true, false);
        java.awt.Paint paint38 = piePlot24.getLabelPaint();
        java.awt.Font font39 = piePlot24.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font39);
        java.awt.Font font41 = piePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(font41);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        java.awt.Paint paint8 = piePlot1.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        piePlot10.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot10.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot10.getSimpleLabelOffset();
        java.awt.Paint paint16 = piePlot10.getLabelBackgroundPaint();
        piePlot1.setLabelShadowPaint(paint16);
        java.awt.Stroke stroke19 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 0L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot1.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        boolean boolean26 = piePlot22.getIgnoreZeroValues();
        java.awt.Shape shape27 = piePlot22.getLegendItemShape();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = piePlot22.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier28);
        piePlot1.setLabelGap((double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNull(pieURLGenerator20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Graphics2D graphics2D4 = null;
        java.util.List list5 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PiePlotState piePlotState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D4, list5, (double) 10.0f, rectangle2D7, rectangle2D8, piePlotState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        float float10 = piePlot1.getForegroundAlpha();
        piePlot1.zoom((double) 97);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        boolean boolean19 = piePlot14.getIgnoreNullValues();
        piePlot14.setForegroundAlpha((float) 1);
        double double22 = piePlot14.getStartAngle();
        boolean boolean23 = piePlot14.isOutlineVisible();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot25.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot25.getInsets();
        org.jfree.chart.plot.Plot plot28 = piePlot25.getRootPlot();
        piePlot25.setShadowXOffset((double) (byte) 1);
        java.awt.Paint paint31 = piePlot25.getLabelLinkPaint();
        piePlot14.setLabelShadowPaint(paint31);
        piePlot1.setBaseSectionOutlinePaint(paint31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        boolean boolean21 = piePlot1.isOutlineVisible();
        piePlot1.setPieIndex((int) (byte) 100);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Image image29 = null;
        piePlot25.setBackgroundImage(image29);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot25.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent32 = null;
        piePlot25.datasetChanged(datasetChangeEvent32);
        java.awt.Stroke stroke35 = piePlot25.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        java.awt.Paint paint36 = piePlot25.getBaseSectionPaint();
        piePlot1.setBaseSectionOutlinePaint(paint36);
        java.awt.Image image38 = null;
        piePlot1.setBackgroundImage(image38);
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.chart.plot.PiePlotState piePlotState41 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord42 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D40, piePlotState41, pieLabelRecord42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(pieSectionLabelGenerator31);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        double double20 = piePlot1.getShadowYOffset();
        java.awt.Paint paint21 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot1.datasetChanged(datasetChangeEvent22);
        double double24 = piePlot1.getShadowYOffset();
        float float25 = piePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        float float10 = piePlot1.getForegroundAlpha();
        boolean boolean11 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot1.removeChangeListener(plotChangeListener12);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot16.getLegendLabelGenerator();
        java.awt.Stroke stroke19 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot16.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke19);
        piePlot16.setLabelGap((double) 0);
        java.awt.Paint paint23 = piePlot16.getLabelShadowPaint();
        piePlot1.setSectionPaint((java.lang.Comparable) "Pie Plot", paint23);
        piePlot1.setIgnoreZeroValues(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot16.setDataset(pieDataset23);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot16);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot16.getLabelPadding();
        piePlot16.setMaximumLabelWidth(0.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        piePlot16.axisChanged(axisChangeEvent29);
        float float31 = piePlot16.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = piePlot33.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        piePlot33.setDataset(pieDataset40);
        double double42 = piePlot33.getInteriorGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator43 = null;
        piePlot33.setLegendLabelURLGenerator(pieURLGenerator43);
        java.lang.String str45 = piePlot33.getNoDataMessage();
        boolean boolean46 = piePlot33.isOutlineVisible();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor47 = piePlot33.getLabelDistributor();
        java.awt.Paint paint48 = piePlot33.getLabelPaint();
        piePlot16.setOutlinePaint(paint48);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.08d + "'", double42 == 0.08d);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor47);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setSimpleLabels(true);
        piePlot0.zoom(0.08d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        boolean boolean11 = piePlot7.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot12 = piePlot7.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        piePlot7.axisChanged(axisChangeEvent13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot7.setBaseSectionPaint(paint19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot7.getDatasetGroup();
        java.awt.Paint paint22 = piePlot7.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint30 = piePlot24.getLabelShadowPaint();
        piePlot24.setShadowXOffset(90.0d);
        piePlot24.setForegroundAlpha(10.0f);
        piePlot24.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        java.awt.Paint paint42 = piePlot39.getLabelPaint();
        java.awt.Image image43 = null;
        piePlot39.setBackgroundImage(image43);
        java.awt.Paint paint45 = piePlot39.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset46 = null;
        piePlot39.setDataset(pieDataset46);
        piePlot24.setParent((org.jfree.chart.plot.Plot) piePlot39);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        double double51 = piePlot50.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        piePlot50.notifyListeners(plotChangeEvent52);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot50.getSimpleLabelOffset();
        java.awt.Paint paint55 = piePlot50.getLabelBackgroundPaint();
        piePlot39.setLabelPaint(paint55);
        piePlot39.setForegroundAlpha((float) (short) 0);
        java.awt.Paint paint59 = piePlot39.getLabelBackgroundPaint();
        piePlot7.setBackgroundPaint(paint59);
        piePlot0.setLabelOutlinePaint(paint59);
        piePlot0.setLabelGap((double) 0.5f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0E-5d + "'", double51 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getInteriorGap();
        piePlot1.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getShadowYOffset();
        java.awt.Image image10 = piePlot8.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot8.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot8.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Image image15 = null;
        piePlot8.setBackgroundImage(image15);
        java.awt.Stroke stroke19 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float20 = piePlot8.getForegroundAlpha();
        java.awt.Paint paint21 = piePlot8.getLabelPaint();
        double double22 = piePlot8.getInteriorGap();
        java.awt.Paint paint23 = piePlot8.getLabelBackgroundPaint();
        piePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        boolean boolean26 = piePlot1.getIgnoreNullValues();
        java.lang.Comparable comparable28 = piePlot1.getSectionKey((int) '4');
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        piePlot1.removeChangeListener(plotChangeListener29);
        double double31 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 52 + "'", comparable28, 52);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.0d + "'", double31 == 4.0d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        java.awt.Paint paint17 = piePlot11.getLabelShadowPaint();
        piePlot1.setLabelLinkPaint(paint17);
        java.lang.Object obj19 = piePlot1.clone();
        piePlot1.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        double double8 = piePlot1.getStartAngle();
        java.awt.Paint paint9 = piePlot1.getLabelShadowPaint();
        piePlot1.setCircular(true);
        java.awt.Stroke stroke12 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke13 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot1.getLabelGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNull(pieURLGenerator15);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        double double14 = piePlot1.getMaximumLabelWidth();
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        boolean boolean21 = piePlot17.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot22 = piePlot17.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        piePlot17.axisChanged(axisChangeEvent23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = piePlot17.getDrawingSupplier();
        java.awt.Stroke stroke26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot17.setOutlineStroke(stroke26);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getShadowYOffset();
        java.awt.Stroke stroke32 = piePlot29.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        piePlot34.notifyListeners(plotChangeEvent36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot34.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot34.getSimpleLabelOffset();
        piePlot29.setInsets(rectangleInsets39);
        piePlot17.setInsets(rectangleInsets39, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator43 = null;
        piePlot17.setURLGenerator(pieURLGenerator43);
        java.awt.Paint paint45 = piePlot17.getBaseSectionOutlinePaint();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot17);
        double double47 = piePlot1.getMaximumLabelWidth();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.14d + "'", double47 == 0.14d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        boolean boolean22 = piePlot18.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot23 = piePlot18.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent24 = null;
        piePlot18.axisChanged(axisChangeEvent24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = piePlot18.getDrawingSupplier();
        java.awt.Stroke stroke27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot18.setOutlineStroke(stroke27);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) (byte) 10, stroke27);
        java.awt.Stroke stroke30 = piePlot1.getLabelLinkStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        double double11 = piePlot1.getExplodePercent((java.lang.Comparable) 97);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        piePlot1.datasetChanged(datasetChangeEvent12);
        java.awt.Paint paint14 = piePlot1.getShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot1.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot11.handleClick((int) (byte) 0, 100, plotRenderingInfo16);
        java.awt.Paint paint18 = piePlot11.getBaseSectionPaint();
        java.awt.Paint paint20 = piePlot11.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot11.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        piePlot24.datasetChanged(datasetChangeEvent28);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        piePlot24.addChangeListener(plotChangeListener30);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot24.getLabelGenerator();
        piePlot11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        piePlot1.removeChangeListener(plotChangeListener35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator32);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getLabelLinkMargin();
        piePlot1.setStartAngle((double) 0L);
        float float7 = piePlot1.getBackgroundImageAlpha();
        java.awt.Stroke stroke9 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.025d + "'", double4 == 0.025d);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator14);
        double double16 = piePlot1.getLabelGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot1.getInsets();
        piePlot1.setShadowXOffset((double) (-1L));
        java.awt.Font font20 = piePlot1.getNoDataMessageFont();
        piePlot1.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        java.lang.Class<?> wildcardClass7 = paint6.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        piePlot1.setCircular(true, false);
        double double15 = piePlot1.getShadowYOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot1.setURLGenerator(pieURLGenerator16);
        float float18 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        java.awt.Image image24 = null;
        piePlot20.setBackgroundImage(image24);
        java.awt.Paint paint26 = piePlot20.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot20.setDataset(pieDataset27);
        double double29 = piePlot20.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot20.getLabelPadding();
        java.awt.Image image31 = null;
        piePlot20.setBackgroundImage(image31);
        double double33 = piePlot20.getLabelLinkMargin();
        java.awt.Paint paint34 = piePlot20.getOutlinePaint();
        java.awt.Paint paint35 = piePlot20.getBaseSectionOutlinePaint();
        piePlot1.setLabelPaint(paint35);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.08d + "'", double29 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.025d + "'", double33 == 0.025d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot11.getSimpleLabelOffset();
        java.awt.Paint paint16 = piePlot11.getLabelBackgroundPaint();
        double double17 = piePlot11.getStartAngle();
        piePlot11.setCircular(true, false);
        piePlot11.setShadowXOffset(0.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot11.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.Plot plot25 = piePlot1.getRootPlot();
        piePlot1.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 90.0d + "'", double17 == 90.0d);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator28);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        piePlot1.setBaseSectionPaint(paint13);
        piePlot1.setStartAngle((double) (byte) 0);
        java.awt.Image image17 = piePlot1.getBackgroundImage();
        boolean boolean18 = piePlot1.getIgnoreNullValues();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot1.getLabelDistributor();
        piePlot1.setCircular(true, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot1.handleClick((int) (short) 10, 32, plotRenderingInfo25);
        java.awt.Graphics2D graphics2D27 = null;
        java.util.List list28 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PiePlotState piePlotState32 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D27, list28, (double) (byte) 100, rectangle2D30, rectangle2D31, piePlotState32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        java.awt.Paint paint14 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (-1), false);
        boolean boolean15 = piePlot1.getIgnoreZeroValues();
        boolean boolean16 = piePlot1.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot18.getSimpleLabelOffset();
        piePlot18.setNoDataMessage("Pie Plot");
        java.awt.Paint paint25 = piePlot18.lookupSectionOutlinePaint((java.lang.Comparable) 1, true);
        piePlot1.setBaseSectionOutlinePaint(paint25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        boolean boolean10 = piePlot1.getSectionOutlinesVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator11);
        piePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot1.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(pieSectionLabelGenerator15);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getLabelLinkMargin();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.025d + "'", double4 == 0.025d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.removeChangeListener(plotChangeListener10);
        piePlot1.zoom(90.0d);
        boolean boolean14 = piePlot1.isSubplot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        int int1 = piePlot0.getPieIndex();
        piePlot0.setShadowXOffset((double) 100L);
        org.jfree.data.KeyedValues keyedValues4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PiePlotState piePlotState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawRightLabels(keyedValues4, graphics2D5, rectangle2D6, rectangle2D7, (-1.0f), piePlotState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        boolean boolean8 = piePlot1.isCircular();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot15 = piePlot10.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot10.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        piePlot10.notifyListeners(plotChangeEvent17);
        java.awt.Font font19 = piePlot10.getNoDataMessageFont();
        java.awt.Paint paint20 = piePlot10.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        boolean boolean26 = piePlot22.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot27 = piePlot22.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        piePlot22.axisChanged(axisChangeEvent28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = piePlot22.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        piePlot22.setDataset(pieDataset31);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getShadowYOffset();
        java.awt.Stroke stroke37 = piePlot34.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot22.setBaseSectionOutlineStroke(stroke37);
        java.awt.Paint paint39 = piePlot22.getBaseSectionOutlinePaint();
        java.awt.Paint paint40 = piePlot22.getLabelBackgroundPaint();
        java.awt.Paint paint41 = piePlot22.getLabelOutlinePaint();
        piePlot10.setLabelBackgroundPaint(paint41);
        piePlot1.setLabelShadowPaint(paint41);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.0d + "'", double35 == 4.0d);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent1 = null;
        piePlot0.notifyListeners(plotChangeEvent1);
        piePlot0.setLabelLinksVisible(false);
        java.awt.Stroke stroke7 = piePlot0.lookupSectionOutlineStroke((java.lang.Comparable) 100.0f, true);
        piePlot0.setExplodePercent((java.lang.Comparable) (short) 10, (double) 0L);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        boolean boolean16 = piePlot12.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot17 = piePlot12.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        piePlot12.axisChanged(axisChangeEvent18);
        java.lang.String str20 = piePlot12.getNoDataMessage();
        java.awt.Image image21 = null;
        piePlot12.setBackgroundImage(image21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint30 = piePlot24.getLabelShadowPaint();
        piePlot12.setLabelBackgroundPaint(paint30);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot12.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        piePlot34.notifyListeners(plotChangeEvent36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot34.getSimpleLabelOffset();
        boolean boolean39 = piePlot34.getIgnoreNullValues();
        piePlot34.setForegroundAlpha((float) 1);
        piePlot34.setCircular(false);
        org.jfree.chart.LegendItemCollection legendItemCollection44 = piePlot34.getLegendItems();
        org.jfree.chart.util.Rotation rotation45 = piePlot34.getDirection();
        piePlot34.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent53 = null;
        piePlot49.datasetChanged(datasetChangeEvent53);
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = piePlot49.getLabelPadding();
        java.awt.Paint paint58 = piePlot49.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot34.setOutlinePaint(paint58);
        piePlot12.setOutlinePaint(paint58);
        piePlot0.setLabelLinkPaint(paint58);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(legendItemCollection44);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(rectangleInsets55);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        java.awt.Image image10 = null;
        piePlot1.setBackgroundImage(image10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot13.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        java.awt.Image image24 = null;
        piePlot20.setBackgroundImage(image24);
        java.awt.Paint paint26 = piePlot20.getLabelShadowPaint();
        piePlot20.setLabelGap(0.0d);
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot20.setLabelLinkPaint(paint29);
        piePlot13.setLabelPaint(paint29);
        piePlot1.setLabelLinkPaint(paint29);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot1.getInsets();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        java.awt.Image image39 = null;
        piePlot35.setBackgroundImage(image39);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator41 = null;
        piePlot35.setToolTipGenerator(pieToolTipGenerator41);
        boolean boolean43 = piePlot35.getIgnoreNullValues();
        java.awt.Paint paint44 = piePlot35.getLabelPaint();
        double double45 = piePlot35.getLabelLinkMargin();
        boolean boolean46 = piePlot35.isCircular();
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        java.awt.Image image52 = null;
        piePlot48.setBackgroundImage(image52);
        java.awt.Paint paint54 = piePlot48.getLabelShadowPaint();
        piePlot48.setLabelGap(0.0d);
        float float57 = piePlot48.getForegroundAlpha();
        boolean boolean58 = piePlot48.getIgnoreZeroValues();
        org.jfree.chart.event.PlotChangeListener plotChangeListener59 = null;
        piePlot48.removeChangeListener(plotChangeListener59);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = piePlot48.getDrawingSupplier();
        piePlot35.setDrawingSupplier(drawingSupplier61);
        piePlot1.setDrawingSupplier(drawingSupplier61);
        java.awt.Font font64 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.025d + "'", double45 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 1.0f + "'", float57 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(drawingSupplier61);
        org.junit.Assert.assertNotNull(font64);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        java.awt.Stroke stroke9 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint12 = piePlot1.lookupSectionPaint((java.lang.Comparable) (byte) 0, true);
        java.awt.Paint paint13 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        piePlot1.setLabelGap((double) 10.0f);
        java.awt.Shape shape12 = piePlot1.getLegendItemShape();
        piePlot1.setShadowXOffset((double) (byte) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        java.awt.Font font8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setLabelFont(font8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot1.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setLabelPaint(paint14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot1.getLabelDistributor();
        piePlot1.setMinimumArcAngleToDraw((double) 97);
        piePlot1.setForegroundAlpha((float) 97);
        java.awt.Font font17 = piePlot1.getNoDataMessageFont();
        piePlot1.setIgnoreNullValues(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke23 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) (short) 10, false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        piePlot1.datasetChanged(datasetChangeEvent27);
        java.awt.Stroke stroke30 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.08d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.lang.String str8 = piePlot1.getNoDataMessage();
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot1.getURLGenerator();
        java.lang.Comparable comparable12 = piePlot1.getSectionKey(0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0 + "'", comparable12, 0);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot1.getDatasetGroup();
        java.awt.Paint paint12 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1.0d, false);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PiePlotState piePlotState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D13, (int) (byte) 100, rectangle2D15, piePlotState16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Font font12 = piePlot1.getNoDataMessageFont();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        java.awt.Image image19 = null;
        piePlot15.setBackgroundImage(image19);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = null;
        piePlot15.setToolTipGenerator(pieToolTipGenerator21);
        boolean boolean23 = piePlot15.getIgnoreNullValues();
        java.awt.Paint paint24 = piePlot15.getLabelPaint();
        double double25 = piePlot15.getLabelLinkMargin();
        java.awt.Font font26 = piePlot15.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        piePlot27.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        piePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot31.getSimpleLabelOffset();
        boolean boolean36 = piePlot31.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        piePlot38.setLabelPaint(paint44);
        piePlot31.setBackgroundPaint(paint44);
        piePlot27.setLabelPaint(paint44);
        piePlot15.setBackgroundPaint(paint44);
        piePlot1.setSectionPaint((java.lang.Comparable) '#', paint44);
        org.jfree.data.general.PieDataset pieDataset50 = piePlot1.getDataset();
        java.awt.Font font51 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.025d + "'", double25 == 0.025d);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 90.0d + "'", double39 == 90.0d);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNull(pieDataset50);
        org.junit.Assert.assertNotNull(font51);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        piePlot1.setMaximumLabelWidth(1.0E-5d);
        java.awt.Font font13 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot11.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets13, false);
        piePlot1.setShadowXOffset((double) (byte) 100);
        double double18 = piePlot1.getMaximumLabelWidth();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot1.getDrawingSupplier();
        double double20 = piePlot1.getStartAngle();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 90.0d + "'", double20 == 90.0d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot1.getLabelDistributor();
        java.awt.Shape shape9 = piePlot1.getLegendItemShape();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot11.getSimpleLabelOffset();
        java.awt.Font font16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot11.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot11.getSectionOutlinesVisible();
        piePlot11.zoom((double) 10L);
        java.awt.Stroke stroke23 = piePlot11.lookupSectionOutlineStroke((java.lang.Comparable) 10, true);
        piePlot1.setLabelOutlineStroke(stroke23);
        boolean boolean25 = piePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        piePlot1.setNoDataMessage("Pie Plot");
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        java.awt.Image image11 = null;
        piePlot7.setBackgroundImage(image11);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator13 = null;
        piePlot7.setToolTipGenerator(pieToolTipGenerator13);
        boolean boolean15 = piePlot7.getIgnoreNullValues();
        java.awt.Stroke stroke16 = piePlot7.getLabelOutlineStroke();
        piePlot1.setBaseSectionOutlineStroke(stroke16);
        float float18 = piePlot1.getBackgroundAlpha();
        piePlot1.setCircular(true);
        java.awt.Paint paint21 = piePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        piePlot1.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        java.awt.Paint paint29 = piePlot24.getLabelBackgroundPaint();
        double double30 = piePlot24.getStartAngle();
        java.awt.Paint paint31 = piePlot24.getLabelOutlinePaint();
        piePlot1.setLabelBackgroundPaint(paint31);
        piePlot1.setBackgroundAlpha((float) 1L);
        java.awt.Paint paint36 = piePlot1.getSectionPaint((java.lang.Comparable) (-1.0d));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        piePlot1.handleClick(15, (int) (short) 10, plotRenderingInfo39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(paint36);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Stroke stroke10 = piePlot1.getLabelOutlineStroke();
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.PiePlotState piePlotState12 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D11, piePlotState12, pieLabelRecord13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        piePlot1.datasetChanged(datasetChangeEvent6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot9.notifyListeners(plotChangeEvent11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot9.getSimpleLabelOffset();
        boolean boolean14 = piePlot9.getIgnoreNullValues();
        java.awt.Image image15 = piePlot9.getBackgroundImage();
        java.awt.Paint paint16 = piePlot9.getBaseSectionPaint();
        java.awt.Stroke stroke17 = piePlot9.getBaseSectionOutlineStroke();
        java.awt.Paint paint20 = piePlot9.lookupSectionPaint((java.lang.Comparable) (byte) 0, true);
        piePlot1.setBaseSectionPaint(paint20);
        java.lang.String str22 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot1.setLabelLinkPaint(paint10);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        java.awt.Stroke stroke16 = null;
        piePlot14.setSectionOutlineStroke((java.lang.Comparable) '#', stroke16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot19.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot19.getNoDataMessagePaint();
        piePlot19.setLabelGap(0.0d);
        java.awt.Paint paint29 = piePlot19.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot14.setLabelPaint(paint29);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint29);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = null;
        piePlot33.setLegendLabelURLGenerator(pieURLGenerator37);
        java.lang.Comparable comparable40 = piePlot33.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        piePlot33.drawBackgroundImage(graphics2D41, rectangle2D42);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor44 = piePlot33.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor44);
        double double46 = piePlot1.getLabelLinkMargin();
        boolean boolean47 = piePlot1.getIgnoreNullValues();
        double double48 = piePlot1.getShadowXOffset();
        org.jfree.chart.plot.Plot plot49 = piePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 100 + "'", comparable40, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.025d + "'", double46 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4.0d + "'", double48 == 4.0d);
        org.junit.Assert.assertNotNull(plot49);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot12.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator13);
        boolean boolean15 = piePlot1.isCircular();
        piePlot1.setBackgroundImageAlignment((int) (short) 1);
        piePlot1.setShadowYOffset((double) (byte) -1);
        double double20 = piePlot1.getMaximumLabelWidth();
        piePlot1.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke26 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        piePlot29.setLabelGap(0.0d);
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot29.setLabelLinkPaint(paint38);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Image image45 = null;
        piePlot41.setBackgroundImage(image45);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator47 = null;
        piePlot41.setToolTipGenerator(pieToolTipGenerator47);
        piePlot41.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        boolean boolean56 = piePlot52.getIgnoreZeroValues();
        java.awt.Shape shape57 = piePlot52.getLegendItemShape();
        boolean boolean58 = piePlot41.equals((java.lang.Object) piePlot52);
        piePlot29.setParent((org.jfree.chart.plot.Plot) piePlot52);
        java.awt.Paint paint61 = piePlot29.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        piePlot1.setSectionPaint((java.lang.Comparable) (short) 10, paint61);
        piePlot1.setShadowYOffset((double) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = piePlot1.getInsets();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(rectangleInsets65);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getLegendLabelURLGenerator();
        piePlot1.setPieIndex((int) (short) 0);
        java.awt.Paint paint11 = piePlot1.getShadowPaint();
        piePlot1.setBackgroundImageAlignment(10);
        org.jfree.chart.util.Rotation rotation14 = piePlot1.getDirection();
        java.awt.Paint paint15 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rotation14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        piePlot1.setNoDataMessage("Pie Plot");
        java.awt.Paint paint8 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1, true);
        java.awt.Stroke stroke9 = piePlot1.getBaseSectionOutlineStroke();
        piePlot1.setLabelGap((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        piePlot1.setLabelGap(0.0d);
        piePlot1.setStartAngle((double) (short) 100);
        java.awt.Stroke stroke13 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) '4', false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setShadowXOffset((double) 0L);
        int int23 = piePlot1.getBackgroundImageAlignment();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        boolean boolean27 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot30.getLegendLabelGenerator();
        java.awt.Stroke stroke32 = piePlot30.getOutlineStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) (short) 0, stroke32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator31);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setForegroundAlpha((float) 1);
        piePlot1.setCircular(false);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = piePlot1.getLegendItems();
        org.jfree.chart.util.Rotation rotation12 = piePlot1.getDirection();
        piePlot1.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        piePlot16.datasetChanged(datasetChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot16.getLabelPadding();
        java.awt.Paint paint25 = piePlot16.lookupSectionPaint((java.lang.Comparable) "hi!", true);
        piePlot1.setOutlinePaint(paint25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        boolean boolean32 = piePlot28.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot28.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        boolean boolean8 = piePlot1.isSubplot();
        java.awt.Paint paint9 = piePlot1.getLabelPaint();
        boolean boolean10 = piePlot1.getIgnoreNullValues();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        piePlot8.setLabelPaint(paint14);
        piePlot1.setBackgroundPaint(paint14);
        java.lang.Object obj17 = null;
        boolean boolean18 = piePlot1.equals(obj17);
        float float19 = piePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        piePlot1.setLabelLinksVisible(true);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Image image15 = piePlot13.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Image image20 = null;
        piePlot13.setBackgroundImage(image20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot13.setLegendLabelURLGenerator(pieURLGenerator22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        piePlot13.handleClick((int) '4', (int) (byte) 100, plotRenderingInfo26);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator28);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator28);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        double double14 = piePlot1.getMaximumLabelWidth();
        double double15 = piePlot1.getShadowYOffset();
        java.awt.Paint paint18 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (short) 100, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Image image8 = null;
        piePlot1.setBackgroundImage(image8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot1.handleClick((int) '4', (int) (byte) 100, plotRenderingInfo14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot17.datasetChanged(datasetChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot17.getLabelPadding();
        piePlot1.setSimpleLabelOffset(rectangleInsets23);
        double double25 = piePlot1.getInteriorGap();
        boolean boolean26 = piePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.08d + "'", double25 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot1.setDataset(pieDataset10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator14);
        double double16 = piePlot1.getLabelGap();
        piePlot1.setStartAngle((double) (byte) 0);
        java.awt.Paint paint20 = piePlot1.lookupSectionPaint((java.lang.Comparable) 100);
        java.awt.Paint paint22 = piePlot1.getSectionPaint((java.lang.Comparable) (short) 100);
        piePlot1.setNoDataMessage("Pie Plot");
        piePlot1.setLabelLinksVisible(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.isCircular();
        boolean boolean13 = piePlot1.getIgnoreZeroValues();
        piePlot1.setMaximumLabelWidth((double) 0.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Paint paint17 = piePlot1.getLabelBackgroundPaint();
        piePlot1.setOutlineVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setLabelPadding(rectangleInsets20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'padding' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot1.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        java.awt.Stroke stroke11 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        java.awt.Paint paint12 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot1.getLabelPadding();
        double double14 = piePlot1.getShadowYOffset();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PiePlotState piePlotState18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D15, (int) (byte) 100, rectangle2D17, piePlotState18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getShadowYOffset();
        java.awt.Stroke stroke12 = piePlot9.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot14.getSimpleLabelOffset();
        piePlot9.setInsets(rectangleInsets19);
        piePlot1.setLabelPadding(rectangleInsets19);
        piePlot1.zoom((double) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = piePlot1.getDrawingSupplier();
        piePlot1.setMinimumArcAngleToDraw((double) (byte) -1);
        piePlot1.setBackgroundImageAlignment(97);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Paint paint14 = piePlot10.getNoDataMessagePaint();
        piePlot1.setLabelBackgroundPaint(paint14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot1.setURLGenerator(pieURLGenerator16);
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = piePlot1.getArcBounds(rectangle2D18, rectangle2D19, (double) (byte) -1, (double) (short) 1, (double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        piePlot27.setDataset(pieDataset34);
        double double36 = piePlot27.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot27.getLabelPadding();
        java.awt.Image image38 = null;
        piePlot27.setBackgroundImage(image38);
        double double40 = piePlot27.getShadowYOffset();
        piePlot27.setIgnoreZeroValues(true);
        boolean boolean43 = piePlot1.equals((java.lang.Object) piePlot27);
        java.awt.Paint paint44 = piePlot27.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(rectangle2D23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.08d + "'", double36 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.0d + "'", double40 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        piePlot1.setForegroundAlpha((float) 0);
        java.awt.Paint paint27 = piePlot1.getLabelBackgroundPaint();
        java.awt.Font font28 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        float float8 = piePlot1.getBackgroundImageAlpha();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot8.handleClick((int) (byte) 0, 100, plotRenderingInfo13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        piePlot8.setLabelBackgroundPaint(paint19);
        piePlot1.setLabelShadowPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot1.getDrawingSupplier();
        java.awt.Stroke stroke25 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 100);
        boolean boolean26 = piePlot1.isSubplot();
        java.awt.Paint paint27 = piePlot1.getBaseSectionOutlinePaint();
        piePlot1.setCircular(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        piePlot1.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot1.getDrawingSupplier();
        double double24 = piePlot1.getShadowXOffset();
        java.awt.Paint paint25 = piePlot1.getLabelShadowPaint();
        double double26 = piePlot1.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.025d + "'", double26 == 0.025d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        double double7 = piePlot1.getLabelGap();
        java.awt.Stroke stroke8 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Font font10 = piePlot1.getNoDataMessageFont();
        java.awt.Paint paint11 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot13.datasetChanged(datasetChangeEvent17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        piePlot13.addChangeListener(plotChangeListener19);
        piePlot13.setLabelGap((double) 10);
        piePlot13.setNoDataMessage("");
        java.awt.Font font25 = piePlot13.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        java.awt.Paint paint14 = piePlot8.getLabelShadowPaint();
        piePlot8.setLabelGap(0.0d);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot8.setLabelLinkPaint(paint17);
        piePlot1.setLabelPaint(paint17);
        float float20 = piePlot1.getBackgroundAlpha();
        boolean boolean21 = piePlot1.isOutlineVisible();
        piePlot1.setPieIndex((int) (byte) 100);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Image image29 = null;
        piePlot25.setBackgroundImage(image29);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot25.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent32 = null;
        piePlot25.datasetChanged(datasetChangeEvent32);
        java.awt.Stroke stroke35 = piePlot25.lookupSectionOutlineStroke((java.lang.Comparable) 100L);
        java.awt.Paint paint36 = piePlot25.getBaseSectionPaint();
        piePlot1.setBaseSectionOutlinePaint(paint36);
        java.lang.Object obj38 = piePlot1.clone();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(pieSectionLabelGenerator31);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Stroke stroke6 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        piePlot1.setLabelGap((double) 100.0f);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot10.getLegendLabelGenerator();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot10.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke13);
        piePlot10.setLabelGap((double) 0);
        piePlot10.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getShadowYOffset();
        java.awt.Image image28 = piePlot26.getBackgroundImage();
        java.awt.Stroke stroke29 = piePlot26.getLabelOutlineStroke();
        piePlot20.setLabelLinkStroke(stroke29);
        piePlot10.setBaseSectionOutlineStroke(stroke29);
        piePlot1.setOutlineStroke(stroke29);
        java.awt.Paint paint34 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot1.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        double double10 = piePlot1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot1.getLabelPadding();
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        double double14 = piePlot1.getShadowYOffset();
        double double15 = piePlot1.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Stroke stroke10 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke11 = piePlot1.getLabelOutlineStroke();
        java.awt.Stroke stroke14 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 15, false);
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getShadowYOffset();
        piePlot16.setSimpleLabels(false);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        java.awt.Stroke stroke24 = null;
        piePlot22.setSectionOutlineStroke((java.lang.Comparable) '#', stroke24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot27.getLegendLabelGenerator();
        java.awt.Stroke stroke30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot27.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke30);
        piePlot27.setLabelGap((double) 0);
        piePlot27.setStartAngle((double) (-1.0f));
        java.awt.Paint paint36 = piePlot27.getLabelBackgroundPaint();
        piePlot22.setNoDataMessagePaint(paint36);
        java.awt.Stroke stroke38 = piePlot22.getOutlineStroke();
        piePlot16.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke38);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke38);
        piePlot1.setLabelLinkMargin((-1.0d));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Stroke stroke10 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        piePlot1.axisChanged(axisChangeEvent11);
        piePlot1.setNoDataMessage("hi!");
        boolean boolean15 = piePlot1.getIgnoreNullValues();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot1.notifyListeners(plotChangeEvent16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        double double3 = piePlot1.getMinimumArcAngleToDraw();
        piePlot1.setPieIndex((int) (byte) 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        java.awt.Font font8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setLabelFont(font8);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = piePlot12.getLabelShadowPaint();
        piePlot12.setLabelGap(0.0d);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot12.setLabelLinkPaint(paint21);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        java.awt.Stroke stroke27 = null;
        piePlot25.setSectionOutlineStroke((java.lang.Comparable) '#', stroke27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        piePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator34 = piePlot30.getToolTipGenerator();
        java.awt.Paint paint35 = piePlot30.getNoDataMessagePaint();
        piePlot30.setLabelGap(0.0d);
        java.awt.Paint paint40 = piePlot30.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot25.setLabelPaint(paint40);
        piePlot12.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint40);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 10, paint40);
        piePlot1.zoom((double) (short) 1);
        boolean boolean46 = piePlot1.getLabelLinksVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator47 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator47);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-5d + "'", double31 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        float float9 = piePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot1.addChangeListener(plotChangeListener10);
        java.awt.Paint paint14 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0.0f, false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot9.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot9.getInsets();
        double double12 = piePlot9.getInteriorGap();
        piePlot9.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getShadowYOffset();
        java.awt.Image image18 = piePlot16.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot16.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Image image23 = null;
        piePlot16.setBackgroundImage(image23);
        java.awt.Stroke stroke27 = piePlot16.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float28 = piePlot16.getForegroundAlpha();
        java.awt.Paint paint29 = piePlot16.getLabelPaint();
        double double30 = piePlot16.getInteriorGap();
        java.awt.Paint paint31 = piePlot16.getLabelBackgroundPaint();
        piePlot9.setNoDataMessagePaint(paint31);
        java.awt.Paint paint34 = piePlot9.lookupSectionPaint((java.lang.Comparable) (short) -1);
        piePlot1.setShadowPaint(paint34);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setInteriorGap(0.08d);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getStartAngle();
        java.awt.Stroke stroke14 = piePlot11.getSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot16.getSimpleLabelOffset();
        piePlot11.setInsets(rectangleInsets18);
        piePlot1.setInsets(rectangleInsets18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot1.notifyListeners(plotChangeEvent21);
        java.awt.Paint paint23 = piePlot1.getShadowPaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        java.awt.Paint paint9 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot13.getToolTipGenerator();
        java.awt.Paint paint18 = piePlot13.getNoDataMessagePaint();
        piePlot13.setLabelGap(0.0d);
        java.awt.Paint paint23 = piePlot13.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 0.0f, paint23);
        piePlot1.setCircular(false);
        double double27 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getStartAngle();
        java.awt.Stroke stroke32 = piePlot29.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint34 = piePlot29.getSectionPaint((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        java.awt.Image image40 = null;
        piePlot36.setBackgroundImage(image40);
        java.awt.Paint paint42 = piePlot36.getLabelShadowPaint();
        piePlot36.setShadowXOffset(90.0d);
        piePlot36.setForegroundAlpha(10.0f);
        piePlot36.setCircular(true, false);
        java.awt.Paint paint50 = piePlot36.getLabelPaint();
        piePlot29.setShadowPaint(paint50);
        java.awt.Stroke stroke53 = piePlot29.lookupSectionOutlineStroke((java.lang.Comparable) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot29.getSimpleLabelOffset();
        java.awt.Paint paint57 = piePlot29.lookupSectionOutlinePaint((java.lang.Comparable) (short) 100, true);
        piePlot1.setLabelOutlinePaint(paint57);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08d + "'", double27 == 0.08d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
        org.junit.Assert.assertNull(stroke32);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(rectangleInsets54);
        org.junit.Assert.assertNotNull(paint57);
    }
}

