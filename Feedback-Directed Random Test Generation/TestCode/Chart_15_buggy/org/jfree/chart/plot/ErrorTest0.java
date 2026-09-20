package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        piePlot10.datasetChanged(datasetChangeEvent14);
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot10", piePlot1.equals(piePlot10) ? piePlot1.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        piePlot10.handleClick((int) (byte) 0, 100, plotRenderingInfo15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        piePlot10.setLabelBackgroundPaint(paint21);
        piePlot1.setLabelPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Paint paint5 = piePlot1.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot7.handleClick((int) (byte) 0, 100, plotRenderingInfo12);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        piePlot7.setLabelBackgroundPaint(paint18);
        piePlot1.setLabelBackgroundPaint(paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot7", piePlot1.equals(piePlot7) ? piePlot1.hashCode() == piePlot7.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        piePlot9.setLabelPaint(paint15);
        piePlot1.setLabelLinkPaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot12", piePlot1.equals(piePlot12) ? piePlot1.hashCode() == piePlot12.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot17.getSimpleLabelOffset();
        piePlot1.setLabelPadding(rectangleInsets21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot17", piePlot11.equals(piePlot17) ? piePlot11.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        java.awt.Stroke stroke14 = null;
        piePlot12.setSectionOutlineStroke((java.lang.Comparable) '#', stroke14);
        java.lang.String str16 = piePlot12.getPlotType();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        piePlot12.setBaseSectionOutlinePaint(paint21);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 100L, paint21);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        piePlot25.datasetChanged(datasetChangeEvent29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot32.handleClick((int) (byte) 0, 100, plotRenderingInfo37);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        piePlot32.setLabelBackgroundPaint(paint43);
        piePlot25.setLabelShadowPaint(paint43);
        piePlot1.setLabelOutlinePaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot40", piePlot18.equals(piePlot40) ? piePlot18.hashCode() == piePlot40.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot(pieDataset1);
        double double3 = piePlot2.getShadowYOffset();
        java.awt.Image image4 = piePlot2.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = piePlot2.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        piePlot2.drawBackgroundImage(graphics2D6, rectangle2D7);
        java.awt.Image image9 = null;
        piePlot2.setBackgroundImage(image9);
        java.awt.Stroke stroke13 = piePlot2.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float14 = piePlot2.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot2.getLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot2", piePlot0.equals(piePlot2) ? piePlot0.hashCode() == piePlot2.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        boolean boolean8 = piePlot1.isSubplot();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Image image14 = null;
        piePlot10.setBackgroundImage(image14);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot10.setToolTipGenerator(pieToolTipGenerator16);
        boolean boolean18 = piePlot10.getIgnoreNullValues();
        java.awt.Paint paint19 = piePlot10.getLabelPaint();
        piePlot1.setLabelPaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot10", piePlot1.equals(piePlot10) ? piePlot1.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0L);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getShadowYOffset();
        java.awt.Stroke stroke13 = piePlot10.lookupSectionOutlineStroke((java.lang.Comparable) true);
        boolean boolean14 = piePlot1.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot10", piePlot1.equals(piePlot10) ? piePlot1.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot1.getInsets();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        java.awt.Paint paint24 = piePlot18.getLabelShadowPaint();
        piePlot18.setShadowXOffset(90.0d);
        piePlot18.setForegroundAlpha(10.0f);
        piePlot18.setCircular(true, false);
        double double32 = piePlot18.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot18.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        java.awt.Stroke stroke14 = null;
        piePlot12.setSectionOutlineStroke((java.lang.Comparable) '#', stroke14);
        java.lang.String str16 = piePlot12.getPlotType();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        piePlot12.setBaseSectionOutlinePaint(paint21);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 100L, paint21);
        boolean boolean24 = piePlot1.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot1.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        piePlot27.setShadowXOffset(90.0d);
        piePlot27.setForegroundAlpha(10.0f);
        piePlot27.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        java.awt.Image image46 = null;
        piePlot42.setBackgroundImage(image46);
        java.awt.Paint paint48 = piePlot42.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset49 = null;
        piePlot42.setDataset(pieDataset49);
        piePlot27.setParent((org.jfree.chart.plot.Plot) piePlot42);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot42.getLabelPadding();
        piePlot1.setInsets(rectangleInsets52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot42", piePlot18.equals(piePlot42) ? piePlot18.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot15.handleClick((int) (byte) 0, 100, plotRenderingInfo20);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot15.datasetChanged(datasetChangeEvent22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot25.getSimpleLabelOffset();
        piePlot15.setInsets(rectangleInsets27, false);
        piePlot1.setInsets(rectangleInsets27, true);
        piePlot1.setShadowXOffset(4.0d);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        java.awt.Image image40 = null;
        piePlot36.setBackgroundImage(image40);
        java.awt.Paint paint42 = piePlot36.getLabelShadowPaint();
        java.awt.Paint paint45 = piePlot36.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setSectionPaint((java.lang.Comparable) (short) 0, paint45);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        java.awt.Image image52 = null;
        piePlot48.setBackgroundImage(image52);
        java.awt.Paint paint54 = piePlot48.getLabelShadowPaint();
        java.awt.Image image55 = piePlot48.getBackgroundImage();
        java.awt.Paint paint56 = piePlot48.getBaseSectionPaint();
        java.awt.Paint paint57 = piePlot48.getBaseSectionPaint();
        piePlot1.setBaseSectionOutlinePaint(paint57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot36 and piePlot48", piePlot36.equals(piePlot48) ? piePlot36.hashCode() == piePlot48.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        java.lang.Object obj7 = piePlot1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj7", piePlot1.equals(obj7) ? piePlot1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        double double5 = piePlot4.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot4.getSimpleLabelOffset();
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot4.setBaseSectionOutlineStroke(stroke7);
        piePlot1.setBaseSectionOutlineStroke(stroke7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot4", piePlot1.equals(piePlot4) ? piePlot1.hashCode() == piePlot4.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        float float25 = piePlot12.getForegroundAlpha();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot12", piePlot1.equals(piePlot12) ? piePlot1.hashCode() == piePlot12.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        piePlot1.setSectionOutlinesVisible(true);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot18.getSimpleLabelOffset();
        piePlot1.setSimpleLabelOffset(rectangleInsets20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        java.awt.Image image21 = null;
        piePlot17.setBackgroundImage(image21);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = null;
        piePlot17.setToolTipGenerator(pieToolTipGenerator23);
        boolean boolean25 = piePlot17.getIgnoreNullValues();
        java.awt.Stroke stroke26 = piePlot17.getLabelOutlineStroke();
        piePlot1.setBaseSectionOutlineStroke(stroke26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot17", piePlot1.equals(piePlot17) ? piePlot1.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        java.awt.Stroke stroke12 = null;
        piePlot10.setSectionOutlineStroke((java.lang.Comparable) '#', stroke12);
        java.lang.String str14 = piePlot10.getPlotType();
        java.lang.String str15 = piePlot10.getNoDataMessage();
        piePlot10.setSimpleLabels(true);
        boolean boolean18 = piePlot10.getSimpleLabels();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot25 = piePlot20.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        piePlot20.axisChanged(axisChangeEvent26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = piePlot20.getDrawingSupplier();
        piePlot10.setDrawingSupplier(drawingSupplier28);
        piePlot1.setDrawingSupplier(drawingSupplier28);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot32.handleClick((int) (byte) 0, 100, plotRenderingInfo37);
        java.awt.Paint paint39 = piePlot32.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Paint paint45 = piePlot41.getNoDataMessagePaint();
        piePlot32.setLabelBackgroundPaint(paint45);
        piePlot1.setOutlinePaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot20 and piePlot41", piePlot20.equals(piePlot41) ? piePlot20.hashCode() == piePlot41.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        boolean boolean16 = piePlot1.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = null;
        piePlot19.setToolTipGenerator(pieToolTipGenerator25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot19.setDataset(pieDataset27);
        java.awt.Stroke stroke31 = piePlot19.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) (byte) 10, stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot19", piePlot10.equals(piePlot19) ? piePlot10.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        java.lang.Object obj10 = piePlot1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot1.setInsets(rectangleInsets11, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj10", piePlot1.equals(obj10) ? piePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        java.lang.Object obj10 = piePlot1.clone();
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
        piePlot1.setOutlineStroke(stroke24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj10", piePlot1.equals(obj10) ? piePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        boolean boolean20 = piePlot16.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = null;
        piePlot16.setToolTipGenerator(pieToolTipGenerator21);
        java.awt.Stroke stroke23 = piePlot16.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        boolean boolean29 = piePlot25.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot30 = piePlot25.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        piePlot25.axisChanged(axisChangeEvent31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = piePlot25.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        java.awt.Stroke stroke38 = null;
        piePlot36.setSectionOutlineStroke((java.lang.Comparable) '#', stroke38);
        java.lang.String str40 = piePlot36.getPlotType();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        piePlot36.setBaseSectionOutlinePaint(paint45);
        piePlot25.setSectionOutlinePaint((java.lang.Comparable) 100L, paint45);
        boolean boolean48 = piePlot25.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator49 = piePlot25.getLegendLabelGenerator();
        piePlot16.setLegendLabelToolTipGenerator(pieSectionLabelGenerator49);
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot42", piePlot1.equals(piePlot42) ? piePlot1.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        java.awt.Stroke stroke9 = null;
        piePlot7.setSectionOutlineStroke((java.lang.Comparable) '#', stroke9);
        java.lang.String str11 = piePlot7.getPlotType();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        piePlot7.setBaseSectionOutlinePaint(paint16);
        piePlot1.setLabelLinkPaint(paint16);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        piePlot1.datasetChanged(datasetChangeEvent19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot22.handleClick((int) (byte) 0, 100, plotRenderingInfo27);
        java.awt.Paint paint29 = piePlot22.getBaseSectionPaint();
        piePlot1.setLabelBackgroundPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot22", piePlot13.equals(piePlot22) ? piePlot13.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getShadowYOffset();
        java.awt.Stroke stroke17 = piePlot14.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot14.setInteriorGap((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot14.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot22.setToolTipGenerator(pieToolTipGenerator28);
        boolean boolean30 = piePlot22.getIgnoreNullValues();
        java.awt.Paint paint31 = piePlot22.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot33.getLegendLabelGenerator();
        piePlot22.setLegendLabelGenerator(pieSectionLabelGenerator34);
        piePlot14.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        piePlot1.setLabelGenerator(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot33", piePlot1.equals(piePlot33) ? piePlot1.hashCode() == piePlot33.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        boolean boolean26 = piePlot22.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot27 = piePlot22.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        piePlot22.axisChanged(axisChangeEvent28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        piePlot31.setIgnoreNullValues(true);
        java.awt.Paint paint34 = piePlot31.getLabelPaint();
        piePlot22.setBaseSectionPaint(paint34);
        piePlot22.setStartAngle((double) (byte) 0);
        java.awt.Image image38 = piePlot22.getBackgroundImage();
        java.awt.Paint paint39 = piePlot22.getLabelBackgroundPaint();
        piePlot0.setNoDataMessagePaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot31", piePlot14.equals(piePlot31) ? piePlot14.hashCode() == piePlot31.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        java.awt.Stroke stroke21 = null;
        piePlot19.setSectionOutlineStroke((java.lang.Comparable) '#', stroke21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = piePlot24.getToolTipGenerator();
        java.awt.Paint paint29 = piePlot24.getNoDataMessagePaint();
        piePlot24.setLabelGap(0.0d);
        java.awt.Paint paint34 = piePlot24.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot19.setLabelPaint(paint34);
        java.awt.Paint paint36 = piePlot19.getLabelLinkPaint();
        piePlot19.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        piePlot19.setLabelShadowPaint(paint43);
        piePlot1.setSectionPaint((java.lang.Comparable) 10.0d, paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot40", piePlot10.equals(piePlot40) ? piePlot10.hashCode() == piePlot40.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        piePlot1.setBaseSectionOutlinePaint(paint10);
        double double12 = piePlot1.getShadowXOffset();
        java.lang.Object obj13 = piePlot1.clone();
        int int14 = piePlot1.getPieIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj13", piePlot1.equals(obj13) ? piePlot1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot15.handleClick((int) (byte) 0, 100, plotRenderingInfo20);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot15.datasetChanged(datasetChangeEvent22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot25.getSimpleLabelOffset();
        piePlot15.setInsets(rectangleInsets27, false);
        piePlot1.setInsets(rectangleInsets27, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        piePlot1.handleClick((int) (short) 10, 0, plotRenderingInfo34);
        piePlot1.setInteriorGap((double) 0L);
        org.jfree.data.general.DatasetGroup datasetGroup38 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        java.awt.Stroke stroke42 = null;
        piePlot40.setSectionOutlineStroke((java.lang.Comparable) '#', stroke42);
        java.lang.String str44 = piePlot40.getPlotType();
        java.awt.Paint paint46 = piePlot40.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator47 = piePlot40.getURLGenerator();
        piePlot40.setIgnoreZeroValues(false);
        double double50 = piePlot40.getLabelLinkMargin();
        piePlot40.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        piePlot54.handleClick((int) (byte) 0, 100, plotRenderingInfo59);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent61 = null;
        piePlot54.datasetChanged(datasetChangeEvent61);
        org.jfree.data.general.PieDataset pieDataset63 = null;
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot(pieDataset63);
        double double65 = piePlot64.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot64.getSimpleLabelOffset();
        piePlot54.setInsets(rectangleInsets66, false);
        piePlot40.setInsets(rectangleInsets66, true);
        piePlot1.setSimpleLabelOffset(rectangleInsets66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot15 and piePlot54", piePlot15.equals(piePlot54) ? piePlot15.hashCode() == piePlot54.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        double double22 = piePlot21.getShadowYOffset();
        java.awt.Image image23 = piePlot21.getBackgroundImage();
        piePlot21.setIgnoreZeroValues(false);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        piePlot27.datasetChanged(datasetChangeEvent31);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        piePlot34.handleClick((int) (byte) 0, 100, plotRenderingInfo39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        piePlot34.setLabelBackgroundPaint(paint45);
        piePlot27.setLabelShadowPaint(paint45);
        piePlot21.setLabelBackgroundPaint(paint45);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        piePlot50.setIgnoreNullValues(true);
        piePlot50.setNoDataMessage("hi!");
        java.awt.Stroke stroke56 = piePlot50.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        piePlot21.setBaseSectionOutlineStroke(stroke56);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) (byte) -1, stroke56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot42", piePlot11.equals(piePlot42) ? piePlot11.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        java.lang.Object obj10 = piePlot1.clone();
        double double11 = piePlot1.getLabelGap();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj10", piePlot1.equals(obj10) ? piePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        java.lang.String str12 = piePlot1.getPlotType();
        java.lang.String str13 = piePlot1.getPlotType();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        piePlot1.removeChangeListener(plotChangeListener14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        java.awt.Stroke stroke19 = null;
        piePlot17.setSectionOutlineStroke((java.lang.Comparable) '#', stroke19);
        java.lang.String str21 = piePlot17.getPlotType();
        java.awt.Shape shape22 = piePlot17.getLegendItemShape();
        piePlot17.setOutlineVisible(true);
        boolean boolean25 = piePlot1.equals((java.lang.Object) piePlot17);
        java.awt.Paint paint26 = piePlot1.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = null;
        piePlot28.setLegendLabelURLGenerator(pieURLGenerator32);
        java.lang.Comparable comparable35 = piePlot28.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot28.drawBackgroundImage(graphics2D36, rectangle2D37);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot28.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot28", piePlot1.equals(piePlot28) ? piePlot1.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        java.awt.Stroke stroke4 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        double double7 = piePlot6.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot6.notifyListeners(plotChangeEvent8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot6.getSimpleLabelOffset();
        java.awt.Paint paint11 = piePlot6.getLabelBackgroundPaint();
        double double12 = piePlot6.getStartAngle();
        java.awt.Paint paint13 = piePlot6.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        java.awt.Stroke stroke17 = null;
        piePlot15.setSectionOutlineStroke((java.lang.Comparable) '#', stroke17);
        java.lang.String str19 = piePlot15.getPlotType();
        java.lang.String str20 = piePlot15.getNoDataMessage();
        piePlot15.setSimpleLabels(true);
        boolean boolean23 = piePlot15.getSimpleLabels();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        boolean boolean29 = piePlot25.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot30 = piePlot25.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        piePlot25.axisChanged(axisChangeEvent31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = piePlot25.getDrawingSupplier();
        piePlot15.setDrawingSupplier(drawingSupplier33);
        piePlot6.setDrawingSupplier(drawingSupplier33);
        piePlot1.setDrawingSupplier(drawingSupplier33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot6", piePlot1.equals(piePlot6) ? piePlot1.hashCode() == piePlot6.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot32 = piePlot27.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent33 = null;
        piePlot27.axisChanged(axisChangeEvent33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = piePlot27.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        java.awt.Stroke stroke40 = null;
        piePlot38.setSectionOutlineStroke((java.lang.Comparable) '#', stroke40);
        java.lang.String str42 = piePlot38.getPlotType();
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        piePlot38.setBaseSectionOutlinePaint(paint47);
        piePlot27.setSectionOutlinePaint((java.lang.Comparable) 100L, paint47);
        piePlot1.setShadowPaint(paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot44", piePlot16.equals(piePlot44) ? piePlot16.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        java.lang.Object obj10 = piePlot1.clone();
        float float11 = piePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj10", piePlot1.equals(obj10) ? piePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot1.removeChangeListener(plotChangeListener6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        java.awt.Stroke stroke11 = null;
        piePlot9.setSectionOutlineStroke((java.lang.Comparable) '#', stroke11);
        java.lang.String str13 = piePlot9.getPlotType();
        java.awt.Shape shape14 = piePlot9.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = null;
        piePlot9.setLegendLabelURLGenerator(pieURLGenerator15);
        piePlot9.setIgnoreZeroValues(false);
        double double19 = piePlot9.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot21.getInsets();
        double double24 = piePlot21.getInteriorGap();
        org.jfree.chart.util.Rotation rotation25 = piePlot21.getDirection();
        piePlot9.setDirection(rotation25);
        piePlot1.setDirection(rotation25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot21", piePlot1.equals(piePlot21) ? piePlot1.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getShadowYOffset();
        java.awt.Stroke stroke35 = piePlot32.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint36 = piePlot32.getBaseSectionPaint();
        piePlot1.setBackgroundPaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot32", piePlot8.equals(piePlot32) ? piePlot8.hashCode() == piePlot32.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        java.awt.Image image31 = piePlot24.getBackgroundImage();
        java.awt.Paint paint32 = piePlot24.getBaseSectionPaint();
        java.awt.Paint paint33 = piePlot24.getBaseSectionPaint();
        java.awt.Paint paint34 = piePlot24.getBaseSectionPaint();
        piePlot1.setLabelPaint(paint34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        java.awt.Stroke stroke39 = null;
        piePlot37.setSectionOutlineStroke((java.lang.Comparable) '#', stroke39);
        java.lang.String str41 = piePlot37.getPlotType();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        piePlot37.setBaseSectionOutlinePaint(paint46);
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        piePlot37.drawBackgroundImage(graphics2D48, rectangle2D49);
        org.jfree.chart.util.Rotation rotation51 = piePlot37.getDirection();
        piePlot1.setDirection(rotation51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot43", piePlot24.equals(piePlot43) ? piePlot24.hashCode() == piePlot43.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        java.lang.Object obj7 = piePlot1.clone();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot1.setURLGenerator(pieURLGenerator8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj7", piePlot1.equals(obj7) ? piePlot1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        java.awt.Stroke stroke29 = piePlot26.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot26.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = piePlot33.getLabelShadowPaint();
        piePlot33.setLabelGap(0.0d);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot33.setLabelLinkPaint(paint42);
        piePlot26.setLabelPaint(paint42);
        float float45 = piePlot26.getBackgroundAlpha();
        piePlot26.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset48 = piePlot26.getDataset();
        java.awt.Font font49 = piePlot26.getLabelFont();
        piePlot1.setNoDataMessageFont(font49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot33", piePlot8.equals(piePlot33) ? piePlot8.hashCode() == piePlot33.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        java.awt.Stroke stroke13 = null;
        piePlot11.setSectionOutlineStroke((java.lang.Comparable) '#', stroke13);
        java.lang.String str15 = piePlot11.getPlotType();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        piePlot11.setBaseSectionOutlinePaint(paint20);
        piePlot1.setNoDataMessagePaint(paint20);
        java.awt.Paint paint24 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        double double25 = piePlot1.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot27.getSimpleLabelOffset();
        java.awt.Paint paint32 = piePlot27.getLabelBackgroundPaint();
        double double33 = piePlot27.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        boolean boolean39 = piePlot35.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot40 = piePlot35.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        piePlot35.axisChanged(axisChangeEvent41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = piePlot35.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        java.awt.Stroke stroke48 = null;
        piePlot46.setSectionOutlineStroke((java.lang.Comparable) '#', stroke48);
        java.lang.String str50 = piePlot46.getPlotType();
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        piePlot46.setBaseSectionOutlinePaint(paint55);
        piePlot35.setSectionOutlinePaint((java.lang.Comparable) 100L, paint55);
        java.awt.Paint paint58 = piePlot35.getShadowPaint();
        piePlot27.setBaseSectionOutlinePaint(paint58);
        piePlot1.setNoDataMessagePaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot46", piePlot11.equals(piePlot46) ? piePlot11.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        java.awt.Image image31 = piePlot24.getBackgroundImage();
        java.awt.Paint paint32 = piePlot24.getBaseSectionPaint();
        java.awt.Paint paint33 = piePlot24.getBaseSectionPaint();
        java.awt.Paint paint34 = piePlot24.getBaseSectionPaint();
        piePlot1.setLabelPaint(paint34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot37.getLabelShadowPaint();
        piePlot37.setShadowXOffset(90.0d);
        piePlot37.setForegroundAlpha(10.0f);
        piePlot37.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        double double53 = piePlot52.getShadowYOffset();
        java.awt.Image image54 = piePlot52.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator55 = piePlot52.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D56 = null;
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        piePlot52.drawBackgroundImage(graphics2D56, rectangle2D57);
        java.awt.Image image59 = null;
        piePlot52.setBackgroundImage(image59);
        java.awt.Stroke stroke63 = piePlot52.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float64 = piePlot52.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator65 = piePlot52.getLabelGenerator();
        piePlot37.setLegendLabelToolTipGenerator(pieSectionLabelGenerator65);
        piePlot1.setLabelGenerator(pieSectionLabelGenerator65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot52", piePlot12.equals(piePlot52) ? piePlot12.hashCode() == piePlot52.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        java.awt.Stroke stroke43 = null;
        piePlot41.setSectionOutlineStroke((java.lang.Comparable) '#', stroke43);
        java.lang.String str45 = piePlot41.getPlotType();
        java.lang.String str46 = piePlot41.getNoDataMessage();
        piePlot41.setSimpleLabels(true);
        boolean boolean49 = piePlot41.getSimpleLabels();
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        piePlot51.setIgnoreNullValues(true);
        java.awt.Paint paint54 = piePlot51.getLabelPaint();
        boolean boolean55 = piePlot51.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot56 = piePlot51.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent57 = null;
        piePlot51.axisChanged(axisChangeEvent57);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = piePlot51.getDrawingSupplier();
        piePlot41.setDrawingSupplier(drawingSupplier59);
        org.jfree.data.general.PieDataset pieDataset61 = null;
        org.jfree.chart.plot.PiePlot piePlot62 = new org.jfree.chart.plot.PiePlot(pieDataset61);
        double double63 = piePlot62.getShadowYOffset();
        java.awt.Image image64 = piePlot62.getBackgroundImage();
        piePlot62.setIgnoreZeroValues(false);
        java.awt.Paint paint67 = piePlot62.getOutlinePaint();
        piePlot41.setBackgroundPaint(paint67);
        piePlot24.setLabelShadowPaint(paint67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot33 and piePlot62", piePlot33.equals(piePlot62) ? piePlot33.hashCode() == piePlot62.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot15.handleClick((int) (byte) 0, 100, plotRenderingInfo20);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot15.datasetChanged(datasetChangeEvent22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot25.getSimpleLabelOffset();
        piePlot15.setInsets(rectangleInsets27, false);
        piePlot1.setInsets(rectangleInsets27, true);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        java.awt.Stroke stroke35 = null;
        piePlot33.setSectionOutlineStroke((java.lang.Comparable) '#', stroke35);
        java.lang.String str37 = piePlot33.getPlotType();
        java.awt.Shape shape38 = piePlot33.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = null;
        piePlot33.setLegendLabelURLGenerator(pieURLGenerator39);
        piePlot33.setIgnoreZeroValues(false);
        double double43 = piePlot33.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot45.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot45.getInsets();
        double double48 = piePlot45.getInteriorGap();
        org.jfree.chart.util.Rotation rotation49 = piePlot45.getDirection();
        piePlot33.setDirection(rotation49);
        piePlot1.setDirection(rotation49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot25 and piePlot45", piePlot25.equals(piePlot45) ? piePlot25.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        piePlot1.setBaseSectionOutlinePaint(paint10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
        double double15 = piePlot1.getInteriorGap();
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
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        piePlot45.setIgnoreNullValues(true);
        java.awt.Paint paint48 = piePlot45.getLabelPaint();
        java.awt.Image image49 = null;
        piePlot45.setBackgroundImage(image49);
        java.awt.Paint paint51 = piePlot45.getLabelShadowPaint();
        piePlot45.setLabelGap(0.0d);
        java.awt.Paint paint54 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot45.setLabelLinkPaint(paint54);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        piePlot57.setIgnoreNullValues(true);
        java.awt.Paint paint60 = piePlot57.getLabelPaint();
        java.awt.Image image61 = null;
        piePlot57.setBackgroundImage(image61);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator63 = null;
        piePlot57.setToolTipGenerator(pieToolTipGenerator63);
        piePlot57.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset67 = null;
        org.jfree.chart.plot.PiePlot piePlot68 = new org.jfree.chart.plot.PiePlot(pieDataset67);
        piePlot68.setIgnoreNullValues(true);
        java.awt.Paint paint71 = piePlot68.getLabelPaint();
        boolean boolean72 = piePlot68.getIgnoreZeroValues();
        java.awt.Shape shape73 = piePlot68.getLegendItemShape();
        boolean boolean74 = piePlot57.equals((java.lang.Object) piePlot68);
        piePlot45.setParent((org.jfree.chart.plot.Plot) piePlot68);
        java.awt.Paint paint77 = piePlot45.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        piePlot17.setSectionPaint((java.lang.Comparable) (short) 10, paint77);
        piePlot1.setLabelShadowPaint(paint77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot68", piePlot7.equals(piePlot68) ? piePlot7.hashCode() == piePlot68.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Stroke stroke8 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        piePlot10.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot10.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        java.awt.Stroke stroke18 = null;
        piePlot16.setSectionOutlineStroke((java.lang.Comparable) '#', stroke18);
        java.lang.String str20 = piePlot16.getPlotType();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        piePlot16.setBaseSectionOutlinePaint(paint25);
        piePlot10.setLabelLinkPaint(paint25);
        piePlot1.setShadowPaint(paint25);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getShadowYOffset();
        java.awt.Stroke stroke33 = piePlot30.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint34 = piePlot30.getBaseSectionPaint();
        piePlot1.setBackgroundPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot30", piePlot10.equals(piePlot30) ? piePlot10.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        java.awt.Image image12 = null;
        piePlot8.setBackgroundImage(image12);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator14 = null;
        piePlot8.setToolTipGenerator(pieToolTipGenerator14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot8.setDataset(pieDataset16);
        java.awt.Stroke stroke20 = piePlot8.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        piePlot1.setOutlineStroke(stroke20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot8", piePlot1.equals(piePlot8) ? piePlot1.hashCode() == piePlot8.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        boolean boolean32 = piePlot28.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot33 = piePlot28.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent34 = null;
        piePlot28.axisChanged(axisChangeEvent34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = piePlot28.getDrawingSupplier();
        java.awt.Stroke stroke37 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot28.setOutlineStroke(stroke37);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        double double41 = piePlot40.getShadowYOffset();
        java.awt.Stroke stroke43 = piePlot40.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = null;
        piePlot45.notifyListeners(plotChangeEvent47);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = piePlot45.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = piePlot45.getSimpleLabelOffset();
        piePlot40.setInsets(rectangleInsets50);
        piePlot28.setInsets(rectangleInsets50, false);
        piePlot1.setInsets(rectangleInsets50, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot40", piePlot9.equals(piePlot40) ? piePlot9.hashCode() == piePlot40.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getShadowYOffset();
        java.awt.Stroke stroke21 = piePlot18.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot11.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint30 = piePlot24.getLabelShadowPaint();
        java.awt.Paint paint33 = piePlot24.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot11.setNoDataMessagePaint(paint33);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot11.getLegendLabelGenerator();
        piePlot11.setBackgroundAlpha((float) (short) 10);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        piePlot11.drawBackgroundImage(graphics2D38, rectangle2D39);
        java.awt.Font font41 = piePlot11.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot24", piePlot1.equals(piePlot24) ? piePlot1.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent41 = null;
        piePlot37.datasetChanged(datasetChangeEvent41);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        piePlot44.handleClick((int) (byte) 0, 100, plotRenderingInfo49);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        piePlot44.setLabelBackgroundPaint(paint55);
        piePlot37.setLabelShadowPaint(paint55);
        java.awt.Stroke stroke58 = piePlot37.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = piePlot37.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot52", piePlot22.equals(piePlot52) ? piePlot22.hashCode() == piePlot52.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        java.awt.Stroke stroke28 = null;
        piePlot26.setSectionOutlineStroke((java.lang.Comparable) '#', stroke28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        piePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator35 = piePlot31.getToolTipGenerator();
        java.awt.Paint paint36 = piePlot31.getNoDataMessagePaint();
        piePlot31.setLabelGap(0.0d);
        java.awt.Paint paint41 = piePlot31.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot26.setLabelPaint(paint41);
        java.awt.Paint paint43 = piePlot26.getLabelLinkPaint();
        piePlot26.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        double double48 = piePlot47.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        piePlot47.notifyListeners(plotChangeEvent49);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot47.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot47.getSimpleLabelOffset();
        java.awt.Paint paint53 = piePlot47.getLabelBackgroundPaint();
        java.awt.Paint paint54 = piePlot47.getLabelShadowPaint();
        piePlot26.setOutlinePaint(paint54);
        piePlot1.setLabelLinkPaint(paint54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot47", piePlot14.equals(piePlot47) ? piePlot14.hashCode() == piePlot47.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        java.lang.Object obj18 = piePlot1.clone();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot20.handleClick((int) (byte) 0, 100, plotRenderingInfo25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getShadowYOffset();
        java.awt.Stroke stroke31 = piePlot28.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        piePlot33.notifyListeners(plotChangeEvent35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot33.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot33.getSimpleLabelOffset();
        piePlot28.setInsets(rectangleInsets38);
        piePlot20.setLabelPadding(rectangleInsets38);
        piePlot20.zoom((double) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = piePlot20.getDrawingSupplier();
        java.awt.Stroke stroke44 = piePlot20.getBaseSectionOutlineStroke();
        piePlot1.setBaseSectionOutlineStroke(stroke44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj18", piePlot1.equals(obj18) ? piePlot1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        piePlot15.datasetChanged(datasetChangeEvent19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot22.handleClick((int) (byte) 0, 100, plotRenderingInfo27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        java.awt.Paint paint33 = piePlot30.getLabelPaint();
        piePlot22.setLabelBackgroundPaint(paint33);
        piePlot15.setLabelShadowPaint(paint33);
        java.awt.Stroke stroke36 = piePlot15.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = piePlot15.getDrawingSupplier();
        java.awt.Stroke stroke39 = piePlot15.lookupSectionOutlineStroke((java.lang.Comparable) (short) 100);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot15.getLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot22", piePlot1.equals(piePlot22) ? piePlot1.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint6 = piePlot1.getSectionPaint((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        piePlot8.notifyListeners(plotChangeEvent10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot8.getSimpleLabelOffset();
        boolean boolean13 = piePlot8.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        piePlot15.setLabelPaint(paint21);
        piePlot8.setBackgroundPaint(paint21);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Image image29 = null;
        piePlot25.setBackgroundImage(image29);
        java.awt.Paint paint31 = piePlot25.getLabelShadowPaint();
        piePlot25.setShadowXOffset(90.0d);
        piePlot25.setForegroundAlpha(10.0f);
        piePlot25.setCircular(true, false);
        double double39 = piePlot25.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor40 = piePlot25.getLabelDistributor();
        piePlot8.setLabelDistributor(abstractPieLabelDistributor40);
        piePlot1.setLabelDistributor(abstractPieLabelDistributor40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot15", piePlot1.equals(piePlot15) ? piePlot1.hashCode() == piePlot15.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = piePlot33.getLabelShadowPaint();
        java.awt.Image image40 = piePlot33.getBackgroundImage();
        java.awt.Paint paint41 = piePlot33.getBaseSectionPaint();
        java.awt.Paint paint42 = piePlot33.getBaseSectionPaint();
        java.awt.Paint paint43 = piePlot33.getBaseSectionPaint();
        piePlot1.setLabelBackgroundPaint(paint43);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        boolean boolean50 = piePlot46.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot51 = piePlot46.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent52 = null;
        piePlot46.axisChanged(axisChangeEvent52);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = piePlot46.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset55 = null;
        piePlot46.setDataset(pieDataset55);
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator59 = piePlot58.getLegendLabelGenerator();
        piePlot46.setLabelGenerator(pieSectionLabelGenerator59);
        piePlot1.setLabelGenerator(pieSectionLabelGenerator59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot33 and piePlot46", piePlot33.equals(piePlot46) ? piePlot33.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        piePlot1.setLabelBackgroundPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (-1L));
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint30 = piePlot24.getLabelShadowPaint();
        java.awt.Image image31 = piePlot24.getBackgroundImage();
        java.awt.Paint paint32 = piePlot24.getBaseSectionPaint();
        piePlot1.setBackgroundPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot24", piePlot13.equals(piePlot24) ? piePlot13.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        boolean boolean22 = piePlot18.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getShadowYOffset();
        java.awt.Stroke stroke28 = piePlot25.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot18.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke28);
        piePlot18.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke32 = piePlot18.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent38 = null;
        piePlot34.datasetChanged(datasetChangeEvent38);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        piePlot41.handleClick((int) (byte) 0, 100, plotRenderingInfo46);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        piePlot41.setLabelBackgroundPaint(paint52);
        piePlot34.setLabelShadowPaint(paint52);
        piePlot18.setParent((org.jfree.chart.plot.Plot) piePlot34);
        java.awt.Stroke stroke57 = piePlot34.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot1.setLabelLinkStroke(stroke57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot13.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot13.getSimpleLabelOffset();
        java.awt.Paint paint20 = piePlot13.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getShadowYOffset();
        java.awt.Stroke stroke25 = piePlot22.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot22.setInteriorGap((double) (short) 0);
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
        piePlot22.setLabelPaint(paint38);
        float float41 = piePlot22.getBackgroundAlpha();
        piePlot22.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = null;
        piePlot45.notifyListeners(plotChangeEvent47);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = piePlot45.getSimpleLabelOffset();
        java.awt.Paint paint50 = piePlot45.getLabelBackgroundPaint();
        double double51 = piePlot45.getStartAngle();
        java.awt.Paint paint52 = piePlot45.getLabelOutlinePaint();
        piePlot22.setLabelBackgroundPaint(paint52);
        piePlot13.setShadowPaint(paint52);
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        piePlot56.setIgnoreNullValues(true);
        java.awt.Paint paint59 = piePlot56.getLabelPaint();
        boolean boolean60 = piePlot56.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator61 = null;
        piePlot56.setToolTipGenerator(pieToolTipGenerator61);
        java.awt.Stroke stroke63 = piePlot56.getLabelLinkStroke();
        java.awt.Stroke stroke64 = piePlot56.getLabelLinkStroke();
        piePlot13.setLabelOutlineStroke(stroke64);
        piePlot1.setBaseSectionOutlineStroke(stroke64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot56", piePlot1.equals(piePlot56) ? piePlot1.hashCode() == piePlot56.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getShadowYOffset();
        java.awt.Image image21 = piePlot19.getBackgroundImage();
        piePlot19.setIgnoreZeroValues(false);
        java.awt.Paint paint24 = piePlot19.getOutlinePaint();
        piePlot1.setLabelBackgroundPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot19", piePlot7.equals(piePlot19) ? piePlot7.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot18.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot18.getSimpleLabelOffset();
        piePlot13.setInsets(rectangleInsets23);
        piePlot1.setInsets(rectangleInsets23, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = null;
        piePlot1.setURLGenerator(pieURLGenerator27);
        java.awt.Paint paint29 = piePlot1.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        piePlot31.setIgnoreNullValues(true);
        java.awt.Paint paint34 = piePlot31.getLabelPaint();
        java.awt.Image image35 = null;
        piePlot31.setBackgroundImage(image35);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator37 = null;
        piePlot31.setToolTipGenerator(pieToolTipGenerator37);
        boolean boolean39 = piePlot31.getIgnoreNullValues();
        java.awt.Paint paint40 = piePlot31.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot42.getLegendLabelGenerator();
        piePlot31.setLegendLabelGenerator(pieSectionLabelGenerator43);
        boolean boolean45 = piePlot31.isCircular();
        piePlot31.setBackgroundImageAlignment((int) (short) 1);
        piePlot31.setShadowYOffset((double) (byte) -1);
        double double50 = piePlot31.getMaximumLabelWidth();
        piePlot31.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double55 = piePlot31.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke56 = piePlot31.getBaseSectionOutlineStroke();
        java.awt.Paint paint57 = piePlot31.getOutlinePaint();
        piePlot1.setBackgroundPaint(paint57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot42", piePlot18.equals(piePlot42) ? piePlot18.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        piePlot1.setInsets(rectangleInsets30, false);
        java.awt.Stroke stroke34 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) "");
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        boolean boolean40 = piePlot36.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        double double44 = piePlot43.getShadowYOffset();
        java.awt.Stroke stroke46 = piePlot43.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot36.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke46);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        double double50 = piePlot49.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent51 = null;
        piePlot49.notifyListeners(plotChangeEvent51);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = piePlot49.getSimpleLabelOffset();
        java.awt.Font font54 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot49.setNoDataMessageFont(font54);
        piePlot36.setLabelFont(font54);
        piePlot1.setNoDataMessageFont(font54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot43", piePlot11.equals(piePlot43) ? piePlot11.hashCode() == piePlot43.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getShadowYOffset();
        java.awt.Stroke stroke23 = piePlot20.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot20.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        piePlot27.setLabelGap(0.0d);
        java.awt.Paint paint36 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot27.setLabelLinkPaint(paint36);
        piePlot20.setLabelPaint(paint36);
        float float39 = piePlot20.getBackgroundAlpha();
        piePlot20.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset42 = piePlot20.getDataset();
        java.awt.Font font43 = piePlot20.getLabelFont();
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        piePlot20.addChangeListener(plotChangeListener44);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        java.awt.Stroke stroke49 = null;
        piePlot47.setSectionOutlineStroke((java.lang.Comparable) '#', stroke49);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        double double53 = piePlot52.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent54 = null;
        piePlot52.notifyListeners(plotChangeEvent54);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator56 = piePlot52.getToolTipGenerator();
        java.awt.Paint paint57 = piePlot52.getNoDataMessagePaint();
        piePlot52.setLabelGap(0.0d);
        java.awt.Paint paint62 = piePlot52.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot47.setLabelPaint(paint62);
        java.awt.Paint paint64 = piePlot47.getLabelLinkPaint();
        piePlot47.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset67 = null;
        org.jfree.chart.plot.PiePlot piePlot68 = new org.jfree.chart.plot.PiePlot(pieDataset67);
        piePlot68.setIgnoreNullValues(true);
        java.awt.Paint paint71 = piePlot68.getLabelPaint();
        java.awt.Image image72 = null;
        piePlot68.setBackgroundImage(image72);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator74 = null;
        piePlot68.setToolTipGenerator(pieToolTipGenerator74);
        boolean boolean76 = piePlot68.getIgnoreNullValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets77 = piePlot68.getSimpleLabelOffset();
        piePlot47.setLabelPadding(rectangleInsets77);
        piePlot20.setInsets(rectangleInsets77);
        piePlot1.setLabelPadding(rectangleInsets77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot68", piePlot10.equals(piePlot68) ? piePlot10.hashCode() == piePlot68.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        boolean boolean16 = piePlot1.getLabelLinksVisible();
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
        piePlot1.setBaseSectionOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot18", piePlot10.equals(piePlot18) ? piePlot10.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        double double14 = piePlot1.getLabelLinkMargin();
        java.awt.Paint paint15 = piePlot1.getOutlinePaint();
        java.awt.Paint paint16 = piePlot1.getBaseSectionOutlinePaint();
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = piePlot18.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getLabelLinkMargin();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
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
        piePlot1.setLabelPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot8", piePlot1.equals(piePlot8) ? piePlot1.hashCode() == piePlot8.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        double double9 = piePlot8.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        piePlot8.notifyListeners(plotChangeEvent10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot8.getSimpleLabelOffset();
        java.awt.Paint paint13 = piePlot8.getLabelBackgroundPaint();
        double double14 = piePlot8.getStartAngle();
        java.awt.Paint paint15 = piePlot8.getLabelOutlinePaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot8.getLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot8", piePlot1.equals(piePlot8) ? piePlot1.hashCode() == piePlot8.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
        piePlot1.setShadowYOffset(4.0d);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        java.awt.Paint paint22 = piePlot13.lookupSectionPaint((java.lang.Comparable) "", false);
        java.awt.Paint paint23 = piePlot13.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot13.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot4 and piePlot13", piePlot4.equals(piePlot13) ? piePlot4.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        piePlot1.setBaseSectionOutlinePaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot20", piePlot11.equals(piePlot20) ? piePlot11.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        java.awt.Paint paint29 = piePlot1.getLabelOutlinePaint();
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
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        java.awt.Image image52 = null;
        piePlot48.setBackgroundImage(image52);
        java.awt.Paint paint54 = piePlot48.getLabelShadowPaint();
        piePlot48.setShadowXOffset(90.0d);
        piePlot48.setForegroundAlpha(10.0f);
        piePlot48.setCircular(true, false);
        double double62 = piePlot48.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor63 = piePlot48.getLabelDistributor();
        piePlot31.setLabelDistributor(abstractPieLabelDistributor63);
        java.awt.Paint paint65 = piePlot31.getNoDataMessagePaint();
        piePlot1.setBaseSectionPaint(paint65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot38", piePlot8.equals(piePlot38) ? piePlot8.hashCode() == piePlot38.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        boolean boolean13 = piePlot9.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot14 = piePlot9.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        piePlot9.axisChanged(axisChangeEvent15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = piePlot9.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier17);
        java.awt.Font font19 = piePlot1.getLabelFont();
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
        piePlot1.setInsets(rectangleInsets31, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot21", piePlot9.equals(piePlot21) ? piePlot9.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        boolean boolean13 = piePlot9.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot14 = piePlot9.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        piePlot9.axisChanged(axisChangeEvent15);
        java.lang.String str17 = piePlot9.getNoDataMessage();
        java.awt.Image image18 = null;
        piePlot9.setBackgroundImage(image18);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        piePlot9.setLabelBackgroundPaint(paint27);
        java.awt.Stroke stroke30 = piePlot9.lookupSectionOutlineStroke((java.lang.Comparable) (-1L));
        piePlot1.setBaseSectionOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot21", piePlot1.equals(piePlot21) ? piePlot1.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
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
        piePlot8.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint36);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        java.awt.Image image44 = null;
        piePlot40.setBackgroundImage(image44);
        java.awt.Paint paint46 = piePlot40.getLabelShadowPaint();
        java.awt.Image image47 = piePlot40.getBackgroundImage();
        java.awt.Paint paint48 = piePlot40.getBaseSectionPaint();
        java.awt.Paint paint49 = piePlot40.getBaseSectionPaint();
        java.awt.Paint paint50 = piePlot40.getBaseSectionPaint();
        piePlot8.setLabelBackgroundPaint(paint50);
        org.jfree.chart.util.Rotation rotation52 = piePlot8.getDirection();
        piePlot1.setDirection(rotation52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot40", piePlot1.equals(piePlot40) ? piePlot1.hashCode() == piePlot40.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot12.setToolTipGenerator(pieToolTipGenerator18);
        boolean boolean20 = piePlot12.getIgnoreNullValues();
        java.awt.Paint paint21 = piePlot12.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot23.getLegendLabelGenerator();
        piePlot12.setLegendLabelGenerator(pieSectionLabelGenerator24);
        boolean boolean26 = piePlot12.isCircular();
        piePlot12.setBackgroundImageAlignment((int) (short) 1);
        piePlot12.setShadowYOffset((double) (byte) -1);
        double double31 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot12.getLabelPadding();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator33 = piePlot12.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator24 and pieSectionLabelGenerator33", pieSectionLabelGenerator24.equals(pieSectionLabelGenerator33) ? pieSectionLabelGenerator24.hashCode() == pieSectionLabelGenerator33.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        boolean boolean13 = piePlot9.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot14 = piePlot9.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        piePlot9.axisChanged(axisChangeEvent15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = piePlot9.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        java.awt.Image image24 = null;
        piePlot20.setBackgroundImage(image24);
        java.awt.Image image26 = piePlot20.getBackgroundImage();
        float float27 = piePlot20.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator35 = null;
        piePlot29.setToolTipGenerator(pieToolTipGenerator35);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        java.awt.Paint paint42 = piePlot39.getLabelPaint();
        java.awt.Paint paint43 = piePlot39.getNoDataMessagePaint();
        piePlot29.setSectionPaint((java.lang.Comparable) 0, paint43);
        java.awt.Paint paint47 = piePlot29.lookupSectionOutlinePaint((java.lang.Comparable) '4', false);
        piePlot20.setNoDataMessagePaint(paint47);
        piePlot1.setBackgroundPaint(paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot39", piePlot9.equals(piePlot39) ? piePlot9.hashCode() == piePlot39.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset2 = null;
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot(pieDataset2);
        piePlot3.setIgnoreNullValues(true);
        java.awt.Paint paint6 = piePlot3.getLabelPaint();
        boolean boolean7 = piePlot3.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot8 = piePlot3.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot3.axisChanged(axisChangeEvent9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = piePlot3.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        piePlot3.setDataset(pieDataset12);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot15.getLegendLabelGenerator();
        piePlot3.setLabelGenerator(pieSectionLabelGenerator16);
        double double18 = piePlot3.getLabelGap();
        piePlot3.setStartAngle((double) (byte) 0);
        java.awt.Paint paint22 = piePlot3.lookupSectionPaint((java.lang.Comparable) 100);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        piePlot25.setNoDataMessage("hi!");
        java.awt.Stroke stroke31 = piePlot25.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        piePlot3.setSectionOutlineStroke((java.lang.Comparable) 0.0d, stroke31);
        piePlot0.setOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot15", piePlot0.equals(piePlot15) ? piePlot0.hashCode() == piePlot15.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent1 = null;
        piePlot0.notifyListeners(plotChangeEvent1);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot0.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getShadowYOffset();
        java.awt.Stroke stroke8 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot5.setInteriorGap((double) (short) 0);
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
        piePlot5.setLabelPaint(paint21);
        float float24 = piePlot5.getBackgroundAlpha();
        piePlot5.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot28.getSimpleLabelOffset();
        java.awt.Paint paint33 = piePlot28.getLabelBackgroundPaint();
        double double34 = piePlot28.getStartAngle();
        java.awt.Paint paint35 = piePlot28.getLabelOutlinePaint();
        piePlot5.setLabelBackgroundPaint(paint35);
        piePlot5.setBackgroundAlpha((float) 1L);
        java.awt.Paint paint40 = piePlot5.getSectionPaint((java.lang.Comparable) (-1.0d));
        boolean boolean41 = piePlot0.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot28", piePlot0.equals(piePlot28) ? piePlot0.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        boolean boolean18 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot19 = piePlot14.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        piePlot14.axisChanged(axisChangeEvent20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = piePlot14.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot14.setDataset(pieDataset23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot26.getLegendLabelGenerator();
        piePlot14.setLabelGenerator(pieSectionLabelGenerator27);
        java.awt.Paint paint30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot14.setSectionOutlinePaint((java.lang.Comparable) (-1L), paint30);
        java.awt.Stroke stroke32 = piePlot14.getLabelOutlineStroke();
        piePlot1.setOutlineStroke(stroke32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier22", drawingSupplier9.equals(drawingSupplier22) ? drawingSupplier9.hashCode() == drawingSupplier22.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        java.lang.Object obj19 = piePlot1.clone();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator27 = null;
        piePlot21.setToolTipGenerator(pieToolTipGenerator27);
        boolean boolean29 = piePlot21.getIgnoreNullValues();
        java.awt.Paint paint30 = piePlot21.getLabelPaint();
        double double31 = piePlot21.getLabelLinkMargin();
        boolean boolean32 = piePlot21.isCircular();
        boolean boolean33 = piePlot21.getIgnoreZeroValues();
        piePlot21.setMaximumLabelWidth((double) 0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot21.getInsets();
        piePlot1.setInsets(rectangleInsets36, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj19", piePlot1.equals(obj19) ? piePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        java.lang.Object obj9 = piePlot1.clone();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = piePlot1.getLegendItems();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj9", piePlot1.equals(obj9) ? piePlot1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        java.lang.Object obj19 = piePlot1.clone();
        double double20 = piePlot1.getStartAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj19", piePlot1.equals(obj19) ? piePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        piePlot1.setLabelShadowPaint(paint25);
        piePlot1.setShadowYOffset(0.14d);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        java.awt.Paint paint33 = piePlot30.getLabelPaint();
        java.awt.Image image34 = null;
        piePlot30.setBackgroundImage(image34);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = null;
        piePlot30.setToolTipGenerator(pieToolTipGenerator36);
        boolean boolean38 = piePlot30.getIgnoreNullValues();
        java.awt.Paint paint39 = piePlot30.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = piePlot41.getLegendLabelGenerator();
        piePlot30.setLegendLabelGenerator(pieSectionLabelGenerator42);
        boolean boolean44 = piePlot30.isCircular();
        piePlot30.setBackgroundImageAlignment((int) (short) 1);
        piePlot30.setShadowYOffset((double) (byte) -1);
        double double49 = piePlot30.getMaximumLabelWidth();
        piePlot30.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double54 = piePlot30.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke55 = piePlot30.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        piePlot58.setIgnoreNullValues(true);
        java.awt.Paint paint61 = piePlot58.getLabelPaint();
        java.awt.Image image62 = null;
        piePlot58.setBackgroundImage(image62);
        java.awt.Paint paint64 = piePlot58.getLabelShadowPaint();
        piePlot58.setLabelGap(0.0d);
        java.awt.Paint paint67 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot58.setLabelLinkPaint(paint67);
        org.jfree.data.general.PieDataset pieDataset69 = null;
        org.jfree.chart.plot.PiePlot piePlot70 = new org.jfree.chart.plot.PiePlot(pieDataset69);
        piePlot70.setIgnoreNullValues(true);
        java.awt.Paint paint73 = piePlot70.getLabelPaint();
        java.awt.Image image74 = null;
        piePlot70.setBackgroundImage(image74);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator76 = null;
        piePlot70.setToolTipGenerator(pieToolTipGenerator76);
        piePlot70.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset80 = null;
        org.jfree.chart.plot.PiePlot piePlot81 = new org.jfree.chart.plot.PiePlot(pieDataset80);
        piePlot81.setIgnoreNullValues(true);
        java.awt.Paint paint84 = piePlot81.getLabelPaint();
        boolean boolean85 = piePlot81.getIgnoreZeroValues();
        java.awt.Shape shape86 = piePlot81.getLegendItemShape();
        boolean boolean87 = piePlot70.equals((java.lang.Object) piePlot81);
        piePlot58.setParent((org.jfree.chart.plot.Plot) piePlot81);
        java.awt.Paint paint90 = piePlot58.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        piePlot30.setSectionPaint((java.lang.Comparable) (short) 10, paint90);
        piePlot1.setBaseSectionOutlinePaint(paint90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot81", piePlot22.equals(piePlot81) ? piePlot22.hashCode() == piePlot81.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        piePlot13.handleClick((int) (byte) 0, 100, plotRenderingInfo18);
        java.awt.Paint paint20 = piePlot13.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Paint paint26 = piePlot22.getNoDataMessagePaint();
        piePlot13.setLabelBackgroundPaint(paint26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = null;
        piePlot13.setURLGenerator(pieURLGenerator28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot13.getLabelPadding();
        java.awt.Stroke stroke31 = piePlot13.getLabelLinkStroke();
        piePlot1.setLabelLinkStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot22", piePlot1.equals(piePlot22) ? piePlot1.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        piePlot27.setShadowXOffset(90.0d);
        piePlot27.setForegroundAlpha(10.0f);
        piePlot27.setCircular(true, false);
        double double41 = piePlot27.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor42 = piePlot27.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot27", piePlot1.equals(piePlot27) ? piePlot1.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot13.datasetChanged(datasetChangeEvent17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot20.handleClick((int) (byte) 0, 100, plotRenderingInfo25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        piePlot20.setLabelBackgroundPaint(paint31);
        piePlot13.setLabelShadowPaint(paint31);
        java.awt.Stroke stroke34 = piePlot13.getLabelOutlineStroke();
        java.awt.Stroke stroke35 = piePlot13.getBaseSectionOutlineStroke();
        piePlot1.setLabelOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot28", piePlot1.equals(piePlot28) ? piePlot1.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setSimpleLabels(true);
        piePlot0.zoom(0.08d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getShadowYOffset();
        java.awt.Stroke stroke10 = piePlot7.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot7.getLegendLabelGenerator();
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator5 and pieSectionLabelGenerator11", pieSectionLabelGenerator5.equals(pieSectionLabelGenerator11) ? pieSectionLabelGenerator5.hashCode() == pieSectionLabelGenerator11.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        piePlot1.setCircular(false);
        double double40 = piePlot1.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        java.awt.Image image46 = null;
        piePlot42.setBackgroundImage(image46);
        java.awt.Paint paint48 = piePlot42.getLabelShadowPaint();
        piePlot42.setLabelGap(0.0d);
        float float51 = piePlot42.getForegroundAlpha();
        boolean boolean52 = piePlot42.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator53 = null;
        piePlot42.setURLGenerator(pieURLGenerator53);
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        piePlot56.setIgnoreNullValues(true);
        java.awt.Paint paint59 = piePlot56.getLabelPaint();
        java.awt.Image image60 = null;
        piePlot56.setBackgroundImage(image60);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator62 = null;
        piePlot56.setToolTipGenerator(pieToolTipGenerator62);
        boolean boolean64 = piePlot56.getIgnoreNullValues();
        java.awt.Paint paint65 = piePlot56.getLabelPaint();
        double double66 = piePlot56.getLabelLinkMargin();
        java.awt.Font font67 = piePlot56.getLabelFont();
        piePlot42.setLabelFont(font67);
        piePlot1.setNoDataMessageFont(font67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot56", piePlot22.equals(piePlot56) ? piePlot22.hashCode() == piePlot56.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        double double31 = piePlot30.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        piePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot30.getSimpleLabelOffset();
        boolean boolean35 = piePlot30.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        piePlot37.setLabelPaint(paint43);
        piePlot30.setBackgroundPaint(paint43);
        java.awt.Paint paint47 = piePlot30.getSectionOutlinePaint((java.lang.Comparable) 100.0f);
        double double48 = piePlot30.getInteriorGap();
        java.awt.Paint paint51 = piePlot30.lookupSectionOutlinePaint((java.lang.Comparable) 1.0E-5d, true);
        piePlot1.setLabelLinkPaint(paint51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot37", piePlot12.equals(piePlot37) ? piePlot12.hashCode() == piePlot37.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        piePlot1.setLabelBackgroundPaint(paint19);
        java.awt.Stroke stroke22 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (-1L));
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator29 = null;
        piePlot24.setToolTipGenerator(pieToolTipGenerator29);
        java.awt.Stroke stroke31 = piePlot24.getLabelLinkStroke();
        piePlot1.setOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot24", piePlot13.equals(piePlot24) ? piePlot13.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot32 = piePlot27.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent33 = null;
        piePlot27.axisChanged(axisChangeEvent33);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        piePlot27.setBaseSectionPaint(paint39);
        piePlot27.setStartAngle((double) (byte) 0);
        piePlot27.setOutlineVisible(false);
        java.awt.Paint paint45 = piePlot27.getNoDataMessagePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) 15, paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot36", piePlot16.equals(piePlot36) ? piePlot16.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        piePlot13.setLabelGap(0.0d);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot13.setLabelLinkPaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Image image29 = null;
        piePlot25.setBackgroundImage(image29);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator31 = null;
        piePlot25.setToolTipGenerator(pieToolTipGenerator31);
        piePlot25.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        boolean boolean40 = piePlot36.getIgnoreZeroValues();
        java.awt.Shape shape41 = piePlot36.getLegendItemShape();
        boolean boolean42 = piePlot25.equals((java.lang.Object) piePlot36);
        piePlot13.setParent((org.jfree.chart.plot.Plot) piePlot36);
        java.awt.Paint paint45 = piePlot13.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        piePlot1.setBaseSectionOutlinePaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot36", piePlot1.equals(piePlot36) ? piePlot1.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        piePlot1.setForegroundAlpha(1.0f);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = null;
        piePlot10.setLegendLabelURLGenerator(pieURLGenerator14);
        java.lang.Comparable comparable17 = piePlot10.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot10.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot10.getLabelDistributor();
        java.awt.Paint paint23 = piePlot10.getSectionPaint((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot25.handleClick((int) (byte) 0, 100, plotRenderingInfo30);
        java.awt.Paint paint32 = piePlot25.getBaseSectionPaint();
        java.awt.Image image33 = null;
        piePlot25.setBackgroundImage(image33);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot25.getLabelPadding();
        piePlot10.setInsets(rectangleInsets35, false);
        org.jfree.chart.LegendItemCollection legendItemCollection38 = piePlot10.getLegendItems();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot25", piePlot1.equals(piePlot25) ? piePlot1.hashCode() == piePlot25.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent1 = null;
        piePlot0.notifyListeners(plotChangeEvent1);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot0.getLabelPadding();
        piePlot0.zoom(0.0d);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        piePlot6.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        piePlot10.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot10.getSimpleLabelOffset();
        boolean boolean15 = piePlot10.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        piePlot17.setLabelPaint(paint23);
        piePlot10.setBackgroundPaint(paint23);
        piePlot6.setLabelPaint(paint23);
        piePlot0.setLabelBackgroundPaint(paint23);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        boolean boolean33 = piePlot29.getIgnoreZeroValues();
        java.awt.Shape shape34 = piePlot29.getLegendItemShape();
        piePlot0.setLegendItemShape(shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot20 and piePlot29", piePlot20.equals(piePlot29) ? piePlot20.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        java.awt.Image image21 = null;
        piePlot17.setBackgroundImage(image21);
        java.awt.Image image23 = piePlot17.getBackgroundImage();
        boolean boolean24 = piePlot17.isSubplot();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getShadowYOffset();
        java.awt.Stroke stroke29 = piePlot26.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot26.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = piePlot33.getLabelShadowPaint();
        piePlot33.setLabelGap(0.0d);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot33.setLabelLinkPaint(paint42);
        piePlot26.setLabelPaint(paint42);
        float float45 = piePlot26.getBackgroundAlpha();
        piePlot26.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        double double50 = piePlot49.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent51 = null;
        piePlot49.notifyListeners(plotChangeEvent51);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = piePlot49.getSimpleLabelOffset();
        java.awt.Paint paint54 = piePlot49.getLabelBackgroundPaint();
        double double55 = piePlot49.getStartAngle();
        java.awt.Paint paint56 = piePlot49.getLabelOutlinePaint();
        piePlot26.setLabelBackgroundPaint(paint56);
        java.awt.Stroke stroke58 = piePlot26.getLabelLinkStroke();
        piePlot17.setLabelOutlineStroke(stroke58);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator60 = piePlot17.getLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot17", piePlot1.equals(piePlot17) ? piePlot1.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.awt.Paint paint6 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke7 = piePlot1.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot1.datasetChanged(datasetChangeEvent10);
        java.lang.Object obj12 = piePlot1.clone();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot1.getLabelDistributor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj12", piePlot1.equals(obj12) ? piePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        java.awt.Paint paint17 = piePlot11.getLabelShadowPaint();
        piePlot11.setLabelGap(0.0d);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot11.setLabelLinkPaint(paint20);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        java.awt.Stroke stroke26 = null;
        piePlot24.setSectionOutlineStroke((java.lang.Comparable) '#', stroke26);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        piePlot29.notifyListeners(plotChangeEvent31);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator33 = piePlot29.getToolTipGenerator();
        java.awt.Paint paint34 = piePlot29.getNoDataMessagePaint();
        piePlot29.setLabelGap(0.0d);
        java.awt.Paint paint39 = piePlot29.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot24.setLabelPaint(paint39);
        piePlot11.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint39);
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        java.awt.Image image47 = null;
        piePlot43.setBackgroundImage(image47);
        java.awt.Paint paint49 = piePlot43.getLabelShadowPaint();
        java.awt.Image image50 = piePlot43.getBackgroundImage();
        java.awt.Paint paint51 = piePlot43.getBaseSectionPaint();
        java.awt.Paint paint52 = piePlot43.getBaseSectionPaint();
        java.awt.Paint paint53 = piePlot43.getBaseSectionPaint();
        piePlot11.setLabelBackgroundPaint(paint53);
        org.jfree.chart.util.Rotation rotation55 = piePlot11.getDirection();
        piePlot1.setDirection(rotation55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot43", piePlot1.equals(piePlot43) ? piePlot1.hashCode() == piePlot43.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        boolean boolean33 = piePlot29.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        double double37 = piePlot36.getShadowYOffset();
        java.awt.Stroke stroke39 = piePlot36.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot29.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke39);
        piePlot29.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke43 = piePlot29.getLabelOutlineStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot36", piePlot11.equals(piePlot36) ? piePlot11.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        boolean boolean40 = piePlot36.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator41 = null;
        piePlot36.setToolTipGenerator(pieToolTipGenerator41);
        java.awt.Paint paint44 = piePlot36.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        double double47 = piePlot46.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent48 = null;
        piePlot46.notifyListeners(plotChangeEvent48);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = piePlot46.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot46.getSimpleLabelOffset();
        boolean boolean52 = piePlot36.equals((java.lang.Object) rectangleInsets51);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator53 = piePlot36.getLegendLabelURLGenerator();
        java.awt.Stroke stroke56 = piePlot36.lookupSectionOutlineStroke((java.lang.Comparable) 0.0f, false);
        java.lang.String str57 = piePlot36.getNoDataMessage();
        boolean boolean58 = piePlot1.equals((java.lang.Object) piePlot36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot46", piePlot24.equals(piePlot46) ? piePlot24.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.lang.Object obj8 = piePlot1.clone();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        java.awt.Stroke stroke12 = null;
        piePlot10.setSectionOutlineStroke((java.lang.Comparable) '#', stroke12);
        java.awt.Paint paint15 = piePlot10.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke16 = piePlot10.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        piePlot10.markerChanged(markerChangeEvent17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot10.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj8", piePlot1.equals(obj8) ? piePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot1.getLegendLabelURLGenerator();
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
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        java.awt.Image image36 = null;
        piePlot32.setBackgroundImage(image36);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator38 = null;
        piePlot32.setToolTipGenerator(pieToolTipGenerator38);
        piePlot32.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        boolean boolean47 = piePlot43.getIgnoreZeroValues();
        java.awt.Shape shape48 = piePlot43.getLegendItemShape();
        boolean boolean49 = piePlot32.equals((java.lang.Object) piePlot43);
        piePlot20.setParent((org.jfree.chart.plot.Plot) piePlot43);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        double double53 = piePlot52.getShadowYOffset();
        java.awt.Image image54 = piePlot52.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator55 = piePlot52.getLegendLabelURLGenerator();
        java.awt.Font font56 = piePlot52.getNoDataMessageFont();
        piePlot43.setLabelFont(font56);
        java.awt.Paint paint58 = piePlot43.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        piePlot60.setIgnoreNullValues(true);
        java.awt.Paint paint63 = piePlot60.getLabelPaint();
        java.awt.Image image64 = null;
        piePlot60.setBackgroundImage(image64);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator66 = null;
        piePlot60.setToolTipGenerator(pieToolTipGenerator66);
        boolean boolean68 = piePlot60.getIgnoreNullValues();
        piePlot60.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo73 = null;
        piePlot60.handleClick((int) 'a', (int) ' ', plotRenderingInfo73);
        java.awt.Paint paint75 = piePlot60.getNoDataMessagePaint();
        piePlot43.setBaseSectionPaint(paint75);
        piePlot1.setNoDataMessagePaint(paint75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot52", piePlot11.equals(piePlot52) ? piePlot11.hashCode() == piePlot52.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        java.awt.Stroke stroke46 = null;
        piePlot1.setLabelOutlineStroke(stroke46);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        piePlot49.handleClick((int) (byte) 0, 100, plotRenderingInfo54);
        java.awt.Paint paint56 = piePlot49.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        piePlot58.setIgnoreNullValues(true);
        java.awt.Paint paint61 = piePlot58.getLabelPaint();
        java.awt.Paint paint62 = piePlot58.getNoDataMessagePaint();
        piePlot49.setLabelBackgroundPaint(paint62);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator64 = null;
        piePlot49.setURLGenerator(pieURLGenerator64);
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot49.getLabelPadding();
        piePlot1.setInsets(rectangleInsets66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot33 and piePlot58", piePlot33.equals(piePlot58) ? piePlot33.hashCode() == piePlot58.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        java.awt.Image image30 = null;
        piePlot26.setBackgroundImage(image30);
        java.awt.Paint paint32 = piePlot26.getLabelShadowPaint();
        piePlot1.setLabelPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot26", piePlot14.equals(piePlot26) ? piePlot14.hashCode() == piePlot26.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        boolean boolean18 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot14.setToolTipGenerator(pieToolTipGenerator19);
        java.awt.Paint paint22 = piePlot14.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot24.getSimpleLabelOffset();
        boolean boolean30 = piePlot14.equals((java.lang.Object) rectangleInsets29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot14.getLegendLabelURLGenerator();
        java.awt.Stroke stroke34 = piePlot14.lookupSectionOutlineStroke((java.lang.Comparable) 0.0f, false);
        piePlot1.setOutlineStroke(stroke34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot14", piePlot1.equals(piePlot14) ? piePlot1.hashCode() == piePlot14.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot1.getInsets();
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        piePlot53.setIgnoreNullValues(true);
        java.awt.Paint paint56 = piePlot53.getLabelPaint();
        java.awt.Image image57 = null;
        piePlot53.setBackgroundImage(image57);
        java.awt.Paint paint59 = piePlot53.getLabelShadowPaint();
        piePlot53.setShadowXOffset(90.0d);
        piePlot53.setForegroundAlpha(10.0f);
        piePlot53.setCircular(true, false);
        double double67 = piePlot53.getShadowYOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator68 = null;
        piePlot53.setURLGenerator(pieURLGenerator68);
        org.jfree.data.general.PieDataset pieDataset70 = null;
        org.jfree.chart.plot.PiePlot piePlot71 = new org.jfree.chart.plot.PiePlot(pieDataset70);
        piePlot71.setIgnoreNullValues(true);
        java.awt.Paint paint74 = piePlot71.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent75 = null;
        piePlot71.datasetChanged(datasetChangeEvent75);
        org.jfree.data.general.PieDataset pieDataset77 = null;
        org.jfree.chart.plot.PiePlot piePlot78 = new org.jfree.chart.plot.PiePlot(pieDataset77);
        piePlot78.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo83 = null;
        piePlot78.handleClick((int) (byte) 0, 100, plotRenderingInfo83);
        org.jfree.data.general.PieDataset pieDataset85 = null;
        org.jfree.chart.plot.PiePlot piePlot86 = new org.jfree.chart.plot.PiePlot(pieDataset85);
        piePlot86.setIgnoreNullValues(true);
        java.awt.Paint paint89 = piePlot86.getLabelPaint();
        piePlot78.setLabelBackgroundPaint(paint89);
        piePlot71.setLabelShadowPaint(paint89);
        java.awt.Stroke stroke92 = piePlot71.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier93 = piePlot71.getDrawingSupplier();
        java.awt.Stroke stroke95 = piePlot71.lookupSectionOutlineStroke((java.lang.Comparable) (short) 100);
        piePlot53.setLabelOutlineStroke(stroke95);
        piePlot1.setBaseSectionOutlineStroke(stroke95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot86", piePlot24.equals(piePlot86) ? piePlot24.hashCode() == piePlot86.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        float float40 = piePlot19.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        java.awt.Image image46 = null;
        piePlot42.setBackgroundImage(image46);
        java.awt.Paint paint48 = piePlot42.getLabelShadowPaint();
        java.awt.Image image49 = piePlot42.getBackgroundImage();
        java.awt.Paint paint50 = piePlot42.getBaseSectionPaint();
        java.awt.Paint paint51 = piePlot42.getBaseSectionPaint();
        java.awt.Paint paint52 = piePlot42.getBaseSectionPaint();
        piePlot19.setLabelPaint(paint52);
        piePlot1.setLabelShadowPaint(paint52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot30", piePlot11.equals(piePlot30) ? piePlot11.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        piePlot23.setNoDataMessage("hi!");
        java.awt.Stroke stroke29 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.0d, stroke29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        java.awt.Image image36 = null;
        piePlot32.setBackgroundImage(image36);
        java.awt.Paint paint38 = piePlot32.getLabelShadowPaint();
        piePlot32.setShadowXOffset(90.0d);
        piePlot32.setForegroundAlpha(10.0f);
        piePlot32.setCircular(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator45 = piePlot32.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        piePlot47.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        piePlot47.handleClick((int) (byte) 0, 100, plotRenderingInfo52);
        double double54 = piePlot47.getLabelGap();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent55 = null;
        piePlot47.axisChanged(axisChangeEvent55);
        java.awt.Font font57 = piePlot47.getNoDataMessageFont();
        piePlot32.setNoDataMessageFont(font57);
        boolean boolean59 = piePlot1.equals((java.lang.Object) font57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator14 and pieSectionLabelGenerator45", pieSectionLabelGenerator14.equals(pieSectionLabelGenerator45) ? pieSectionLabelGenerator14.hashCode() == pieSectionLabelGenerator45.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        piePlot14.setShadowXOffset(90.0d);
        piePlot14.setForegroundAlpha(10.0f);
        piePlot14.setCircular(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot14.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        piePlot29.handleClick((int) (byte) 0, 100, plotRenderingInfo34);
        double double36 = piePlot29.getLabelGap();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent37 = null;
        piePlot29.axisChanged(axisChangeEvent37);
        java.awt.Font font39 = piePlot29.getNoDataMessageFont();
        piePlot14.setNoDataMessageFont(font39);
        piePlot1.setLabelFont(font39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot4 and piePlot29", piePlot4.equals(piePlot29) ? piePlot4.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        java.awt.Image image19 = null;
        piePlot15.setBackgroundImage(image19);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = null;
        piePlot15.setToolTipGenerator(pieToolTipGenerator21);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Paint paint29 = piePlot25.getNoDataMessagePaint();
        piePlot15.setSectionPaint((java.lang.Comparable) 0, paint29);
        boolean boolean31 = piePlot1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot25", piePlot1.equals(piePlot25) ? piePlot1.hashCode() == piePlot25.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot19.getSimpleLabelOffset();
        boolean boolean24 = piePlot19.getIgnoreNullValues();
        java.awt.Image image25 = piePlot19.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot32 = piePlot27.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent33 = null;
        piePlot27.axisChanged(axisChangeEvent33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = piePlot27.getDrawingSupplier();
        piePlot19.setDrawingSupplier(drawingSupplier35);
        piePlot1.setDrawingSupplier(drawingSupplier35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot27", piePlot1.equals(piePlot27) ? piePlot1.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot1.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        boolean boolean39 = piePlot35.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot40 = piePlot35.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        piePlot35.axisChanged(axisChangeEvent41);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        piePlot35.setBaseSectionPaint(paint47);
        org.jfree.data.general.DatasetGroup datasetGroup49 = piePlot35.getDatasetGroup();
        java.awt.Paint paint50 = piePlot35.getLabelPaint();
        piePlot1.setBackgroundPaint(paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot44", piePlot14.equals(piePlot44) ? piePlot14.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot18 = piePlot13.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        piePlot13.axisChanged(axisChangeEvent19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = piePlot13.getDrawingSupplier();
        java.awt.Stroke stroke22 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot13.setOutlineStroke(stroke22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getShadowYOffset();
        java.awt.Stroke stroke28 = piePlot25.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        piePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot30.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot30.getSimpleLabelOffset();
        piePlot25.setInsets(rectangleInsets35);
        piePlot13.setInsets(rectangleInsets35, false);
        piePlot1.setInsets(rectangleInsets35, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot13", piePlot1.equals(piePlot13) ? piePlot1.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Font font5 = piePlot1.getNoDataMessageFont();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        double double8 = piePlot7.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot7.notifyListeners(plotChangeEvent9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot7.getSimpleLabelOffset();
        boolean boolean12 = piePlot7.getIgnoreNullValues();
        java.awt.Image image13 = piePlot7.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        boolean boolean19 = piePlot15.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot20 = piePlot15.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        piePlot15.axisChanged(axisChangeEvent21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot15.getDrawingSupplier();
        piePlot7.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot7.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot7", piePlot1.equals(piePlot7) ? piePlot1.hashCode() == piePlot7.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        int int7 = piePlot1.getPieIndex();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot18 = piePlot13.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        piePlot13.axisChanged(axisChangeEvent19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        piePlot13.setBaseSectionPaint(paint25);
        piePlot13.setStartAngle((double) (byte) 0);
        java.awt.Image image29 = piePlot13.getBackgroundImage();
        boolean boolean30 = piePlot13.getIgnoreNullValues();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot13.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot22", piePlot1.equals(piePlot22) ? piePlot1.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "hi!");
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
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        piePlot33.notifyListeners(plotChangeEvent35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot33.getSimpleLabelOffset();
        java.awt.Paint paint38 = piePlot33.getLabelBackgroundPaint();
        double double39 = piePlot33.getStartAngle();
        java.awt.Paint paint40 = piePlot33.getLabelOutlinePaint();
        piePlot10.setLabelBackgroundPaint(paint40);
        piePlot1.setShadowPaint(paint40);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        boolean boolean48 = piePlot44.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = null;
        piePlot44.setToolTipGenerator(pieToolTipGenerator49);
        java.awt.Stroke stroke51 = piePlot44.getLabelLinkStroke();
        java.awt.Stroke stroke52 = piePlot44.getLabelLinkStroke();
        piePlot1.setLabelOutlineStroke(stroke52);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        double double56 = piePlot55.getShadowYOffset();
        java.awt.Stroke stroke58 = piePlot55.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot55.setInteriorGap((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator61 = piePlot55.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        piePlot63.setIgnoreNullValues(true);
        java.awt.Paint paint66 = piePlot63.getLabelPaint();
        java.awt.Image image67 = null;
        piePlot63.setBackgroundImage(image67);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator69 = null;
        piePlot63.setToolTipGenerator(pieToolTipGenerator69);
        boolean boolean71 = piePlot63.getIgnoreNullValues();
        java.awt.Paint paint72 = piePlot63.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset73 = null;
        org.jfree.chart.plot.PiePlot piePlot74 = new org.jfree.chart.plot.PiePlot(pieDataset73);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator75 = piePlot74.getLegendLabelGenerator();
        piePlot63.setLegendLabelGenerator(pieSectionLabelGenerator75);
        piePlot55.setLegendLabelToolTipGenerator(pieSectionLabelGenerator75);
        piePlot1.setLabelGenerator(pieSectionLabelGenerator75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot33 and piePlot74", piePlot33.equals(piePlot74) ? piePlot33.hashCode() == piePlot74.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        double double25 = piePlot24.getShadowYOffset();
        java.awt.Stroke stroke27 = piePlot24.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot24.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        piePlot31.setIgnoreNullValues(true);
        java.awt.Paint paint34 = piePlot31.getLabelPaint();
        java.awt.Image image35 = null;
        piePlot31.setBackgroundImage(image35);
        java.awt.Paint paint37 = piePlot31.getLabelShadowPaint();
        piePlot31.setLabelGap(0.0d);
        java.awt.Paint paint40 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot31.setLabelLinkPaint(paint40);
        piePlot24.setLabelPaint(paint40);
        piePlot12.setLabelLinkPaint(paint40);
        piePlot1.setOutlinePaint(paint40);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        boolean boolean50 = piePlot46.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot51 = piePlot46.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent52 = null;
        piePlot46.axisChanged(axisChangeEvent52);
        java.lang.String str54 = piePlot46.getNoDataMessage();
        java.awt.Image image55 = null;
        piePlot46.setBackgroundImage(image55);
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        piePlot58.setIgnoreNullValues(true);
        java.awt.Paint paint61 = piePlot58.getLabelPaint();
        java.awt.Image image62 = null;
        piePlot58.setBackgroundImage(image62);
        java.awt.Paint paint64 = piePlot58.getLabelShadowPaint();
        piePlot46.setLabelBackgroundPaint(paint64);
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        double double68 = piePlot67.getShadowYOffset();
        java.awt.Image image69 = piePlot67.getBackgroundImage();
        piePlot67.setIgnoreZeroValues(false);
        java.awt.Paint paint72 = piePlot67.getOutlinePaint();
        piePlot46.setBackgroundPaint(paint72);
        piePlot1.setOutlinePaint(paint72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot58", piePlot1.equals(piePlot58) ? piePlot1.hashCode() == piePlot58.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        piePlot23.setNoDataMessage("hi!");
        java.awt.Stroke stroke29 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.0d, stroke29);
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        piePlot31.setSimpleLabels(true);
        int int34 = piePlot31.getBackgroundImageAlignment();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator37 = piePlot36.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot36.getInsets();
        double double39 = piePlot36.getInteriorGap();
        org.jfree.chart.util.Rotation rotation40 = piePlot36.getDirection();
        piePlot31.setDirection(rotation40);
        piePlot1.setDirection(rotation40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot36", piePlot13.equals(piePlot36) ? piePlot13.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        org.jfree.chart.plot.Plot plot4 = piePlot1.getRootPlot();
        piePlot1.setShadowXOffset((double) (byte) 1);
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
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot26.setLegendLabelURLGenerator(pieURLGenerator30);
        java.lang.Comparable comparable33 = piePlot26.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot26.drawBackgroundImage(graphics2D34, rectangle2D35);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot26.getLabelDistributor();
        piePlot8.setLabelDistributor(abstractPieLabelDistributor37);
        piePlot1.setLabelDistributor(abstractPieLabelDistributor37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator2 and pieSectionLabelGenerator21", pieSectionLabelGenerator2.equals(pieSectionLabelGenerator21) ? pieSectionLabelGenerator2.hashCode() == pieSectionLabelGenerator21.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        java.awt.Paint paint57 = piePlot1.lookupSectionPaint((java.lang.Comparable) '4', false);
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        double double60 = piePlot59.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent61 = null;
        piePlot59.notifyListeners(plotChangeEvent61);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = piePlot59.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = piePlot59.getSimpleLabelOffset();
        java.awt.Paint paint65 = piePlot59.getLabelBackgroundPaint();
        float float66 = piePlot59.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = piePlot59.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets67);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent69 = null;
        piePlot1.datasetChanged(datasetChangeEvent69);
        org.jfree.data.general.PieDataset pieDataset71 = null;
        org.jfree.chart.plot.PiePlot piePlot72 = new org.jfree.chart.plot.PiePlot(pieDataset71);
        piePlot72.setIgnoreNullValues(true);
        java.awt.Paint paint75 = piePlot72.getLabelPaint();
        boolean boolean76 = piePlot72.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot77 = piePlot72.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent78 = null;
        piePlot72.axisChanged(axisChangeEvent78);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier80 = piePlot72.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset81 = null;
        piePlot72.setDataset(pieDataset81);
        org.jfree.data.general.PieDataset pieDataset83 = null;
        org.jfree.chart.plot.PiePlot piePlot84 = new org.jfree.chart.plot.PiePlot(pieDataset83);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator85 = piePlot84.getLegendLabelGenerator();
        piePlot72.setLabelGenerator(pieSectionLabelGenerator85);
        double double87 = piePlot72.getLabelGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets88 = piePlot72.getInsets();
        piePlot1.setInsets(rectangleInsets88, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot43 and piePlot72", piePlot43.equals(piePlot72) ? piePlot43.hashCode() == piePlot72.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        java.awt.Stroke stroke29 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 1, true);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot31.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        boolean boolean39 = piePlot35.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot40 = piePlot35.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        piePlot35.axisChanged(axisChangeEvent41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = piePlot35.getDrawingSupplier();
        java.awt.Stroke stroke44 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot35.setOutlineStroke(stroke44);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = null;
        piePlot35.setURLGenerator(pieURLGenerator46);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint50 = piePlot35.getBackgroundPaint();
        java.awt.Font font51 = piePlot35.getNoDataMessageFont();
        piePlot31.setLabelFont(font51);
        piePlot1.setLabelFont(font51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot19 and piePlot35", piePlot19.equals(piePlot35) ? piePlot19.hashCode() == piePlot35.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        java.awt.Paint paint14 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        piePlot16.setLabelGap(0.0d);
        float float25 = piePlot16.getForegroundAlpha();
        boolean boolean26 = piePlot16.getIgnoreZeroValues();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot16.removeChangeListener(plotChangeListener27);
        java.awt.Font font29 = piePlot16.getLabelFont();
        piePlot1.setNoDataMessageFont(font29);
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        java.awt.Paint paint32 = piePlot31.getShadowPaint();
        piePlot1.setLabelShadowPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot31", piePlot8.equals(piePlot31) ? piePlot8.hashCode() == piePlot31.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        piePlot1.setLabelLinkMargin((double) (-1.0f));
        piePlot1.setLabelGap((double) (short) 1);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        piePlot38.setIgnoreNullValues(true);
        java.awt.Paint paint41 = piePlot38.getLabelPaint();
        boolean boolean42 = piePlot38.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getShadowYOffset();
        java.awt.Stroke stroke48 = piePlot45.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot38.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke48);
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        double double52 = piePlot51.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent53 = null;
        piePlot51.notifyListeners(plotChangeEvent53);
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = piePlot51.getSimpleLabelOffset();
        java.awt.Font font56 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot51.setNoDataMessageFont(font56);
        piePlot38.setLabelFont(font56);
        piePlot1.setLabelFont(font56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot45", piePlot8.equals(piePlot45) ? piePlot8.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        org.jfree.chart.plot.Plot plot4 = piePlot1.getRootPlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        piePlot6.setIgnoreNullValues(true);
        java.awt.Paint paint9 = piePlot6.getLabelPaint();
        boolean boolean10 = piePlot6.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot11 = piePlot6.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        piePlot6.axisChanged(axisChangeEvent12);
        java.lang.String str14 = piePlot6.getNoDataMessage();
        java.awt.Image image15 = null;
        piePlot6.setBackgroundImage(image15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        java.awt.Paint paint24 = piePlot18.getLabelShadowPaint();
        piePlot6.setLabelBackgroundPaint(paint24);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot6.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator2 and pieSectionLabelGenerator26", pieSectionLabelGenerator2.equals(pieSectionLabelGenerator26) ? pieSectionLabelGenerator2.hashCode() == pieSectionLabelGenerator26.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        java.lang.Object obj19 = piePlot1.clone();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        boolean boolean26 = piePlot22.getIgnoreZeroValues();
        java.awt.Shape shape27 = piePlot22.getLegendItemShape();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot22.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Stroke stroke31 = piePlot22.getLabelOutlineStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 15, stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj19", piePlot1.equals(obj19) ? piePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        piePlot1.setOutlineVisible(false);
        java.lang.Object obj11 = piePlot1.clone();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj11", piePlot1.equals(obj11) ? piePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        piePlot21.setLabelGap(0.0d);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot21.setLabelLinkPaint(paint30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator39 = null;
        piePlot33.setToolTipGenerator(pieToolTipGenerator39);
        piePlot33.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        boolean boolean48 = piePlot44.getIgnoreZeroValues();
        java.awt.Shape shape49 = piePlot44.getLegendItemShape();
        boolean boolean50 = piePlot33.equals((java.lang.Object) piePlot44);
        piePlot21.setParent((org.jfree.chart.plot.Plot) piePlot44);
        org.jfree.chart.event.PlotChangeListener plotChangeListener52 = null;
        piePlot21.removeChangeListener(plotChangeListener52);
        java.awt.Stroke stroke56 = piePlot21.lookupSectionOutlineStroke((java.lang.Comparable) 100L, false);
        piePlot1.setBaseSectionOutlineStroke(stroke56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot44", piePlot11.equals(piePlot44) ? piePlot11.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot17.getSimpleLabelOffset();
        boolean boolean22 = piePlot17.getIgnoreNullValues();
        java.awt.Image image23 = piePlot17.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        boolean boolean29 = piePlot25.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot30 = piePlot25.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        piePlot25.axisChanged(axisChangeEvent31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = piePlot25.getDrawingSupplier();
        piePlot17.setDrawingSupplier(drawingSupplier33);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot17.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator15 and pieSectionLabelGenerator35", pieSectionLabelGenerator15.equals(pieSectionLabelGenerator35) ? pieSectionLabelGenerator15.hashCode() == pieSectionLabelGenerator35.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot1.getLabelPadding();
        java.awt.Stroke stroke19 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        java.awt.Stroke stroke23 = null;
        piePlot21.setSectionOutlineStroke((java.lang.Comparable) '#', stroke23);
        java.awt.Paint paint26 = piePlot21.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke27 = piePlot21.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        piePlot21.markerChanged(markerChangeEvent28);
        piePlot21.setPieIndex((int) (short) 1);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        boolean boolean37 = piePlot33.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot38 = piePlot33.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent39 = null;
        piePlot33.axisChanged(axisChangeEvent39);
        java.lang.String str41 = piePlot33.getNoDataMessage();
        java.awt.Image image42 = null;
        piePlot33.setBackgroundImage(image42);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        piePlot45.setIgnoreNullValues(true);
        java.awt.Paint paint48 = piePlot45.getLabelPaint();
        java.awt.Image image49 = null;
        piePlot45.setBackgroundImage(image49);
        java.awt.Paint paint51 = piePlot45.getLabelShadowPaint();
        piePlot33.setLabelBackgroundPaint(paint51);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        double double55 = piePlot54.getShadowYOffset();
        java.awt.Image image56 = piePlot54.getBackgroundImage();
        piePlot54.setIgnoreZeroValues(false);
        java.awt.Paint paint59 = piePlot54.getOutlinePaint();
        piePlot33.setBackgroundPaint(paint59);
        piePlot21.setLabelPaint(paint59);
        piePlot1.setLabelShadowPaint(paint59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot45", piePlot10.equals(piePlot45) ? piePlot10.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot28.getSimpleLabelOffset();
        boolean boolean33 = piePlot28.getIgnoreNullValues();
        java.awt.Image image34 = piePlot28.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        boolean boolean40 = piePlot36.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot41 = piePlot36.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent42 = null;
        piePlot36.axisChanged(axisChangeEvent42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = piePlot36.getDrawingSupplier();
        piePlot28.setDrawingSupplier(drawingSupplier44);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot28.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot36", piePlot12.equals(piePlot36) ? piePlot12.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Image image14 = null;
        piePlot10.setBackgroundImage(image14);
        int int16 = piePlot10.getPieIndex();
        org.jfree.chart.util.Rotation rotation17 = piePlot10.getDirection();
        piePlot1.setDirection(rotation17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot10", piePlot1.equals(piePlot10) ? piePlot1.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.awt.Paint paint19 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) '4', false);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator27 = null;
        piePlot21.setToolTipGenerator(pieToolTipGenerator27);
        java.awt.Paint paint29 = piePlot21.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot21.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets30, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot21", piePlot11.equals(piePlot21) ? piePlot11.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        piePlot13.handleClick((int) (byte) 0, 100, plotRenderingInfo18);
        java.awt.Paint paint20 = piePlot13.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Paint paint26 = piePlot22.getNoDataMessagePaint();
        piePlot13.setLabelBackgroundPaint(paint26);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot13.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot22", piePlot1.equals(piePlot22) ? piePlot1.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = null;
        piePlot27.setLegendLabelURLGenerator(pieURLGenerator31);
        float float33 = piePlot27.getBackgroundAlpha();
        java.awt.Paint paint34 = piePlot27.getLabelBackgroundPaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 1, paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot27", piePlot16.equals(piePlot27) ? piePlot16.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        piePlot1.setPieIndex(1);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot22.setToolTipGenerator(pieToolTipGenerator28);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        java.awt.Paint paint36 = piePlot32.getNoDataMessagePaint();
        piePlot22.setSectionPaint((java.lang.Comparable) 0, paint36);
        java.awt.Paint paint40 = piePlot22.lookupSectionOutlinePaint((java.lang.Comparable) '4', false);
        piePlot1.setBackgroundPaint(paint40);
        piePlot1.zoom((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        piePlot45.setIgnoreNullValues(true);
        java.awt.Paint paint48 = piePlot45.getLabelPaint();
        boolean boolean49 = piePlot45.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot50 = piePlot45.getRootPlot();
        java.awt.Font font51 = piePlot45.getNoDataMessageFont();
        piePlot1.setLabelFont(font51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot32 and piePlot45", piePlot32.equals(piePlot45) ? piePlot32.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        java.awt.Image image19 = null;
        piePlot15.setBackgroundImage(image19);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = null;
        piePlot15.setToolTipGenerator(pieToolTipGenerator21);
        boolean boolean23 = piePlot15.getIgnoreNullValues();
        java.awt.Paint paint24 = piePlot15.getLabelPaint();
        double double25 = piePlot15.getLabelLinkMargin();
        java.awt.Font font26 = piePlot15.getLabelFont();
        piePlot1.setLabelFont(font26);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent33 = null;
        piePlot29.datasetChanged(datasetChangeEvent33);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot29.getLabelPadding();
        piePlot1.setInsets(rectangleInsets35, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot15 and piePlot29", piePlot15.equals(piePlot29) ? piePlot15.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot16 = piePlot11.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        piePlot11.axisChanged(axisChangeEvent17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot11.getDrawingSupplier();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot11.setOutlineStroke(stroke20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getShadowYOffset();
        java.awt.Stroke stroke26 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot28.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot28.getSimpleLabelOffset();
        piePlot23.setInsets(rectangleInsets33);
        piePlot11.setInsets(rectangleInsets33, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = null;
        piePlot11.setURLGenerator(pieURLGenerator37);
        java.awt.Paint paint39 = piePlot11.getBaseSectionOutlinePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) (byte) 10, paint39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getShadowYOffset();
        java.awt.Stroke stroke45 = piePlot42.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot42.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        java.awt.Image image53 = null;
        piePlot49.setBackgroundImage(image53);
        java.awt.Paint paint55 = piePlot49.getLabelShadowPaint();
        piePlot49.setLabelGap(0.0d);
        java.awt.Paint paint58 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot49.setLabelLinkPaint(paint58);
        piePlot42.setLabelPaint(paint58);
        float float61 = piePlot42.getBackgroundAlpha();
        piePlot42.setShadowXOffset((double) 0L);
        org.jfree.data.general.PieDataset pieDataset64 = null;
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot(pieDataset64);
        double double66 = piePlot65.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent67 = null;
        piePlot65.notifyListeners(plotChangeEvent67);
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = piePlot65.getSimpleLabelOffset();
        java.awt.Paint paint70 = piePlot65.getLabelBackgroundPaint();
        double double71 = piePlot65.getStartAngle();
        java.awt.Paint paint72 = piePlot65.getLabelOutlinePaint();
        piePlot42.setLabelBackgroundPaint(paint72);
        boolean boolean74 = piePlot42.getIgnoreNullValues();
        java.awt.Paint paint75 = piePlot42.getBaseSectionOutlinePaint();
        piePlot1.setOutlinePaint(paint75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot28 and piePlot65", piePlot28.equals(piePlot65) ? piePlot28.hashCode() == piePlot65.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        piePlot1.setNoDataMessage("");
        double double20 = piePlot1.getExplodePercent((java.lang.Comparable) 100.0d);
        boolean boolean21 = piePlot1.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        piePlot23.notifyListeners(plotChangeEvent25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot23.getSimpleLabelOffset();
        boolean boolean28 = piePlot23.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        piePlot30.setLabelPaint(paint36);
        piePlot23.setBackgroundPaint(paint36);
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
        double double54 = piePlot40.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor55 = piePlot40.getLabelDistributor();
        piePlot23.setLabelDistributor(abstractPieLabelDistributor55);
        java.awt.Font font57 = piePlot23.getNoDataMessageFont();
        piePlot1.setLabelFont(font57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot30", piePlot8.equals(piePlot30) ? piePlot8.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        double double3 = piePlot1.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        piePlot6.setIgnoreNullValues(true);
        java.awt.Paint paint9 = piePlot6.getLabelPaint();
        boolean boolean10 = piePlot6.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot11 = piePlot6.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        piePlot6.axisChanged(axisChangeEvent12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = piePlot6.getDrawingSupplier();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot6.setOutlineStroke(stroke15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getShadowYOffset();
        java.awt.Stroke stroke21 = piePlot18.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        piePlot23.notifyListeners(plotChangeEvent25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot23.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot23.getSimpleLabelOffset();
        piePlot18.setInsets(rectangleInsets28);
        piePlot6.setInsets(rectangleInsets28, false);
        piePlot1.setInsets(rectangleInsets28, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot21.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke24);
        piePlot21.setLabelGap((double) 0);
        piePlot21.setStartAngle((double) (-1.0f));
        java.awt.Paint paint30 = piePlot21.getLabelBackgroundPaint();
        piePlot1.setLabelPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator14 and pieSectionLabelGenerator22", pieSectionLabelGenerator14.equals(pieSectionLabelGenerator22) ? pieSectionLabelGenerator14.hashCode() == pieSectionLabelGenerator22.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        double double34 = piePlot1.getLabelGap();
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
        org.jfree.data.general.PieDataset pieDataset67 = null;
        org.jfree.chart.plot.PiePlot piePlot68 = new org.jfree.chart.plot.PiePlot(pieDataset67);
        piePlot68.setIgnoreNullValues(true);
        java.awt.Paint paint71 = piePlot68.getLabelPaint();
        java.awt.Image image72 = null;
        piePlot68.setBackgroundImage(image72);
        java.awt.Paint paint74 = piePlot68.getLabelShadowPaint();
        java.awt.Image image75 = piePlot68.getBackgroundImage();
        java.awt.Paint paint76 = piePlot68.getBaseSectionPaint();
        java.awt.Paint paint77 = piePlot68.getBaseSectionPaint();
        java.awt.Paint paint78 = piePlot68.getBaseSectionPaint();
        piePlot36.setLabelBackgroundPaint(paint78);
        org.jfree.chart.util.Rotation rotation80 = piePlot36.getDirection();
        piePlot1.setDirection(rotation80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot68", piePlot14.equals(piePlot68) ? piePlot14.hashCode() == piePlot68.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        piePlot1.setLabelLinkMargin((double) 0.0f);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot28 = piePlot23.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        piePlot23.axisChanged(axisChangeEvent29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = piePlot23.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        piePlot23.setDataset(pieDataset32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator36 = piePlot35.getLegendLabelGenerator();
        piePlot23.setLabelGenerator(pieSectionLabelGenerator36);
        java.awt.Paint paint39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot23.setSectionOutlinePaint((java.lang.Comparable) (-1L), paint39);
        java.awt.Stroke stroke41 = piePlot23.getLabelOutlineStroke();
        piePlot1.setLabelLinkStroke(stroke41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot35", piePlot12.equals(piePlot35) ? piePlot12.hashCode() == piePlot35.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        org.jfree.data.general.PieDataset pieDataset63 = null;
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot(pieDataset63);
        piePlot64.setIgnoreNullValues(true);
        java.awt.Paint paint67 = piePlot64.getLabelPaint();
        java.awt.Image image68 = null;
        piePlot64.setBackgroundImage(image68);
        java.awt.Paint paint70 = piePlot64.getLabelShadowPaint();
        piePlot64.setShadowXOffset(90.0d);
        piePlot64.setForegroundAlpha(10.0f);
        piePlot64.setCircular(true, false);
        double double78 = piePlot64.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset80 = null;
        org.jfree.chart.plot.PiePlot piePlot81 = new org.jfree.chart.plot.PiePlot(pieDataset80);
        piePlot81.setIgnoreNullValues(true);
        java.awt.Paint paint84 = piePlot81.getLabelPaint();
        boolean boolean85 = piePlot81.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot86 = piePlot81.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent87 = null;
        piePlot81.axisChanged(axisChangeEvent87);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier89 = piePlot81.getDrawingSupplier();
        java.awt.Stroke stroke90 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot81.setOutlineStroke(stroke90);
        piePlot64.setSectionOutlineStroke((java.lang.Comparable) (byte) 10, stroke90);
        piePlot1.setLabelOutlineStroke(stroke90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot52 and piePlot81", piePlot52.equals(piePlot81) ? piePlot52.hashCode() == piePlot81.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        piePlot1.setLabelLinkMargin((double) 0.5f);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot24.getLegendLabelGenerator();
        double double26 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        piePlot1.setBackgroundPaint(paint27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getShadowYOffset();
        java.awt.Stroke stroke33 = piePlot30.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint34 = piePlot30.getBaseSectionPaint();
        boolean boolean35 = piePlot1.equals((java.lang.Object) piePlot30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot30", piePlot24.equals(piePlot30) ? piePlot24.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        java.lang.Object obj7 = piePlot1.clone();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getShadowYOffset();
        java.awt.Stroke stroke12 = piePlot9.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot9.getLegendLabelGenerator();
        piePlot9.setInteriorGap(0.08d);
        java.awt.Stroke stroke16 = null;
        piePlot9.setOutlineStroke(stroke16);
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
        piePlot9.setBackgroundPaint(paint45);
        piePlot1.setLabelLinkPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj7", piePlot1.equals(obj7) ? piePlot1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = null;
        piePlot22.setLegendLabelURLGenerator(pieURLGenerator26);
        java.lang.Comparable comparable29 = piePlot22.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot22.drawBackgroundImage(graphics2D30, rectangle2D31);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot22.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot4 and piePlot22", piePlot4.equals(piePlot22) ? piePlot4.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot1.handleClick(0, 0, plotRenderingInfo9);
        java.awt.Font font11 = piePlot1.getLabelFont();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        piePlot13.setShadowXOffset(90.0d);
        piePlot13.setForegroundAlpha(10.0f);
        piePlot13.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot13.getSimpleLabelOffset();
        piePlot13.setBackgroundAlpha((float) (-1));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot13.notifyListeners(plotChangeEvent30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        piePlot33.notifyListeners(plotChangeEvent35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot33.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot33.getSimpleLabelOffset();
        java.awt.Paint paint39 = piePlot33.getLabelBackgroundPaint();
        float float40 = piePlot33.getBackgroundImageAlpha();
        piePlot33.setForegroundAlpha((float) (-1));
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        java.awt.Paint paint53 = piePlot44.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot33.setLabelOutlinePaint(paint53);
        piePlot13.setLabelOutlinePaint(paint53);
        piePlot1.setBaseSectionOutlinePaint(paint53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot44", piePlot1.equals(piePlot44) ? piePlot1.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot27.getSimpleLabelOffset();
        java.awt.Paint paint32 = piePlot27.getLabelBackgroundPaint();
        piePlot1.setLabelLinkPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot27", piePlot12.equals(piePlot27) ? piePlot12.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot1.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator32 = piePlot28.getToolTipGenerator();
        java.awt.Paint paint33 = piePlot28.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot28.getLegendLabelURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor35 = piePlot28.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        boolean boolean41 = piePlot37.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator42 = null;
        piePlot37.setToolTipGenerator(pieToolTipGenerator42);
        java.awt.Paint paint45 = piePlot37.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        double double48 = piePlot47.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        piePlot47.notifyListeners(plotChangeEvent49);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot47.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot47.getSimpleLabelOffset();
        boolean boolean53 = piePlot37.equals((java.lang.Object) rectangleInsets52);
        piePlot28.setLabelPadding(rectangleInsets52);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent55 = null;
        piePlot28.axisChanged(axisChangeEvent55);
        java.awt.Paint paint58 = piePlot28.lookupSectionOutlinePaint((java.lang.Comparable) 10);
        piePlot1.setBaseSectionOutlinePaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot37", piePlot16.equals(piePlot37) ? piePlot16.hashCode() == piePlot37.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        java.awt.Image image28 = piePlot21.getBackgroundImage();
        java.awt.Paint paint29 = piePlot21.getBaseSectionPaint();
        java.awt.Paint paint30 = piePlot21.getBaseSectionPaint();
        piePlot1.setShadowPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot21", piePlot10.equals(piePlot21) ? piePlot10.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        org.jfree.chart.plot.Plot plot9 = piePlot1.getParent();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = null;
        piePlot11.setToolTipGenerator(pieToolTipGenerator17);
        piePlot11.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot22.setToolTipGenerator(pieToolTipGenerator28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        piePlot22.setDataset(pieDataset30);
        java.awt.Stroke stroke34 = piePlot22.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = piePlot22.getDrawingSupplier();
        piePlot11.setDrawingSupplier(drawingSupplier35);
        piePlot1.setDrawingSupplier(drawingSupplier35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot22", piePlot1.equals(piePlot22) ? piePlot1.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.lang.Object obj8 = piePlot1.clone();
        java.awt.Paint paint9 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj8", piePlot1.equals(obj8) ? piePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getShadowYOffset();
        java.awt.Stroke stroke19 = piePlot16.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot16.setInteriorGap((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot16.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator30 = null;
        piePlot24.setToolTipGenerator(pieToolTipGenerator30);
        boolean boolean32 = piePlot24.getIgnoreNullValues();
        java.awt.Paint paint33 = piePlot24.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator36 = piePlot35.getLegendLabelGenerator();
        piePlot24.setLegendLabelGenerator(pieSectionLabelGenerator36);
        piePlot16.setLegendLabelToolTipGenerator(pieSectionLabelGenerator36);
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator12 and pieSectionLabelGenerator36", pieSectionLabelGenerator12.equals(pieSectionLabelGenerator36) ? pieSectionLabelGenerator12.hashCode() == pieSectionLabelGenerator36.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        piePlot44.notifyListeners(plotChangeEvent45);
        java.awt.Paint paint47 = piePlot44.getOutlinePaint();
        java.awt.Paint paint48 = piePlot44.getLabelPaint();
        piePlot17.setShadowPaint(paint48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot44", piePlot8.equals(piePlot44) ? piePlot8.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        boolean boolean32 = piePlot28.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot33 = piePlot28.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent34 = null;
        piePlot28.axisChanged(axisChangeEvent34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = piePlot28.getDrawingSupplier();
        java.awt.Stroke stroke37 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot28.setOutlineStroke(stroke37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = null;
        piePlot28.setURLGenerator(pieURLGenerator39);
        piePlot28.setIgnoreNullValues(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot28.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator13 and pieSectionLabelGenerator43", pieSectionLabelGenerator13.equals(pieSectionLabelGenerator43) ? pieSectionLabelGenerator13.hashCode() == pieSectionLabelGenerator43.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        piePlot1.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getShadowYOffset();
        java.awt.Image image19 = piePlot17.getBackgroundImage();
        java.awt.Stroke stroke20 = piePlot17.getLabelOutlineStroke();
        piePlot11.setLabelLinkStroke(stroke20);
        piePlot1.setBaseSectionOutlineStroke(stroke20);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        piePlot25.notifyListeners(plotChangeEvent27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot25.getSimpleLabelOffset();
        java.awt.Paint paint30 = piePlot25.getNoDataMessagePaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 10.0d, paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot17 and piePlot25", piePlot17.equals(piePlot25) ? piePlot17.hashCode() == piePlot25.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        piePlot38.setIgnoreNullValues(true);
        java.awt.Paint paint41 = piePlot38.getLabelPaint();
        java.awt.Image image42 = null;
        piePlot38.setBackgroundImage(image42);
        java.awt.Paint paint44 = piePlot38.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        piePlot38.setDataset(pieDataset45);
        double double47 = piePlot38.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        double double50 = piePlot49.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent51 = null;
        piePlot49.notifyListeners(plotChangeEvent51);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = piePlot49.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot49.getSimpleLabelOffset();
        java.awt.Paint paint55 = piePlot49.getLabelBackgroundPaint();
        piePlot38.setShadowPaint(paint55);
        piePlot1.setBaseSectionPaint(paint55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot49", piePlot24.equals(piePlot49) ? piePlot24.hashCode() == piePlot49.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot18.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot18.getSimpleLabelOffset();
        piePlot13.setInsets(rectangleInsets23);
        piePlot1.setInsets(rectangleInsets23, false);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        boolean boolean33 = piePlot29.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator34 = null;
        piePlot29.setToolTipGenerator(pieToolTipGenerator34);
        java.awt.Paint paint37 = piePlot29.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        piePlot39.notifyListeners(plotChangeEvent41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot39.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot39.getSimpleLabelOffset();
        boolean boolean45 = piePlot29.equals((java.lang.Object) rectangleInsets44);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = piePlot29.getLegendLabelURLGenerator();
        java.awt.Stroke stroke49 = piePlot29.lookupSectionOutlineStroke((java.lang.Comparable) 0.0f, false);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) (byte) 100, stroke49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot39", piePlot18.equals(piePlot39) ? piePlot18.hashCode() == piePlot39.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot1.getLabelGenerator();
        java.awt.Paint paint24 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator13 and pieSectionLabelGenerator22", pieSectionLabelGenerator13.equals(pieSectionLabelGenerator22) ? pieSectionLabelGenerator13.hashCode() == pieSectionLabelGenerator22.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot1.getInsets();
        java.awt.Paint paint52 = piePlot1.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        java.awt.Paint paint57 = piePlot54.getLabelPaint();
        boolean boolean58 = piePlot54.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot59 = piePlot54.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent60 = null;
        piePlot54.axisChanged(axisChangeEvent60);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier62 = piePlot54.getDrawingSupplier();
        java.awt.Stroke stroke63 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot54.setOutlineStroke(stroke63);
        org.jfree.data.general.PieDataset pieDataset65 = null;
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot(pieDataset65);
        double double67 = piePlot66.getShadowYOffset();
        java.awt.Stroke stroke69 = piePlot66.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset70 = null;
        org.jfree.chart.plot.PiePlot piePlot71 = new org.jfree.chart.plot.PiePlot(pieDataset70);
        double double72 = piePlot71.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent73 = null;
        piePlot71.notifyListeners(plotChangeEvent73);
        org.jfree.chart.util.RectangleInsets rectangleInsets75 = piePlot71.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets76 = piePlot71.getSimpleLabelOffset();
        piePlot66.setInsets(rectangleInsets76);
        piePlot54.setInsets(rectangleInsets76, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator80 = null;
        piePlot54.setURLGenerator(pieURLGenerator80);
        org.jfree.data.general.PieDataset pieDataset82 = null;
        org.jfree.chart.plot.PiePlot piePlot83 = new org.jfree.chart.plot.PiePlot(pieDataset82);
        piePlot83.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo88 = null;
        piePlot83.handleClick((int) (byte) 0, 100, plotRenderingInfo88);
        java.awt.Paint paint90 = piePlot83.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset91 = null;
        org.jfree.chart.plot.PiePlot piePlot92 = new org.jfree.chart.plot.PiePlot(pieDataset91);
        piePlot92.setIgnoreNullValues(true);
        java.awt.Paint paint95 = piePlot92.getLabelPaint();
        java.awt.Paint paint96 = piePlot92.getNoDataMessagePaint();
        piePlot83.setLabelBackgroundPaint(paint96);
        piePlot54.setLabelShadowPaint(paint96);
        piePlot1.setBaseSectionPaint(paint96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot92", piePlot24.equals(piePlot92) ? piePlot24.hashCode() == piePlot92.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint10 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot12.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        piePlot12.datasetChanged(datasetChangeEvent19);
        java.awt.Stroke stroke21 = piePlot12.getBaseSectionOutlineStroke();
        piePlot1.setOutlineStroke(stroke21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot12", piePlot1.equals(piePlot12) ? piePlot1.hashCode() == piePlot12.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = piePlot12.getLabelShadowPaint();
        java.awt.Paint paint21 = piePlot12.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setLabelOutlinePaint(paint21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot29 = piePlot24.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent30 = null;
        piePlot24.axisChanged(axisChangeEvent30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        piePlot24.setBaseSectionPaint(paint36);
        piePlot24.setStartAngle((double) (byte) 0);
        java.awt.Image image40 = piePlot24.getBackgroundImage();
        boolean boolean41 = piePlot24.getIgnoreNullValues();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor42 = piePlot24.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot33", piePlot12.equals(piePlot33) ? piePlot12.hashCode() == piePlot33.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        double double57 = piePlot56.getShadowYOffset();
        java.awt.Stroke stroke59 = piePlot56.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot56.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        piePlot63.setIgnoreNullValues(true);
        java.awt.Paint paint66 = piePlot63.getLabelPaint();
        java.awt.Image image67 = null;
        piePlot63.setBackgroundImage(image67);
        java.awt.Paint paint69 = piePlot63.getLabelShadowPaint();
        piePlot63.setLabelGap(0.0d);
        java.awt.Paint paint72 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot63.setLabelLinkPaint(paint72);
        piePlot56.setLabelPaint(paint72);
        float float75 = piePlot56.getBackgroundAlpha();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator76 = null;
        piePlot56.setLegendLabelURLGenerator(pieURLGenerator76);
        java.awt.Stroke stroke80 = piePlot56.lookupSectionOutlineStroke((java.lang.Comparable) 100, false);
        piePlot1.setLabelOutlineStroke(stroke80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot63", piePlot8.equals(piePlot63) ? piePlot8.hashCode() == piePlot63.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        piePlot1.setIgnoreZeroValues(true);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        java.awt.Paint paint29 = piePlot24.getLabelBackgroundPaint();
        double double30 = piePlot24.getStartAngle();
        java.awt.Paint paint31 = piePlot24.getLabelOutlinePaint();
        piePlot1.setLabelPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot24", piePlot12.equals(piePlot24) ? piePlot12.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        double double3 = piePlot1.getMaximumLabelWidth();
        java.lang.Object obj4 = piePlot1.clone();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        piePlot6.setIgnoreNullValues(true);
        java.awt.Paint paint9 = piePlot6.getLabelPaint();
        java.awt.Image image10 = null;
        piePlot6.setBackgroundImage(image10);
        java.awt.Paint paint12 = piePlot6.getLabelShadowPaint();
        piePlot6.setShadowXOffset(90.0d);
        piePlot6.setForegroundAlpha(10.0f);
        piePlot6.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot6.getSimpleLabelOffset();
        piePlot6.setBackgroundAlpha((float) (-1));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        piePlot6.notifyListeners(plotChangeEvent23);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        piePlot26.notifyListeners(plotChangeEvent28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot26.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot26.getSimpleLabelOffset();
        java.awt.Paint paint32 = piePlot26.getLabelBackgroundPaint();
        float float33 = piePlot26.getBackgroundImageAlpha();
        piePlot26.setForegroundAlpha((float) (-1));
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot37.getLabelShadowPaint();
        java.awt.Paint paint46 = piePlot37.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot26.setLabelOutlinePaint(paint46);
        piePlot6.setLabelOutlinePaint(paint46);
        piePlot1.setShadowPaint(paint46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj4", piePlot1.equals(obj4) ? piePlot1.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        java.awt.Paint paint8 = piePlot1.getLabelShadowPaint();
        double double9 = piePlot1.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        java.awt.Paint paint17 = piePlot11.getLabelShadowPaint();
        piePlot11.setLabelGap(0.0d);
        java.awt.Image image20 = piePlot11.getBackgroundImage();
        float float21 = piePlot11.getBackgroundImageAlpha();
        double double23 = piePlot11.getExplodePercent((java.lang.Comparable) 90.0d);
        java.awt.Paint paint24 = piePlot11.getLabelOutlinePaint();
        java.awt.Paint paint26 = piePlot11.getSectionOutlinePaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        boolean boolean33 = piePlot29.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot34 = piePlot29.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent35 = null;
        piePlot29.axisChanged(axisChangeEvent35);
        java.lang.String str37 = piePlot29.getNoDataMessage();
        java.awt.Image image38 = null;
        piePlot29.setBackgroundImage(image38);
        boolean boolean40 = piePlot29.isSubplot();
        java.awt.Paint paint43 = piePlot29.lookupSectionOutlinePaint((java.lang.Comparable) (-1L), false);
        piePlot11.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint43);
        piePlot1.setLabelBackgroundPaint(paint43);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        piePlot47.setIgnoreNullValues(true);
        java.awt.Paint paint50 = piePlot47.getLabelPaint();
        java.awt.Image image51 = null;
        piePlot47.setBackgroundImage(image51);
        java.awt.Paint paint53 = piePlot47.getLabelShadowPaint();
        piePlot47.setShadowXOffset(90.0d);
        piePlot47.setForegroundAlpha(10.0f);
        piePlot47.setCircular(true, false);
        double double61 = piePlot47.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor62 = piePlot47.getLabelDistributor();
        java.awt.Paint paint63 = piePlot47.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot64 = piePlot47.getParent();
        org.jfree.data.general.PieDataset pieDataset65 = null;
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot(pieDataset65);
        double double67 = piePlot66.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset68 = null;
        org.jfree.chart.plot.PiePlot piePlot69 = new org.jfree.chart.plot.PiePlot(pieDataset68);
        piePlot69.setIgnoreNullValues(true);
        java.awt.Paint paint72 = piePlot69.getLabelPaint();
        piePlot66.setLabelPaint(paint72);
        boolean boolean74 = piePlot66.getIgnoreZeroValues();
        java.awt.Stroke stroke75 = piePlot66.getOutlineStroke();
        piePlot47.setLabelLinkStroke(stroke75);
        piePlot1.setLabelLinkStroke(stroke75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot29 and piePlot69", piePlot29.equals(piePlot69) ? piePlot29.hashCode() == piePlot69.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = null;
        piePlot27.setLegendLabelURLGenerator(pieURLGenerator31);
        java.lang.Comparable comparable34 = piePlot27.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        piePlot27.drawBackgroundImage(graphics2D35, rectangle2D36);
        java.awt.Shape shape38 = piePlot27.getLegendItemShape();
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
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        java.awt.Image image56 = null;
        piePlot52.setBackgroundImage(image56);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator58 = null;
        piePlot52.setToolTipGenerator(pieToolTipGenerator58);
        piePlot52.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        piePlot63.setIgnoreNullValues(true);
        java.awt.Paint paint66 = piePlot63.getLabelPaint();
        boolean boolean67 = piePlot63.getIgnoreZeroValues();
        java.awt.Shape shape68 = piePlot63.getLegendItemShape();
        boolean boolean69 = piePlot52.equals((java.lang.Object) piePlot63);
        piePlot40.setParent((org.jfree.chart.plot.Plot) piePlot63);
        java.awt.Paint paint72 = piePlot40.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        piePlot27.setLabelPaint(paint72);
        piePlot16.setOutlinePaint(paint72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot63", piePlot16.equals(piePlot63) ? piePlot16.hashCode() == piePlot63.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        java.awt.Stroke stroke24 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot26.handleClick((int) (byte) 0, 100, plotRenderingInfo31);
        java.awt.Paint paint33 = piePlot26.getBaseSectionPaint();
        java.awt.Image image34 = null;
        piePlot26.setBackgroundImage(image34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot26.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot26", piePlot1.equals(piePlot26) ? piePlot1.hashCode() == piePlot26.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        double double15 = piePlot14.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot14.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot14.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot14.getSimpleLabelOffset();
        java.awt.Paint paint20 = piePlot14.getLabelBackgroundPaint();
        java.awt.Paint paint21 = piePlot14.getLabelShadowPaint();
        piePlot1.setLabelBackgroundPaint(paint21);
        java.awt.Stroke stroke23 = piePlot1.getLabelLinkStroke();
        java.awt.Paint paint25 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) (-1.0d));
        java.awt.Paint paint28 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.0f, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot1.handleClick((int) (short) 1, (int) (short) 1, plotRenderingInfo31);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        java.awt.Image image38 = null;
        piePlot34.setBackgroundImage(image38);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator40 = null;
        piePlot34.setToolTipGenerator(pieToolTipGenerator40);
        boolean boolean42 = piePlot34.getIgnoreNullValues();
        java.awt.Paint paint43 = piePlot34.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot45.getLegendLabelGenerator();
        piePlot34.setLegendLabelGenerator(pieSectionLabelGenerator46);
        boolean boolean48 = piePlot34.isCircular();
        piePlot34.setBackgroundImageAlignment((int) (short) 1);
        piePlot34.setShadowYOffset(0.14d);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        piePlot54.handleClick((int) (byte) 0, 100, plotRenderingInfo59);
        java.awt.Paint paint61 = piePlot54.getBaseSectionPaint();
        java.awt.Paint paint63 = piePlot54.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot34.setLabelBackgroundPaint(paint63);
        piePlot1.setLabelOutlinePaint(paint63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot45", piePlot14.equals(piePlot45) ? piePlot14.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        piePlot23.handleClick((int) (byte) 0, 100, plotRenderingInfo28);
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
        piePlot23.setLabelPadding(rectangleInsets41);
        piePlot23.zoom((double) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = piePlot23.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot36", piePlot7.equals(piePlot36) ? piePlot7.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot45.getSimpleLabelOffset();
        piePlot24.setLabelPadding(rectangleInsets47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot33 and piePlot45", piePlot33.equals(piePlot45) ? piePlot33.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        piePlot8.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot8.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot8.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        double double17 = piePlot16.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot16.notifyListeners(plotChangeEvent18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot16.getSimpleLabelOffset();
        boolean boolean21 = piePlot16.getIgnoreNullValues();
        piePlot16.setForegroundAlpha((float) 1);
        double double24 = piePlot16.getStartAngle();
        boolean boolean25 = piePlot16.isOutlineVisible();
        java.awt.Stroke stroke26 = piePlot16.getLabelOutlineStroke();
        java.awt.Paint paint27 = piePlot16.getBaseSectionPaint();
        piePlot8.setShadowPaint(paint27);
        piePlot1.setBaseSectionPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot16", piePlot1.equals(piePlot16) ? piePlot1.hashCode() == piePlot16.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        java.awt.Image image19 = piePlot1.getBackgroundImage();
        java.lang.Object obj20 = piePlot1.clone();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj20", piePlot1.equals(obj20) ? piePlot1.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        boolean boolean13 = piePlot9.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot14 = piePlot9.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        piePlot9.axisChanged(axisChangeEvent15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = piePlot9.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier17);
        java.awt.Font font19 = piePlot1.getLabelFont();
        org.jfree.data.general.PieDataset pieDataset20 = piePlot1.getDataset();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot21.notifyListeners(plotChangeEvent22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot21.getLabelPadding();
        java.awt.Shape shape25 = piePlot21.getLegendItemShape();
        piePlot1.setLegendItemShape(shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot21", piePlot1.equals(piePlot21) ? piePlot1.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        piePlot23.setNoDataMessage("hi!");
        java.awt.Stroke stroke29 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.0d, stroke29);
        piePlot1.setCircular(true);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot34.getLegendLabelGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = piePlot34.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier36", drawingSupplier9.equals(drawingSupplier36) ? drawingSupplier9.hashCode() == drawingSupplier36.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getLabelLinkMargin();
        piePlot1.setStartAngle((double) 0L);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot8.setLegendLabelURLGenerator(pieURLGenerator12);
        java.lang.Comparable comparable15 = piePlot8.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot8.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot8.getLabelDistributor();
        java.awt.Paint paint21 = piePlot8.getSectionPaint((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        piePlot23.handleClick((int) (byte) 0, 100, plotRenderingInfo28);
        java.awt.Paint paint30 = piePlot23.getBaseSectionPaint();
        java.awt.Image image31 = null;
        piePlot23.setBackgroundImage(image31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot23.getLabelPadding();
        piePlot8.setInsets(rectangleInsets33, false);
        org.jfree.chart.LegendItemCollection legendItemCollection36 = piePlot8.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent37 = null;
        piePlot8.axisChanged(axisChangeEvent37);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot8.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Image image45 = null;
        piePlot41.setBackgroundImage(image45);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator47 = null;
        piePlot41.setToolTipGenerator(pieToolTipGenerator47);
        boolean boolean49 = piePlot41.getIgnoreNullValues();
        java.awt.Stroke stroke50 = piePlot41.getLabelOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent51 = null;
        piePlot41.axisChanged(axisChangeEvent51);
        piePlot41.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator57 = piePlot56.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = piePlot56.getInsets();
        double double59 = piePlot56.getInteriorGap();
        org.jfree.chart.util.Rotation rotation60 = piePlot56.getDirection();
        piePlot41.setDirection(rotation60);
        piePlot8.setDirection(rotation60);
        piePlot1.setDirection(rotation60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator2 and pieSectionLabelGenerator57", pieSectionLabelGenerator2.equals(pieSectionLabelGenerator57) ? pieSectionLabelGenerator2.hashCode() == pieSectionLabelGenerator57.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        piePlot1.setForegroundAlpha((float) (-1L));
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        piePlot27.setShadowXOffset(90.0d);
        piePlot27.setForegroundAlpha(10.0f);
        piePlot27.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        java.awt.Image image46 = null;
        piePlot42.setBackgroundImage(image46);
        java.awt.Paint paint48 = piePlot42.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset49 = null;
        piePlot42.setDataset(pieDataset49);
        piePlot27.setParent((org.jfree.chart.plot.Plot) piePlot42);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot42.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot42", piePlot10.equals(piePlot42) ? piePlot10.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        piePlot33.setPieIndex(1);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        java.awt.Paint paint57 = piePlot54.getLabelPaint();
        java.awt.Image image58 = null;
        piePlot54.setBackgroundImage(image58);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator60 = null;
        piePlot54.setToolTipGenerator(pieToolTipGenerator60);
        org.jfree.data.general.PieDataset pieDataset63 = null;
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot(pieDataset63);
        piePlot64.setIgnoreNullValues(true);
        java.awt.Paint paint67 = piePlot64.getLabelPaint();
        java.awt.Paint paint68 = piePlot64.getNoDataMessagePaint();
        piePlot54.setSectionPaint((java.lang.Comparable) 0, paint68);
        java.awt.Paint paint72 = piePlot54.lookupSectionOutlinePaint((java.lang.Comparable) '4', false);
        piePlot33.setBackgroundPaint(paint72);
        piePlot1.setLabelBackgroundPaint(paint72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot19 and piePlot38", piePlot19.equals(piePlot38) ? piePlot19.hashCode() == piePlot38.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setStartAngle((double) 10);
        float float8 = piePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint9 = null;
        piePlot1.setBackgroundPaint(paint9);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot12.setToolTipGenerator(pieToolTipGenerator18);
        boolean boolean20 = piePlot12.getIgnoreNullValues();
        java.awt.Paint paint21 = piePlot12.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot23.getLegendLabelGenerator();
        piePlot12.setLegendLabelGenerator(pieSectionLabelGenerator24);
        boolean boolean26 = piePlot12.isCircular();
        piePlot12.setBackgroundImageAlignment((int) (short) 1);
        piePlot12.setShadowYOffset((double) (byte) -1);
        double double31 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot12.getLabelPadding();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator33 = piePlot12.getLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator5 and pieSectionLabelGenerator24", pieSectionLabelGenerator5.equals(pieSectionLabelGenerator24) ? pieSectionLabelGenerator5.hashCode() == pieSectionLabelGenerator24.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot1.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator39 = null;
        piePlot33.setToolTipGenerator(pieToolTipGenerator39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        piePlot33.setDataset(pieDataset41);
        boolean boolean43 = piePlot33.getLabelLinksVisible();
        java.awt.Paint paint45 = piePlot33.lookupSectionOutlinePaint((java.lang.Comparable) 0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        piePlot33.handleClick((int) (byte) 100, (int) (short) 0, plotRenderingInfo48);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator50 = piePlot33.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        piePlot53.setIgnoreNullValues(true);
        java.awt.Paint paint56 = piePlot53.getLabelPaint();
        boolean boolean57 = piePlot53.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot58 = piePlot53.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent59 = null;
        piePlot53.axisChanged(axisChangeEvent59);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier61 = piePlot53.getDrawingSupplier();
        java.awt.Stroke stroke62 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot53.setOutlineStroke(stroke62);
        org.jfree.data.general.PieDataset pieDataset64 = null;
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot(pieDataset64);
        double double66 = piePlot65.getShadowYOffset();
        java.awt.Stroke stroke68 = piePlot65.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset69 = null;
        org.jfree.chart.plot.PiePlot piePlot70 = new org.jfree.chart.plot.PiePlot(pieDataset69);
        double double71 = piePlot70.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent72 = null;
        piePlot70.notifyListeners(plotChangeEvent72);
        org.jfree.chart.util.RectangleInsets rectangleInsets74 = piePlot70.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets75 = piePlot70.getSimpleLabelOffset();
        piePlot65.setInsets(rectangleInsets75);
        piePlot53.setInsets(rectangleInsets75, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator79 = null;
        piePlot53.setURLGenerator(pieURLGenerator79);
        double double81 = piePlot53.getInteriorGap();
        java.awt.Paint paint82 = piePlot53.getLabelPaint();
        piePlot33.setSectionOutlinePaint((java.lang.Comparable) "", paint82);
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) (byte) -1, paint82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot70", piePlot12.equals(piePlot70) ? piePlot12.hashCode() == piePlot70.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        java.awt.Stroke stroke14 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Image image22 = piePlot16.getBackgroundImage();
        java.awt.Font font23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot16.setLabelFont(font23);
        piePlot1.setLabelFont(font23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot16", piePlot1.equals(piePlot16) ? piePlot1.hashCode() == piePlot16.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        piePlot23.setNoDataMessage("hi!");
        java.awt.Stroke stroke29 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.0d, stroke29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        piePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot32.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot32.getSimpleLabelOffset();
        java.awt.Paint paint39 = piePlot32.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        piePlot32.setCircular(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = piePlot32.getLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator14 and pieSectionLabelGenerator42", pieSectionLabelGenerator14.equals(pieSectionLabelGenerator42) ? pieSectionLabelGenerator14.hashCode() == pieSectionLabelGenerator42.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        double double18 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot25 = piePlot20.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        piePlot20.axisChanged(axisChangeEvent26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = piePlot20.getDrawingSupplier();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot20.setOutlineStroke(stroke29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = null;
        piePlot20.setURLGenerator(pieURLGenerator31);
        piePlot20.setIgnoreNullValues(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot20.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot20", piePlot1.equals(piePlot20) ? piePlot1.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot1.getLabelGenerator();
        double double25 = piePlot1.getExplodePercent((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator20 and pieSectionLabelGenerator23", pieSectionLabelGenerator20.equals(pieSectionLabelGenerator23) ? pieSectionLabelGenerator20.hashCode() == pieSectionLabelGenerator23.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        piePlot17.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        double double22 = piePlot21.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        piePlot21.notifyListeners(plotChangeEvent23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot21.getSimpleLabelOffset();
        boolean boolean26 = piePlot21.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        piePlot31.setIgnoreNullValues(true);
        java.awt.Paint paint34 = piePlot31.getLabelPaint();
        piePlot28.setLabelPaint(paint34);
        piePlot21.setBackgroundPaint(paint34);
        piePlot17.setLabelPaint(paint34);
        piePlot17.setLabelLinkMargin((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Image image45 = null;
        piePlot41.setBackgroundImage(image45);
        java.awt.Paint paint47 = piePlot41.getLabelShadowPaint();
        piePlot41.setShadowXOffset(90.0d);
        piePlot41.setForegroundAlpha(10.0f);
        piePlot41.setCircular(true, false);
        double double55 = piePlot41.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot41.setSimpleLabelOffset(rectangleInsets56);
        piePlot17.setSimpleLabelOffset(rectangleInsets56);
        piePlot1.setInsets(rectangleInsets56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot31", piePlot10.equals(piePlot31) ? piePlot10.hashCode() == piePlot31.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        piePlot0.setShadowXOffset(0.0d);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot24.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot24.getInsets();
        double double27 = piePlot24.getInteriorGap();
        org.jfree.chart.util.Rotation rotation28 = piePlot24.getDirection();
        piePlot0.setDirection(rotation28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot24", piePlot11.equals(piePlot24) ? piePlot11.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getInteriorGap();
        org.jfree.chart.util.Rotation rotation5 = piePlot1.getDirection();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot1.addChangeListener(plotChangeListener6);
        double double8 = piePlot1.getStartAngle();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot1.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        java.awt.Paint paint17 = piePlot11.getLabelShadowPaint();
        piePlot11.setShadowXOffset(90.0d);
        piePlot11.setForegroundAlpha(10.0f);
        piePlot11.setCircular(true, false);
        java.awt.Paint paint25 = piePlot11.getLabelPaint();
        java.awt.Font font26 = piePlot11.getNoDataMessageFont();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getShadowYOffset();
        java.awt.Stroke stroke31 = piePlot28.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot28.getLegendLabelGenerator();
        piePlot28.setInteriorGap(0.08d);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot28.getLabelPadding();
        piePlot11.setLabelPadding(rectangleInsets35);
        piePlot1.setSimpleLabelOffset(rectangleInsets35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator2 and pieSectionLabelGenerator32", pieSectionLabelGenerator2.equals(pieSectionLabelGenerator32) ? pieSectionLabelGenerator2.hashCode() == pieSectionLabelGenerator32.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        piePlot1.markerChanged(markerChangeEvent22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot25.getLegendLabelGenerator();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot25.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke28);
        piePlot1.setBaseSectionOutlineStroke(stroke28);
        java.awt.Paint paint32 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "");
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        java.awt.Image image38 = null;
        piePlot34.setBackgroundImage(image38);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator40 = null;
        piePlot34.setToolTipGenerator(pieToolTipGenerator40);
        org.jfree.data.general.PieDataset pieDataset42 = null;
        piePlot34.setDataset(pieDataset42);
        boolean boolean44 = piePlot34.getLabelLinksVisible();
        java.awt.Paint paint46 = piePlot34.lookupSectionOutlinePaint((java.lang.Comparable) 0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        piePlot34.handleClick((int) (byte) 100, (int) (short) 0, plotRenderingInfo49);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator51 = piePlot34.getLabelGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor52 = piePlot34.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator26 and pieSectionLabelGenerator51", pieSectionLabelGenerator26.equals(pieSectionLabelGenerator51) ? pieSectionLabelGenerator26.hashCode() == pieSectionLabelGenerator51.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        java.awt.Font font32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot27.setNoDataMessageFont(font32);
        java.awt.Font font34 = piePlot27.getLabelFont();
        piePlot16.setNoDataMessageFont(font34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot37.getLabelShadowPaint();
        piePlot37.setLabelGap(0.0d);
        java.awt.Paint paint46 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot37.setLabelLinkPaint(paint46);
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        java.awt.Image image53 = null;
        piePlot49.setBackgroundImage(image53);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator55 = null;
        piePlot49.setToolTipGenerator(pieToolTipGenerator55);
        piePlot49.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        piePlot60.setIgnoreNullValues(true);
        java.awt.Paint paint63 = piePlot60.getLabelPaint();
        boolean boolean64 = piePlot60.getIgnoreZeroValues();
        java.awt.Shape shape65 = piePlot60.getLegendItemShape();
        boolean boolean66 = piePlot49.equals((java.lang.Object) piePlot60);
        piePlot37.setParent((org.jfree.chart.plot.Plot) piePlot60);
        org.jfree.chart.event.PlotChangeListener plotChangeListener68 = null;
        piePlot37.removeChangeListener(plotChangeListener68);
        org.jfree.data.general.PieDataset pieDataset70 = null;
        org.jfree.chart.plot.PiePlot piePlot71 = new org.jfree.chart.plot.PiePlot(pieDataset70);
        piePlot71.setIgnoreNullValues(true);
        java.awt.Paint paint74 = piePlot71.getLabelPaint();
        java.awt.Image image75 = null;
        piePlot71.setBackgroundImage(image75);
        java.awt.Paint paint77 = piePlot71.getLabelShadowPaint();
        piePlot71.setShadowXOffset(90.0d);
        piePlot71.setForegroundAlpha(10.0f);
        piePlot71.setCircular(true, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets85 = piePlot71.getLabelPadding();
        piePlot37.setInsets(rectangleInsets85);
        org.jfree.chart.util.RectangleInsets rectangleInsets87 = piePlot37.getInsets();
        piePlot16.setInsets(rectangleInsets87, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot71", piePlot1.equals(piePlot71) ? piePlot1.hashCode() == piePlot71.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        piePlot12.setLabelPaint(paint18);
        boolean boolean20 = piePlot12.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot22.setToolTipGenerator(pieToolTipGenerator28);
        boolean boolean30 = piePlot22.getIgnoreNullValues();
        java.awt.Paint paint31 = piePlot22.getLabelPaint();
        double double32 = piePlot22.getLabelLinkMargin();
        boolean boolean33 = piePlot22.isCircular();
        boolean boolean34 = piePlot22.getIgnoreZeroValues();
        piePlot22.setMaximumLabelWidth((double) 0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot22.getInsets();
        piePlot12.setInsets(rectangleInsets37);
        piePlot1.setInsets(rectangleInsets37, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot15", piePlot1.equals(piePlot15) ? piePlot1.hashCode() == piePlot15.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        piePlot1.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getLabelPadding();
        boolean boolean7 = piePlot1.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        java.awt.Image image13 = null;
        piePlot9.setBackgroundImage(image13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot9.setToolTipGenerator(pieToolTipGenerator15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot9.setDataset(pieDataset17);
        java.awt.Stroke stroke21 = piePlot9.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = piePlot9.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot24.getSimpleLabelOffset();
        java.awt.Paint paint30 = piePlot24.getLabelBackgroundPaint();
        piePlot9.setShadowPaint(paint30);
        piePlot1.setBackgroundPaint(paint30);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getShadowYOffset();
        java.awt.Image image36 = piePlot34.getBackgroundImage();
        piePlot34.setIgnoreZeroValues(false);
        float float39 = piePlot34.getForegroundAlpha();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = null;
        piePlot34.setLegendLabelURLGenerator(pieURLGenerator40);
        java.awt.Font font42 = piePlot34.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot34", piePlot24.equals(piePlot34) ? piePlot24.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot18.notifyListeners(plotChangeEvent19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot18.getLabelPadding();
        java.awt.Shape shape22 = piePlot18.getLegendItemShape();
        piePlot1.setLegendItemShape(shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot18", piePlot11.equals(piePlot18) ? piePlot11.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        boolean boolean8 = piePlot1.isSubplot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot1.axisChanged(axisChangeEvent9);
        boolean boolean11 = piePlot1.getSectionOutlinesVisible();
        java.awt.Paint paint12 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot14.getLegendLabelGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = piePlot14.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        java.awt.Paint paint24 = piePlot18.getLabelShadowPaint();
        piePlot18.setLabelGap(0.0d);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot18.setLabelLinkPaint(paint27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        java.awt.Paint paint33 = piePlot30.getLabelPaint();
        java.awt.Image image34 = null;
        piePlot30.setBackgroundImage(image34);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = null;
        piePlot30.setToolTipGenerator(pieToolTipGenerator36);
        piePlot30.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        boolean boolean45 = piePlot41.getIgnoreZeroValues();
        java.awt.Shape shape46 = piePlot41.getLegendItemShape();
        boolean boolean47 = piePlot30.equals((java.lang.Object) piePlot41);
        piePlot18.setParent((org.jfree.chart.plot.Plot) piePlot41);
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        piePlot18.removeChangeListener(plotChangeListener49);
        java.awt.Stroke stroke53 = piePlot18.lookupSectionOutlineStroke((java.lang.Comparable) 100L, false);
        piePlot14.setBaseSectionOutlineStroke(stroke53);
        piePlot1.setLabelLinkStroke(stroke53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot41", piePlot1.equals(piePlot41) ? piePlot1.hashCode() == piePlot41.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        double double23 = piePlot22.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        piePlot22.notifyListeners(plotChangeEvent24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot22.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot22.getSimpleLabelOffset();
        java.awt.Paint paint28 = piePlot22.getLabelBackgroundPaint();
        java.awt.Paint paint29 = piePlot22.getLabelShadowPaint();
        piePlot1.setOutlinePaint(paint29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        java.awt.Stroke stroke34 = null;
        piePlot32.setSectionOutlineStroke((java.lang.Comparable) '#', stroke34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        piePlot37.notifyListeners(plotChangeEvent39);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator41 = piePlot37.getToolTipGenerator();
        java.awt.Paint paint42 = piePlot37.getNoDataMessagePaint();
        piePlot37.setLabelGap(0.0d);
        java.awt.Paint paint47 = piePlot37.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot32.setLabelPaint(paint47);
        java.awt.Paint paint49 = piePlot32.getLabelLinkPaint();
        piePlot32.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        piePlot53.setIgnoreNullValues(true);
        java.awt.Paint paint56 = piePlot53.getLabelPaint();
        java.awt.Image image57 = null;
        piePlot53.setBackgroundImage(image57);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator59 = null;
        piePlot53.setToolTipGenerator(pieToolTipGenerator59);
        boolean boolean61 = piePlot53.getIgnoreNullValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = piePlot53.getSimpleLabelOffset();
        piePlot32.setLabelPadding(rectangleInsets62);
        piePlot1.setInsets(rectangleInsets62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot37", piePlot6.equals(piePlot37) ? piePlot6.hashCode() == piePlot37.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        java.awt.Image image8 = null;
        piePlot4.setBackgroundImage(image8);
        java.awt.Paint paint10 = piePlot4.getLabelShadowPaint();
        piePlot4.setShadowXOffset(90.0d);
        piePlot4.setForegroundAlpha(10.0f);
        piePlot4.setCircular(true, false);
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot19.getLabelGenerator();
        piePlot4.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        piePlot4.markerChanged(markerChangeEvent34);
        piePlot4.setShadowXOffset(1.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot4.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot19", piePlot1.equals(piePlot19) ? piePlot1.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        boolean boolean8 = piePlot1.isSubplot();
        org.jfree.chart.util.Rotation rotation9 = piePlot1.getDirection();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot16 = piePlot11.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot11.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot11.notifyListeners(plotChangeEvent18);
        java.awt.Paint paint20 = piePlot11.getLabelPaint();
        piePlot1.setLabelLinkPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot11", piePlot1.equals(piePlot11) ? piePlot1.hashCode() == piePlot11.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot28 = piePlot23.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        piePlot23.axisChanged(axisChangeEvent29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = piePlot23.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        piePlot23.removeChangeListener(plotChangeListener32);
        java.awt.Paint paint34 = piePlot23.getLabelBackgroundPaint();
        piePlot1.setLabelOutlinePaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot23", piePlot16.equals(piePlot23) ? piePlot16.hashCode() == piePlot23.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        java.awt.Paint paint28 = piePlot22.getLabelShadowPaint();
        java.awt.Paint paint31 = piePlot22.lookupSectionPaint((java.lang.Comparable) "", false);
        java.awt.Paint paint32 = piePlot22.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator33 = piePlot22.getLegendLabelGenerator();
        piePlot22.setIgnoreZeroValues(true);
        int int36 = piePlot22.getPieIndex();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = piePlot22.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier37", drawingSupplier9.equals(drawingSupplier37) ? drawingSupplier9.hashCode() == drawingSupplier37.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        piePlot13.setShadowXOffset(90.0d);
        piePlot13.setForegroundAlpha(10.0f);
        piePlot13.setCircular(true, false);
        double double27 = piePlot13.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot13.setSimpleLabelOffset(rectangleInsets28);
        piePlot13.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        java.awt.Stroke stroke36 = null;
        piePlot34.setSectionOutlineStroke((java.lang.Comparable) '#', stroke36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        piePlot39.notifyListeners(plotChangeEvent41);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator43 = piePlot39.getToolTipGenerator();
        java.awt.Paint paint44 = piePlot39.getNoDataMessagePaint();
        piePlot39.setLabelGap(0.0d);
        java.awt.Paint paint49 = piePlot39.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot34.setLabelPaint(paint49);
        java.awt.Paint paint51 = piePlot34.getLabelLinkPaint();
        piePlot34.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        piePlot55.setIgnoreNullValues(true);
        java.awt.Paint paint58 = piePlot55.getLabelPaint();
        java.awt.Image image59 = null;
        piePlot55.setBackgroundImage(image59);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator61 = null;
        piePlot55.setToolTipGenerator(pieToolTipGenerator61);
        boolean boolean63 = piePlot55.getIgnoreZeroValues();
        java.awt.Paint paint64 = piePlot55.getShadowPaint();
        piePlot34.setLabelPaint(paint64);
        piePlot13.setLabelShadowPaint(paint64);
        java.awt.Paint paint69 = piePlot13.lookupSectionPaint((java.lang.Comparable) '4', false);
        org.jfree.data.general.PieDataset pieDataset70 = null;
        org.jfree.chart.plot.PiePlot piePlot71 = new org.jfree.chart.plot.PiePlot(pieDataset70);
        double double72 = piePlot71.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent73 = null;
        piePlot71.notifyListeners(plotChangeEvent73);
        org.jfree.chart.util.RectangleInsets rectangleInsets75 = piePlot71.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets76 = piePlot71.getSimpleLabelOffset();
        java.awt.Paint paint77 = piePlot71.getLabelBackgroundPaint();
        float float78 = piePlot71.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets79 = piePlot71.getInsets();
        piePlot13.setSimpleLabelOffset(rectangleInsets79);
        piePlot1.setInsets(rectangleInsets79, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot55", piePlot1.equals(piePlot55) ? piePlot1.hashCode() == piePlot55.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        piePlot29.notifyListeners(plotChangeEvent31);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator33 = piePlot29.getToolTipGenerator();
        java.awt.Paint paint34 = piePlot29.getNoDataMessagePaint();
        piePlot23.setLabelPaint(paint34);
        java.awt.Paint paint37 = piePlot23.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint38 = piePlot23.getLabelPaint();
        java.awt.Paint paint41 = piePlot23.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        piePlot23.setSectionOutlinesVisible(false);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getShadowYOffset();
        java.awt.Image image47 = piePlot45.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot45.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        piePlot45.drawBackgroundImage(graphics2D49, rectangle2D50);
        java.awt.Image image52 = null;
        piePlot45.setBackgroundImage(image52);
        java.awt.Stroke stroke56 = piePlot45.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float57 = piePlot45.getForegroundAlpha();
        java.awt.Paint paint58 = piePlot45.getLabelPaint();
        double double59 = piePlot45.getLabelLinkMargin();
        piePlot45.setNoDataMessage("");
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        piePlot63.setIgnoreNullValues(true);
        java.awt.Paint paint66 = piePlot63.getLabelPaint();
        java.awt.Image image67 = null;
        piePlot63.setBackgroundImage(image67);
        java.awt.Paint paint69 = piePlot63.getLabelShadowPaint();
        piePlot63.setLabelGap(0.0d);
        java.awt.Paint paint72 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot63.setLabelLinkPaint(paint72);
        org.jfree.data.general.PieDataset pieDataset74 = null;
        org.jfree.chart.plot.PiePlot piePlot75 = new org.jfree.chart.plot.PiePlot(pieDataset74);
        piePlot75.setIgnoreNullValues(true);
        java.awt.Paint paint78 = piePlot75.getLabelPaint();
        java.awt.Image image79 = null;
        piePlot75.setBackgroundImage(image79);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator81 = null;
        piePlot75.setToolTipGenerator(pieToolTipGenerator81);
        piePlot75.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset85 = null;
        org.jfree.chart.plot.PiePlot piePlot86 = new org.jfree.chart.plot.PiePlot(pieDataset85);
        piePlot86.setIgnoreNullValues(true);
        java.awt.Paint paint89 = piePlot86.getLabelPaint();
        boolean boolean90 = piePlot86.getIgnoreZeroValues();
        java.awt.Shape shape91 = piePlot86.getLegendItemShape();
        boolean boolean92 = piePlot75.equals((java.lang.Object) piePlot86);
        piePlot63.setParent((org.jfree.chart.plot.Plot) piePlot86);
        java.awt.Paint paint94 = piePlot86.getShadowPaint();
        piePlot45.setBackgroundPaint(paint94);
        piePlot23.setOutlinePaint(paint94);
        piePlot0.setLabelBackgroundPaint(paint94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot29", piePlot11.equals(piePlot29) ? piePlot11.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        java.awt.Font font24 = piePlot1.getLabelFont();
        piePlot1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        boolean boolean32 = piePlot28.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot33 = piePlot28.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent34 = null;
        piePlot28.axisChanged(axisChangeEvent34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = piePlot28.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        piePlot28.setDataset(pieDataset37);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator41 = piePlot40.getLegendLabelGenerator();
        piePlot28.setLabelGenerator(pieSectionLabelGenerator41);
        double double43 = piePlot28.getLabelGap();
        piePlot28.setStartAngle((double) (byte) 0);
        java.awt.Stroke stroke46 = piePlot28.getBaseSectionOutlineStroke();
        piePlot1.setLabelOutlineStroke(stroke46);
        double double48 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        double double51 = piePlot50.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        piePlot50.notifyListeners(plotChangeEvent52);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot50.getSimpleLabelOffset();
        boolean boolean55 = piePlot50.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        piePlot60.setIgnoreNullValues(true);
        java.awt.Paint paint63 = piePlot60.getLabelPaint();
        piePlot57.setLabelPaint(paint63);
        piePlot50.setBackgroundPaint(paint63);
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        piePlot67.setIgnoreNullValues(true);
        java.awt.Paint paint70 = piePlot67.getLabelPaint();
        java.awt.Image image71 = null;
        piePlot67.setBackgroundImage(image71);
        java.awt.Paint paint73 = piePlot67.getLabelShadowPaint();
        piePlot67.setShadowXOffset(90.0d);
        piePlot67.setForegroundAlpha(10.0f);
        piePlot67.setCircular(true, false);
        double double81 = piePlot67.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor82 = piePlot67.getLabelDistributor();
        piePlot50.setLabelDistributor(abstractPieLabelDistributor82);
        java.awt.Paint paint84 = piePlot50.getNoDataMessagePaint();
        piePlot1.setShadowPaint(paint84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot40 and piePlot57", piePlot40.equals(piePlot57) ? piePlot40.hashCode() == piePlot57.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot1.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = null;
        piePlot11.setToolTipGenerator(pieToolTipGenerator17);
        boolean boolean19 = piePlot11.getIgnoreNullValues();
        java.awt.Paint paint20 = piePlot11.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot22.getLegendLabelGenerator();
        piePlot11.setLegendLabelGenerator(pieSectionLabelGenerator23);
        piePlot11.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot11.getLabelDistributor();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        piePlot11.notifyListeners(plotChangeEvent28);
        java.awt.Paint paint30 = piePlot11.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot32.getSimpleLabelOffset();
        piePlot32.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot32.getLabelPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot32.getInsets();
        piePlot11.setSimpleLabelOffset(rectangleInsets38);
        piePlot1.setInsets(rectangleInsets38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator9 and pieSectionLabelGenerator23", pieSectionLabelGenerator9.equals(pieSectionLabelGenerator23) ? pieSectionLabelGenerator9.hashCode() == pieSectionLabelGenerator23.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        piePlot1.zoom((double) (short) 100);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getShadowYOffset();
        java.awt.Stroke stroke14 = piePlot11.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot11.getLegendLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Stroke stroke20 = null;
        piePlot18.setSectionOutlineStroke((java.lang.Comparable) '#', stroke20);
        java.awt.Paint paint23 = piePlot18.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke24 = piePlot18.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        piePlot18.markerChanged(markerChangeEvent25);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot18.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator15 and pieSectionLabelGenerator27", pieSectionLabelGenerator15.equals(pieSectionLabelGenerator27) ? pieSectionLabelGenerator15.hashCode() == pieSectionLabelGenerator27.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        java.awt.Image image52 = null;
        piePlot48.setBackgroundImage(image52);
        java.awt.Paint paint54 = piePlot48.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset55 = null;
        piePlot48.setDataset(pieDataset55);
        double double57 = piePlot48.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = piePlot48.getLabelPadding();
        java.awt.Image image59 = null;
        piePlot48.setBackgroundImage(image59);
        double double61 = piePlot48.getLabelLinkMargin();
        java.awt.Paint paint62 = piePlot48.getOutlinePaint();
        piePlot1.setBaseSectionPaint(paint62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot33 and piePlot48", piePlot33.equals(piePlot48) ? piePlot33.hashCode() == piePlot48.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        piePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot11.handleClick((int) (byte) 0, 100, plotRenderingInfo16);
        java.awt.Paint paint18 = piePlot11.getBaseSectionPaint();
        org.jfree.data.general.DatasetGroup datasetGroup19 = piePlot11.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        piePlot21.setLabelGap(0.0d);
        float float30 = piePlot21.getForegroundAlpha();
        boolean boolean31 = piePlot21.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = null;
        piePlot21.setURLGenerator(pieURLGenerator32);
        boolean boolean34 = piePlot21.getIgnoreNullValues();
        java.awt.Paint paint35 = piePlot21.getShadowPaint();
        piePlot11.setLabelBackgroundPaint(paint35);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator39 = piePlot38.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot38.getInsets();
        double double41 = piePlot38.getInteriorGap();
        org.jfree.chart.util.Rotation rotation42 = piePlot38.getDirection();
        piePlot11.setDirection(rotation42);
        java.awt.Paint paint45 = piePlot11.lookupSectionPaint((java.lang.Comparable) '4');
        piePlot1.setLabelShadowPaint(paint45);
        boolean boolean47 = piePlot1.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        java.awt.Image image53 = null;
        piePlot49.setBackgroundImage(image53);
        java.awt.Paint paint55 = piePlot49.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset56 = null;
        piePlot49.setDataset(pieDataset56);
        double double58 = piePlot49.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        double double61 = piePlot60.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent62 = null;
        piePlot60.notifyListeners(plotChangeEvent62);
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = piePlot60.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = piePlot60.getSimpleLabelOffset();
        java.awt.Paint paint66 = piePlot60.getLabelBackgroundPaint();
        piePlot49.setShadowPaint(paint66);
        piePlot1.setLabelLinkPaint(paint66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot38 and piePlot60", piePlot38.equals(piePlot60) ? piePlot38.hashCode() == piePlot60.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        double double36 = piePlot35.getShadowYOffset();
        java.awt.Stroke stroke38 = piePlot35.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = null;
        piePlot35.setLegendLabelURLGenerator(pieURLGenerator39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        piePlot35.setOutlinePaint(paint45);
        piePlot35.setLabelLinkMargin((double) 100L);
        java.awt.Stroke stroke49 = piePlot35.getOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener50 = null;
        piePlot35.removeChangeListener(plotChangeListener50);
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        double double54 = piePlot53.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = piePlot53.getSimpleLabelOffset();
        piePlot53.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = piePlot53.getLabelPadding();
        boolean boolean59 = piePlot53.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset60 = null;
        org.jfree.chart.plot.PiePlot piePlot61 = new org.jfree.chart.plot.PiePlot(pieDataset60);
        piePlot61.setIgnoreNullValues(true);
        java.awt.Paint paint64 = piePlot61.getLabelPaint();
        java.awt.Image image65 = null;
        piePlot61.setBackgroundImage(image65);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator67 = null;
        piePlot61.setToolTipGenerator(pieToolTipGenerator67);
        org.jfree.data.general.PieDataset pieDataset69 = null;
        piePlot61.setDataset(pieDataset69);
        java.awt.Stroke stroke73 = piePlot61.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier74 = piePlot61.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset75 = null;
        org.jfree.chart.plot.PiePlot piePlot76 = new org.jfree.chart.plot.PiePlot(pieDataset75);
        double double77 = piePlot76.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent78 = null;
        piePlot76.notifyListeners(plotChangeEvent78);
        org.jfree.chart.util.RectangleInsets rectangleInsets80 = piePlot76.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets81 = piePlot76.getSimpleLabelOffset();
        java.awt.Paint paint82 = piePlot76.getLabelBackgroundPaint();
        piePlot61.setShadowPaint(paint82);
        piePlot53.setBackgroundPaint(paint82);
        piePlot35.setLabelShadowPaint(paint82);
        piePlot1.setLabelLinkPaint(paint82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot76", piePlot8.equals(piePlot76) ? piePlot8.hashCode() == piePlot76.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        boolean boolean18 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot14.setToolTipGenerator(pieToolTipGenerator19);
        java.awt.Paint paint22 = piePlot14.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot24.getSimpleLabelOffset();
        boolean boolean30 = piePlot14.equals((java.lang.Object) rectangleInsets29);
        double double31 = piePlot14.getLabelLinkMargin();
        piePlot14.setBackgroundImageAlpha(0.0f);
        java.awt.Shape shape34 = piePlot14.getLegendItemShape();
        piePlot1.setLegendItemShape(shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot24", piePlot1.equals(piePlot24) ? piePlot1.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent1 = null;
        piePlot0.notifyListeners(plotChangeEvent1);
        java.awt.Paint paint3 = piePlot0.getOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getShadowYOffset();
        java.awt.Stroke stroke8 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Stroke stroke10 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        piePlot5.setLabelGap((double) 100.0f);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot14.getLegendLabelGenerator();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot14.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke17);
        piePlot14.setLabelGap((double) 0);
        piePlot14.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getShadowYOffset();
        java.awt.Image image32 = piePlot30.getBackgroundImage();
        java.awt.Stroke stroke33 = piePlot30.getLabelOutlineStroke();
        piePlot24.setLabelLinkStroke(stroke33);
        piePlot14.setBaseSectionOutlineStroke(stroke33);
        piePlot5.setOutlineStroke(stroke33);
        piePlot0.setLabelOutlineStroke(stroke33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot30", piePlot0.equals(piePlot30) ? piePlot0.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getLabelLinkMargin();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot1.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Image image14 = null;
        piePlot10.setBackgroundImage(image14);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot10.setToolTipGenerator(pieToolTipGenerator16);
        boolean boolean18 = piePlot10.getIgnoreNullValues();
        java.awt.Paint paint19 = piePlot10.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        piePlot10.setLegendLabelGenerator(pieSectionLabelGenerator22);
        boolean boolean24 = piePlot10.isCircular();
        piePlot10.setBackgroundImageAlignment((int) (short) 1);
        piePlot10.setShadowYOffset((double) (byte) -1);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        java.awt.Stroke stroke32 = null;
        piePlot30.setSectionOutlineStroke((java.lang.Comparable) '#', stroke32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        double double36 = piePlot35.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        piePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator39 = piePlot35.getToolTipGenerator();
        java.awt.Paint paint40 = piePlot35.getNoDataMessagePaint();
        piePlot35.setLabelGap(0.0d);
        java.awt.Paint paint45 = piePlot35.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot30.setLabelPaint(paint45);
        java.awt.Paint paint47 = piePlot30.getLabelLinkPaint();
        piePlot30.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        piePlot51.setIgnoreNullValues(true);
        java.awt.Paint paint54 = piePlot51.getLabelPaint();
        piePlot30.setLabelShadowPaint(paint54);
        piePlot10.setBackgroundPaint(paint54);
        piePlot1.setSectionPaint((java.lang.Comparable) 10.0d, paint54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator2 and pieSectionLabelGenerator22", pieSectionLabelGenerator2.equals(pieSectionLabelGenerator22) ? pieSectionLabelGenerator2.hashCode() == pieSectionLabelGenerator22.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        java.awt.Shape shape12 = piePlot1.getLegendItemShape();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot14.setDataset(pieDataset21);
        double double23 = piePlot14.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot14.getLabelPadding();
        boolean boolean25 = piePlot1.equals((java.lang.Object) rectangleInsets24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot14", piePlot1.equals(piePlot14) ? piePlot1.hashCode() == piePlot14.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        java.awt.Font font9 = piePlot1.getNoDataMessageFont();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot11.notifyListeners(plotChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot11.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot11.getSimpleLabelOffset();
        java.awt.Paint paint18 = piePlot11.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot11.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        piePlot21.handleClick((int) (byte) 0, 100, plotRenderingInfo26);
        java.awt.Paint paint28 = piePlot21.getBaseSectionPaint();
        java.awt.Paint paint30 = piePlot21.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot21.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent38 = null;
        piePlot34.datasetChanged(datasetChangeEvent38);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        piePlot34.addChangeListener(plotChangeListener40);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = piePlot34.getLabelGenerator();
        piePlot21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator42);
        piePlot11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator42);
        piePlot1.setLabelGenerator(pieSectionLabelGenerator42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot34", piePlot1.equals(piePlot34) ? piePlot1.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        double double5 = piePlot4.getShadowYOffset();
        java.awt.Stroke stroke7 = piePlot4.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        double double10 = piePlot9.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot9.notifyListeners(plotChangeEvent11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot9.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot9.getSimpleLabelOffset();
        piePlot4.setInsets(rectangleInsets14);
        piePlot1.setSimpleLabelOffset(rectangleInsets14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot9", piePlot1.equals(piePlot9) ? piePlot1.hashCode() == piePlot9.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = null;
        piePlot16.setToolTipGenerator(pieToolTipGenerator22);
        boolean boolean24 = piePlot16.getIgnoreNullValues();
        java.awt.Paint paint25 = piePlot16.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot27.getLegendLabelGenerator();
        piePlot16.setLegendLabelGenerator(pieSectionLabelGenerator28);
        piePlot16.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot16.getLabelDistributor();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        piePlot16.notifyListeners(plotChangeEvent33);
        java.awt.Paint paint35 = piePlot16.getLabelOutlinePaint();
        piePlot1.setBaseSectionOutlinePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator14 and pieSectionLabelGenerator28", pieSectionLabelGenerator14.equals(pieSectionLabelGenerator28) ? pieSectionLabelGenerator14.hashCode() == pieSectionLabelGenerator28.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        piePlot1.setPieIndex((int) (byte) 1);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = piePlot1.getToolTipGenerator();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot21.getInsets();
        double double24 = piePlot21.getInteriorGap();
        org.jfree.chart.util.Rotation rotation25 = piePlot21.getDirection();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        piePlot21.addChangeListener(plotChangeListener26);
        double double28 = piePlot21.getStartAngle();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot21.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot21", piePlot7.equals(piePlot21) ? piePlot7.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        piePlot11.datasetChanged(datasetChangeEvent15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot18.setToolTipGenerator(pieToolTipGenerator24);
        boolean boolean26 = piePlot18.getIgnoreNullValues();
        java.awt.Paint paint27 = piePlot18.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot29.getLegendLabelGenerator();
        piePlot18.setLegendLabelGenerator(pieSectionLabelGenerator30);
        boolean boolean32 = piePlot18.isCircular();
        piePlot18.setBackgroundImageAlignment((int) (short) 1);
        piePlot18.setShadowYOffset((double) (byte) -1);
        double double37 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot18.getLabelPadding();
        piePlot11.setInsets(rectangleInsets38, false);
        piePlot11.setShadowXOffset((double) 100);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot11.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot29", piePlot1.equals(piePlot29) ? piePlot1.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        java.awt.Paint paint31 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 10);
        piePlot1.setSectionOutlinesVisible(false);
        java.awt.Paint paint35 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 10L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = null;
        piePlot1.setURLGenerator(pieURLGenerator36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        piePlot39.handleClick((int) (byte) 0, 100, plotRenderingInfo44);
        java.awt.Paint paint46 = piePlot39.getBaseSectionPaint();
        org.jfree.data.general.DatasetGroup datasetGroup47 = piePlot39.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        java.awt.Image image53 = null;
        piePlot49.setBackgroundImage(image53);
        java.awt.Paint paint55 = piePlot49.getLabelShadowPaint();
        piePlot49.setLabelGap(0.0d);
        float float58 = piePlot49.getForegroundAlpha();
        boolean boolean59 = piePlot49.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator60 = null;
        piePlot49.setURLGenerator(pieURLGenerator60);
        boolean boolean62 = piePlot49.getIgnoreNullValues();
        java.awt.Paint paint63 = piePlot49.getShadowPaint();
        piePlot39.setLabelBackgroundPaint(paint63);
        org.jfree.data.general.PieDataset pieDataset65 = null;
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot(pieDataset65);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator67 = piePlot66.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = piePlot66.getInsets();
        double double69 = piePlot66.getInteriorGap();
        org.jfree.chart.util.Rotation rotation70 = piePlot66.getDirection();
        piePlot39.setDirection(rotation70);
        piePlot1.setDirection(rotation70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot20 and piePlot66", piePlot20.equals(piePlot66) ? piePlot20.hashCode() == piePlot66.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        java.awt.Paint paint13 = piePlot9.getNoDataMessagePaint();
        piePlot1.setBaseSectionPaint(paint13);
        java.awt.Paint paint16 = piePlot1.lookupSectionPaint((java.lang.Comparable) '4');
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot18.datasetChanged(datasetChangeEvent22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot25.handleClick((int) (byte) 0, 100, plotRenderingInfo30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        piePlot25.setLabelBackgroundPaint(paint36);
        piePlot18.setLabelShadowPaint(paint36);
        java.awt.Stroke stroke39 = piePlot18.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = null;
        piePlot18.setURLGenerator(pieURLGenerator40);
        piePlot18.setForegroundAlpha((float) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        piePlot18.addChangeListener(plotChangeListener44);
        double double46 = piePlot18.getMaximumLabelWidth();
        boolean boolean47 = piePlot18.isOutlineVisible();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot33", piePlot9.equals(piePlot33) ? piePlot9.hashCode() == piePlot33.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        java.awt.Paint paint27 = piePlot1.lookupSectionPaint((java.lang.Comparable) 10.0f);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent33 = null;
        piePlot29.datasetChanged(datasetChangeEvent33);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        piePlot36.handleClick((int) (byte) 0, 100, plotRenderingInfo41);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        piePlot36.setLabelBackgroundPaint(paint47);
        piePlot29.setLabelShadowPaint(paint47);
        java.awt.Stroke stroke50 = piePlot29.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = piePlot29.getDrawingSupplier();
        java.awt.Stroke stroke53 = piePlot29.lookupSectionOutlineStroke((java.lang.Comparable) (short) 100);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator54 = piePlot29.getLabelGenerator();
        java.awt.Font font55 = piePlot29.getNoDataMessageFont();
        piePlot1.setLabelFont(font55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot44", piePlot14.equals(piePlot44) ? piePlot14.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        piePlot57.setIgnoreNullValues(true);
        java.awt.Paint paint60 = piePlot57.getLabelPaint();
        boolean boolean61 = piePlot57.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot62 = piePlot57.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent63 = null;
        piePlot57.axisChanged(axisChangeEvent63);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier65 = piePlot57.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset66 = null;
        piePlot57.setDataset(pieDataset66);
        org.jfree.data.general.PieDataset pieDataset68 = null;
        org.jfree.chart.plot.PiePlot piePlot69 = new org.jfree.chart.plot.PiePlot(pieDataset68);
        double double70 = piePlot69.getShadowYOffset();
        java.awt.Stroke stroke72 = piePlot69.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot57.setBaseSectionOutlineStroke(stroke72);
        java.awt.Paint paint74 = piePlot57.getBaseSectionOutlinePaint();
        piePlot1.setLabelShadowPaint(paint74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot69", piePlot8.equals(piePlot69) ? piePlot8.hashCode() == piePlot69.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        piePlot38.setIgnoreNullValues(true);
        java.awt.Paint paint41 = piePlot38.getLabelPaint();
        java.awt.Image image42 = null;
        piePlot38.setBackgroundImage(image42);
        java.awt.Paint paint44 = piePlot38.getLabelShadowPaint();
        piePlot38.setShadowXOffset(90.0d);
        piePlot38.setForegroundAlpha(10.0f);
        piePlot38.setCircular(true, false);
        double double52 = piePlot38.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor53 = piePlot38.getLabelDistributor();
        java.awt.Paint paint54 = piePlot38.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot55 = piePlot38.getParent();
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        piePlot60.setIgnoreNullValues(true);
        java.awt.Paint paint63 = piePlot60.getLabelPaint();
        piePlot57.setLabelPaint(paint63);
        boolean boolean65 = piePlot57.getIgnoreZeroValues();
        java.awt.Stroke stroke66 = piePlot57.getOutlineStroke();
        piePlot38.setLabelLinkStroke(stroke66);
        piePlot1.setLabelOutlineStroke(stroke66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot57", piePlot24.equals(piePlot57) ? piePlot24.hashCode() == piePlot57.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = piePlot1.getDrawingSupplier();
        piePlot1.setLabelLinksVisible(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot1.getLegendLabelURLGenerator();
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
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        double double36 = piePlot35.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        piePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot35.getSimpleLabelOffset();
        java.awt.Font font40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot35.setNoDataMessageFont(font40);
        piePlot19.setLabelFont(font40);
        piePlot1.setLabelFont(font40);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getShadowYOffset();
        java.awt.Image image47 = piePlot45.getBackgroundImage();
        java.awt.Paint paint49 = piePlot45.lookupSectionPaint((java.lang.Comparable) 0L);
        piePlot1.setShadowPaint(paint49);
        piePlot1.setLabelLinkMargin((-1.0d));
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        java.awt.Paint paint57 = piePlot54.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent58 = null;
        piePlot54.datasetChanged(datasetChangeEvent58);
        org.jfree.chart.util.RectangleInsets rectangleInsets60 = piePlot54.getLabelPadding();
        double double62 = piePlot54.getExplodePercent((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset63 = null;
        piePlot54.setDataset(pieDataset63);
        org.jfree.data.general.PieDataset pieDataset65 = null;
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot(pieDataset65);
        piePlot66.setIgnoreNullValues(true);
        java.awt.Paint paint69 = piePlot66.getLabelPaint();
        java.awt.Image image70 = null;
        piePlot66.setBackgroundImage(image70);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator72 = null;
        piePlot66.setToolTipGenerator(pieToolTipGenerator72);
        boolean boolean74 = piePlot66.getIgnoreNullValues();
        java.awt.Paint paint75 = piePlot66.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset76 = null;
        org.jfree.chart.plot.PiePlot piePlot77 = new org.jfree.chart.plot.PiePlot(pieDataset76);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator78 = piePlot77.getLegendLabelGenerator();
        piePlot66.setLegendLabelGenerator(pieSectionLabelGenerator78);
        piePlot66.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor82 = piePlot66.getLabelDistributor();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent83 = null;
        piePlot66.notifyListeners(plotChangeEvent83);
        java.awt.Paint paint85 = piePlot66.getLabelOutlinePaint();
        piePlot54.setNoDataMessagePaint(paint85);
        piePlot1.setLabelLinkPaint(paint85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot45 and piePlot77", piePlot45.equals(piePlot77) ? piePlot45.hashCode() == piePlot77.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        piePlot1.setCircular(false);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot14.setDataset(pieDataset21);
        double double23 = piePlot14.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        piePlot25.notifyListeners(plotChangeEvent27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot25.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot25.getSimpleLabelOffset();
        java.awt.Paint paint31 = piePlot25.getLabelBackgroundPaint();
        piePlot14.setShadowPaint(paint31);
        piePlot1.setLabelPaint(paint31);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        piePlot1.handleClick((int) ' ', (int) 'a', plotRenderingInfo36);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        piePlot1.axisChanged(axisChangeEvent38);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        java.awt.Stroke stroke44 = null;
        piePlot42.setSectionOutlineStroke((java.lang.Comparable) '#', stroke44);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        double double48 = piePlot47.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        piePlot47.notifyListeners(plotChangeEvent49);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator51 = piePlot47.getToolTipGenerator();
        java.awt.Paint paint52 = piePlot47.getNoDataMessagePaint();
        piePlot47.setLabelGap(0.0d);
        java.awt.Paint paint57 = piePlot47.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot42.setLabelPaint(paint57);
        java.awt.Paint paint59 = piePlot42.getLabelLinkPaint();
        piePlot42.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        double double64 = piePlot63.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent65 = null;
        piePlot63.notifyListeners(plotChangeEvent65);
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = piePlot63.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = piePlot63.getSimpleLabelOffset();
        java.awt.Paint paint69 = piePlot63.getLabelBackgroundPaint();
        java.awt.Paint paint70 = piePlot63.getLabelShadowPaint();
        piePlot42.setOutlinePaint(paint70);
        piePlot1.setSectionPaint((java.lang.Comparable) 0.5f, paint70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot25 and piePlot63", piePlot25.equals(piePlot63) ? piePlot25.hashCode() == piePlot63.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        boolean boolean30 = piePlot26.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot31 = piePlot26.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        piePlot26.axisChanged(axisChangeEvent32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        piePlot26.setBaseSectionPaint(paint38);
        piePlot26.setStartAngle((double) (byte) 0);
        piePlot26.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getShadowYOffset();
        java.awt.Image image47 = piePlot45.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot45.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        piePlot45.drawBackgroundImage(graphics2D49, rectangle2D50);
        java.awt.Image image52 = null;
        piePlot45.setBackgroundImage(image52);
        java.awt.Stroke stroke56 = piePlot45.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = piePlot45.getInsets();
        piePlot26.setSimpleLabelOffset(rectangleInsets57);
        java.awt.Paint paint59 = piePlot26.getLabelLinkPaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 97, paint59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot35", piePlot10.equals(piePlot35) ? piePlot10.hashCode() == piePlot35.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        java.awt.Font font24 = piePlot1.getLabelFont();
        boolean boolean25 = piePlot1.isCircular();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        piePlot27.setLabelGap(0.0d);
        java.awt.Paint paint36 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot27.setLabelLinkPaint(paint36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        java.awt.Paint paint42 = piePlot39.getLabelPaint();
        java.awt.Image image43 = null;
        piePlot39.setBackgroundImage(image43);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator45 = null;
        piePlot39.setToolTipGenerator(pieToolTipGenerator45);
        piePlot39.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        piePlot50.setIgnoreNullValues(true);
        java.awt.Paint paint53 = piePlot50.getLabelPaint();
        boolean boolean54 = piePlot50.getIgnoreZeroValues();
        java.awt.Shape shape55 = piePlot50.getLegendItemShape();
        boolean boolean56 = piePlot39.equals((java.lang.Object) piePlot50);
        piePlot27.setParent((org.jfree.chart.plot.Plot) piePlot50);
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        double double60 = piePlot59.getShadowYOffset();
        java.awt.Image image61 = piePlot59.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator62 = piePlot59.getLegendLabelURLGenerator();
        java.awt.Font font63 = piePlot59.getNoDataMessageFont();
        piePlot50.setLabelFont(font63);
        java.awt.Stroke stroke65 = piePlot50.getLabelOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection66 = piePlot50.getLegendItems();
        org.jfree.data.general.PieDataset pieDataset67 = null;
        org.jfree.chart.plot.PiePlot piePlot68 = new org.jfree.chart.plot.PiePlot(pieDataset67);
        piePlot68.setIgnoreNullValues(true);
        java.awt.Paint paint71 = piePlot68.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent72 = null;
        piePlot68.datasetChanged(datasetChangeEvent72);
        org.jfree.chart.event.PlotChangeListener plotChangeListener74 = null;
        piePlot68.addChangeListener(plotChangeListener74);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator76 = piePlot68.getLabelGenerator();
        java.awt.Paint paint77 = piePlot68.getLabelShadowPaint();
        piePlot50.setLabelPaint(paint77);
        piePlot1.setBaseSectionPaint(paint77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot27", piePlot8.equals(piePlot27) ? piePlot8.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        piePlot1.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot30.handleClick((int) (byte) 0, 100, plotRenderingInfo35);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent37 = null;
        piePlot30.datasetChanged(datasetChangeEvent37);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        double double41 = piePlot40.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot40.getSimpleLabelOffset();
        piePlot30.setInsets(rectangleInsets42, false);
        piePlot30.setShadowXOffset((double) (byte) 100);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        java.awt.Image image52 = null;
        piePlot48.setBackgroundImage(image52);
        java.awt.Paint paint54 = piePlot48.getLabelShadowPaint();
        piePlot30.setBaseSectionOutlinePaint(paint54);
        java.awt.Stroke stroke58 = piePlot30.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 1, true);
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0, stroke58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot48", piePlot10.equals(piePlot48) ? piePlot10.hashCode() == piePlot48.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) (byte) 1, 0, plotRenderingInfo8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot11.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot11.getInsets();
        double double14 = piePlot11.getInteriorGap();
        piePlot11.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getShadowYOffset();
        java.awt.Image image20 = piePlot18.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot18.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot18.drawBackgroundImage(graphics2D22, rectangle2D23);
        java.awt.Image image25 = null;
        piePlot18.setBackgroundImage(image25);
        java.awt.Stroke stroke29 = piePlot18.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float30 = piePlot18.getForegroundAlpha();
        java.awt.Paint paint31 = piePlot18.getLabelPaint();
        double double32 = piePlot18.getInteriorGap();
        java.awt.Paint paint33 = piePlot18.getLabelBackgroundPaint();
        piePlot11.setNoDataMessagePaint(paint33);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot11.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        java.awt.Paint paint13 = piePlot1.getOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        piePlot15.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot15.getSimpleLabelOffset();
        boolean boolean20 = piePlot15.getIgnoreNullValues();
        piePlot15.setForegroundAlpha((float) 1);
        double double23 = piePlot15.getStartAngle();
        boolean boolean24 = piePlot15.isOutlineVisible();
        java.awt.Stroke stroke25 = piePlot15.getLabelOutlineStroke();
        piePlot1.setLabelLinkStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot15", piePlot1.equals(piePlot15) ? piePlot1.hashCode() == piePlot15.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        piePlot56.setIgnoreNullValues(true);
        java.awt.Paint paint59 = piePlot56.getLabelPaint();
        boolean boolean60 = piePlot56.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot61 = piePlot56.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent62 = null;
        piePlot56.axisChanged(axisChangeEvent62);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier64 = piePlot56.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener65 = null;
        piePlot56.removeChangeListener(plotChangeListener65);
        java.awt.Paint paint67 = piePlot56.getLabelBackgroundPaint();
        piePlot1.setOutlinePaint(paint67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot43 and piePlot56", piePlot43.equals(piePlot56) ? piePlot43.hashCode() == piePlot56.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        boolean boolean19 = piePlot15.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot20 = piePlot15.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        piePlot15.axisChanged(axisChangeEvent21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot15.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        piePlot15.setDataset(pieDataset24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot27.getLegendLabelGenerator();
        piePlot15.setLabelGenerator(pieSectionLabelGenerator28);
        double double30 = piePlot15.getLabelGap();
        piePlot15.setStartAngle((double) (byte) 0);
        java.awt.Stroke stroke33 = piePlot15.getBaseSectionOutlineStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier23", drawingSupplier9.equals(drawingSupplier23) ? drawingSupplier9.hashCode() == drawingSupplier23.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        java.awt.Paint paint31 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 10);
        piePlot1.setSectionOutlinesVisible(false);
        java.awt.Paint paint35 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 10L);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        java.awt.Stroke stroke39 = null;
        piePlot37.setSectionOutlineStroke((java.lang.Comparable) '#', stroke39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        piePlot42.notifyListeners(plotChangeEvent44);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator46 = piePlot42.getToolTipGenerator();
        java.awt.Paint paint47 = piePlot42.getNoDataMessagePaint();
        piePlot42.setLabelGap(0.0d);
        java.awt.Paint paint52 = piePlot42.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot37.setLabelPaint(paint52);
        java.awt.Paint paint54 = piePlot37.getLabelLinkPaint();
        piePlot37.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        piePlot58.setIgnoreNullValues(true);
        java.awt.Paint paint61 = piePlot58.getLabelPaint();
        java.awt.Image image62 = null;
        piePlot58.setBackgroundImage(image62);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator64 = null;
        piePlot58.setToolTipGenerator(pieToolTipGenerator64);
        boolean boolean66 = piePlot58.getIgnoreZeroValues();
        java.awt.Paint paint67 = piePlot58.getShadowPaint();
        piePlot37.setLabelPaint(paint67);
        piePlot37.setExplodePercent((java.lang.Comparable) false, 4.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo74 = null;
        piePlot37.handleClick(0, (int) (short) 1, plotRenderingInfo74);
        boolean boolean76 = piePlot37.getIgnoreNullValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets77 = piePlot37.getSimpleLabelOffset();
        piePlot1.setInsets(rectangleInsets77, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot58", piePlot10.equals(piePlot58) ? piePlot10.hashCode() == piePlot58.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        piePlot38.setIgnoreNullValues(true);
        java.awt.Paint paint41 = piePlot38.getLabelPaint();
        java.awt.Image image42 = null;
        piePlot38.setBackgroundImage(image42);
        java.awt.Paint paint44 = piePlot38.getLabelShadowPaint();
        piePlot38.setShadowXOffset(90.0d);
        piePlot38.setForegroundAlpha(10.0f);
        piePlot38.setCircular(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator51 = piePlot38.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        piePlot53.setIgnoreNullValues(true);
        java.awt.Paint paint56 = piePlot53.getLabelPaint();
        java.awt.Image image57 = null;
        piePlot53.setBackgroundImage(image57);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator59 = piePlot53.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent60 = null;
        piePlot53.datasetChanged(datasetChangeEvent60);
        java.awt.Stroke stroke62 = piePlot53.getBaseSectionOutlineStroke();
        java.awt.Paint paint65 = piePlot53.lookupSectionPaint((java.lang.Comparable) 0.4d, false);
        piePlot38.setShadowPaint(paint65);
        piePlot16.setBackgroundPaint(paint65);
        org.jfree.data.general.PieDataset pieDataset68 = null;
        org.jfree.chart.plot.PiePlot piePlot69 = new org.jfree.chart.plot.PiePlot(pieDataset68);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator70 = piePlot69.getLegendLabelGenerator();
        java.awt.Stroke stroke72 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot69.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke72);
        piePlot69.setLabelGap((double) 0);
        piePlot69.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset78 = null;
        org.jfree.chart.plot.PiePlot piePlot79 = new org.jfree.chart.plot.PiePlot(pieDataset78);
        piePlot79.setIgnoreNullValues(true);
        java.awt.Paint paint82 = piePlot79.getLabelPaint();
        boolean boolean83 = piePlot79.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset84 = null;
        org.jfree.chart.plot.PiePlot piePlot85 = new org.jfree.chart.plot.PiePlot(pieDataset84);
        double double86 = piePlot85.getShadowYOffset();
        java.awt.Image image87 = piePlot85.getBackgroundImage();
        java.awt.Stroke stroke88 = piePlot85.getLabelOutlineStroke();
        piePlot79.setLabelLinkStroke(stroke88);
        piePlot69.setBaseSectionOutlineStroke(stroke88);
        piePlot16.setLabelOutlineStroke(stroke88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot27 and piePlot85", piePlot27.equals(piePlot85) ? piePlot27.hashCode() == piePlot85.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        double double51 = piePlot50.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        piePlot50.notifyListeners(plotChangeEvent52);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator54 = piePlot50.getToolTipGenerator();
        java.awt.Paint paint55 = piePlot50.getNoDataMessagePaint();
        piePlot50.setLabelGap(0.0d);
        java.awt.Paint paint60 = piePlot50.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        org.jfree.data.general.DatasetGroup datasetGroup61 = piePlot50.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        piePlot63.setIgnoreNullValues(true);
        java.awt.Paint paint66 = piePlot63.getLabelPaint();
        boolean boolean67 = piePlot63.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot68 = piePlot63.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent69 = null;
        piePlot63.axisChanged(axisChangeEvent69);
        piePlot63.setExplodePercent((java.lang.Comparable) 10L, (double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets74 = piePlot63.getInsets();
        piePlot50.setInsets(rectangleInsets74, false);
        java.awt.Paint paint78 = piePlot50.lookupSectionPaint((java.lang.Comparable) (short) 10);
        piePlot1.setSectionPaint((java.lang.Comparable) 100L, paint78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot26 and piePlot50", piePlot26.equals(piePlot50) ? piePlot26.hashCode() == piePlot50.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        java.awt.Paint paint17 = piePlot11.getLabelShadowPaint();
        piePlot11.setLabelGap(0.0d);
        float float20 = piePlot11.getForegroundAlpha();
        boolean boolean21 = piePlot11.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot11.setURLGenerator(pieURLGenerator22);
        boolean boolean24 = piePlot11.getIgnoreNullValues();
        java.awt.Paint paint25 = piePlot11.getShadowPaint();
        piePlot1.setLabelBackgroundPaint(paint25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot28.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot28.getInsets();
        double double31 = piePlot28.getInteriorGap();
        org.jfree.chart.util.Rotation rotation32 = piePlot28.getDirection();
        piePlot1.setDirection(rotation32);
        java.awt.Paint paint35 = piePlot1.lookupSectionPaint((java.lang.Comparable) '4');
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator39 = piePlot38.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot38.getInsets();
        double double41 = piePlot38.getInteriorGap();
        piePlot38.setSimpleLabels(true);
        java.awt.Paint paint44 = piePlot38.getOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        boolean boolean50 = piePlot46.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot51 = piePlot46.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent52 = null;
        piePlot46.axisChanged(axisChangeEvent52);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = piePlot46.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener55 = null;
        piePlot46.removeChangeListener(plotChangeListener55);
        java.awt.Paint paint57 = piePlot46.getLabelBackgroundPaint();
        piePlot38.setBackgroundPaint(paint57);
        piePlot1.setSectionPaint((java.lang.Comparable) 100, paint57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator29 and pieSectionLabelGenerator39", pieSectionLabelGenerator29.equals(pieSectionLabelGenerator39) ? pieSectionLabelGenerator29.hashCode() == pieSectionLabelGenerator39.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        piePlot1.setCircular(false);
        double double40 = piePlot1.getMaximumLabelWidth();
        java.awt.Stroke stroke43 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) ' ', true);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        piePlot45.setIgnoreNullValues(true);
        java.awt.Paint paint48 = piePlot45.getLabelPaint();
        boolean boolean49 = piePlot45.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator50 = null;
        piePlot45.setToolTipGenerator(pieToolTipGenerator50);
        double double52 = piePlot45.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        double double55 = piePlot54.getStartAngle();
        java.awt.Stroke stroke57 = piePlot54.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint59 = piePlot54.getSectionPaint((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset60 = null;
        org.jfree.chart.plot.PiePlot piePlot61 = new org.jfree.chart.plot.PiePlot(pieDataset60);
        piePlot61.setIgnoreNullValues(true);
        java.awt.Paint paint64 = piePlot61.getLabelPaint();
        java.awt.Image image65 = null;
        piePlot61.setBackgroundImage(image65);
        java.awt.Paint paint67 = piePlot61.getLabelShadowPaint();
        piePlot61.setShadowXOffset(90.0d);
        piePlot61.setForegroundAlpha(10.0f);
        piePlot61.setCircular(true, false);
        java.awt.Paint paint75 = piePlot61.getLabelPaint();
        piePlot54.setShadowPaint(paint75);
        java.awt.Stroke stroke78 = piePlot54.lookupSectionOutlineStroke((java.lang.Comparable) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets79 = piePlot54.getSimpleLabelOffset();
        java.awt.Paint paint82 = piePlot54.lookupSectionOutlinePaint((java.lang.Comparable) (short) 100, true);
        piePlot45.setBackgroundPaint(paint82);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator84 = piePlot45.getLabelGenerator();
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot45", piePlot22.equals(piePlot45) ? piePlot22.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        java.lang.Object obj10 = piePlot1.clone();
        boolean boolean11 = piePlot1.getLabelLinksVisible();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj10", piePlot1.equals(obj10) ? piePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        java.awt.Stroke stroke7 = piePlot1.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke8 = piePlot1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = null;
        piePlot10.setLegendLabelURLGenerator(pieURLGenerator14);
        java.lang.Comparable comparable17 = piePlot10.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot10.drawBackgroundImage(graphics2D18, rectangle2D19);
        boolean boolean21 = piePlot1.equals((java.lang.Object) graphics2D18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot10", piePlot1.equals(piePlot10) ? piePlot1.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        java.awt.Paint paint28 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 10.0f, true);
        java.awt.Image image29 = null;
        piePlot1.setBackgroundImage(image29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        boolean boolean36 = piePlot32.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot37 = piePlot32.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        piePlot32.axisChanged(axisChangeEvent38);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = piePlot32.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        piePlot32.setDataset(pieDataset41);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator45 = piePlot44.getLegendLabelGenerator();
        piePlot32.setLabelGenerator(pieSectionLabelGenerator45);
        java.awt.Paint paint48 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot32.setSectionOutlinePaint((java.lang.Comparable) (-1L), paint48);
        piePlot32.setStartAngle(0.0d);
        boolean boolean52 = piePlot32.getSectionOutlinesVisible();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot32);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot(pieDataset54);
        piePlot55.setIgnoreNullValues(true);
        java.awt.Paint paint58 = piePlot55.getLabelPaint();
        boolean boolean59 = piePlot55.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot60 = piePlot55.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator61 = piePlot55.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent62 = null;
        piePlot55.notifyListeners(plotChangeEvent62);
        java.awt.Font font64 = piePlot55.getNoDataMessageFont();
        java.awt.Paint paint65 = piePlot55.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        piePlot67.setIgnoreNullValues(true);
        java.awt.Paint paint70 = piePlot67.getLabelPaint();
        boolean boolean71 = piePlot67.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot72 = piePlot67.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent73 = null;
        piePlot67.axisChanged(axisChangeEvent73);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier75 = piePlot67.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset76 = null;
        piePlot67.setDataset(pieDataset76);
        org.jfree.data.general.PieDataset pieDataset78 = null;
        org.jfree.chart.plot.PiePlot piePlot79 = new org.jfree.chart.plot.PiePlot(pieDataset78);
        double double80 = piePlot79.getShadowYOffset();
        java.awt.Stroke stroke82 = piePlot79.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot67.setBaseSectionOutlineStroke(stroke82);
        java.awt.Paint paint84 = piePlot67.getBaseSectionOutlinePaint();
        java.awt.Paint paint85 = piePlot67.getLabelBackgroundPaint();
        java.awt.Paint paint86 = piePlot67.getLabelOutlinePaint();
        piePlot55.setLabelBackgroundPaint(paint86);
        piePlot1.setBaseSectionPaint(paint86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot55", piePlot8.equals(piePlot55) ? piePlot8.hashCode() == piePlot55.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        piePlot27.notifyListeners(plotChangeEvent28);
        piePlot27.setLabelLinksVisible(false);
        java.awt.Paint paint32 = piePlot27.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        boolean boolean38 = piePlot34.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        double double42 = piePlot41.getShadowYOffset();
        java.awt.Stroke stroke44 = piePlot41.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot34.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke44);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        piePlot47.setIgnoreNullValues(true);
        java.awt.Paint paint50 = piePlot47.getLabelPaint();
        java.awt.Image image51 = null;
        piePlot47.setBackgroundImage(image51);
        java.awt.Paint paint53 = piePlot47.getLabelShadowPaint();
        java.awt.Paint paint56 = piePlot47.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot34.setNoDataMessagePaint(paint56);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator58 = piePlot34.getLegendLabelGenerator();
        piePlot27.setLegendLabelToolTipGenerator(pieSectionLabelGenerator58);
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot47", piePlot16.equals(piePlot47) ? piePlot16.hashCode() == piePlot47.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        boolean boolean47 = piePlot43.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot48 = piePlot43.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent49 = null;
        piePlot43.axisChanged(axisChangeEvent49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = piePlot43.getDrawingSupplier();
        java.awt.Stroke stroke52 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot43.setOutlineStroke(stroke52);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = null;
        piePlot43.setURLGenerator(pieURLGenerator54);
        piePlot43.setIgnoreNullValues(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator58 = piePlot43.getLegendLabelGenerator();
        piePlot17.setLegendLabelGenerator(pieSectionLabelGenerator58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot32 and piePlot43", piePlot32.equals(piePlot43) ? piePlot32.hashCode() == piePlot43.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
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
        piePlot8.setSectionOutlinePaint((java.lang.Comparable) 1.0d, paint36);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        java.awt.Image image44 = null;
        piePlot40.setBackgroundImage(image44);
        java.awt.Paint paint46 = piePlot40.getLabelShadowPaint();
        java.awt.Image image47 = piePlot40.getBackgroundImage();
        java.awt.Paint paint48 = piePlot40.getBaseSectionPaint();
        java.awt.Paint paint49 = piePlot40.getBaseSectionPaint();
        java.awt.Paint paint50 = piePlot40.getBaseSectionPaint();
        piePlot8.setLabelBackgroundPaint(paint50);
        org.jfree.chart.util.Rotation rotation52 = piePlot8.getDirection();
        piePlot1.setDirection(rotation52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot40", piePlot1.equals(piePlot40) ? piePlot1.hashCode() == piePlot40.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        java.awt.Stroke stroke13 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = null;
        piePlot15.setLegendLabelURLGenerator(pieURLGenerator19);
        float float21 = piePlot15.getBackgroundAlpha();
        java.awt.Paint paint22 = piePlot15.getLabelBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        piePlot23.setSimpleLabels(true);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot27.notifyListeners(plotChangeEvent29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot27.getSimpleLabelOffset();
        boolean boolean32 = piePlot27.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        double double35 = piePlot34.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        piePlot34.setLabelPaint(paint40);
        piePlot27.setBackgroundPaint(paint40);
        piePlot23.setLabelPaint(paint40);
        piePlot15.setLabelShadowPaint(paint40);
        piePlot1.setLabelPaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot37", piePlot1.equals(piePlot37) ? piePlot1.hashCode() == piePlot37.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        boolean boolean16 = piePlot12.getIgnoreZeroValues();
        java.awt.Shape shape17 = piePlot12.getLegendItemShape();
        boolean boolean18 = piePlot1.equals((java.lang.Object) piePlot12);
        java.lang.Object obj19 = piePlot12.clone();
        piePlot12.setBackgroundAlpha((float) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and obj19", piePlot12.equals(obj19) ? piePlot12.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot1.getSimpleLabelOffset();
        float float22 = piePlot1.getForegroundAlpha();
        piePlot1.setShadowXOffset((double) 1.0f);
        java.awt.Stroke stroke25 = piePlot1.getOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator33 = null;
        piePlot27.setToolTipGenerator(pieToolTipGenerator33);
        boolean boolean35 = piePlot27.getIgnoreNullValues();
        java.awt.Paint paint36 = piePlot27.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator39 = piePlot38.getLegendLabelGenerator();
        piePlot27.setLegendLabelGenerator(pieSectionLabelGenerator39);
        boolean boolean41 = piePlot27.isCircular();
        piePlot27.setBackgroundImageAlignment((int) (short) 1);
        piePlot27.setShadowYOffset((double) (byte) -1);
        double double46 = piePlot27.getLabelLinkMargin();
        org.jfree.chart.plot.Plot plot47 = piePlot27.getRootPlot();
        java.awt.Paint paint48 = piePlot27.getBackgroundPaint();
        piePlot1.setBaseSectionOutlinePaint(paint48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot38", piePlot13.equals(piePlot38) ? piePlot13.hashCode() == piePlot38.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        piePlot1.setNoDataMessage("");
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot1.getLegendLabelToolTipGenerator();
        piePlot1.setShadowYOffset((double) 10);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot20.handleClick((int) (byte) 0, 100, plotRenderingInfo25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        piePlot20.setLabelBackgroundPaint(paint31);
        java.awt.Paint paint33 = piePlot20.getBaseSectionOutlinePaint();
        piePlot1.setShadowPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot28", piePlot9.equals(piePlot28) ? piePlot9.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        piePlot17.setShadowXOffset((double) (short) -1);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        piePlot47.setIgnoreNullValues(true);
        java.awt.Paint paint50 = piePlot47.getLabelPaint();
        java.awt.Image image51 = null;
        piePlot47.setBackgroundImage(image51);
        java.awt.Paint paint53 = piePlot47.getLabelShadowPaint();
        piePlot47.setShadowXOffset(90.0d);
        piePlot47.setForegroundAlpha(10.0f);
        piePlot47.setCircular(true, false);
        double double61 = piePlot47.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        double double64 = piePlot63.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent65 = null;
        piePlot63.notifyListeners(plotChangeEvent65);
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = piePlot63.getSimpleLabelOffset();
        java.awt.Font font68 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot63.setNoDataMessageFont(font68);
        piePlot47.setLabelFont(font68);
        java.awt.Font font71 = piePlot47.getLabelFont();
        org.jfree.data.general.PieDataset pieDataset72 = null;
        org.jfree.chart.plot.PiePlot piePlot73 = new org.jfree.chart.plot.PiePlot(pieDataset72);
        piePlot73.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo78 = null;
        piePlot73.handleClick((int) (byte) 0, 100, plotRenderingInfo78);
        java.awt.Paint paint80 = piePlot73.getBaseSectionPaint();
        java.awt.Image image81 = null;
        piePlot73.setBackgroundImage(image81);
        org.jfree.chart.util.RectangleInsets rectangleInsets83 = piePlot73.getLabelPadding();
        piePlot47.setLabelPadding(rectangleInsets83);
        boolean boolean85 = piePlot17.equals((java.lang.Object) rectangleInsets83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot32 and piePlot73", piePlot32.equals(piePlot73) ? piePlot32.hashCode() == piePlot73.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        boolean boolean16 = piePlot12.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot17 = piePlot12.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot12.getLegendLabelURLGenerator();
        int int19 = piePlot12.getPieIndex();
        piePlot12.setCircular(true);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot12.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot12", piePlot1.equals(piePlot12) ? piePlot1.hashCode() == piePlot12.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        piePlot1.setBackgroundAlpha((float) (short) 1);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        java.awt.Image image29 = null;
        piePlot25.setBackgroundImage(image29);
        java.awt.Paint paint31 = piePlot25.getLabelShadowPaint();
        piePlot25.setLabelGap(0.0d);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot25.setLabelLinkPaint(paint34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator43 = null;
        piePlot37.setToolTipGenerator(pieToolTipGenerator43);
        piePlot37.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        boolean boolean52 = piePlot48.getIgnoreZeroValues();
        java.awt.Shape shape53 = piePlot48.getLegendItemShape();
        boolean boolean54 = piePlot37.equals((java.lang.Object) piePlot48);
        piePlot25.setParent((org.jfree.chart.plot.Plot) piePlot48);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getShadowYOffset();
        java.awt.Image image59 = piePlot57.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator60 = piePlot57.getLegendLabelURLGenerator();
        java.awt.Font font61 = piePlot57.getNoDataMessageFont();
        piePlot48.setLabelFont(font61);
        org.jfree.chart.event.PlotChangeListener plotChangeListener63 = null;
        piePlot48.addChangeListener(plotChangeListener63);
        java.awt.Paint paint65 = piePlot48.getLabelShadowPaint();
        double double66 = piePlot48.getShadowXOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor67 = piePlot48.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot25", piePlot8.equals(piePlot25) ? piePlot8.hashCode() == piePlot25.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        float float8 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        piePlot10.datasetChanged(datasetChangeEvent14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        piePlot17.handleClick((int) (byte) 0, 100, plotRenderingInfo22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        piePlot17.setLabelBackgroundPaint(paint28);
        piePlot10.setLabelShadowPaint(paint28);
        java.awt.Stroke stroke31 = piePlot10.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = piePlot10.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        piePlot35.setIgnoreNullValues(true);
        java.awt.Paint paint38 = piePlot35.getLabelPaint();
        boolean boolean39 = piePlot35.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot40 = piePlot35.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        piePlot35.axisChanged(axisChangeEvent41);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        double double45 = piePlot44.getShadowYOffset();
        java.awt.Stroke stroke47 = piePlot44.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Stroke stroke49 = piePlot44.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        piePlot35.setLabelOutlineStroke(stroke49);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        java.awt.Image image56 = null;
        piePlot52.setBackgroundImage(image56);
        java.awt.Paint paint58 = piePlot52.getLabelShadowPaint();
        piePlot52.setShadowXOffset(90.0d);
        piePlot52.setForegroundAlpha(10.0f);
        piePlot52.setCircular(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator65 = piePlot52.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        piePlot67.setIgnoreNullValues(true);
        java.awt.Paint paint70 = piePlot67.getLabelPaint();
        java.awt.Image image71 = null;
        piePlot67.setBackgroundImage(image71);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator73 = piePlot67.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent74 = null;
        piePlot67.datasetChanged(datasetChangeEvent74);
        java.awt.Stroke stroke76 = piePlot67.getBaseSectionOutlineStroke();
        java.awt.Paint paint79 = piePlot67.lookupSectionPaint((java.lang.Comparable) 0.4d, false);
        piePlot52.setShadowPaint(paint79);
        piePlot35.setLabelShadowPaint(paint79);
        piePlot1.setOutlinePaint(paint79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot44", piePlot1.equals(piePlot44) ? piePlot1.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot18.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot18.getSimpleLabelOffset();
        piePlot13.setInsets(rectangleInsets23);
        piePlot1.setInsets(rectangleInsets23, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = null;
        piePlot1.setURLGenerator(pieURLGenerator27);
        double double29 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        piePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot31.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getStartAngle();
        java.awt.Stroke stroke40 = piePlot37.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint42 = piePlot37.getSectionPaint((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        java.awt.Paint paint50 = piePlot44.getLabelShadowPaint();
        piePlot44.setShadowXOffset(90.0d);
        piePlot44.setForegroundAlpha(10.0f);
        piePlot44.setCircular(true, false);
        java.awt.Paint paint58 = piePlot44.getLabelPaint();
        piePlot37.setShadowPaint(paint58);
        piePlot31.setNoDataMessagePaint(paint58);
        piePlot1.setLabelShadowPaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot31", piePlot18.equals(piePlot31) ? piePlot18.hashCode() == piePlot31.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setInteriorGap(0.08d);
        java.awt.Stroke stroke8 = null;
        piePlot1.setOutlineStroke(stroke8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getShadowYOffset();
        java.awt.Image image13 = piePlot11.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot11.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Image image18 = null;
        piePlot11.setBackgroundImage(image18);
        java.awt.Stroke stroke22 = piePlot11.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float23 = piePlot11.getForegroundAlpha();
        java.awt.Paint paint24 = piePlot11.getLabelPaint();
        double double25 = piePlot11.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        java.awt.Image image32 = null;
        piePlot28.setBackgroundImage(image32);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator34 = null;
        piePlot28.setToolTipGenerator(pieToolTipGenerator34);
        boolean boolean36 = piePlot28.getIgnoreNullValues();
        java.awt.Paint paint37 = piePlot28.getLabelPaint();
        piePlot11.setSectionOutlinePaint((java.lang.Comparable) (short) 0, paint37);
        piePlot1.setBackgroundPaint(paint37);
        piePlot1.setPieIndex((int) 'a');
        double double43 = piePlot1.getExplodePercent((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        piePlot45.setIgnoreNullValues(true);
        java.awt.Paint paint48 = piePlot45.getLabelPaint();
        boolean boolean49 = piePlot45.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot50 = piePlot45.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent51 = null;
        piePlot45.axisChanged(axisChangeEvent51);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier53 = piePlot45.getDrawingSupplier();
        java.awt.Stroke stroke54 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot45.setOutlineStroke(stroke54);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator56 = null;
        piePlot45.setURLGenerator(pieURLGenerator56);
        piePlot45.setIgnoreNullValues(true);
        java.awt.Paint paint60 = piePlot45.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset61 = null;
        org.jfree.chart.plot.PiePlot piePlot62 = new org.jfree.chart.plot.PiePlot(pieDataset61);
        java.awt.Stroke stroke64 = null;
        piePlot62.setSectionOutlineStroke((java.lang.Comparable) '#', stroke64);
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator68 = piePlot67.getLegendLabelGenerator();
        java.awt.Stroke stroke70 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot67.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke70);
        piePlot67.setLabelGap((double) 0);
        piePlot67.setStartAngle((double) (-1.0f));
        java.awt.Paint paint76 = piePlot67.getLabelBackgroundPaint();
        piePlot62.setNoDataMessagePaint(paint76);
        piePlot45.setBackgroundPaint(paint76);
        piePlot1.setNoDataMessagePaint(paint76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator5 and pieSectionLabelGenerator68", pieSectionLabelGenerator5.equals(pieSectionLabelGenerator68) ? pieSectionLabelGenerator5.hashCode() == pieSectionLabelGenerator68.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        boolean boolean6 = piePlot1.isSubplot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setURLGenerator(pieURLGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot10.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot10", piePlot1.equals(piePlot10) ? piePlot1.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getInteriorGap();
        piePlot1.setSimpleLabels(true);
        boolean boolean7 = piePlot1.getLabelLinksVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot1.axisChanged(axisChangeEvent8);
        org.jfree.chart.plot.Plot plot10 = piePlot1.getParent();
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
        piePlot1.setBaseSectionPaint(paint40);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        piePlot45.setIgnoreNullValues(true);
        java.awt.Paint paint48 = piePlot45.getLabelPaint();
        boolean boolean49 = piePlot45.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot50 = piePlot45.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent51 = null;
        piePlot45.axisChanged(axisChangeEvent51);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        java.awt.Paint paint57 = piePlot54.getLabelPaint();
        piePlot45.setBaseSectionPaint(paint57);
        org.jfree.data.general.DatasetGroup datasetGroup59 = piePlot45.getDatasetGroup();
        java.awt.Paint paint60 = piePlot45.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator61 = piePlot45.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator2 and pieSectionLabelGenerator61", pieSectionLabelGenerator2.equals(pieSectionLabelGenerator61) ? pieSectionLabelGenerator2.hashCode() == pieSectionLabelGenerator61.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        float float15 = piePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint16 = piePlot1.getLabelLinkPaint();
        java.awt.Paint paint18 = piePlot1.getSectionPaint((java.lang.Comparable) 0L);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getShadowYOffset();
        java.awt.Stroke stroke30 = piePlot27.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot20.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke30);
        piePlot20.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke34 = piePlot20.getLabelOutlineStroke();
        boolean boolean35 = piePlot1.equals((java.lang.Object) piePlot20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot27", piePlot12.equals(piePlot27) ? piePlot12.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = piePlot12.getLabelShadowPaint();
        java.awt.Paint paint21 = piePlot12.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setLabelOutlinePaint(paint21);
        piePlot1.zoom(1.0d);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        double double27 = piePlot26.getShadowYOffset();
        java.awt.Stroke stroke29 = piePlot26.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot26.setLegendLabelURLGenerator(pieURLGenerator30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        piePlot26.setOutlinePaint(paint36);
        piePlot1.setBaseSectionOutlinePaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot33", piePlot12.equals(piePlot33) ? piePlot12.hashCode() == piePlot33.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        java.awt.Paint paint57 = piePlot1.lookupSectionPaint((java.lang.Comparable) '4', false);
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        double double60 = piePlot59.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent61 = null;
        piePlot59.notifyListeners(plotChangeEvent61);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = piePlot59.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = piePlot59.getSimpleLabelOffset();
        java.awt.Paint paint65 = piePlot59.getLabelBackgroundPaint();
        float float66 = piePlot59.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = piePlot59.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets67);
        java.awt.Paint paint71 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 90.0d, false);
        piePlot1.setIgnoreNullValues(false);
        org.jfree.data.general.PieDataset pieDataset74 = null;
        org.jfree.chart.plot.PiePlot piePlot75 = new org.jfree.chart.plot.PiePlot(pieDataset74);
        piePlot75.setIgnoreNullValues(true);
        java.awt.Paint paint78 = piePlot75.getLabelPaint();
        boolean boolean79 = piePlot75.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot80 = piePlot75.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent81 = null;
        piePlot75.axisChanged(axisChangeEvent81);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier83 = piePlot75.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset84 = null;
        piePlot75.setDataset(pieDataset84);
        org.jfree.data.general.PieDataset pieDataset86 = null;
        org.jfree.chart.plot.PiePlot piePlot87 = new org.jfree.chart.plot.PiePlot(pieDataset86);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator88 = piePlot87.getLegendLabelGenerator();
        piePlot75.setLabelGenerator(pieSectionLabelGenerator88);
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot43 and piePlot75", piePlot43.equals(piePlot75) ? piePlot43.hashCode() == piePlot75.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.jfree.data.general.PieDataset pieDataset12 = piePlot1.getDataset();
        java.awt.Paint paint13 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        piePlot15.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot15.getSimpleLabelOffset();
        boolean boolean20 = piePlot15.getIgnoreNullValues();
        java.awt.Image image21 = piePlot15.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot28 = piePlot23.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        piePlot23.axisChanged(axisChangeEvent29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = piePlot23.getDrawingSupplier();
        piePlot15.setDrawingSupplier(drawingSupplier31);
        piePlot1.setDrawingSupplier(drawingSupplier31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot23", piePlot1.equals(piePlot23) ? piePlot1.hashCode() == piePlot23.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        piePlot1.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getShadowYOffset();
        java.awt.Image image13 = piePlot11.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot11.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Image image18 = null;
        piePlot11.setBackgroundImage(image18);
        java.awt.Stroke stroke22 = piePlot11.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float23 = piePlot11.getForegroundAlpha();
        java.awt.Paint paint24 = piePlot11.getLabelPaint();
        double double25 = piePlot11.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        java.awt.Paint paint31 = piePlot28.getLabelPaint();
        java.awt.Image image32 = null;
        piePlot28.setBackgroundImage(image32);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator34 = null;
        piePlot28.setToolTipGenerator(pieToolTipGenerator34);
        boolean boolean36 = piePlot28.getIgnoreNullValues();
        java.awt.Paint paint37 = piePlot28.getLabelPaint();
        piePlot11.setSectionOutlinePaint((java.lang.Comparable) (short) 0, paint37);
        piePlot1.setLabelPaint(paint37);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.setIgnoreNullValues(true);
        java.awt.Paint paint44 = piePlot41.getLabelPaint();
        java.awt.Image image45 = null;
        piePlot41.setBackgroundImage(image45);
        java.awt.Paint paint47 = piePlot41.getLabelShadowPaint();
        piePlot41.setShadowXOffset(90.0d);
        piePlot41.setForegroundAlpha(10.0f);
        piePlot41.setCircular(true, false);
        double double55 = piePlot41.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent59 = null;
        piePlot57.notifyListeners(plotChangeEvent59);
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot57.getSimpleLabelOffset();
        java.awt.Font font62 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot57.setNoDataMessageFont(font62);
        piePlot41.setLabelFont(font62);
        java.awt.Font font65 = piePlot41.getLabelFont();
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        piePlot67.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo72 = null;
        piePlot67.handleClick((int) (byte) 0, 100, plotRenderingInfo72);
        java.awt.Paint paint74 = piePlot67.getBaseSectionPaint();
        java.awt.Image image75 = null;
        piePlot67.setBackgroundImage(image75);
        org.jfree.chart.util.RectangleInsets rectangleInsets77 = piePlot67.getLabelPadding();
        piePlot41.setLabelPadding(rectangleInsets77);
        java.awt.Paint paint79 = piePlot41.getLabelShadowPaint();
        piePlot1.setLabelLinkPaint(paint79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot28 and piePlot67", piePlot28.equals(piePlot67) ? piePlot28.hashCode() == piePlot67.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        piePlot1.setCircular(true, false);
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
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        java.awt.Image image52 = null;
        piePlot48.setBackgroundImage(image52);
        java.awt.Paint paint54 = piePlot48.getLabelShadowPaint();
        piePlot48.setShadowXOffset(90.0d);
        piePlot48.setForegroundAlpha(10.0f);
        piePlot48.setCircular(true, false);
        double double62 = piePlot48.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor63 = piePlot48.getLabelDistributor();
        piePlot31.setLabelDistributor(abstractPieLabelDistributor63);
        java.awt.Font font65 = piePlot31.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot38", piePlot11.equals(piePlot38) ? piePlot11.hashCode() == piePlot38.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        boolean boolean25 = piePlot21.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot26 = piePlot21.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        piePlot21.axisChanged(axisChangeEvent27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = piePlot21.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        piePlot21.setDataset(pieDataset30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getShadowYOffset();
        java.awt.Stroke stroke36 = piePlot33.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot21.setBaseSectionOutlineStroke(stroke36);
        piePlot21.setOutlineVisible(false);
        java.awt.Stroke stroke40 = piePlot21.getBaseSectionOutlineStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 1.0E-5d, stroke40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier29", drawingSupplier9.equals(drawingSupplier29) ? drawingSupplier9.hashCode() == drawingSupplier29.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        piePlot42.handleClick((int) (byte) 0, 100, plotRenderingInfo47);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent49 = null;
        piePlot42.datasetChanged(datasetChangeEvent49);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        boolean boolean56 = piePlot52.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator57 = null;
        piePlot52.setToolTipGenerator(pieToolTipGenerator57);
        java.awt.Paint paint60 = piePlot52.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        piePlot42.setLabelOutlinePaint(paint60);
        piePlot17.setLabelLinkPaint(paint60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot32 and piePlot52", piePlot32.equals(piePlot52) ? piePlot32.hashCode() == piePlot52.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        java.awt.Paint paint27 = null;
        piePlot1.setShadowPaint(paint27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getShadowYOffset();
        java.awt.Stroke stroke33 = piePlot30.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot30.getLegendLabelGenerator();
        java.awt.Paint paint35 = piePlot30.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot37.getSimpleLabelOffset();
        piePlot37.setNoDataMessage("Pie Plot");
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        java.awt.Image image47 = null;
        piePlot43.setBackgroundImage(image47);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = null;
        piePlot43.setToolTipGenerator(pieToolTipGenerator49);
        boolean boolean51 = piePlot43.getIgnoreNullValues();
        java.awt.Stroke stroke52 = piePlot43.getLabelOutlineStroke();
        piePlot37.setBaseSectionOutlineStroke(stroke52);
        piePlot30.setLabelLinkStroke(stroke52);
        piePlot1.setLabelLinkStroke(stroke52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot30", piePlot11.equals(piePlot30) ? piePlot11.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        java.awt.Stroke stroke38 = piePlot17.getLabelOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = piePlot17.getDrawingSupplier();
        java.awt.Paint paint41 = piePlot17.getSectionOutlinePaint((java.lang.Comparable) '#');
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        java.awt.Image image47 = null;
        piePlot43.setBackgroundImage(image47);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = null;
        piePlot43.setToolTipGenerator(pieToolTipGenerator49);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        piePlot43.setDataset(pieDataset51);
        boolean boolean53 = piePlot43.getLabelLinksVisible();
        piePlot43.setIgnoreZeroValues(true);
        java.awt.Paint paint58 = piePlot43.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 1, false);
        piePlot17.setBaseSectionOutlinePaint(paint58);
        piePlot1.setShadowPaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot32", piePlot1.equals(piePlot32) ? piePlot1.hashCode() == piePlot32.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.lang.Object obj8 = piePlot1.clone();
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj8", piePlot1.equals(obj8) ? piePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        piePlot1.setIgnoreNullValues(true);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getShadowYOffset();
        java.awt.Stroke stroke30 = piePlot27.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot27.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        java.awt.Image image38 = null;
        piePlot34.setBackgroundImage(image38);
        java.awt.Paint paint40 = piePlot34.getLabelShadowPaint();
        piePlot34.setLabelGap(0.0d);
        java.awt.Paint paint43 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot34.setLabelLinkPaint(paint43);
        piePlot27.setLabelPaint(paint43);
        float float46 = piePlot27.getBackgroundAlpha();
        boolean boolean47 = piePlot27.isOutlineVisible();
        java.lang.String str48 = piePlot27.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        piePlot50.setIgnoreNullValues(true);
        java.awt.Paint paint53 = piePlot50.getLabelPaint();
        boolean boolean54 = piePlot50.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot55 = piePlot50.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent56 = null;
        piePlot50.axisChanged(axisChangeEvent56);
        java.lang.String str58 = piePlot50.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent59 = null;
        piePlot50.datasetChanged(datasetChangeEvent59);
        org.jfree.chart.LegendItemCollection legendItemCollection61 = piePlot50.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = piePlot50.getSimpleLabelOffset();
        piePlot27.setParent((org.jfree.chart.plot.Plot) piePlot50);
        boolean boolean64 = piePlot1.equals((java.lang.Object) piePlot27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot34", piePlot8.equals(piePlot34) ? piePlot8.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot10.setToolTipGenerator(pieToolTipGenerator15);
        double double17 = piePlot10.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        double double20 = piePlot19.getStartAngle();
        java.awt.Stroke stroke22 = piePlot19.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint24 = piePlot19.getSectionPaint((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        java.awt.Image image30 = null;
        piePlot26.setBackgroundImage(image30);
        java.awt.Paint paint32 = piePlot26.getLabelShadowPaint();
        piePlot26.setShadowXOffset(90.0d);
        piePlot26.setForegroundAlpha(10.0f);
        piePlot26.setCircular(true, false);
        java.awt.Paint paint40 = piePlot26.getLabelPaint();
        piePlot19.setShadowPaint(paint40);
        java.awt.Stroke stroke43 = piePlot19.lookupSectionOutlineStroke((java.lang.Comparable) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot19.getSimpleLabelOffset();
        java.awt.Paint paint47 = piePlot19.lookupSectionOutlinePaint((java.lang.Comparable) (short) 100, true);
        piePlot10.setBackgroundPaint(paint47);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator49 = piePlot10.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot4 and piePlot10", piePlot4.equals(piePlot10) ? piePlot4.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        piePlot1.setLabelLinkMargin((double) 0.0f);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getShadowYOffset();
        java.awt.Stroke stroke26 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot23.getLegendLabelGenerator();
        piePlot23.setInteriorGap(0.08d);
        piePlot23.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getStartAngle();
        java.awt.Stroke stroke36 = piePlot33.getSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot38.getSimpleLabelOffset();
        piePlot33.setInsets(rectangleInsets40);
        piePlot23.setInsets(rectangleInsets40);
        piePlot1.setInsets(rectangleInsets40, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot38", piePlot12.equals(piePlot38) ? piePlot12.hashCode() == piePlot38.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        double double41 = piePlot40.getShadowYOffset();
        java.awt.Stroke stroke43 = piePlot40.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = null;
        piePlot40.setLegendLabelURLGenerator(pieURLGenerator44);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        piePlot47.setIgnoreNullValues(true);
        java.awt.Paint paint50 = piePlot47.getLabelPaint();
        piePlot40.setOutlinePaint(paint50);
        piePlot40.setLabelLinkMargin((double) 100L);
        java.awt.Paint paint54 = piePlot40.getBaseSectionPaint();
        piePlot1.setBaseSectionOutlinePaint(paint54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot47", piePlot22.equals(piePlot47) ? piePlot22.hashCode() == piePlot47.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        boolean boolean18 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot14.setToolTipGenerator(pieToolTipGenerator19);
        java.awt.Paint paint22 = piePlot14.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot24.getSimpleLabelOffset();
        boolean boolean30 = piePlot14.equals((java.lang.Object) rectangleInsets29);
        double double31 = piePlot14.getLabelLinkMargin();
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
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot33.getLabelPadding();
        piePlot14.setInsets(rectangleInsets43, false);
        piePlot1.setLabelPadding(rectangleInsets43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot33", piePlot1.equals(piePlot33) ? piePlot1.hashCode() == piePlot33.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getShadowYOffset();
        java.awt.Stroke stroke25 = piePlot22.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot22.setInteriorGap((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot22.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        java.awt.Paint paint33 = piePlot30.getLabelPaint();
        java.awt.Image image34 = null;
        piePlot30.setBackgroundImage(image34);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = null;
        piePlot30.setToolTipGenerator(pieToolTipGenerator36);
        boolean boolean38 = piePlot30.getIgnoreNullValues();
        java.awt.Paint paint39 = piePlot30.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = piePlot41.getLegendLabelGenerator();
        piePlot30.setLegendLabelGenerator(pieSectionLabelGenerator42);
        piePlot22.setLegendLabelToolTipGenerator(pieSectionLabelGenerator42);
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator13 and pieSectionLabelGenerator42", pieSectionLabelGenerator13.equals(pieSectionLabelGenerator42) ? pieSectionLabelGenerator13.hashCode() == pieSectionLabelGenerator42.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        piePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        java.awt.Stroke stroke10 = piePlot1.getLabelOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = piePlot1.getLegendItems();
        piePlot1.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        boolean boolean20 = piePlot16.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = null;
        piePlot16.setToolTipGenerator(pieToolTipGenerator21);
        double double23 = piePlot16.getShadowXOffset();
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
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot25.getLabelPadding();
        piePlot16.setInsets(rectangleInsets37);
        piePlot1.setLabelPadding(rectangleInsets37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot25", piePlot1.equals(piePlot25) ? piePlot1.hashCode() == piePlot25.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint5 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 97);
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
        piePlot9.setExplodePercent((java.lang.Comparable) 100, (double) (short) 10);
        double double33 = piePlot9.getExplodePercent((java.lang.Comparable) 0);
        java.awt.Stroke stroke34 = piePlot9.getBaseSectionOutlineStroke();
        piePlot1.setLabelLinkStroke(stroke34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot20", piePlot1.equals(piePlot20) ? piePlot1.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        double double7 = piePlot1.getLabelGap();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot9.handleClick((int) (byte) 0, 100, plotRenderingInfo14);
        java.awt.Paint paint16 = piePlot9.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Paint paint22 = piePlot18.getNoDataMessagePaint();
        piePlot9.setLabelBackgroundPaint(paint22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = null;
        piePlot9.setURLGenerator(pieURLGenerator24);
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = piePlot9.getArcBounds(rectangle2D26, rectangle2D27, (double) (byte) -1, (double) (short) 1, (double) (short) 0);
        org.jfree.chart.util.Rotation rotation32 = piePlot9.getDirection();
        piePlot1.setDirection(rotation32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot18", piePlot1.equals(piePlot18) ? piePlot1.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        java.awt.Image image50 = null;
        piePlot46.setBackgroundImage(image50);
        java.awt.Paint paint52 = piePlot46.getLabelShadowPaint();
        piePlot46.setLabelGap(0.0d);
        float float55 = piePlot46.getForegroundAlpha();
        boolean boolean56 = piePlot46.getIgnoreZeroValues();
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        piePlot46.removeChangeListener(plotChangeListener57);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = piePlot46.getDrawingSupplier();
        piePlot46.setLabelLinksVisible(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator62 = piePlot46.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset63 = null;
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot(pieDataset63);
        piePlot64.setIgnoreNullValues(true);
        java.awt.Paint paint67 = piePlot64.getLabelPaint();
        java.awt.Image image68 = null;
        piePlot64.setBackgroundImage(image68);
        java.awt.Paint paint70 = piePlot64.getLabelShadowPaint();
        piePlot64.setShadowXOffset(90.0d);
        piePlot64.setForegroundAlpha(10.0f);
        piePlot64.setCircular(true, false);
        double double78 = piePlot64.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset79 = null;
        org.jfree.chart.plot.PiePlot piePlot80 = new org.jfree.chart.plot.PiePlot(pieDataset79);
        double double81 = piePlot80.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent82 = null;
        piePlot80.notifyListeners(plotChangeEvent82);
        org.jfree.chart.util.RectangleInsets rectangleInsets84 = piePlot80.getSimpleLabelOffset();
        java.awt.Font font85 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot80.setNoDataMessageFont(font85);
        piePlot64.setLabelFont(font85);
        piePlot46.setLabelFont(font85);
        org.jfree.data.general.PieDataset pieDataset89 = null;
        org.jfree.chart.plot.PiePlot piePlot90 = new org.jfree.chart.plot.PiePlot(pieDataset89);
        double double91 = piePlot90.getShadowYOffset();
        java.awt.Image image92 = piePlot90.getBackgroundImage();
        java.awt.Paint paint94 = piePlot90.lookupSectionPaint((java.lang.Comparable) 0L);
        piePlot46.setShadowPaint(paint94);
        piePlot1.setNoDataMessagePaint(paint94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier41 and drawingSupplier59", drawingSupplier41.equals(drawingSupplier59) ? drawingSupplier41.hashCode() == drawingSupplier59.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        piePlot1.handleClick((int) '4', 15, plotRenderingInfo33);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        boolean boolean40 = piePlot36.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot41 = piePlot36.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent42 = null;
        piePlot36.axisChanged(axisChangeEvent42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = piePlot36.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        piePlot36.setDataset(pieDataset45);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator49 = piePlot48.getLegendLabelGenerator();
        piePlot36.setLabelGenerator(pieSectionLabelGenerator49);
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot48", piePlot8.equals(piePlot48) ? piePlot8.hashCode() == piePlot48.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        boolean boolean10 = piePlot1.isOutlineVisible();
        double double11 = piePlot1.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator12);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        piePlot15.setIgnoreNullValues(true);
        java.awt.Paint paint18 = piePlot15.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = null;
        piePlot15.setLegendLabelURLGenerator(pieURLGenerator19);
        java.lang.Comparable comparable22 = piePlot15.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot15.drawBackgroundImage(graphics2D23, rectangle2D24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot15.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot15", piePlot1.equals(piePlot15) ? piePlot1.hashCode() == piePlot15.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        double double6 = piePlot5.getShadowYOffset();
        java.awt.Stroke stroke8 = piePlot5.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot5.setInteriorGap((double) (short) 0);
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
        piePlot5.setLabelPaint(paint21);
        float float24 = piePlot5.getBackgroundAlpha();
        piePlot5.setShadowXOffset((double) 0L);
        int int27 = piePlot5.getBackgroundImageAlignment();
        java.awt.Paint paint30 = piePlot5.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float31 = piePlot5.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = piePlot33.getLabelShadowPaint();
        piePlot33.setShadowXOffset(90.0d);
        piePlot33.setForegroundAlpha(10.0f);
        piePlot33.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        java.awt.Image image52 = null;
        piePlot48.setBackgroundImage(image52);
        java.awt.Paint paint54 = piePlot48.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset55 = null;
        piePlot48.setDataset(pieDataset55);
        piePlot33.setParent((org.jfree.chart.plot.Plot) piePlot48);
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        double double60 = piePlot59.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent61 = null;
        piePlot59.notifyListeners(plotChangeEvent61);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = piePlot59.getSimpleLabelOffset();
        java.awt.Font font64 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot59.setNoDataMessageFont(font64);
        java.awt.Font font66 = piePlot59.getLabelFont();
        piePlot48.setNoDataMessageFont(font66);
        piePlot5.setNoDataMessageFont(font66);
        piePlot1.setNoDataMessageFont(font66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot59", piePlot1.equals(piePlot59) ? piePlot1.hashCode() == piePlot59.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        piePlot1.setBackgroundAlpha((float) (-1));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot1.notifyListeners(plotChangeEvent18);
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
        piePlot1.setBaseSectionPaint(paint35);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        java.awt.Paint paint42 = piePlot39.getLabelPaint();
        java.awt.Image image43 = null;
        piePlot39.setBackgroundImage(image43);
        java.awt.Paint paint45 = piePlot39.getLabelShadowPaint();
        piePlot39.setShadowXOffset(90.0d);
        piePlot39.setForegroundAlpha(10.0f);
        piePlot39.setCircular(true, false);
        double double53 = piePlot39.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot39.setSimpleLabelOffset(rectangleInsets54);
        piePlot39.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        java.awt.Stroke stroke62 = null;
        piePlot60.setSectionOutlineStroke((java.lang.Comparable) '#', stroke62);
        org.jfree.data.general.PieDataset pieDataset64 = null;
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot(pieDataset64);
        double double66 = piePlot65.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent67 = null;
        piePlot65.notifyListeners(plotChangeEvent67);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator69 = piePlot65.getToolTipGenerator();
        java.awt.Paint paint70 = piePlot65.getNoDataMessagePaint();
        piePlot65.setLabelGap(0.0d);
        java.awt.Paint paint75 = piePlot65.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot60.setLabelPaint(paint75);
        java.awt.Paint paint77 = piePlot60.getLabelLinkPaint();
        piePlot60.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset80 = null;
        org.jfree.chart.plot.PiePlot piePlot81 = new org.jfree.chart.plot.PiePlot(pieDataset80);
        piePlot81.setIgnoreNullValues(true);
        java.awt.Paint paint84 = piePlot81.getLabelPaint();
        java.awt.Image image85 = null;
        piePlot81.setBackgroundImage(image85);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator87 = null;
        piePlot81.setToolTipGenerator(pieToolTipGenerator87);
        boolean boolean89 = piePlot81.getIgnoreZeroValues();
        java.awt.Paint paint90 = piePlot81.getShadowPaint();
        piePlot60.setLabelPaint(paint90);
        piePlot39.setLabelShadowPaint(paint90);
        piePlot1.setSectionPaint((java.lang.Comparable) 0.5f, paint90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot21 and piePlot81", piePlot21.equals(piePlot81) ? piePlot21.hashCode() == piePlot81.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        java.lang.Comparable comparable38 = piePlot16.getSectionKey((int) '#');
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = null;
        piePlot16.setLegendLabelURLGenerator(pieURLGenerator39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getShadowYOffset();
        java.awt.Stroke stroke45 = piePlot42.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot42.getLegendLabelGenerator();
        piePlot42.setInteriorGap(0.08d);
        piePlot42.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        double double53 = piePlot52.getStartAngle();
        java.awt.Stroke stroke55 = piePlot52.getSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        double double58 = piePlot57.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot57.getSimpleLabelOffset();
        piePlot52.setInsets(rectangleInsets59);
        piePlot42.setInsets(rectangleInsets59);
        piePlot16.setInsets(rectangleInsets59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot27 and piePlot57", piePlot27.equals(piePlot57) ? piePlot27.hashCode() == piePlot57.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        java.awt.Paint paint20 = piePlot17.getLabelPaint();
        boolean boolean21 = piePlot17.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = null;
        piePlot17.setToolTipGenerator(pieToolTipGenerator22);
        double double24 = piePlot17.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot17.getLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot17", piePlot1.equals(piePlot17) ? piePlot1.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        java.awt.Paint paint28 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0.5f);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        java.awt.Paint paint33 = piePlot30.getLabelPaint();
        java.awt.Image image34 = null;
        piePlot30.setBackgroundImage(image34);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = null;
        piePlot30.setToolTipGenerator(pieToolTipGenerator36);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        java.awt.Paint paint44 = piePlot40.getNoDataMessagePaint();
        piePlot30.setSectionPaint((java.lang.Comparable) 0, paint44);
        java.awt.Paint paint48 = piePlot30.lookupSectionOutlinePaint((java.lang.Comparable) '4', false);
        piePlot1.setLabelLinkPaint(paint48);
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        piePlot51.setIgnoreNullValues(true);
        java.awt.Paint paint54 = piePlot51.getLabelPaint();
        boolean boolean55 = piePlot51.getIgnoreZeroValues();
        java.awt.Shape shape56 = piePlot51.getLegendItemShape();
        piePlot1.setLegendItemShape(shape56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot40 and piePlot51", piePlot40.equals(piePlot51) ? piePlot40.hashCode() == piePlot51.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        java.awt.Paint paint17 = piePlot11.getLabelShadowPaint();
        piePlot11.setShadowXOffset(90.0d);
        piePlot11.setForegroundAlpha(10.0f);
        piePlot11.setCircular(true, false);
        double double25 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot11.setSimpleLabelOffset(rectangleInsets26);
        piePlot11.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        java.awt.Stroke stroke34 = null;
        piePlot32.setSectionOutlineStroke((java.lang.Comparable) '#', stroke34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        piePlot37.notifyListeners(plotChangeEvent39);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator41 = piePlot37.getToolTipGenerator();
        java.awt.Paint paint42 = piePlot37.getNoDataMessagePaint();
        piePlot37.setLabelGap(0.0d);
        java.awt.Paint paint47 = piePlot37.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot32.setLabelPaint(paint47);
        java.awt.Paint paint49 = piePlot32.getLabelLinkPaint();
        piePlot32.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        piePlot53.setIgnoreNullValues(true);
        java.awt.Paint paint56 = piePlot53.getLabelPaint();
        java.awt.Image image57 = null;
        piePlot53.setBackgroundImage(image57);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator59 = null;
        piePlot53.setToolTipGenerator(pieToolTipGenerator59);
        boolean boolean61 = piePlot53.getIgnoreZeroValues();
        java.awt.Paint paint62 = piePlot53.getShadowPaint();
        piePlot32.setLabelPaint(paint62);
        piePlot11.setLabelShadowPaint(paint62);
        java.awt.Paint paint67 = piePlot11.lookupSectionPaint((java.lang.Comparable) '4', false);
        piePlot1.setLabelPaint(paint67);
        piePlot1.setIgnoreNullValues(false);
        org.jfree.data.general.PieDataset pieDataset71 = null;
        org.jfree.chart.plot.PiePlot piePlot72 = new org.jfree.chart.plot.PiePlot(pieDataset71);
        piePlot72.setIgnoreNullValues(true);
        java.awt.Paint paint75 = piePlot72.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent76 = null;
        piePlot72.datasetChanged(datasetChangeEvent76);
        org.jfree.chart.util.RectangleInsets rectangleInsets78 = piePlot72.getLabelPadding();
        piePlot1.setInsets(rectangleInsets78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot53 and piePlot72", piePlot53.equals(piePlot72) ? piePlot53.hashCode() == piePlot72.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        float float7 = piePlot1.getBackgroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        piePlot11.datasetChanged(datasetChangeEvent15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getLabelPadding();
        boolean boolean18 = piePlot1.equals((java.lang.Object) rectangleInsets17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot11", piePlot1.equals(piePlot11) ? piePlot1.hashCode() == piePlot11.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        java.lang.String str13 = piePlot1.getNoDataMessage();
        boolean boolean14 = piePlot1.isOutlineVisible();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot1.getLabelDistributor();
        boolean boolean16 = piePlot1.getSimpleLabels();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot18.setToolTipGenerator(pieToolTipGenerator24);
        boolean boolean26 = piePlot18.getIgnoreNullValues();
        java.awt.Paint paint27 = piePlot18.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot29.getLegendLabelGenerator();
        piePlot18.setLegendLabelGenerator(pieSectionLabelGenerator30);
        piePlot18.setBackgroundImageAlignment((int) (byte) 1);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot18.getLabelDistributor();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        piePlot18.notifyListeners(plotChangeEvent35);
        java.awt.Paint paint37 = piePlot18.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot39.getSimpleLabelOffset();
        piePlot39.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot39.getLabelPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot39.getInsets();
        piePlot18.setSimpleLabelOffset(rectangleInsets45);
        piePlot1.setLabelPadding(rectangleInsets45);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        double double51 = piePlot50.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        piePlot50.notifyListeners(plotChangeEvent52);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot50.getSimpleLabelOffset();
        boolean boolean55 = piePlot50.getIgnoreNullValues();
        piePlot50.setForegroundAlpha((float) 1);
        java.awt.Paint paint58 = piePlot50.getBackgroundPaint();
        java.awt.Paint paint59 = piePlot50.getBackgroundPaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 10.0d, paint59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot29 and piePlot50", piePlot29.equals(piePlot50) ? piePlot29.hashCode() == piePlot50.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.util.Rotation rotation9 = piePlot1.getDirection();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot1.getURLGenerator();
        java.lang.Object obj11 = piePlot1.clone();
        float float12 = piePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj11", piePlot1.equals(obj11) ? piePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
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
        double double26 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        piePlot28.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        piePlot28.handleClick((int) (byte) 0, 100, plotRenderingInfo33);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        piePlot28.setLabelBackgroundPaint(paint39);
        java.awt.Paint paint41 = piePlot28.getBaseSectionOutlinePaint();
        piePlot1.setLabelBackgroundPaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot28", piePlot8.equals(piePlot28) ? piePlot8.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getOutlinePaint();
        java.awt.Stroke stroke9 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = null;
        piePlot11.setLegendLabelURLGenerator(pieURLGenerator15);
        java.lang.Comparable comparable18 = piePlot11.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot11.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot11.getLabelDistributor();
        java.awt.Paint paint24 = piePlot11.getSectionPaint((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot26.handleClick((int) (byte) 0, 100, plotRenderingInfo31);
        java.awt.Paint paint33 = piePlot26.getBaseSectionPaint();
        java.awt.Image image34 = null;
        piePlot26.setBackgroundImage(image34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot26.getLabelPadding();
        piePlot11.setInsets(rectangleInsets36, false);
        org.jfree.chart.LegendItemCollection legendItemCollection39 = piePlot11.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent40 = null;
        piePlot11.axisChanged(axisChangeEvent40);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor42 = piePlot11.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        piePlot44.setIgnoreNullValues(true);
        java.awt.Paint paint47 = piePlot44.getLabelPaint();
        java.awt.Image image48 = null;
        piePlot44.setBackgroundImage(image48);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator50 = null;
        piePlot44.setToolTipGenerator(pieToolTipGenerator50);
        boolean boolean52 = piePlot44.getIgnoreNullValues();
        java.awt.Stroke stroke53 = piePlot44.getLabelOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent54 = null;
        piePlot44.axisChanged(axisChangeEvent54);
        piePlot44.setNoDataMessage("hi!");
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator60 = piePlot59.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot59.getInsets();
        double double62 = piePlot59.getInteriorGap();
        org.jfree.chart.util.Rotation rotation63 = piePlot59.getDirection();
        piePlot44.setDirection(rotation63);
        piePlot11.setDirection(rotation63);
        piePlot1.setDirection(rotation63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot26", piePlot1.equals(piePlot26) ? piePlot1.hashCode() == piePlot26.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        piePlot7.datasetChanged(datasetChangeEvent11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot14.handleClick((int) (byte) 0, 100, plotRenderingInfo19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        piePlot14.setLabelBackgroundPaint(paint25);
        piePlot7.setLabelShadowPaint(paint25);
        piePlot1.setLabelBackgroundPaint(paint25);
        java.awt.Paint paint30 = null;
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) 10L, paint30);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator32);
        java.awt.Paint paint35 = piePlot1.getSectionPaint((java.lang.Comparable) 0.5f);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        boolean boolean41 = piePlot37.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot42 = piePlot37.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent43 = null;
        piePlot37.axisChanged(axisChangeEvent43);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        piePlot37.setBaseSectionPaint(paint49);
        org.jfree.data.general.DatasetGroup datasetGroup51 = piePlot37.getDatasetGroup();
        boolean boolean52 = piePlot37.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        java.awt.Paint paint57 = piePlot54.getLabelPaint();
        java.awt.Image image58 = null;
        piePlot54.setBackgroundImage(image58);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator60 = null;
        piePlot54.setToolTipGenerator(pieToolTipGenerator60);
        boolean boolean62 = piePlot54.getIgnoreNullValues();
        java.awt.Paint paint63 = piePlot54.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset64 = null;
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot(pieDataset64);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator66 = piePlot65.getLegendLabelGenerator();
        piePlot54.setLegendLabelGenerator(pieSectionLabelGenerator66);
        boolean boolean68 = piePlot54.isCircular();
        piePlot54.setBackgroundImageAlignment((int) (short) 1);
        piePlot54.setShadowYOffset((double) (byte) -1);
        double double73 = piePlot54.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets74 = piePlot54.getLabelPadding();
        float float75 = piePlot54.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset76 = null;
        org.jfree.chart.plot.PiePlot piePlot77 = new org.jfree.chart.plot.PiePlot(pieDataset76);
        piePlot77.setIgnoreNullValues(true);
        java.awt.Paint paint80 = piePlot77.getLabelPaint();
        java.awt.Image image81 = null;
        piePlot77.setBackgroundImage(image81);
        java.awt.Paint paint83 = piePlot77.getLabelShadowPaint();
        piePlot77.setShadowXOffset(90.0d);
        piePlot77.setForegroundAlpha(10.0f);
        piePlot77.setCircular(true, false);
        java.awt.Paint paint91 = piePlot77.getLabelPaint();
        java.awt.Font font92 = piePlot77.getNoDataMessageFont();
        piePlot54.setNoDataMessageFont(font92);
        piePlot37.setNoDataMessageFont(font92);
        piePlot1.setLabelFont(font92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot46", piePlot22.equals(piePlot46) ? piePlot22.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        piePlot1.setSectionOutlinesVisible(false);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getShadowYOffset();
        java.awt.Image image25 = piePlot23.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = piePlot23.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot23.drawBackgroundImage(graphics2D27, rectangle2D28);
        java.awt.Image image30 = null;
        piePlot23.setBackgroundImage(image30);
        java.awt.Stroke stroke34 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float35 = piePlot23.getForegroundAlpha();
        java.awt.Paint paint36 = piePlot23.getLabelPaint();
        double double37 = piePlot23.getLabelLinkMargin();
        piePlot23.setNoDataMessage("");
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
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot(pieDataset52);
        piePlot53.setIgnoreNullValues(true);
        java.awt.Paint paint56 = piePlot53.getLabelPaint();
        java.awt.Image image57 = null;
        piePlot53.setBackgroundImage(image57);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator59 = null;
        piePlot53.setToolTipGenerator(pieToolTipGenerator59);
        piePlot53.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset63 = null;
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot(pieDataset63);
        piePlot64.setIgnoreNullValues(true);
        java.awt.Paint paint67 = piePlot64.getLabelPaint();
        boolean boolean68 = piePlot64.getIgnoreZeroValues();
        java.awt.Shape shape69 = piePlot64.getLegendItemShape();
        boolean boolean70 = piePlot53.equals((java.lang.Object) piePlot64);
        piePlot41.setParent((org.jfree.chart.plot.Plot) piePlot64);
        java.awt.Paint paint72 = piePlot64.getShadowPaint();
        piePlot23.setBackgroundPaint(paint72);
        piePlot1.setOutlinePaint(paint72);
        org.jfree.data.general.PieDataset pieDataset75 = null;
        org.jfree.chart.plot.PiePlot piePlot76 = new org.jfree.chart.plot.PiePlot(pieDataset75);
        java.awt.Stroke stroke78 = null;
        piePlot76.setSectionOutlineStroke((java.lang.Comparable) '#', stroke78);
        java.awt.Paint paint81 = piePlot76.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke82 = piePlot76.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent83 = null;
        piePlot76.markerChanged(markerChangeEvent83);
        org.jfree.data.general.PieDataset pieDataset85 = null;
        org.jfree.chart.plot.PiePlot piePlot86 = new org.jfree.chart.plot.PiePlot(pieDataset85);
        piePlot86.setIgnoreNullValues(true);
        java.awt.Paint paint89 = piePlot86.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent90 = null;
        piePlot86.datasetChanged(datasetChangeEvent90);
        org.jfree.chart.event.PlotChangeListener plotChangeListener92 = null;
        piePlot86.addChangeListener(plotChangeListener92);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator94 = piePlot86.getLabelGenerator();
        piePlot76.setLegendLabelToolTipGenerator(pieSectionLabelGenerator94);
        java.awt.Paint paint96 = piePlot76.getOutlinePaint();
        piePlot1.setLabelShadowPaint(paint96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot64 and piePlot86", piePlot64.equals(piePlot86) ? piePlot64.hashCode() == piePlot86.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        boolean boolean40 = piePlot36.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot41 = piePlot36.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent42 = null;
        piePlot36.axisChanged(axisChangeEvent42);
        piePlot36.setExplodePercent((java.lang.Comparable) 10L, (double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot36.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets47);
        double double49 = piePlot1.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        double double52 = piePlot51.getShadowYOffset();
        java.awt.Stroke stroke54 = piePlot51.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot51.setInteriorGap((double) (short) 0);
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        piePlot58.setIgnoreNullValues(true);
        java.awt.Paint paint61 = piePlot58.getLabelPaint();
        java.awt.Image image62 = null;
        piePlot58.setBackgroundImage(image62);
        java.awt.Paint paint64 = piePlot58.getLabelShadowPaint();
        piePlot58.setLabelGap(0.0d);
        java.awt.Paint paint67 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot58.setLabelLinkPaint(paint67);
        piePlot51.setLabelPaint(paint67);
        float float70 = piePlot51.getBackgroundAlpha();
        piePlot51.setShadowXOffset((double) 0L);
        int int73 = piePlot51.getBackgroundImageAlignment();
        java.awt.Paint paint76 = piePlot51.lookupSectionPaint((java.lang.Comparable) 1.0f, true);
        float float77 = piePlot51.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D78 = null;
        java.awt.geom.Rectangle2D rectangle2D79 = null;
        piePlot51.drawBackgroundImage(graphics2D78, rectangle2D79);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor81 = piePlot51.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot20 and piePlot58", piePlot20.equals(piePlot58) ? piePlot20.hashCode() == piePlot58.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot30.getLegendLabelGenerator();
        java.awt.Stroke stroke33 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot30.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke33);
        piePlot30.setLabelGap((double) 0);
        piePlot30.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        piePlot40.setIgnoreNullValues(true);
        java.awt.Paint paint43 = piePlot40.getLabelPaint();
        boolean boolean44 = piePlot40.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        double double47 = piePlot46.getShadowYOffset();
        java.awt.Image image48 = piePlot46.getBackgroundImage();
        java.awt.Stroke stroke49 = piePlot46.getLabelOutlineStroke();
        piePlot40.setLabelLinkStroke(stroke49);
        piePlot30.setBaseSectionOutlineStroke(stroke49);
        piePlot16.setOutlineStroke(stroke49);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        piePlot54.setIgnoreNullValues(true);
        java.awt.Paint paint57 = piePlot54.getLabelPaint();
        boolean boolean58 = piePlot54.getIgnoreZeroValues();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent59 = null;
        piePlot54.datasetChanged(datasetChangeEvent59);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator61 = null;
        piePlot54.setToolTipGenerator(pieToolTipGenerator61);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator63 = piePlot54.getLegendLabelURLGenerator();
        boolean boolean64 = piePlot16.equals((java.lang.Object) pieURLGenerator63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot40 and piePlot54", piePlot40.equals(piePlot54) ? piePlot40.hashCode() == piePlot54.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot1.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = null;
        piePlot11.setToolTipGenerator(pieToolTipGenerator17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        piePlot11.setDataset(pieDataset19);
        boolean boolean21 = piePlot11.getLabelLinksVisible();
        piePlot11.setIgnoreZeroValues(true);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        piePlot25.setIgnoreNullValues(true);
        java.awt.Paint paint28 = piePlot25.getLabelPaint();
        boolean boolean29 = piePlot25.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot30 = piePlot25.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        piePlot25.axisChanged(axisChangeEvent31);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        piePlot25.setBaseSectionPaint(paint37);
        piePlot25.setStartAngle((double) (byte) 0);
        java.awt.Image image41 = piePlot25.getBackgroundImage();
        java.awt.Paint paint42 = piePlot25.getLabelBackgroundPaint();
        java.lang.Object obj43 = piePlot25.clone();
        piePlot25.setBackgroundImageAlpha((float) 0L);
        boolean boolean46 = piePlot25.isSubplot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor47 = piePlot25.getLabelDistributor();
        piePlot11.setLabelDistributor(abstractPieLabelDistributor47);
        piePlot1.setLabelDistributor(abstractPieLabelDistributor47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot34", piePlot1.equals(piePlot34) ? piePlot1.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot13.notifyListeners(plotChangeEvent15);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot13.getToolTipGenerator();
        java.awt.Paint paint18 = piePlot13.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot13.getLegendLabelURLGenerator();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot13);
        java.awt.Paint paint21 = piePlot1.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        piePlot23.datasetChanged(datasetChangeEvent27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        java.awt.Paint paint33 = piePlot30.getLabelPaint();
        java.awt.Image image34 = null;
        piePlot30.setBackgroundImage(image34);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = null;
        piePlot30.setToolTipGenerator(pieToolTipGenerator36);
        boolean boolean38 = piePlot30.getIgnoreNullValues();
        java.awt.Paint paint39 = piePlot30.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = piePlot41.getLegendLabelGenerator();
        piePlot30.setLegendLabelGenerator(pieSectionLabelGenerator42);
        boolean boolean44 = piePlot30.isCircular();
        piePlot30.setBackgroundImageAlignment((int) (short) 1);
        piePlot30.setShadowYOffset((double) (byte) -1);
        double double49 = piePlot30.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = piePlot30.getLabelPadding();
        piePlot23.setInsets(rectangleInsets50, false);
        piePlot23.setShadowXOffset((double) 100);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor55 = piePlot23.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot41", piePlot13.equals(piePlot41) ? piePlot13.hashCode() == piePlot41.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        piePlot25.notifyListeners(plotChangeEvent27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot25.getSimpleLabelOffset();
        java.awt.Font font30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot25.setNoDataMessageFont(font30);
        boolean boolean32 = piePlot25.getSectionOutlinesVisible();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = piePlot25.getDrawingSupplier();
        java.awt.Paint paint35 = piePlot25.getSectionOutlinePaint((java.lang.Comparable) 0.14d);
        java.awt.Stroke stroke36 = piePlot25.getLabelLinkStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = piePlot25.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getShadowYOffset();
        java.awt.Stroke stroke42 = piePlot39.lookupSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Stroke stroke44 = piePlot39.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 100);
        piePlot25.setBaseSectionOutlineStroke(stroke44);
        piePlot1.setBaseSectionOutlineStroke(stroke44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot39", piePlot16.equals(piePlot39) ? piePlot16.hashCode() == piePlot39.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot(pieDataset1);
        double double3 = piePlot2.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        piePlot2.notifyListeners(plotChangeEvent4);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot2.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot2.getSimpleLabelOffset();
        java.awt.Paint paint8 = piePlot2.getLabelBackgroundPaint();
        float float9 = piePlot2.getBackgroundImageAlpha();
        piePlot2.setForegroundAlpha((float) (-1));
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        java.awt.Image image17 = null;
        piePlot13.setBackgroundImage(image17);
        java.awt.Paint paint19 = piePlot13.getLabelShadowPaint();
        java.awt.Paint paint22 = piePlot13.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot2.setLabelOutlinePaint(paint22);
        piePlot2.zoom(1.0d);
        piePlot2.setCircular(true, true);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot30.handleClick((int) (byte) 0, 100, plotRenderingInfo35);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent37 = null;
        piePlot30.datasetChanged(datasetChangeEvent37);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        double double41 = piePlot40.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot40.getSimpleLabelOffset();
        piePlot30.setInsets(rectangleInsets42, false);
        piePlot30.setShadowXOffset((double) (byte) 100);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        double double49 = piePlot48.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent50 = null;
        piePlot48.notifyListeners(plotChangeEvent50);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot48.getSimpleLabelOffset();
        java.awt.Font font53 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot48.setNoDataMessageFont(font53);
        piePlot30.setNoDataMessageFont(font53);
        piePlot2.setLabelFont(font53);
        piePlot0.setNoDataMessageFont(font53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot48", piePlot0.equals(piePlot48) ? piePlot0.hashCode() == piePlot48.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        boolean boolean19 = piePlot1.getLabelLinksVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        piePlot23.handleClick((int) (byte) 0, 100, plotRenderingInfo28);
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
        piePlot23.setLabelPadding(rectangleInsets41);
        piePlot1.setLabelPadding(rectangleInsets41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot36", piePlot8.equals(piePlot36) ? piePlot8.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        piePlot18.setIgnoreNullValues(true);
        java.awt.Paint paint21 = piePlot18.getLabelPaint();
        boolean boolean22 = piePlot18.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = piePlot24.getToolTipGenerator();
        java.awt.Paint paint29 = piePlot24.getNoDataMessagePaint();
        piePlot18.setLabelPaint(paint29);
        java.awt.Paint paint32 = piePlot18.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint33 = piePlot18.getLabelPaint();
        java.awt.Paint paint36 = piePlot18.lookupSectionOutlinePaint((java.lang.Comparable) (-1.0f), true);
        java.awt.Paint paint38 = piePlot18.getSectionOutlinePaint((java.lang.Comparable) false);
        piePlot18.setMaximumLabelWidth((-1.0d));
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot18.getLabelDistributor();
        boolean boolean42 = piePlot18.getSectionOutlinesVisible();
        float float43 = piePlot18.getBackgroundImageAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator44 = piePlot18.getLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot24", piePlot8.equals(piePlot24) ? piePlot8.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = piePlot1.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot20.notifyListeners(plotChangeEvent21);
        piePlot20.setLabelLinksVisible(false);
        java.awt.Paint paint25 = piePlot20.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        java.awt.Stroke stroke29 = null;
        piePlot27.setSectionOutlineStroke((java.lang.Comparable) '#', stroke29);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        piePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = piePlot32.getToolTipGenerator();
        java.awt.Paint paint37 = piePlot32.getNoDataMessagePaint();
        piePlot32.setLabelGap(0.0d);
        java.awt.Paint paint42 = piePlot32.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot27.setLabelPaint(paint42);
        java.awt.Paint paint44 = piePlot27.getLabelLinkPaint();
        piePlot27.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        piePlot48.setIgnoreNullValues(true);
        java.awt.Paint paint51 = piePlot48.getLabelPaint();
        piePlot27.setLabelShadowPaint(paint51);
        piePlot20.setLabelPaint(paint51);
        piePlot1.setLabelLinkPaint(paint51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot48", piePlot10.equals(piePlot48) ? piePlot10.hashCode() == piePlot48.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        double double20 = piePlot1.getLabelLinkMargin();
        double double21 = piePlot1.getMaximumLabelWidth();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        piePlot1.markerChanged(markerChangeEvent22);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        java.awt.Image image30 = null;
        piePlot26.setBackgroundImage(image30);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator32 = null;
        piePlot26.setToolTipGenerator(pieToolTipGenerator32);
        boolean boolean34 = piePlot26.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot26.getLegendLabelURLGenerator();
        java.awt.Paint paint36 = piePlot26.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        double double39 = piePlot38.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        piePlot38.notifyListeners(plotChangeEvent40);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot38.getSimpleLabelOffset();
        boolean boolean43 = piePlot38.getIgnoreNullValues();
        piePlot38.setForegroundAlpha((float) 1);
        double double46 = piePlot38.getStartAngle();
        boolean boolean47 = piePlot38.isOutlineVisible();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator50 = piePlot49.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot49.getInsets();
        org.jfree.chart.plot.Plot plot52 = piePlot49.getRootPlot();
        piePlot49.setShadowXOffset((double) (byte) 1);
        java.awt.Paint paint55 = piePlot49.getLabelLinkPaint();
        piePlot38.setLabelShadowPaint(paint55);
        piePlot26.setBaseSectionOutlinePaint(paint55);
        piePlot1.setSectionPaint((java.lang.Comparable) 100.0d, paint55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator13 and pieSectionLabelGenerator50", pieSectionLabelGenerator13.equals(pieSectionLabelGenerator50) ? pieSectionLabelGenerator13.hashCode() == pieSectionLabelGenerator50.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        piePlot1.setStartAngle((double) 10L);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot19.handleClick((int) (byte) 0, 100, plotRenderingInfo24);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = null;
        piePlot19.setLegendLabelToolTipGenerator(pieSectionLabelGenerator26);
        java.awt.Stroke stroke29 = piePlot19.lookupSectionOutlineStroke((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        double double32 = piePlot31.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        piePlot31.notifyListeners(plotChangeEvent33);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot31.getSimpleLabelOffset();
        java.awt.Font font36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot31.setNoDataMessageFont(font36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        piePlot39.notifyListeners(plotChangeEvent41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot39.getSimpleLabelOffset();
        java.awt.Paint paint44 = piePlot39.getLabelBackgroundPaint();
        double double45 = piePlot39.getStartAngle();
        java.awt.Paint paint46 = piePlot39.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        double double49 = piePlot48.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent50 = null;
        piePlot48.notifyListeners(plotChangeEvent50);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot48.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = piePlot48.getSimpleLabelOffset();
        java.awt.Paint paint54 = piePlot48.getLabelBackgroundPaint();
        piePlot39.setLabelShadowPaint(paint54);
        piePlot31.setLabelOutlinePaint(paint54);
        double double57 = piePlot31.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset58 = null;
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot(pieDataset58);
        piePlot59.setIgnoreNullValues(true);
        piePlot59.setNoDataMessage("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = piePlot59.getInsets();
        piePlot31.setLabelPadding(rectangleInsets64);
        piePlot19.setInsets(rectangleInsets64);
        piePlot1.setInsets(rectangleInsets64, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot19", piePlot9.equals(piePlot19) ? piePlot9.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        double double20 = piePlot1.getLabelLinkMargin();
        double double21 = piePlot1.getMaximumLabelWidth();
        java.awt.Paint paint22 = piePlot1.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        java.awt.Image image28 = null;
        piePlot24.setBackgroundImage(image28);
        java.awt.Paint paint30 = piePlot24.getLabelShadowPaint();
        piePlot24.setLabelGap(0.0d);
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot24.setLabelLinkPaint(paint33);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot(pieDataset35);
        piePlot36.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot36.getLabelPaint();
        java.awt.Image image40 = null;
        piePlot36.setBackgroundImage(image40);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator42 = null;
        piePlot36.setToolTipGenerator(pieToolTipGenerator42);
        piePlot36.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        piePlot47.setIgnoreNullValues(true);
        java.awt.Paint paint50 = piePlot47.getLabelPaint();
        boolean boolean51 = piePlot47.getIgnoreZeroValues();
        java.awt.Shape shape52 = piePlot47.getLegendItemShape();
        boolean boolean53 = piePlot36.equals((java.lang.Object) piePlot47);
        piePlot24.setParent((org.jfree.chart.plot.Plot) piePlot47);
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        double double57 = piePlot56.getShadowYOffset();
        java.awt.Image image58 = piePlot56.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator59 = piePlot56.getLegendLabelURLGenerator();
        java.awt.Font font60 = piePlot56.getNoDataMessageFont();
        piePlot47.setLabelFont(font60);
        java.awt.Stroke stroke62 = piePlot47.getLabelOutlineStroke();
        java.lang.String str63 = piePlot47.getNoDataMessage();
        double double64 = piePlot47.getShadowYOffset();
        org.jfree.data.general.DatasetGroup datasetGroup65 = piePlot47.getDatasetGroup();
        java.awt.Paint paint66 = piePlot47.getBackgroundPaint();
        piePlot1.setShadowPaint(paint66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot56", piePlot12.equals(piePlot56) ? piePlot12.hashCode() == piePlot56.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        piePlot1.addChangeListener(plotChangeListener9);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = piePlot12.getLabelShadowPaint();
        piePlot12.setShadowXOffset(90.0d);
        piePlot12.setForegroundAlpha(10.0f);
        piePlot12.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        java.awt.Paint paint33 = piePlot27.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        piePlot27.setDataset(pieDataset34);
        piePlot12.setParent((org.jfree.chart.plot.Plot) piePlot27);
        org.jfree.chart.util.Rotation rotation37 = piePlot12.getDirection();
        piePlot1.setDirection(rotation37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot27", piePlot1.equals(piePlot27) ? piePlot1.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        piePlot19.setIgnoreNullValues(true);
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        java.awt.Image image23 = null;
        piePlot19.setBackgroundImage(image23);
        java.awt.Paint paint25 = piePlot19.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        piePlot19.setDataset(pieDataset26);
        double double28 = piePlot19.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        piePlot30.notifyListeners(plotChangeEvent32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot30.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot30.getSimpleLabelOffset();
        java.awt.Paint paint36 = piePlot30.getLabelBackgroundPaint();
        piePlot19.setShadowPaint(paint36);
        piePlot1.setLabelShadowPaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot30", piePlot13.equals(piePlot30) ? piePlot13.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        org.jfree.chart.util.Rotation rotation27 = piePlot1.getDirection();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        double double30 = piePlot29.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = null;
        piePlot29.notifyListeners(plotChangeEvent31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot29.getSimpleLabelOffset();
        java.awt.Font font34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot29.setNoDataMessageFont(font34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        piePlot37.notifyListeners(plotChangeEvent39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot37.getSimpleLabelOffset();
        java.awt.Paint paint42 = piePlot37.getLabelBackgroundPaint();
        double double43 = piePlot37.getStartAngle();
        java.awt.Paint paint44 = piePlot37.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        double double47 = piePlot46.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent48 = null;
        piePlot46.notifyListeners(plotChangeEvent48);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = piePlot46.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot46.getSimpleLabelOffset();
        java.awt.Paint paint52 = piePlot46.getLabelBackgroundPaint();
        piePlot37.setLabelShadowPaint(paint52);
        piePlot29.setLabelOutlinePaint(paint52);
        double double55 = piePlot29.getMaximumLabelWidth();
        java.awt.Paint paint56 = piePlot29.getShadowPaint();
        piePlot29.setCircular(true);
        java.awt.Stroke stroke59 = piePlot29.getOutlineStroke();
        piePlot1.setLabelLinkStroke(stroke59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot46", piePlot12.equals(piePlot46) ? piePlot12.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot12.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot12.getSimpleLabelOffset();
        java.awt.Paint paint18 = piePlot12.getLabelBackgroundPaint();
        piePlot1.setShadowPaint(paint18);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        piePlot21.setShadowXOffset(90.0d);
        piePlot21.setForegroundAlpha(10.0f);
        piePlot21.setCircular(true, false);
        double double35 = piePlot21.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot21.setSimpleLabelOffset(rectangleInsets36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        java.awt.Paint paint42 = piePlot39.getLabelPaint();
        java.awt.Image image43 = null;
        piePlot39.setBackgroundImage(image43);
        java.awt.Paint paint45 = piePlot39.getLabelShadowPaint();
        piePlot39.setShadowXOffset(90.0d);
        piePlot39.setForegroundAlpha(10.0f);
        piePlot39.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        double double55 = piePlot54.getShadowYOffset();
        java.awt.Image image56 = piePlot54.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator57 = piePlot54.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        piePlot54.drawBackgroundImage(graphics2D58, rectangle2D59);
        java.awt.Image image61 = null;
        piePlot54.setBackgroundImage(image61);
        java.awt.Stroke stroke65 = piePlot54.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float66 = piePlot54.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator67 = piePlot54.getLabelGenerator();
        piePlot39.setLegendLabelToolTipGenerator(pieSectionLabelGenerator67);
        piePlot39.setForegroundAlpha((float) (byte) 100);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator71 = piePlot39.getLegendLabelToolTipGenerator();
        piePlot21.setLegendLabelGenerator(pieSectionLabelGenerator71);
        piePlot1.setLegendLabelGenerator(pieSectionLabelGenerator71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot54", piePlot12.equals(piePlot54) ? piePlot12.hashCode() == piePlot54.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.util.Rotation rotation9 = piePlot1.getDirection();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot1.getURLGenerator();
        java.lang.Object obj11 = piePlot1.clone();
        java.awt.Paint paint13 = piePlot1.lookupSectionPaint((java.lang.Comparable) 0.025d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj11", piePlot1.equals(obj11) ? piePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        piePlot58.setIgnoreNullValues(true);
        java.awt.Paint paint61 = piePlot58.getLabelPaint();
        boolean boolean62 = piePlot58.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot63 = piePlot58.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent64 = null;
        piePlot58.axisChanged(axisChangeEvent64);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier66 = piePlot58.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset67 = null;
        piePlot58.setDataset(pieDataset67);
        org.jfree.data.general.PieDataset pieDataset69 = null;
        org.jfree.chart.plot.PiePlot piePlot70 = new org.jfree.chart.plot.PiePlot(pieDataset69);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator71 = piePlot70.getLegendLabelGenerator();
        piePlot58.setLabelGenerator(pieSectionLabelGenerator71);
        double double73 = piePlot58.getLabelGap();
        piePlot58.setStartAngle((double) (byte) 0);
        java.awt.Paint paint77 = piePlot58.lookupSectionPaint((java.lang.Comparable) 100);
        piePlot1.setLabelLinkPaint(paint77);
        double double79 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset80 = null;
        org.jfree.chart.plot.PiePlot piePlot81 = new org.jfree.chart.plot.PiePlot(pieDataset80);
        double double82 = piePlot81.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent83 = null;
        piePlot81.notifyListeners(plotChangeEvent83);
        org.jfree.chart.util.RectangleInsets rectangleInsets85 = piePlot81.getSimpleLabelOffset();
        java.awt.Font font86 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot81.setNoDataMessageFont(font86);
        boolean boolean88 = piePlot81.getSectionOutlinesVisible();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier89 = piePlot81.getDrawingSupplier();
        java.awt.Paint paint91 = piePlot81.getSectionOutlinePaint((java.lang.Comparable) 0.14d);
        java.awt.Stroke stroke92 = piePlot81.getLabelLinkStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator93 = piePlot81.getURLGenerator();
        java.awt.Stroke stroke94 = piePlot81.getBaseSectionOutlineStroke();
        java.awt.Paint paint95 = piePlot81.getBaseSectionPaint();
        piePlot1.setNoDataMessagePaint(paint95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier66 and drawingSupplier89", drawingSupplier66.equals(drawingSupplier89) ? drawingSupplier66.hashCode() == drawingSupplier89.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        piePlot22.setSimpleLabels(true);
        java.awt.Paint paint25 = piePlot22.getShadowPaint();
        java.awt.Paint paint26 = piePlot22.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator32 = piePlot28.getToolTipGenerator();
        java.awt.Paint paint33 = piePlot28.getNoDataMessagePaint();
        java.awt.Paint paint35 = piePlot28.getSectionOutlinePaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot37.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset44 = null;
        piePlot37.setDataset(pieDataset44);
        double double46 = piePlot37.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot37.getLabelPadding();
        java.awt.Image image48 = null;
        piePlot37.setBackgroundImage(image48);
        double double50 = piePlot37.getShadowYOffset();
        piePlot37.setIgnoreZeroValues(true);
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot(pieDataset53);
        double double55 = piePlot54.getShadowYOffset();
        java.awt.Stroke stroke57 = piePlot54.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator58 = piePlot54.getLegendLabelGenerator();
        piePlot37.setLegendLabelGenerator(pieSectionLabelGenerator58);
        piePlot28.setLegendLabelToolTipGenerator(pieSectionLabelGenerator58);
        piePlot22.setLabelGenerator(pieSectionLabelGenerator58);
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator5 and pieSectionLabelGenerator58", pieSectionLabelGenerator5.equals(pieSectionLabelGenerator58) ? pieSectionLabelGenerator5.hashCode() == pieSectionLabelGenerator58.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        int int32 = piePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        boolean boolean38 = piePlot34.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot39 = piePlot34.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = piePlot34.getLegendLabelURLGenerator();
        int int41 = piePlot34.getPieIndex();
        piePlot34.setCircular(true);
        java.awt.Paint paint45 = piePlot34.lookupSectionOutlinePaint((java.lang.Comparable) '4');
        java.awt.Stroke stroke46 = piePlot34.getLabelOutlineStroke();
        piePlot1.setOutlineStroke(stroke46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot34", piePlot18.equals(piePlot34) ? piePlot18.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        org.jfree.data.general.PieDataset pieDataset38 = null;
        piePlot1.setDataset(pieDataset38);
        int int40 = piePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        java.awt.Image image46 = null;
        piePlot42.setBackgroundImage(image46);
        java.awt.Paint paint48 = piePlot42.getLabelShadowPaint();
        piePlot42.setShadowXOffset(90.0d);
        piePlot42.setForegroundAlpha(10.0f);
        piePlot42.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot(pieDataset56);
        piePlot57.setIgnoreNullValues(true);
        java.awt.Paint paint60 = piePlot57.getLabelPaint();
        java.awt.Image image61 = null;
        piePlot57.setBackgroundImage(image61);
        java.awt.Paint paint63 = piePlot57.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset64 = null;
        piePlot57.setDataset(pieDataset64);
        piePlot42.setParent((org.jfree.chart.plot.Plot) piePlot57);
        org.jfree.chart.util.Rotation rotation67 = piePlot42.getDirection();
        piePlot1.setDirection(rotation67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot57", piePlot22.equals(piePlot57) ? piePlot22.hashCode() == piePlot57.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        boolean boolean38 = piePlot34.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        double double42 = piePlot41.getShadowYOffset();
        java.awt.Stroke stroke44 = piePlot41.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot34.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke44);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        double double48 = piePlot47.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        piePlot47.notifyListeners(plotChangeEvent49);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot47.getSimpleLabelOffset();
        java.awt.Font font52 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot47.setNoDataMessageFont(font52);
        piePlot34.setLabelFont(font52);
        piePlot34.setMinimumArcAngleToDraw((double) 100.0f);
        java.awt.Paint paint57 = piePlot34.getLabelShadowPaint();
        java.awt.Paint paint58 = piePlot34.getShadowPaint();
        piePlot1.setLabelBackgroundPaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot41", piePlot16.equals(piePlot41) ? piePlot16.hashCode() == piePlot41.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Stroke stroke16 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot18.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot18.getSimpleLabelOffset();
        piePlot13.setInsets(rectangleInsets23);
        piePlot1.setInsets(rectangleInsets23, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = null;
        piePlot1.setURLGenerator(pieURLGenerator27);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot30.handleClick((int) (byte) 0, 100, plotRenderingInfo35);
        java.awt.Paint paint37 = piePlot30.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        piePlot39.setIgnoreNullValues(true);
        java.awt.Paint paint42 = piePlot39.getLabelPaint();
        java.awt.Paint paint43 = piePlot39.getNoDataMessagePaint();
        piePlot30.setLabelBackgroundPaint(paint43);
        piePlot1.setLabelShadowPaint(paint43);
        java.awt.Font font46 = piePlot1.getNoDataMessageFont();
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot(pieDataset47);
        double double49 = piePlot48.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        piePlot51.setIgnoreNullValues(true);
        java.awt.Paint paint54 = piePlot51.getLabelPaint();
        piePlot48.setLabelPaint(paint54);
        boolean boolean56 = piePlot48.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot(pieDataset57);
        piePlot58.setIgnoreNullValues(true);
        java.awt.Paint paint61 = piePlot58.getLabelPaint();
        java.awt.Image image62 = null;
        piePlot58.setBackgroundImage(image62);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator64 = null;
        piePlot58.setToolTipGenerator(pieToolTipGenerator64);
        boolean boolean66 = piePlot58.getIgnoreNullValues();
        java.awt.Paint paint67 = piePlot58.getLabelPaint();
        double double68 = piePlot58.getLabelLinkMargin();
        boolean boolean69 = piePlot58.isCircular();
        boolean boolean70 = piePlot58.getIgnoreZeroValues();
        piePlot58.setMaximumLabelWidth((double) 0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = piePlot58.getInsets();
        piePlot48.setInsets(rectangleInsets73);
        piePlot1.setSimpleLabelOffset(rectangleInsets73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot48", piePlot18.equals(piePlot48) ? piePlot18.hashCode() == piePlot48.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot16 = piePlot11.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        piePlot11.axisChanged(axisChangeEvent17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot11.getDrawingSupplier();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot11.setOutlineStroke(stroke20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getShadowYOffset();
        java.awt.Stroke stroke26 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot28.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot28.getSimpleLabelOffset();
        piePlot23.setInsets(rectangleInsets33);
        piePlot11.setInsets(rectangleInsets33, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = null;
        piePlot11.setURLGenerator(pieURLGenerator37);
        java.awt.Paint paint39 = piePlot11.getBaseSectionOutlinePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) (byte) 10, paint39);
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        boolean boolean47 = piePlot43.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot48 = piePlot43.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent49 = null;
        piePlot43.axisChanged(axisChangeEvent49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = piePlot43.getDrawingSupplier();
        java.awt.Stroke stroke52 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot43.setOutlineStroke(stroke52);
        java.awt.Stroke stroke54 = piePlot43.getBaseSectionOutlineStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 1.0d, stroke54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier19 and drawingSupplier51", drawingSupplier19.equals(drawingSupplier51) ? drawingSupplier19.hashCode() == drawingSupplier51.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        java.awt.Image image9 = piePlot1.getBackgroundImage();
        java.awt.Stroke stroke10 = piePlot1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        java.awt.Stroke stroke14 = null;
        piePlot12.setSectionOutlineStroke((java.lang.Comparable) '#', stroke14);
        java.awt.Paint paint17 = piePlot12.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke18 = piePlot12.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        piePlot12.markerChanged(markerChangeEvent19);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot12.datasetChanged(datasetChangeEvent21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator29 = null;
        piePlot24.setToolTipGenerator(pieToolTipGenerator29);
        java.awt.Paint paint32 = piePlot24.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        boolean boolean33 = piePlot12.equals((java.lang.Object) paint32);
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot(pieDataset34);
        double double36 = piePlot35.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        piePlot35.notifyListeners(plotChangeEvent37);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot35.getSimpleLabelOffset();
        java.awt.Font font40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot35.setNoDataMessageFont(font40);
        java.awt.Font font42 = piePlot35.getLabelFont();
        piePlot12.setNoDataMessageFont(font42);
        piePlot1.setNoDataMessageFont(font42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot35", piePlot1.equals(piePlot35) ? piePlot1.hashCode() == piePlot35.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        boolean boolean37 = piePlot33.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot38 = piePlot33.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent39 = null;
        piePlot33.axisChanged(axisChangeEvent39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = piePlot33.getDrawingSupplier();
        java.awt.Stroke stroke42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot33.setOutlineStroke(stroke42);
        org.jfree.data.general.PieDataset pieDataset44 = null;
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot(pieDataset44);
        double double46 = piePlot45.getShadowYOffset();
        java.awt.Stroke stroke48 = piePlot45.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot(pieDataset49);
        double double51 = piePlot50.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        piePlot50.notifyListeners(plotChangeEvent52);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot50.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = piePlot50.getSimpleLabelOffset();
        piePlot45.setInsets(rectangleInsets55);
        piePlot33.setInsets(rectangleInsets55, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator59 = null;
        piePlot33.setURLGenerator(pieURLGenerator59);
        double double61 = piePlot33.getInteriorGap();
        java.awt.Paint paint62 = piePlot33.getLabelPaint();
        piePlot1.setShadowPaint(paint62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot19 and piePlot50", piePlot19.equals(piePlot50) ? piePlot19.hashCode() == piePlot50.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        piePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        java.awt.Paint paint28 = piePlot22.getLabelShadowPaint();
        piePlot22.setShadowXOffset(90.0d);
        piePlot22.setForegroundAlpha(10.0f);
        piePlot22.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot37.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset44 = null;
        piePlot37.setDataset(pieDataset44);
        piePlot22.setParent((org.jfree.chart.plot.Plot) piePlot37);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot37.getLabelPadding();
        piePlot37.setMaximumLabelWidth(0.0d);
        org.jfree.data.general.PieDataset pieDataset50 = null;
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot(pieDataset50);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator52 = piePlot51.getLegendLabelGenerator();
        java.awt.Stroke stroke54 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot51.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke54);
        piePlot51.setLabelGap((double) 0);
        piePlot51.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset60 = null;
        org.jfree.chart.plot.PiePlot piePlot61 = new org.jfree.chart.plot.PiePlot(pieDataset60);
        piePlot61.setIgnoreNullValues(true);
        java.awt.Paint paint64 = piePlot61.getLabelPaint();
        boolean boolean65 = piePlot61.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        double double68 = piePlot67.getShadowYOffset();
        java.awt.Image image69 = piePlot67.getBackgroundImage();
        java.awt.Stroke stroke70 = piePlot67.getLabelOutlineStroke();
        piePlot61.setLabelLinkStroke(stroke70);
        piePlot51.setBaseSectionOutlineStroke(stroke70);
        piePlot37.setOutlineStroke(stroke70);
        piePlot1.setLabelOutlineStroke(stroke70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot67", piePlot11.equals(piePlot67) ? piePlot11.hashCode() == piePlot67.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
        double double44 = piePlot17.getExplodePercent((java.lang.Comparable) 0.4d);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot(pieDataset45);
        piePlot46.setIgnoreNullValues(true);
        java.awt.Paint paint49 = piePlot46.getLabelPaint();
        java.awt.Image image50 = null;
        piePlot46.setBackgroundImage(image50);
        java.awt.Paint paint52 = piePlot46.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        piePlot46.setDataset(pieDataset53);
        double double55 = piePlot46.getInteriorGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator56 = null;
        piePlot46.setLegendLabelURLGenerator(pieURLGenerator56);
        java.lang.String str58 = piePlot46.getNoDataMessage();
        boolean boolean59 = piePlot46.isOutlineVisible();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor60 = piePlot46.getLabelDistributor();
        java.awt.Paint paint61 = piePlot46.getLabelPaint();
        boolean boolean62 = piePlot17.equals((java.lang.Object) paint61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot32 and piePlot46", piePlot32.equals(piePlot46) ? piePlot32.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator9);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot12.getSimpleLabelOffset();
        boolean boolean17 = piePlot12.getIgnoreNullValues();
        java.lang.Comparable comparable19 = piePlot12.getSectionKey(100);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        boolean boolean25 = piePlot21.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator26 = null;
        piePlot21.setToolTipGenerator(pieToolTipGenerator26);
        double double28 = piePlot21.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        double double31 = piePlot30.getStartAngle();
        java.awt.Stroke stroke33 = piePlot30.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint35 = piePlot30.getSectionPaint((java.lang.Comparable) (short) -1);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        piePlot37.setIgnoreNullValues(true);
        java.awt.Paint paint40 = piePlot37.getLabelPaint();
        java.awt.Image image41 = null;
        piePlot37.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot37.getLabelShadowPaint();
        piePlot37.setShadowXOffset(90.0d);
        piePlot37.setForegroundAlpha(10.0f);
        piePlot37.setCircular(true, false);
        java.awt.Paint paint51 = piePlot37.getLabelPaint();
        piePlot30.setShadowPaint(paint51);
        java.awt.Stroke stroke54 = piePlot30.lookupSectionOutlineStroke((java.lang.Comparable) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = piePlot30.getSimpleLabelOffset();
        java.awt.Paint paint58 = piePlot30.lookupSectionOutlinePaint((java.lang.Comparable) (short) 100, true);
        piePlot21.setBackgroundPaint(paint58);
        java.awt.Paint paint62 = piePlot21.lookupSectionOutlinePaint((java.lang.Comparable) 90.0d, false);
        org.jfree.data.general.PieDataset pieDataset63 = null;
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot(pieDataset63);
        double double65 = piePlot64.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent66 = null;
        piePlot64.notifyListeners(plotChangeEvent66);
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = piePlot64.getSimpleLabelOffset();
        java.awt.Paint paint69 = piePlot64.getLabelBackgroundPaint();
        double double70 = piePlot64.getStartAngle();
        piePlot64.setCircular(true, false);
        piePlot64.setShadowXOffset(0.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier76 = piePlot64.getDrawingSupplier();
        piePlot21.setDrawingSupplier(drawingSupplier76);
        piePlot12.setDrawingSupplier(drawingSupplier76);
        piePlot1.setDrawingSupplier(drawingSupplier76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot21", piePlot1.equals(piePlot21) ? piePlot1.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getShadowYOffset();
        java.awt.Stroke stroke18 = piePlot15.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot15.setInteriorGap((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot15.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        java.awt.Image image27 = null;
        piePlot23.setBackgroundImage(image27);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator29 = null;
        piePlot23.setToolTipGenerator(pieToolTipGenerator29);
        boolean boolean31 = piePlot23.getIgnoreNullValues();
        java.awt.Paint paint32 = piePlot23.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot34.getLegendLabelGenerator();
        piePlot23.setLegendLabelGenerator(pieSectionLabelGenerator35);
        piePlot15.setLegendLabelToolTipGenerator(pieSectionLabelGenerator35);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot15.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot23", piePlot1.equals(piePlot23) ? piePlot1.hashCode() == piePlot23.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        float float3 = piePlot1.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot5.getLegendLabelGenerator();
        double double7 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot5.getLabelPaint();
        float float9 = piePlot5.getBackgroundAlpha();
        piePlot5.setIgnoreZeroValues(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot5.handleClick((int) (byte) 0, (int) (byte) 0, plotRenderingInfo14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        piePlot17.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        piePlot17.handleClick((int) (byte) 0, 100, plotRenderingInfo22);
        java.awt.Paint paint24 = piePlot17.getBaseSectionPaint();
        java.awt.Image image25 = null;
        piePlot17.setBackgroundImage(image25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot17.getLabelPadding();
        piePlot5.setInsets(rectangleInsets27);
        piePlot1.setInsets(rectangleInsets27, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot5", piePlot1.equals(piePlot5) ? piePlot1.hashCode() == piePlot5.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot1.getDrawingSupplier();
        java.lang.Object obj10 = piePlot1.clone();
        double double11 = piePlot1.getStartAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj10", piePlot1.equals(obj10) ? piePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        java.awt.Image image20 = null;
        piePlot16.setBackgroundImage(image20);
        java.awt.Paint paint22 = piePlot16.getLabelShadowPaint();
        piePlot16.setShadowXOffset(90.0d);
        piePlot16.setForegroundAlpha(10.0f);
        piePlot16.setCircular(true, false);
        double double30 = piePlot16.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        double double33 = piePlot32.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        piePlot32.notifyListeners(plotChangeEvent34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot32.getSimpleLabelOffset();
        java.awt.Font font37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot32.setNoDataMessageFont(font37);
        piePlot16.setLabelFont(font37);
        java.awt.Font font40 = piePlot16.getLabelFont();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        piePlot42.handleClick((int) (byte) 0, 100, plotRenderingInfo47);
        java.awt.Paint paint49 = piePlot42.getBaseSectionPaint();
        java.awt.Image image50 = null;
        piePlot42.setBackgroundImage(image50);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot42.getLabelPadding();
        piePlot16.setLabelPadding(rectangleInsets52);
        java.awt.Paint paint54 = piePlot16.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        piePlot56.setIgnoreNullValues(true);
        java.awt.Paint paint59 = piePlot56.getLabelPaint();
        java.awt.Image image60 = null;
        piePlot56.setBackgroundImage(image60);
        java.awt.Paint paint62 = piePlot56.getLabelShadowPaint();
        piePlot56.setShadowXOffset(90.0d);
        piePlot56.setForegroundAlpha(10.0f);
        piePlot56.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset70 = null;
        org.jfree.chart.plot.PiePlot piePlot71 = new org.jfree.chart.plot.PiePlot(pieDataset70);
        double double72 = piePlot71.getShadowYOffset();
        java.awt.Image image73 = piePlot71.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator74 = piePlot71.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D75 = null;
        java.awt.geom.Rectangle2D rectangle2D76 = null;
        piePlot71.drawBackgroundImage(graphics2D75, rectangle2D76);
        java.awt.Image image78 = null;
        piePlot71.setBackgroundImage(image78);
        java.awt.Stroke stroke82 = piePlot71.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        float float83 = piePlot71.getForegroundAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator84 = piePlot71.getLabelGenerator();
        piePlot56.setLegendLabelToolTipGenerator(pieSectionLabelGenerator84);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent86 = null;
        piePlot56.markerChanged(markerChangeEvent86);
        org.jfree.chart.util.RectangleInsets rectangleInsets88 = piePlot56.getLabelPadding();
        piePlot16.setSimpleLabelOffset(rectangleInsets88);
        piePlot1.setLabelPadding(rectangleInsets88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and piePlot42", piePlot1.equals(piePlot42) ? piePlot1.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot6.getLegendLabelGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot6.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke9);
        piePlot6.setLabelGap((double) 0);
        piePlot6.setStartAngle((double) (-1.0f));
        java.awt.Paint paint15 = piePlot6.getLabelBackgroundPaint();
        piePlot1.setNoDataMessagePaint(paint15);
        float float17 = piePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot19.getLegendLabelGenerator();
        double double21 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot19.getLabelPaint();
        boolean boolean23 = piePlot19.getIgnoreZeroValues();
        boolean boolean24 = piePlot1.equals((java.lang.Object) piePlot19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator7 and pieSectionLabelGenerator20", pieSectionLabelGenerator7.equals(pieSectionLabelGenerator20) ? pieSectionLabelGenerator7.hashCode() == pieSectionLabelGenerator20.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getShadowYOffset();
        java.awt.Image image19 = piePlot17.getBackgroundImage();
        piePlot17.setIgnoreZeroValues(false);
        java.awt.Paint paint22 = piePlot17.getOutlinePaint();
        piePlot1.setSectionOutlinePaint((java.lang.Comparable) (-1), paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot17", piePlot8.equals(piePlot17) ? piePlot8.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
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
        piePlot1.setMinimumArcAngleToDraw((-1.0d));
        double double19 = piePlot1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        piePlot21.setShadowXOffset(90.0d);
        piePlot21.setForegroundAlpha(10.0f);
        piePlot21.setCircular(true, false);
        double double35 = piePlot21.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot21.setSimpleLabelOffset(rectangleInsets36);
        piePlot21.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        java.awt.Stroke stroke44 = null;
        piePlot42.setSectionOutlineStroke((java.lang.Comparable) '#', stroke44);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        double double48 = piePlot47.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        piePlot47.notifyListeners(plotChangeEvent49);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator51 = piePlot47.getToolTipGenerator();
        java.awt.Paint paint52 = piePlot47.getNoDataMessagePaint();
        piePlot47.setLabelGap(0.0d);
        java.awt.Paint paint57 = piePlot47.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot42.setLabelPaint(paint57);
        java.awt.Paint paint59 = piePlot42.getLabelLinkPaint();
        piePlot42.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        piePlot63.setIgnoreNullValues(true);
        java.awt.Paint paint66 = piePlot63.getLabelPaint();
        java.awt.Image image67 = null;
        piePlot63.setBackgroundImage(image67);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator69 = null;
        piePlot63.setToolTipGenerator(pieToolTipGenerator69);
        boolean boolean71 = piePlot63.getIgnoreZeroValues();
        java.awt.Paint paint72 = piePlot63.getShadowPaint();
        piePlot42.setLabelPaint(paint72);
        piePlot21.setLabelShadowPaint(paint72);
        java.awt.Paint paint77 = piePlot21.lookupSectionPaint((java.lang.Comparable) '4', false);
        org.jfree.data.general.PieDataset pieDataset78 = null;
        org.jfree.chart.plot.PiePlot piePlot79 = new org.jfree.chart.plot.PiePlot(pieDataset78);
        double double80 = piePlot79.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent81 = null;
        piePlot79.notifyListeners(plotChangeEvent81);
        org.jfree.chart.util.RectangleInsets rectangleInsets83 = piePlot79.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets84 = piePlot79.getSimpleLabelOffset();
        java.awt.Paint paint85 = piePlot79.getLabelBackgroundPaint();
        float float86 = piePlot79.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets87 = piePlot79.getInsets();
        piePlot21.setSimpleLabelOffset(rectangleInsets87);
        java.awt.Paint paint91 = piePlot21.lookupSectionOutlinePaint((java.lang.Comparable) 90.0d, false);
        piePlot1.setLabelOutlinePaint(paint91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot63", piePlot10.equals(piePlot63) ? piePlot10.hashCode() == piePlot63.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        java.lang.Object obj19 = piePlot1.clone();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        java.awt.Image image25 = null;
        piePlot21.setBackgroundImage(image25);
        java.awt.Paint paint27 = piePlot21.getLabelShadowPaint();
        piePlot21.setShadowXOffset(90.0d);
        piePlot21.setForegroundAlpha(10.0f);
        piePlot21.setCircular(false);
        piePlot21.setSimpleLabels(false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator36 = piePlot21.getLegendLabelGenerator();
        boolean boolean37 = piePlot1.equals((java.lang.Object) piePlot21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj19", piePlot1.equals(obj19) ? piePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        piePlot7.datasetChanged(datasetChangeEvent11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot14.handleClick((int) (byte) 0, 100, plotRenderingInfo19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        piePlot14.setLabelBackgroundPaint(paint25);
        piePlot7.setLabelShadowPaint(paint25);
        piePlot1.setLabelBackgroundPaint(paint25);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot(pieDataset29);
        piePlot30.setIgnoreNullValues(true);
        piePlot30.setNoDataMessage("hi!");
        java.awt.Stroke stroke36 = piePlot30.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        piePlot1.setBaseSectionOutlineStroke(stroke36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        piePlot39.setLabelPaint(paint45);
        boolean boolean47 = piePlot39.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        java.awt.Image image53 = null;
        piePlot49.setBackgroundImage(image53);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator55 = null;
        piePlot49.setToolTipGenerator(pieToolTipGenerator55);
        boolean boolean57 = piePlot49.getIgnoreNullValues();
        java.awt.Paint paint58 = piePlot49.getLabelPaint();
        double double59 = piePlot49.getLabelLinkMargin();
        boolean boolean60 = piePlot49.isCircular();
        boolean boolean61 = piePlot49.getIgnoreZeroValues();
        piePlot49.setMaximumLabelWidth((double) 0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = piePlot49.getInsets();
        piePlot39.setInsets(rectangleInsets64);
        piePlot1.setInsets(rectangleInsets64, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot42", piePlot22.equals(piePlot42) ? piePlot22.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot26.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot26.getInsets();
        piePlot1.setInsets(rectangleInsets28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot1 and obj24", piePlot1.equals(obj24) ? piePlot1.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint11 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        boolean boolean18 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot19 = piePlot14.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        piePlot14.axisChanged(axisChangeEvent20);
        piePlot14.setExplodePercent((java.lang.Comparable) 10L, (double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot14.getInsets();
        piePlot1.setInsets(rectangleInsets25, false);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        piePlot31.setIgnoreNullValues(true);
        piePlot31.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetGroup datasetGroup36 = piePlot31.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot31.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        double double40 = piePlot39.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        piePlot39.notifyListeners(plotChangeEvent41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot39.getSimpleLabelOffset();
        boolean boolean44 = piePlot39.getIgnoreNullValues();
        piePlot39.setForegroundAlpha((float) 1);
        double double47 = piePlot39.getStartAngle();
        boolean boolean48 = piePlot39.isOutlineVisible();
        java.awt.Stroke stroke49 = piePlot39.getLabelOutlineStroke();
        java.awt.Paint paint50 = piePlot39.getBaseSectionPaint();
        piePlot31.setShadowPaint(paint50);
        piePlot1.setShadowPaint(paint50);
        org.jfree.chart.util.Rotation rotation53 = piePlot1.getDirection();
        double double54 = piePlot1.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot(pieDataset55);
        double double57 = piePlot56.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = piePlot56.getSimpleLabelOffset();
        java.awt.Stroke stroke59 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot56.setBaseSectionOutlineStroke(stroke59);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator61 = piePlot56.getLegendLabelToolTipGenerator();
        org.jfree.data.general.PieDataset pieDataset62 = null;
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot(pieDataset62);
        double double64 = piePlot63.getShadowYOffset();
        java.awt.Image image65 = piePlot63.getBackgroundImage();
        java.awt.Stroke stroke66 = piePlot63.getLabelOutlineStroke();
        java.awt.Font font67 = piePlot63.getLabelFont();
        piePlot56.setNoDataMessageFont(font67);
        piePlot1.setLabelFont(font67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot39 and piePlot63", piePlot39.equals(piePlot63) ? piePlot39.hashCode() == piePlot63.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        org.jfree.data.general.DatasetGroup datasetGroup31 = piePlot1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot33.getLegendLabelGenerator();
        java.awt.Stroke stroke36 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot33.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke36);
        piePlot33.setLabelGap((double) 0);
        piePlot33.setStartAngle((double) (-1.0f));
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        piePlot43.setIgnoreNullValues(true);
        java.awt.Paint paint46 = piePlot43.getLabelPaint();
        boolean boolean47 = piePlot43.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        double double50 = piePlot49.getShadowYOffset();
        java.awt.Image image51 = piePlot49.getBackgroundImage();
        java.awt.Stroke stroke52 = piePlot49.getLabelOutlineStroke();
        piePlot43.setLabelLinkStroke(stroke52);
        piePlot33.setBaseSectionOutlineStroke(stroke52);
        piePlot1.setLabelOutlineStroke(stroke52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot19 and piePlot49", piePlot19.equals(piePlot49) ? piePlot19.hashCode() == piePlot49.hashCode() : true);
    }
}

