package org.jfree.chart.renderer.category;

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
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator10, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer13.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer13.setBaseOutlinePaint(paint17);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint17, false);
        boolean boolean23 = minMaxCategoryRenderer0.getItemCreateEntity(1, (int) (short) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer24 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer24.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer24.setBaseOutlinePaint(paint28);
        minMaxCategoryRenderer24.removeAnnotations();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer24.setGroupStroke(stroke31);
        int int33 = minMaxCategoryRenderer24.getPassCount();
        java.awt.Shape shape34 = minMaxCategoryRenderer24.getBaseShape();
        minMaxCategoryRenderer0.setBaseShape(shape34, false);
        java.awt.Font font39 = minMaxCategoryRenderer0.getItemLabelFont((int) '#', (int) '4');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(font39);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font5 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = minMaxCategoryRenderer0.getSeriesURLGenerator(0);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) '4', categoryItemLabelGenerator12);
        java.awt.Shape shape15 = minMaxCategoryRenderer0.getSeriesShape((int) (short) 1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean12 = minMaxCategoryRenderer10.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer10.setSeriesOutlineStroke((int) (short) 100, stroke14, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer17.setGroupStroke(stroke24);
        int int26 = minMaxCategoryRenderer17.getPassCount();
        java.awt.Shape shape27 = minMaxCategoryRenderer17.getBaseShape();
        java.awt.Font font28 = minMaxCategoryRenderer17.getBaseItemLabelFont();
        minMaxCategoryRenderer10.setBaseItemLabelFont(font28, false);
        org.jfree.chart.LegendItem legendItem33 = minMaxCategoryRenderer10.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseItemLabelPaint(paint34, false);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint34);
        boolean boolean39 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) -1);
        javax.swing.Icon icon40 = minMaxCategoryRenderer0.getMaxIcon();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation41 = null;
        org.jfree.chart.util.Layer layer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.addAnnotation(categoryAnnotation41, layer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(legendItem33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(icon40);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke6 = minMaxCategoryRenderer0.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10);
        java.awt.Paint paint13 = minMaxCategoryRenderer0.getSeriesFillPaint((int) '4');
        java.awt.Stroke stroke15 = minMaxCategoryRenderer0.getSeriesOutlineStroke((int) ' ');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = minMaxCategoryRenderer0.getBaseURLGenerator();
        int int17 = minMaxCategoryRenderer0.getColumnCount();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNull(categoryURLGenerator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisible(10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = minMaxCategoryRenderer0.getSeriesURLGenerator((int) (byte) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) '4', categoryItemLabelGenerator7, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean13 = minMaxCategoryRenderer11.getSeriesCreateEntities((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = minMaxCategoryRenderer11.getBaseToolTipGenerator();
        org.jfree.chart.LegendItem legendItem17 = minMaxCategoryRenderer11.getLegendItem((int) (short) 0, 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        minMaxCategoryRenderer11.setBaseURLGenerator(categoryURLGenerator18, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer22 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer22.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer22.setBaseOutlinePaint(paint26);
        minMaxCategoryRenderer22.removeAnnotations();
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer22.setGroupStroke(stroke29);
        int int31 = minMaxCategoryRenderer22.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = minMaxCategoryRenderer22.getPlot();
        java.awt.Paint paint33 = minMaxCategoryRenderer22.getBaseOutlinePaint();
        minMaxCategoryRenderer11.setSeriesFillPaint((int) (byte) 10, paint33, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = null;
        minMaxCategoryRenderer11.setBaseItemLabelGenerator(categoryItemLabelGenerator36);
        boolean boolean38 = minMaxCategoryRenderer11.getAutoPopulateSeriesFillPaint();
        java.awt.Paint paint41 = minMaxCategoryRenderer11.getItemPaint((int) '#', (-1));
        minMaxCategoryRenderer0.setSeriesPaint((int) 'a', paint41, false);
        int int44 = minMaxCategoryRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer46 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer46.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer46.setBaseOutlinePaint(paint50);
        minMaxCategoryRenderer46.removeAnnotations();
        java.awt.Stroke stroke53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer46.setGroupStroke(stroke53);
        minMaxCategoryRenderer46.setBaseCreateEntities(true);
        java.awt.Font font59 = minMaxCategoryRenderer46.getItemLabelFont((int) (byte) 10, 0);
        java.awt.Paint paint62 = minMaxCategoryRenderer46.getItemOutlinePaint((int) (byte) 1, (int) 'a');
        minMaxCategoryRenderer0.setSeriesOutlinePaint((int) (short) 10, paint62);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer68 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer68.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint72 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer68.setBaseOutlinePaint(paint72);
        minMaxCategoryRenderer68.removeAnnotations();
        boolean boolean75 = minMaxCategoryRenderer68.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator76 = minMaxCategoryRenderer68.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator78 = null;
        minMaxCategoryRenderer68.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator78, false);
        java.awt.Font font81 = minMaxCategoryRenderer68.getBaseItemLabelFont();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator83 = minMaxCategoryRenderer68.getSeriesToolTipGenerator((int) (byte) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator85 = minMaxCategoryRenderer68.getSeriesURLGenerator(10);
        java.awt.Stroke stroke88 = minMaxCategoryRenderer68.getItemOutlineStroke((int) ' ', (int) '#');
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (byte) 1, stroke88, false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNull(legendItem17);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(categoryPlot32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(font59);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator76);
        org.junit.Assert.assertNotNull(font81);
        org.junit.Assert.assertNull(categoryToolTipGenerator83);
        org.junit.Assert.assertNull(categoryURLGenerator85);
        org.junit.Assert.assertNotNull(stroke88);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11);
        boolean boolean13 = minMaxCategoryRenderer0.getBaseCreateEntities();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer16 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint18 = minMaxCategoryRenderer16.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = minMaxCategoryRenderer16.hasListener(eventListener19);
        java.awt.Paint paint21 = minMaxCategoryRenderer16.getGroupPaint();
        minMaxCategoryRenderer0.setSeriesOutlinePaint((int) 'a', paint21);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer23 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = minMaxCategoryRenderer23.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.util.Layer layer32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawAnnotations(graphics2D28, rectangle2D29, categoryAxis30, valueAxis31, layer32, plotRenderingInfo33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font5 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer6.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint10);
        minMaxCategoryRenderer6.removeAnnotations();
        boolean boolean13 = minMaxCategoryRenderer6.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer14.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer14.setBaseOutlinePaint(paint18);
        minMaxCategoryRenderer14.removeAnnotations();
        boolean boolean21 = minMaxCategoryRenderer14.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = minMaxCategoryRenderer14.getBaseItemLabelGenerator();
        boolean boolean23 = minMaxCategoryRenderer14.getBaseSeriesVisible();
        javax.swing.Icon icon24 = minMaxCategoryRenderer14.getMaxIcon();
        minMaxCategoryRenderer6.setMinIcon(icon24);
        minMaxCategoryRenderer0.setMaxIcon(icon24);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer27 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer27.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer27.setBaseOutlinePaint(paint31);
        minMaxCategoryRenderer27.removeAnnotations();
        boolean boolean34 = minMaxCategoryRenderer27.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer35 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = minMaxCategoryRenderer35.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer27.setBasePositiveItemLabelPosition(itemLabelPosition38);
        java.awt.Paint paint40 = minMaxCategoryRenderer27.getBaseItemLabelPaint();
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint40, false);
        java.awt.Paint paint45 = minMaxCategoryRenderer0.getItemFillPaint((-1), (int) (byte) -1);
        java.awt.Paint paint47 = minMaxCategoryRenderer0.lookupSeriesFillPaint((int) (byte) 10);
        java.lang.Boolean boolean49 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (byte) 100);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(icon24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(boolean49);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisible(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = minMaxCategoryRenderer8.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        minMaxCategoryRenderer8.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator12);
        minMaxCategoryRenderer8.setBaseItemLabelsVisible(true, true);
        boolean boolean17 = minMaxCategoryRenderer8.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent18 = null;
        minMaxCategoryRenderer8.notifyListeners(rendererChangeEvent18);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer20 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer20.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer20.setBaseOutlinePaint(paint24);
        minMaxCategoryRenderer20.removeAnnotations();
        boolean boolean27 = minMaxCategoryRenderer20.getBaseSeriesVisible();
        minMaxCategoryRenderer20.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        minMaxCategoryRenderer20.setBaseItemLabelGenerator(categoryItemLabelGenerator31);
        boolean boolean33 = minMaxCategoryRenderer20.getBaseCreateEntities();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = minMaxCategoryRenderer20.getPlot();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer36 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint38 = minMaxCategoryRenderer36.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = minMaxCategoryRenderer36.hasListener(eventListener39);
        java.awt.Paint paint41 = minMaxCategoryRenderer36.getGroupPaint();
        minMaxCategoryRenderer20.setSeriesOutlinePaint((int) 'a', paint41);
        minMaxCategoryRenderer8.setBaseFillPaint(paint41);
        minMaxCategoryRenderer0.setSeriesOutlinePaint((int) (byte) 10, paint41);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent45 = null;
        minMaxCategoryRenderer0.notifyListeners(rendererChangeEvent45);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(categoryPlot34);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator9, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = minMaxCategoryRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint9 = minMaxCategoryRenderer7.getSeriesPaint((int) ' ');
        boolean boolean10 = minMaxCategoryRenderer7.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        minMaxCategoryRenderer7.setBaseToolTipGenerator(categoryToolTipGenerator11);
        minMaxCategoryRenderer7.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint19 = minMaxCategoryRenderer7.getItemFillPaint(100, 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = minMaxCategoryRenderer7.getNegativeItemLabelPosition((int) '#', (int) (byte) 0);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition22);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer27 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer27.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer27.setBaseOutlinePaint(paint31);
        minMaxCategoryRenderer27.removeAnnotations();
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer27.setGroupStroke(stroke34);
        int int36 = minMaxCategoryRenderer27.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = minMaxCategoryRenderer27.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = minMaxCategoryRenderer27.getSeriesPositiveItemLabelPosition((int) (short) 10);
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition39, true);
        java.awt.Stroke stroke43 = minMaxCategoryRenderer0.lookupSeriesOutlineStroke((int) (byte) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(categoryPlot37);
        org.junit.Assert.assertNotNull(itemLabelPosition39);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true, true);
        minMaxCategoryRenderer0.removeAnnotations();
        minMaxCategoryRenderer0.setBaseCreateEntities(true, false);
        java.awt.Paint paint30 = minMaxCategoryRenderer0.getItemPaint(1, 0);
        java.awt.Stroke stroke31 = minMaxCategoryRenderer0.getBaseStroke();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean12 = minMaxCategoryRenderer10.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer10.setSeriesOutlineStroke((int) (short) 100, stroke14, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer17.setGroupStroke(stroke24);
        int int26 = minMaxCategoryRenderer17.getPassCount();
        java.awt.Shape shape27 = minMaxCategoryRenderer17.getBaseShape();
        java.awt.Font font28 = minMaxCategoryRenderer17.getBaseItemLabelFont();
        minMaxCategoryRenderer10.setBaseItemLabelFont(font28, false);
        org.jfree.chart.LegendItem legendItem33 = minMaxCategoryRenderer10.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseItemLabelPaint(paint34, false);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint34);
        boolean boolean39 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = minMaxCategoryRenderer0.getNegativeItemLabelPosition((int) (short) 10, 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation43 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.addAnnotation(categoryAnnotation43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(legendItem33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint8 = minMaxCategoryRenderer6.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = minMaxCategoryRenderer6.hasListener(eventListener9);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint11, true);
        java.awt.Paint paint16 = minMaxCategoryRenderer6.getItemLabelPaint(1, 10);
        minMaxCategoryRenderer0.setSeriesPaint((int) ' ', paint16, false);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        java.awt.Paint paint20 = minMaxCategoryRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer21 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer21.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer21.setBaseOutlinePaint(paint25);
        minMaxCategoryRenderer21.removeAnnotations();
        boolean boolean28 = minMaxCategoryRenderer21.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = minMaxCategoryRenderer21.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        minMaxCategoryRenderer21.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator31, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = minMaxCategoryRenderer21.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.plot.Marker marker38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        minMaxCategoryRenderer21.drawRangeMarker(graphics2D35, categoryPlot36, valueAxis37, marker38, rectangle2D39);
        java.awt.Stroke stroke42 = minMaxCategoryRenderer21.getSeriesStroke((int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = minMaxCategoryRenderer21.getURLGenerator((int) (short) -1, 10);
        java.awt.Shape shape47 = minMaxCategoryRenderer21.getSeriesShape(10);
        java.awt.Paint paint48 = minMaxCategoryRenderer21.getBaseOutlinePaint();
        minMaxCategoryRenderer0.setBasePaint(paint48, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNull(stroke42);
        org.junit.Assert.assertNull(categoryURLGenerator45);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator51);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke6 = minMaxCategoryRenderer0.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, true);
        boolean boolean15 = minMaxCategoryRenderer0.getBaseCreateEntities();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = minMaxCategoryRenderer0.getDrawingSupplier();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = minMaxCategoryRenderer0.getNegativeItemLabelPosition((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(drawingSupplier16);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        int int7 = minMaxCategoryRenderer0.getPassCount();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = minMaxCategoryRenderer0.getItemLabelGenerator((int) (byte) 0, 100);
        java.awt.Stroke stroke12 = minMaxCategoryRenderer0.lookupSeriesStroke(1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = minMaxCategoryRenderer0.getItemLabelGenerator((int) (short) -1, (int) (byte) 1);
        minMaxCategoryRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer10.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseOutlinePaint(paint14);
        minMaxCategoryRenderer10.removeAnnotations();
        boolean boolean17 = minMaxCategoryRenderer10.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = minMaxCategoryRenderer10.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = null;
        minMaxCategoryRenderer10.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator20, false);
        java.awt.Paint paint23 = null;
        minMaxCategoryRenderer10.setBasePaint(paint23);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = minMaxCategoryRenderer10.getLegendItemLabelGenerator();
        minMaxCategoryRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator25);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        boolean boolean28 = minMaxCategoryRenderer0.removeAnnotation(categoryAnnotation27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = minMaxCategoryRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        minMaxCategoryRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        boolean boolean10 = minMaxCategoryRenderer0.getBaseCreateEntities();
        minMaxCategoryRenderer0.setAutoPopulateSeriesStroke(false);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Font font24 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) (byte) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = minMaxCategoryRenderer0.getBaseURLGenerator();
        org.jfree.chart.LegendItem legendItem28 = minMaxCategoryRenderer0.getLegendItem((int) (short) 10, (int) (short) 100);
        java.awt.Paint paint31 = minMaxCategoryRenderer0.getItemFillPaint(100, (int) (short) 10);
        java.awt.Font font34 = minMaxCategoryRenderer0.getItemLabelFont(0, (int) (byte) 100);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(categoryURLGenerator25);
        org.junit.Assert.assertNull(legendItem28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(font34);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint10, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint15 = minMaxCategoryRenderer13.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = minMaxCategoryRenderer13.hasListener(eventListener16);
        javax.swing.Icon icon18 = minMaxCategoryRenderer13.getMinIcon();
        minMaxCategoryRenderer0.setObjectIcon(icon18);
        minMaxCategoryRenderer0.setBaseSeriesVisible(false);
        boolean boolean22 = minMaxCategoryRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer23 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint25 = minMaxCategoryRenderer23.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = minMaxCategoryRenderer23.hasListener(eventListener26);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation28 = null;
        boolean boolean29 = minMaxCategoryRenderer23.removeAnnotation(categoryAnnotation28);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer30 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer30.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer30.setBaseOutlinePaint(paint34);
        minMaxCategoryRenderer30.removeAnnotations();
        boolean boolean37 = minMaxCategoryRenderer30.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = minMaxCategoryRenderer30.getBaseItemLabelGenerator();
        boolean boolean39 = minMaxCategoryRenderer30.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer40 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean42 = minMaxCategoryRenderer40.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer40.setSeriesOutlineStroke((int) (short) 100, stroke44, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer47 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer47.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer47.setBaseOutlinePaint(paint51);
        minMaxCategoryRenderer47.removeAnnotations();
        java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer47.setGroupStroke(stroke54);
        int int56 = minMaxCategoryRenderer47.getPassCount();
        java.awt.Shape shape57 = minMaxCategoryRenderer47.getBaseShape();
        java.awt.Font font58 = minMaxCategoryRenderer47.getBaseItemLabelFont();
        minMaxCategoryRenderer40.setBaseItemLabelFont(font58, false);
        org.jfree.chart.LegendItem legendItem63 = minMaxCategoryRenderer40.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint64 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer40.setBaseItemLabelPaint(paint64, false);
        minMaxCategoryRenderer30.setBaseOutlinePaint(paint64);
        boolean boolean68 = minMaxCategoryRenderer23.equals((java.lang.Object) paint64);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator69 = minMaxCategoryRenderer23.getLegendItemLabelGenerator();
        minMaxCategoryRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator69);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(icon18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(font58);
        org.junit.Assert.assertNull(legendItem63);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator69);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint5, true);
        java.awt.Paint paint10 = minMaxCategoryRenderer0.getItemLabelPaint(1, 10);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint13 = minMaxCategoryRenderer11.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer14.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer19 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer19.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer19.setBaseOutlinePaint(paint23);
        minMaxCategoryRenderer14.setSeriesFillPaint((int) 'a', paint23);
        minMaxCategoryRenderer11.setBaseItemLabelPaint(paint23, true);
        minMaxCategoryRenderer11.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = null;
        minMaxCategoryRenderer11.setBaseURLGenerator(categoryURLGenerator31);
        java.awt.Font font35 = minMaxCategoryRenderer11.getItemLabelFont((int) (short) 100, (int) (byte) 10);
        java.awt.Paint paint37 = minMaxCategoryRenderer11.lookupSeriesFillPaint((int) (byte) 1);
        java.awt.Shape shape39 = minMaxCategoryRenderer11.getSeriesShape((int) (byte) 100);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = null;
        minMaxCategoryRenderer11.setLegendItemURLGenerator(categorySeriesLabelGenerator40);
        boolean boolean42 = minMaxCategoryRenderer0.equals((java.lang.Object) minMaxCategoryRenderer11);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        boolean boolean7 = minMaxCategoryRenderer0.getItemCreateEntity((int) '4', (int) (short) 1);
        minMaxCategoryRenderer0.setBaseSeriesVisible(true);
        boolean boolean10 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = minMaxCategoryRenderer11.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        minMaxCategoryRenderer11.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator15);
        minMaxCategoryRenderer11.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer20 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer20.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer20.setBaseOutlinePaint(paint24);
        java.lang.Boolean boolean27 = minMaxCategoryRenderer20.getSeriesVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer28.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint34 = minMaxCategoryRenderer28.getItemPaint((int) (byte) 100, 1);
        minMaxCategoryRenderer20.setBaseFillPaint(paint34);
        java.awt.Shape shape38 = minMaxCategoryRenderer20.getItemShape((int) (short) 100, 0);
        minMaxCategoryRenderer11.setSeriesShape((int) (short) 10, shape38);
        java.awt.Paint paint40 = minMaxCategoryRenderer11.getGroupPaint();
        minMaxCategoryRenderer0.setBaseFillPaint(paint40, false);
        java.awt.Paint paint44 = minMaxCategoryRenderer0.getSeriesItemLabelPaint((int) (byte) 100);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(paint44);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        java.awt.Font font13 = minMaxCategoryRenderer0.getItemLabelFont((int) (byte) 10, 0);
        java.awt.Paint paint16 = minMaxCategoryRenderer0.getItemOutlinePaint((int) (byte) 1, (int) 'a');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        boolean boolean24 = minMaxCategoryRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = minMaxCategoryRenderer17.getBaseItemLabelGenerator();
        boolean boolean26 = minMaxCategoryRenderer17.getBaseSeriesVisible();
        minMaxCategoryRenderer17.setBaseItemLabelsVisible(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer29.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer29.setBaseOutlinePaint(paint33);
        minMaxCategoryRenderer29.removeAnnotations();
        boolean boolean36 = minMaxCategoryRenderer29.getBaseSeriesVisible();
        minMaxCategoryRenderer29.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer29.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer43 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = minMaxCategoryRenderer43.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer29.setBaseNegativeItemLabelPosition(itemLabelPosition46, false);
        java.awt.Font font50 = minMaxCategoryRenderer29.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer29.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        boolean boolean55 = minMaxCategoryRenderer29.getBaseItemLabelsVisible();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent56 = null;
        minMaxCategoryRenderer29.notifyListeners(rendererChangeEvent56);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer58 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer58.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer58.setBaseOutlinePaint(paint62);
        minMaxCategoryRenderer58.removeAnnotations();
        boolean boolean65 = minMaxCategoryRenderer58.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator66 = minMaxCategoryRenderer58.getBaseItemLabelGenerator();
        boolean boolean67 = minMaxCategoryRenderer58.getBaseSeriesVisible();
        javax.swing.Icon icon68 = minMaxCategoryRenderer58.getMaxIcon();
        minMaxCategoryRenderer29.setMinIcon(icon68);
        minMaxCategoryRenderer17.setMinIcon(icon68);
        minMaxCategoryRenderer0.setObjectIcon(icon68);
        java.lang.Boolean boolean73 = minMaxCategoryRenderer0.getSeriesVisibleInLegend((int) 'a');
        boolean boolean74 = minMaxCategoryRenderer0.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertNull(font50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(icon68);
        org.junit.Assert.assertNull(boolean73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11);
        java.awt.Paint paint14 = minMaxCategoryRenderer0.getSeriesItemLabelPaint(0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer15 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer15.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer15.setBaseOutlinePaint(paint19);
        minMaxCategoryRenderer15.removeAnnotations();
        boolean boolean22 = minMaxCategoryRenderer15.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = minMaxCategoryRenderer15.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        minMaxCategoryRenderer15.setLegendItemToolTipGenerator(categorySeriesLabelGenerator24);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer15.getNegativeItemLabelPosition((int) (byte) 0, (int) '4');
        java.awt.Paint paint31 = minMaxCategoryRenderer15.getItemOutlinePaint((int) (short) 100, (int) (byte) -1);
        minMaxCategoryRenderer0.setBaseFillPaint(paint31);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        boolean boolean10 = minMaxCategoryRenderer0.removeAnnotation(categoryAnnotation9);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint13 = minMaxCategoryRenderer11.getSeriesPaint((int) ' ');
        boolean boolean14 = minMaxCategoryRenderer11.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        minMaxCategoryRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator15);
        minMaxCategoryRenderer11.setBaseCreateEntities(false);
        minMaxCategoryRenderer11.setSeriesItemLabelsVisible(1, (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer23 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer23.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer23.setBaseOutlinePaint(paint27);
        minMaxCategoryRenderer23.removeAnnotations();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer23.setGroupStroke(stroke30);
        int int32 = minMaxCategoryRenderer23.getPassCount();
        java.awt.Shape shape33 = minMaxCategoryRenderer23.getBaseShape();
        java.awt.Font font34 = minMaxCategoryRenderer23.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer35 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint37 = minMaxCategoryRenderer35.getSeriesPaint((int) ' ');
        boolean boolean38 = minMaxCategoryRenderer35.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator39 = null;
        minMaxCategoryRenderer35.setBaseToolTipGenerator(categoryToolTipGenerator39);
        minMaxCategoryRenderer35.setBaseCreateEntities(false);
        boolean boolean44 = minMaxCategoryRenderer35.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer45 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint47 = minMaxCategoryRenderer45.getSeriesPaint((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator48 = minMaxCategoryRenderer45.getLegendItemLabelGenerator();
        minMaxCategoryRenderer35.setLegendItemToolTipGenerator(categorySeriesLabelGenerator48);
        minMaxCategoryRenderer23.setLegendItemToolTipGenerator(categorySeriesLabelGenerator48);
        minMaxCategoryRenderer11.setLegendItemURLGenerator(categorySeriesLabelGenerator48);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer53 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer53.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer53.setBaseOutlinePaint(paint57);
        minMaxCategoryRenderer53.removeAnnotations();
        java.awt.Stroke stroke60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer53.setGroupStroke(stroke60);
        int int62 = minMaxCategoryRenderer53.getPassCount();
        java.awt.Shape shape63 = minMaxCategoryRenderer53.getBaseShape();
        minMaxCategoryRenderer11.setSeriesShape(0, shape63);
        javax.swing.Icon icon65 = minMaxCategoryRenderer11.getObjectIcon();
        minMaxCategoryRenderer0.setMinIcon(icon65);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(paint47);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator48);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(shape63);
        org.junit.Assert.assertNotNull(icon65);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer13.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer13.setBaseOutlinePaint(paint17);
        minMaxCategoryRenderer13.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = minMaxCategoryRenderer13.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        java.awt.Stroke stroke24 = minMaxCategoryRenderer13.getItemStroke(0, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = minMaxCategoryRenderer13.getNegativeItemLabelPosition((int) (short) 10, (int) (byte) 1);
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 0, itemLabelPosition27, true);
        java.awt.Paint paint32 = minMaxCategoryRenderer0.getItemFillPaint(1, 10);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator20);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = minMaxCategoryRenderer0.getSeriesURLGenerator((int) (byte) 0);
        boolean boolean24 = minMaxCategoryRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer26 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean28 = minMaxCategoryRenderer26.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = minMaxCategoryRenderer26.hasListener(eventListener29);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer31 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint33 = minMaxCategoryRenderer31.getSeriesPaint((int) ' ');
        boolean boolean34 = minMaxCategoryRenderer31.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke37 = minMaxCategoryRenderer31.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer26.setBaseStroke(stroke37, true);
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesStroke((int) (short) -1, stroke37, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryURLGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer4 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer4.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer4.setBaseOutlinePaint(paint8);
        minMaxCategoryRenderer4.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint13 = minMaxCategoryRenderer11.getSeriesPaint((int) ' ');
        boolean boolean14 = minMaxCategoryRenderer11.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        minMaxCategoryRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator15);
        minMaxCategoryRenderer11.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint23 = minMaxCategoryRenderer11.getItemFillPaint(100, 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = minMaxCategoryRenderer11.getNegativeItemLabelPosition((int) '#', (int) (byte) 0);
        minMaxCategoryRenderer4.setBaseNegativeItemLabelPosition(itemLabelPosition26);
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition26);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer29.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer29.setBaseOutlinePaint(paint33);
        minMaxCategoryRenderer29.removeAnnotations();
        boolean boolean36 = minMaxCategoryRenderer29.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = minMaxCategoryRenderer29.getBaseItemLabelGenerator();
        boolean boolean38 = minMaxCategoryRenderer29.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer39 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean41 = minMaxCategoryRenderer39.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer39.setSeriesOutlineStroke((int) (short) 100, stroke43, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer46 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer46.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer46.setBaseOutlinePaint(paint50);
        minMaxCategoryRenderer46.removeAnnotations();
        java.awt.Stroke stroke53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer46.setGroupStroke(stroke53);
        int int55 = minMaxCategoryRenderer46.getPassCount();
        java.awt.Shape shape56 = minMaxCategoryRenderer46.getBaseShape();
        java.awt.Font font57 = minMaxCategoryRenderer46.getBaseItemLabelFont();
        minMaxCategoryRenderer39.setBaseItemLabelFont(font57, false);
        org.jfree.chart.LegendItem legendItem62 = minMaxCategoryRenderer39.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint63 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer39.setBaseItemLabelPaint(paint63, false);
        minMaxCategoryRenderer29.setBaseOutlinePaint(paint63);
        boolean boolean68 = minMaxCategoryRenderer29.isSeriesVisibleInLegend((int) (byte) -1);
        javax.swing.Icon icon69 = minMaxCategoryRenderer29.getMaxIcon();
        minMaxCategoryRenderer0.setMaxIcon(icon69);
        java.awt.Stroke stroke71 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        org.jfree.chart.event.RendererChangeListener rendererChangeListener72 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.addChangeListener(rendererChangeListener72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(shape56);
        org.junit.Assert.assertNotNull(font57);
        org.junit.Assert.assertNull(legendItem62);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(icon69);
        org.junit.Assert.assertNotNull(stroke71);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        boolean boolean7 = minMaxCategoryRenderer0.getItemCreateEntity((int) '4', (int) (short) 1);
        boolean boolean8 = minMaxCategoryRenderer0.isDrawLines();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true, true);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer25.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer25.setBaseOutlinePaint(paint29);
        minMaxCategoryRenderer25.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = minMaxCategoryRenderer25.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean35 = minMaxCategoryRenderer25.isSeriesVisibleInLegend(1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer36 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer36.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer36.setBaseOutlinePaint(paint40);
        minMaxCategoryRenderer36.removeAnnotations();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer36.setGroupStroke(stroke43);
        minMaxCategoryRenderer36.setBaseCreateEntities(true);
        java.awt.Font font49 = minMaxCategoryRenderer36.getItemLabelFont((int) (byte) 10, 0);
        minMaxCategoryRenderer25.setBaseItemLabelFont(font49, true);
        minMaxCategoryRenderer0.setBaseItemLabelFont(font49, false);
        java.awt.Shape shape55 = minMaxCategoryRenderer0.getSeriesShape((int) (byte) 0);
        double double56 = minMaxCategoryRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer58 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer58.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer58.setBaseOutlinePaint(paint62);
        minMaxCategoryRenderer58.removeAnnotations();
        java.awt.Stroke stroke65 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer58.setGroupStroke(stroke65);
        minMaxCategoryRenderer58.setBaseCreateEntities(true);
        java.awt.Font font71 = minMaxCategoryRenderer58.getItemLabelFont((int) (byte) 10, 0);
        java.awt.Paint paint74 = minMaxCategoryRenderer58.getItemOutlinePaint((int) (byte) 1, (int) 'a');
        java.awt.Stroke stroke76 = minMaxCategoryRenderer58.lookupSeriesOutlineStroke(10);
        minMaxCategoryRenderer0.setSeriesStroke((int) (byte) 0, stroke76, true);
        minMaxCategoryRenderer0.setBaseCreateEntities(false, true);
        boolean boolean82 = minMaxCategoryRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.0d + "'", double56 == 2.0d);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(font71);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint5 = minMaxCategoryRenderer0.getSeriesPaint((int) '4');
        minMaxCategoryRenderer0.setAutoPopulateSeriesStroke(false);
        org.junit.Assert.assertNull(paint5);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint5, true);
        minMaxCategoryRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, false);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, true);
        java.awt.Stroke stroke15 = minMaxCategoryRenderer0.getGroupStroke();
        java.awt.Paint paint17 = minMaxCategoryRenderer0.lookupSeriesFillPaint((-1));
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator9);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) 'a', (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setBaseCreateEntities(true, true);
        boolean boolean17 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlinePaint();
        minMaxCategoryRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = minMaxCategoryRenderer0.getPositiveItemLabelPosition((int) (byte) -1, 100);
        java.awt.Stroke stroke4 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(itemLabelPosition3);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean12 = minMaxCategoryRenderer10.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer10.setSeriesOutlineStroke((int) (short) 100, stroke14, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer17.setGroupStroke(stroke24);
        int int26 = minMaxCategoryRenderer17.getPassCount();
        java.awt.Shape shape27 = minMaxCategoryRenderer17.getBaseShape();
        java.awt.Font font28 = minMaxCategoryRenderer17.getBaseItemLabelFont();
        minMaxCategoryRenderer10.setBaseItemLabelFont(font28, false);
        org.jfree.chart.LegendItem legendItem33 = minMaxCategoryRenderer10.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseItemLabelPaint(paint34, false);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint34);
        boolean boolean39 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) -1);
        javax.swing.Icon icon40 = minMaxCategoryRenderer0.getMaxIcon();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer41 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint43 = minMaxCategoryRenderer41.getSeriesPaint((int) ' ');
        boolean boolean44 = minMaxCategoryRenderer41.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = null;
        minMaxCategoryRenderer41.setBaseToolTipGenerator(categoryToolTipGenerator45);
        minMaxCategoryRenderer41.setBaseCreateEntities(false);
        java.awt.Font font50 = minMaxCategoryRenderer41.getSeriesItemLabelFont((-1));
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer52 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer52.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint56 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer52.setBaseOutlinePaint(paint56);
        minMaxCategoryRenderer52.removeAnnotations();
        boolean boolean59 = minMaxCategoryRenderer52.getBaseSeriesVisible();
        minMaxCategoryRenderer52.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer52.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer66 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = minMaxCategoryRenderer66.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer52.setBaseNegativeItemLabelPosition(itemLabelPosition69, false);
        java.awt.Font font73 = minMaxCategoryRenderer52.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer52.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        boolean boolean78 = minMaxCategoryRenderer52.getBaseItemLabelsVisible();
        java.awt.Shape shape79 = minMaxCategoryRenderer52.getBaseShape();
        minMaxCategoryRenderer41.setSeriesShape(100, shape79, false);
        boolean boolean82 = minMaxCategoryRenderer41.isDrawLines();
        java.awt.Stroke stroke85 = minMaxCategoryRenderer41.getItemStroke(1, (int) '#');
        minMaxCategoryRenderer0.setBaseStroke(stroke85, false);
        boolean boolean88 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(legendItem33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(icon40);
        org.junit.Assert.assertNull(paint43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(font50);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition69);
        org.junit.Assert.assertNull(font73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(shape79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(stroke85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font18, false);
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem((int) (byte) 0, (int) 'a');
        boolean boolean26 = minMaxCategoryRenderer0.getItemVisible((int) (short) 10, (-1));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator(1, categoryItemLabelGenerator30, true);
        minMaxCategoryRenderer0.setDrawLines(false);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNull(categoryPlot28);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        boolean boolean6 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) '4');
        boolean boolean8 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) '#');
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator((int) (short) 1, categoryURLGenerator12);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean10 = minMaxCategoryRenderer0.isSeriesVisibleInLegend(1);
        java.awt.Paint paint12 = minMaxCategoryRenderer0.getSeriesOutlinePaint((int) (short) 1);
        minMaxCategoryRenderer0.removeAnnotations();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, false);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        double double21 = minMaxCategoryRenderer17.getItemLabelAnchorOffset();
        boolean boolean22 = minMaxCategoryRenderer17.isDrawLines();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer23 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean25 = minMaxCategoryRenderer23.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = minMaxCategoryRenderer23.hasListener(eventListener26);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean31 = minMaxCategoryRenderer29.getSeriesCreateEntities((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = minMaxCategoryRenderer29.getBaseToolTipGenerator();
        org.jfree.chart.LegendItem legendItem35 = minMaxCategoryRenderer29.getLegendItem((int) (short) 0, 10);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer37 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer37.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer37.setBaseOutlinePaint(paint41);
        minMaxCategoryRenderer37.removeAnnotations();
        boolean boolean44 = minMaxCategoryRenderer37.getBaseSeriesVisible();
        minMaxCategoryRenderer37.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer37.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke53 = minMaxCategoryRenderer37.getItemStroke((int) ' ', (int) '#');
        minMaxCategoryRenderer29.setSeriesOutlineStroke(10, stroke53, false);
        minMaxCategoryRenderer23.setSeriesStroke((int) (short) 10, stroke53);
        boolean boolean57 = minMaxCategoryRenderer23.getBaseSeriesVisible();
        java.awt.Paint paint58 = minMaxCategoryRenderer23.getBasePaint();
        minMaxCategoryRenderer17.setBaseFillPaint(paint58, false);
        minMaxCategoryRenderer0.setSeriesFillPaint((int) (short) 100, paint58, true);
        java.awt.Paint paint64 = minMaxCategoryRenderer0.getSeriesItemLabelPaint((int) (byte) 1);
        boolean boolean66 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(categoryToolTipGenerator32);
        org.junit.Assert.assertNull(legendItem35);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNull(paint64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer11.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer11.setBaseOutlinePaint(paint15);
        minMaxCategoryRenderer11.removeAnnotations();
        java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer11.setGroupStroke(stroke18);
        int int20 = minMaxCategoryRenderer11.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = minMaxCategoryRenderer11.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = minMaxCategoryRenderer11.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        boolean boolean25 = minMaxCategoryRenderer11.getAutoPopulateSeriesOutlinePaint();
        javax.swing.Icon icon26 = minMaxCategoryRenderer11.getObjectIcon();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer27 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint29 = minMaxCategoryRenderer27.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = minMaxCategoryRenderer27.hasListener(eventListener30);
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer27.setBaseOutlinePaint(paint32, true);
        minMaxCategoryRenderer11.setBaseFillPaint(paint32);
        minMaxCategoryRenderer0.setBasePaint(paint32);
        java.awt.Stroke stroke39 = minMaxCategoryRenderer0.getItemOutlineStroke((int) '#', (int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator40);
        boolean boolean43 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (short) 10);
        java.awt.Graphics2D graphics2D44 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawItem(graphics2D44, categoryItemRendererState45, rectangle2D46, categoryPlot47, categoryAxis48, valueAxis49, categoryDataset50, (int) '4', (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(categoryPlot21);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(icon26);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        boolean boolean16 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) '4');
        java.awt.Shape shape19 = minMaxCategoryRenderer0.getItemShape((int) (short) 0, (int) (byte) 100);
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawDomainGridline(graphics2D20, categoryPlot21, rectangle2D22, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator10, false);
        java.awt.Paint paint14 = minMaxCategoryRenderer0.lookupSeriesFillPaint((int) (byte) 100);
        boolean boolean17 = minMaxCategoryRenderer0.isItemLabelVisible((int) (byte) 100, (int) (byte) 10);
        java.awt.Shape shape19 = minMaxCategoryRenderer0.lookupSeriesShape((int) (byte) -1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint7 = minMaxCategoryRenderer5.getSeriesPaint((int) ' ');
        boolean boolean8 = minMaxCategoryRenderer5.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke11 = minMaxCategoryRenderer5.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer0.setBaseStroke(stroke11, true);
        boolean boolean14 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.addAnnotation(categoryAnnotation15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint6 = minMaxCategoryRenderer0.lookupSeriesPaint((int) (short) 1);
        javax.swing.Icon icon7 = minMaxCategoryRenderer0.getMinIcon();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator10);
        java.lang.Boolean boolean13 = minMaxCategoryRenderer0.getSeriesVisible(100);
        java.awt.Paint paint15 = minMaxCategoryRenderer0.lookupSeriesPaint(0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(icon7);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator9);
        boolean boolean11 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlinePaint();
        boolean boolean12 = minMaxCategoryRenderer0.getAutoPopulateSeriesShape();
        minMaxCategoryRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true);
        javax.swing.Icon icon16 = minMaxCategoryRenderer0.getMinIcon();
        java.awt.Stroke stroke17 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState23 = minMaxCategoryRenderer0.initialise(graphics2D18, rectangle2D19, categoryPlot20, (int) 'a', plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(icon16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean12 = minMaxCategoryRenderer10.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer10.setSeriesOutlineStroke((int) (short) 100, stroke14, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer17.setGroupStroke(stroke24);
        int int26 = minMaxCategoryRenderer17.getPassCount();
        java.awt.Shape shape27 = minMaxCategoryRenderer17.getBaseShape();
        java.awt.Font font28 = minMaxCategoryRenderer17.getBaseItemLabelFont();
        minMaxCategoryRenderer10.setBaseItemLabelFont(font28, false);
        org.jfree.chart.LegendItem legendItem33 = minMaxCategoryRenderer10.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseItemLabelPaint(paint34, false);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint34);
        boolean boolean39 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) -1);
        java.awt.Font font42 = minMaxCategoryRenderer0.getItemLabelFont((int) '4', (int) (short) 0);
        java.awt.Shape shape44 = null;
        minMaxCategoryRenderer0.setSeriesShape((int) 'a', shape44);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(legendItem33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(font42);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint7 = minMaxCategoryRenderer5.getSeriesPaint((int) ' ');
        boolean boolean8 = minMaxCategoryRenderer5.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke11 = minMaxCategoryRenderer5.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer0.setBaseStroke(stroke11, true);
        boolean boolean14 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Paint paint16 = minMaxCategoryRenderer0.getSeriesOutlinePaint(0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.awt.Stroke stroke4 = minMaxCategoryRenderer0.getSeriesStroke(100);
        boolean boolean6 = minMaxCategoryRenderer0.isSeriesVisible((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer8.removeAnnotations();
        java.awt.Stroke stroke15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer8.setGroupStroke(stroke15);
        int int17 = minMaxCategoryRenderer8.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = minMaxCategoryRenderer8.getPlot();
        java.awt.Paint paint19 = minMaxCategoryRenderer8.getBaseOutlinePaint();
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint19, true);
        java.awt.Paint paint22 = minMaxCategoryRenderer0.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawAnnotations(graphics2D25, rectangle2D26, categoryAxis27, valueAxis28, layer29, plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryPlot7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(categoryPlot18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisible(10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = minMaxCategoryRenderer0.getSeriesURLGenerator((int) (byte) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) '4', categoryItemLabelGenerator7, false);
        java.awt.Paint paint11 = minMaxCategoryRenderer0.getSeriesPaint((int) (byte) -1);
        minMaxCategoryRenderer0.setItemLabelAnchorOffset((-1.0d));
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer14.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer14.setBaseOutlinePaint(paint18);
        minMaxCategoryRenderer14.removeAnnotations();
        boolean boolean21 = minMaxCategoryRenderer14.getBaseSeriesVisible();
        minMaxCategoryRenderer14.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer14.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = minMaxCategoryRenderer28.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer14.setBaseNegativeItemLabelPosition(itemLabelPosition31, false);
        java.awt.Font font35 = minMaxCategoryRenderer14.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer14.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        boolean boolean40 = minMaxCategoryRenderer14.getBaseItemLabelsVisible();
        java.awt.Shape shape41 = minMaxCategoryRenderer14.getBaseShape();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer42 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer42.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer42.setBaseOutlinePaint(paint46);
        minMaxCategoryRenderer42.removeAnnotations();
        boolean boolean49 = minMaxCategoryRenderer42.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator50 = minMaxCategoryRenderer42.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = null;
        minMaxCategoryRenderer42.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator52, false);
        java.awt.Paint paint55 = null;
        minMaxCategoryRenderer42.setBasePaint(paint55);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator57 = minMaxCategoryRenderer42.getLegendItemLabelGenerator();
        minMaxCategoryRenderer14.setLegendItemLabelGenerator(categorySeriesLabelGenerator57);
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator57);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer61 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer61.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint65 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer61.setBaseOutlinePaint(paint65);
        minMaxCategoryRenderer61.removeAnnotations();
        java.awt.Stroke stroke68 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer61.setGroupStroke(stroke68);
        boolean boolean72 = minMaxCategoryRenderer61.getItemVisible((-1), (int) (byte) 10);
        java.awt.Paint paint75 = minMaxCategoryRenderer61.getItemOutlinePaint(1, 100);
        minMaxCategoryRenderer0.setSeriesPaint((int) (byte) 1, paint75, false);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNull(font35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator50);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator57);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(paint75);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint8 = minMaxCategoryRenderer6.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = minMaxCategoryRenderer6.hasListener(eventListener9);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint11, true);
        java.awt.Paint paint16 = minMaxCategoryRenderer6.getItemLabelPaint(1, 10);
        minMaxCategoryRenderer0.setSeriesPaint((int) ' ', paint16, false);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false);
        java.awt.Stroke stroke23 = minMaxCategoryRenderer0.lookupSeriesOutlineStroke((int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer26 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer26.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer26.setBaseOutlinePaint(paint30);
        minMaxCategoryRenderer26.removeAnnotations();
        int int33 = minMaxCategoryRenderer26.getPassCount();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer34 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean36 = minMaxCategoryRenderer34.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer34.setSeriesOutlineStroke((int) (short) 100, stroke38, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer41 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer41.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer41.setBaseOutlinePaint(paint45);
        minMaxCategoryRenderer41.removeAnnotations();
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer41.setGroupStroke(stroke48);
        int int50 = minMaxCategoryRenderer41.getPassCount();
        java.awt.Shape shape51 = minMaxCategoryRenderer41.getBaseShape();
        java.awt.Font font52 = minMaxCategoryRenderer41.getBaseItemLabelFont();
        minMaxCategoryRenderer34.setBaseItemLabelFont(font52, false);
        org.jfree.chart.LegendItem legendItem57 = minMaxCategoryRenderer34.getLegendItem((int) (byte) 0, (int) 'a');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer58 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer58.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer58.setBaseOutlinePaint(paint62);
        minMaxCategoryRenderer58.removeAnnotations();
        java.awt.Stroke stroke65 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer58.setGroupStroke(stroke65);
        minMaxCategoryRenderer58.setBaseCreateEntities(true);
        java.awt.Font font71 = minMaxCategoryRenderer58.getItemLabelFont((int) (byte) 10, 0);
        java.awt.Paint paint74 = minMaxCategoryRenderer58.getItemOutlinePaint((int) (byte) 1, (int) 'a');
        minMaxCategoryRenderer34.setBaseFillPaint(paint74);
        minMaxCategoryRenderer26.setBaseFillPaint(paint74, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition79 = minMaxCategoryRenderer26.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesPositiveItemLabelPosition((int) (byte) -1, itemLabelPosition79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNull(legendItem57);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(font71);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(itemLabelPosition79);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer4 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer4.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer4.setBaseOutlinePaint(paint8);
        minMaxCategoryRenderer4.removeAnnotations();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer4.setGroupStroke(stroke11);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke11, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = minMaxCategoryRenderer0.getDrawingSupplier();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer19 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer19.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer19.setBaseOutlinePaint(paint23);
        minMaxCategoryRenderer19.removeAnnotations();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer19.setGroupStroke(stroke26);
        boolean boolean28 = minMaxCategoryRenderer19.getAutoPopulateSeriesFillPaint();
        minMaxCategoryRenderer19.setBaseItemLabelsVisible(false, false);
        java.awt.Paint paint32 = minMaxCategoryRenderer19.getBaseFillPaint();
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint32, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = minMaxCategoryRenderer0.getSeriesNegativeItemLabelPosition((int) '#');
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font5 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = minMaxCategoryRenderer0.getSeriesURLGenerator(0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator9);
        javax.swing.Icon icon11 = minMaxCategoryRenderer0.getObjectIcon();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        java.awt.Font font15 = minMaxCategoryRenderer0.getItemLabelFont(1, 10);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertNotNull(icon11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint10, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint15 = minMaxCategoryRenderer13.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = minMaxCategoryRenderer13.hasListener(eventListener16);
        javax.swing.Icon icon18 = minMaxCategoryRenderer13.getMinIcon();
        minMaxCategoryRenderer0.setObjectIcon(icon18);
        boolean boolean20 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator(10, categoryURLGenerator22);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean27 = minMaxCategoryRenderer25.getSeriesCreateEntities((int) (short) -1);
        boolean boolean29 = minMaxCategoryRenderer25.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer31 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint33 = minMaxCategoryRenderer31.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = minMaxCategoryRenderer31.hasListener(eventListener34);
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer31.setBaseOutlinePaint(paint36, true);
        java.awt.Paint paint41 = minMaxCategoryRenderer31.getItemLabelPaint(1, 10);
        minMaxCategoryRenderer25.setSeriesPaint((int) ' ', paint41, false);
        java.awt.Stroke stroke44 = minMaxCategoryRenderer25.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer45 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer45.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer45.setBaseOutlinePaint(paint49);
        minMaxCategoryRenderer45.removeAnnotations();
        boolean boolean52 = minMaxCategoryRenderer45.getBaseSeriesVisible();
        minMaxCategoryRenderer45.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer45.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer59 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition62 = minMaxCategoryRenderer59.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer45.setBaseNegativeItemLabelPosition(itemLabelPosition62, false);
        minMaxCategoryRenderer25.setBaseNegativeItemLabelPosition(itemLabelPosition62);
        org.jfree.chart.LegendItem legendItem68 = minMaxCategoryRenderer25.getLegendItem(0, (int) (byte) 10);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer70 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean72 = minMaxCategoryRenderer70.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font75 = minMaxCategoryRenderer70.getItemLabelFont((int) (short) 100, (int) '#');
        java.awt.Paint paint77 = minMaxCategoryRenderer70.getSeriesPaint((int) (byte) 100);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator78 = minMaxCategoryRenderer70.getLegendItemURLGenerator();
        java.awt.Paint paint80 = minMaxCategoryRenderer70.lookupSeriesPaint((int) '#');
        minMaxCategoryRenderer25.setSeriesFillPaint((int) (short) 100, paint80, false);
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesPaint((int) (short) -1, paint80, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(icon18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition62);
        org.junit.Assert.assertNull(legendItem68);
        org.junit.Assert.assertNull(boolean72);
        org.junit.Assert.assertNotNull(font75);
        org.junit.Assert.assertNull(paint77);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator78);
        org.junit.Assert.assertNotNull(paint80);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Stroke stroke21 = minMaxCategoryRenderer0.lookupSeriesStroke((int) (byte) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer23 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint25 = minMaxCategoryRenderer23.getSeriesPaint((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = minMaxCategoryRenderer23.getLegendItemLabelGenerator();
        minMaxCategoryRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator26);
        boolean boolean30 = minMaxCategoryRenderer0.getItemVisible((int) (byte) 10, (int) (byte) -1);
        java.awt.Stroke stroke31 = minMaxCategoryRenderer0.getGroupStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Shape shape5 = minMaxCategoryRenderer0.lookupSeriesShape((int) (short) -1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer4 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer4.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer4.setBaseOutlinePaint(paint8);
        minMaxCategoryRenderer4.removeAnnotations();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer4.setGroupStroke(stroke11);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke11, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator16);
        java.awt.Shape shape18 = minMaxCategoryRenderer0.getBaseShape();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true);
        java.awt.Paint paint21 = minMaxCategoryRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer23 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer23.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer23.setBaseOutlinePaint(paint27);
        minMaxCategoryRenderer23.removeAnnotations();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer23.setGroupStroke(stroke30);
        minMaxCategoryRenderer23.setBaseCreateEntities(true);
        java.awt.Font font36 = minMaxCategoryRenderer23.getItemLabelFont((int) (byte) 10, 0);
        minMaxCategoryRenderer0.setSeriesItemLabelFont(0, font36);
        java.lang.Boolean boolean39 = minMaxCategoryRenderer0.getSeriesVisible(0);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNull(boolean39);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Font font24 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) (byte) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = minMaxCategoryRenderer0.getBaseURLGenerator();
        org.jfree.chart.LegendItem legendItem28 = minMaxCategoryRenderer0.getLegendItem((int) (short) 10, (int) (short) 100);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer30 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer30.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer30.setBaseOutlinePaint(paint34);
        minMaxCategoryRenderer30.removeAnnotations();
        boolean boolean37 = minMaxCategoryRenderer30.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = minMaxCategoryRenderer30.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        minMaxCategoryRenderer30.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator40, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = minMaxCategoryRenderer30.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer44 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint46 = minMaxCategoryRenderer44.getSeriesPaint((int) ' ');
        boolean boolean47 = minMaxCategoryRenderer44.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator48 = null;
        minMaxCategoryRenderer44.setBaseToolTipGenerator(categoryToolTipGenerator48);
        minMaxCategoryRenderer44.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint56 = minMaxCategoryRenderer44.getItemFillPaint(100, 10);
        minMaxCategoryRenderer30.setBaseItemLabelPaint(paint56, false);
        minMaxCategoryRenderer0.setSeriesPaint((int) (short) 0, paint56, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer62 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint64 = minMaxCategoryRenderer62.getSeriesPaint((int) ' ');
        boolean boolean65 = minMaxCategoryRenderer62.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator66 = null;
        minMaxCategoryRenderer62.setBaseToolTipGenerator(categoryToolTipGenerator66);
        minMaxCategoryRenderer62.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint72 = minMaxCategoryRenderer62.getBaseFillPaint();
        minMaxCategoryRenderer0.setSeriesPaint((int) (byte) 1, paint72);
        minMaxCategoryRenderer0.setAutoPopulateSeriesPaint(false);
        java.awt.Graphics2D graphics2D76 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot77 = null;
        java.awt.geom.Rectangle2D rectangle2D78 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawOutline(graphics2D76, categoryPlot77, rectangle2D78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(categoryURLGenerator25);
        org.junit.Assert.assertNull(legendItem28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator38);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(paint64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paint72);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        java.awt.Shape shape10 = minMaxCategoryRenderer0.getBaseShape();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer11.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer11.setBaseOutlinePaint(paint15);
        minMaxCategoryRenderer11.removeAnnotations();
        boolean boolean18 = minMaxCategoryRenderer11.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = minMaxCategoryRenderer11.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        minMaxCategoryRenderer11.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator21, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer24 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer24.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer24.setBaseOutlinePaint(paint28);
        minMaxCategoryRenderer11.setBaseItemLabelPaint(paint28, false);
        boolean boolean34 = minMaxCategoryRenderer11.getItemCreateEntity(1, (int) (short) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer35 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer35.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer35.setBaseOutlinePaint(paint39);
        minMaxCategoryRenderer35.removeAnnotations();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer35.setGroupStroke(stroke42);
        int int44 = minMaxCategoryRenderer35.getPassCount();
        java.awt.Shape shape45 = minMaxCategoryRenderer35.getBaseShape();
        minMaxCategoryRenderer11.setBaseShape(shape45, false);
        minMaxCategoryRenderer0.setBaseShape(shape45, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(shape45);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        boolean boolean11 = minMaxCategoryRenderer0.getItemVisible((-1), (int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator12, true);
        java.awt.Paint paint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesFillPaint((-1), paint16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisible(10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = minMaxCategoryRenderer0.getSeriesURLGenerator((int) (byte) 0);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = minMaxCategoryRenderer0.getPlot();
        java.awt.Paint paint9 = minMaxCategoryRenderer0.getBasePaint();
        java.awt.Paint paint10 = minMaxCategoryRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator13);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator16);
        java.awt.Paint paint20 = minMaxCategoryRenderer0.getItemOutlinePaint(1, 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = minMaxCategoryRenderer0.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        boolean boolean14 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator((int) '4', categoryURLGenerator16);
        double double18 = minMaxCategoryRenderer0.getItemLabelAnchorOffset();
        boolean boolean20 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) ' ');
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = minMaxCategoryRenderer0.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        boolean boolean14 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator((int) '4', categoryURLGenerator16);
        boolean boolean18 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator19, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = null;
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator22);
        boolean boolean25 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) '#');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer11.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer11.setBaseOutlinePaint(paint15);
        minMaxCategoryRenderer11.removeAnnotations();
        boolean boolean18 = minMaxCategoryRenderer11.getBaseSeriesVisible();
        minMaxCategoryRenderer11.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer11.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer25.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer11.setBaseNegativeItemLabelPosition(itemLabelPosition28, false);
        java.awt.Font font32 = minMaxCategoryRenderer11.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer11.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        boolean boolean37 = minMaxCategoryRenderer11.getBaseItemLabelsVisible();
        java.awt.Shape shape38 = minMaxCategoryRenderer11.getBaseShape();
        minMaxCategoryRenderer0.setSeriesShape(100, shape38, false);
        boolean boolean41 = minMaxCategoryRenderer0.isDrawLines();
        java.awt.Stroke stroke44 = minMaxCategoryRenderer0.getItemStroke(1, (int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator47 = minMaxCategoryRenderer0.getToolTipGenerator(0, (-1));
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState53 = minMaxCategoryRenderer0.initialise(graphics2D48, rectangle2D49, categoryPlot50, (int) ' ', plotRenderingInfo52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNull(font32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNull(categoryToolTipGenerator47);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.awt.Stroke stroke4 = minMaxCategoryRenderer0.getSeriesStroke(100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) -1, categoryToolTipGenerator6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(stroke4);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, true);
        java.awt.Font font9 = minMaxCategoryRenderer0.getBaseItemLabelFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = minMaxCategoryRenderer0.getPlot();
        int int11 = minMaxCategoryRenderer0.getColumnCount();
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer5.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer5.setBaseOutlinePaint(paint9);
        minMaxCategoryRenderer0.setSeriesFillPaint((int) 'a', paint9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator13);
        minMaxCategoryRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean19 = minMaxCategoryRenderer17.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer17.setSeriesOutlineStroke((int) (short) 100, stroke21, false);
        minMaxCategoryRenderer17.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer17.setBaseCreateEntities(false);
        boolean boolean29 = minMaxCategoryRenderer17.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer30 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint32 = minMaxCategoryRenderer30.getSeriesPaint((int) ' ');
        boolean boolean33 = minMaxCategoryRenderer30.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = null;
        minMaxCategoryRenderer30.setBaseToolTipGenerator(categoryToolTipGenerator34);
        minMaxCategoryRenderer30.setBaseCreateEntities(false);
        boolean boolean39 = minMaxCategoryRenderer30.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer40 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint42 = minMaxCategoryRenderer40.getSeriesPaint((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = minMaxCategoryRenderer40.getLegendItemLabelGenerator();
        minMaxCategoryRenderer30.setLegendItemToolTipGenerator(categorySeriesLabelGenerator43);
        minMaxCategoryRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator43);
        minMaxCategoryRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator43);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        java.awt.Shape shape10 = minMaxCategoryRenderer0.getBaseShape();
        java.awt.Font font11 = minMaxCategoryRenderer0.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = minMaxCategoryRenderer13.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 1, itemLabelPosition15, true);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean20 = minMaxCategoryRenderer0.getBaseCreateEntities();
        boolean boolean21 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlineStroke();
        java.awt.Stroke stroke23 = minMaxCategoryRenderer0.lookupSeriesOutlineStroke((int) 'a');
        boolean boolean26 = minMaxCategoryRenderer0.getItemVisible(1, (int) '#');
        minMaxCategoryRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true, true);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer25.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer25.setBaseOutlinePaint(paint29);
        minMaxCategoryRenderer25.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = minMaxCategoryRenderer25.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean35 = minMaxCategoryRenderer25.isSeriesVisibleInLegend(1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer36 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer36.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer36.setBaseOutlinePaint(paint40);
        minMaxCategoryRenderer36.removeAnnotations();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer36.setGroupStroke(stroke43);
        minMaxCategoryRenderer36.setBaseCreateEntities(true);
        java.awt.Font font49 = minMaxCategoryRenderer36.getItemLabelFont((int) (byte) 10, 0);
        minMaxCategoryRenderer25.setBaseItemLabelFont(font49, true);
        minMaxCategoryRenderer0.setBaseItemLabelFont(font49, false);
        java.awt.Shape shape55 = minMaxCategoryRenderer0.getSeriesShape((int) (byte) 0);
        double double56 = minMaxCategoryRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer57 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer57.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint62 = minMaxCategoryRenderer57.getSeriesPaint((int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator63 = minMaxCategoryRenderer57.getLegendItemLabelGenerator();
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator63);
        java.awt.Graphics2D graphics2D65 = null;
        java.awt.geom.Rectangle2D rectangle2D66 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot67 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState70 = minMaxCategoryRenderer0.initialise(graphics2D65, rectangle2D66, categoryPlot67, (int) (byte) 0, plotRenderingInfo69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.0d + "'", double56 == 2.0d);
        org.junit.Assert.assertNull(paint62);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator63);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer13.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer13.setBaseOutlinePaint(paint17);
        minMaxCategoryRenderer13.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = minMaxCategoryRenderer13.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        java.awt.Stroke stroke24 = minMaxCategoryRenderer13.getItemStroke(0, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = minMaxCategoryRenderer13.getNegativeItemLabelPosition((int) (short) 10, (int) (byte) 1);
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 0, itemLabelPosition27, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = minMaxCategoryRenderer0.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = minMaxCategoryRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator15);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) (byte) 1, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer21 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint23 = minMaxCategoryRenderer21.getSeriesPaint((int) ' ');
        boolean boolean24 = minMaxCategoryRenderer21.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke27 = minMaxCategoryRenderer21.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer21.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        minMaxCategoryRenderer21.setBaseItemLabelGenerator(categoryItemLabelGenerator31);
        java.awt.Paint paint34 = minMaxCategoryRenderer21.getSeriesFillPaint((int) '4');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer35 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer35.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer35.setBaseOutlinePaint(paint39);
        minMaxCategoryRenderer35.removeAnnotations();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer35.setGroupStroke(stroke42);
        int int44 = minMaxCategoryRenderer35.getPassCount();
        java.awt.Shape shape45 = minMaxCategoryRenderer35.getBaseShape();
        java.awt.Font font46 = minMaxCategoryRenderer35.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer48 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = minMaxCategoryRenderer48.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer35.setSeriesNegativeItemLabelPosition((int) (byte) 1, itemLabelPosition50, true);
        minMaxCategoryRenderer35.setBaseCreateEntities(false);
        boolean boolean55 = minMaxCategoryRenderer35.getBaseCreateEntities();
        boolean boolean56 = minMaxCategoryRenderer35.getAutoPopulateSeriesOutlineStroke();
        java.awt.Stroke stroke58 = minMaxCategoryRenderer35.lookupSeriesOutlineStroke((int) 'a');
        minMaxCategoryRenderer21.setBaseStroke(stroke58);
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) -1, stroke58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNotNull(itemLabelPosition50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Font font21 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer26 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer26.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer26.setBaseOutlinePaint(paint30);
        javax.swing.Icon icon32 = minMaxCategoryRenderer26.getObjectIcon();
        minMaxCategoryRenderer0.setMaxIcon(icon32);
        int int34 = minMaxCategoryRenderer0.getPassCount();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint39 = minMaxCategoryRenderer0.getItemLabelPaint((int) (short) 0, (int) (short) 100);
        java.awt.Font font41 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) '#');
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(icon32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(font41);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.setDrawLines(true);
        java.lang.Boolean boolean9 = minMaxCategoryRenderer0.getSeriesVisible((int) '#');
        java.awt.Paint paint11 = minMaxCategoryRenderer0.getSeriesPaint((int) 'a');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer13.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer13.setBaseOutlinePaint(paint17);
        minMaxCategoryRenderer13.removeAnnotations();
        boolean boolean20 = minMaxCategoryRenderer13.getBaseSeriesVisible();
        minMaxCategoryRenderer13.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer13.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer27 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = minMaxCategoryRenderer27.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer13.setBaseNegativeItemLabelPosition(itemLabelPosition30, false);
        java.awt.Paint paint35 = minMaxCategoryRenderer13.getItemOutlinePaint((int) (byte) 0, (int) (short) 0);
        java.awt.Shape shape38 = minMaxCategoryRenderer13.getItemShape(0, (int) (short) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer40 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint42 = minMaxCategoryRenderer40.getSeriesPaint((int) ' ');
        boolean boolean43 = minMaxCategoryRenderer40.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = null;
        minMaxCategoryRenderer40.setBaseToolTipGenerator(categoryToolTipGenerator44);
        minMaxCategoryRenderer40.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator50 = minMaxCategoryRenderer40.getToolTipGenerator((int) '#', (int) (short) 100);
        java.awt.Paint paint52 = minMaxCategoryRenderer40.getSeriesPaint(0);
        minMaxCategoryRenderer40.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) false, true);
        minMaxCategoryRenderer40.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) true, false);
        boolean boolean61 = minMaxCategoryRenderer40.getAutoPopulateSeriesPaint();
        java.awt.Stroke stroke64 = minMaxCategoryRenderer40.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100);
        minMaxCategoryRenderer13.setSeriesStroke((int) (short) 10, stroke64, false);
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke64);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator50);
        org.junit.Assert.assertNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(stroke64);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Stroke stroke21 = minMaxCategoryRenderer0.lookupSeriesStroke((int) (byte) 1);
        boolean boolean22 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer23 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint25 = minMaxCategoryRenderer23.getSeriesPaint((int) ' ');
        boolean boolean26 = minMaxCategoryRenderer23.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = null;
        minMaxCategoryRenderer23.setBaseToolTipGenerator(categoryToolTipGenerator27);
        minMaxCategoryRenderer23.setBaseCreateEntities(false);
        minMaxCategoryRenderer23.setSeriesItemLabelsVisible(1, (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer35 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer35.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer35.setBaseOutlinePaint(paint39);
        minMaxCategoryRenderer35.removeAnnotations();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer35.setGroupStroke(stroke42);
        int int44 = minMaxCategoryRenderer35.getPassCount();
        java.awt.Shape shape45 = minMaxCategoryRenderer35.getBaseShape();
        java.awt.Font font46 = minMaxCategoryRenderer35.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer47 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint49 = minMaxCategoryRenderer47.getSeriesPaint((int) ' ');
        boolean boolean50 = minMaxCategoryRenderer47.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator51 = null;
        minMaxCategoryRenderer47.setBaseToolTipGenerator(categoryToolTipGenerator51);
        minMaxCategoryRenderer47.setBaseCreateEntities(false);
        boolean boolean56 = minMaxCategoryRenderer47.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer57 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint59 = minMaxCategoryRenderer57.getSeriesPaint((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator60 = minMaxCategoryRenderer57.getLegendItemLabelGenerator();
        minMaxCategoryRenderer47.setLegendItemToolTipGenerator(categorySeriesLabelGenerator60);
        minMaxCategoryRenderer35.setLegendItemToolTipGenerator(categorySeriesLabelGenerator60);
        minMaxCategoryRenderer23.setLegendItemURLGenerator(categorySeriesLabelGenerator60);
        minMaxCategoryRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator60);
        boolean boolean65 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesItemLabelsVisible((int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(paint59);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = minMaxCategoryRenderer0.getSeriesItemLabelGenerator((-1));
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer11.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer11.setBaseOutlinePaint(paint15);
        minMaxCategoryRenderer11.removeAnnotations();
        boolean boolean18 = minMaxCategoryRenderer11.getBaseSeriesVisible();
        minMaxCategoryRenderer11.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer11.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer25.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer11.setBaseNegativeItemLabelPosition(itemLabelPosition28, false);
        java.awt.Font font32 = minMaxCategoryRenderer11.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer11.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        boolean boolean37 = minMaxCategoryRenderer11.getBaseItemLabelsVisible();
        java.awt.Shape shape38 = minMaxCategoryRenderer11.getBaseShape();
        minMaxCategoryRenderer0.setSeriesShape(100, shape38, false);
        boolean boolean41 = minMaxCategoryRenderer0.isDrawLines();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator42, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = minMaxCategoryRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNull(font32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator45);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = minMaxCategoryRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer11.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint17 = minMaxCategoryRenderer11.getItemPaint((int) (byte) 100, 1);
        java.awt.Shape shape18 = minMaxCategoryRenderer11.getBaseShape();
        minMaxCategoryRenderer0.setBaseShape(shape18);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, false);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true);
        java.awt.Font font16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        minMaxCategoryRenderer0.setBaseItemLabelFont(font16, true);
        java.awt.Paint paint20 = minMaxCategoryRenderer0.getSeriesFillPaint((int) (byte) 1);
        boolean boolean23 = minMaxCategoryRenderer0.getItemCreateEntity((int) (byte) 10, (int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = minMaxCategoryRenderer0.getBasePositiveItemLabelPosition();
        minMaxCategoryRenderer0.setItemLabelAnchorOffset((double) (short) 100);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = minMaxCategoryRenderer0.getNegativeItemLabelPosition((int) (byte) 0, (int) '4');
        minMaxCategoryRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator16, true);
        minMaxCategoryRenderer0.setBaseSeriesVisible(false, false);
        boolean boolean22 = minMaxCategoryRenderer0.isDrawLines();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = minMaxCategoryRenderer0.getURLGenerator((int) (byte) 100, (int) '#');
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer28.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer28.setBaseOutlinePaint(paint32);
        javax.swing.Icon icon34 = minMaxCategoryRenderer28.getObjectIcon();
        minMaxCategoryRenderer0.setObjectIcon(icon34);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categoryURLGenerator25);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(icon34);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint12 = minMaxCategoryRenderer0.getItemFillPaint(100, 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = minMaxCategoryRenderer0.getNegativeItemLabelPosition((int) '#', (int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = minMaxCategoryRenderer0.getURLGenerator((int) (byte) -1, 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = minMaxCategoryRenderer0.lookupSeriesOutlinePaint((int) (short) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) -1, categoryItemLabelGenerator24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNull(categoryURLGenerator18);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, true);
        java.lang.Boolean boolean10 = minMaxCategoryRenderer0.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = minMaxCategoryRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint5, true);
        minMaxCategoryRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, false);
        java.awt.Paint paint14 = minMaxCategoryRenderer0.getItemFillPaint((int) (short) 0, (int) (short) 0);
        java.awt.Paint paint15 = null;
        minMaxCategoryRenderer0.setBasePaint(paint15, false);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint6 = minMaxCategoryRenderer0.getItemPaint((int) (byte) 100, 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = minMaxCategoryRenderer0.getPositiveItemLabelPosition((int) (byte) 10, (int) (short) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer10.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseOutlinePaint(paint14);
        minMaxCategoryRenderer10.removeAnnotations();
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer10.setGroupStroke(stroke17);
        minMaxCategoryRenderer10.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer21 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer21.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer21.setBaseOutlinePaint(paint25);
        java.lang.Boolean boolean28 = minMaxCategoryRenderer21.getSeriesVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer29.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint35 = minMaxCategoryRenderer29.getItemPaint((int) (byte) 100, 1);
        minMaxCategoryRenderer21.setBaseFillPaint(paint35);
        java.awt.Shape shape39 = minMaxCategoryRenderer21.getItemShape((int) (short) 100, 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator41 = null;
        minMaxCategoryRenderer21.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator41);
        minMaxCategoryRenderer21.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer45 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer45.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer45.setBaseOutlinePaint(paint49);
        minMaxCategoryRenderer45.removeAnnotations();
        java.awt.Stroke stroke52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer45.setGroupStroke(stroke52);
        boolean boolean56 = minMaxCategoryRenderer45.getItemVisible((-1), (int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = null;
        minMaxCategoryRenderer45.setBaseItemLabelGenerator(categoryItemLabelGenerator57, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer60 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer60.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint64 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer60.setBaseOutlinePaint(paint64);
        minMaxCategoryRenderer60.removeAnnotations();
        java.awt.Stroke stroke67 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer60.setGroupStroke(stroke67);
        int int69 = minMaxCategoryRenderer60.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot70 = minMaxCategoryRenderer60.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition73 = minMaxCategoryRenderer60.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator74 = minMaxCategoryRenderer60.getLegendItemLabelGenerator();
        minMaxCategoryRenderer45.setLegendItemToolTipGenerator(categorySeriesLabelGenerator74);
        minMaxCategoryRenderer21.setLegendItemToolTipGenerator(categorySeriesLabelGenerator74);
        minMaxCategoryRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator74);
        minMaxCategoryRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator74);
        java.awt.Stroke stroke79 = minMaxCategoryRenderer0.getBaseStroke();
        java.awt.Stroke stroke81 = minMaxCategoryRenderer0.lookupSeriesStroke((int) '#');
        int int82 = minMaxCategoryRenderer0.getRowCount();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(itemLabelPosition9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(categoryPlot70);
        org.junit.Assert.assertNotNull(itemLabelPosition73);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator74);
        org.junit.Assert.assertNotNull(stroke79);
        org.junit.Assert.assertNotNull(stroke81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Font font21 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer26 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer26.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer26.setBaseOutlinePaint(paint30);
        javax.swing.Icon icon32 = minMaxCategoryRenderer26.getObjectIcon();
        minMaxCategoryRenderer0.setMaxIcon(icon32);
        int int34 = minMaxCategoryRenderer0.getPassCount();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Paint paint39 = minMaxCategoryRenderer0.getItemLabelPaint((int) (short) 0, (int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = minMaxCategoryRenderer0.getSeriesItemLabelGenerator((int) '4');
        java.awt.Shape shape43 = minMaxCategoryRenderer0.getSeriesShape(1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(icon32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(categoryItemLabelGenerator41);
        org.junit.Assert.assertNull(shape43);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = minMaxCategoryRenderer8.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11);
        java.awt.Stroke stroke15 = minMaxCategoryRenderer0.getItemOutlineStroke((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font18, false);
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem((int) (byte) 0, (int) 'a');
        boolean boolean26 = minMaxCategoryRenderer0.getItemVisible((int) (short) 10, (-1));
        java.awt.Paint paint27 = minMaxCategoryRenderer0.getBaseOutlinePaint();
        java.awt.Stroke stroke30 = minMaxCategoryRenderer0.getItemStroke((int) 'a', (int) 'a');
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Font font15 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke6 = minMaxCategoryRenderer0.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, true);
        minMaxCategoryRenderer0.setBaseSeriesVisible(true, true);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer0.lookupSeriesStroke((int) (short) 100);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer21 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = minMaxCategoryRenderer21.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        minMaxCategoryRenderer21.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator25);
        minMaxCategoryRenderer21.setBaseItemLabelsVisible(true, true);
        boolean boolean30 = minMaxCategoryRenderer21.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent31 = null;
        minMaxCategoryRenderer21.notifyListeners(rendererChangeEvent31);
        javax.swing.Icon icon33 = minMaxCategoryRenderer21.getMinIcon();
        minMaxCategoryRenderer21.setBaseSeriesVisibleInLegend(false);
        java.lang.Object obj36 = minMaxCategoryRenderer21.clone();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = minMaxCategoryRenderer21.getBasePositiveItemLabelPosition();
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition37);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(icon33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        boolean boolean9 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, false);
        java.awt.Paint paint13 = minMaxCategoryRenderer0.getBaseFillPaint();
        java.awt.Font font14 = minMaxCategoryRenderer0.getBaseItemLabelFont();
        java.awt.Paint paint17 = minMaxCategoryRenderer0.getItemFillPaint((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean10 = minMaxCategoryRenderer0.isSeriesVisibleInLegend(1);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = minMaxCategoryRenderer0.getItemLabelGenerator((int) (byte) 10, (int) (byte) 1);
        java.awt.Shape shape17 = minMaxCategoryRenderer0.getSeriesShape((int) (byte) 10);
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawItem(graphics2D18, categoryItemRendererState19, rectangle2D20, categoryPlot21, categoryAxis22, valueAxis23, categoryDataset24, (int) (byte) 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint5 = minMaxCategoryRenderer0.getSeriesPaint((int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
        java.awt.Stroke stroke8 = minMaxCategoryRenderer0.lookupSeriesOutlineStroke((int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator9);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Stroke stroke14 = minMaxCategoryRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        javax.swing.Icon icon16 = minMaxCategoryRenderer0.getObjectIcon();
        int int17 = minMaxCategoryRenderer0.getColumnCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) ' ');
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(icon16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer9 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer9.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer9.setBaseOutlinePaint(paint13);
        minMaxCategoryRenderer9.removeAnnotations();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer9.setGroupStroke(stroke16);
        boolean boolean20 = minMaxCategoryRenderer9.getItemVisible((-1), (int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        minMaxCategoryRenderer9.setBaseItemLabelGenerator(categoryItemLabelGenerator21, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer24 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer24.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer24.setBaseOutlinePaint(paint28);
        minMaxCategoryRenderer24.removeAnnotations();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer24.setGroupStroke(stroke31);
        int int33 = minMaxCategoryRenderer24.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = minMaxCategoryRenderer24.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = minMaxCategoryRenderer24.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = minMaxCategoryRenderer24.getLegendItemLabelGenerator();
        minMaxCategoryRenderer9.setLegendItemToolTipGenerator(categorySeriesLabelGenerator38);
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator38);
        org.jfree.chart.LegendItemCollection legendItemCollection41 = minMaxCategoryRenderer0.getLegendItems();
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(categoryPlot34);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(legendItemCollection41);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11);
        java.awt.Paint paint14 = minMaxCategoryRenderer0.getSeriesItemLabelPaint(0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer15 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer15.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer15.setBaseOutlinePaint(paint19);
        minMaxCategoryRenderer15.removeAnnotations();
        boolean boolean22 = minMaxCategoryRenderer15.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = minMaxCategoryRenderer15.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        minMaxCategoryRenderer15.setLegendItemToolTipGenerator(categorySeriesLabelGenerator24);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer15.getNegativeItemLabelPosition((int) (byte) 0, (int) '4');
        java.awt.Paint paint31 = minMaxCategoryRenderer15.getItemOutlinePaint((int) (short) 100, (int) (byte) -1);
        minMaxCategoryRenderer0.setBaseFillPaint(paint31);
        java.awt.Shape shape33 = minMaxCategoryRenderer0.getBaseShape();
        java.awt.Shape shape35 = minMaxCategoryRenderer0.lookupSeriesShape(100);
        java.awt.Shape shape37 = minMaxCategoryRenderer0.lookupSeriesShape((int) 'a');
        java.lang.Boolean boolean39 = minMaxCategoryRenderer0.getSeriesItemLabelsVisible((int) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNull(boolean39);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font18, false);
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem((int) (byte) 0, (int) 'a');
        boolean boolean26 = minMaxCategoryRenderer0.getItemVisible((int) (short) 10, (-1));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer30 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer30.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint36 = minMaxCategoryRenderer30.getItemPaint((int) (byte) 100, 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = minMaxCategoryRenderer30.getPositiveItemLabelPosition((int) (byte) 10, (int) (short) -1);
        java.awt.Paint paint40 = minMaxCategoryRenderer30.getBaseOutlinePaint();
        minMaxCategoryRenderer0.setSeriesItemLabelPaint(10, paint40, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer44 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer44.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer44.setBaseOutlinePaint(paint48);
        minMaxCategoryRenderer44.removeAnnotations();
        java.awt.Stroke stroke51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer44.setGroupStroke(stroke51);
        boolean boolean55 = minMaxCategoryRenderer44.getItemVisible((-1), (int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = null;
        minMaxCategoryRenderer44.setBaseItemLabelGenerator(categoryItemLabelGenerator56, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer59 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer59.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint63 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer59.setBaseOutlinePaint(paint63);
        minMaxCategoryRenderer59.removeAnnotations();
        java.awt.Stroke stroke66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer59.setGroupStroke(stroke66);
        int int68 = minMaxCategoryRenderer59.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = minMaxCategoryRenderer59.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition72 = minMaxCategoryRenderer59.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        boolean boolean73 = minMaxCategoryRenderer59.getAutoPopulateSeriesOutlinePaint();
        javax.swing.Icon icon74 = minMaxCategoryRenderer59.getObjectIcon();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer75 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint77 = minMaxCategoryRenderer75.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener78 = null;
        boolean boolean79 = minMaxCategoryRenderer75.hasListener(eventListener78);
        java.awt.Paint paint80 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer75.setBaseOutlinePaint(paint80, true);
        minMaxCategoryRenderer59.setBaseFillPaint(paint80);
        java.awt.Stroke stroke84 = minMaxCategoryRenderer59.getGroupStroke();
        minMaxCategoryRenderer44.setBaseStroke(stroke84, true);
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke84);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNull(categoryPlot28);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(itemLabelPosition39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNull(categoryPlot69);
        org.junit.Assert.assertNotNull(itemLabelPosition72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(icon74);
        org.junit.Assert.assertNull(paint77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertNotNull(stroke84);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        java.awt.Shape shape10 = minMaxCategoryRenderer0.getBaseShape();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer11 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint13 = minMaxCategoryRenderer11.getSeriesPaint((int) ' ');
        boolean boolean14 = minMaxCategoryRenderer11.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        minMaxCategoryRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator15);
        minMaxCategoryRenderer11.setBaseCreateEntities(false);
        boolean boolean20 = minMaxCategoryRenderer11.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer11.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer24 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer24.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer24.setBaseOutlinePaint(paint28);
        minMaxCategoryRenderer24.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = minMaxCategoryRenderer24.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        java.awt.Stroke stroke35 = minMaxCategoryRenderer24.getItemStroke(0, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = minMaxCategoryRenderer24.getNegativeItemLabelPosition((int) (short) 10, (int) (byte) 1);
        minMaxCategoryRenderer11.setSeriesNegativeItemLabelPosition((int) (byte) 0, itemLabelPosition38, true);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition38, false);
        java.awt.Paint paint44 = minMaxCategoryRenderer0.getSeriesPaint((int) (short) 0);
        minMaxCategoryRenderer0.setAutoPopulateSeriesStroke(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertNull(paint44);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean10 = minMaxCategoryRenderer0.isSeriesVisibleInLegend(1);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = minMaxCategoryRenderer0.getSeriesItemLabelGenerator((int) (short) 0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer15 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint17 = minMaxCategoryRenderer15.getSeriesPaint((int) ' ');
        boolean boolean18 = minMaxCategoryRenderer15.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        minMaxCategoryRenderer15.setBaseToolTipGenerator(categoryToolTipGenerator19);
        minMaxCategoryRenderer15.setBaseCreateEntities(false);
        boolean boolean24 = minMaxCategoryRenderer15.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer15.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer28.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer28.setBaseOutlinePaint(paint32);
        minMaxCategoryRenderer28.removeAnnotations();
        boolean boolean35 = minMaxCategoryRenderer28.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = minMaxCategoryRenderer28.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        minMaxCategoryRenderer28.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator38, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer41 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer41.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer41.setBaseOutlinePaint(paint45);
        minMaxCategoryRenderer28.setBaseItemLabelPaint(paint45, false);
        boolean boolean51 = minMaxCategoryRenderer28.getItemCreateEntity(1, (int) (short) -1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = minMaxCategoryRenderer28.getLegendItemLabelGenerator();
        java.awt.Paint paint53 = minMaxCategoryRenderer28.getBaseFillPaint();
        minMaxCategoryRenderer15.setBasePaint(paint53, false);
        minMaxCategoryRenderer0.setGroupPaint(paint53);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint8 = minMaxCategoryRenderer6.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = minMaxCategoryRenderer6.hasListener(eventListener9);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint11, true);
        java.awt.Paint paint16 = minMaxCategoryRenderer6.getItemLabelPaint(1, 10);
        minMaxCategoryRenderer0.setSeriesPaint((int) ' ', paint16, false);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = minMaxCategoryRenderer0.hasListener(eventListener20);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false, true);
        boolean boolean27 = minMaxCategoryRenderer0.getItemVisible(0, (int) (short) -1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = minMaxCategoryRenderer5.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition7);
        minMaxCategoryRenderer0.setBaseSeriesVisible(false);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true);
        boolean boolean13 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        boolean boolean14 = minMaxCategoryRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer16 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer16.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer16.setBaseOutlinePaint(paint20);
        minMaxCategoryRenderer16.removeAnnotations();
        boolean boolean23 = minMaxCategoryRenderer16.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = minMaxCategoryRenderer16.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        minMaxCategoryRenderer16.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator26, false);
        java.awt.Font font29 = minMaxCategoryRenderer16.getBaseItemLabelFont();
        boolean boolean30 = minMaxCategoryRenderer16.getAutoPopulateSeriesStroke();
        java.awt.Paint paint31 = minMaxCategoryRenderer16.getBaseOutlinePaint();
        minMaxCategoryRenderer0.setSeriesFillPaint((int) 'a', paint31);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font18, false);
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem((int) (byte) 0, (int) 'a');
        javax.swing.Icon icon24 = minMaxCategoryRenderer0.getMaxIcon();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertNotNull(icon24);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = minMaxCategoryRenderer5.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition7);
        minMaxCategoryRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator12);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator14, false);
        java.awt.Paint paint17 = minMaxCategoryRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        java.awt.Font font13 = minMaxCategoryRenderer0.getItemLabelFont((int) (byte) 10, 0);
        java.awt.Paint paint16 = minMaxCategoryRenderer0.getItemOutlinePaint((int) (byte) 1, (int) 'a');
        java.awt.Stroke stroke18 = minMaxCategoryRenderer0.lookupSeriesOutlineStroke(10);
        org.jfree.chart.LegendItem legendItem21 = minMaxCategoryRenderer0.getLegendItem((int) (short) -1, (int) (short) 10);
        java.awt.Stroke stroke23 = minMaxCategoryRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(legendItem21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator26);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = minMaxCategoryRenderer0.getToolTipGenerator((int) '#', (int) (short) 100);
        java.awt.Paint paint12 = minMaxCategoryRenderer0.getSeriesPaint(0);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator18);
        int int20 = minMaxCategoryRenderer0.getColumnCount();
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem(0, (int) (byte) 10);
        boolean boolean24 = minMaxCategoryRenderer0.getBaseCreateEntities();
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible((int) (byte) 10, (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) 'a', (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = minMaxCategoryRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 100);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke16 = minMaxCategoryRenderer0.getItemStroke((int) ' ', (int) '#');
        java.lang.Object obj17 = minMaxCategoryRenderer0.clone();
        boolean boolean18 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        java.awt.Stroke stroke21 = minMaxCategoryRenderer0.getItemOutlineStroke((int) (short) 1, (int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) -1, categoryItemLabelGenerator23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator10, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = minMaxCategoryRenderer0.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        minMaxCategoryRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        java.awt.Stroke stroke21 = minMaxCategoryRenderer0.getSeriesStroke((int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = minMaxCategoryRenderer0.getURLGenerator((int) (short) -1, 10);
        java.awt.Shape shape26 = minMaxCategoryRenderer0.getSeriesShape(10);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) (byte) 0, (java.lang.Boolean) false);
        java.awt.Paint paint34 = minMaxCategoryRenderer0.getSeriesOutlinePaint(1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNull(categoryURLGenerator24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(paint34);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint5, true);
        java.awt.Paint paint10 = minMaxCategoryRenderer0.getItemLabelPaint(1, 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator12, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = minMaxCategoryRenderer0.getPlot();
        boolean boolean16 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer19 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer19.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint25 = minMaxCategoryRenderer19.getItemPaint((int) (byte) 100, 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer19.getPositiveItemLabelPosition((int) (byte) 10, (int) (short) -1);
        java.awt.Paint paint29 = minMaxCategoryRenderer19.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer31 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean33 = minMaxCategoryRenderer31.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer31.setSeriesOutlineStroke((int) (short) 100, stroke35, false);
        minMaxCategoryRenderer31.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer31.setBaseItemLabelsVisible(true, false);
        boolean boolean44 = minMaxCategoryRenderer31.getAutoPopulateSeriesFillPaint();
        int int45 = minMaxCategoryRenderer31.getRowCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = minMaxCategoryRenderer31.getBaseNegativeItemLabelPosition();
        boolean boolean47 = minMaxCategoryRenderer31.getAutoPopulateSeriesOutlineStroke();
        java.awt.Stroke stroke49 = minMaxCategoryRenderer31.lookupSeriesOutlineStroke((int) ' ');
        minMaxCategoryRenderer19.setSeriesOutlineStroke(100, stroke49);
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = minMaxCategoryRenderer19.getPlot();
        minMaxCategoryRenderer19.setBaseCreateEntities(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer54 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer54.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint59 = minMaxCategoryRenderer54.getSeriesPaint((int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator60 = minMaxCategoryRenderer54.getLegendItemLabelGenerator();
        minMaxCategoryRenderer19.setLegendItemLabelGenerator(categorySeriesLabelGenerator60);
        minMaxCategoryRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator60);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryPlot15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNull(categoryPlot51);
        org.junit.Assert.assertNull(paint59);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator60);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint5, true);
        java.awt.Paint paint10 = minMaxCategoryRenderer0.getItemLabelPaint(1, 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator12, false);
        java.awt.Paint paint16 = minMaxCategoryRenderer0.lookupSeriesPaint((int) ' ');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator17, false);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true, true);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer25.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer25.setBaseOutlinePaint(paint29);
        minMaxCategoryRenderer25.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = minMaxCategoryRenderer25.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean35 = minMaxCategoryRenderer25.isSeriesVisibleInLegend(1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer36 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer36.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer36.setBaseOutlinePaint(paint40);
        minMaxCategoryRenderer36.removeAnnotations();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer36.setGroupStroke(stroke43);
        minMaxCategoryRenderer36.setBaseCreateEntities(true);
        java.awt.Font font49 = minMaxCategoryRenderer36.getItemLabelFont((int) (byte) 10, 0);
        minMaxCategoryRenderer25.setBaseItemLabelFont(font49, true);
        minMaxCategoryRenderer0.setBaseItemLabelFont(font49, false);
        java.awt.Shape shape55 = minMaxCategoryRenderer0.getSeriesShape((int) (byte) 0);
        double double56 = minMaxCategoryRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer57 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer57.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint62 = minMaxCategoryRenderer57.getSeriesPaint((int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator63 = minMaxCategoryRenderer57.getLegendItemLabelGenerator();
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator63);
        boolean boolean65 = minMaxCategoryRenderer0.getBaseCreateEntities();
        java.awt.Shape shape67 = minMaxCategoryRenderer0.getSeriesShape(100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator68 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator68);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.0d + "'", double56 == 2.0d);
        org.junit.Assert.assertNull(paint62);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(shape67);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke6 = minMaxCategoryRenderer0.getItemOutlineStroke(0, (int) '#');
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        minMaxCategoryRenderer0.setSeriesItemLabelPaint(1, paint8, true);
        java.awt.Shape shape11 = minMaxCategoryRenderer0.getBaseShape();
        java.awt.Stroke stroke13 = minMaxCategoryRenderer0.lookupSeriesStroke((int) (byte) 10);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.awt.Stroke stroke4 = minMaxCategoryRenderer0.getSeriesStroke(100);
        boolean boolean6 = minMaxCategoryRenderer0.isSeriesVisible((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer8.removeAnnotations();
        java.awt.Stroke stroke15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer8.setGroupStroke(stroke15);
        int int17 = minMaxCategoryRenderer8.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = minMaxCategoryRenderer8.getPlot();
        java.awt.Paint paint19 = minMaxCategoryRenderer8.getBaseOutlinePaint();
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint19, true);
        java.awt.Paint paint22 = minMaxCategoryRenderer0.getBaseOutlinePaint();
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(true);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawItem(graphics2D25, categoryItemRendererState26, rectangle2D27, categoryPlot28, categoryAxis29, valueAxis30, categoryDataset31, (int) (byte) 10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryPlot7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(categoryPlot18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = minMaxCategoryRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = minMaxCategoryRenderer0.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
        minMaxCategoryRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator14);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Stroke stroke14 = minMaxCategoryRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer16 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer16.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer16.setBaseOutlinePaint(paint20);
        minMaxCategoryRenderer16.removeAnnotations();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer16.setGroupStroke(stroke23);
        int int25 = minMaxCategoryRenderer16.getPassCount();
        java.awt.Shape shape26 = minMaxCategoryRenderer16.getBaseShape();
        java.awt.Font font27 = minMaxCategoryRenderer16.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = minMaxCategoryRenderer29.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer16.setSeriesNegativeItemLabelPosition((int) (byte) 1, itemLabelPosition31, true);
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition31, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer36 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean38 = minMaxCategoryRenderer36.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = minMaxCategoryRenderer36.hasListener(eventListener39);
        java.awt.Paint paint42 = minMaxCategoryRenderer36.lookupSeriesPaint((int) (short) 1);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint42);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font5 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        java.awt.Paint paint7 = minMaxCategoryRenderer0.getSeriesPaint((int) (byte) 100);
        boolean boolean8 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint6 = minMaxCategoryRenderer0.lookupSeriesPaint((int) (short) 1);
        javax.swing.Icon icon7 = minMaxCategoryRenderer0.getMinIcon();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer10.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseOutlinePaint(paint14);
        java.lang.Boolean boolean17 = minMaxCategoryRenderer10.getSeriesVisible((int) (byte) -1);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer10.lookupSeriesStroke(1);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke19);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer22 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer22.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer22.setBaseOutlinePaint(paint26);
        minMaxCategoryRenderer22.removeAnnotations();
        boolean boolean29 = minMaxCategoryRenderer22.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = minMaxCategoryRenderer22.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        minMaxCategoryRenderer22.setLegendItemToolTipGenerator(categorySeriesLabelGenerator31);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = minMaxCategoryRenderer22.getNegativeItemLabelPosition((int) (byte) 0, (int) '4');
        minMaxCategoryRenderer22.setBaseSeriesVisible(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        minMaxCategoryRenderer22.setBaseItemLabelGenerator(categoryItemLabelGenerator38, true);
        boolean boolean42 = minMaxCategoryRenderer22.isSeriesVisibleInLegend((int) (short) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer43 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer43.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer43.setBaseOutlinePaint(paint47);
        minMaxCategoryRenderer43.removeAnnotations();
        java.awt.Stroke stroke50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer43.setGroupStroke(stroke50);
        minMaxCategoryRenderer22.setGroupStroke(stroke50);
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke50, true);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(icon7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(itemLabelPosition35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = minMaxCategoryRenderer8.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer12 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer12.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer12.setBaseOutlinePaint(paint16);
        minMaxCategoryRenderer12.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer19 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint21 = minMaxCategoryRenderer19.getSeriesPaint((int) ' ');
        boolean boolean22 = minMaxCategoryRenderer19.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        minMaxCategoryRenderer19.setBaseToolTipGenerator(categoryToolTipGenerator23);
        minMaxCategoryRenderer19.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint31 = minMaxCategoryRenderer19.getItemFillPaint(100, 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = minMaxCategoryRenderer19.getNegativeItemLabelPosition((int) '#', (int) (byte) 0);
        minMaxCategoryRenderer12.setBaseNegativeItemLabelPosition(itemLabelPosition34);
        minMaxCategoryRenderer8.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition34);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer37 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer37.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer37.setBaseOutlinePaint(paint41);
        minMaxCategoryRenderer37.removeAnnotations();
        boolean boolean44 = minMaxCategoryRenderer37.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = minMaxCategoryRenderer37.getBaseItemLabelGenerator();
        boolean boolean46 = minMaxCategoryRenderer37.getBaseSeriesVisible();
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer37.setBaseOutlinePaint(paint47, true);
        minMaxCategoryRenderer8.setBaseFillPaint(paint47);
        minMaxCategoryRenderer0.setSeriesOutlinePaint(0, paint47, true);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(false);
        java.awt.Stroke stroke56 = minMaxCategoryRenderer0.getSeriesStroke(1);
        minMaxCategoryRenderer0.setDrawLines(true);
        javax.swing.Icon icon59 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.setObjectIcon(icon59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'icon' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(stroke56);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer12 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer12.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer12.setBaseOutlinePaint(paint16);
        minMaxCategoryRenderer12.removeAnnotations();
        boolean boolean19 = minMaxCategoryRenderer12.getBaseSeriesVisible();
        minMaxCategoryRenderer12.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer12.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer26 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = minMaxCategoryRenderer26.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer12.setBaseNegativeItemLabelPosition(itemLabelPosition29, false);
        java.awt.Stroke stroke33 = minMaxCategoryRenderer12.lookupSeriesStroke((int) (byte) 1);
        boolean boolean34 = minMaxCategoryRenderer12.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer35 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer35.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer35.setBaseOutlinePaint(paint39);
        minMaxCategoryRenderer35.removeAnnotations();
        boolean boolean42 = minMaxCategoryRenderer35.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = minMaxCategoryRenderer35.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = null;
        minMaxCategoryRenderer35.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator45, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer48 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer48.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer48.setBaseOutlinePaint(paint52);
        minMaxCategoryRenderer35.setBaseItemLabelPaint(paint52, false);
        minMaxCategoryRenderer12.setBaseItemLabelPaint(paint52);
        minMaxCategoryRenderer0.setBaseFillPaint(paint52);
        int int58 = minMaxCategoryRenderer0.getColumnCount();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (short) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier62 = minMaxCategoryRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator43);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(drawingSupplier62);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint5, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer8.removeAnnotations();
        boolean boolean15 = minMaxCategoryRenderer8.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = minMaxCategoryRenderer8.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        minMaxCategoryRenderer8.setLegendItemToolTipGenerator(categorySeriesLabelGenerator17);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = minMaxCategoryRenderer8.getNegativeItemLabelPosition((int) (byte) 0, (int) '4');
        minMaxCategoryRenderer8.setBaseSeriesVisible(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        minMaxCategoryRenderer8.setBaseItemLabelGenerator(categoryItemLabelGenerator24, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer27 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean29 = minMaxCategoryRenderer27.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = minMaxCategoryRenderer27.hasListener(eventListener30);
        java.awt.Paint paint33 = minMaxCategoryRenderer27.lookupSeriesPaint((int) (short) 1);
        javax.swing.Icon icon34 = minMaxCategoryRenderer27.getMinIcon();
        minMaxCategoryRenderer8.setMinIcon(icon34);
        minMaxCategoryRenderer0.setMinIcon(icon34);
        minMaxCategoryRenderer0.setSeriesVisible(0, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = minMaxCategoryRenderer0.getSeriesURLGenerator((int) (byte) -1);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) true, false);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(icon34);
        org.junit.Assert.assertNull(categoryURLGenerator43);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint8 = minMaxCategoryRenderer6.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = minMaxCategoryRenderer6.hasListener(eventListener9);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint11, true);
        java.awt.Paint paint16 = minMaxCategoryRenderer6.getItemLabelPaint(1, 10);
        minMaxCategoryRenderer0.setSeriesPaint((int) ' ', paint16, false);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer20 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer20.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer20.setBaseOutlinePaint(paint24);
        minMaxCategoryRenderer20.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer20.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean30 = minMaxCategoryRenderer20.isSeriesVisibleInLegend(1);
        minMaxCategoryRenderer20.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = minMaxCategoryRenderer20.getSeriesNegativeItemLabelPosition((int) (byte) 1);
        java.awt.Stroke stroke35 = minMaxCategoryRenderer20.getBaseOutlineStroke();
        minMaxCategoryRenderer0.setBaseStroke(stroke35);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer38 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint40 = minMaxCategoryRenderer38.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = minMaxCategoryRenderer38.hasListener(eventListener41);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer38.setBaseOutlinePaint(paint43, true);
        java.awt.Paint paint48 = minMaxCategoryRenderer38.getItemLabelPaint(10, (int) '4');
        minMaxCategoryRenderer0.setSeriesOutlinePaint((int) (short) 0, paint48, true);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.awt.Stroke stroke4 = minMaxCategoryRenderer0.getSeriesStroke(100);
        boolean boolean6 = minMaxCategoryRenderer0.isSeriesVisible((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = minMaxCategoryRenderer0.getPlot();
        java.awt.Font font10 = minMaxCategoryRenderer0.getItemLabelFont(0, (int) '#');
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = minMaxCategoryRenderer0.getDrawingSupplier();
        java.awt.Paint paint13 = minMaxCategoryRenderer0.lookupSeriesFillPaint((int) (short) 0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint16 = minMaxCategoryRenderer14.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer22 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer22.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer22.setBaseOutlinePaint(paint26);
        minMaxCategoryRenderer17.setSeriesFillPaint((int) 'a', paint26);
        minMaxCategoryRenderer14.setBaseItemLabelPaint(paint26, true);
        minMaxCategoryRenderer14.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        minMaxCategoryRenderer14.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true, true);
        minMaxCategoryRenderer14.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer39 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer39.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer39.setBaseOutlinePaint(paint43);
        minMaxCategoryRenderer39.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = minMaxCategoryRenderer39.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean49 = minMaxCategoryRenderer39.isSeriesVisibleInLegend(1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer50 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer50.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer50.setBaseOutlinePaint(paint54);
        minMaxCategoryRenderer50.removeAnnotations();
        java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer50.setGroupStroke(stroke57);
        minMaxCategoryRenderer50.setBaseCreateEntities(true);
        java.awt.Font font63 = minMaxCategoryRenderer50.getItemLabelFont((int) (byte) 10, 0);
        minMaxCategoryRenderer39.setBaseItemLabelFont(font63, true);
        minMaxCategoryRenderer14.setBaseItemLabelFont(font63, false);
        java.awt.Shape shape69 = minMaxCategoryRenderer14.getSeriesShape((int) (byte) 0);
        double double70 = minMaxCategoryRenderer14.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer71 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer71.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint76 = minMaxCategoryRenderer71.getSeriesPaint((int) '4');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator77 = minMaxCategoryRenderer71.getLegendItemLabelGenerator();
        minMaxCategoryRenderer14.setLegendItemToolTipGenerator(categorySeriesLabelGenerator77);
        java.awt.Paint paint79 = minMaxCategoryRenderer14.getGroupPaint();
        minMaxCategoryRenderer0.setBaseFillPaint(paint79, false);
        java.awt.Font font83 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) (byte) 1);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryPlot7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(font63);
        org.junit.Assert.assertNull(shape69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2.0d + "'", double70 == 2.0d);
        org.junit.Assert.assertNull(paint76);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator77);
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertNull(font83);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        java.lang.Boolean boolean7 = minMaxCategoryRenderer0.getSeriesVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint14 = minMaxCategoryRenderer8.getItemPaint((int) (byte) 100, 1);
        minMaxCategoryRenderer0.setBaseFillPaint(paint14);
        java.awt.Shape shape18 = minMaxCategoryRenderer0.getItemShape((int) (short) 100, 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator20);
        minMaxCategoryRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer24 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer24.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer24.setBaseOutlinePaint(paint28);
        minMaxCategoryRenderer24.removeAnnotations();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer24.setGroupStroke(stroke31);
        boolean boolean35 = minMaxCategoryRenderer24.getItemVisible((-1), (int) (byte) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = null;
        minMaxCategoryRenderer24.setBaseItemLabelGenerator(categoryItemLabelGenerator36, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer39 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer39.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer39.setBaseOutlinePaint(paint43);
        minMaxCategoryRenderer39.removeAnnotations();
        java.awt.Stroke stroke46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer39.setGroupStroke(stroke46);
        int int48 = minMaxCategoryRenderer39.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = minMaxCategoryRenderer39.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = minMaxCategoryRenderer39.getNegativeItemLabelPosition((int) (byte) 0, (int) '#');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator53 = minMaxCategoryRenderer39.getLegendItemLabelGenerator();
        minMaxCategoryRenderer24.setLegendItemToolTipGenerator(categorySeriesLabelGenerator53);
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator53);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = minMaxCategoryRenderer0.getBasePositiveItemLabelPosition();
        java.awt.Font font58 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) (short) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(categoryPlot49);
        org.junit.Assert.assertNotNull(itemLabelPosition52);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator53);
        org.junit.Assert.assertNotNull(itemLabelPosition56);
        org.junit.Assert.assertNull(font58);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setSeriesItemLabelFont(100, font18, false);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        minMaxCategoryRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) 0, categoryItemLabelGenerator13, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = minMaxCategoryRenderer0.getToolTipGenerator((int) (byte) 10, 10);
        java.awt.Font font21 = minMaxCategoryRenderer0.getItemLabelFont((int) (byte) 1, 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator23);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        boolean boolean9 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, false);
        minMaxCategoryRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator17, true);
        java.awt.Stroke stroke22 = minMaxCategoryRenderer0.getItemOutlineStroke((int) '4', (int) (short) 1);
        java.awt.Stroke stroke24 = minMaxCategoryRenderer0.getSeriesOutlineStroke((int) 'a');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean27 = minMaxCategoryRenderer25.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = minMaxCategoryRenderer25.hasListener(eventListener28);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer30 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint32 = minMaxCategoryRenderer30.getSeriesPaint((int) ' ');
        boolean boolean33 = minMaxCategoryRenderer30.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke36 = minMaxCategoryRenderer30.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer25.setBaseStroke(stroke36, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer39 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer39.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer39.setBaseOutlinePaint(paint43);
        javax.swing.Icon icon45 = minMaxCategoryRenderer39.getObjectIcon();
        minMaxCategoryRenderer25.setMaxIcon(icon45);
        minMaxCategoryRenderer0.setMaxIcon(icon45);
        java.awt.Graphics2D graphics2D48 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.plot.Marker marker51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        minMaxCategoryRenderer0.drawRangeMarker(graphics2D48, categoryPlot49, valueAxis50, marker51, rectangle2D52);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(icon45);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, true);
        java.lang.Boolean boolean10 = minMaxCategoryRenderer0.getSeriesVisibleInLegend((int) (short) 100);
        javax.swing.Icon icon11 = minMaxCategoryRenderer0.getObjectIcon();
        java.awt.Paint paint13 = minMaxCategoryRenderer0.lookupSeriesFillPaint((int) (short) 100);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        minMaxCategoryRenderer0.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        boolean boolean22 = minMaxCategoryRenderer0.isItemLabelVisible(1, (int) ' ');
        javax.swing.Icon icon23 = minMaxCategoryRenderer0.getObjectIcon();
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(icon11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(icon23);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Stroke stroke21 = minMaxCategoryRenderer0.lookupSeriesStroke((int) (byte) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
        boolean boolean23 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke25 = minMaxCategoryRenderer0.getSeriesOutlineStroke(1);
        minMaxCategoryRenderer0.setBaseCreateEntities(false, true);
        org.jfree.chart.LegendItem legendItem31 = minMaxCategoryRenderer0.getLegendItem((int) 'a', 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertNull(legendItem31);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, true);
        int int13 = minMaxCategoryRenderer0.getRowCount();
        boolean boolean14 = minMaxCategoryRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer15 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean17 = minMaxCategoryRenderer15.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer15.setSeriesOutlineStroke((int) (short) 100, stroke19, false);
        minMaxCategoryRenderer15.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer15.setBaseCreateEntities(false);
        boolean boolean27 = minMaxCategoryRenderer15.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint30 = minMaxCategoryRenderer28.getSeriesPaint((int) ' ');
        boolean boolean31 = minMaxCategoryRenderer28.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = null;
        minMaxCategoryRenderer28.setBaseToolTipGenerator(categoryToolTipGenerator32);
        minMaxCategoryRenderer28.setBaseCreateEntities(false);
        boolean boolean37 = minMaxCategoryRenderer28.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer38 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint40 = minMaxCategoryRenderer38.getSeriesPaint((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = minMaxCategoryRenderer38.getLegendItemLabelGenerator();
        minMaxCategoryRenderer28.setLegendItemToolTipGenerator(categorySeriesLabelGenerator41);
        minMaxCategoryRenderer15.setLegendItemURLGenerator(categorySeriesLabelGenerator41);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer45 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = minMaxCategoryRenderer45.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator49 = null;
        minMaxCategoryRenderer45.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator49);
        minMaxCategoryRenderer45.setBaseItemLabelsVisible(true, true);
        boolean boolean54 = minMaxCategoryRenderer45.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent55 = null;
        minMaxCategoryRenderer45.notifyListeners(rendererChangeEvent55);
        javax.swing.Icon icon57 = minMaxCategoryRenderer45.getMinIcon();
        java.awt.Stroke stroke58 = minMaxCategoryRenderer45.getGroupStroke();
        minMaxCategoryRenderer15.setSeriesStroke((int) (byte) 1, stroke58);
        minMaxCategoryRenderer0.setBaseStroke(stroke58, true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator41);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(icon57);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font18, false);
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem((int) (byte) 0, (int) 'a');
        boolean boolean25 = minMaxCategoryRenderer0.isSeriesVisibleInLegend(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator26);
        minMaxCategoryRenderer0.setBaseSeriesVisible(false, false);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = minMaxCategoryRenderer0.getToolTipGenerator((int) '#', (int) (short) 100);
        java.awt.Paint paint12 = minMaxCategoryRenderer0.getSeriesPaint(0);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator18);
        int int20 = minMaxCategoryRenderer0.getColumnCount();
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem(0, (int) (byte) 10);
        boolean boolean24 = minMaxCategoryRenderer0.getBaseCreateEntities();
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible((int) (byte) 10, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = minMaxCategoryRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer29.setSeriesVisible(10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = minMaxCategoryRenderer29.getSeriesURLGenerator((int) (byte) 0);
        boolean boolean36 = minMaxCategoryRenderer29.isSeriesItemLabelsVisible((int) '#');
        boolean boolean39 = minMaxCategoryRenderer29.isItemLabelVisible((-1), (int) '4');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer40 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint42 = minMaxCategoryRenderer40.getSeriesPaint((int) ' ');
        java.awt.Stroke stroke44 = minMaxCategoryRenderer40.getSeriesStroke(100);
        boolean boolean46 = minMaxCategoryRenderer40.isSeriesVisible((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = minMaxCategoryRenderer40.getPlot();
        java.awt.Font font50 = minMaxCategoryRenderer40.getItemLabelFont(0, (int) '#');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer52 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer52.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        minMaxCategoryRenderer52.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer59 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer59.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint63 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer59.setBaseOutlinePaint(paint63);
        minMaxCategoryRenderer59.removeAnnotations();
        java.awt.Stroke stroke66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer59.setGroupStroke(stroke66);
        int int68 = minMaxCategoryRenderer59.getPassCount();
        java.awt.Shape shape69 = minMaxCategoryRenderer59.getBaseShape();
        java.awt.Font font70 = minMaxCategoryRenderer59.getBaseItemLabelFont();
        minMaxCategoryRenderer52.setSeriesItemLabelFont(100, font70, false);
        minMaxCategoryRenderer52.setBaseSeriesVisibleInLegend(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = minMaxCategoryRenderer52.getSeriesPositiveItemLabelPosition(1);
        minMaxCategoryRenderer40.setSeriesNegativeItemLabelPosition(0, itemLabelPosition77, true);
        minMaxCategoryRenderer29.setBaseNegativeItemLabelPosition(itemLabelPosition77);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition77);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator28);
        org.junit.Assert.assertNull(categoryURLGenerator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNull(stroke44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(categoryPlot47);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(shape69);
        org.junit.Assert.assertNotNull(font70);
        org.junit.Assert.assertNotNull(itemLabelPosition77);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Font font21 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        boolean boolean26 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        java.awt.Shape shape27 = minMaxCategoryRenderer0.getBaseShape();
        minMaxCategoryRenderer0.setAutoPopulateSeriesPaint(false);
        boolean boolean32 = minMaxCategoryRenderer0.isItemLabelVisible((int) (byte) -1, (int) (byte) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) 1, categoryToolTipGenerator34, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator37, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = minMaxCategoryRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(categoryURLGenerator40);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        minMaxCategoryRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) 0, categoryItemLabelGenerator13, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = minMaxCategoryRenderer0.getSeriesToolTipGenerator((int) '4');
        minMaxCategoryRenderer0.setItemLabelAnchorOffset((double) 1L);
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawOutline(graphics2D20, categoryPlot21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryToolTipGenerator17);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font5 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer6.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint10);
        minMaxCategoryRenderer6.removeAnnotations();
        boolean boolean13 = minMaxCategoryRenderer6.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer14.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer14.setBaseOutlinePaint(paint18);
        minMaxCategoryRenderer14.removeAnnotations();
        boolean boolean21 = minMaxCategoryRenderer14.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = minMaxCategoryRenderer14.getBaseItemLabelGenerator();
        boolean boolean23 = minMaxCategoryRenderer14.getBaseSeriesVisible();
        javax.swing.Icon icon24 = minMaxCategoryRenderer14.getMaxIcon();
        minMaxCategoryRenderer6.setMinIcon(icon24);
        minMaxCategoryRenderer0.setMaxIcon(icon24);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true);
        java.awt.Paint paint30 = minMaxCategoryRenderer0.lookupSeriesOutlinePaint((int) (byte) 100);
        int int31 = minMaxCategoryRenderer0.getColumnCount();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(icon24);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Font font21 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) (short) 1);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, false);
        boolean boolean26 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        java.awt.Shape shape27 = minMaxCategoryRenderer0.getBaseShape();
        minMaxCategoryRenderer0.setAutoPopulateSeriesPaint(false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
        java.awt.Paint paint34 = minMaxCategoryRenderer0.getGroupPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.lang.Boolean boolean4 = minMaxCategoryRenderer0.getSeriesVisible(10);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint8 = minMaxCategoryRenderer6.getSeriesPaint((int) ' ');
        boolean boolean9 = minMaxCategoryRenderer6.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        minMaxCategoryRenderer6.setBaseToolTipGenerator(categoryToolTipGenerator10);
        minMaxCategoryRenderer6.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint18 = minMaxCategoryRenderer6.getItemFillPaint(100, 10);
        minMaxCategoryRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        minMaxCategoryRenderer6.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = minMaxCategoryRenderer6.getBaseNegativeItemLabelPosition();
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 100, itemLabelPosition24, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = minMaxCategoryRenderer0.getSeriesToolTipGenerator((int) (short) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = minMaxCategoryRenderer0.getDrawingSupplier();
        minMaxCategoryRenderer0.setAutoPopulateSeriesStroke(false);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNull(categoryToolTipGenerator28);
        org.junit.Assert.assertNull(drawingSupplier29);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        minMaxCategoryRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        boolean boolean13 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        int int14 = minMaxCategoryRenderer0.getRowCount();
        boolean boolean17 = minMaxCategoryRenderer0.getItemVisible((int) (short) 1, (int) (short) 1);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(false);
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer22 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint24 = minMaxCategoryRenderer22.getSeriesPaint((int) ' ');
        boolean boolean25 = minMaxCategoryRenderer22.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        minMaxCategoryRenderer22.setBaseToolTipGenerator(categoryToolTipGenerator26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = minMaxCategoryRenderer22.getItemLabelGenerator((int) 'a', (int) (short) 1);
        java.awt.Paint paint31 = minMaxCategoryRenderer22.getBaseItemLabelPaint();
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint31);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer4 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer4.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer4.setBaseOutlinePaint(paint8);
        minMaxCategoryRenderer4.removeAnnotations();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer4.setGroupStroke(stroke11);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke11, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator16);
        java.awt.Shape shape18 = minMaxCategoryRenderer0.getBaseShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator20, true);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = minMaxCategoryRenderer0.getLegendItems();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(legendItemCollection23);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font18, false);
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem((int) (byte) 0, (int) 'a');
        boolean boolean25 = minMaxCategoryRenderer0.isSeriesVisibleInLegend(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator26);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer28.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer28.setBaseOutlinePaint(paint32);
        minMaxCategoryRenderer28.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = minMaxCategoryRenderer28.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean38 = minMaxCategoryRenderer28.isSeriesVisibleInLegend(1);
        minMaxCategoryRenderer28.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = minMaxCategoryRenderer28.getSeriesNegativeItemLabelPosition((int) (byte) 1);
        java.awt.Stroke stroke43 = minMaxCategoryRenderer28.getBaseOutlineStroke();
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke43);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer45 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer45.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer45.setBaseOutlinePaint(paint49);
        minMaxCategoryRenderer45.removeAnnotations();
        java.awt.Stroke stroke52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer45.setGroupStroke(stroke52);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer54 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean56 = minMaxCategoryRenderer54.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer54.setSeriesOutlineStroke((int) (short) 100, stroke58, false);
        minMaxCategoryRenderer45.setGroupStroke(stroke58);
        minMaxCategoryRenderer0.setGroupStroke(stroke58);
        java.lang.Boolean boolean64 = minMaxCategoryRenderer0.getSeriesVisible((int) '#');
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNull(boolean56);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNull(boolean64);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer5.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer5.setBaseOutlinePaint(paint9);
        minMaxCategoryRenderer0.setSeriesFillPaint((int) 'a', paint9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator13);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator15);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer17.setGroupStroke(stroke24);
        int int26 = minMaxCategoryRenderer17.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = minMaxCategoryRenderer17.getPlot();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = minMaxCategoryRenderer28.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = null;
        minMaxCategoryRenderer28.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator32);
        minMaxCategoryRenderer28.setBaseItemLabelsVisible(true, true);
        java.lang.Boolean boolean38 = minMaxCategoryRenderer28.getSeriesVisibleInLegend((int) (short) 100);
        javax.swing.Icon icon39 = minMaxCategoryRenderer28.getObjectIcon();
        minMaxCategoryRenderer17.setObjectIcon(icon39);
        boolean boolean43 = minMaxCategoryRenderer17.isItemLabelVisible(100, (int) '4');
        java.awt.Paint paint44 = minMaxCategoryRenderer17.getBaseOutlinePaint();
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint44, true);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(categoryPlot27);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertNotNull(icon39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        int int9 = minMaxCategoryRenderer0.getPassCount();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = minMaxCategoryRenderer0.getLegendItems();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = minMaxCategoryRenderer0.getToolTipGenerator((int) (byte) 0, (int) ' ');
        java.awt.Paint paint14 = minMaxCategoryRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNull(categoryToolTipGenerator13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = minMaxCategoryRenderer14.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition17, false);
        java.awt.Paint paint22 = minMaxCategoryRenderer0.getItemOutlinePaint((int) (byte) 0, (int) (short) 0);
        java.awt.Paint paint24 = minMaxCategoryRenderer0.lookupSeriesFillPaint((-1));
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator28);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font5 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer6.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint10);
        minMaxCategoryRenderer6.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = minMaxCategoryRenderer6.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        java.awt.Stroke stroke17 = minMaxCategoryRenderer6.getItemStroke(0, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = minMaxCategoryRenderer6.getNegativeItemLabelPosition((int) (short) 10, (int) (byte) 1);
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition20, true);
        java.awt.Stroke stroke23 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint1 = minMaxCategoryRenderer0.getBaseFillPaint();
        javax.swing.Icon icon2 = minMaxCategoryRenderer0.getObjectIcon();
        java.awt.Paint paint3 = minMaxCategoryRenderer0.getBaseFillPaint();
        minMaxCategoryRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(icon2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean10 = minMaxCategoryRenderer0.isSeriesVisibleInLegend(1);
        minMaxCategoryRenderer0.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = minMaxCategoryRenderer0.getItemLabelGenerator((int) (short) 1, 0);
        boolean boolean16 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Paint paint18 = minMaxCategoryRenderer0.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer20 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean22 = minMaxCategoryRenderer20.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer20.setSeriesOutlineStroke((int) (short) 100, stroke24, false);
        minMaxCategoryRenderer20.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer20.setBaseItemLabelsVisible(true, false);
        boolean boolean33 = minMaxCategoryRenderer20.getAutoPopulateSeriesFillPaint();
        int int34 = minMaxCategoryRenderer20.getRowCount();
        boolean boolean37 = minMaxCategoryRenderer20.getItemVisible((int) (short) 1, (int) (short) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer38 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer38.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint44 = minMaxCategoryRenderer38.getItemPaint((int) (byte) 100, 1);
        minMaxCategoryRenderer20.setBaseItemLabelPaint(paint44, false);
        minMaxCategoryRenderer0.setSeriesFillPaint((int) '4', paint44);
        minMaxCategoryRenderer0.setAutoPopulateSeriesPaint(true);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false);
        java.awt.Graphics2D graphics2D52 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = null;
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawItem(graphics2D52, categoryItemRendererState53, rectangle2D54, categoryPlot55, categoryAxis56, valueAxis57, categoryDataset58, (int) (short) 1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        java.lang.Boolean boolean7 = minMaxCategoryRenderer0.getSeriesVisible((int) (byte) -1);
        boolean boolean8 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        java.awt.Shape shape10 = minMaxCategoryRenderer0.lookupSeriesShape(0);
        java.awt.Paint paint12 = minMaxCategoryRenderer0.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = minMaxCategoryRenderer13.getSeriesPositiveItemLabelPosition((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        minMaxCategoryRenderer13.setSeriesToolTipGenerator((int) '4', categoryToolTipGenerator17);
        minMaxCategoryRenderer13.setBaseItemLabelsVisible(true, true);
        java.awt.Font font22 = minMaxCategoryRenderer13.getBaseItemLabelFont();
        minMaxCategoryRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        boolean boolean26 = minMaxCategoryRenderer13.removeAnnotation(categoryAnnotation25);
        java.awt.Stroke stroke27 = minMaxCategoryRenderer13.getGroupStroke();
        java.awt.Shape shape28 = minMaxCategoryRenderer13.getBaseShape();
        minMaxCategoryRenderer0.setBaseShape(shape28);
        java.awt.Shape shape31 = minMaxCategoryRenderer0.getSeriesShape((int) (short) 1);
        java.awt.Stroke stroke33 = minMaxCategoryRenderer0.lookupSeriesOutlineStroke((int) (short) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = minMaxCategoryRenderer5.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition7);
        minMaxCategoryRenderer0.setBaseSeriesVisible(false);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true);
        minMaxCategoryRenderer0.setBaseSeriesVisible(false);
        java.awt.Stroke stroke16 = minMaxCategoryRenderer0.lookupSeriesStroke((int) ' ');
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean12 = minMaxCategoryRenderer10.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer10.setSeriesOutlineStroke((int) (short) 100, stroke14, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer17.setGroupStroke(stroke24);
        int int26 = minMaxCategoryRenderer17.getPassCount();
        java.awt.Shape shape27 = minMaxCategoryRenderer17.getBaseShape();
        java.awt.Font font28 = minMaxCategoryRenderer17.getBaseItemLabelFont();
        minMaxCategoryRenderer10.setBaseItemLabelFont(font28, false);
        org.jfree.chart.LegendItem legendItem33 = minMaxCategoryRenderer10.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseItemLabelPaint(paint34, false);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint34);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer38 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer38.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer38.setBaseOutlinePaint(paint42);
        minMaxCategoryRenderer38.removeAnnotations();
        boolean boolean45 = minMaxCategoryRenderer38.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = minMaxCategoryRenderer38.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator48 = null;
        minMaxCategoryRenderer38.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator48, false);
        java.awt.Font font51 = minMaxCategoryRenderer38.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font51, true);
        java.lang.Boolean boolean55 = minMaxCategoryRenderer0.getSeriesVisible((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = minMaxCategoryRenderer0.getPositiveItemLabelPosition((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(legendItem33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator46);
        org.junit.Assert.assertNotNull(font51);
        org.junit.Assert.assertNull(boolean55);
        org.junit.Assert.assertNotNull(itemLabelPosition58);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint10, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer13 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer13.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer13.setBaseOutlinePaint(paint17);
        minMaxCategoryRenderer13.removeAnnotations();
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer13.setGroupStroke(stroke20);
        int int22 = minMaxCategoryRenderer13.getPassCount();
        java.awt.Shape shape23 = minMaxCategoryRenderer13.getBaseShape();
        java.awt.Font font24 = minMaxCategoryRenderer13.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font24, false);
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer30 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer30.setSeriesVisible(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer30.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer38 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint40 = minMaxCategoryRenderer38.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = minMaxCategoryRenderer38.hasListener(eventListener41);
        java.awt.Font font43 = minMaxCategoryRenderer38.getBaseItemLabelFont();
        minMaxCategoryRenderer30.setSeriesItemLabelFont((int) (byte) 0, font43, true);
        minMaxCategoryRenderer0.setBaseItemLabelFont(font43, false);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator51 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator(0, categoryToolTipGenerator51);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator53 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator53, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(font43);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, true);
        java.awt.Stroke stroke16 = minMaxCategoryRenderer0.getItemOutlineStroke((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        boolean boolean9 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator13, true);
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawBackground(graphics2D16, categoryPlot17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.awt.Stroke stroke4 = minMaxCategoryRenderer0.getSeriesStroke(100);
        boolean boolean6 = minMaxCategoryRenderer0.isSeriesVisible((-1));
        java.awt.Paint paint7 = minMaxCategoryRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator8, false);
        java.lang.Boolean boolean12 = minMaxCategoryRenderer0.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator15);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator(10, categoryURLGenerator18, false);
        java.awt.Stroke stroke21 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer14.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer14.setBaseOutlinePaint(paint18);
        minMaxCategoryRenderer14.removeAnnotations();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer14.setGroupStroke(stroke21);
        int int23 = minMaxCategoryRenderer14.getPassCount();
        minMaxCategoryRenderer14.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer14.getSeriesNegativeItemLabelPosition((int) 'a');
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition28);
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        minMaxCategoryRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        java.lang.Object obj10 = minMaxCategoryRenderer0.clone();
        boolean boolean12 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible(10);
        java.awt.Paint paint13 = minMaxCategoryRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        java.awt.Shape shape7 = minMaxCategoryRenderer0.getSeriesShape((int) (short) 0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean10 = minMaxCategoryRenderer8.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer8.setSeriesOutlineStroke((int) (short) 100, stroke12, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer15 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer15.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer15.setBaseOutlinePaint(paint19);
        minMaxCategoryRenderer15.removeAnnotations();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer15.setGroupStroke(stroke22);
        int int24 = minMaxCategoryRenderer15.getPassCount();
        java.awt.Shape shape25 = minMaxCategoryRenderer15.getBaseShape();
        java.awt.Font font26 = minMaxCategoryRenderer15.getBaseItemLabelFont();
        minMaxCategoryRenderer8.setBaseItemLabelFont(font26, false);
        org.jfree.chart.LegendItem legendItem31 = minMaxCategoryRenderer8.getLegendItem((int) (byte) 0, (int) 'a');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer32 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer32.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer32.setBaseOutlinePaint(paint36);
        minMaxCategoryRenderer32.removeAnnotations();
        boolean boolean39 = minMaxCategoryRenderer32.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = minMaxCategoryRenderer32.getBaseItemLabelGenerator();
        boolean boolean41 = minMaxCategoryRenderer32.getBaseSeriesVisible();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer32.setBaseOutlinePaint(paint42, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer45 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer45.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer45.setBaseOutlinePaint(paint49);
        minMaxCategoryRenderer45.removeAnnotations();
        java.awt.Stroke stroke52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer45.setGroupStroke(stroke52);
        int int54 = minMaxCategoryRenderer45.getPassCount();
        java.awt.Shape shape55 = minMaxCategoryRenderer45.getBaseShape();
        java.awt.Font font56 = minMaxCategoryRenderer45.getBaseItemLabelFont();
        minMaxCategoryRenderer32.setBaseItemLabelFont(font56, false);
        minMaxCategoryRenderer32.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator62 = minMaxCategoryRenderer32.getLegendItemLabelGenerator();
        minMaxCategoryRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator62);
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator62);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNull(legendItem31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(font56);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator62);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        java.awt.Paint paint6 = minMaxCategoryRenderer0.lookupSeriesPaint((int) (short) 1);
        javax.swing.Icon icon7 = minMaxCategoryRenderer0.getMinIcon();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = minMaxCategoryRenderer0.getURLGenerator(1, (-1));
        java.awt.Paint paint13 = minMaxCategoryRenderer0.getItemOutlinePaint((int) (short) -1, (int) 'a');
        minMaxCategoryRenderer0.setSeriesVisible((int) (byte) 10, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = minMaxCategoryRenderer0.getURLGenerator((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(icon7);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categoryURLGenerator20);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = minMaxCategoryRenderer0.getItemLabelGenerator((int) (short) -1, (int) (byte) 1);
        minMaxCategoryRenderer0.setItemLabelAnchorOffset((-1.0d));
        java.awt.Stroke stroke10 = minMaxCategoryRenderer0.getGroupStroke();
        java.awt.Paint paint11 = minMaxCategoryRenderer0.getGroupPaint();
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator9);
        boolean boolean11 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlinePaint();
        java.awt.Font font12 = minMaxCategoryRenderer0.getBaseItemLabelFont();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = minMaxCategoryRenderer0.hasListener(eventListener13);
        java.awt.Shape shape17 = minMaxCategoryRenderer0.getItemShape((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(stroke7);
        minMaxCategoryRenderer0.setBaseCreateEntities(true);
        java.awt.Font font13 = minMaxCategoryRenderer0.getItemLabelFont((int) (byte) 10, 0);
        java.awt.Paint paint16 = minMaxCategoryRenderer0.getItemFillPaint((int) (byte) 0, (int) (short) -1);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer3 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer3.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer8.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer8.setBaseOutlinePaint(paint12);
        minMaxCategoryRenderer3.setSeriesFillPaint((int) 'a', paint12);
        minMaxCategoryRenderer0.setBaseItemLabelPaint(paint12, true);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true, true);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer25 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer25.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer25.setBaseOutlinePaint(paint29);
        minMaxCategoryRenderer25.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = minMaxCategoryRenderer25.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean35 = minMaxCategoryRenderer25.isSeriesVisibleInLegend(1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer36 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer36.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer36.setBaseOutlinePaint(paint40);
        minMaxCategoryRenderer36.removeAnnotations();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer36.setGroupStroke(stroke43);
        minMaxCategoryRenderer36.setBaseCreateEntities(true);
        java.awt.Font font49 = minMaxCategoryRenderer36.getItemLabelFont((int) (byte) 10, 0);
        minMaxCategoryRenderer25.setBaseItemLabelFont(font49, true);
        minMaxCategoryRenderer0.setBaseItemLabelFont(font49, false);
        java.awt.Shape shape55 = minMaxCategoryRenderer0.getSeriesShape((int) (byte) 0);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) 'a', (java.lang.Boolean) true, false);
        java.awt.Font font62 = minMaxCategoryRenderer0.getItemLabelFont((int) (byte) -1, 10);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertNotNull(font62);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint6 = minMaxCategoryRenderer0.getItemPaint((int) (byte) 100, 1);
        java.awt.Shape shape7 = minMaxCategoryRenderer0.getBaseShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = minMaxCategoryRenderer0.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = minMaxCategoryRenderer0.getSeriesVisible((int) (short) 1);
        minMaxCategoryRenderer0.setSeriesCreateEntities((int) (byte) 0, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        boolean boolean4 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint8 = minMaxCategoryRenderer6.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = minMaxCategoryRenderer6.hasListener(eventListener9);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint11, true);
        java.awt.Paint paint16 = minMaxCategoryRenderer6.getItemLabelPaint(1, 10);
        minMaxCategoryRenderer0.setSeriesPaint((int) ' ', paint16, false);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer0.getBaseOutlineStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) '#');
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Paint paint25 = minMaxCategoryRenderer0.getGroupPaint();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Font font15 = minMaxCategoryRenderer0.getItemLabelFont((int) 'a', (int) (byte) 0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean19 = minMaxCategoryRenderer17.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer17.setSeriesOutlineStroke((int) (short) 100, stroke21, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer24 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer24.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer24.setBaseOutlinePaint(paint28);
        minMaxCategoryRenderer24.removeAnnotations();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer24.setGroupStroke(stroke31);
        int int33 = minMaxCategoryRenderer24.getPassCount();
        java.awt.Shape shape34 = minMaxCategoryRenderer24.getBaseShape();
        java.awt.Font font35 = minMaxCategoryRenderer24.getBaseItemLabelFont();
        minMaxCategoryRenderer17.setBaseItemLabelFont(font35, false);
        minMaxCategoryRenderer0.setSeriesItemLabelFont((int) (byte) 10, font35, true);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        int int7 = minMaxCategoryRenderer0.getPassCount();
        int int8 = minMaxCategoryRenderer0.getPassCount();
        java.awt.Stroke stroke10 = minMaxCategoryRenderer0.getSeriesStroke(0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer12 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Shape shape14 = minMaxCategoryRenderer12.lookupSeriesShape((int) '4');
        minMaxCategoryRenderer0.setSeriesShape(100, shape14);
        java.awt.Paint paint17 = minMaxCategoryRenderer0.lookupSeriesFillPaint((int) '#');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer18 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint20 = minMaxCategoryRenderer18.getSeriesPaint((int) ' ');
        boolean boolean21 = minMaxCategoryRenderer18.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke24 = minMaxCategoryRenderer18.getItemOutlineStroke(0, (int) '#');
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        minMaxCategoryRenderer18.setSeriesItemLabelPaint(1, paint26, true);
        minMaxCategoryRenderer18.setBaseItemLabelsVisible(true, true);
        minMaxCategoryRenderer18.setAutoPopulateSeriesFillPaint(false);
        boolean boolean34 = minMaxCategoryRenderer0.equals((java.lang.Object) minMaxCategoryRenderer18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer12 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer12.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer12.setBaseOutlinePaint(paint16);
        java.lang.Boolean boolean19 = minMaxCategoryRenderer12.getSeriesVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer20 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer20.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Paint paint26 = minMaxCategoryRenderer20.getItemPaint((int) (byte) 100, 1);
        minMaxCategoryRenderer12.setBaseFillPaint(paint26);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint26, false);
        java.awt.Shape shape31 = minMaxCategoryRenderer0.lookupSeriesShape((int) (short) -1);
        boolean boolean32 = minMaxCategoryRenderer0.getAutoPopulateSeriesStroke();
        minMaxCategoryRenderer0.setAutoPopulateSeriesPaint(true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        java.awt.Font font9 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        java.awt.Stroke stroke14 = minMaxCategoryRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer16 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer16.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer16.setBaseOutlinePaint(paint20);
        minMaxCategoryRenderer16.removeAnnotations();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer16.setGroupStroke(stroke23);
        int int25 = minMaxCategoryRenderer16.getPassCount();
        java.awt.Shape shape26 = minMaxCategoryRenderer16.getBaseShape();
        java.awt.Font font27 = minMaxCategoryRenderer16.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = minMaxCategoryRenderer29.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer16.setSeriesNegativeItemLabelPosition((int) (byte) 1, itemLabelPosition31, true);
        minMaxCategoryRenderer0.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition31, true);
        int int36 = minMaxCategoryRenderer0.getPassCount();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        minMaxCategoryRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        boolean boolean15 = minMaxCategoryRenderer0.getItemCreateEntity((-1), 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer16 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer16.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer16.setBaseOutlinePaint(paint20);
        minMaxCategoryRenderer16.removeAnnotations();
        boolean boolean23 = minMaxCategoryRenderer16.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = minMaxCategoryRenderer16.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = null;
        minMaxCategoryRenderer16.setLegendItemToolTipGenerator(categorySeriesLabelGenerator25);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = minMaxCategoryRenderer16.getNegativeItemLabelPosition((int) (byte) 0, (int) '4');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer30 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer30.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer30.setBaseOutlinePaint(paint34);
        minMaxCategoryRenderer30.removeAnnotations();
        boolean boolean37 = minMaxCategoryRenderer30.getBaseSeriesVisible();
        minMaxCategoryRenderer30.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer30.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer44 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = minMaxCategoryRenderer44.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer30.setBaseNegativeItemLabelPosition(itemLabelPosition47, false);
        java.awt.Stroke stroke51 = minMaxCategoryRenderer30.lookupSeriesStroke((int) (byte) 1);
        minMaxCategoryRenderer16.setBaseOutlineStroke(stroke51, false);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke51);
        java.lang.Object obj55 = minMaxCategoryRenderer0.clone();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer7.setGroupStroke(stroke14);
        int int16 = minMaxCategoryRenderer7.getPassCount();
        java.awt.Shape shape17 = minMaxCategoryRenderer7.getBaseShape();
        java.awt.Font font18 = minMaxCategoryRenderer7.getBaseItemLabelFont();
        minMaxCategoryRenderer0.setBaseItemLabelFont(font18, false);
        org.jfree.chart.LegendItem legendItem23 = minMaxCategoryRenderer0.getLegendItem((int) (byte) 0, (int) 'a');
        boolean boolean25 = minMaxCategoryRenderer0.isSeriesVisibleInLegend(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator26);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer28 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer28.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer28.setBaseOutlinePaint(paint32);
        minMaxCategoryRenderer28.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = minMaxCategoryRenderer28.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        boolean boolean38 = minMaxCategoryRenderer28.isSeriesVisibleInLegend(1);
        minMaxCategoryRenderer28.setAutoPopulateSeriesShape(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = minMaxCategoryRenderer28.getSeriesNegativeItemLabelPosition((int) (byte) 1);
        java.awt.Stroke stroke43 = minMaxCategoryRenderer28.getBaseOutlineStroke();
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke43);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator45);
        java.lang.Boolean boolean48 = minMaxCategoryRenderer0.getSeriesVisible(0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItem23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNull(boolean48);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke4, false);
        minMaxCategoryRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        boolean boolean13 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator14, true);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        javax.swing.Icon icon20 = minMaxCategoryRenderer0.getMinIcon();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(icon20);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        java.awt.Stroke stroke6 = minMaxCategoryRenderer0.getItemOutlineStroke(0, (int) '#');
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10);
        java.awt.Stroke stroke12 = minMaxCategoryRenderer0.getBaseStroke();
        boolean boolean13 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer14.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer14.setBaseOutlinePaint(paint18);
        minMaxCategoryRenderer14.removeAnnotations();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = minMaxCategoryRenderer14.getSeriesPositiveItemLabelPosition((int) (byte) 0);
        java.awt.Stroke stroke25 = minMaxCategoryRenderer14.getItemStroke(0, 0);
        java.lang.Object obj26 = minMaxCategoryRenderer14.clone();
        java.awt.Paint paint28 = minMaxCategoryRenderer14.getSeriesFillPaint((int) (short) -1);
        java.lang.Boolean boolean30 = minMaxCategoryRenderer14.getSeriesItemLabelsVisible((int) (byte) 100);
        java.awt.Stroke stroke31 = minMaxCategoryRenderer14.getBaseOutlineStroke();
        minMaxCategoryRenderer0.setGroupStroke(stroke31);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean2 = minMaxCategoryRenderer0.getSeriesCreateEntities((int) (short) -1);
        java.awt.Font font5 = minMaxCategoryRenderer0.getItemLabelFont((int) (short) 100, (int) '#');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer6.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer6.setBaseOutlinePaint(paint10);
        minMaxCategoryRenderer6.removeAnnotations();
        boolean boolean13 = minMaxCategoryRenderer6.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer14.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer14.setBaseOutlinePaint(paint18);
        minMaxCategoryRenderer14.removeAnnotations();
        boolean boolean21 = minMaxCategoryRenderer14.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = minMaxCategoryRenderer14.getBaseItemLabelGenerator();
        boolean boolean23 = minMaxCategoryRenderer14.getBaseSeriesVisible();
        javax.swing.Icon icon24 = minMaxCategoryRenderer14.getMaxIcon();
        minMaxCategoryRenderer6.setMinIcon(icon24);
        minMaxCategoryRenderer0.setMaxIcon(icon24);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(true);
        minMaxCategoryRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = minMaxCategoryRenderer0.getURLGenerator((-1), (int) 'a');
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.util.Layer layer38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawAnnotations(graphics2D34, rectangle2D35, categoryAxis36, valueAxis37, layer38, plotRenderingInfo39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(icon24);
        org.junit.Assert.assertNull(categoryURLGenerator33);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
        java.awt.Paint paint4 = minMaxCategoryRenderer0.getBaseFillPaint();
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint12 = minMaxCategoryRenderer10.getSeriesPaint((int) ' ');
        boolean boolean13 = minMaxCategoryRenderer10.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = null;
        minMaxCategoryRenderer10.setBaseToolTipGenerator(categoryToolTipGenerator14);
        minMaxCategoryRenderer10.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Paint paint22 = minMaxCategoryRenderer10.getItemFillPaint(100, 10);
        java.awt.Paint paint25 = minMaxCategoryRenderer10.getItemOutlinePaint(1, 100);
        minMaxCategoryRenderer0.setSeriesPaint((int) ' ', paint25, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint31 = minMaxCategoryRenderer29.getSeriesPaint((int) ' ');
        boolean boolean32 = minMaxCategoryRenderer29.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        minMaxCategoryRenderer29.setBaseToolTipGenerator(categoryToolTipGenerator33);
        minMaxCategoryRenderer29.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator39 = minMaxCategoryRenderer29.getToolTipGenerator((int) '#', (int) (short) 100);
        java.awt.Paint paint41 = minMaxCategoryRenderer29.getSeriesPaint(0);
        minMaxCategoryRenderer29.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) false, true);
        minMaxCategoryRenderer29.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) true, false);
        minMaxCategoryRenderer29.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer53 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint55 = minMaxCategoryRenderer53.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener56 = null;
        boolean boolean57 = minMaxCategoryRenderer53.hasListener(eventListener56);
        boolean boolean60 = minMaxCategoryRenderer53.getItemCreateEntity((int) '4', (int) (short) 1);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer62 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer62.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer62.setBaseOutlinePaint(paint66);
        minMaxCategoryRenderer62.removeAnnotations();
        boolean boolean69 = minMaxCategoryRenderer62.getBaseSeriesVisible();
        minMaxCategoryRenderer62.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        minMaxCategoryRenderer62.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Stroke stroke78 = minMaxCategoryRenderer62.getItemStroke((int) ' ', (int) '#');
        minMaxCategoryRenderer53.setSeriesStroke((int) (short) 100, stroke78, false);
        minMaxCategoryRenderer29.setSeriesStroke((int) (short) 10, stroke78, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = minMaxCategoryRenderer29.getSeriesNegativeItemLabelPosition((int) ' ');
        minMaxCategoryRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition84);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator39);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(paint55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(stroke78);
        org.junit.Assert.assertNotNull(itemLabelPosition84);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) (short) 100);
        minMaxCategoryRenderer0.setSeriesVisible((int) '4', (java.lang.Boolean) true);
        minMaxCategoryRenderer0.setAutoPopulateSeriesPaint(false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, true);
        javax.swing.Icon icon13 = minMaxCategoryRenderer0.getObjectIcon();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(icon13);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11);
        java.awt.Paint paint14 = minMaxCategoryRenderer0.getSeriesItemLabelPaint(0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer15 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer15.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer15.setBaseOutlinePaint(paint19);
        minMaxCategoryRenderer15.removeAnnotations();
        boolean boolean22 = minMaxCategoryRenderer15.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = minMaxCategoryRenderer15.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        minMaxCategoryRenderer15.setLegendItemToolTipGenerator(categorySeriesLabelGenerator24);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = minMaxCategoryRenderer15.getNegativeItemLabelPosition((int) (byte) 0, (int) '4');
        java.awt.Paint paint31 = minMaxCategoryRenderer15.getItemOutlinePaint((int) (short) 100, (int) (byte) -1);
        minMaxCategoryRenderer0.setBaseFillPaint(paint31);
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.Marker marker36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        minMaxCategoryRenderer0.drawRangeMarker(graphics2D33, categoryPlot34, valueAxis35, marker36, rectangle2D37);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator39);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        java.awt.Font font4 = minMaxCategoryRenderer0.getBaseItemLabelFont();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator5 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator5);
        java.awt.Font font8 = minMaxCategoryRenderer0.getSeriesItemLabelFont((-1));
        java.awt.Stroke stroke10 = minMaxCategoryRenderer0.lookupSeriesStroke((-1));
        java.awt.Font font11 = minMaxCategoryRenderer0.getBaseItemLabelFont();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean12 = minMaxCategoryRenderer10.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer10.setSeriesOutlineStroke((int) (short) 100, stroke14, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer17.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseOutlinePaint(paint21);
        minMaxCategoryRenderer17.removeAnnotations();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer17.setGroupStroke(stroke24);
        int int26 = minMaxCategoryRenderer17.getPassCount();
        java.awt.Shape shape27 = minMaxCategoryRenderer17.getBaseShape();
        java.awt.Font font28 = minMaxCategoryRenderer17.getBaseItemLabelFont();
        minMaxCategoryRenderer10.setBaseItemLabelFont(font28, false);
        org.jfree.chart.LegendItem legendItem33 = minMaxCategoryRenderer10.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer10.setBaseItemLabelPaint(paint34, false);
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint34);
        boolean boolean39 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) -1);
        javax.swing.Icon icon40 = minMaxCategoryRenderer0.getMaxIcon();
        java.awt.Paint paint43 = minMaxCategoryRenderer0.getItemOutlinePaint((int) (byte) 1, (-1));
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer44 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint46 = minMaxCategoryRenderer44.getSeriesPaint((int) ' ');
        java.awt.Stroke stroke48 = minMaxCategoryRenderer44.getSeriesStroke(100);
        boolean boolean50 = minMaxCategoryRenderer44.isSeriesVisible((-1));
        java.awt.Paint paint51 = minMaxCategoryRenderer44.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator52 = null;
        minMaxCategoryRenderer44.setBaseToolTipGenerator(categoryToolTipGenerator52, false);
        java.lang.Boolean boolean56 = minMaxCategoryRenderer44.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator57 = minMaxCategoryRenderer44.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer58 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer58.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer58.setBaseOutlinePaint(paint62);
        minMaxCategoryRenderer58.removeAnnotations();
        java.awt.Stroke stroke65 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer58.setGroupStroke(stroke65);
        int int67 = minMaxCategoryRenderer58.getPassCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = minMaxCategoryRenderer58.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = minMaxCategoryRenderer58.getSeriesPositiveItemLabelPosition((int) (short) 10);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator71 = minMaxCategoryRenderer58.getLegendItemLabelGenerator();
        minMaxCategoryRenderer44.setLegendItemURLGenerator(categorySeriesLabelGenerator71);
        javax.swing.Icon icon73 = minMaxCategoryRenderer44.getMaxIcon();
        minMaxCategoryRenderer0.setObjectIcon(icon73);
        javax.swing.Icon icon75 = minMaxCategoryRenderer0.getObjectIcon();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(legendItem33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(icon40);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNull(stroke48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNull(boolean56);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator57);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNull(categoryPlot68);
        org.junit.Assert.assertNotNull(itemLabelPosition70);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator71);
        org.junit.Assert.assertNotNull(icon73);
        org.junit.Assert.assertNotNull(icon75);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator4);
        minMaxCategoryRenderer0.setBaseCreateEntities(false);
        boolean boolean9 = minMaxCategoryRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        minMaxCategoryRenderer0.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer14 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint16 = minMaxCategoryRenderer14.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = minMaxCategoryRenderer14.hasListener(eventListener17);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer14.setBaseOutlinePaint(paint19, true);
        java.awt.Paint paint24 = minMaxCategoryRenderer14.getItemLabelPaint(1, 10);
        minMaxCategoryRenderer0.setSeriesFillPaint((int) (short) 100, paint24);
        java.awt.Paint paint28 = minMaxCategoryRenderer0.getItemFillPaint((int) (short) 0, (int) (byte) 100);
        boolean boolean29 = minMaxCategoryRenderer0.getBaseItemLabelsVisible();
        int int30 = minMaxCategoryRenderer0.getColumnCount();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer0.setBaseOutlinePaint(paint4);
        minMaxCategoryRenderer0.removeAnnotations();
        boolean boolean7 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = minMaxCategoryRenderer8.getPositiveItemLabelPosition((int) (byte) -1, 100);
        minMaxCategoryRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition11);
        java.awt.Paint paint14 = minMaxCategoryRenderer0.getSeriesOutlinePaint(1);
        minMaxCategoryRenderer0.setAutoPopulateSeriesFillPaint(true);
        java.awt.Font font18 = minMaxCategoryRenderer0.getSeriesItemLabelFont((int) (short) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(font18);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.getSeriesPaint((int) ' ');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = minMaxCategoryRenderer0.hasListener(eventListener3);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation5 = null;
        boolean boolean6 = minMaxCategoryRenderer0.removeAnnotation(categoryAnnotation5);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer7.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint11);
        minMaxCategoryRenderer7.removeAnnotations();
        boolean boolean14 = minMaxCategoryRenderer7.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = minMaxCategoryRenderer7.getBaseItemLabelGenerator();
        boolean boolean16 = minMaxCategoryRenderer7.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer17 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.lang.Boolean boolean19 = minMaxCategoryRenderer17.getSeriesCreateEntities((int) (short) -1);
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        minMaxCategoryRenderer17.setSeriesOutlineStroke((int) (short) 100, stroke21, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer24 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer24.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer24.setBaseOutlinePaint(paint28);
        minMaxCategoryRenderer24.removeAnnotations();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        minMaxCategoryRenderer24.setGroupStroke(stroke31);
        int int33 = minMaxCategoryRenderer24.getPassCount();
        java.awt.Shape shape34 = minMaxCategoryRenderer24.getBaseShape();
        java.awt.Font font35 = minMaxCategoryRenderer24.getBaseItemLabelFont();
        minMaxCategoryRenderer17.setBaseItemLabelFont(font35, false);
        org.jfree.chart.LegendItem legendItem40 = minMaxCategoryRenderer17.getLegendItem((int) (byte) 0, (int) 'a');
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        minMaxCategoryRenderer17.setBaseItemLabelPaint(paint41, false);
        minMaxCategoryRenderer7.setBaseOutlinePaint(paint41);
        boolean boolean45 = minMaxCategoryRenderer0.equals((java.lang.Object) paint41);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.util.Layer layer50 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawAnnotations(graphics2D46, rectangle2D47, categoryAxis48, valueAxis49, layer50, plotRenderingInfo51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNull(legendItem40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }
}

