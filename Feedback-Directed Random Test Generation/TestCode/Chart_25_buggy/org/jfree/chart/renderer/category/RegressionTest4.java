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
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        int int11 = statisticalBarRenderer0.getPassCount();
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((-1), (int) (short) 10);
        boolean boolean17 = statisticalBarRenderer0.isItemLabelVisible((int) ' ', (int) 'a');
        java.awt.Paint paint20 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 10, (int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = statisticalBarRenderer0.getURLGenerator((int) (short) 10, 10);
        double double24 = statisticalBarRenderer0.getMinimumBarLength();
        java.awt.Paint paint27 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 0, (int) (short) -1);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer28 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer28);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryURLGenerator23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator2 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Font font4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) ' ', font4, true);
        boolean boolean8 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        statisticalBarRenderer12.setIncludeBaseInRange(false);
        java.awt.Paint paint17 = statisticalBarRenderer12.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer12.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer12.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer12.getPositiveItemLabelPositionFallback();
        java.awt.Paint paint24 = statisticalBarRenderer12.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseFillPaint(paint24, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer27.getLegendItemURLGenerator();
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        java.awt.Paint paint32 = statisticalBarRenderer27.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer27.setMinimumBarLength((double) 0L);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = statisticalBarRenderer27.getBaseItemLabelGenerator();
        boolean boolean36 = statisticalBarRenderer27.getIncludeBaseInRange();
        boolean boolean37 = statisticalBarRenderer27.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = statisticalBarRenderer27.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition38);
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.data.statistics.StatisticalCategoryDataset statisticalCategoryDataset46 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawHorizontalItem(graphics2D40, categoryItemRendererState41, rectangle2D42, categoryPlot43, categoryAxis44, valueAxis45, statisticalCategoryDataset46, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator2);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer7.getLegendItemURLGenerator();
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Paint paint12 = statisticalBarRenderer7.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint14 = statisticalBarRenderer7.getSeriesPaint((int) ' ');
        java.awt.Font font17 = statisticalBarRenderer7.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Paint paint18 = statisticalBarRenderer7.getBaseFillPaint();
        boolean boolean19 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer7);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = statisticalBarRenderer0.getSeriesURLGenerator((int) '4');
        statisticalBarRenderer0.setMinimumBarLength(0.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer24.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer26.getLegendItemURLGenerator();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer26.setBaseFillPaint(paint28);
        statisticalBarRenderer24.setBaseItemLabelPaint(paint28, true);
        java.awt.Shape shape33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer24.setSeriesShape(1, shape33);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = null;
        statisticalBarRenderer24.setLegendItemURLGenerator(categorySeriesLabelGenerator35);
        statisticalBarRenderer24.setBase((double) 0L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = statisticalBarRenderer39.getLegendItemURLGenerator();
        statisticalBarRenderer39.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = null;
        statisticalBarRenderer39.setBaseItemLabelGenerator(categoryItemLabelGenerator43);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = statisticalBarRenderer45.getLegendItemURLGenerator();
        statisticalBarRenderer45.setIncludeBaseInRange(false);
        java.awt.Paint paint50 = statisticalBarRenderer45.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint51 = statisticalBarRenderer45.getBasePaint();
        java.awt.Stroke stroke54 = statisticalBarRenderer45.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer39.setBaseOutlineStroke(stroke54, true);
        double double57 = statisticalBarRenderer39.getUpperClip();
        statisticalBarRenderer39.setMinimumBarLength((double) (byte) 10);
        java.awt.Paint paint62 = statisticalBarRenderer39.getItemPaint(100, (int) '4');
        statisticalBarRenderer24.setBaseItemLabelPaint(paint62);
        java.awt.Graphics2D graphics2D64 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = null;
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        org.jfree.chart.plot.Marker marker67 = null;
        java.awt.geom.Rectangle2D rectangle2D68 = null;
        statisticalBarRenderer24.drawRangeMarker(graphics2D64, categoryPlot65, valueAxis66, marker67, rectangle2D68);
        statisticalBarRenderer24.setAutoPopulateSeriesFillPaint(true);
        java.awt.Stroke stroke73 = statisticalBarRenderer24.getSeriesOutlineStroke(0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator74 = statisticalBarRenderer24.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator74);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(categoryURLGenerator21);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator40);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator46);
        org.junit.Assert.assertNull(paint50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNull(stroke73);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator74);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.lang.Boolean boolean4 = statisticalBarRenderer0.getSeriesVisible(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer5.getLegendItemURLGenerator();
        int int7 = statisticalBarRenderer5.getRowCount();
        java.awt.Font font9 = statisticalBarRenderer5.getSeriesItemLabelFont((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Paint paint15 = statisticalBarRenderer10.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer10.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer18.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer10.setPositiveItemLabelPositionFallback(itemLabelPosition22);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer24.getLegendItemURLGenerator();
        statisticalBarRenderer24.setIncludeBaseInRange(false);
        java.awt.Paint paint29 = statisticalBarRenderer24.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint30 = statisticalBarRenderer24.getBasePaint();
        java.awt.Stroke stroke33 = statisticalBarRenderer24.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer24.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer10.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = statisticalBarRenderer38.getLegendItemURLGenerator();
        statisticalBarRenderer38.setIncludeBaseInRange(false);
        java.awt.Paint paint43 = statisticalBarRenderer38.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint44 = statisticalBarRenderer38.getBasePaint();
        java.awt.Stroke stroke47 = statisticalBarRenderer38.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer10.setBaseOutlineStroke(stroke47, false);
        statisticalBarRenderer5.setBaseOutlineStroke(stroke47, false);
        java.awt.Paint paint54 = statisticalBarRenderer5.getItemFillPaint(0, (int) (byte) 1);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator56, true);
        int int59 = statisticalBarRenderer0.getColumnCount();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(font9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator39);
        org.junit.Assert.assertNull(paint43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font17);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) false);
        java.awt.Paint paint23 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) ' ');
        boolean boolean24 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        double double25 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertNull(itemLabelPosition26);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBase(100.0d);
        statisticalBarRenderer0.setMinimumBarLength((double) (short) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer13.setBaseItemLabelGenerator(categoryItemLabelGenerator17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer19.getLegendItemURLGenerator();
        statisticalBarRenderer19.setIncludeBaseInRange(false);
        java.awt.Paint paint24 = statisticalBarRenderer19.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint25 = statisticalBarRenderer19.getBasePaint();
        java.awt.Stroke stroke28 = statisticalBarRenderer19.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer13.setBaseOutlineStroke(stroke28, true);
        double double31 = statisticalBarRenderer13.getUpperClip();
        statisticalBarRenderer13.setMinimumBarLength((double) (byte) 10);
        java.awt.Paint paint36 = statisticalBarRenderer13.getItemPaint(100, (int) '4');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = null;
        statisticalBarRenderer13.setBaseToolTipGenerator(categoryToolTipGenerator37);
        java.awt.Shape shape40 = statisticalBarRenderer13.getSeriesShape((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer41.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = statisticalBarRenderer41.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = statisticalBarRenderer41.getBaseItemLabelGenerator();
        boolean boolean47 = statisticalBarRenderer41.getBaseSeriesVisibleInLegend();
        boolean boolean48 = statisticalBarRenderer41.getBaseCreateEntities();
        java.awt.Font font49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer41.setBaseItemLabelFont(font49);
        java.awt.Paint paint51 = statisticalBarRenderer41.getBaseOutlinePaint();
        statisticalBarRenderer13.setBaseItemLabelPaint(paint51);
        statisticalBarRenderer0.setSeriesPaint((int) (short) 100, paint51);
        java.awt.Paint paint54 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseItemLabelPaint(paint54, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(itemLabelPosition45);
        org.junit.Assert.assertNull(categoryItemLabelGenerator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesItemLabelsVisible(100);
        boolean boolean7 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = statisticalBarRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(drawingSupplier8);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint12);
        statisticalBarRenderer8.setBaseItemLabelPaint(paint12, true);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape(1, shape17);
        statisticalBarRenderer0.setBaseShape(shape17, true);
        java.awt.Stroke stroke21 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer23.getLegendItemURLGenerator();
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer23.setBaseFillPaint(paint25);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        statisticalBarRenderer23.setBaseURLGenerator(categoryURLGenerator27, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer30.getLegendItemURLGenerator();
        int int32 = statisticalBarRenderer30.getRowCount();
        java.awt.Font font34 = statisticalBarRenderer30.getSeriesItemLabelFont((int) (short) 1);
        statisticalBarRenderer30.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true);
        boolean boolean38 = statisticalBarRenderer30.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint41 = statisticalBarRenderer30.getItemFillPaint(10, (int) (byte) 10);
        statisticalBarRenderer23.setBaseOutlinePaint(paint41, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = statisticalBarRenderer45.getLegendItemURLGenerator();
        statisticalBarRenderer45.setIncludeBaseInRange(false);
        java.awt.Paint paint50 = statisticalBarRenderer45.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer45.setBaseOutlineStroke(stroke51);
        statisticalBarRenderer45.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer57.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition61 = statisticalBarRenderer57.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator62 = statisticalBarRenderer57.getBaseItemLabelGenerator();
        boolean boolean63 = statisticalBarRenderer57.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer57.setSeriesItemLabelsVisible((int) (byte) 1, false);
        java.awt.Paint paint69 = statisticalBarRenderer57.getItemLabelPaint((int) (short) 100, (int) (byte) 100);
        statisticalBarRenderer45.setBaseFillPaint(paint69, true);
        statisticalBarRenderer23.setSeriesPaint(0, paint69);
        statisticalBarRenderer0.setSeriesFillPaint((int) '4', paint69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator74 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator74, false);
        boolean boolean77 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(font34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator46);
        org.junit.Assert.assertNull(paint50);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertNotNull(itemLabelPosition61);
        org.junit.Assert.assertNull(categoryItemLabelGenerator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator6);
        statisticalBarRenderer0.setMinimumBarLength((double) (byte) 100);
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint10, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        boolean boolean14 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation13);
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, true);
        java.awt.Font font21 = statisticalBarRenderer0.getItemLabelFont(0, (int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer9.getLegendItemURLGenerator();
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        statisticalBarRenderer9.setBaseItemLabelGenerator(categoryItemLabelGenerator13);
        boolean boolean15 = statisticalBarRenderer9.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer17.getBaseItemLabelGenerator();
        java.awt.Font font21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer17.setSeriesItemLabelFont((int) ' ', font21, true);
        statisticalBarRenderer9.setSeriesItemLabelFont((int) (byte) 1, font21);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (short) 100, font21, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator28);
        java.awt.Stroke stroke32 = statisticalBarRenderer0.getItemOutlineStroke(0, (int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint15 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1.0f);
        double double12 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) '4', categoryItemLabelGenerator17, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.event.RendererChangeListener rendererChangeListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNull(itemLabelPosition20);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean6 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (short) 0);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator8);
        java.awt.Font font10 = statisticalBarRenderer0.getBaseItemLabelFont();
        double double11 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Paint paint19 = statisticalBarRenderer14.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint20 = statisticalBarRenderer14.getBasePaint();
        boolean boolean21 = statisticalBarRenderer14.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = statisticalBarRenderer22.getLegendItemURLGenerator();
        statisticalBarRenderer22.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint26 = statisticalBarRenderer22.getBaseItemLabelPaint();
        statisticalBarRenderer22.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer30.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = statisticalBarRenderer32.getLegendItemURLGenerator();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer32.setBaseFillPaint(paint34);
        statisticalBarRenderer30.setBaseItemLabelPaint(paint34, true);
        java.awt.Shape shape39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer30.setSeriesShape(1, shape39);
        statisticalBarRenderer22.setBaseShape(shape39, true);
        boolean boolean43 = statisticalBarRenderer14.equals((java.lang.Object) statisticalBarRenderer22);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = null;
        statisticalBarRenderer14.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator45, true);
        double double48 = statisticalBarRenderer14.getBase();
        statisticalBarRenderer14.setAutoPopulateSeriesOutlineStroke(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer51.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = statisticalBarRenderer51.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = statisticalBarRenderer51.getBaseItemLabelGenerator();
        boolean boolean57 = statisticalBarRenderer51.getBaseSeriesVisibleInLegend();
        boolean boolean58 = statisticalBarRenderer51.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer59 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator60 = statisticalBarRenderer59.getLegendItemURLGenerator();
        java.awt.Paint paint61 = statisticalBarRenderer59.getBaseFillPaint();
        boolean boolean62 = statisticalBarRenderer51.equals((java.lang.Object) paint61);
        statisticalBarRenderer14.setBasePaint(paint61);
        statisticalBarRenderer0.setBaseFillPaint(paint61);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNull(categoryURLGenerator13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
        org.junit.Assert.assertNull(categoryItemLabelGenerator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator60);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        statisticalBarRenderer0.setMaximumBarWidth((double) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categoryURLGenerator19);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) 0, (int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint14);
        boolean boolean16 = statisticalBarRenderer12.getBaseSeriesVisible();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer12.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(categoryPlot11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator17);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator4);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setBase((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        int int14 = statisticalBarRenderer12.getRowCount();
        java.awt.Font font16 = statisticalBarRenderer12.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean17 = statisticalBarRenderer12.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer12.getSeriesItemLabelGenerator((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer20.getLegendItemURLGenerator();
        statisticalBarRenderer20.setIncludeBaseInRange(false);
        java.awt.Paint paint25 = statisticalBarRenderer20.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint26 = statisticalBarRenderer20.getBasePaint();
        java.awt.Stroke stroke29 = statisticalBarRenderer20.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer20.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer12.setNegativeItemLabelPositionFallback(itemLabelPosition32);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) '4', itemLabelPosition32, false);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) false);
        org.jfree.chart.LegendItem legendItem43 = statisticalBarRenderer0.getLegendItem((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNull(legendItem43);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (byte) 10, 0);
        boolean boolean14 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setBaseSeriesVisible(false, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator24);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean6 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (short) 0);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator8);
        double double10 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        statisticalBarRenderer11.setIncludeBaseInRange(false);
        java.awt.Paint paint16 = statisticalBarRenderer11.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer11.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer11.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer11.getNegativeItemLabelPosition((int) (byte) 10, 0);
        java.awt.Stroke stroke26 = statisticalBarRenderer11.lookupSeriesOutlineStroke((int) '#');
        statisticalBarRenderer0.setBaseOutlineStroke(stroke26);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        java.awt.Paint paint32 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setBase((double) 0.0f);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        statisticalBarRenderer36.setIncludeBaseInRange(false);
        java.awt.Paint paint41 = statisticalBarRenderer36.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint42 = statisticalBarRenderer36.getBasePaint();
        java.awt.Stroke stroke45 = statisticalBarRenderer36.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 1, stroke45);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator48 = statisticalBarRenderer47.getLegendItemURLGenerator();
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer47.setBaseFillPaint(paint49);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer51.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = statisticalBarRenderer53.getLegendItemURLGenerator();
        java.awt.Paint paint55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer53.setBaseFillPaint(paint55);
        statisticalBarRenderer51.setBaseItemLabelPaint(paint55, true);
        statisticalBarRenderer47.setBaseFillPaint(paint55, true);
        java.util.EventListener eventListener61 = null;
        boolean boolean62 = statisticalBarRenderer47.hasListener(eventListener61);
        boolean boolean63 = statisticalBarRenderer47.getAutoPopulateSeriesShape();
        java.awt.Stroke stroke66 = statisticalBarRenderer47.getItemStroke((int) (byte) -1, (int) '#');
        statisticalBarRenderer0.setBaseOutlineStroke(stroke66);
        boolean boolean68 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        double double17 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Stroke stroke19 = statisticalBarRenderer0.getSeriesStroke((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer20.getLegendItemURLGenerator();
        statisticalBarRenderer20.setIncludeBaseInRange(false);
        java.awt.Paint paint25 = statisticalBarRenderer20.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint26 = statisticalBarRenderer20.getBasePaint();
        java.awt.Stroke stroke29 = statisticalBarRenderer20.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer20.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator34 = statisticalBarRenderer33.getLegendItemURLGenerator();
        statisticalBarRenderer33.setIncludeBaseInRange(false);
        java.awt.Paint paint38 = statisticalBarRenderer33.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer33.setBaseOutlineStroke(stroke39);
        statisticalBarRenderer20.setBaseStroke(stroke39);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke39);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setSeriesCreateEntities(1, (java.lang.Boolean) false, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0d + "'", double17 == 2.0d);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator34);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator43);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator6);
        statisticalBarRenderer0.setMinimumBarLength((double) (byte) 100);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseFillPaint(paint16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer20.getLegendItemURLGenerator();
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint22);
        statisticalBarRenderer18.setBaseItemLabelPaint(paint22, true);
        statisticalBarRenderer14.setBaseFillPaint(paint22, true);
        java.awt.Stroke stroke29 = statisticalBarRenderer14.getSeriesOutlineStroke((int) '4');
        boolean boolean32 = statisticalBarRenderer14.isItemLabelVisible((int) '#', (int) (byte) 1);
        java.awt.Paint paint34 = statisticalBarRenderer14.getSeriesFillPaint((int) (byte) 1);
        java.awt.Paint paint37 = statisticalBarRenderer14.getItemOutlinePaint(100, (int) '4');
        statisticalBarRenderer0.setSeriesPaint((int) ' ', paint37, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer41.getLegendItemURLGenerator();
        statisticalBarRenderer41.setIncludeBaseInRange(false);
        java.awt.Paint paint46 = statisticalBarRenderer41.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint47 = statisticalBarRenderer41.getBasePaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer41.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        java.awt.Stroke stroke50 = statisticalBarRenderer41.getBaseOutlineStroke();
        statisticalBarRenderer0.setSeriesStroke((int) ' ', stroke50, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean8 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Font font13 = statisticalBarRenderer11.getBaseItemLabelFont();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer11.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition15);
        java.awt.Paint paint18 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        double double4 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer7.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer7.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer7.getBaseItemLabelGenerator();
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        boolean boolean14 = statisticalBarRenderer7.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint17);
        statisticalBarRenderer7.setBaseFillPaint(paint17, false);
        statisticalBarRenderer0.setBaseFillPaint(paint17, true);
        java.awt.Paint paint23 = statisticalBarRenderer0.getBaseOutlinePaint();
        java.awt.Paint paint24 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Paint paint25 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint27 = statisticalBarRenderer0.getSeriesPaint((int) '4');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(paint27);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBase((double) 0L);
        java.awt.Shape shape15 = statisticalBarRenderer0.getBaseShape();
        java.lang.Boolean boolean17 = statisticalBarRenderer0.getSeriesItemLabelsVisible(100);
        statisticalBarRenderer0.setMaximumBarWidth((double) 1);
        double double20 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer21.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = statisticalBarRenderer21.getBaseItemLabelGenerator();
        boolean boolean27 = statisticalBarRenderer21.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer21.setSeriesItemLabelsVisible((int) (byte) 1, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = null;
        statisticalBarRenderer21.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator32, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = statisticalBarRenderer38.getLegendItemURLGenerator();
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer38.setBaseFillPaint(paint40);
        statisticalBarRenderer36.setBaseItemLabelPaint(paint40, true);
        java.awt.Shape shape45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer36.setSeriesShape(1, shape45);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator47 = null;
        statisticalBarRenderer36.setLegendItemURLGenerator(categorySeriesLabelGenerator47);
        statisticalBarRenderer36.setBase((double) 0L);
        java.awt.Shape shape51 = statisticalBarRenderer36.getBaseShape();
        statisticalBarRenderer21.setSeriesShape(0, shape51);
        boolean boolean53 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer21);
        java.awt.Stroke stroke56 = statisticalBarRenderer0.getItemStroke((int) (short) 10, (int) (byte) 100);
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.util.Layer layer61 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo62 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D57, rectangle2D58, categoryAxis59, valueAxis60, layer61, plotRenderingInfo62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(stroke56);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBase((double) 0L);
        java.awt.Paint paint15 = statisticalBarRenderer0.getBaseOutlinePaint();
        java.awt.Paint paint17 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 1);
        statisticalBarRenderer0.setSeriesCreateEntities(100, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator23, false);
        boolean boolean26 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setBase((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer37.getLegendItemURLGenerator();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint39);
        statisticalBarRenderer35.setBaseItemLabelPaint(paint39, true);
        java.awt.Shape shape44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer35.setSeriesShape(1, shape44);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = null;
        statisticalBarRenderer35.setLegendItemURLGenerator(categorySeriesLabelGenerator46);
        statisticalBarRenderer35.setBase((double) 0L);
        java.awt.Shape shape50 = statisticalBarRenderer35.getBaseShape();
        statisticalBarRenderer0.setSeriesShape(0, shape50, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 1.0f);
        boolean boolean57 = statisticalBarRenderer0.getItemCreateEntity((int) (short) 10, (int) '4');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint((int) ' ');
        java.awt.Font font10 = statisticalBarRenderer0.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.Marker marker14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D11, categoryPlot12, valueAxis13, marker14, rectangle2D15);
        boolean boolean17 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        double double4 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer5.getLegendItemURLGenerator();
        statisticalBarRenderer5.setIncludeBaseInRange(false);
        java.awt.Paint paint10 = statisticalBarRenderer5.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint11 = statisticalBarRenderer5.getBasePaint();
        java.awt.Stroke stroke14 = statisticalBarRenderer5.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer5.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        statisticalBarRenderer18.setIncludeBaseInRange(false);
        java.awt.Paint paint23 = statisticalBarRenderer18.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer18.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer5.setBaseStroke(stroke24);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke24);
        double double28 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) 1, (int) '4');
        java.lang.Boolean boolean36 = statisticalBarRenderer0.getSeriesItemLabelsVisible(1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.0d + "'", double28 == 2.0d);
        org.junit.Assert.assertNull(categoryToolTipGenerator34);
        org.junit.Assert.assertNull(boolean36);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator4);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setBase((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        java.awt.Paint paint14 = statisticalBarRenderer12.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer12.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator16);
        statisticalBarRenderer12.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = statisticalBarRenderer22.getLegendItemURLGenerator();
        statisticalBarRenderer22.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint26 = statisticalBarRenderer22.getBaseItemLabelPaint();
        statisticalBarRenderer22.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer30.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = statisticalBarRenderer32.getLegendItemURLGenerator();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer32.setBaseFillPaint(paint34);
        statisticalBarRenderer30.setBaseItemLabelPaint(paint34, true);
        java.awt.Shape shape39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer30.setSeriesShape(1, shape39);
        statisticalBarRenderer22.setBaseShape(shape39, true);
        java.awt.Stroke stroke43 = statisticalBarRenderer22.getBaseStroke();
        statisticalBarRenderer12.setSeriesOutlineStroke((int) '4', stroke43);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke43);
        boolean boolean46 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer47.setSeriesVisible(10, (java.lang.Boolean) true);
        java.awt.Font font53 = statisticalBarRenderer47.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Shape shape54 = statisticalBarRenderer47.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator57 = statisticalBarRenderer56.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = statisticalBarRenderer58.getLegendItemURLGenerator();
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer58.setBaseFillPaint(paint60);
        statisticalBarRenderer56.setBaseItemLabelPaint(paint60, true);
        java.awt.Shape shape65 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer56.setSeriesShape(1, shape65);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator67 = null;
        statisticalBarRenderer56.setLegendItemURLGenerator(categorySeriesLabelGenerator67);
        statisticalBarRenderer56.setBaseSeriesVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = statisticalBarRenderer56.getBasePositiveItemLabelPosition();
        statisticalBarRenderer47.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition71, false);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition71);
        java.awt.Paint paint76 = statisticalBarRenderer0.getSeriesItemLabelPaint(100);
        java.lang.Boolean boolean78 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator57);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator59);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(shape65);
        org.junit.Assert.assertNotNull(itemLabelPosition71);
        org.junit.Assert.assertNull(paint76);
        org.junit.Assert.assertNull(boolean78);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseOutlinePaint();
        statisticalBarRenderer0.setMinimumBarLength((double) (short) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator15, true);
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.Marker marker21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D18, categoryPlot19, valueAxis20, marker21, rectangle2D22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean6 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (short) 0);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator8);
        java.awt.Font font10 = statisticalBarRenderer0.getBaseItemLabelFont();
        double double11 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Stroke stroke12 = statisticalBarRenderer0.getBaseStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D19, rectangle2D20, categoryAxis21, valueAxis22, layer23, plotRenderingInfo24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBase((double) 0L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        statisticalBarRenderer15.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer15.setBaseItemLabelGenerator(categoryItemLabelGenerator19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        statisticalBarRenderer21.setIncludeBaseInRange(false);
        java.awt.Paint paint26 = statisticalBarRenderer21.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint27 = statisticalBarRenderer21.getBasePaint();
        java.awt.Stroke stroke30 = statisticalBarRenderer21.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer15.setBaseOutlineStroke(stroke30, true);
        double double33 = statisticalBarRenderer15.getUpperClip();
        statisticalBarRenderer15.setMinimumBarLength((double) (byte) 10);
        java.awt.Paint paint38 = statisticalBarRenderer15.getItemPaint(100, (int) '4');
        statisticalBarRenderer0.setBaseItemLabelPaint(paint38);
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.plot.Marker marker43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D40, categoryPlot41, valueAxis42, marker43, rectangle2D44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) ' ');
        boolean boolean49 = statisticalBarRenderer0.isSeriesVisible(10);
        statisticalBarRenderer0.setMinimumBarLength((double) ' ');
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(categoryItemLabelGenerator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        java.awt.Paint paint32 = statisticalBarRenderer0.getBaseFillPaint();
        boolean boolean35 = statisticalBarRenderer0.getItemVisible((int) (short) 1, (int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        statisticalBarRenderer36.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer39 = statisticalBarRenderer36.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer39);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(0, categoryURLGenerator42, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator46 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 0, categoryToolTipGenerator46);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(gradientPaintTransformer39);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 1, false);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 100, (int) (byte) 100);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = statisticalBarRenderer0.getDrawingSupplier();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = statisticalBarRenderer0.getURLGenerator((int) '#', (int) (short) -1);
        statisticalBarRenderer0.setBaseCreateEntities(false, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(drawingSupplier15);
        org.junit.Assert.assertNull(categoryURLGenerator20);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = statisticalBarRenderer0.hasListener(eventListener32);
        java.awt.Font font34 = statisticalBarRenderer0.getBaseItemLabelFont();
        java.awt.Paint paint35 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint36 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Shape shape38 = statisticalBarRenderer0.getSeriesShape((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(10, categoryToolTipGenerator40, false);
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainGridline(graphics2D43, categoryPlot44, rectangle2D45, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(shape38);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) true);
        java.awt.Font font6 = statisticalBarRenderer0.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Shape shape7 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer9.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint13);
        statisticalBarRenderer9.setBaseItemLabelPaint(paint13, true);
        java.awt.Shape shape18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer9.setSeriesShape(1, shape18);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = null;
        statisticalBarRenderer9.setLegendItemURLGenerator(categorySeriesLabelGenerator20);
        statisticalBarRenderer9.setBaseSeriesVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer9.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition24, false);
        java.awt.Stroke stroke28 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) '#');
        boolean boolean29 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer4.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint8);
        statisticalBarRenderer4.setBaseItemLabelPaint(paint8, true);
        statisticalBarRenderer0.setBaseFillPaint(paint8, true);
        java.awt.Paint paint15 = statisticalBarRenderer0.lookupSeriesPaint(0);
        java.lang.Boolean boolean17 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        int int20 = statisticalBarRenderer18.getRowCount();
        java.awt.Font font22 = statisticalBarRenderer18.getSeriesItemLabelFont((int) (short) 1);
        statisticalBarRenderer18.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer27.getLegendItemURLGenerator();
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        statisticalBarRenderer27.setBaseItemLabelGenerator(categoryItemLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = statisticalBarRenderer35.getBaseItemLabelGenerator();
        java.awt.Font font39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer35.setSeriesItemLabelFont((int) ' ', font39, true);
        statisticalBarRenderer27.setSeriesItemLabelFont((int) (byte) 1, font39);
        statisticalBarRenderer18.setSeriesItemLabelFont((int) (short) 100, font39, true);
        statisticalBarRenderer0.setBaseItemLabelFont(font39, false);
        java.awt.Stroke stroke49 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, 0);
        java.awt.Shape shape50 = statisticalBarRenderer0.getBaseShape();
        boolean boolean51 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemURLGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisible();
        double double7 = statisticalBarRenderer0.getMinimumBarLength();
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape(0, 10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Paint paint21 = statisticalBarRenderer16.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint22 = statisticalBarRenderer16.getBasePaint();
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke25);
        java.awt.Paint paint29 = statisticalBarRenderer0.getItemOutlinePaint(0, 0);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        statisticalBarRenderer35.setIncludeBaseInRange(false);
        java.awt.Paint paint40 = statisticalBarRenderer35.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer35.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator44 = statisticalBarRenderer43.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = statisticalBarRenderer43.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer35.setPositiveItemLabelPositionFallback(itemLabelPosition47);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = statisticalBarRenderer35.getBaseItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer51.getLegendItemURLGenerator();
        statisticalBarRenderer51.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer54 = statisticalBarRenderer51.getGradientPaintTransformer();
        double double55 = statisticalBarRenderer51.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator57 = statisticalBarRenderer56.getLegendItemURLGenerator();
        statisticalBarRenderer56.setIncludeBaseInRange(false);
        java.awt.Paint paint61 = statisticalBarRenderer56.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint62 = statisticalBarRenderer56.getBasePaint();
        java.awt.Stroke stroke65 = statisticalBarRenderer56.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition68 = statisticalBarRenderer56.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer69 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator70 = statisticalBarRenderer69.getLegendItemURLGenerator();
        statisticalBarRenderer69.setIncludeBaseInRange(false);
        java.awt.Paint paint74 = statisticalBarRenderer69.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer69.setBaseOutlineStroke(stroke75);
        statisticalBarRenderer56.setBaseStroke(stroke75);
        statisticalBarRenderer51.setErrorIndicatorStroke(stroke75);
        statisticalBarRenderer35.setSeriesOutlineStroke((int) (short) 100, stroke75);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 10, stroke75);
        boolean boolean82 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        java.util.EventListener eventListener85 = null;
        boolean boolean86 = statisticalBarRenderer0.hasListener(eventListener85);
        statisticalBarRenderer0.setMinimumBarLength((double) 0.0f);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator44);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertNull(categoryItemLabelGenerator49);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(gradientPaintTransformer54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator57);
        org.junit.Assert.assertNull(paint61);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(itemLabelPosition68);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator70);
        org.junit.Assert.assertNull(paint74);
        org.junit.Assert.assertNotNull(stroke75);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        java.awt.Paint paint10 = statisticalBarRenderer8.getBaseFillPaint();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) paint10);
        java.lang.Object obj12 = statisticalBarRenderer0.clone();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) 'a', categoryURLGenerator16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = statisticalBarRenderer0.hasListener(eventListener18);
        boolean boolean20 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.lang.Boolean boolean22 = statisticalBarRenderer0.getSeriesVisible((int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer23.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer25.setBaseFillPaint(paint27);
        statisticalBarRenderer23.setBaseItemLabelPaint(paint27, true);
        java.awt.Shape shape32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer23.setSeriesShape(1, shape32);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator34 = null;
        statisticalBarRenderer23.setLegendItemURLGenerator(categorySeriesLabelGenerator34);
        statisticalBarRenderer23.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = statisticalBarRenderer39.getLegendItemURLGenerator();
        statisticalBarRenderer39.setIncludeBaseInRange(false);
        java.awt.Paint paint44 = statisticalBarRenderer39.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint45 = statisticalBarRenderer39.getBasePaint();
        java.awt.Stroke stroke48 = statisticalBarRenderer39.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer23.setSeriesStroke((int) '4', stroke48);
        boolean boolean50 = statisticalBarRenderer23.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer52 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator53 = statisticalBarRenderer52.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator55 = statisticalBarRenderer54.getLegendItemURLGenerator();
        java.awt.Paint paint56 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer54.setBaseFillPaint(paint56);
        statisticalBarRenderer52.setBaseItemLabelPaint(paint56, true);
        java.awt.Shape shape61 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer52.setSeriesShape(1, shape61);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator65 = statisticalBarRenderer52.getURLGenerator((-1), (int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator67 = statisticalBarRenderer66.getLegendItemURLGenerator();
        java.awt.Paint paint68 = statisticalBarRenderer66.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator70 = null;
        statisticalBarRenderer66.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator70);
        statisticalBarRenderer66.setBaseCreateEntities(true, false);
        java.awt.Shape shape75 = statisticalBarRenderer66.getBaseShape();
        statisticalBarRenderer52.setBaseShape(shape75, true);
        statisticalBarRenderer23.setSeriesShape((int) (short) 0, shape75, true);
        statisticalBarRenderer0.setBaseShape(shape75);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition81 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator40);
        org.junit.Assert.assertNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator53);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(shape61);
        org.junit.Assert.assertNull(categoryURLGenerator65);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator67);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNotNull(shape75);
        org.junit.Assert.assertNotNull(itemLabelPosition81);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer3.getLegendItemURLGenerator();
        statisticalBarRenderer3.setIncludeBaseInRange(false);
        java.awt.Paint paint8 = statisticalBarRenderer3.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint9 = statisticalBarRenderer3.getBasePaint();
        double double10 = statisticalBarRenderer3.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer11 = statisticalBarRenderer3.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = statisticalBarRenderer0.getDrawingSupplier();
        java.awt.Font font16 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer11);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        boolean boolean5 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 10);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer3.getLegendItemURLGenerator();
        statisticalBarRenderer3.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint7 = statisticalBarRenderer3.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        statisticalBarRenderer3.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator9);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint15);
        statisticalBarRenderer11.setBaseItemLabelPaint(paint15, true);
        java.awt.Shape shape20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer11.setSeriesShape(1, shape20);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = null;
        statisticalBarRenderer11.setLegendItemURLGenerator(categorySeriesLabelGenerator22);
        statisticalBarRenderer11.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer27.getLegendItemURLGenerator();
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        java.awt.Paint paint32 = statisticalBarRenderer27.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint33 = statisticalBarRenderer27.getBasePaint();
        java.awt.Stroke stroke36 = statisticalBarRenderer27.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer11.setSeriesStroke((int) '4', stroke36);
        java.awt.Paint paint40 = statisticalBarRenderer11.getItemOutlinePaint(0, 0);
        statisticalBarRenderer11.setSeriesCreateEntities(10, (java.lang.Boolean) true, false);
        boolean boolean45 = statisticalBarRenderer11.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke48 = statisticalBarRenderer11.getItemOutlineStroke((int) (short) 10, (int) (byte) 1);
        statisticalBarRenderer3.setBaseOutlineStroke(stroke48, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer51.getLegendItemURLGenerator();
        statisticalBarRenderer51.setIncludeBaseInRange(false);
        java.awt.Paint paint56 = statisticalBarRenderer51.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer51.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer51.setBaseCreateEntities(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer62 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator63 = statisticalBarRenderer62.getLegendItemURLGenerator();
        statisticalBarRenderer62.setIncludeBaseInRange(false);
        java.awt.Paint paint67 = statisticalBarRenderer62.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint68 = statisticalBarRenderer62.getBasePaint();
        java.awt.Stroke stroke71 = statisticalBarRenderer62.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition74 = statisticalBarRenderer62.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer75 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator76 = statisticalBarRenderer75.getLegendItemURLGenerator();
        statisticalBarRenderer75.setIncludeBaseInRange(false);
        java.awt.Paint paint80 = statisticalBarRenderer75.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke81 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer75.setBaseOutlineStroke(stroke81);
        statisticalBarRenderer62.setBaseStroke(stroke81);
        java.awt.Paint paint84 = statisticalBarRenderer62.getBaseOutlinePaint();
        statisticalBarRenderer51.setBasePaint(paint84, false);
        statisticalBarRenderer3.setBaseFillPaint(paint84);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint84, true);
        java.awt.Graphics2D graphics2D90 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot91 = null;
        org.jfree.chart.axis.ValueAxis valueAxis92 = null;
        java.awt.geom.Rectangle2D rectangle2D93 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawRangeGridline(graphics2D90, categoryPlot91, valueAxis92, rectangle2D93, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNull(paint56);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator63);
        org.junit.Assert.assertNull(paint67);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNotNull(itemLabelPosition74);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator76);
        org.junit.Assert.assertNull(paint80);
        org.junit.Assert.assertNotNull(stroke81);
        org.junit.Assert.assertNotNull(paint84);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemFillPaint((int) (short) 100, (int) (short) 100);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent11);
        boolean boolean13 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        boolean boolean7 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) -1, (int) (byte) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        double double10 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke13 = statisticalBarRenderer0.getSeriesStroke((int) (short) 10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator15);
        int int17 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        statisticalBarRenderer6.setIncludeBaseInRange(false);
        java.awt.Paint paint11 = statisticalBarRenderer6.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint12 = statisticalBarRenderer6.getBasePaint();
        java.awt.Stroke stroke15 = statisticalBarRenderer6.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke15, true);
        double double18 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setMinimumBarLength((double) (byte) 10);
        java.awt.Paint paint23 = statisticalBarRenderer0.getItemPaint(100, (int) '4');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator24);
        java.lang.Boolean boolean27 = statisticalBarRenderer0.getSeriesVisible((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = statisticalBarRenderer29.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer29.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = statisticalBarRenderer29.getBaseItemLabelGenerator();
        boolean boolean35 = statisticalBarRenderer29.getBaseSeriesVisibleInLegend();
        boolean boolean36 = statisticalBarRenderer29.getBaseCreateEntities();
        java.awt.Font font37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer29.setBaseItemLabelFont(font37);
        statisticalBarRenderer29.setItemLabelAnchorOffset((double) 1.0f);
        double double41 = statisticalBarRenderer29.getItemLabelAnchorOffset();
        java.awt.Paint paint43 = statisticalBarRenderer29.getSeriesItemLabelPaint((int) (short) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator44 = statisticalBarRenderer29.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = null;
        statisticalBarRenderer29.setSeriesItemLabelGenerator((int) '4', categoryItemLabelGenerator46, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer29.getNegativeItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = statisticalBarRenderer50.getLegendItemURLGenerator();
        statisticalBarRenderer50.setIncludeBaseInRange(false);
        java.awt.Paint paint55 = statisticalBarRenderer50.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint56 = statisticalBarRenderer50.getBasePaint();
        boolean boolean57 = statisticalBarRenderer50.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = statisticalBarRenderer58.getLegendItemURLGenerator();
        statisticalBarRenderer58.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint62 = statisticalBarRenderer58.getBaseItemLabelPaint();
        statisticalBarRenderer58.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator67 = statisticalBarRenderer66.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer68 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator69 = statisticalBarRenderer68.getLegendItemURLGenerator();
        java.awt.Paint paint70 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer68.setBaseFillPaint(paint70);
        statisticalBarRenderer66.setBaseItemLabelPaint(paint70, true);
        java.awt.Shape shape75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer66.setSeriesShape(1, shape75);
        statisticalBarRenderer58.setBaseShape(shape75, true);
        boolean boolean79 = statisticalBarRenderer50.equals((java.lang.Object) statisticalBarRenderer58);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator81 = null;
        statisticalBarRenderer50.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator81, true);
        boolean boolean84 = statisticalBarRenderer50.getAutoPopulateSeriesOutlinePaint();
        int int85 = statisticalBarRenderer50.getColumnCount();
        java.awt.Font font86 = statisticalBarRenderer50.getBaseItemLabelFont();
        statisticalBarRenderer29.setBaseItemLabelFont(font86);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) 'a', font86, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator30);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNull(categoryItemLabelGenerator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNull(paint43);
        org.junit.Assert.assertNull(categoryURLGenerator44);
        org.junit.Assert.assertNull(itemLabelPosition49);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator51);
        org.junit.Assert.assertNull(paint55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator59);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator67);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator69);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(shape75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(font86);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer7.getLegendItemURLGenerator();
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Paint paint12 = statisticalBarRenderer7.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint14 = statisticalBarRenderer7.getSeriesPaint((int) ' ');
        java.awt.Font font17 = statisticalBarRenderer7.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Paint paint18 = statisticalBarRenderer7.getBaseFillPaint();
        boolean boolean19 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer7);
        statisticalBarRenderer0.setBase((double) (-1.0f));
        double double22 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.event.RendererChangeListener rendererChangeListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(legendItemCollection23);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer3.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer3.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = statisticalBarRenderer3.getBaseItemLabelGenerator();
        boolean boolean9 = statisticalBarRenderer3.getBaseSeriesVisibleInLegend();
        boolean boolean10 = statisticalBarRenderer3.getBaseCreateEntities();
        java.awt.Font font11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer3.setBaseItemLabelFont(font11);
        java.awt.Paint paint13 = statisticalBarRenderer3.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseFillPaint(paint16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer20.getLegendItemURLGenerator();
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint22);
        statisticalBarRenderer18.setBaseItemLabelPaint(paint22, true);
        statisticalBarRenderer14.setBaseFillPaint(paint22, true);
        java.awt.Shape shape28 = statisticalBarRenderer14.getBaseShape();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer14.getLegendItemLabelGenerator();
        statisticalBarRenderer3.setLegendItemLabelGenerator(categorySeriesLabelGenerator29);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator29);
        double double32 = statisticalBarRenderer0.getBase();
        java.awt.Paint paint34 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) 10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(itemLabelPosition2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(paint34);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 1, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator11, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getSeriesStroke((int) (byte) 1);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(stroke15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer8 = statisticalBarRenderer0.getGradientPaintTransformer();
        java.awt.Shape shape11 = statisticalBarRenderer0.getItemShape((int) (short) 10, (int) 'a');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(gradientPaintTransformer8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        statisticalBarRenderer8.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint12 = statisticalBarRenderer8.getBaseItemLabelPaint();
        statisticalBarRenderer8.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint20);
        statisticalBarRenderer16.setBaseItemLabelPaint(paint20, true);
        java.awt.Shape shape25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape(1, shape25);
        statisticalBarRenderer8.setBaseShape(shape25, true);
        boolean boolean29 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer8);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator31, true);
        double double34 = statisticalBarRenderer0.getBase();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        boolean boolean41 = statisticalBarRenderer0.getItemVisible(0, 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer0.getNegativeItemLabelPosition(10, (int) (short) 1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint((int) ' ');
        java.awt.Font font10 = statisticalBarRenderer0.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition(10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator13, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        double double7 = statisticalBarRenderer0.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer8 = statisticalBarRenderer0.getGradientPaintTransformer();
        int int9 = statisticalBarRenderer0.getRowCount();
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemFillPaint(100, 0);
        java.awt.Font font13 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint18);
        statisticalBarRenderer14.setBaseItemLabelPaint(paint18, true);
        java.awt.Shape shape23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer14.setSeriesShape(1, shape23);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = null;
        statisticalBarRenderer14.setLegendItemURLGenerator(categorySeriesLabelGenerator25);
        statisticalBarRenderer14.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = statisticalBarRenderer31.getLegendItemURLGenerator();
        int int33 = statisticalBarRenderer31.getRowCount();
        java.awt.Font font35 = statisticalBarRenderer31.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean36 = statisticalBarRenderer31.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = statisticalBarRenderer31.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint41 = statisticalBarRenderer31.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer14.setBasePaint(paint41);
        java.awt.Stroke stroke44 = statisticalBarRenderer14.getSeriesStroke((int) (short) 10);
        java.awt.Paint paint46 = statisticalBarRenderer14.getSeriesFillPaint((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator49 = statisticalBarRenderer48.getLegendItemURLGenerator();
        java.awt.Paint paint50 = statisticalBarRenderer48.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = null;
        statisticalBarRenderer48.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator52);
        statisticalBarRenderer48.setBaseCreateEntities(true, false);
        java.awt.Shape shape57 = statisticalBarRenderer48.getBaseShape();
        statisticalBarRenderer14.setSeriesShape(1, shape57);
        java.awt.Graphics2D graphics2D59 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.plot.Marker marker62 = null;
        java.awt.geom.Rectangle2D rectangle2D63 = null;
        statisticalBarRenderer14.drawRangeMarker(graphics2D59, categoryPlot60, valueAxis61, marker62, rectangle2D63);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition67 = statisticalBarRenderer14.getPositiveItemLabelPosition(0, (int) (short) 100);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition67);
        double double69 = statisticalBarRenderer0.getItemMargin();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(font35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(stroke44);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(itemLabelPosition67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.2d + "'", double69 == 0.2d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer12.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = statisticalBarRenderer12.getBaseItemLabelGenerator();
        boolean boolean18 = statisticalBarRenderer12.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer12.setSeriesItemLabelsVisible((int) (byte) 1, false);
        java.awt.Paint paint24 = statisticalBarRenderer12.getItemLabelPaint((int) (short) 100, (int) (byte) 100);
        statisticalBarRenderer0.setBaseFillPaint(paint24, true);
        boolean boolean27 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator28, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Paint paint8 = statisticalBarRenderer0.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator4);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        boolean boolean13 = statisticalBarRenderer0.isSeriesVisible((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseFillPaint(paint16);
        double double18 = statisticalBarRenderer14.getUpperClip();
        statisticalBarRenderer14.setBaseCreateEntities(true);
        java.awt.Paint paint23 = statisticalBarRenderer14.getItemLabelPaint((int) 'a', (int) (short) 1);
        statisticalBarRenderer0.setBaseFillPaint(paint23, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator26);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer28.getLegendItemURLGenerator();
        statisticalBarRenderer28.setIncludeBaseInRange(false);
        java.awt.Paint paint33 = statisticalBarRenderer28.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint34 = statisticalBarRenderer28.getBasePaint();
        java.awt.Stroke stroke37 = statisticalBarRenderer28.getItemStroke((int) (byte) 10, (int) (short) 10);
        java.awt.Paint paint38 = statisticalBarRenderer28.getErrorIndicatorPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        statisticalBarRenderer28.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator40, true);
        int int43 = statisticalBarRenderer28.getPassCount();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer44 = statisticalBarRenderer28.getGradientPaintTransformer();
        java.awt.Stroke stroke45 = statisticalBarRenderer28.getErrorIndicatorStroke();
        java.awt.Font font46 = statisticalBarRenderer28.getBaseItemLabelFont();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator47 = statisticalBarRenderer28.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator47);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator47);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        statisticalBarRenderer8.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint12 = statisticalBarRenderer8.getBaseItemLabelPaint();
        statisticalBarRenderer8.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint20);
        statisticalBarRenderer16.setBaseItemLabelPaint(paint20, true);
        java.awt.Shape shape25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape(1, shape25);
        statisticalBarRenderer8.setBaseShape(shape25, true);
        boolean boolean29 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer8);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator31, true);
        double double34 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.plot.Marker marker38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D35, categoryPlot36, valueAxis37, marker38, rectangle2D39);
        java.awt.Stroke stroke42 = statisticalBarRenderer0.lookupSeriesStroke(10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 0, 100);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getItemStroke((int) (short) 100, (int) 'a');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint19);
        statisticalBarRenderer15.setBaseItemLabelPaint(paint19, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer15.getNegativeItemLabelPosition((int) (short) 10, (int) (byte) -1);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) '#', itemLabelPosition25, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer28.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer30.getLegendItemURLGenerator();
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseFillPaint(paint32);
        statisticalBarRenderer28.setBaseItemLabelPaint(paint32, true);
        java.awt.Shape shape37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer28.setSeriesShape(1, shape37);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = null;
        statisticalBarRenderer28.setLegendItemURLGenerator(categorySeriesLabelGenerator39);
        statisticalBarRenderer28.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = statisticalBarRenderer45.getLegendItemURLGenerator();
        int int47 = statisticalBarRenderer45.getRowCount();
        java.awt.Font font49 = statisticalBarRenderer45.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean50 = statisticalBarRenderer45.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = statisticalBarRenderer45.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint55 = statisticalBarRenderer45.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer28.setBasePaint(paint55);
        boolean boolean58 = statisticalBarRenderer28.isSeriesVisibleInLegend((int) (short) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = statisticalBarRenderer28.getLegendItemToolTipGenerator();
        java.awt.Paint paint62 = statisticalBarRenderer28.getItemOutlinePaint((int) (short) 10, (int) (byte) 1);
        statisticalBarRenderer0.setBaseFillPaint(paint62);
        java.awt.Paint paint64 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(font49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator59);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(paint64);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Paint paint21 = statisticalBarRenderer16.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint22 = statisticalBarRenderer16.getBasePaint();
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke25);
        boolean boolean27 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.awt.Paint paint29 = statisticalBarRenderer0.lookupSeriesPaint((-1));
        java.awt.Shape shape31 = null;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 10, shape31);
        java.awt.Stroke stroke35 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 1, 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        statisticalBarRenderer36.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint40 = statisticalBarRenderer36.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint40);
        java.awt.Shape shape43 = statisticalBarRenderer0.lookupSeriesShape((int) ' ');
        java.awt.Paint paint44 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) false);
        boolean boolean49 = statisticalBarRenderer0.isSeriesVisible((int) '4');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font17);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) false);
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator3);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer5.getLegendItemURLGenerator();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer5.setBaseFillPaint(paint7);
        double double9 = statisticalBarRenderer5.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer10.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer10.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        statisticalBarRenderer5.setBasePositiveItemLabelPosition(itemLabelPosition16);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition16);
        boolean boolean20 = statisticalBarRenderer0.isSeriesVisible((int) (byte) 1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean9 = statisticalBarRenderer0.isItemLabelVisible((int) 'a', (int) (short) 10);
        boolean boolean10 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) -1, categoryItemLabelGenerator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = statisticalBarRenderer0.getDrawingSupplier();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer19.getLegendItemURLGenerator();
        statisticalBarRenderer19.setIncludeBaseInRange(false);
        java.awt.Paint paint24 = statisticalBarRenderer19.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint26 = statisticalBarRenderer19.getSeriesPaint((int) ' ');
        java.awt.Font font29 = statisticalBarRenderer19.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.plot.Marker marker33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        statisticalBarRenderer19.drawRangeMarker(graphics2D30, categoryPlot31, valueAxis32, marker33, rectangle2D34);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer36.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = statisticalBarRenderer36.getBaseItemLabelGenerator();
        boolean boolean42 = statisticalBarRenderer36.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer36.setSeriesItemLabelsVisible((int) (byte) 1, false);
        java.awt.Paint paint48 = statisticalBarRenderer36.getItemLabelPaint((int) (short) 100, (int) (byte) 100);
        java.awt.Paint paint51 = statisticalBarRenderer36.getItemPaint((int) (byte) -1, (int) (short) 1);
        java.awt.Paint paint53 = statisticalBarRenderer36.lookupSeriesFillPaint(0);
        statisticalBarRenderer19.setBaseOutlinePaint(paint53, false);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) '4', paint53, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator59 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 1);
        double double60 = statisticalBarRenderer0.getMaximumBarWidth();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(drawingSupplier17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNull(categoryItemLabelGenerator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(categoryURLGenerator59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        statisticalBarRenderer8.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint12 = statisticalBarRenderer8.getBaseItemLabelPaint();
        statisticalBarRenderer8.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint20);
        statisticalBarRenderer16.setBaseItemLabelPaint(paint20, true);
        java.awt.Shape shape25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape(1, shape25);
        statisticalBarRenderer8.setBaseShape(shape25, true);
        boolean boolean29 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer8);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent30 = null;
        statisticalBarRenderer8.notifyListeners(rendererChangeEvent30);
        java.awt.Paint paint33 = statisticalBarRenderer8.lookupSeriesPaint((int) (short) 0);
        boolean boolean34 = statisticalBarRenderer8.getBaseItemLabelsVisible();
        statisticalBarRenderer8.setBase((double) '#');
        java.awt.Stroke stroke38 = statisticalBarRenderer8.lookupSeriesStroke((int) (byte) 100);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        boolean boolean19 = statisticalBarRenderer0.getItemVisible((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        java.awt.Shape shape11 = statisticalBarRenderer0.lookupSeriesShape(0);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator16, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer5.getLegendItemURLGenerator();
        statisticalBarRenderer5.setIncludeBaseInRange(false);
        java.awt.Paint paint10 = statisticalBarRenderer5.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer5.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer13.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer5.setPositiveItemLabelPositionFallback(itemLabelPosition17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer19.getLegendItemURLGenerator();
        statisticalBarRenderer19.setIncludeBaseInRange(false);
        java.awt.Paint paint24 = statisticalBarRenderer19.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint25 = statisticalBarRenderer19.getBasePaint();
        java.awt.Stroke stroke28 = statisticalBarRenderer19.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer19.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer5.setNegativeItemLabelPositionFallback(itemLabelPosition31);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator34 = statisticalBarRenderer33.getLegendItemURLGenerator();
        statisticalBarRenderer33.setIncludeBaseInRange(false);
        java.awt.Paint paint38 = statisticalBarRenderer33.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint39 = statisticalBarRenderer33.getBasePaint();
        java.awt.Stroke stroke42 = statisticalBarRenderer33.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer5.setBaseOutlineStroke(stroke42, false);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke42, false);
        java.awt.Stroke stroke49 = statisticalBarRenderer0.getItemOutlineStroke(10, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = statisticalBarRenderer50.getLegendItemURLGenerator();
        java.awt.Paint paint52 = statisticalBarRenderer50.getBaseFillPaint();
        statisticalBarRenderer50.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer50.setBaseSeriesVisible(false);
        double double57 = statisticalBarRenderer50.getBase();
        boolean boolean58 = statisticalBarRenderer0.equals((java.lang.Object) double57);
        java.awt.Stroke stroke60 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator34);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(stroke60);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint12);
        statisticalBarRenderer8.setBaseItemLabelPaint(paint12, true);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape(1, shape17);
        statisticalBarRenderer0.setBaseShape(shape17, true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.LegendItem legendItem27 = statisticalBarRenderer0.getLegendItem((int) (byte) 10, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        java.awt.Paint paint30 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(legendItem27);
        org.junit.Assert.assertNull(itemLabelPosition28);
        org.junit.Assert.assertNull(paint30);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer3.getLegendItemURLGenerator();
        statisticalBarRenderer3.setIncludeBaseInRange(false);
        java.awt.Paint paint8 = statisticalBarRenderer3.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint9 = statisticalBarRenderer3.getBasePaint();
        double double10 = statisticalBarRenderer3.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer11 = statisticalBarRenderer3.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer13.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer13.getBaseItemLabelGenerator();
        boolean boolean19 = statisticalBarRenderer13.getBaseSeriesVisibleInLegend();
        boolean boolean20 = statisticalBarRenderer13.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        java.awt.Paint paint23 = statisticalBarRenderer21.getBaseFillPaint();
        boolean boolean24 = statisticalBarRenderer13.equals((java.lang.Object) paint23);
        java.lang.Object obj25 = statisticalBarRenderer13.clone();
        java.awt.Paint paint28 = statisticalBarRenderer13.getItemFillPaint((int) (short) -1, (int) ' ');
        statisticalBarRenderer0.setBaseFillPaint(paint28);
        java.awt.Paint paint32 = statisticalBarRenderer0.getItemOutlinePaint((int) '4', (int) (short) 10);
        java.awt.Paint paint34 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(paint34);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = statisticalBarRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(drawingSupplier9);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setMinimumBarLength((double) 0L);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator9, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(10, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = statisticalBarRenderer0.getToolTipGenerator(100, (int) 'a');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Paint paint15 = statisticalBarRenderer10.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint16 = statisticalBarRenderer10.getBasePaint();
        java.awt.Stroke stroke19 = statisticalBarRenderer10.getItemStroke((int) (byte) 10, (int) (short) 10);
        boolean boolean20 = statisticalBarRenderer0.equals((java.lang.Object) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        statisticalBarRenderer0.setDrawBarOutline(false);
        boolean boolean27 = statisticalBarRenderer0.getItemVisible((int) ' ', (int) (short) -1);
        boolean boolean29 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator6);
        statisticalBarRenderer0.setMinimumBarLength((double) (byte) 100);
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint10, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        boolean boolean14 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation13);
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Font font20 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = statisticalBarRenderer22.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer24.getLegendItemURLGenerator();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer24.setBaseFillPaint(paint26);
        statisticalBarRenderer22.setBaseItemLabelPaint(paint26, true);
        java.awt.Shape shape31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer22.setSeriesShape(1, shape31);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = null;
        statisticalBarRenderer22.setLegendItemURLGenerator(categorySeriesLabelGenerator33);
        statisticalBarRenderer22.setBase((double) 0L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer37.getLegendItemURLGenerator();
        statisticalBarRenderer37.setIncludeBaseInRange(false);
        java.awt.Paint paint42 = statisticalBarRenderer37.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer37.setBaseOutlineStroke(stroke43);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = statisticalBarRenderer37.getPositiveItemLabelPosition((int) (short) 0, (int) (short) -1);
        statisticalBarRenderer22.setPositiveItemLabelPositionFallback(itemLabelPosition47);
        java.lang.Boolean boolean50 = statisticalBarRenderer22.getSeriesItemLabelsVisible((int) (byte) -1);
        java.awt.Font font53 = statisticalBarRenderer22.getItemLabelFont(10, (int) (byte) 100);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font53);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
        org.junit.Assert.assertNull(boolean50);
        org.junit.Assert.assertNotNull(font53);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer5.getLegendItemURLGenerator();
        statisticalBarRenderer5.setIncludeBaseInRange(false);
        java.awt.Paint paint10 = statisticalBarRenderer5.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint11 = statisticalBarRenderer5.getBasePaint();
        java.awt.Stroke stroke14 = statisticalBarRenderer5.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer5.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator20);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        statisticalBarRenderer11.setIncludeBaseInRange(false);
        java.awt.Paint paint16 = statisticalBarRenderer11.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint17 = statisticalBarRenderer11.getBasePaint();
        java.awt.Stroke stroke20 = statisticalBarRenderer11.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer11.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer24.getLegendItemURLGenerator();
        statisticalBarRenderer24.setIncludeBaseInRange(false);
        java.awt.Paint paint29 = statisticalBarRenderer24.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer24.setBaseOutlineStroke(stroke30);
        statisticalBarRenderer11.setBaseStroke(stroke30);
        java.awt.Paint paint33 = statisticalBarRenderer11.getBaseOutlinePaint();
        statisticalBarRenderer0.setBasePaint(paint33, false);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean6 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (short) 0);
        statisticalBarRenderer0.removeAnnotations();
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesStroke(100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        int int19 = statisticalBarRenderer17.getRowCount();
        java.awt.Font font21 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean22 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer17.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint27 = statisticalBarRenderer17.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setBasePaint(paint27);
        java.awt.Stroke stroke30 = statisticalBarRenderer0.getSeriesStroke((int) (short) 10);
        java.awt.Paint paint32 = statisticalBarRenderer0.lookupSeriesPaint(1);
        boolean boolean33 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        boolean boolean35 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        statisticalBarRenderer36.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer39 = statisticalBarRenderer36.getGradientPaintTransformer();
        double double40 = statisticalBarRenderer36.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer41.getLegendItemURLGenerator();
        statisticalBarRenderer41.setIncludeBaseInRange(false);
        java.awt.Paint paint46 = statisticalBarRenderer41.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint47 = statisticalBarRenderer41.getBasePaint();
        java.awt.Stroke stroke50 = statisticalBarRenderer41.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = statisticalBarRenderer41.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator55 = statisticalBarRenderer54.getLegendItemURLGenerator();
        statisticalBarRenderer54.setIncludeBaseInRange(false);
        java.awt.Paint paint59 = statisticalBarRenderer54.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer54.setBaseOutlineStroke(stroke60);
        statisticalBarRenderer41.setBaseStroke(stroke60);
        statisticalBarRenderer36.setErrorIndicatorStroke(stroke60);
        double double64 = statisticalBarRenderer36.getItemLabelAnchorOffset();
        java.awt.Stroke stroke65 = statisticalBarRenderer36.getErrorIndicatorStroke();
        statisticalBarRenderer0.setBaseStroke(stroke65);
        java.awt.Graphics2D graphics2D67 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState68 = null;
        java.awt.geom.Rectangle2D rectangle2D69 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot70 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis71 = null;
        org.jfree.chart.axis.ValueAxis valueAxis72 = null;
        org.jfree.data.statistics.StatisticalCategoryDataset statisticalCategoryDataset73 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawVerticalItem(graphics2D67, categoryItemRendererState68, rectangle2D69, categoryPlot70, categoryAxis71, valueAxis72, statisticalCategoryDataset73, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(gradientPaintTransformer39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(itemLabelPosition53);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator55);
        org.junit.Assert.assertNull(paint59);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2.0d + "'", double64 == 2.0d);
        org.junit.Assert.assertNotNull(stroke65);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        java.awt.Paint paint18 = statisticalBarRenderer13.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke19);
        statisticalBarRenderer0.setBaseStroke(stroke19);
        java.awt.Paint paint22 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer23.getLegendItemURLGenerator();
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer23.setBaseFillPaint(paint25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer27.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = statisticalBarRenderer29.getLegendItemURLGenerator();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer29.setBaseFillPaint(paint31);
        statisticalBarRenderer27.setBaseItemLabelPaint(paint31, true);
        statisticalBarRenderer23.setBaseFillPaint(paint31, true);
        java.awt.Shape shape37 = statisticalBarRenderer23.getBaseShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator38 = null;
        statisticalBarRenderer23.setBaseToolTipGenerator(categoryToolTipGenerator38, true);
        statisticalBarRenderer23.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator44 = statisticalBarRenderer43.getLegendItemURLGenerator();
        java.awt.Paint paint45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer43.setBaseFillPaint(paint45);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator48 = statisticalBarRenderer47.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = statisticalBarRenderer49.getLegendItemURLGenerator();
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer49.setBaseFillPaint(paint51);
        statisticalBarRenderer47.setBaseItemLabelPaint(paint51, true);
        statisticalBarRenderer43.setBaseFillPaint(paint51, true);
        java.awt.Shape shape57 = statisticalBarRenderer43.getBaseShape();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer43.getLegendItemLabelGenerator();
        statisticalBarRenderer23.setLegendItemURLGenerator(categorySeriesLabelGenerator58);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator58);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator62 = statisticalBarRenderer61.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition65 = statisticalBarRenderer61.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator66 = statisticalBarRenderer61.getBaseItemLabelGenerator();
        boolean boolean67 = statisticalBarRenderer61.getBaseSeriesVisibleInLegend();
        boolean boolean68 = statisticalBarRenderer61.getBaseCreateEntities();
        java.awt.Font font69 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer61.setBaseItemLabelFont(font69);
        java.awt.Paint paint71 = statisticalBarRenderer61.getBaseOutlinePaint();
        statisticalBarRenderer61.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint76 = statisticalBarRenderer61.lookupSeriesPaint(10);
        statisticalBarRenderer0.setBaseOutlinePaint(paint76);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator48);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator62);
        org.junit.Assert.assertNotNull(itemLabelPosition65);
        org.junit.Assert.assertNull(categoryItemLabelGenerator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(font69);
        org.junit.Assert.assertNotNull(paint71);
        org.junit.Assert.assertNotNull(paint76);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesItemLabelPaint(0);
        java.awt.Font font8 = statisticalBarRenderer0.getBaseItemLabelFont();
        statisticalBarRenderer0.setMaximumBarWidth((-1.0d));
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = statisticalBarRenderer0.getNegativeItemLabelPosition(0, 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint18);
        statisticalBarRenderer14.setBaseItemLabelPaint(paint18, true);
        statisticalBarRenderer10.setBaseFillPaint(paint18, true);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (short) 100, paint18, false);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        statisticalBarRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 100, categoryItemLabelGenerator12, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator15);
        boolean boolean18 = statisticalBarRenderer0.isSeriesVisibleInLegend(10);
        java.awt.Shape shape20 = statisticalBarRenderer0.lookupSeriesShape(0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBase((double) 0L);
        java.awt.Paint paint15 = statisticalBarRenderer0.getBaseOutlinePaint();
        int int16 = statisticalBarRenderer0.getRowCount();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint24 = statisticalBarRenderer17.getSeriesPaint((int) ' ');
        java.awt.Font font27 = statisticalBarRenderer17.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer17.getSeriesNegativeItemLabelPosition(10);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition29, false);
        java.awt.Paint paint33 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator35 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = statisticalBarRenderer38.getLegendItemURLGenerator();
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer38.setBaseFillPaint(paint40);
        statisticalBarRenderer36.setBaseItemLabelPaint(paint40, true);
        java.awt.Shape shape45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer36.setSeriesShape(1, shape45);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator47 = null;
        statisticalBarRenderer36.setLegendItemURLGenerator(categorySeriesLabelGenerator47);
        java.awt.Paint paint50 = statisticalBarRenderer36.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean52 = statisticalBarRenderer36.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Font font53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer36.setBaseItemLabelFont(font53);
        statisticalBarRenderer36.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) false);
        java.awt.Paint paint59 = statisticalBarRenderer36.lookupSeriesOutlinePaint((int) ' ');
        boolean boolean60 = statisticalBarRenderer36.getAutoPopulateSeriesShape();
        double double61 = statisticalBarRenderer36.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition62 = statisticalBarRenderer36.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition62);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNull(categoryToolTipGenerator35);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNull(paint50);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.2d + "'", double61 == 0.2d);
        org.junit.Assert.assertNotNull(itemLabelPosition62);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        double double4 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer5.getLegendItemURLGenerator();
        statisticalBarRenderer5.setIncludeBaseInRange(false);
        java.awt.Paint paint10 = statisticalBarRenderer5.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint11 = statisticalBarRenderer5.getBasePaint();
        java.awt.Stroke stroke14 = statisticalBarRenderer5.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer5.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        statisticalBarRenderer18.setIncludeBaseInRange(false);
        java.awt.Paint paint23 = statisticalBarRenderer18.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer18.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer5.setBaseStroke(stroke24);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke24);
        double double28 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setBaseSeriesVisible(false, false);
        java.awt.Paint paint33 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer36.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = statisticalBarRenderer36.getBaseItemLabelGenerator();
        boolean boolean42 = statisticalBarRenderer36.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer36.setSeriesItemLabelsVisible((int) (byte) 1, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = null;
        statisticalBarRenderer36.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator47, false);
        statisticalBarRenderer36.setMinimumBarLength((double) (byte) 100);
        boolean boolean53 = statisticalBarRenderer36.isSeriesItemLabelsVisible((-1));
        java.awt.Font font54 = statisticalBarRenderer36.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont((int) 'a', font54);
        java.awt.Paint paint58 = statisticalBarRenderer0.getItemPaint((int) (short) 1, 10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.0d + "'", double28 == 2.0d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(itemLabelPosition34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNull(categoryItemLabelGenerator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(font54);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) 0, (int) (short) -1);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        double double12 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer0.getNegativeItemLabelPosition(0, (int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint19);
        double double21 = statisticalBarRenderer17.getUpperClip();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer17.getLegendItemURLGenerator();
        boolean boolean23 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        statisticalBarRenderer25.setIncludeBaseInRange(false);
        java.awt.Paint paint30 = statisticalBarRenderer25.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint32 = statisticalBarRenderer25.getSeriesPaint((int) ' ');
        java.awt.Font font35 = statisticalBarRenderer25.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.plot.Marker marker39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        statisticalBarRenderer25.drawRangeMarker(graphics2D36, categoryPlot37, valueAxis38, marker39, rectangle2D40);
        statisticalBarRenderer25.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = statisticalBarRenderer45.getLegendItemURLGenerator();
        statisticalBarRenderer45.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer45.setBaseItemLabelGenerator(categoryItemLabelGenerator49);
        boolean boolean51 = statisticalBarRenderer45.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = statisticalBarRenderer53.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = statisticalBarRenderer53.getBaseItemLabelGenerator();
        java.awt.Font font57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer53.setSeriesItemLabelFont((int) ' ', font57, true);
        statisticalBarRenderer45.setSeriesItemLabelFont((int) (byte) 1, font57);
        statisticalBarRenderer25.setBaseItemLabelFont(font57, true);
        statisticalBarRenderer17.setSeriesItemLabelFont((int) 'a', font57);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 0, font57);
        java.awt.Stroke stroke65 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator54);
        org.junit.Assert.assertNull(categoryItemLabelGenerator55);
        org.junit.Assert.assertNotNull(font57);
        org.junit.Assert.assertNotNull(stroke65);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator4 = statisticalBarRenderer3.getLegendItemURLGenerator();
        statisticalBarRenderer3.setIncludeBaseInRange(false);
        java.awt.Paint paint8 = statisticalBarRenderer3.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint9 = statisticalBarRenderer3.getBasePaint();
        double double10 = statisticalBarRenderer3.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer11 = statisticalBarRenderer3.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer13.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer13.getBaseItemLabelGenerator();
        boolean boolean19 = statisticalBarRenderer13.getBaseSeriesVisibleInLegend();
        boolean boolean20 = statisticalBarRenderer13.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        java.awt.Paint paint23 = statisticalBarRenderer21.getBaseFillPaint();
        boolean boolean24 = statisticalBarRenderer13.equals((java.lang.Object) paint23);
        java.lang.Object obj25 = statisticalBarRenderer13.clone();
        java.awt.Paint paint28 = statisticalBarRenderer13.getItemFillPaint((int) (short) -1, (int) ' ');
        statisticalBarRenderer0.setBaseFillPaint(paint28);
        java.awt.Paint paint32 = statisticalBarRenderer0.getItemOutlinePaint((int) '4', (int) (short) 10);
        java.awt.Paint paint35 = statisticalBarRenderer0.getItemLabelPaint(1, (int) (short) 100);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator4);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        int int19 = statisticalBarRenderer17.getRowCount();
        java.awt.Font font21 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean22 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer17.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint27 = statisticalBarRenderer17.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setBasePaint(paint27);
        boolean boolean30 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer37.getLegendItemURLGenerator();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint39);
        statisticalBarRenderer35.setBaseItemLabelPaint(paint39, true);
        java.awt.Shape shape44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer35.setSeriesShape(1, shape44);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = null;
        statisticalBarRenderer35.setLegendItemURLGenerator(categorySeriesLabelGenerator46);
        java.awt.Paint paint49 = statisticalBarRenderer35.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean51 = statisticalBarRenderer35.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer52 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator53 = statisticalBarRenderer52.getLegendItemURLGenerator();
        statisticalBarRenderer52.setIncludeBaseInRange(false);
        java.awt.Paint paint57 = statisticalBarRenderer52.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint59 = statisticalBarRenderer52.getSeriesPaint((int) ' ');
        java.awt.Font font62 = statisticalBarRenderer52.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = statisticalBarRenderer52.getSeriesNegativeItemLabelPosition(10);
        statisticalBarRenderer35.setBaseNegativeItemLabelPosition(itemLabelPosition64, false);
        double double67 = statisticalBarRenderer35.getMaximumBarWidth();
        statisticalBarRenderer35.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false, true);
        java.awt.Stroke stroke72 = statisticalBarRenderer35.getErrorIndicatorStroke();
        statisticalBarRenderer0.setBaseStroke(stroke72);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNull(paint49);
        org.junit.Assert.assertNull(boolean51);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator53);
        org.junit.Assert.assertNull(paint57);
        org.junit.Assert.assertNull(paint59);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(itemLabelPosition64);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.0d + "'", double67 == 1.0d);
        org.junit.Assert.assertNotNull(stroke72);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) (short) 10);
        java.awt.Paint paint10 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator12, true);
        int int15 = statisticalBarRenderer0.getPassCount();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer16 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean17 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Shape shape19 = statisticalBarRenderer0.lookupSeriesShape((int) '#');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean8 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(10, (java.lang.Boolean) true);
        double double14 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer19.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint23);
        statisticalBarRenderer19.setBaseItemLabelPaint(paint23, true);
        statisticalBarRenderer15.setBaseFillPaint(paint23, true);
        java.awt.Shape shape29 = statisticalBarRenderer15.getBaseShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator30 = null;
        statisticalBarRenderer15.setBaseToolTipGenerator(categoryToolTipGenerator30, true);
        statisticalBarRenderer15.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer35.setBaseFillPaint(paint37);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = statisticalBarRenderer39.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer41.getLegendItemURLGenerator();
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer41.setBaseFillPaint(paint43);
        statisticalBarRenderer39.setBaseItemLabelPaint(paint43, true);
        statisticalBarRenderer35.setBaseFillPaint(paint43, true);
        java.awt.Shape shape49 = statisticalBarRenderer35.getBaseShape();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = statisticalBarRenderer35.getLegendItemLabelGenerator();
        statisticalBarRenderer15.setLegendItemURLGenerator(categorySeriesLabelGenerator50);
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator50);
        org.jfree.chart.LegendItem legendItem55 = statisticalBarRenderer0.getLegendItem(0, (int) (byte) 1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator40);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator50);
        org.junit.Assert.assertNull(legendItem55);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        boolean boolean5 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (short) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = statisticalBarRenderer0.getDrawingSupplier();
        double double9 = statisticalBarRenderer0.getMinimumBarLength();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1.0f);
        double double12 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 10);
        boolean boolean17 = statisticalBarRenderer0.isItemLabelVisible((int) (short) 10, (int) (short) 0);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator2 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Font font4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) ' ', font4, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = statisticalBarRenderer0.getBaseURLGenerator();
        double double8 = statisticalBarRenderer0.getLowerClip();
        java.awt.Stroke stroke10 = statisticalBarRenderer0.getSeriesOutlineStroke(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator2);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Paint paint19 = statisticalBarRenderer14.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint20 = statisticalBarRenderer14.getBasePaint();
        java.awt.Stroke stroke23 = statisticalBarRenderer14.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer14.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition26);
        statisticalBarRenderer0.setBase((double) (-1));
        boolean boolean30 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawRangeGridline(graphics2D34, categoryPlot35, valueAxis36, rectangle2D37, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator33);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = statisticalBarRenderer0.hasListener(eventListener32);
        java.awt.Font font34 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        statisticalBarRenderer36.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        statisticalBarRenderer36.setBaseItemLabelGenerator(categoryItemLabelGenerator40);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer42.getLegendItemURLGenerator();
        statisticalBarRenderer42.setIncludeBaseInRange(false);
        java.awt.Paint paint47 = statisticalBarRenderer42.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint48 = statisticalBarRenderer42.getBasePaint();
        java.awt.Stroke stroke51 = statisticalBarRenderer42.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer36.setBaseOutlineStroke(stroke51, true);
        double double54 = statisticalBarRenderer36.getUpperClip();
        statisticalBarRenderer36.setMinimumBarLength((double) (byte) 10);
        java.awt.Paint paint59 = statisticalBarRenderer36.getItemPaint(100, (int) '4');
        statisticalBarRenderer0.setSeriesPaint((int) (byte) 100, paint59);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator61 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator61);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNull(paint47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.lang.Boolean boolean4 = statisticalBarRenderer0.getSeriesVisible(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer9.getLegendItemURLGenerator();
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        java.awt.Paint paint14 = statisticalBarRenderer9.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer9.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer9.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer9.getNegativeItemLabelPosition((int) (byte) 10, 0);
        java.awt.Stroke stroke24 = statisticalBarRenderer9.lookupSeriesOutlineStroke((int) '#');
        statisticalBarRenderer0.setBaseOutlineStroke(stroke24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        double double4 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        boolean boolean9 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) 0, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        java.awt.Paint paint18 = statisticalBarRenderer13.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint19 = statisticalBarRenderer13.getBasePaint();
        double double20 = statisticalBarRenderer13.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer21 = statisticalBarRenderer13.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer21);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        java.awt.Stroke stroke26 = statisticalBarRenderer0.getSeriesStroke(10);
        java.awt.Font font28 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 10);
        boolean boolean29 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        boolean boolean32 = statisticalBarRenderer0.isItemLabelVisible((int) '#', (int) (byte) 10);
        java.awt.Paint paint34 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer36.setBaseFillPaint(paint38);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        statisticalBarRenderer36.setBaseURLGenerator(categoryURLGenerator40, true);
        statisticalBarRenderer36.setSeriesItemLabelsVisible((int) (byte) 10, (java.lang.Boolean) true, true);
        int int47 = statisticalBarRenderer36.getColumnCount();
        java.awt.Stroke stroke48 = statisticalBarRenderer36.getBaseOutlineStroke();
        statisticalBarRenderer0.setSeriesStroke((int) ' ', stroke48, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer21);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertNull(font28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        double double4 = statisticalBarRenderer0.getMinimumBarLength();
        int int5 = statisticalBarRenderer0.getRowCount();
        boolean boolean8 = statisticalBarRenderer0.getItemVisible((int) '4', (int) 'a');
        java.awt.Font font11 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 0, (int) (byte) 1);
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator3 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(0, categoryToolTipGenerator3, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer7.getLegendItemURLGenerator();
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Paint paint12 = statisticalBarRenderer7.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint14 = statisticalBarRenderer7.getSeriesPaint((int) ' ');
        java.awt.Font font17 = statisticalBarRenderer7.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.Marker marker21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        statisticalBarRenderer7.drawRangeMarker(graphics2D18, categoryPlot19, valueAxis20, marker21, rectangle2D22);
        statisticalBarRenderer7.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer27.getLegendItemURLGenerator();
        statisticalBarRenderer27.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        statisticalBarRenderer27.setBaseItemLabelGenerator(categoryItemLabelGenerator31);
        boolean boolean33 = statisticalBarRenderer27.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = statisticalBarRenderer35.getBaseItemLabelGenerator();
        java.awt.Font font39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer35.setSeriesItemLabelFont((int) ' ', font39, true);
        statisticalBarRenderer27.setSeriesItemLabelFont((int) (byte) 1, font39);
        statisticalBarRenderer7.setBaseItemLabelFont(font39, true);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 100, font39, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertNotNull(font39);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) true);
        java.awt.Font font6 = statisticalBarRenderer0.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = statisticalBarRenderer0.getToolTipGenerator((int) (short) 10, 100);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        double double7 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        java.awt.Font font10 = statisticalBarRenderer8.getBaseItemLabelFont();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean13 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer8);
        java.awt.Paint paint14 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        statisticalBarRenderer6.setIncludeBaseInRange(false);
        java.awt.Paint paint11 = statisticalBarRenderer6.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer6.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer14.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer6.setPositiveItemLabelPositionFallback(itemLabelPosition18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = statisticalBarRenderer6.getBaseItemLabelGenerator();
        boolean boolean21 = statisticalBarRenderer6.isDrawBarOutline();
        java.awt.Shape shape22 = statisticalBarRenderer6.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer23.getLegendItemURLGenerator();
        statisticalBarRenderer23.setIncludeBaseInRange(false);
        java.awt.Paint paint28 = statisticalBarRenderer23.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer23.setMinimumBarLength((double) 0L);
        java.awt.Paint paint31 = statisticalBarRenderer23.getBaseFillPaint();
        boolean boolean32 = statisticalBarRenderer6.equals((java.lang.Object) paint31);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = statisticalBarRenderer6.getLegendItemToolTipGenerator();
        boolean boolean34 = statisticalBarRenderer6.getBaseSeriesVisible();
        boolean boolean35 = statisticalBarRenderer0.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setMinimumBarLength((double) 0L);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean9 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Stroke stroke10 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Paint paint12 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint17);
        statisticalBarRenderer13.setBaseItemLabelPaint(paint17, true);
        java.awt.Shape shape22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer13.setSeriesShape(1, shape22);
        java.awt.Font font24 = null;
        statisticalBarRenderer13.setBaseItemLabelFont(font24, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer27.getLegendItemURLGenerator();
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer27.setBaseFillPaint(paint29);
        statisticalBarRenderer13.setBaseOutlinePaint(paint29);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator34 = statisticalBarRenderer33.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer35.setBaseFillPaint(paint37);
        statisticalBarRenderer33.setBaseItemLabelPaint(paint37, true);
        java.awt.Shape shape42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer33.setSeriesShape(1, shape42);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator46 = statisticalBarRenderer33.getURLGenerator((-1), (int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator48 = statisticalBarRenderer47.getLegendItemURLGenerator();
        java.awt.Paint paint49 = statisticalBarRenderer47.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator51 = null;
        statisticalBarRenderer47.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator51);
        statisticalBarRenderer47.setBaseCreateEntities(true, false);
        java.awt.Shape shape56 = statisticalBarRenderer47.getBaseShape();
        statisticalBarRenderer33.setBaseShape(shape56, true);
        statisticalBarRenderer13.setSeriesShape((int) (byte) 1, shape56);
        statisticalBarRenderer0.setBaseShape(shape56, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNull(categoryURLGenerator46);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(shape56);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        double double4 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        boolean boolean9 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation8);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint13);
        boolean boolean15 = statisticalBarRenderer11.getBaseSeriesVisible();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer11.getLegendItemLabelGenerator();
        boolean boolean17 = statisticalBarRenderer11.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer19.getLegendItemURLGenerator();
        java.awt.Font font21 = statisticalBarRenderer19.getBaseItemLabelFont();
        statisticalBarRenderer11.setSeriesItemLabelFont((int) '#', font21, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer11.getNegativeItemLabelPosition(1, (int) (short) 100);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition26);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        boolean boolean5 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Paint paint8 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 1, 1);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.removeChangeListener(rendererChangeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Paint paint21 = statisticalBarRenderer16.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint22 = statisticalBarRenderer16.getBasePaint();
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke25);
        boolean boolean27 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.awt.Paint paint29 = statisticalBarRenderer0.lookupSeriesPaint((-1));
        java.awt.Shape shape31 = null;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 10, shape31);
        java.awt.Stroke stroke35 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, 1);
        java.awt.Shape shape36 = statisticalBarRenderer0.getBaseShape();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(shape36);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer4.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint8);
        statisticalBarRenderer4.setBaseItemLabelPaint(paint8, true);
        statisticalBarRenderer0.setBaseFillPaint(paint8, true);
        java.awt.Shape shape14 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator15, true);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator19, true);
        java.awt.Paint paint24 = statisticalBarRenderer0.getItemLabelPaint(0, (int) (byte) 1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        double double7 = statisticalBarRenderer0.getBase();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = statisticalBarRenderer0.getURLGenerator((int) (byte) -1, 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = statisticalBarRenderer0.getURLGenerator((int) (byte) 0, 1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNull(categoryURLGenerator13);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Paint paint19 = statisticalBarRenderer14.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint20 = statisticalBarRenderer14.getBasePaint();
        java.awt.Stroke stroke23 = statisticalBarRenderer14.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer14.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition26);
        statisticalBarRenderer0.setBase((double) (-1));
        boolean boolean30 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator33);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        int int11 = statisticalBarRenderer0.getPassCount();
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((-1), (int) (short) 10);
        boolean boolean17 = statisticalBarRenderer0.isItemLabelVisible((int) ' ', (int) 'a');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 0, false);
        boolean boolean22 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (byte) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font17);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent22 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent22);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesVisibleInLegend((-1), (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Stroke stroke3 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        int int19 = statisticalBarRenderer17.getRowCount();
        java.awt.Font font21 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean22 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer17.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint27 = statisticalBarRenderer17.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setBasePaint(paint27);
        boolean boolean30 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint34 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 10, (int) (byte) 1);
        java.awt.Paint paint35 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        java.awt.Paint paint38 = statisticalBarRenderer36.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = statisticalBarRenderer39.getLegendItemURLGenerator();
        statisticalBarRenderer39.setIncludeBaseInRange(false);
        java.awt.Paint paint44 = statisticalBarRenderer39.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint45 = statisticalBarRenderer39.getBasePaint();
        double double46 = statisticalBarRenderer39.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer47 = statisticalBarRenderer39.getGradientPaintTransformer();
        statisticalBarRenderer36.setGradientPaintTransformer(gradientPaintTransformer47);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = statisticalBarRenderer49.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = statisticalBarRenderer49.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator54 = statisticalBarRenderer49.getBaseItemLabelGenerator();
        boolean boolean55 = statisticalBarRenderer49.getBaseSeriesVisibleInLegend();
        boolean boolean56 = statisticalBarRenderer49.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer57.getLegendItemURLGenerator();
        java.awt.Paint paint59 = statisticalBarRenderer57.getBaseFillPaint();
        boolean boolean60 = statisticalBarRenderer49.equals((java.lang.Object) paint59);
        java.lang.Object obj61 = statisticalBarRenderer49.clone();
        java.awt.Paint paint64 = statisticalBarRenderer49.getItemFillPaint((int) (short) -1, (int) ' ');
        statisticalBarRenderer36.setBaseFillPaint(paint64);
        java.awt.Paint paint68 = statisticalBarRenderer36.getItemOutlinePaint((int) '4', (int) (short) 10);
        statisticalBarRenderer0.setBaseFillPaint(paint68);
        boolean boolean72 = statisticalBarRenderer0.getItemVisible(1, (int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range74 = statisticalBarRenderer0.findRangeBounds(categoryDataset73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator40);
        org.junit.Assert.assertNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer47);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator50);
        org.junit.Assert.assertNotNull(itemLabelPosition53);
        org.junit.Assert.assertNull(categoryItemLabelGenerator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        org.jfree.chart.LegendItem legendItem8 = statisticalBarRenderer0.getLegendItem((int) 'a', (int) (byte) -1);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) false);
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemPaint((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(legendItem8);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemStroke((int) (short) 10, (int) (short) 100);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getSeriesOutlineStroke((int) '#');
        double double10 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (byte) 10, 0);
        java.awt.Paint paint16 = statisticalBarRenderer0.getItemLabelPaint((int) (short) -1, 10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator18, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Paint paint19 = statisticalBarRenderer14.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint20 = statisticalBarRenderer14.getBasePaint();
        java.awt.Stroke stroke23 = statisticalBarRenderer14.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer14.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition26);
        statisticalBarRenderer0.setBase((double) (-1));
        boolean boolean30 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        boolean boolean34 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) ' ');
        java.awt.Paint paint37 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        boolean boolean17 = statisticalBarRenderer0.isSeriesItemLabelsVisible(0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Paint paint15 = statisticalBarRenderer10.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint16 = statisticalBarRenderer10.getBasePaint();
        java.awt.Stroke stroke19 = statisticalBarRenderer10.getItemStroke((int) (byte) 10, (int) (short) 10);
        boolean boolean20 = statisticalBarRenderer0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        statisticalBarRenderer21.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        statisticalBarRenderer21.setBaseItemLabelGenerator(categoryItemLabelGenerator25);
        double double27 = statisticalBarRenderer21.getItemMargin();
        java.awt.Paint paint30 = statisticalBarRenderer21.getItemFillPaint((int) (short) 0, (int) (byte) 100);
        statisticalBarRenderer0.setBaseFillPaint(paint30);
        org.jfree.chart.LegendItem legendItem34 = statisticalBarRenderer0.getLegendItem((int) (short) 10, (int) (short) -1);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2d + "'", double27 == 0.2d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(legendItem34);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer8 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint13);
        double double15 = statisticalBarRenderer11.getUpperClip();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer11.getLegendItemURLGenerator();
        boolean boolean17 = statisticalBarRenderer11.getBaseSeriesVisible();
        double double18 = statisticalBarRenderer11.getMinimumBarLength();
        java.awt.Paint paint19 = statisticalBarRenderer11.getBaseFillPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint19);
        boolean boolean21 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(gradientPaintTransformer8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator5 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 1, categoryToolTipGenerator5);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer7.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer9.getLegendItemURLGenerator();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint11);
        statisticalBarRenderer7.setBaseItemLabelPaint(paint11, true);
        statisticalBarRenderer0.setBaseOutlinePaint(paint11);
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getSeriesStroke((int) (byte) 1);
        boolean boolean20 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 10, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        java.awt.Paint paint23 = statisticalBarRenderer21.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        statisticalBarRenderer21.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator25);
        statisticalBarRenderer21.setBaseCreateEntities(true, false);
        statisticalBarRenderer21.setBase((double) 1);
        java.awt.Stroke stroke32 = statisticalBarRenderer21.getBaseStroke();
        statisticalBarRenderer0.setBaseStroke(stroke32, false);
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1.0f);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator13);
        boolean boolean15 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Paint paint21 = statisticalBarRenderer16.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer16.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer16.setBaseCreateEntities(true, true);
        int int27 = statisticalBarRenderer16.getPassCount();
        java.awt.Stroke stroke30 = statisticalBarRenderer16.getItemStroke((-1), (int) (short) 10);
        boolean boolean33 = statisticalBarRenderer16.isItemLabelVisible((int) ' ', (int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer34 = statisticalBarRenderer16.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer34);
        org.jfree.chart.LegendItemCollection legendItemCollection36 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection37 = statisticalBarRenderer0.getLegendItems();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(gradientPaintTransformer34);
        org.junit.Assert.assertNotNull(legendItemCollection36);
        org.junit.Assert.assertNotNull(legendItemCollection37);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator4);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setBase((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        int int14 = statisticalBarRenderer12.getRowCount();
        java.awt.Font font16 = statisticalBarRenderer12.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean17 = statisticalBarRenderer12.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer12.getSeriesItemLabelGenerator((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer20.getLegendItemURLGenerator();
        statisticalBarRenderer20.setIncludeBaseInRange(false);
        java.awt.Paint paint25 = statisticalBarRenderer20.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint26 = statisticalBarRenderer20.getBasePaint();
        java.awt.Stroke stroke29 = statisticalBarRenderer20.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer20.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer12.setNegativeItemLabelPositionFallback(itemLabelPosition32);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) '4', itemLabelPosition32, false);
        java.awt.Shape shape38 = statisticalBarRenderer0.getItemShape((int) (byte) 100, (int) (byte) 100);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) false, false);
        java.awt.Paint paint44 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection45 = statisticalBarRenderer0.getLegendItems();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(legendItemCollection45);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer4.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint8);
        statisticalBarRenderer4.setBaseItemLabelPaint(paint8, true);
        statisticalBarRenderer0.setBaseFillPaint(paint8, true);
        java.awt.Shape shape14 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator15, true);
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = statisticalBarRenderer0.getSeriesToolTipGenerator((int) (byte) 1);
        boolean boolean24 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNull(categoryURLGenerator21);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        java.awt.Paint paint10 = statisticalBarRenderer8.getBaseFillPaint();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) paint10);
        java.lang.Object obj12 = statisticalBarRenderer0.clone();
        java.awt.Paint paint15 = statisticalBarRenderer0.getItemFillPaint((int) (short) -1, (int) ' ');
        statisticalBarRenderer0.setMinimumBarLength(0.2d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer19.getLegendItemURLGenerator();
        int int21 = statisticalBarRenderer19.getRowCount();
        java.awt.Font font23 = statisticalBarRenderer19.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean24 = statisticalBarRenderer19.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = statisticalBarRenderer19.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint29 = statisticalBarRenderer19.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) '4', paint29, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator32);
        java.lang.Boolean boolean35 = statisticalBarRenderer0.getSeriesItemLabelsVisible(10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(boolean35);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint10);
        statisticalBarRenderer0.setBaseFillPaint(paint10, false);
        java.awt.Paint paint15 = statisticalBarRenderer0.lookupSeriesFillPaint(10);
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Paint paint19 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 0);
        java.awt.Stroke stroke21 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        java.awt.Paint paint23 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) -1);
        statisticalBarRenderer0.setItemLabelAnchorOffset(2.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint10);
        statisticalBarRenderer6.setBaseItemLabelPaint(paint10, true);
        java.awt.Shape shape15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer6.setSeriesShape(1, shape15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        statisticalBarRenderer6.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        statisticalBarRenderer6.setBase((double) 0L);
        java.awt.Shape shape21 = statisticalBarRenderer6.getBaseShape();
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape21, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 10);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertNull(categoryURLGenerator4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator26);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        org.jfree.chart.LegendItem legendItem8 = statisticalBarRenderer0.getLegendItem((int) 'a', (int) (byte) -1);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) false);
        statisticalBarRenderer0.setBase((double) (byte) 100);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer15 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(legendItem8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(gradientPaintTransformer15);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        boolean boolean11 = statisticalBarRenderer0.isSeriesVisible((int) 'a');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        int int11 = statisticalBarRenderer0.getPassCount();
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((-1), (int) (short) 10);
        boolean boolean17 = statisticalBarRenderer0.isItemLabelVisible((int) ' ', (int) 'a');
        java.awt.Paint paint20 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 10, (int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (byte) 1, (-1));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        java.awt.Paint paint25 = statisticalBarRenderer0.getBaseFillPaint();
        java.awt.Font font28 = statisticalBarRenderer0.getItemLabelFont(1, (int) '#');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1.0f);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator13);
        boolean boolean15 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        double double16 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Paint paint19 = statisticalBarRenderer0.getItemPaint(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = paint19.getClass();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        statisticalBarRenderer0.setBase((double) 10.0f);
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(itemLabelPosition2);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        double double4 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer7.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer7.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer7.getBaseItemLabelGenerator();
        boolean boolean13 = statisticalBarRenderer7.getBaseSeriesVisibleInLegend();
        boolean boolean14 = statisticalBarRenderer7.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint17);
        statisticalBarRenderer7.setBaseFillPaint(paint17, false);
        statisticalBarRenderer0.setBaseFillPaint(paint17, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Paint paint21 = statisticalBarRenderer16.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint22 = statisticalBarRenderer16.getBasePaint();
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = statisticalBarRenderer0.getSeriesToolTipGenerator(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer30.getLegendItemURLGenerator();
        statisticalBarRenderer30.setIncludeBaseInRange(false);
        java.awt.Paint paint35 = statisticalBarRenderer30.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint36 = statisticalBarRenderer30.getBasePaint();
        double double37 = statisticalBarRenderer30.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer38 = statisticalBarRenderer30.getGradientPaintTransformer();
        int int39 = statisticalBarRenderer30.getRowCount();
        java.awt.Paint paint42 = statisticalBarRenderer30.getItemFillPaint(100, 0);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) 'a', paint42);
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(categoryToolTipGenerator28);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        java.awt.Paint paint18 = statisticalBarRenderer13.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke19);
        statisticalBarRenderer0.setBaseStroke(stroke19);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = statisticalBarRenderer0.getURLGenerator(0, 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator26);
        java.awt.Paint paint29 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(categoryURLGenerator24);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer20.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer20.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = statisticalBarRenderer20.getBaseItemLabelGenerator();
        boolean boolean26 = statisticalBarRenderer20.getBaseSeriesVisibleInLegend();
        boolean boolean27 = statisticalBarRenderer20.getBaseCreateEntities();
        java.awt.Font font28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer20.setBaseItemLabelFont(font28);
        java.awt.Paint paint30 = statisticalBarRenderer20.getBaseOutlinePaint();
        statisticalBarRenderer20.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Paint paint35 = statisticalBarRenderer20.lookupSeriesPaint(10);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint35, true);
        java.awt.Stroke stroke39 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke41 = statisticalBarRenderer0.lookupSeriesStroke((int) (short) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        java.lang.Object obj7 = statisticalBarRenderer0.clone();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator8, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Paint paint15 = statisticalBarRenderer10.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint16 = statisticalBarRenderer10.getBasePaint();
        java.awt.Stroke stroke19 = statisticalBarRenderer10.getItemStroke((int) (byte) 10, (int) (short) 10);
        boolean boolean20 = statisticalBarRenderer0.equals((java.lang.Object) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        statisticalBarRenderer0.setDrawBarOutline(false);
        double double25 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer4.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint8);
        statisticalBarRenderer4.setBaseItemLabelPaint(paint8, true);
        statisticalBarRenderer0.setBaseFillPaint(paint8, true);
        java.awt.Shape shape14 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator15, true);
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer20.getLegendItemURLGenerator();
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint22);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer24.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer26.getLegendItemURLGenerator();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer26.setBaseFillPaint(paint28);
        statisticalBarRenderer24.setBaseItemLabelPaint(paint28, true);
        statisticalBarRenderer20.setBaseFillPaint(paint28, true);
        java.awt.Shape shape34 = statisticalBarRenderer20.getBaseShape();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = statisticalBarRenderer20.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator35);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        statisticalBarRenderer0.setMinimumBarLength(1.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer41.getLegendItemURLGenerator();
        statisticalBarRenderer41.setIncludeBaseInRange(false);
        java.awt.Paint paint46 = statisticalBarRenderer41.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint47 = statisticalBarRenderer41.getBasePaint();
        org.jfree.chart.LegendItem legendItem50 = statisticalBarRenderer41.getLegendItem((int) (byte) 10, (int) (byte) 0);
        java.awt.Paint paint51 = statisticalBarRenderer41.getBaseFillPaint();
        statisticalBarRenderer0.setBasePaint(paint51);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator35);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(legendItem50);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator4);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) -1);
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) (short) 0, (int) (short) 1);
        double double11 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer8 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer8);
        boolean boolean11 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer13.setSeriesVisible(10, (java.lang.Boolean) true);
        java.awt.Font font19 = statisticalBarRenderer13.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 0, font19, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D23, categoryPlot24, categoryAxis25, categoryMarker26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator22);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        statisticalBarRenderer8.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint12 = statisticalBarRenderer8.getBaseItemLabelPaint();
        statisticalBarRenderer8.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint20);
        statisticalBarRenderer16.setBaseItemLabelPaint(paint20, true);
        java.awt.Shape shape25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape(1, shape25);
        statisticalBarRenderer8.setBaseShape(shape25, true);
        boolean boolean29 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer8);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator31, true);
        double double34 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.plot.Marker marker38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D35, categoryPlot36, valueAxis37, marker38, rectangle2D39);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = statisticalBarRenderer41.getLegendItemURLGenerator();
        statisticalBarRenderer41.setIncludeBaseInRange(false);
        java.awt.Paint paint46 = statisticalBarRenderer41.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint47 = statisticalBarRenderer41.getBasePaint();
        boolean boolean48 = statisticalBarRenderer41.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = statisticalBarRenderer49.getLegendItemURLGenerator();
        statisticalBarRenderer49.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint53 = statisticalBarRenderer49.getBaseItemLabelPaint();
        statisticalBarRenderer49.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer57.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer59 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator60 = statisticalBarRenderer59.getLegendItemURLGenerator();
        java.awt.Paint paint61 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer59.setBaseFillPaint(paint61);
        statisticalBarRenderer57.setBaseItemLabelPaint(paint61, true);
        java.awt.Shape shape66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer57.setSeriesShape(1, shape66);
        statisticalBarRenderer49.setBaseShape(shape66, true);
        boolean boolean70 = statisticalBarRenderer41.equals((java.lang.Object) statisticalBarRenderer49);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent71 = null;
        statisticalBarRenderer49.notifyListeners(rendererChangeEvent71);
        java.awt.Paint paint74 = statisticalBarRenderer49.lookupSeriesPaint((int) (short) 0);
        boolean boolean75 = statisticalBarRenderer49.getBaseItemLabelsVisible();
        statisticalBarRenderer49.setBase((double) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer78 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator79 = statisticalBarRenderer78.getLegendItemURLGenerator();
        statisticalBarRenderer78.removeAnnotations();
        java.awt.Stroke stroke83 = statisticalBarRenderer78.getItemStroke((int) (short) 10, (-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator84 = statisticalBarRenderer78.getBaseURLGenerator();
        java.lang.Object obj85 = statisticalBarRenderer78.clone();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition88 = statisticalBarRenderer78.getNegativeItemLabelPosition((int) (short) -1, (int) 'a');
        statisticalBarRenderer49.setBasePositiveItemLabelPosition(itemLabelPosition88);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition88);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition93 = statisticalBarRenderer0.getNegativeItemLabelPosition(0, (int) (short) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator42);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator50);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator60);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(shape66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator79);
        org.junit.Assert.assertNotNull(stroke83);
        org.junit.Assert.assertNull(categoryURLGenerator84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(itemLabelPosition88);
        org.junit.Assert.assertNotNull(itemLabelPosition93);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBase((double) 0L);
        java.awt.Shape shape15 = statisticalBarRenderer0.getBaseShape();
        java.lang.Boolean boolean17 = statisticalBarRenderer0.getSeriesItemLabelsVisible(100);
        statisticalBarRenderer0.setMaximumBarWidth((double) 1);
        double double20 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean21 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = statisticalBarRenderer23.getLegendItemURLGenerator();
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer23.setBaseFillPaint(paint25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        statisticalBarRenderer23.setSeriesToolTipGenerator((int) (byte) 1, categoryToolTipGenerator28);
        statisticalBarRenderer23.setBaseSeriesVisible(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        statisticalBarRenderer23.setBaseURLGenerator(categoryURLGenerator32, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer37.getLegendItemURLGenerator();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint39);
        statisticalBarRenderer35.setBaseItemLabelPaint(paint39, true);
        java.awt.Shape shape44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer35.setSeriesShape(1, shape44);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = null;
        statisticalBarRenderer35.setLegendItemURLGenerator(categorySeriesLabelGenerator46);
        java.awt.Paint paint49 = statisticalBarRenderer35.getSeriesOutlinePaint((-1));
        statisticalBarRenderer35.setAutoPopulateSeriesStroke(true);
        java.awt.Font font54 = statisticalBarRenderer35.getItemLabelFont((int) (short) 1, (int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator57 = statisticalBarRenderer56.getLegendItemURLGenerator();
        statisticalBarRenderer56.setIncludeBaseInRange(false);
        java.awt.Paint paint61 = statisticalBarRenderer56.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer56.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer56.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = statisticalBarRenderer56.getNegativeItemLabelPosition((int) (byte) 10, 0);
        java.awt.Stroke stroke71 = statisticalBarRenderer56.lookupSeriesOutlineStroke((int) '#');
        statisticalBarRenderer35.setSeriesStroke((int) (byte) 100, stroke71, true);
        statisticalBarRenderer23.setErrorIndicatorStroke(stroke71);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) 'a', stroke71);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNull(paint49);
        org.junit.Assert.assertNotNull(font54);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator57);
        org.junit.Assert.assertNull(paint61);
        org.junit.Assert.assertNotNull(itemLabelPosition69);
        org.junit.Assert.assertNotNull(stroke71);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        statisticalBarRenderer8.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint12 = statisticalBarRenderer8.getBaseItemLabelPaint();
        statisticalBarRenderer8.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint20);
        statisticalBarRenderer16.setBaseItemLabelPaint(paint20, true);
        java.awt.Shape shape25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape(1, shape25);
        statisticalBarRenderer8.setBaseShape(shape25, true);
        boolean boolean29 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = statisticalBarRenderer31.getLegendItemURLGenerator();
        statisticalBarRenderer31.removeAnnotations();
        java.awt.Stroke stroke36 = statisticalBarRenderer31.getItemStroke((int) (short) 10, (-1));
        statisticalBarRenderer8.setSeriesStroke((int) (byte) 1, stroke36, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = statisticalBarRenderer8.getPlot();
        statisticalBarRenderer8.setBase((double) (byte) 1);
        double double42 = statisticalBarRenderer8.getUpperClip();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator32);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNull(categoryPlot39);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = statisticalBarRenderer0.getURLGenerator((-1), (int) ' ');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (byte) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categoryURLGenerator13);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 10, (java.lang.Boolean) true, true);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getBaseStroke();
        java.lang.Boolean boolean13 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) '4');
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Paint paint19 = statisticalBarRenderer14.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint20 = statisticalBarRenderer14.getBasePaint();
        java.awt.Stroke stroke23 = statisticalBarRenderer14.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer14.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition26);
        statisticalBarRenderer0.setBase((double) (-1));
        boolean boolean30 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawBackground(graphics2D35, categoryPlot36, rectangle2D37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        java.awt.Paint paint18 = statisticalBarRenderer16.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = null;
        statisticalBarRenderer16.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator20);
        statisticalBarRenderer16.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer26.getLegendItemURLGenerator();
        statisticalBarRenderer26.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint30 = statisticalBarRenderer26.getBaseItemLabelPaint();
        statisticalBarRenderer26.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = statisticalBarRenderer34.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer36.setBaseFillPaint(paint38);
        statisticalBarRenderer34.setBaseItemLabelPaint(paint38, true);
        java.awt.Shape shape43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer34.setSeriesShape(1, shape43);
        statisticalBarRenderer26.setBaseShape(shape43, true);
        java.awt.Stroke stroke47 = statisticalBarRenderer26.getBaseStroke();
        statisticalBarRenderer16.setSeriesOutlineStroke((int) '4', stroke47);
        statisticalBarRenderer0.setBaseStroke(stroke47);
        boolean boolean52 = statisticalBarRenderer0.getItemVisible((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator35);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        boolean boolean10 = statisticalBarRenderer0.isSeriesVisible((int) (byte) -1);
        statisticalBarRenderer0.setMinimumBarLength((double) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer13.setSeriesVisible(10, (java.lang.Boolean) true);
        statisticalBarRenderer13.setBaseSeriesVisible(false, true);
        double double20 = statisticalBarRenderer13.getItemLabelAnchorOffset();
        java.awt.Stroke stroke22 = statisticalBarRenderer13.lookupSeriesOutlineStroke(0);
        java.awt.Stroke stroke25 = statisticalBarRenderer13.getItemOutlineStroke(0, (int) (byte) 0);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Paint paint19 = statisticalBarRenderer14.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer14.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer14.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer14.getNegativeItemLabelPosition((int) (byte) 10, 0);
        statisticalBarRenderer14.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = statisticalBarRenderer31.getLegendItemURLGenerator();
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setBaseFillPaint(paint33);
        statisticalBarRenderer14.setErrorIndicatorPaint(paint33);
        statisticalBarRenderer0.setSeriesPaint(10, paint33);
        java.awt.Paint paint38 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) -1);
        java.awt.Shape shape40 = statisticalBarRenderer0.lookupSeriesShape(0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(shape40);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        boolean boolean8 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer9.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint13);
        statisticalBarRenderer9.setBaseItemLabelPaint(paint13, true);
        java.awt.Shape shape18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer9.setSeriesShape(1, shape18);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = null;
        statisticalBarRenderer9.setLegendItemURLGenerator(categorySeriesLabelGenerator20);
        statisticalBarRenderer9.setBase((double) 0L);
        java.awt.Shape shape24 = statisticalBarRenderer9.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer26.getLegendItemURLGenerator();
        java.awt.Shape shape30 = statisticalBarRenderer26.getItemShape((-1), (int) (byte) 100);
        statisticalBarRenderer9.setSeriesShape((int) (byte) 0, shape30);
        statisticalBarRenderer0.setBaseShape(shape30, false);
        boolean boolean34 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = statisticalBarRenderer0.hasListener(eventListener32);
        java.lang.Object obj34 = statisticalBarRenderer0.clone();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Paint paint39 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) ' ');
        boolean boolean40 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        double double7 = statisticalBarRenderer0.getBase();
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) '#');
        java.awt.Shape shape12 = statisticalBarRenderer0.getItemShape(10, (int) 'a');
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawBackground(graphics2D13, categoryPlot14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        java.awt.Paint paint32 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setBase((double) 0.0f);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) 'a', (java.lang.Boolean) true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        boolean boolean41 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        statisticalBarRenderer8.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint12 = statisticalBarRenderer8.getBaseItemLabelPaint();
        statisticalBarRenderer8.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer18.getLegendItemURLGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint20);
        statisticalBarRenderer16.setBaseItemLabelPaint(paint20, true);
        java.awt.Shape shape25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape(1, shape25);
        statisticalBarRenderer8.setBaseShape(shape25, true);
        boolean boolean29 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer8);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator31, true);
        double double34 = statisticalBarRenderer0.getMaximumBarWidth();
        statisticalBarRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer37.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = statisticalBarRenderer39.getLegendItemURLGenerator();
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setBaseFillPaint(paint41);
        statisticalBarRenderer37.setBaseItemLabelPaint(paint41, true);
        java.awt.Shape shape46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer37.setSeriesShape(1, shape46);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = statisticalBarRenderer37.getURLGenerator((-1), (int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer51.getLegendItemURLGenerator();
        java.awt.Paint paint53 = statisticalBarRenderer51.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = null;
        statisticalBarRenderer51.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator55);
        statisticalBarRenderer51.setBaseCreateEntities(true, false);
        java.awt.Shape shape60 = statisticalBarRenderer51.getBaseShape();
        statisticalBarRenderer37.setBaseShape(shape60, true);
        statisticalBarRenderer0.setBaseShape(shape60, false);
        java.awt.Paint paint65 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Paint paint67 = statisticalBarRenderer0.lookupSeriesFillPaint((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer68 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator69 = statisticalBarRenderer68.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition72 = statisticalBarRenderer68.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator73 = statisticalBarRenderer68.getBaseItemLabelGenerator();
        boolean boolean74 = statisticalBarRenderer68.getBaseSeriesVisibleInLegend();
        boolean boolean75 = statisticalBarRenderer68.getBaseCreateEntities();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator76 = statisticalBarRenderer68.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator76);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator78 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator78);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNull(categoryURLGenerator50);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(shape60);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator69);
        org.junit.Assert.assertNotNull(itemLabelPosition72);
        org.junit.Assert.assertNull(categoryItemLabelGenerator73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator76);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 1, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator11, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint19);
        statisticalBarRenderer15.setBaseItemLabelPaint(paint19, true);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer15.setSeriesShape(1, shape24);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = null;
        statisticalBarRenderer15.setLegendItemURLGenerator(categorySeriesLabelGenerator26);
        statisticalBarRenderer15.setBase((double) 0L);
        java.awt.Shape shape30 = statisticalBarRenderer15.getBaseShape();
        statisticalBarRenderer0.setSeriesShape(0, shape30);
        boolean boolean32 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.LegendItemCollection legendItemCollection33 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(legendItemCollection33);
        org.junit.Assert.assertNull(categoryItemLabelGenerator35);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint12);
        statisticalBarRenderer8.setBaseItemLabelPaint(paint12, true);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape(1, shape17);
        statisticalBarRenderer0.setBaseShape(shape17, true);
        boolean boolean23 = statisticalBarRenderer0.getItemVisible((int) (short) 100, (int) '4');
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font17);
        java.awt.Paint paint19 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 0);
        java.awt.Shape shape23 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(categoryURLGenerator21);
        org.junit.Assert.assertNull(shape23);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint12);
        statisticalBarRenderer8.setBaseItemLabelPaint(paint12, true);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape(1, shape17);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = null;
        statisticalBarRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator19);
        statisticalBarRenderer8.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer24.getLegendItemURLGenerator();
        statisticalBarRenderer24.setIncludeBaseInRange(false);
        java.awt.Paint paint29 = statisticalBarRenderer24.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint30 = statisticalBarRenderer24.getBasePaint();
        java.awt.Stroke stroke33 = statisticalBarRenderer24.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer8.setSeriesStroke((int) '4', stroke33);
        java.awt.Paint paint37 = statisticalBarRenderer8.getItemOutlinePaint(0, 0);
        statisticalBarRenderer8.setSeriesCreateEntities(10, (java.lang.Boolean) true, false);
        boolean boolean42 = statisticalBarRenderer8.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke45 = statisticalBarRenderer8.getItemOutlineStroke((int) (short) 10, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke45, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator49 = statisticalBarRenderer48.getLegendItemURLGenerator();
        statisticalBarRenderer48.setIncludeBaseInRange(false);
        java.awt.Paint paint53 = statisticalBarRenderer48.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer48.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer48.setBaseCreateEntities(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer59 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator60 = statisticalBarRenderer59.getLegendItemURLGenerator();
        statisticalBarRenderer59.setIncludeBaseInRange(false);
        java.awt.Paint paint64 = statisticalBarRenderer59.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint65 = statisticalBarRenderer59.getBasePaint();
        java.awt.Stroke stroke68 = statisticalBarRenderer59.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = statisticalBarRenderer59.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer72 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator73 = statisticalBarRenderer72.getLegendItemURLGenerator();
        statisticalBarRenderer72.setIncludeBaseInRange(false);
        java.awt.Paint paint77 = statisticalBarRenderer72.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke78 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer72.setBaseOutlineStroke(stroke78);
        statisticalBarRenderer59.setBaseStroke(stroke78);
        java.awt.Paint paint81 = statisticalBarRenderer59.getBaseOutlinePaint();
        statisticalBarRenderer48.setBasePaint(paint81, false);
        statisticalBarRenderer0.setBaseFillPaint(paint81);
        boolean boolean85 = statisticalBarRenderer0.getBaseCreateEntities();
        boolean boolean88 = statisticalBarRenderer0.getItemCreateEntity((int) 'a', (int) 'a');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator49);
        org.junit.Assert.assertNull(paint53);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator60);
        org.junit.Assert.assertNull(paint64);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNotNull(itemLabelPosition71);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator73);
        org.junit.Assert.assertNull(paint77);
        org.junit.Assert.assertNotNull(stroke78);
        org.junit.Assert.assertNotNull(paint81);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator4);
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = statisticalBarRenderer14.getLegendItemURLGenerator();
        statisticalBarRenderer14.setIncludeBaseInRange(false);
        java.awt.Paint paint19 = statisticalBarRenderer14.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint21 = statisticalBarRenderer14.getSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = statisticalBarRenderer22.getLegendItemURLGenerator();
        statisticalBarRenderer22.setIncludeBaseInRange(false);
        java.awt.Paint paint27 = statisticalBarRenderer22.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer22.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer22.setBaseCreateEntities(true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator34 = statisticalBarRenderer33.getLegendItemURLGenerator();
        statisticalBarRenderer33.setIncludeBaseInRange(false);
        java.awt.Paint paint38 = statisticalBarRenderer33.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint39 = statisticalBarRenderer33.getBasePaint();
        java.awt.Stroke stroke42 = statisticalBarRenderer33.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = statisticalBarRenderer33.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator47 = statisticalBarRenderer46.getLegendItemURLGenerator();
        statisticalBarRenderer46.setIncludeBaseInRange(false);
        java.awt.Paint paint51 = statisticalBarRenderer46.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer46.setBaseOutlineStroke(stroke52);
        statisticalBarRenderer33.setBaseStroke(stroke52);
        java.awt.Paint paint55 = statisticalBarRenderer33.getBaseOutlinePaint();
        statisticalBarRenderer22.setBasePaint(paint55, false);
        statisticalBarRenderer14.setErrorIndicatorPaint(paint55);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint55);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator60 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator60);
        java.awt.Paint paint63 = statisticalBarRenderer0.getSeriesOutlinePaint(100);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator34);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(itemLabelPosition45);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator47);
        org.junit.Assert.assertNull(paint51);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNull(paint63);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer4.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint8);
        statisticalBarRenderer4.setBaseItemLabelPaint(paint8, true);
        statisticalBarRenderer0.setBaseFillPaint(paint8, true);
        java.awt.Shape shape14 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator15, true);
        double double18 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator19, true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        double double4 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        boolean boolean9 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) 0, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        statisticalBarRenderer13.setIncludeBaseInRange(false);
        java.awt.Paint paint18 = statisticalBarRenderer13.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint19 = statisticalBarRenderer13.getBasePaint();
        double double20 = statisticalBarRenderer13.getBase();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer21 = statisticalBarRenderer13.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer21);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        java.awt.Stroke stroke26 = statisticalBarRenderer0.getSeriesStroke(10);
        java.awt.Stroke stroke27 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer21);
        org.junit.Assert.assertNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint12);
        statisticalBarRenderer8.setBaseItemLabelPaint(paint12, true);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape(1, shape17);
        statisticalBarRenderer0.setBaseShape(shape17, true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.LegendItem legendItem27 = statisticalBarRenderer0.getLegendItem((int) (byte) 10, (int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        boolean boolean29 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(legendItem27);
        org.junit.Assert.assertNull(itemLabelPosition28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        int int19 = statisticalBarRenderer17.getRowCount();
        java.awt.Font font21 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean22 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer17.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint27 = statisticalBarRenderer17.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setBasePaint(paint27);
        boolean boolean29 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint32 = statisticalBarRenderer0.getItemFillPaint((int) ' ', (int) (short) 1);
        boolean boolean34 = statisticalBarRenderer0.isSeriesVisibleInLegend((-1));
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 10, categoryToolTipGenerator8);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(itemLabelPosition10);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (byte) 10, 0);
        boolean boolean14 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setBaseSeriesVisible(false, true);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke6);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer12.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = statisticalBarRenderer12.getBaseItemLabelGenerator();
        boolean boolean18 = statisticalBarRenderer12.getBaseSeriesVisibleInLegend();
        statisticalBarRenderer12.setSeriesItemLabelsVisible((int) (byte) 1, false);
        java.awt.Paint paint24 = statisticalBarRenderer12.getItemLabelPaint((int) (short) 100, (int) (byte) 100);
        statisticalBarRenderer0.setBaseFillPaint(paint24, true);
        statisticalBarRenderer0.removeAnnotations();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer5.getLegendItemURLGenerator();
        statisticalBarRenderer5.setIncludeBaseInRange(false);
        java.awt.Paint paint10 = statisticalBarRenderer5.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer5.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer13.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer13.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer5.setPositiveItemLabelPositionFallback(itemLabelPosition17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer19.getLegendItemURLGenerator();
        statisticalBarRenderer19.setIncludeBaseInRange(false);
        java.awt.Paint paint24 = statisticalBarRenderer19.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint25 = statisticalBarRenderer19.getBasePaint();
        java.awt.Stroke stroke28 = statisticalBarRenderer19.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer19.getNegativeItemLabelPosition((int) (short) 0, 100);
        statisticalBarRenderer5.setNegativeItemLabelPositionFallback(itemLabelPosition31);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator34 = statisticalBarRenderer33.getLegendItemURLGenerator();
        statisticalBarRenderer33.setIncludeBaseInRange(false);
        java.awt.Paint paint38 = statisticalBarRenderer33.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint39 = statisticalBarRenderer33.getBasePaint();
        java.awt.Stroke stroke42 = statisticalBarRenderer33.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer5.setBaseOutlineStroke(stroke42, false);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke42, false);
        java.awt.Stroke stroke49 = statisticalBarRenderer0.getItemOutlineStroke(10, (int) (short) -1);
        double double50 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Paint paint52 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator53 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 0, categoryItemLabelGenerator56);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator34);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertNull(paint52);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setBase((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer35.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer37.getLegendItemURLGenerator();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint39);
        statisticalBarRenderer35.setBaseItemLabelPaint(paint39, true);
        java.awt.Shape shape44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer35.setSeriesShape(1, shape44);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = null;
        statisticalBarRenderer35.setLegendItemURLGenerator(categorySeriesLabelGenerator46);
        statisticalBarRenderer35.setBase((double) 0L);
        java.awt.Shape shape50 = statisticalBarRenderer35.getBaseShape();
        statisticalBarRenderer0.setSeriesShape(0, shape50, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 1.0f);
        java.util.EventListener eventListener55 = null;
        boolean boolean56 = statisticalBarRenderer0.hasListener(eventListener55);
        java.awt.Font font58 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) -1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(font58);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator59);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBase((double) 0L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer15.getLegendItemURLGenerator();
        statisticalBarRenderer15.setIncludeBaseInRange(false);
        java.awt.Paint paint20 = statisticalBarRenderer15.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke21);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer15.getPositiveItemLabelPosition((int) (short) 0, (int) (short) -1);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition25);
        java.lang.Boolean boolean28 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (byte) -1);
        java.awt.Font font31 = statisticalBarRenderer0.getItemLabelFont(10, (int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = statisticalBarRenderer32.getLegendItemURLGenerator();
        java.awt.Paint paint34 = statisticalBarRenderer32.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = null;
        statisticalBarRenderer32.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator36);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = statisticalBarRenderer38.getLegendItemURLGenerator();
        int int40 = statisticalBarRenderer38.getRowCount();
        java.awt.Font font42 = statisticalBarRenderer38.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean43 = statisticalBarRenderer38.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = statisticalBarRenderer38.getSeriesItemLabelGenerator((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = statisticalBarRenderer38.getSeriesItemLabelGenerator((int) (byte) 0);
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer38.setBaseOutlineStroke(stroke48);
        statisticalBarRenderer32.setBaseStroke(stroke48);
        statisticalBarRenderer32.setIncludeBaseInRange(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = statisticalBarRenderer53.getLegendItemURLGenerator();
        statisticalBarRenderer53.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = null;
        statisticalBarRenderer53.setBaseItemLabelGenerator(categoryItemLabelGenerator57);
        java.awt.Stroke stroke60 = statisticalBarRenderer53.getSeriesOutlineStroke((int) (short) -1);
        boolean boolean61 = statisticalBarRenderer53.getBaseSeriesVisible();
        double double62 = statisticalBarRenderer53.getLowerClip();
        java.awt.Stroke stroke65 = statisticalBarRenderer53.getItemOutlineStroke((int) (short) -1, (int) (byte) -1);
        statisticalBarRenderer32.setBaseStroke(stroke65);
        java.awt.Paint paint67 = statisticalBarRenderer32.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint67);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(font42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator45);
        org.junit.Assert.assertNull(categoryItemLabelGenerator47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator54);
        org.junit.Assert.assertNull(stroke60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(paint67);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        statisticalBarRenderer16.setIncludeBaseInRange(false);
        java.awt.Paint paint21 = statisticalBarRenderer16.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint22 = statisticalBarRenderer16.getBasePaint();
        java.awt.Stroke stroke25 = statisticalBarRenderer16.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke25);
        java.awt.Paint paint29 = statisticalBarRenderer0.getItemOutlinePaint(0, 0);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true, false);
        java.awt.Paint paint35 = statisticalBarRenderer0.getSeriesPaint((int) (short) -1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(paint35);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        boolean boolean17 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator18, false);
        java.awt.Shape shape22 = statisticalBarRenderer0.getSeriesShape((int) (byte) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        boolean boolean26 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator6);
        boolean boolean9 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) 'a');
        org.jfree.chart.LegendItem legendItem12 = statisticalBarRenderer0.getLegendItem(0, (int) (byte) 1);
        double double13 = statisticalBarRenderer0.getMinimumBarLength();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(legendItem12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        statisticalBarRenderer0.setSeriesVisibleInLegend(1, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 100, categoryItemLabelGenerator12, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator15);
        boolean boolean18 = statisticalBarRenderer0.isSeriesVisibleInLegend(10);
        java.awt.Paint paint20 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) '4');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer9.getLegendItemURLGenerator();
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        statisticalBarRenderer9.setBaseItemLabelGenerator(categoryItemLabelGenerator13);
        boolean boolean15 = statisticalBarRenderer9.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer17.getBaseItemLabelGenerator();
        java.awt.Font font21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer17.setSeriesItemLabelFont((int) ' ', font21, true);
        statisticalBarRenderer9.setSeriesItemLabelFont((int) (byte) 1, font21);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (short) 100, font21, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer27.setSeriesVisible(10, (java.lang.Boolean) true);
        java.awt.Font font33 = statisticalBarRenderer27.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Shape shape34 = statisticalBarRenderer27.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape34);
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.plot.Marker marker39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D36, categoryPlot37, valueAxis38, marker39, rectangle2D40);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer42.getLegendItemURLGenerator();
        java.awt.Paint paint44 = statisticalBarRenderer42.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = null;
        statisticalBarRenderer42.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator46);
        statisticalBarRenderer42.setBaseCreateEntities(true, false);
        statisticalBarRenderer42.setBase((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator55 = statisticalBarRenderer54.getLegendItemURLGenerator();
        java.awt.Paint paint56 = statisticalBarRenderer54.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = null;
        statisticalBarRenderer54.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator58);
        statisticalBarRenderer54.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer64 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator65 = statisticalBarRenderer64.getLegendItemURLGenerator();
        statisticalBarRenderer64.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint68 = statisticalBarRenderer64.getBaseItemLabelPaint();
        statisticalBarRenderer64.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer72 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator73 = statisticalBarRenderer72.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer74 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator75 = statisticalBarRenderer74.getLegendItemURLGenerator();
        java.awt.Paint paint76 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer74.setBaseFillPaint(paint76);
        statisticalBarRenderer72.setBaseItemLabelPaint(paint76, true);
        java.awt.Shape shape81 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer72.setSeriesShape(1, shape81);
        statisticalBarRenderer64.setBaseShape(shape81, true);
        java.awt.Stroke stroke85 = statisticalBarRenderer64.getBaseStroke();
        statisticalBarRenderer54.setSeriesOutlineStroke((int) '4', stroke85);
        statisticalBarRenderer42.setSeriesStroke((int) (short) 100, stroke85);
        java.awt.Shape shape88 = statisticalBarRenderer42.getBaseShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition90 = statisticalBarRenderer42.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition90, true);
        boolean boolean93 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator65);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator73);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator75);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(shape81);
        org.junit.Assert.assertNotNull(stroke85);
        org.junit.Assert.assertNotNull(shape88);
        org.junit.Assert.assertNotNull(itemLabelPosition90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        java.awt.Paint paint10 = statisticalBarRenderer8.getBaseFillPaint();
        boolean boolean11 = statisticalBarRenderer0.equals((java.lang.Object) paint10);
        java.lang.Object obj12 = statisticalBarRenderer0.clone();
        java.awt.Paint paint15 = statisticalBarRenderer0.getItemFillPaint((int) (short) -1, (int) ' ');
        statisticalBarRenderer0.setMinimumBarLength(0.2d);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(itemLabelPosition18);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        double double32 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setMinimumBarLength((double) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int2 = statisticalBarRenderer0.getRowCount();
        java.awt.Font font4 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 1);
        statisticalBarRenderer0.setMinimumBarLength(100.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer7.getLegendItemURLGenerator();
        statisticalBarRenderer7.setIncludeBaseInRange(false);
        java.awt.Paint paint12 = statisticalBarRenderer7.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer7.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer7.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer7.getSeriesItemLabelGenerator((int) (byte) 0);
        statisticalBarRenderer7.setAutoPopulateSeriesShape(false);
        java.awt.Stroke stroke24 = statisticalBarRenderer7.getItemStroke(1, (-1));
        statisticalBarRenderer0.setBaseStroke(stroke24, true);
        boolean boolean27 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        boolean boolean30 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean32 = statisticalBarRenderer0.isSeriesVisible((int) (short) 100);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(font4);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator4);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        statisticalBarRenderer0.setBase((double) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer12.getLegendItemURLGenerator();
        java.awt.Paint paint14 = statisticalBarRenderer12.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer12.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator16);
        statisticalBarRenderer12.setBaseCreateEntities(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = statisticalBarRenderer22.getLegendItemURLGenerator();
        statisticalBarRenderer22.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Paint paint26 = statisticalBarRenderer22.getBaseItemLabelPaint();
        statisticalBarRenderer22.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer30.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = statisticalBarRenderer32.getLegendItemURLGenerator();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer32.setBaseFillPaint(paint34);
        statisticalBarRenderer30.setBaseItemLabelPaint(paint34, true);
        java.awt.Shape shape39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer30.setSeriesShape(1, shape39);
        statisticalBarRenderer22.setBaseShape(shape39, true);
        java.awt.Stroke stroke43 = statisticalBarRenderer22.getBaseStroke();
        statisticalBarRenderer12.setSeriesOutlineStroke((int) '4', stroke43);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke43);
        boolean boolean46 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer47.setSeriesVisible(10, (java.lang.Boolean) true);
        java.awt.Font font53 = statisticalBarRenderer47.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Shape shape54 = statisticalBarRenderer47.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator57 = statisticalBarRenderer56.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = statisticalBarRenderer58.getLegendItemURLGenerator();
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer58.setBaseFillPaint(paint60);
        statisticalBarRenderer56.setBaseItemLabelPaint(paint60, true);
        java.awt.Shape shape65 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer56.setSeriesShape(1, shape65);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator67 = null;
        statisticalBarRenderer56.setLegendItemURLGenerator(categorySeriesLabelGenerator67);
        statisticalBarRenderer56.setBaseSeriesVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = statisticalBarRenderer56.getBasePositiveItemLabelPosition();
        statisticalBarRenderer47.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition71, false);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition71);
        java.awt.Paint paint75 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 0, (java.lang.Boolean) true);
        boolean boolean80 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) ' ');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(shape54);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator57);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator59);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(shape65);
        org.junit.Assert.assertNotNull(itemLabelPosition71);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesItemLabelsVisible(100);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator9);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator14);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer16 = statisticalBarRenderer0.getGradientPaintTransformer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) true, false);
        java.awt.Paint paint25 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 100);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.removeChangeListener(rendererChangeListener26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(gradientPaintTransformer16);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (byte) 100, (java.lang.Boolean) true);
        statisticalBarRenderer0.setItemMargin((double) (-1.0f));
        java.awt.Paint paint9 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = statisticalBarRenderer0.getSeriesOutlinePaint((-1));
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer25.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer25.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer17.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition29);
        java.awt.Paint paint32 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setBase((double) 0.0f);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = statisticalBarRenderer36.getLegendItemURLGenerator();
        statisticalBarRenderer36.setIncludeBaseInRange(false);
        java.awt.Paint paint41 = statisticalBarRenderer36.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint42 = statisticalBarRenderer36.getBasePaint();
        java.awt.Stroke stroke45 = statisticalBarRenderer36.getItemStroke((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 1, stroke45);
        java.awt.Stroke stroke47 = statisticalBarRenderer0.getErrorIndicatorStroke();
        java.awt.Paint paint48 = statisticalBarRenderer0.getBaseOutlinePaint();
        java.awt.Paint paint50 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNull(paint50);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        boolean boolean6 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (short) 0);
        boolean boolean7 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator8);
        java.awt.Font font10 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = statisticalBarRenderer0.getSeriesURLGenerator((int) '4');
        java.awt.Stroke stroke13 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Font font8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer10.getLegendItemURLGenerator();
        statisticalBarRenderer10.setIncludeBaseInRange(false);
        java.awt.Paint paint15 = statisticalBarRenderer10.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint16 = statisticalBarRenderer10.getBasePaint();
        java.awt.Stroke stroke19 = statisticalBarRenderer10.getItemStroke((int) (byte) 10, (int) (short) 10);
        boolean boolean20 = statisticalBarRenderer0.equals((java.lang.Object) (byte) 10);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.lang.Object obj25 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer4.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer6.getLegendItemURLGenerator();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint8);
        statisticalBarRenderer4.setBaseItemLabelPaint(paint8, true);
        statisticalBarRenderer0.setBaseFillPaint(paint8, true);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer0.hasListener(eventListener14);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getItemOutlineStroke((int) '4', (int) (byte) 10);
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = statisticalBarRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer2.setBaseFillPaint(paint4);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint4, true);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape(1, shape9);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        statisticalBarRenderer0.setSeriesVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        int int19 = statisticalBarRenderer17.getRowCount();
        java.awt.Font font21 = statisticalBarRenderer17.getSeriesItemLabelFont((int) (short) 1);
        boolean boolean22 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer17.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Paint paint27 = statisticalBarRenderer17.getItemFillPaint((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setBasePaint(paint27);
        boolean boolean30 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke34 = statisticalBarRenderer0.getItemStroke((int) (short) 100, (int) (byte) 100);
        statisticalBarRenderer0.setItemMargin((double) 10L);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint2);
        double double4 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Paint paint7 = statisticalBarRenderer0.lookupSeriesFillPaint(100);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setBaseSeriesVisible(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer17.getLegendItemURLGenerator();
        statisticalBarRenderer17.setIncludeBaseInRange(false);
        java.awt.Paint paint22 = statisticalBarRenderer17.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer17.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer17.getNegativeItemLabelPosition((int) (byte) 10, 0);
        statisticalBarRenderer12.setSeriesNegativeItemLabelPosition((int) (short) 1, itemLabelPosition30);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 100, itemLabelPosition30);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator34, false);
        boolean boolean37 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (byte) 10, 0);
        boolean boolean14 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        double double21 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '4');
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer8.getLegendItemURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer8.getPositiveItemLabelPosition((int) 'a', 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer16.getLegendItemURLGenerator();
        statisticalBarRenderer16.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer19 = statisticalBarRenderer16.getGradientPaintTransformer();
        double double20 = statisticalBarRenderer16.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer21.getLegendItemURLGenerator();
        statisticalBarRenderer21.setIncludeBaseInRange(false);
        java.awt.Paint paint26 = statisticalBarRenderer21.getSeriesOutlinePaint((int) '4');
        java.awt.Paint paint27 = statisticalBarRenderer21.getBasePaint();
        java.awt.Stroke stroke30 = statisticalBarRenderer21.getItemStroke((int) (byte) 10, (int) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer21.getNegativeItemLabelPosition((int) (short) 0, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = statisticalBarRenderer34.getLegendItemURLGenerator();
        statisticalBarRenderer34.setIncludeBaseInRange(false);
        java.awt.Paint paint39 = statisticalBarRenderer34.getSeriesOutlinePaint((int) '4');
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer34.setBaseOutlineStroke(stroke40);
        statisticalBarRenderer21.setBaseStroke(stroke40);
        statisticalBarRenderer16.setErrorIndicatorStroke(stroke40);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke40);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition48 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = statisticalBarRenderer49.getLegendItemURLGenerator();
        java.awt.Paint paint51 = statisticalBarRenderer49.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator53 = null;
        statisticalBarRenderer49.setSeriesItemLabelGenerator((int) (byte) 10, categoryItemLabelGenerator53);
        statisticalBarRenderer49.setBaseCreateEntities(true, false);
        java.awt.Shape shape58 = statisticalBarRenderer49.getBaseShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator59 = null;
        statisticalBarRenderer49.setBaseURLGenerator(categoryURLGenerator59, true);
        java.awt.Paint paint63 = statisticalBarRenderer49.lookupSeriesFillPaint((int) (short) 10);
        statisticalBarRenderer0.setBaseOutlinePaint(paint63, true);
        boolean boolean66 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNotNull(gradientPaintTransformer19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator35);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNull(itemLabelPosition48);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(shape58);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) true);
        java.awt.Font font6 = statisticalBarRenderer0.getItemLabelFont((int) (short) 100, (int) (byte) 1);
        java.awt.Shape shape7 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = statisticalBarRenderer9.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint13);
        statisticalBarRenderer9.setBaseItemLabelPaint(paint13, true);
        java.awt.Shape shape18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer9.setSeriesShape(1, shape18);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = null;
        statisticalBarRenderer9.setLegendItemURLGenerator(categorySeriesLabelGenerator20);
        statisticalBarRenderer9.setBaseSeriesVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer9.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition24, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(1, categoryURLGenerator28);
        java.lang.Object obj30 = statisticalBarRenderer0.clone();
        java.awt.Stroke stroke31 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator1 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = statisticalBarRenderer0.getGradientPaintTransformer();
        double double4 = statisticalBarRenderer0.getMinimumBarLength();
        int int5 = statisticalBarRenderer0.getRowCount();
        boolean boolean8 = statisticalBarRenderer0.getItemVisible((int) '4', (int) 'a');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = statisticalBarRenderer0.getURLGenerator((int) '#', (int) (byte) 1);
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (byte) 100);
        java.lang.Boolean boolean15 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator1);
        org.junit.Assert.assertNotNull(gradientPaintTransformer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryURLGenerator11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(boolean15);
    }
}

