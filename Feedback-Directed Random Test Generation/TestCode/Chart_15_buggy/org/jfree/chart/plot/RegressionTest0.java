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
        boolean boolean0 = org.jfree.chart.plot.PiePlot.DEBUG_DRAW_INTERIOR;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_INTERIOR_GAP;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.08d + "'", double0 == 0.08d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.util.List list3 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.plot.PiePlotState piePlotState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D2, list3, (double) (-1), rectangle2D5, rectangle2D6, piePlotState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D11 = piePlot1.getArcBounds(rectangle2D6, rectangle2D7, (double) 10, (double) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Paint paint5 = piePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.PiePlotState piePlotState7 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D6, piePlotState7, pieLabelRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.chart.util.Rotation rotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setDirection(rotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'direction' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint(comparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLabelDistributor(abstractPieLabelDistributor1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'distributor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Paint paint5 = piePlot1.getNoDataMessagePaint();
        java.lang.Class<?> wildcardClass6 = paint5.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState19 = piePlot1.initialise(graphics2D10, rectangle2D11, piePlot13, (java.lang.Integer) (-1), plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        int int7 = piePlot1.getPieIndex();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.PiePlotState piePlotState7 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D6, piePlotState7, pieLabelRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
        java.awt.Paint paint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setNoDataMessagePaint(paint13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        // The following exception was thrown during execution in test generation
        try {
            double double2 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-5d + "'", double0 == 1.0E-5d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D8 = null;
        java.util.List list9 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PiePlotState piePlotState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D8, list9, (double) 100, rectangle2D11, rectangle2D12, piePlotState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreNullValues();
        java.awt.Graphics2D graphics2D10 = null;
        java.util.List list11 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D10, list11, 0.025d, rectangle2D13, rectangle2D14, piePlotState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot1.setDataset(pieDataset8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        java.awt.Image image15 = null;
        piePlot11.setBackgroundImage(image15);
        java.awt.Paint paint17 = piePlot11.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        piePlot11.setDataset(pieDataset18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState22 = piePlot1.initialise(graphics2D8, rectangle2D9, piePlot11, (java.lang.Integer) 100, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getShadowYOffset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState24 = piePlot1.initialise(graphics2D17, rectangle2D18, piePlot20, (java.lang.Integer) (-1), plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.PiePlotState piePlotState10 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D9, piePlotState10, pieLabelRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        piePlot1.setLabelLinkMargin((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator5);
        java.lang.Comparable comparable8 = piePlot1.getSectionKey((int) (short) 100);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D9, rectangle2D10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        java.awt.Graphics2D graphics2D9 = null;
        java.util.List list10 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlotState piePlotState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D9, list10, 10.0d, rectangle2D12, rectangle2D13, piePlotState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D14, rectangle2D15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setLabelDistributor(abstractPieLabelDistributor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'distributor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        piePlot1.setSimpleLabels(true);
        boolean boolean9 = piePlot1.getSimpleLabels();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        java.awt.Image image16 = null;
        piePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = piePlot12.getLabelShadowPaint();
        java.awt.Image image19 = piePlot12.getBackgroundImage();
        java.awt.Paint paint20 = piePlot12.getBaseSectionPaint();
        piePlot1.setSectionPaint((java.lang.Comparable) false, paint20);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        plot6.zoom(100.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.plot.PiePlotState piePlotState23 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord24 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D22, piePlotState23, pieLabelRecord24);
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
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        java.awt.Shape shape32 = piePlot1.getLegendItemShape();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(shape32);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D17, rectangle2D18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        piePlot1.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot1.axisChanged(axisChangeEvent7);
        java.lang.String str9 = piePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PiePlotState piePlotState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D10, (int) (byte) 1, rectangle2D12, piePlotState13, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinksVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke13 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.String (java.lang.Character and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.PiePlotState piePlotState10 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D9, piePlotState10, pieLabelRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        boolean boolean0 = org.jfree.chart.plot.PiePlot.DEBUG_DRAW_PIE_AREA;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        piePlot1.setForegroundAlpha(10.0f);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        java.awt.Paint paint19 = piePlot16.getLabelPaint();
        boolean boolean20 = piePlot16.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        double double24 = piePlot23.getShadowYOffset();
        java.awt.Stroke stroke26 = piePlot23.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot16.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke26);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        java.awt.Image image33 = null;
        piePlot29.setBackgroundImage(image33);
        java.awt.Paint paint35 = piePlot29.getLabelShadowPaint();
        java.awt.Paint paint38 = piePlot29.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot16.setNoDataMessagePaint(paint38);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot16.getLegendLabelGenerator();
        piePlot16.setBackgroundAlpha((float) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState45 = piePlot1.initialise(graphics2D13, rectangle2D14, piePlot16, (java.lang.Integer) 0, plotRenderingInfo44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator40);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        piePlot1.setSimpleLabels(true);
        piePlot1.setLabelGap((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        java.awt.Graphics2D graphics2D10 = null;
        java.util.List list11 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D10, list11, (double) (byte) 100, rectangle2D13, rectangle2D14, piePlotState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        boolean boolean0 = org.jfree.chart.plot.PiePlot.DEBUG_DRAW_LINK_AREA;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        double double9 = piePlot1.getShadowYOffset();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.lang.Class<?> wildcardClass20 = paint17.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke13 = piePlot1.lookupSectionOutlineStroke(comparable11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlotState piePlotState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D11, (int) ' ', rectangle2D13, piePlotState14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot22.handleClick((int) (byte) 0, 100, plotRenderingInfo27);
        java.awt.Paint paint29 = piePlot22.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot(pieDataset30);
        piePlot31.setIgnoreNullValues(true);
        java.awt.Paint paint34 = piePlot31.getLabelPaint();
        java.awt.Paint paint35 = piePlot31.getNoDataMessagePaint();
        piePlot22.setLabelBackgroundPaint(paint35);
        java.awt.Stroke stroke37 = piePlot22.getLabelLinkStroke();
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) true, stroke37);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        piePlot8.handleClick(0, (int) (short) 100, plotRenderingInfo15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinksVisible(false);
        boolean boolean11 = piePlot1.getSimpleLabels();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInsets(rectangleInsets21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot8);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        piePlot1.markerChanged(markerChangeEvent13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        double double11 = piePlot10.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        piePlot10.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot10.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot10.getSimpleLabelOffset();
        java.awt.Paint paint16 = piePlot10.getLabelBackgroundPaint();
        piePlot1.setBackgroundPaint(paint16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        boolean boolean6 = piePlot1.isSubplot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(pieURLGenerator7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        piePlot1.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.awt.Paint paint40 = piePlot24.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
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
        org.junit.Assert.assertNull(paint40);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        boolean boolean21 = piePlot1.getIgnoreNullValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie Plot" + "'", str11, "Pie Plot");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        java.lang.Object obj9 = piePlot1.clone();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        java.lang.Class<?> wildcardClass25 = paint23.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        java.awt.Stroke stroke8 = null;
        piePlot6.setSectionOutlineStroke((java.lang.Comparable) '#', stroke8);
        java.lang.String str10 = piePlot6.getPlotType();
        java.awt.Shape shape11 = piePlot6.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot6.setLegendLabelURLGenerator(pieURLGenerator12);
        piePlot6.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = piePlot17.getToolTipGenerator();
        java.awt.Paint paint22 = piePlot17.getNoDataMessagePaint();
        piePlot17.setLabelGap(0.0d);
        java.awt.Paint paint27 = piePlot17.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot6.setLabelBackgroundPaint(paint27);
        piePlot1.setLabelLinkPaint(paint27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pie Plot" + "'", str10, "Pie Plot");
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.getLabelLinksVisible();
        double double13 = piePlot1.getStartAngle();
        double double14 = piePlot1.getLabelLinkMargin();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        java.awt.geom.Point2D point2D35 = null;
        org.jfree.chart.plot.PlotState plotState36 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D33, rectangle2D34, point2D35, plotState36, plotRenderingInfo37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.08d + "'", double29 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        java.awt.Paint paint16 = piePlot1.getLabelLinkPaint();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D17, rectangle2D18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        java.awt.Stroke stroke19 = null;
        piePlot17.setSectionOutlineStroke((java.lang.Comparable) '#', stroke19);
        java.lang.String str21 = piePlot17.getPlotType();
        java.lang.String str22 = piePlot17.getNoDataMessage();
        piePlot17.setSimpleLabels(true);
        boolean boolean25 = piePlot17.getSimpleLabels();
        java.awt.Paint paint26 = piePlot17.getLabelBackgroundPaint();
        piePlot1.setBaseSectionPaint(paint26);
        boolean boolean28 = piePlot1.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = piePlot12.getToolTipGenerator();
        java.awt.Paint paint17 = piePlot12.getNoDataMessagePaint();
        piePlot12.setLabelGap(0.0d);
        java.awt.Paint paint22 = piePlot12.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelBackgroundPaint(paint22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        piePlot1.setDataset(pieDataset16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie Plot" + "'", str13, "Pie Plot");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot1.getSimpleLabelOffset();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        double double18 = piePlot17.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot17.notifyListeners(plotChangeEvent19);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = piePlot17.getToolTipGenerator();
        java.awt.Paint paint22 = piePlot17.getNoDataMessagePaint();
        piePlot17.setLabelGap(0.0d);
        piePlot17.setStartAngle((double) (short) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState29 = piePlot1.initialise(graphics2D14, rectangle2D15, piePlot17, (java.lang.Integer) (-1), plotRenderingInfo28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-5d + "'", double5 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        org.jfree.data.KeyedValues keyedValues7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues7, graphics2D8, rectangle2D9, rectangle2D10, (float) (short) 0, piePlotState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_START_ANGLE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 90.0d + "'", double0 == 90.0d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pie Plot" + "'", str14, "Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.awt.Paint paint34 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        org.jfree.data.KeyedValues keyedValues14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PiePlotState piePlotState19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues14, graphics2D15, rectangle2D16, rectangle2D17, 0.0f, piePlotState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.awt.Graphics2D graphics2D19 = null;
        java.util.List list20 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PiePlotState piePlotState24 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D19, list20, (double) 15, rectangle2D22, rectangle2D23, piePlotState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator47 = piePlot1.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(pieSectionLabelGenerator47);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.plot.PiePlotState piePlotState18 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D17, piePlotState18, pieLabelRecord19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(pieDataset16);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinksVisible(false);
        piePlot1.setPieIndex((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke14 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Float (java.lang.Character and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinkMargin(0.14d);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        java.awt.Paint paint14 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        java.awt.Stroke stroke19 = null;
        piePlot17.setSectionOutlineStroke((java.lang.Comparable) '#', stroke19);
        java.lang.String str21 = piePlot17.getPlotType();
        java.lang.String str22 = piePlot17.getNoDataMessage();
        piePlot17.setSimpleLabels(true);
        boolean boolean25 = piePlot17.getSimpleLabels();
        java.awt.Paint paint26 = piePlot17.getLabelBackgroundPaint();
        piePlot1.setBaseSectionPaint(paint26);
        java.awt.Stroke stroke28 = piePlot1.getLabelOutlineStroke();
        double double29 = piePlot1.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        java.awt.Stroke stroke21 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.0f, false);
        java.lang.String str22 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        piePlot1.setLabelGap((double) 10);
        java.awt.Graphics2D graphics2D11 = null;
        java.util.List list12 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PiePlotState piePlotState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D11, list12, 1.0E-5d, rectangle2D14, rectangle2D15, piePlotState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        java.lang.String str12 = piePlot1.getPlotType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.util.Rotation rotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setDirection(rotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'direction' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        java.lang.Class<?> wildcardClass29 = paint25.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.awt.Paint paint0 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        java.lang.String str12 = piePlot1.getPlotType();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot1.notifyListeners(plotChangeEvent13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot(pieDataset8);
        piePlot9.setIgnoreNullValues(true);
        java.awt.Paint paint12 = piePlot9.getLabelPaint();
        boolean boolean13 = piePlot9.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot14 = piePlot9.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        piePlot9.axisChanged(axisChangeEvent15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = piePlot9.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        java.awt.Stroke stroke22 = null;
        piePlot20.setSectionOutlineStroke((java.lang.Comparable) '#', stroke22);
        java.lang.String str24 = piePlot20.getPlotType();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        piePlot20.setBaseSectionOutlinePaint(paint29);
        piePlot9.setSectionOutlinePaint((java.lang.Comparable) 100L, paint29);
        java.awt.Paint paint32 = piePlot9.getShadowPaint();
        piePlot1.setBaseSectionOutlinePaint(paint32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pie Plot" + "'", str24, "Pie Plot");
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        int int7 = piePlot1.getPieIndex();
        java.awt.Image image8 = piePlot1.getBackgroundImage();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = piePlot12.getToolTipGenerator();
        java.awt.Paint paint17 = piePlot12.getNoDataMessagePaint();
        piePlot12.setLabelGap(0.0d);
        java.awt.Paint paint22 = piePlot12.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelBackgroundPaint(paint22);
        piePlot1.setIgnoreZeroValues(false);
        java.lang.Object obj26 = piePlot1.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D14, piePlotState15, pieLabelRecord16);
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        java.awt.Stroke stroke15 = null;
        piePlot13.setSectionOutlineStroke((java.lang.Comparable) '#', stroke15);
        java.lang.String str17 = piePlot13.getPlotType();
        java.awt.Paint paint19 = piePlot13.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot13.getURLGenerator();
        piePlot13.setLabelLinkMargin((double) ' ');
        java.awt.Font font23 = piePlot13.getNoDataMessageFont();
        piePlot1.setLabelFont(font23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pie Plot" + "'", str17, "Pie Plot");
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(pieURLGenerator20);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        org.jfree.data.KeyedValues keyedValues9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PiePlotState piePlotState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues9, graphics2D10, rectangle2D11, rectangle2D12, (float) (byte) 0, piePlotState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D8, (int) (short) 100, rectangle2D10, piePlotState11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinksVisible(false);
        java.awt.Paint paint11 = piePlot1.getBaseSectionPaint();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        double double0 = org.jfree.chart.plot.PiePlot.MAX_INTERIOR_GAP;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.4d + "'", double0 == 0.4d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        java.lang.String str9 = piePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pie Plot" + "'", str9, "Pie Plot");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot1.handleClick((int) (short) 1, (int) '4', plotRenderingInfo29);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie Plot" + "'", str13, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState11 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D10, piePlotState11, pieLabelRecord12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.util.List list14 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PiePlotState piePlotState18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D13, list14, 0.08d, rectangle2D16, rectangle2D17, piePlotState18);
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
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNull(datasetGroup38);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.awt.Paint paint24 = piePlot1.getShadowPaint();
        org.jfree.chart.plot.Plot plot25 = piePlot1.getParent();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(plot25);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        piePlot1.setSimpleLabels(true);
        boolean boolean9 = piePlot1.getSimpleLabels();
        java.lang.String str10 = piePlot1.getPlotType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pie Plot" + "'", str10, "Pie Plot");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pie Plot" + "'", str20, "Pie Plot");
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setBaseSectionOutlineStroke(stroke4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator11);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        piePlot1.setSimpleLabels(true);
        boolean boolean9 = piePlot1.getSimpleLabels();
        java.awt.Paint paint10 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        double double34 = piePlot1.getLabelGap();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.025d + "'", double34 == 0.025d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        piePlot1.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D9 = null;
        java.util.List list10 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlotState piePlotState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D9, list10, (double) 10.0f, rectangle2D12, rectangle2D13, piePlotState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        piePlot1.setSimpleLabels(true);
        java.awt.Stroke stroke9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBaseSectionOutlineStroke(stroke9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        double double19 = piePlot1.getMaximumLabelWidth();
        piePlot1.setLabelLinkMargin((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie Plot" + "'", str11, "Pie Plot");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        piePlot33.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        piePlot33.handleClick((int) (byte) 0, 100, plotRenderingInfo38);
        java.awt.Paint paint40 = piePlot33.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        java.awt.Paint paint46 = piePlot42.getNoDataMessagePaint();
        piePlot33.setLabelBackgroundPaint(paint46);
        piePlot1.setLabelOutlinePaint(paint46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D21, rectangle2D22, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.plot.PiePlotState piePlotState23 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord24 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawRightLabel(graphics2D22, piePlotState23, pieLabelRecord24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-5d + "'", double5 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        boolean boolean36 = piePlot1.isSubplot();
        org.jfree.data.KeyedValues keyedValues37 = null;
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.plot.PiePlotState piePlotState42 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues37, graphics2D38, rectangle2D39, rectangle2D40, (float) 1, piePlotState42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D24, rectangle2D25, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(pieDataset23);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D26, rectangle2D27, plotRenderingInfo28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        java.awt.Stroke stroke21 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) -1, true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        piePlot1.axisChanged(axisChangeEvent22);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie Plot" + "'", str11, "Pie Plot");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        java.awt.Stroke stroke19 = null;
        piePlot17.setSectionOutlineStroke((java.lang.Comparable) '#', stroke19);
        java.lang.String str21 = piePlot17.getPlotType();
        java.lang.String str22 = piePlot17.getNoDataMessage();
        piePlot17.setSimpleLabels(true);
        boolean boolean25 = piePlot17.getSimpleLabels();
        java.awt.Paint paint26 = piePlot17.getLabelBackgroundPaint();
        piePlot1.setBaseSectionPaint(paint26);
        java.awt.Stroke stroke28 = piePlot1.getLabelOutlineStroke();
        java.awt.Paint paint29 = piePlot1.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.awt.Paint paint17 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 0.4d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        piePlot1.setCircular(false, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie Plot" + "'", str13, "Pie Plot");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setOutlineVisible(true);
        int int14 = piePlot1.getPieIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.awt.Paint paint26 = piePlot1.getOutlinePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = null;
        piePlot1.setURLGenerator(pieURLGenerator27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint11 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot13.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) (byte) 1, 0, plotRenderingInfo8);
        java.awt.Graphics2D graphics2D10 = null;
        java.util.List list11 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D10, list11, (double) (byte) 100, rectangle2D13, rectangle2D14, piePlotState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        piePlot1.axisChanged(axisChangeEvent32);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        piePlot1.notifyListeners(plotChangeEvent34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Paint paint6 = piePlot1.getBaseSectionPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        piePlot1.markerChanged(markerChangeEvent13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setOutlineVisible(true);
        piePlot1.setLabelLinksVisible(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setExplodePercent((java.lang.Comparable) (-1.0d), (-1.0d));
        float float13 = piePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        org.jfree.data.KeyedValues keyedValues32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.plot.PiePlotState piePlotState37 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues32, graphics2D33, rectangle2D34, rectangle2D35, (float) (-1L), piePlotState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot(pieDataset6);
        piePlot7.setIgnoreNullValues(true);
        java.awt.Paint paint10 = piePlot7.getLabelPaint();
        boolean boolean11 = piePlot7.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot12 = piePlot7.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        piePlot7.axisChanged(axisChangeEvent13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = piePlot7.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Stroke stroke20 = null;
        piePlot18.setSectionOutlineStroke((java.lang.Comparable) '#', stroke20);
        java.lang.String str22 = piePlot18.getPlotType();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        piePlot18.setBaseSectionOutlinePaint(paint27);
        piePlot7.setSectionOutlinePaint((java.lang.Comparable) 100L, paint27);
        boolean boolean30 = piePlot7.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot7.getLegendLabelGenerator();
        piePlot1.setLabelGenerator(pieSectionLabelGenerator31);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pie Plot" + "'", str22, "Pie Plot");
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator31);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pie Plot" + "'", str15, "Pie Plot");
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot15 = piePlot10.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        piePlot10.axisChanged(axisChangeEvent16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot10.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        java.awt.Stroke stroke23 = null;
        piePlot21.setSectionOutlineStroke((java.lang.Comparable) '#', stroke23);
        java.lang.String str25 = piePlot21.getPlotType();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        piePlot21.setBaseSectionOutlinePaint(paint30);
        piePlot10.setSectionOutlinePaint((java.lang.Comparable) 100L, paint30);
        boolean boolean33 = piePlot10.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot10.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        java.awt.Stroke stroke37 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 0.0f);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator38 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator38);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pie Plot" + "'", str25, "Pie Plot");
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertNull(stroke37);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        int int9 = piePlot1.getBackgroundImageAlignment();
        double double10 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(pieURLGenerator8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot15 = piePlot10.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        piePlot10.axisChanged(axisChangeEvent16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot10.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        java.awt.Stroke stroke23 = null;
        piePlot21.setSectionOutlineStroke((java.lang.Comparable) '#', stroke23);
        java.lang.String str25 = piePlot21.getPlotType();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        java.awt.Paint paint30 = piePlot27.getLabelPaint();
        piePlot21.setBaseSectionOutlinePaint(paint30);
        piePlot10.setSectionOutlinePaint((java.lang.Comparable) 100L, paint30);
        boolean boolean33 = piePlot10.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot10.getLegendLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        piePlot1.setCircular(false, true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pie Plot" + "'", str25, "Pie Plot");
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.awt.Paint paint24 = piePlot1.getShadowPaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        java.awt.Paint paint16 = piePlot1.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset17 = piePlot1.getDataset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(pieDataset17);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        int int8 = piePlot1.getPieIndex();
        piePlot1.setCircular(true);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.setIgnoreNullValues(true);
        java.awt.Paint paint15 = piePlot12.getLabelPaint();
        boolean boolean16 = piePlot12.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot17 = piePlot12.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        piePlot12.axisChanged(axisChangeEvent18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = piePlot12.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        java.awt.Stroke stroke25 = null;
        piePlot23.setSectionOutlineStroke((java.lang.Comparable) '#', stroke25);
        java.lang.String str27 = piePlot23.getPlotType();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot(pieDataset28);
        piePlot29.setIgnoreNullValues(true);
        java.awt.Paint paint32 = piePlot29.getLabelPaint();
        piePlot23.setBaseSectionOutlinePaint(paint32);
        piePlot12.setSectionOutlinePaint((java.lang.Comparable) 100L, paint32);
        java.awt.Paint paint35 = piePlot12.getShadowPaint();
        piePlot1.setLabelPaint(paint35);
        double double37 = piePlot1.getInteriorGap();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pie Plot" + "'", str27, "Pie Plot");
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.08d + "'", double37 == 0.08d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
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
        double double26 = piePlot12.getShadowYOffset();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        double double29 = piePlot28.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot28.notifyListeners(plotChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot28.getSimpleLabelOffset();
        java.awt.Font font33 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot28.setNoDataMessageFont(font33);
        piePlot12.setLabelFont(font33);
        java.awt.Paint paint36 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot12.setBaseSectionPaint(paint36);
        piePlot1.setLabelOutlinePaint(paint36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot1.getLegendLabelToolTipGenerator();
        org.jfree.data.KeyedValues keyedValues8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PiePlotState piePlotState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues8, graphics2D9, rectangle2D10, rectangle2D11, (float) '#', piePlotState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.String str25 = piePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(pieDataset23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pie Plot" + "'", str25, "Pie Plot");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.util.List list28 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PiePlotState piePlotState32 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D27, list28, (double) 'a', rectangle2D30, rectangle2D31, piePlotState32);
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
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.util.List list15 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PiePlotState piePlotState19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D14, list15, (double) (-1), rectangle2D17, rectangle2D18, piePlotState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.awt.Font font25 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setLabelLinkMargin((double) ' ');
        java.awt.Paint paint13 = piePlot1.lookupSectionPaint((java.lang.Comparable) (byte) 100, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        org.jfree.chart.plot.Plot plot4 = piePlot1.getRootPlot();
        java.lang.Class<?> wildcardClass5 = plot4.getClass();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        java.awt.Stroke stroke12 = piePlot1.getBaseSectionOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        piePlot1.setExplodePercent((java.lang.Comparable) (byte) 10, 90.0d);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot20.notifyListeners(plotChangeEvent22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot20.getSimpleLabelOffset();
        java.awt.Paint paint25 = piePlot20.getLabelBackgroundPaint();
        double double26 = piePlot20.getStartAngle();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState29 = piePlot1.initialise(graphics2D17, rectangle2D18, piePlot20, (java.lang.Integer) 100, plotRenderingInfo28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 90.0d + "'", double26 == 90.0d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        float float26 = piePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.awt.Paint paint0 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        boolean boolean36 = piePlot1.isSubplot();
        boolean boolean37 = piePlot1.isOutlineVisible();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot1.addChangeListener(plotChangeListener16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie Plot" + "'", str13, "Pie Plot");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setIgnoreZeroValues(false);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot1.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        piePlot6.setIgnoreNullValues(true);
        java.awt.Paint paint9 = piePlot6.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot6.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot6.addChangeListener(plotChangeListener12);
        piePlot6.setLabelGap((double) 10);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        java.awt.Stroke stroke19 = null;
        piePlot17.setSectionOutlineStroke((java.lang.Comparable) '#', stroke19);
        java.lang.String str21 = piePlot17.getPlotType();
        java.awt.Shape shape22 = piePlot17.getLegendItemShape();
        piePlot6.setLegendItemShape(shape22);
        piePlot1.setLegendItemShape(shape22);
        java.awt.Stroke stroke26 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNull(stroke26);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Stroke stroke6 = piePlot1.getLabelOutlineStroke();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        java.lang.String str12 = piePlot1.getPlotType();
        piePlot1.setIgnoreNullValues(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint9 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        boolean boolean10 = piePlot1.getLabelLinksVisible();
        org.jfree.data.KeyedValues keyedValues11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues11, graphics2D12, rectangle2D13, rectangle2D14, (float) (byte) 10, piePlotState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot11.setToolTipGenerator(pieToolTipGenerator16);
        java.awt.Paint paint19 = piePlot11.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        piePlot1.setLabelOutlinePaint(paint19);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D27, rectangle2D28, plotRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie Plot" + "'", str13, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        java.awt.Stroke stroke7 = piePlot1.getLabelLinkStroke();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        int int15 = piePlot1.getPieIndex();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        java.lang.Object obj7 = piePlot1.clone();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        piePlot1.removeChangeListener(plotChangeListener11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        piePlot1.axisChanged(axisChangeEvent32);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        piePlot1.markerChanged(markerChangeEvent34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.awt.Font font14 = piePlot1.getLabelFont();
        java.awt.Paint paint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBaseSectionOutlinePaint(paint15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setLabelLinkMargin((double) ' ');
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
        boolean boolean37 = piePlot1.equals((java.lang.Object) piePlot12);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
            piePlot1.setBackgroundImageAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        double double13 = piePlot1.getInteriorGap();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = piePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.08d + "'", double13 == 0.08d);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        java.awt.Stroke stroke21 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.0f, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        java.awt.Stroke stroke26 = null;
        piePlot24.setSectionOutlineStroke((java.lang.Comparable) '#', stroke26);
        java.lang.String str28 = piePlot24.getPlotType();
        java.awt.Paint paint30 = piePlot24.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot24.getURLGenerator();
        piePlot24.setLabelLinkMargin((double) ' ');
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot24.getInsets();
        piePlot1.setInsets(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pie Plot" + "'", str28, "Pie Plot");
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNull(pieURLGenerator31);
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot1.getToolTipGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        piePlot1.setOutlineVisible(true);
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
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        java.awt.Image image30 = null;
        piePlot26.setBackgroundImage(image30);
        java.awt.Paint paint32 = piePlot26.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        piePlot26.setDataset(pieDataset33);
        piePlot11.setParent((org.jfree.chart.plot.Plot) piePlot26);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot(pieDataset36);
        double double38 = piePlot37.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        piePlot37.notifyListeners(plotChangeEvent39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot37.getSimpleLabelOffset();
        java.awt.Paint paint42 = piePlot37.getLabelBackgroundPaint();
        piePlot26.setLabelPaint(paint42);
        piePlot1.setSectionPaint((java.lang.Comparable) 100L, paint42);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0E-5d + "'", double38 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        piePlot1.setOutlineVisible(true);
        piePlot1.setSectionOutlinesVisible(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        plot6.markerChanged(markerChangeEvent7);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        piePlot1.setSimpleLabels(true);
        boolean boolean9 = piePlot1.getSimpleLabels();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        piePlot11.setIgnoreNullValues(true);
        java.awt.Paint paint14 = piePlot11.getLabelPaint();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot16 = piePlot11.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        piePlot11.axisChanged(axisChangeEvent17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot11.getDrawingSupplier();
        piePlot1.setDrawingSupplier(drawingSupplier19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getShadowYOffset();
        java.awt.Image image24 = piePlot22.getBackgroundImage();
        piePlot22.setIgnoreZeroValues(false);
        java.awt.Paint paint27 = piePlot22.getOutlinePaint();
        piePlot1.setBackgroundPaint(paint27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.0d + "'", double23 == 4.0d);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        boolean boolean13 = piePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator9);
        double double11 = piePlot1.getLabelLinkMargin();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        double double15 = piePlot1.getMaximumLabelWidth();
        org.jfree.chart.plot.Plot plot16 = piePlot1.getParent();
        java.awt.Paint paint17 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.lang.Class<?> wildcardClass24 = drawingSupplier23.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.lang.String str44 = piePlot24.getPlotType();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pie Plot" + "'", str44, "Pie Plot");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = piePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D15 = null;
        java.util.List list16 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PiePlotState piePlotState20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D15, list16, 0.0d, rectangle2D18, rectangle2D19, piePlotState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        org.jfree.chart.util.Rotation rotation15 = piePlot1.getDirection();
        piePlot1.setNoDataMessage("Pie Plot");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rotation15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setExplodePercent((java.lang.Comparable) (-1.0d), (-1.0d));
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot1.setURLGenerator(pieURLGenerator13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        double double7 = piePlot1.getStartAngle();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator8);
        piePlot1.setCircular(true, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.awt.Font font18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setLabelFont(font18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.getLabelLinksVisible();
        double double13 = piePlot1.getStartAngle();
        java.awt.Paint paint15 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot(pieDataset7);
        piePlot8.setIgnoreNullValues(true);
        java.awt.Paint paint11 = piePlot8.getLabelPaint();
        piePlot1.setParent((org.jfree.chart.plot.Plot) piePlot8);
        java.awt.Paint paint13 = piePlot1.getLabelPaint();
        java.awt.Stroke stroke14 = piePlot1.getOutlineStroke();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
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
        java.awt.Paint paint31 = piePlot18.lookupSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = piePlot33.getLabelShadowPaint();
        piePlot33.setLabelGap(0.0d);
        float float42 = piePlot33.getForegroundAlpha();
        boolean boolean43 = piePlot33.getIgnoreZeroValues();
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        piePlot33.removeChangeListener(plotChangeListener44);
        java.awt.Font font46 = piePlot33.getLabelFont();
        piePlot18.setNoDataMessageFont(font46);
        piePlot1.setLabelFont(font46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(font46);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        float float10 = piePlot1.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        java.awt.Stroke stroke14 = null;
        piePlot12.setSectionOutlineStroke((java.lang.Comparable) '#', stroke14);
        java.lang.String str16 = piePlot12.getPlotType();
        java.awt.Shape shape17 = piePlot12.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = null;
        piePlot12.setLegendLabelURLGenerator(pieURLGenerator18);
        piePlot12.setIgnoreZeroValues(false);
        double double22 = piePlot12.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot24.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot24.getInsets();
        double double27 = piePlot24.getInteriorGap();
        org.jfree.chart.util.Rotation rotation28 = piePlot24.getDirection();
        piePlot12.setDirection(rotation28);
        piePlot1.setDirection(rotation28);
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.plot.PiePlotState piePlotState32 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord33 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D31, piePlotState32, pieLabelRecord33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08d + "'", double27 == 0.08d);
        org.junit.Assert.assertNotNull(rotation28);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.jfree.data.KeyedValues keyedValues17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PiePlotState piePlotState22 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues17, graphics2D18, rectangle2D19, rectangle2D20, (float) 100L, piePlotState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setOutlineVisible(true);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getShadowYOffset();
        java.awt.Image image17 = piePlot15.getBackgroundImage();
        piePlot15.setIgnoreZeroValues(false);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent25 = null;
        piePlot21.datasetChanged(datasetChangeEvent25);
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
        piePlot21.setLabelShadowPaint(paint39);
        piePlot15.setLabelBackgroundPaint(paint39);
        java.awt.Paint paint44 = null;
        piePlot15.setSectionOutlinePaint((java.lang.Comparable) 10L, paint44);
        boolean boolean46 = piePlot1.equals((java.lang.Object) 10L);
        java.lang.String str47 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
        java.awt.Paint paint11 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0L);
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
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        java.awt.Image image27 = null;
        piePlot23.setBackgroundImage(image27);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator29 = null;
        piePlot23.setToolTipGenerator(pieToolTipGenerator29);
        piePlot23.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        java.awt.Paint paint37 = piePlot34.getLabelPaint();
        boolean boolean38 = piePlot34.getIgnoreZeroValues();
        java.awt.Shape shape39 = piePlot34.getLegendItemShape();
        boolean boolean40 = piePlot23.equals((java.lang.Object) piePlot34);
        piePlot11.setParent((org.jfree.chart.plot.Plot) piePlot34);
        org.jfree.data.general.PieDataset pieDataset42 = null;
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot(pieDataset42);
        double double44 = piePlot43.getShadowYOffset();
        java.awt.Image image45 = piePlot43.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = piePlot43.getLegendLabelURLGenerator();
        java.awt.Font font47 = piePlot43.getNoDataMessageFont();
        piePlot34.setLabelFont(font47);
        java.awt.Paint paint49 = piePlot34.getNoDataMessagePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) (short) 0, paint49);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.0d + "'", double44 == 4.0d);
        org.junit.Assert.assertNull(image45);
        org.junit.Assert.assertNull(pieURLGenerator46);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        double double13 = piePlot12.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot12.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        java.awt.Stroke stroke20 = null;
        piePlot18.setSectionOutlineStroke((java.lang.Comparable) '#', stroke20);
        java.lang.String str22 = piePlot18.getPlotType();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.setIgnoreNullValues(true);
        java.awt.Paint paint27 = piePlot24.getLabelPaint();
        piePlot18.setBaseSectionOutlinePaint(paint27);
        piePlot12.setLabelLinkPaint(paint27);
        java.awt.Stroke stroke32 = piePlot12.lookupSectionOutlineStroke((java.lang.Comparable) (short) -1, true);
        piePlot1.setBaseSectionOutlineStroke(stroke32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pie Plot" + "'", str22, "Pie Plot");
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        double double20 = piePlot19.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot19.notifyListeners(plotChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot19.getSimpleLabelOffset();
        java.awt.Font font24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot19.setNoDataMessageFont(font24);
        piePlot1.setNoDataMessageFont(font24);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D27, rectangle2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent38 = null;
        piePlot1.datasetChanged(datasetChangeEvent38);
        piePlot1.setForegroundAlpha((float) 100);
        boolean boolean42 = piePlot1.getLabelLinksVisible();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        piePlot1.setMaximumLabelWidth((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Font font5 = piePlot1.getNoDataMessageFont();
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D11 = piePlot1.getArcBounds(rectangle2D6, rectangle2D7, (double) (byte) 0, (double) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.getIgnoreZeroValues();
        piePlot1.setSectionOutlinesVisible(false);
        java.awt.Paint paint15 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = piePlot1.getArcBounds(rectangle2D24, rectangle2D25, (double) (byte) 100, (double) 10L, 0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(rectangle2D29);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        java.awt.Paint paint8 = piePlot1.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot15 = piePlot10.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        piePlot10.axisChanged(axisChangeEvent16);
        java.lang.String str18 = piePlot10.getNoDataMessage();
        java.awt.Image image19 = null;
        piePlot10.setBackgroundImage(image19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        piePlot22.setIgnoreNullValues(true);
        java.awt.Paint paint25 = piePlot22.getLabelPaint();
        java.awt.Image image26 = null;
        piePlot22.setBackgroundImage(image26);
        java.awt.Paint paint28 = piePlot22.getLabelShadowPaint();
        piePlot10.setLabelBackgroundPaint(paint28);
        java.awt.Stroke stroke31 = piePlot10.lookupSectionOutlineStroke((java.lang.Comparable) (-1L));
        piePlot1.setLabelLinkStroke(stroke31);
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        piePlot1.drawBackgroundImage(graphics2D33, rectangle2D34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        piePlot1.setMinimumArcAngleToDraw((double) 0L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(pieDataset16);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getLabelLinksVisible();
        boolean boolean10 = piePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setOutlineVisible(true);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot(pieDataset14);
        double double16 = piePlot15.getShadowYOffset();
        java.awt.Image image17 = piePlot15.getBackgroundImage();
        piePlot15.setIgnoreZeroValues(false);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        piePlot21.setIgnoreNullValues(true);
        java.awt.Paint paint24 = piePlot21.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent25 = null;
        piePlot21.datasetChanged(datasetChangeEvent25);
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
        piePlot21.setLabelShadowPaint(paint39);
        piePlot15.setLabelBackgroundPaint(paint39);
        java.awt.Paint paint44 = null;
        piePlot15.setSectionOutlinePaint((java.lang.Comparable) 10L, paint44);
        boolean boolean46 = piePlot1.equals((java.lang.Object) 10L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator47 = piePlot1.getToolTipGenerator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(pieToolTipGenerator47);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        piePlot27.setIgnoreNullValues(true);
        piePlot27.setNoDataMessage("hi!");
        java.awt.Stroke stroke33 = piePlot27.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        double double34 = piePlot27.getStartAngle();
        java.awt.Paint paint35 = piePlot27.getLabelShadowPaint();
        piePlot17.setBaseSectionOutlinePaint(paint35);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie Plot" + "'", str13, "Pie Plot");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 90.0d + "'", double34 == 90.0d);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot(pieDataset16);
        java.awt.Stroke stroke19 = null;
        piePlot17.setSectionOutlineStroke((java.lang.Comparable) '#', stroke19);
        java.lang.String str21 = piePlot17.getPlotType();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot(pieDataset22);
        piePlot23.setIgnoreNullValues(true);
        java.awt.Paint paint26 = piePlot23.getLabelPaint();
        piePlot17.setBaseSectionOutlinePaint(paint26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot17.drawBackgroundImage(graphics2D28, rectangle2D29);
        double double31 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.Plot plot32 = piePlot17.getParent();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot(pieDataset33);
        piePlot34.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        piePlot34.handleClick((int) (byte) 0, 100, plotRenderingInfo39);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getShadowYOffset();
        java.awt.Stroke stroke45 = piePlot42.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot(pieDataset46);
        double double48 = piePlot47.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        piePlot47.notifyListeners(plotChangeEvent49);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot47.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot47.getSimpleLabelOffset();
        piePlot42.setInsets(rectangleInsets52);
        piePlot34.setLabelPadding(rectangleInsets52);
        piePlot34.zoom((double) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier57 = piePlot34.getDrawingSupplier();
        java.awt.Stroke stroke58 = piePlot34.getBaseSectionOutlineStroke();
        piePlot17.setOutlineStroke(stroke58);
        piePlot1.setOutlineStroke(stroke58);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.14d + "'", double31 == 0.14d);
        org.junit.Assert.assertNull(plot32);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.0d + "'", double43 == 4.0d);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0E-5d + "'", double48 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets51);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(drawingSupplier57);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        java.awt.Paint paint24 = piePlot1.getShadowPaint();
        java.awt.Paint paint26 = piePlot1.lookupSectionPaint((java.lang.Comparable) 1.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot1.getLabelGenerator();
        piePlot1.setExplodePercent((java.lang.Comparable) (short) -1, (double) (short) -1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie Plot" + "'", str16, "Pie Plot");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator27);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        double double19 = piePlot1.getMaximumLabelWidth();
        java.awt.Stroke stroke20 = piePlot1.getLabelLinkStroke();
        boolean boolean21 = piePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie Plot" + "'", str11, "Pie Plot");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot1.setLegendLabelURLGenerator(pieURLGenerator7);
        piePlot1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        double double13 = piePlot12.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot12.notifyListeners(plotChangeEvent14);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = piePlot12.getToolTipGenerator();
        java.awt.Paint paint17 = piePlot12.getNoDataMessagePaint();
        piePlot12.setLabelGap(0.0d);
        java.awt.Paint paint22 = piePlot12.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setLabelBackgroundPaint(paint22);
        piePlot1.setIgnoreZeroValues(false);
        double double26 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.awt.Graphics2D graphics2D23 = null;
        java.util.List list24 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.plot.PiePlotState piePlotState28 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D23, list24, (double) (short) 100, rectangle2D26, rectangle2D27, piePlotState28);
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
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        boolean boolean12 = piePlot1.getLabelLinksVisible();
        java.lang.String str13 = piePlot1.getNoDataMessage();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.String str40 = piePlot24.getPlotType();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        piePlot42.setIgnoreNullValues(true);
        java.awt.Paint paint45 = piePlot42.getLabelPaint();
        boolean boolean46 = piePlot42.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot47 = piePlot42.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot42.getLegendLabelURLGenerator();
        int int49 = piePlot42.getPieIndex();
        piePlot42.setCircular(true);
        java.awt.Paint paint53 = piePlot42.lookupSectionOutlinePaint((java.lang.Comparable) '4');
        piePlot24.setBaseSectionPaint(paint53);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pie Plot" + "'", str40, "Pie Plot");
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(plot47);
        org.junit.Assert.assertNull(pieURLGenerator48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        int int9 = piePlot1.getPieIndex();
        java.awt.Graphics2D graphics2D10 = null;
        java.util.List list11 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D10, list11, (double) (-1), rectangle2D13, rectangle2D14, piePlotState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.String str40 = piePlot24.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent41 = null;
        piePlot24.datasetChanged(datasetChangeEvent41);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pie Plot" + "'", str40, "Pie Plot");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.awt.Shape shape16 = piePlot1.getLegendItemShape();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        double double19 = piePlot1.getMaximumLabelWidth();
        java.awt.Stroke stroke21 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot1.getURLGenerator();
        int int23 = piePlot1.getPieIndex();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie Plot" + "'", str11, "Pie Plot");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
        double double11 = piePlot1.getLabelLinkMargin();
        piePlot1.setOutlineVisible(true);
        boolean boolean14 = piePlot1.getSimpleLabels();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.lang.String str6 = piePlot1.getNoDataMessage();
        piePlot1.setSimpleLabels(true);
        boolean boolean9 = piePlot1.getSimpleLabels();
        java.awt.Stroke stroke10 = piePlot1.getLabelOutlineStroke();
        java.lang.String str11 = piePlot1.getNoDataMessage();
        double double12 = piePlot1.getShadowYOffset();
        java.lang.Comparable comparable14 = piePlot1.getSectionKey((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 97 + "'", comparable14, 97);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = null;
        piePlot1.setURLGenerator(pieURLGenerator21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie Plot" + "'", str11, "Pie Plot");
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setIgnoreZeroValues(false);
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
        piePlot1.setLabelOutlineStroke(stroke21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(pieSectionLabelGenerator18);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.lang.String str5 = piePlot1.getPlotType();
        java.awt.Paint paint7 = piePlot1.getSectionPaint((java.lang.Comparable) 1.0E-5d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getURLGenerator();
        piePlot1.setLabelLinkMargin((double) ' ');
        boolean boolean11 = piePlot1.getIgnoreZeroValues();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.ResourceBundle resourceBundle0 = null;
        org.jfree.chart.plot.PiePlot.localizationResources = resourceBundle0;
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = null;
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D10, rectangle2D11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot1.handleClick(0, 0, plotRenderingInfo9);
        double double11 = piePlot1.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setExplodePercent((java.lang.Comparable) (-1.0d), (-1.0d));
        boolean boolean13 = piePlot1.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        java.awt.Stroke stroke8 = piePlot1.getLabelLinkStroke();
        java.awt.Graphics2D graphics2D9 = null;
        java.util.List list10 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlotState piePlotState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D9, list10, (double) 1.0f, rectangle2D12, rectangle2D13, piePlotState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.util.List list17 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PiePlotState piePlotState21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D16, list17, (double) 0.5f, rectangle2D19, rectangle2D20, piePlotState21);
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
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        piePlot1.setIgnoreZeroValues(true);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot1.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(pieSectionLabelGenerator18);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        org.jfree.data.KeyedValues keyedValues12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PiePlotState piePlotState17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues12, graphics2D13, rectangle2D14, rectangle2D15, (float) 97, piePlotState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.awt.Paint paint24 = piePlot1.getLabelShadowPaint();
        java.lang.Class<?> wildcardClass25 = paint24.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        boolean boolean12 = piePlot1.getLabelLinksVisible();
        piePlot1.setSimpleLabels(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.jfree.data.KeyedValues keyedValues15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PiePlotState piePlotState20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues15, graphics2D16, rectangle2D17, rectangle2D18, (float) 0L, piePlotState20);
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
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.awt.Paint paint17 = piePlot1.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PiePlotState piePlotState21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D18, 100, rectangle2D20, piePlotState21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.Comparable comparable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint28 = piePlot1.getSectionPaint(comparable27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.08d + "'", double26 == 0.08d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot20.handleClick((int) (byte) 0, 100, plotRenderingInfo25);
        java.awt.Paint paint27 = piePlot20.getBaseSectionPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        piePlot20.addChangeListener(plotChangeListener28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState32 = piePlot1.initialise(graphics2D17, rectangle2D18, piePlot20, (java.lang.Integer) 0, plotRenderingInfo31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D29 = piePlot1.getArcBounds(rectangle2D24, rectangle2D25, 0.025d, 1.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = piePlot1.getPlotType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.lang.Object obj8 = piePlot1.clone();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        piePlot1.setMaximumLabelWidth((double) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint10 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot1.setCircular(false);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
        java.awt.Paint paint10 = piePlot1.getShadowPaint();
        piePlot1.zoom((double) (-1.0f));
        piePlot1.setShadowXOffset((double) 100L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Graphics2D graphics2D3 = null;
        java.util.List list4 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PiePlotState piePlotState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D3, list4, 0.08d, rectangle2D6, rectangle2D7, piePlotState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        org.jfree.data.KeyedValues keyedValues17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PiePlotState piePlotState22 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues17, graphics2D18, rectangle2D19, rectangle2D20, 10.0f, piePlotState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(pieDataset16);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
        piePlot1.setShadowYOffset((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 90.0d + "'", double39 == 90.0d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot(pieDataset15);
        piePlot16.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot16.handleClick((int) (byte) 0, 100, plotRenderingInfo21);
        java.awt.Paint paint23 = piePlot16.getBaseSectionPaint();
        java.awt.Image image24 = null;
        piePlot16.setBackgroundImage(image24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot16.getLabelPadding();
        piePlot1.setInsets(rectangleInsets26, false);
        org.jfree.chart.LegendItemCollection legendItemCollection29 = piePlot1.getLegendItems();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D30, rectangle2D31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(legendItemCollection29);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        int int14 = piePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.awt.Stroke stroke20 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.PiePlotState piePlotState7 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D6, piePlotState7, pieLabelRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke13 = piePlot1.getSectionOutlineStroke(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.awt.Stroke stroke21 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.0f, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot1.getLegendLabelURLGenerator();
        boolean boolean23 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        // The following exception was thrown during execution in test generation
        try {
            double double10 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.plot.Plot plot9 = piePlot1.getRootPlot();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        piePlot1.setForegroundAlpha(10.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot1.getLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        int int6 = piePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        piePlot1.setForegroundAlpha(1.0f);
        piePlot1.setSectionOutlinesVisible(true);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.plot.PiePlotState piePlotState30 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D27, 15, rectangle2D29, piePlotState30, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot1.getLegendLabelToolTipGenerator();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = piePlot1.getToolTipGenerator();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNull(pieToolTipGenerator8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(rectangle2D23);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
        java.awt.Paint paint10 = piePlot1.getShadowPaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        piePlot1.handleClick(0, (int) (short) 1, plotRenderingInfo38);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot(pieDataset41);
        double double43 = piePlot42.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        piePlot42.notifyListeners(plotChangeEvent44);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = piePlot42.getSimpleLabelOffset();
        boolean boolean47 = piePlot42.getIgnoreNullValues();
        piePlot42.setForegroundAlpha((float) 1);
        double double50 = piePlot42.getStartAngle();
        boolean boolean51 = piePlot42.isOutlineVisible();
        java.awt.Stroke stroke52 = piePlot42.getLabelOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setSectionOutlineStroke((java.lang.Comparable) "", stroke52);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.String (java.lang.Character and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0E-5d + "'", double43 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 90.0d + "'", double50 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        piePlot1.setForegroundAlpha(10.0f);
        java.awt.Paint paint13 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.awt.Paint paint24 = piePlot1.getLabelShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = piePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(drawingSupplier25);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        java.awt.Paint paint8 = piePlot1.getLabelOutlinePaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot1.getLabelGenerator();
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D15 = piePlot1.getArcBounds(rectangle2D10, rectangle2D11, 100.0d, 0.025d, 4.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        java.awt.Paint paint24 = piePlot1.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInsets(rectangleInsets25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        piePlot24.drawBackgroundImage(graphics2D40, rectangle2D41);
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
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setExplodePercent(comparable21, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(datasetGroup18);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.plot.PiePlotState piePlotState20 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D19, piePlotState20, pieLabelRecord21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        piePlot1.addChangeListener(plotChangeListener9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        piePlot1.setLabelGap((double) 0);
        piePlot1.setStartAngle((double) (-1.0f));
        java.awt.Paint paint10 = piePlot1.getLabelBackgroundPaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        piePlot1.setOutlineVisible(false);
        java.awt.Paint paint19 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        piePlot1.removeChangeListener(plotChangeListener20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D27, rectangle2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke25 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Character (java.lang.Double and java.lang.Character are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        int int9 = piePlot1.getPieIndex();
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState11 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D10, piePlotState11, pieLabelRecord12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        float float8 = piePlot1.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        piePlot10.setIgnoreNullValues(true);
        java.awt.Paint paint13 = piePlot10.getLabelPaint();
        java.awt.Image image14 = null;
        piePlot10.setBackgroundImage(image14);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot10.setToolTipGenerator(pieToolTipGenerator16);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.setIgnoreNullValues(true);
        java.awt.Paint paint23 = piePlot20.getLabelPaint();
        java.awt.Paint paint24 = piePlot20.getNoDataMessagePaint();
        piePlot10.setSectionPaint((java.lang.Comparable) 0, paint24);
        java.awt.Paint paint28 = piePlot10.lookupSectionOutlinePaint((java.lang.Comparable) '4', false);
        piePlot1.setNoDataMessagePaint(paint28);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.awt.Stroke stroke43 = piePlot17.getOutlineStroke();
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
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint13 = piePlot1.lookupSectionOutlinePaint(comparable11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D14, piePlotState15, pieLabelRecord16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.plot.PiePlotState piePlotState44 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord45 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D43, piePlotState44, pieLabelRecord45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 90.0d + "'", double39 == 90.0d);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        boolean boolean14 = piePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        piePlot1.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        float float9 = piePlot1.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        piePlot1.setLabelGap(0.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        piePlot1.datasetChanged(datasetChangeEvent9);
        java.awt.Stroke stroke13 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (-1.0d), false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = piePlot1.getPlotType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.awt.Paint paint6 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke7 = piePlot1.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState11 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D10, piePlotState11, pieLabelRecord12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rotation27);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        piePlot1.setLabelLinkMargin((double) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot1.getDatasetGroup();
        piePlot1.setShadowXOffset((double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        boolean boolean12 = piePlot1.getLabelLinksVisible();
        double double13 = piePlot1.getStartAngle();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        boolean boolean33 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint34 = piePlot1.getBaseSectionOutlinePaint();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setStartAngle((double) 10);
        float float8 = piePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint9 = null;
        piePlot1.setBackgroundPaint(paint9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.ResourceBundle resourceBundle0 = org.jfree.chart.plot.PiePlot.localizationResources;
        org.jfree.chart.plot.PiePlot.localizationResources = resourceBundle0;
        org.jfree.chart.plot.PiePlot.localizationResources = resourceBundle0;
        org.junit.Assert.assertNull(resourceBundle0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke22 = piePlot1.lookupSectionOutlineStroke(comparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        int int12 = piePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        java.lang.Object obj9 = piePlot1.clone();
        piePlot1.setLabelGap((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        java.awt.Paint paint13 = piePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieDataset12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        java.awt.Stroke stroke4 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) true);
        java.awt.Paint paint6 = piePlot1.getSectionPaint((java.lang.Comparable) (short) -1);
        piePlot1.setSectionOutlinesVisible(true);
        java.awt.Graphics2D graphics2D9 = null;
        java.util.List list10 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlotState piePlotState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D9, list10, (double) 10, rectangle2D12, rectangle2D13, piePlotState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(paint6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.awt.Paint paint17 = piePlot1.getLabelOutlinePaint();
        java.awt.Stroke stroke19 = piePlot1.getSectionOutlineStroke((java.lang.Comparable) 97);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(stroke19);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.awt.Stroke stroke21 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) 0.0f, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot1.getLegendLabelURLGenerator();
        piePlot1.setCircular(false, true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(pieURLGenerator22);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Stroke stroke3 = null;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) '#', stroke3);
        java.awt.Paint paint6 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0);
        java.awt.Stroke stroke7 = piePlot1.getLabelLinkStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot1.markerChanged(markerChangeEvent8);
        float float10 = piePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.awt.Stroke stroke36 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBaseSectionOutlineStroke(stroke36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(image31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.util.List list13 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PiePlotState piePlotState17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D12, list13, 0.14d, rectangle2D15, rectangle2D16, piePlotState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        piePlot14.setLabelGap(0.0d);
        float float23 = piePlot14.getForegroundAlpha();
        boolean boolean24 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot14.setURLGenerator(pieURLGenerator25);
        boolean boolean27 = piePlot14.getIgnoreNullValues();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        piePlot14.markerChanged(markerChangeEvent28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState32 = piePlot1.initialise(graphics2D11, rectangle2D12, piePlot14, (java.lang.Integer) 10, plotRenderingInfo31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.util.List list16 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PiePlotState piePlotState20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D15, list16, (double) 15, rectangle2D18, rectangle2D19, piePlotState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator18);
        java.awt.Paint paint21 = piePlot13.lookupSectionOutlinePaint((java.lang.Comparable) "Pie Plot");
        boolean boolean22 = piePlot1.equals((java.lang.Object) paint21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        double double25 = piePlot24.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot24.notifyListeners(plotChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot24.getSimpleLabelOffset();
        java.awt.Font font29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot24.setNoDataMessageFont(font29);
        java.awt.Font font31 = piePlot24.getLabelFont();
        piePlot1.setNoDataMessageFont(font31);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint8 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 0L);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        piePlot1.addChangeListener(plotChangeListener25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot(pieDataset27);
        java.awt.Stroke stroke30 = null;
        piePlot28.setSectionOutlineStroke((java.lang.Comparable) '#', stroke30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        double double34 = piePlot33.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        piePlot33.notifyListeners(plotChangeEvent35);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator37 = piePlot33.getToolTipGenerator();
        java.awt.Paint paint38 = piePlot33.getNoDataMessagePaint();
        piePlot33.setLabelGap(0.0d);
        java.awt.Paint paint43 = piePlot33.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot28.setLabelPaint(paint43);
        java.awt.Paint paint45 = piePlot28.getLabelLinkPaint();
        piePlot28.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset48 = null;
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot(pieDataset48);
        piePlot49.setIgnoreNullValues(true);
        java.awt.Paint paint52 = piePlot49.getLabelPaint();
        java.awt.Image image53 = null;
        piePlot49.setBackgroundImage(image53);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator55 = null;
        piePlot49.setToolTipGenerator(pieToolTipGenerator55);
        boolean boolean57 = piePlot49.getIgnoreNullValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = piePlot49.getSimpleLabelOffset();
        piePlot28.setLabelPadding(rectangleInsets58);
        piePlot1.setInsets(rectangleInsets58);
        java.lang.Class<?> wildcardClass61 = rectangleInsets58.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(pieDataset23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(rectangleInsets58);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Image image10 = piePlot1.getBackgroundImage();
        float float11 = piePlot1.getBackgroundImageAlpha();
        double double13 = piePlot1.getExplodePercent((java.lang.Comparable) 90.0d);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        piePlot1.addChangeListener(plotChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = null;
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot(pieDataset51);
        piePlot52.setIgnoreNullValues(true);
        java.awt.Paint paint55 = piePlot52.getLabelPaint();
        java.awt.Image image56 = null;
        piePlot52.setBackgroundImage(image56);
        java.awt.Paint paint58 = piePlot52.getLabelShadowPaint();
        piePlot52.setShadowXOffset(90.0d);
        piePlot52.setForegroundAlpha(10.0f);
        piePlot52.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset66 = null;
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot(pieDataset66);
        piePlot67.setIgnoreNullValues(true);
        java.awt.Paint paint70 = piePlot67.getLabelPaint();
        java.awt.Image image71 = null;
        piePlot67.setBackgroundImage(image71);
        java.awt.Paint paint73 = piePlot67.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset74 = null;
        piePlot67.setDataset(pieDataset74);
        piePlot52.setParent((org.jfree.chart.plot.Plot) piePlot67);
        org.jfree.data.general.PieDataset pieDataset77 = null;
        org.jfree.chart.plot.PiePlot piePlot78 = new org.jfree.chart.plot.PiePlot(pieDataset77);
        double double79 = piePlot78.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent80 = null;
        piePlot78.notifyListeners(plotChangeEvent80);
        org.jfree.chart.util.RectangleInsets rectangleInsets82 = piePlot78.getSimpleLabelOffset();
        java.awt.Font font83 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot78.setNoDataMessageFont(font83);
        java.awt.Font font85 = piePlot78.getLabelFont();
        piePlot67.setNoDataMessageFont(font85);
        piePlot1.setNoDataMessageFont(font85);
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
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0E-5d + "'", double79 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets82);
        org.junit.Assert.assertNotNull(font83);
        org.junit.Assert.assertNotNull(font85);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        boolean boolean14 = piePlot1.isSubplot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        double double51 = piePlot1.getShadowXOffset();
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
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4.0d + "'", double51 == 4.0d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        java.awt.Paint paint8 = piePlot1.getLabelShadowPaint();
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.PiePlotState piePlotState10 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D9, piePlotState10, pieLabelRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.awt.Paint paint16 = piePlot1.getLabelLinkPaint();
        java.lang.Class<?> wildcardClass17 = paint16.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint14 = piePlot1.lookupSectionPaint(comparable12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        double double34 = piePlot33.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot33.getSimpleLabelOffset();
        piePlot1.setLabelPadding(rectangleInsets35);
        piePlot1.setExplodePercent((java.lang.Comparable) 100.0d, (double) 10.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets35);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        piePlot1.datasetChanged(datasetChangeEvent13);
        piePlot1.setIgnoreNullValues(false);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PiePlotState piePlotState24 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D21, 1, rectangle2D23, piePlotState24, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot1.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(datasetGroup18);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.util.List list13 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PiePlotState piePlotState17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D12, list13, (double) '4', rectangle2D15, rectangle2D16, piePlotState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100 + "'", comparable8, 100);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        java.awt.Shape shape24 = piePlot1.getLegendItemShape();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        java.awt.geom.Point2D point2D27 = null;
        org.jfree.chart.plot.PlotState plotState28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D25, rectangle2D26, point2D27, plotState28, plotRenderingInfo29);
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
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        double double26 = piePlot1.getShadowYOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        piePlot1.setCircular(true, false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getInteriorGap();
        org.jfree.chart.util.Rotation rotation5 = piePlot1.getDirection();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot1.addChangeListener(plotChangeListener6);
        double double8 = piePlot1.getStartAngle();
        java.lang.Class<?> wildcardClass9 = piePlot1.getClass();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNotNull(rotation5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot1.getDatasetGroup();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setExplodePercent((java.lang.Comparable) 1.0d, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setExplodePercent((java.lang.Comparable) (byte) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Byte (java.lang.Double and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        java.awt.Image image22 = null;
        piePlot18.setBackgroundImage(image22);
        java.awt.Paint paint24 = piePlot18.getLabelShadowPaint();
        piePlot18.setShadowXOffset(90.0d);
        piePlot18.setForegroundAlpha(10.0f);
        piePlot18.setCircular(true, false);
        double double32 = piePlot18.getShadowYOffset();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot18.getLabelDistributor();
        piePlot1.setLabelDistributor(abstractPieLabelDistributor33);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (97.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot1.getLabelPadding();
        piePlot1.setLabelGap((double) (-1L));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.plot.PiePlotState piePlotState13 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D12, piePlotState13, pieLabelRecord14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(pieSectionLabelGenerator11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Image image7 = piePlot1.getBackgroundImage();
        boolean boolean8 = piePlot1.isSubplot();
        java.awt.Paint paint9 = piePlot1.getLabelPaint();
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState11 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D10, piePlotState11, pieLabelRecord12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D8, (int) (short) 1, rectangle2D10, piePlotState11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        piePlot1.handleClick(0, (int) (short) 1, plotRenderingInfo38);
        boolean boolean40 = piePlot1.getIgnoreNullValues();
        java.awt.Font font41 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setLabelFont(font41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        java.awt.Paint paint9 = piePlot1.getOutlinePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot1.setURLGenerator(pieURLGenerator10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setStartAngle((double) 10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot1.addChangeListener(plotChangeListener8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot1.getLabelDistributor();
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot1.getDatasetGroup();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        piePlot1.notifyListeners(plotChangeEvent10);
        java.awt.Paint paint12 = piePlot1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        piePlot1.setForegroundAlpha(1.0f);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot(pieDataset9);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot10.getLegendLabelGenerator();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot10.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke13);
        piePlot1.setLabelLinkStroke(stroke13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        java.awt.Stroke stroke7 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) (short) 10);
        double double8 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot1.setDataset(pieDataset9);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        piePlot1.notifyListeners(plotChangeEvent11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = piePlot1.getLegendItems();
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D14, piePlotState15, pieLabelRecord16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        java.awt.Paint paint10 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        piePlot1.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        piePlot14.datasetChanged(datasetChangeEvent18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        piePlot14.addChangeListener(plotChangeListener20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot14.getLabelGenerator();
        piePlot1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator22);
        double double24 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.util.List list14 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PiePlotState piePlotState18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D13, list14, (double) (byte) 1, rectangle2D16, rectangle2D17, piePlotState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setShadowXOffset(90.0d);
        piePlot1.setForegroundAlpha(10.0f);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        piePlot1.notifyListeners(plotChangeEvent12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D14, rectangle2D15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = piePlot1.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Font font9 = piePlot1.getLabelFont();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot1.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        piePlot1.axisChanged(axisChangeEvent14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.awt.Paint paint12 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot1.setBaseSectionOutlinePaint(paint12);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        piePlot1.removeChangeListener(plotChangeListener14);
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.awt.Paint paint42 = piePlot24.getOutlinePaint();
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
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot1.setURLGenerator(pieURLGenerator4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        double double14 = piePlot13.getShadowYOffset();
        java.awt.Image image15 = piePlot13.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Image image20 = null;
        piePlot13.setBackgroundImage(image20);
        java.awt.Stroke stroke24 = piePlot13.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot13.getInsets();
        piePlot1.setInsets(rectangleInsets25, false);
        java.awt.Paint paint28 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Image image3 = piePlot1.getBackgroundImage();
        piePlot1.setIgnoreZeroValues(false);
        java.awt.Paint paint6 = piePlot1.getOutlinePaint();
        double double7 = piePlot1.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.plot.PiePlotState piePlotState29 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord30 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawLeftLabel(graphics2D28, piePlotState29, pieLabelRecord30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
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
        double double21 = piePlot11.getLabelLinkMargin();
        boolean boolean22 = piePlot11.isCircular();
        boolean boolean23 = piePlot11.getIgnoreZeroValues();
        piePlot11.setMaximumLabelWidth((double) 0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot11.getInsets();
        piePlot1.setInsets(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.025d + "'", double21 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.plot.PiePlotState piePlotState16 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabel(graphics2D15, piePlotState16, pieLabelRecord17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        java.awt.Font font8 = piePlot1.getLabelFont();
        double double9 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot1.getURLGenerator();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot(pieDataset20);
        double double22 = piePlot21.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        piePlot21.notifyListeners(plotChangeEvent23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot21.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot21.getSimpleLabelOffset();
        java.awt.Paint paint28 = piePlot21.getSectionOutlinePaint((java.lang.Comparable) "hi!");
        piePlot21.setCircular(false);
        piePlot21.setLabelGap(0.0d);
        java.awt.Paint paint33 = piePlot21.getLabelBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState36 = piePlot1.initialise(graphics2D18, rectangle2D19, piePlot21, (java.lang.Integer) 100, plotRenderingInfo35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        piePlot1.setSimpleLabels(false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.lang.String str8 = piePlot1.getNoDataMessage();
        java.awt.Stroke stroke9 = piePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState11 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D10, piePlotState11, pieLabelRecord12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        piePlot1.zoom((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.awt.Image image12 = null;
        piePlot1.setBackgroundImage(image12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D27, rectangle2D28);
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
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot(pieDataset26);
        double double28 = piePlot27.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot27.getSimpleLabelOffset();
        piePlot27.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot27.getLabelPadding();
        piePlot1.setLabelPadding(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0E-5d + "'", double28 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        piePlot1.setCircular(true);
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
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        boolean boolean14 = piePlot1.getIgnoreNullValues();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        piePlot1.markerChanged(markerChangeEvent15);
        java.lang.Comparable comparable18 = piePlot1.getSectionKey((int) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.plot.Plot plot9 = piePlot1.getRootPlot();
        plot9.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) (byte) 1, 0, plotRenderingInfo8);
        boolean boolean10 = piePlot1.getIgnoreZeroValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot1.getURLGenerator();
        piePlot1.setBackgroundImageAlpha((float) 1L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(pieURLGenerator17);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot(pieDataset31);
        piePlot32.setIgnoreNullValues(true);
        java.awt.Paint paint35 = piePlot32.getLabelPaint();
        java.awt.Image image36 = null;
        piePlot32.setBackgroundImage(image36);
        java.awt.Paint paint38 = piePlot32.getLabelShadowPaint();
        java.awt.Paint paint41 = piePlot32.lookupSectionPaint((java.lang.Comparable) "", false);
        piePlot1.setShadowPaint(paint41);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getInteriorGap();
        org.jfree.chart.util.Rotation rotation5 = piePlot1.getDirection();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot1.addChangeListener(plotChangeListener6);
        double double8 = piePlot1.getStartAngle();
        piePlot1.setShadowXOffset((double) 97);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNotNull(rotation5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getInsets();
        double double4 = piePlot1.getLabelLinkMargin();
        piePlot1.setStartAngle((double) 0L);
        float float7 = piePlot1.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.025d + "'", double4 == 0.025d);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        org.jfree.data.KeyedValues keyedValues16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PiePlotState piePlotState21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues16, graphics2D17, rectangle2D18, rectangle2D19, (float) 100, piePlotState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint6 = piePlot1.getLabelBackgroundPaint();
        double double7 = piePlot1.getStartAngle();
        java.awt.Paint paint8 = piePlot1.getLabelOutlinePaint();
        piePlot1.setLabelGap((double) 'a');
        piePlot1.setBackgroundImageAlignment(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawPie(graphics2D27, rectangle2D28, plotRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        boolean boolean10 = piePlot1.getIgnoreNullValues();
        piePlot1.setCircular(true, true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setInteriorGap((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (97.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.jfree.chart.util.Rotation rotation12 = piePlot1.getDirection();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(rotation12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Image image10 = piePlot1.getBackgroundImage();
        float float11 = piePlot1.getBackgroundImageAlpha();
        double double13 = piePlot1.getExplodePercent((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot1.addChangeListener(plotChangeListener7);
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot1.setShadowPaint(paint9);
        piePlot1.setExplodePercent((java.lang.Comparable) (short) 10, (double) 0L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot1.getLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        plot6.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = piePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot1.getDatasetGroup();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint17 = piePlot1.getSectionPaint(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        float float3 = piePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        piePlot1.handleClick(0, (int) (short) 1, plotRenderingInfo38);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        double double42 = piePlot41.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        piePlot41.notifyListeners(plotChangeEvent43);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot41.getSimpleLabelOffset();
        boolean boolean46 = piePlot41.getIgnoreNullValues();
        piePlot41.setForegroundAlpha((float) 1);
        double double49 = piePlot41.getStartAngle();
        boolean boolean50 = piePlot41.isOutlineVisible();
        java.awt.Stroke stroke51 = piePlot41.getLabelOutlineStroke();
        piePlot1.setOutlineStroke(stroke51);
        java.awt.Paint paint53 = piePlot1.getLabelShadowPaint();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0E-5d + "'", double42 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 90.0d + "'", double49 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = piePlot1.getLegendLabelToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.lookupSectionPaint((java.lang.Comparable) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator4);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator12);
        double double14 = piePlot1.getLabelGap();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        float float9 = piePlot1.getBackgroundImageAlpha();
        boolean boolean10 = piePlot1.getSimpleLabels();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.awt.Paint paint13 = piePlot1.lookupSectionPaint((java.lang.Comparable) 100L);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot1.getRootPlot();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot1.getLegendLabelURLGenerator();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot1.removeChangeListener(plotChangeListener8);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(pieURLGenerator7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.awt.Paint paint17 = piePlot1.getLabelOutlinePaint();
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot1.getSimpleLabelOffset();
        piePlot1.setNoDataMessage("Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getLabelPadding();
        org.jfree.data.KeyedValues keyedValues7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PiePlotState piePlotState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues7, graphics2D8, rectangle2D9, rectangle2D10, 0.5f, piePlotState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        double double3 = piePlot1.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = piePlot1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        piePlot1.setCircular(false, true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        boolean boolean12 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        boolean boolean46 = piePlot1.getLabelLinksVisible();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        boolean boolean9 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot1.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.util.List list15 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PiePlotState piePlotState19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D14, list15, (double) 10.0f, rectangle2D17, rectangle2D18, piePlotState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(pieURLGenerator4);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot1.getToolTipGenerator();
        java.awt.Paint paint6 = piePlot1.getNoDataMessagePaint();
        piePlot1.setLabelGap(0.0d);
        java.awt.Paint paint11 = piePlot1.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        java.awt.Stroke stroke12 = piePlot1.getLabelOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent42 = null;
        piePlot17.notifyListeners(plotChangeEvent42);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot17.drawOutline(graphics2D44, rectangle2D45);
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot(pieDataset24);
        double double26 = piePlot25.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        piePlot25.notifyListeners(plotChangeEvent27);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator29 = piePlot25.getToolTipGenerator();
        java.awt.Paint paint30 = piePlot25.getNoDataMessagePaint();
        piePlot25.setLabelGap(0.0d);
        java.awt.Paint paint35 = piePlot25.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot1.setBaseSectionPaint(paint35);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot1.removeChangeListener(plotChangeListener15);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.awt.Stroke stroke19 = piePlot1.getLabelOutlineStroke();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawBackground(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(rectangleInsets51);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        org.jfree.data.KeyedValues keyedValues25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.PiePlotState piePlotState30 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues25, graphics2D26, rectangle2D27, rectangle2D28, (float) (byte) 0, piePlotState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot(pieDataset3);
        piePlot4.setIgnoreNullValues(true);
        java.awt.Paint paint7 = piePlot4.getLabelPaint();
        piePlot1.setLabelPaint(paint7);
        java.awt.Font font9 = piePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.0d + "'", double2 == 90.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        java.awt.geom.Point2D point2D50 = null;
        org.jfree.chart.plot.PlotState plotState51 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.draw(graphics2D48, rectangle2D49, point2D50, plotState51, plotRenderingInfo52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot1.setURLGenerator(pieURLGenerator23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        double double44 = piePlot24.getShadowXOffset();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.0d + "'", double44 == 4.0d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot1.handleClick(0, 0, plotRenderingInfo9);
        piePlot1.setSectionOutlinesVisible(false);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        java.awt.Image image18 = null;
        piePlot14.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot14.getLabelShadowPaint();
        piePlot14.setShadowXOffset(90.0d);
        piePlot14.setForegroundAlpha(10.0f);
        piePlot14.setCircular(true, false);
        java.awt.Paint paint29 = piePlot14.lookupSectionOutlinePaint((java.lang.Comparable) 100.0d);
        piePlot1.setBaseSectionOutlinePaint(paint29);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        java.awt.Font font6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot1.setNoDataMessageFont(font6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot1.getLegendLabelURLGenerator();
        double double9 = piePlot1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        double double12 = piePlot11.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot(pieDataset13);
        piePlot14.setIgnoreNullValues(true);
        java.awt.Paint paint17 = piePlot14.getLabelPaint();
        piePlot11.setLabelPaint(paint17);
        boolean boolean19 = piePlot11.getSectionOutlinesVisible();
        boolean boolean20 = piePlot11.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot(pieDataset21);
        double double23 = piePlot22.getShadowYOffset();
        java.awt.Image image24 = piePlot22.getBackgroundImage();
        piePlot22.setIgnoreZeroValues(false);
        java.awt.Paint paint27 = piePlot22.getOutlinePaint();
        piePlot11.setNoDataMessagePaint(paint27);
        piePlot1.setNoDataMessagePaint(paint27);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.0d + "'", double23 == 4.0d);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        piePlot1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getShadowYOffset();
        java.awt.Image image22 = piePlot20.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot20.getLegendLabelURLGenerator();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot20.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Image image27 = null;
        piePlot20.setBackgroundImage(image27);
        java.awt.Stroke stroke31 = piePlot20.lookupSectionOutlineStroke((java.lang.Comparable) 4.0d, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot20.getInsets();
        piePlot1.setSimpleLabelOffset(rectangleInsets32);
        java.awt.Paint paint34 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.awt.Paint paint21 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setInteriorGap(0.08d);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot1.addChangeListener(plotChangeListener8);
        java.awt.Stroke stroke10 = piePlot1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.PiePlotState piePlotState25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawItem(graphics2D22, (int) (byte) 100, rectangle2D24, piePlotState25, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        boolean boolean15 = piePlot1.isSubplot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.lang.Class<?> wildcardClass16 = piePlot1.getClass();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot1.getURLGenerator();
        piePlot1.setLabelLinksVisible(true);
        org.jfree.data.KeyedValues keyedValues16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PiePlotState piePlotState21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabels(keyedValues16, graphics2D17, rectangle2D18, rectangle2D19, (float) 'a', piePlotState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieDataset12);
        org.junit.Assert.assertNull(pieURLGenerator13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        java.awt.Image image5 = null;
        piePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = piePlot1.getLabelShadowPaint();
        piePlot1.setLabelGap(0.0d);
        float float10 = piePlot1.getForegroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = piePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        boolean boolean6 = piePlot1.getIgnoreNullValues();
        piePlot1.setForegroundAlpha((float) 1);
        double double9 = piePlot1.getStartAngle();
        double double10 = piePlot1.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot1.getLegendLabelGenerator();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator29);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        piePlot1.setDataset(pieDataset16);
        double double19 = piePlot1.getExplodePercent((java.lang.Comparable) 90.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) (short) 100, (int) '4', plotRenderingInfo8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot(pieDataset12);
        piePlot13.setIgnoreNullValues(true);
        java.awt.Paint paint16 = piePlot13.getLabelPaint();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        double double21 = piePlot20.getShadowYOffset();
        java.awt.Stroke stroke23 = piePlot20.lookupSectionOutlineStroke((java.lang.Comparable) true);
        piePlot13.setSectionOutlineStroke((java.lang.Comparable) 100.0d, stroke23);
        piePlot13.setMaximumLabelWidth((double) 10L);
        java.awt.Stroke stroke27 = piePlot13.getLabelOutlineStroke();
        java.awt.Stroke stroke28 = piePlot13.getLabelOutlineStroke();
        piePlot1.setBaseSectionOutlineStroke(stroke28);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot1.notifyListeners(plotChangeEvent30);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        piePlot24.setBackgroundImageAlpha((float) 0L);
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D47 = piePlot24.getArcBounds(rectangle2D42, rectangle2D43, (double) (short) 10, (double) '#', (double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        piePlot1.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot1.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator7);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = null;
        piePlot1.setURLGenerator(pieURLGenerator14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.plot.PiePlotState piePlotState23 = null;
        org.jfree.chart.plot.PieLabelRecord pieLabelRecord24 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLeftLabel(graphics2D22, piePlotState23, pieLabelRecord24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        piePlot1.handleClick(1, (int) (short) 100, plotRenderingInfo22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator6);
        double double8 = piePlot1.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot1.getDatasetGroup();
        org.jfree.data.KeyedValues keyedValues10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlotState piePlotState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues10, graphics2D11, rectangle2D12, rectangle2D13, (float) 10, piePlotState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup9);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        boolean boolean20 = piePlot1.isSubplot();
        java.awt.Stroke stroke21 = piePlot1.getBaseSectionOutlineStroke();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        piePlot1.setBackgroundImageAlignment(15);
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        piePlot35.setSimpleLabels(true);
        int int38 = piePlot35.getBackgroundImageAlignment();
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot(pieDataset39);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator41 = piePlot40.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot40.getInsets();
        double double43 = piePlot40.getInteriorGap();
        org.jfree.chart.util.Rotation rotation44 = piePlot40.getDirection();
        piePlot35.setDirection(rotation44);
        piePlot1.setDirection(rotation44);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator41);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.08d + "'", double43 == 0.08d);
        org.junit.Assert.assertNotNull(rotation44);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.awt.Paint paint24 = piePlot1.getLabelOutlinePaint();
        java.lang.Class<?> wildcardClass25 = piePlot1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.awt.Font font14 = piePlot1.getLabelFont();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
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
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot18.setSimpleLabelOffset(rectangleInsets33);
        piePlot18.setCircular(true, false);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot(pieDataset38);
        java.awt.Stroke stroke41 = null;
        piePlot39.setSectionOutlineStroke((java.lang.Comparable) '#', stroke41);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        double double45 = piePlot44.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        piePlot44.notifyListeners(plotChangeEvent46);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator48 = piePlot44.getToolTipGenerator();
        java.awt.Paint paint49 = piePlot44.getNoDataMessagePaint();
        piePlot44.setLabelGap(0.0d);
        java.awt.Paint paint54 = piePlot44.lookupSectionOutlinePaint((java.lang.Comparable) 100.0f, false);
        piePlot39.setLabelPaint(paint54);
        java.awt.Paint paint56 = piePlot39.getLabelLinkPaint();
        piePlot39.setMaximumLabelWidth((double) (-1L));
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot piePlot60 = new org.jfree.chart.plot.PiePlot(pieDataset59);
        piePlot60.setIgnoreNullValues(true);
        java.awt.Paint paint63 = piePlot60.getLabelPaint();
        java.awt.Image image64 = null;
        piePlot60.setBackgroundImage(image64);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator66 = null;
        piePlot60.setToolTipGenerator(pieToolTipGenerator66);
        boolean boolean68 = piePlot60.getIgnoreZeroValues();
        java.awt.Paint paint69 = piePlot60.getShadowPaint();
        piePlot39.setLabelPaint(paint69);
        piePlot18.setLabelShadowPaint(paint69);
        java.awt.Paint paint74 = piePlot18.lookupSectionPaint((java.lang.Comparable) '4', false);
        org.jfree.data.general.PieDataset pieDataset75 = null;
        org.jfree.chart.plot.PiePlot piePlot76 = new org.jfree.chart.plot.PiePlot(pieDataset75);
        double double77 = piePlot76.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent78 = null;
        piePlot76.notifyListeners(plotChangeEvent78);
        org.jfree.chart.util.RectangleInsets rectangleInsets80 = piePlot76.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets81 = piePlot76.getSimpleLabelOffset();
        java.awt.Paint paint82 = piePlot76.getLabelBackgroundPaint();
        float float83 = piePlot76.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets84 = piePlot76.getInsets();
        piePlot18.setSimpleLabelOffset(rectangleInsets84);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState88 = piePlot1.initialise(graphics2D15, rectangle2D16, piePlot18, (java.lang.Integer) 97, plotRenderingInfo87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0E-5d + "'", double45 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0E-5d + "'", double77 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets80);
        org.junit.Assert.assertNotNull(rectangleInsets81);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + 0.5f + "'", float83 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets84);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(pieDataset23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getShadowYOffset();
        java.awt.Stroke stroke4 = piePlot1.lookupSectionOutlineStroke((java.lang.Comparable) true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot1.getLegendLabelGenerator();
        piePlot1.setInteriorGap(0.08d);
        piePlot1.setMinimumArcAngleToDraw(1.0E-5d);
        piePlot1.setLabelGap(90.0d);
        java.awt.Font font12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setLabelFont(font12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        java.awt.Paint paint34 = piePlot1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        double double11 = piePlot1.getMaximumLabelWidth();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        double double18 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0E-5d + "'", double38 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(paint67);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = piePlot1.getDrawingSupplier();
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D20 = piePlot1.getArcBounds(rectangle2D15, rectangle2D16, (double) 1.0f, (double) 0.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        double double2 = piePlot1.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot1.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot1.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot1.getSimpleLabelOffset();
        java.awt.Paint paint7 = piePlot1.getLabelBackgroundPaint();
        piePlot1.setStartAngle(0.025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-5d + "'", double2 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        boolean boolean14 = piePlot1.isSubplot();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot18.notifyListeners(plotChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot18.getSimpleLabelOffset();
        boolean boolean23 = piePlot18.getIgnoreNullValues();
        java.awt.Image image24 = piePlot18.getBackgroundImage();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot(pieDataset25);
        piePlot26.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot26.getLabelPaint();
        boolean boolean30 = piePlot26.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot31 = piePlot26.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        piePlot26.axisChanged(axisChangeEvent32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = piePlot26.getDrawingSupplier();
        piePlot18.setDrawingSupplier(drawingSupplier34);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator36 = piePlot18.getLegendLabelGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState39 = piePlot1.initialise(graphics2D15, rectangle2D16, piePlot18, (java.lang.Integer) 15, plotRenderingInfo38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator36);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass23 = stroke22.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        java.awt.Paint paint4 = piePlot1.getLabelPaint();
        boolean boolean5 = piePlot1.getIgnoreZeroValues();
        java.awt.Shape shape6 = piePlot1.getLegendItemShape();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot1.handleClick(0, 0, plotRenderingInfo9);
        java.awt.Font font11 = piePlot1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        float float40 = piePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D41 = null;
        java.util.List list42 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.plot.PiePlotState piePlotState46 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawLabels(graphics2D41, list42, (double) (short) 1, rectangle2D44, rectangle2D45, piePlotState46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        float float14 = piePlot1.getForegroundAlpha();
        piePlot1.setMaximumLabelWidth(0.0d);
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
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot(pieDataset32);
        piePlot33.setIgnoreNullValues(true);
        java.awt.Paint paint36 = piePlot33.getLabelPaint();
        java.awt.Image image37 = null;
        piePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = piePlot33.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        piePlot33.setDataset(pieDataset40);
        piePlot18.setParent((org.jfree.chart.plot.Plot) piePlot33);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot(pieDataset43);
        double double45 = piePlot44.getMinimumArcAngleToDraw();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        piePlot44.notifyListeners(plotChangeEvent46);
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = piePlot44.getSimpleLabelOffset();
        java.awt.Paint paint49 = piePlot44.getLabelBackgroundPaint();
        piePlot33.setLabelPaint(paint49);
        piePlot33.setForegroundAlpha((float) (short) 0);
        java.awt.Paint paint53 = piePlot33.getLabelBackgroundPaint();
        piePlot1.setOutlinePaint(paint53);
        java.awt.Paint paint55 = piePlot1.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0E-5d + "'", double45 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.jfree.chart.util.Rotation rotation39 = piePlot1.getDirection();
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
        org.junit.Assert.assertNotNull(rotation39);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        piePlot1.setBackgroundImageAlignment((int) (short) -1);
        java.awt.Paint paint36 = piePlot1.getSectionOutlinePaint((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator29);
        org.junit.Assert.assertNull(paint36);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot(pieDataset17);
        double double19 = piePlot18.getShadowYOffset();
        java.awt.Image image20 = piePlot18.getBackgroundImage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot18.getLegendLabelURLGenerator();
        java.awt.Font font22 = piePlot18.getNoDataMessageFont();
        piePlot1.setNoDataMessageFont(font22);
        java.awt.Stroke stroke24 = piePlot1.getLabelLinkStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.lang.String str22 = piePlot1.getNoDataMessage();
        org.jfree.data.KeyedValues keyedValues23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PiePlotState piePlotState28 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawRightLabels(keyedValues23, graphics2D24, rectangle2D25, rectangle2D26, (float) (short) 0, piePlotState28);
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot1.getLegendLabelGenerator();
        int int16 = piePlot1.getBackgroundImageAlignment();
        piePlot1.setForegroundAlpha((float) (short) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08d + "'", double10 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.setIgnoreNullValues(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.handleClick((int) (byte) 0, 100, plotRenderingInfo6);
        double double8 = piePlot1.getLabelGap();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = null;
        piePlot1.setToolTipGenerator(pieToolTipGenerator9);
        java.awt.Graphics2D graphics2D11 = null;
        java.util.List list12 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PiePlotState piePlotState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D11, list12, (double) (byte) 10, rectangle2D14, rectangle2D15, piePlotState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator2 = piePlot1.getLegendLabelGenerator();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot1.handleClick((int) (short) 100, (int) '4', plotRenderingInfo8);
        piePlot1.setSectionOutlinesVisible(true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator2);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        boolean boolean19 = piePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot1.getURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator13);
    }
}

