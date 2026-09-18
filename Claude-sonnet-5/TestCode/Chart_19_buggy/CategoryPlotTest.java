import org.jfree.chart.plot.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.SortOrder;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetChangeEvent;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class CategoryPlotTest {

    private DefaultCategoryDataset dataset;
    private CategoryAxis domainAxis;
    private NumberAxis rangeAxis;
    private BarRenderer renderer;
    private CategoryPlot plot;

    @Before
    public void setUp() {
        dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        dataset.addValue(3.0, "R2", "C1");
        dataset.addValue(4.0, "R2", "C2");

        domainAxis = new CategoryAxis("Category");
        rangeAxis = new NumberAxis("Value");
        renderer = new BarRenderer();

        plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor() {
        CategoryPlot p = new CategoryPlot();
        assertNull(p.getDataset());
        assertNull(p.getDomainAxis());
        assertNull(p.getRenderer());
    }

    @Test
    public void testParameterizedConstructor() {
        assertSame(dataset, plot.getDataset());
        assertSame(domainAxis, plot.getDomainAxis());
        assertSame(rangeAxis, plot.getRangeAxis());
        assertSame(renderer, plot.getRenderer());
    }

    // ---------- getPlotType ----------

    @Test
    public void testGetPlotType() {
        assertNotNull(plot.getPlotType());
    }

    // ---------- orientation ----------

    @Test
    public void testOrientationGetSet() {
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOrientationNullException() {
        plot.setOrientation(null);
    }

    // ---------- axisOffset ----------

    @Test
    public void testAxisOffsetGetSet() {
        RectangleInsets insets = new RectangleInsets(1.0, 1.0, 1.0, 1.0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAxisOffsetNullException() {
        plot.setAxisOffset(null);
    }

    // ---------- domain axis ----------

    @Test
    public void testDomainAxisGetSetByIndex() {
        CategoryAxis newAxis = new CategoryAxis("New");
        plot.setDomainAxis(0, newAxis);
        assertSame(newAxis, plot.getDomainAxis(0));
    }

    @Test
    public void testDomainAxisIndexNotFoundReturnsNull() {
        assertNull(plot.getDomainAxis(5));
    }

    @Test
    public void testSetDomainAxes() {
        CategoryAxis a1 = new CategoryAxis("A1");
        CategoryAxis a2 = new CategoryAxis("A2");
        plot.setDomainAxes(new CategoryAxis[] {a1, a2});
        assertSame(a1, plot.getDomainAxis(0));
        assertSame(a2, plot.getDomainAxis(1));
    }

    @Test
    public void testGetDomainAxisIndex() {
        assertEquals(0, plot.getDomainAxisIndex(domainAxis));
    }

    // ---------- domain axis location ----------

    @Test
    public void testDomainAxisLocationGetSet() {
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainAxisLocationNullExceptionIndex0() {
        plot.setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testDomainAxisEdge() {
        RectangleEdge edge = plot.getDomainAxisEdge();
        assertNotNull(edge);
    }

    // ---------- domain axis count / clear ----------

    @Test
    public void testDomainAxisCountAndClear() {
        assertEquals(1, plot.getDomainAxisCount());
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxes() {
        plot.configureDomainAxes();
        assertNotNull(plot.getDomainAxis());
    }

    // ---------- range axis ----------

    @Test
    public void testRangeAxisGetSetByIndex() {
        NumberAxis newAxis = new NumberAxis("New");
        plot.setRangeAxis(0, newAxis);
        assertSame(newAxis, plot.getRangeAxis(0));
    }

    @Test
    public void testSetRangeAxes() {
        NumberAxis a1 = new NumberAxis("A1");
        NumberAxis a2 = new NumberAxis("A2");
        plot.setRangeAxes(new ValueAxis[] {a1, a2});
        assertSame(a1, plot.getRangeAxis(0));
        assertSame(a2, plot.getRangeAxis(1));
    }

    @Test
    public void testGetRangeAxisIndex() {
        assertEquals(0, plot.getRangeAxisIndex(rangeAxis));
    }

    @Test
    public void testRangeAxisLocationGetSet() {
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeAxisLocationNullException() {
        plot.setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testRangeAxisEdge() {
        RectangleEdge edge = plot.getRangeAxisEdge();
        assertNotNull(edge);
    }

    @Test
    public void testRangeAxisCountAndClear() {
        assertEquals(1, plot.getRangeAxisCount());
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxes() {
        plot.configureRangeAxes();
        assertNotNull(plot.getRangeAxis());
    }

    // ---------- dataset ----------

    @Test
    public void testDatasetGetSet() {
        DefaultCategoryDataset ds2 = new DefaultCategoryDataset();
        plot.setDataset(ds2);
        assertSame(ds2, plot.getDataset());
    }

    @Test
    public void testDatasetCount() {
        assertEquals(1, plot.getDatasetCount());
    }

    // ---------- dataset to axis mapping ----------

    @Test
    public void testMapDatasetToDomainAxis() {
        CategoryAxis a1 = new CategoryAxis("A1");
        plot.setDomainAxis(1, a1);
        plot.mapDatasetToDomainAxis(0, 1);
        assertSame(a1, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testGetDomainAxisForDatasetDefault() {
        assertSame(domainAxis, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToRangeAxis() {
        NumberAxis a1 = new NumberAxis("A1");
        plot.setRangeAxis(1, a1);
        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(a1, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testGetRangeAxisForDatasetDefault() {
        assertSame(rangeAxis, plot.getRangeAxisForDataset(0));
    }

    // ---------- renderer ----------

    @Test
    public void testRendererGetSet() {
        BarRenderer r2 = new BarRenderer();
        plot.setRenderer(r2);
        assertSame(r2, plot.getRenderer());
    }

    @Test
    public void testSetRenderers() {
        BarRenderer r1 = new BarRenderer();
        BarRenderer r2 = new BarRenderer();
        plot.setRenderers(new CategoryItemRenderer[] {r1, r2});
        assertSame(r1, plot.getRenderer(0));
        assertSame(r2, plot.getRenderer(1));
    }

    @Test
    public void testGetRendererForDataset() {
        CategoryItemRenderer r = plot.getRendererForDataset(dataset);
        assertSame(renderer, r);
    }

    @Test
    public void testGetRendererForDatasetNotFound() {
        DefaultCategoryDataset other = new DefaultCategoryDataset();
        assertNull(plot.getRendererForDataset(other));
    }

    @Test
    public void testGetIndexOfRenderer() {
        assertEquals(0, plot.getIndexOf(renderer));
    }

    // ---------- rendering orders ----------

    @Test
    public void testDatasetRenderingOrder() {
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDatasetRenderingOrderNullException() {
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void testColumnRenderingOrder() {
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testColumnRenderingOrderNullException() {
        plot.setColumnRenderingOrder(null);
    }

    @Test
    public void testRowRenderingOrder() {
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRowRenderingOrderNullException() {
        plot.setRowRenderingOrder(null);
    }

    // ---------- gridlines ----------

    @Test
    public void testDomainGridlinesVisible() {
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testDomainGridlinePosition() {
        plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainGridlinePositionNullException() {
        plot.setDomainGridlinePosition(null);
    }

    @Test
    public void testDomainGridlineStroke() {
        Stroke s = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(s);
        assertSame(s, plot.getDomainGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainGridlineStrokeNullException() {
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void testDomainGridlinePaint() {
        Paint p = Color.RED;
        plot.setDomainGridlinePaint(p);
        assertSame(p, plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainGridlinePaintNullException() {
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testRangeGridlinesVisible() {
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testRangeGridlineStroke() {
        Stroke s = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(s);
        assertSame(s, plot.getRangeGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeGridlineStrokeNullException() {
        plot.setRangeGridlineStroke(null);
    }

    @Test
    public void testRangeGridlinePaint() {
        Paint p = Color.GREEN;
        plot.setRangeGridlinePaint(p);
        assertSame(p, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeGridlinePaintNullException() {
        plot.setRangeGridlinePaint(null);
    }

    // ---------- legend items ----------

    @Test
    public void testFixedLegendItems() {
        LegendItemCollection lic = new LegendItemCollection();
        plot.setFixedLegendItems(lic);
        assertSame(lic, plot.getFixedLegendItems());
        assertSame(lic, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsGenerated() {
        LegendItemCollection result = plot.getLegendItems();
        assertNotNull(result);
    }

    // ---------- handleClick ----------

    @Test
    public void testHandleClick() {
        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        plot.handleClick(50, 50, info);
        // anchor and crosshair value should be updated (no exception, value set)
        assertEquals(plot.getAnchorValue(), plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testHandleClickOutsideDataArea() {
        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        double before = plot.getAnchorValue();
        plot.handleClick(500, 500, info);
        assertEquals(before, plot.getAnchorValue(), 0.0001);
    }

    // ---------- zoom ----------

    @Test
    public void testZoomPositivePercent() {
        plot.getRangeAxis().setRange(0.0, 10.0);
        plot.setAnchorValue(5.0);
        plot.zoom(0.5);
        Range r = plot.getRangeAxis().getRange();
        assertNotNull(r);
    }

    @Test
    public void testZoomNonPositivePercent() {
        plot.getRangeAxis().setAutoRange(false);
        plot.zoom(0.0);
        assertTrue(plot.getRangeAxis().isAutoRange());
    }

    // ---------- datasetChanged / rendererChanged ----------

    @Test
    public void testDatasetChanged() {
        DatasetChangeEvent event = new DatasetChangeEvent(this, dataset);
        plot.datasetChanged(event);
        assertNotNull(plot.getRangeAxis());
    }

    @Test
    public void testRendererChanged() {
        org.jfree.chart.event.RendererChangeEvent event =
                new org.jfree.chart.event.RendererChangeEvent(renderer);
        plot.rendererChanged(event);
        assertNotNull(plot.getRenderer());
    }

    // ---------- domain markers ----------

    @Test
    public void testAddDomainMarkerForegroundAndGet() {
        CategoryMarker marker = new CategoryMarker("C1");
        plot.addDomainMarker(marker, Layer.FOREGROUND);
        java.util.Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testAddDomainMarkerBackgroundAndGet() {
        CategoryMarker marker = new CategoryMarker("C2");
        plot.addDomainMarker(marker, Layer.BACKGROUND);
        java.util.Collection markers = plot.getDomainMarkers(Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarkerNullMarkerException() {
        plot.addDomainMarker(0, null, Layer.FOREGROUND);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarkerNullLayerException() {
        CategoryMarker marker = new CategoryMarker("C1");
        plot.addDomainMarker(0, marker, null);
    }

    @Test
    public void testClearDomainMarkers() {
        CategoryMarker marker = new CategoryMarker("C1");
        plot.addDomainMarker(marker, Layer.FOREGROUND);
        plot.clearDomainMarkers();
        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testClearDomainMarkersByIndex() {
        CategoryMarker marker = new CategoryMarker("C1");
        plot.addDomainMarker(0, marker, Layer.FOREGROUND);
        plot.clearDomainMarkers(0);
        java.util.Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    // ---------- range markers ----------

    @Test
    public void testAddRangeMarkerForegroundAndGet() {
        ValueMarker marker = new ValueMarker(5.0);
        plot.addRangeMarker(marker, Layer.FOREGROUND);
        java.util.Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testAddRangeMarkerBackgroundAndGet() {
        ValueMarker marker = new ValueMarker(7.0);
        plot.addRangeMarker(marker, Layer.BACKGROUND);
        java.util.Collection markers = plot.getRangeMarkers(Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testClearRangeMarkers() {
        plot.clearRangeMarkers();
        assertNull(plot.getRangeMarkers(Layer.BACKGROUND));
    }

    @Test
    public void testClearRangeMarkersByIndex() {
        ValueMarker marker = new ValueMarker(1.0);
        plot.addRangeMarker(0, marker, Layer.FOREGROUND);
        plot.clearRangeMarkers(0);
        java.util.Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    // ---------- crosshair ----------

    @Test
    public void testRangeCrosshairVisible() {
        assertFalse(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testRangeCrosshairLockedOnData() {
        assertTrue(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testRangeCrosshairValue() {
        plot.setRangeCrosshairValue(9.0);
        assertEquals(9.0, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testRangeCrosshairStroke() {
        Stroke s = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(s);
        assertSame(s, plot.getRangeCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeCrosshairStrokeNullException() {
        plot.setRangeCrosshairStroke(null);
    }

    @Test
    public void testRangeCrosshairPaint() {
        Paint p = Color.MAGENTA;
        plot.setRangeCrosshairPaint(p);
        assertSame(p, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeCrosshairPaintNullException() {
        plot.setRangeCrosshairPaint(null);
    }

    // ---------- annotations ----------

    @Test
    public void testAnnotationsAddRemoveClear() {
        assertTrue(plot.getAnnotations().isEmpty());
        org.jfree.chart.annotations.CategoryTextAnnotation ann =
                new org.jfree.chart.annotations.CategoryTextAnnotation(
                        "Hello", "C1", 1.0);
        plot.addAnnotation(ann);
        assertEquals(1, plot.getAnnotations().size());
        boolean removed = plot.removeAnnotation(ann);
        assertTrue(removed);
        assertTrue(plot.getAnnotations().isEmpty());
        plot.addAnnotation(ann);
        plot.clearAnnotations();
        assertTrue(plot.getAnnotations().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationNullException() {
        plot.addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotationNullException() {
        plot.removeAnnotation(null);
    }

    @Test
    public void testRemoveAnnotationNotPresent() {
        org.jfree.chart.annotations.CategoryTextAnnotation ann =
                new org.jfree.chart.annotations.CategoryTextAnnotation(
                        "Hello", "C1", 1.0);
        assertFalse(plot.removeAnnotation(ann));
    }

    // ---------- draw ----------

    @Test
    public void testDraw() {
        BufferedImage img = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
        // no exception means success; verify data still consistent
        assertNotNull(plot.getDataset());
    }

    @Test
    public void testDrawTooSmallArea() {
        BufferedImage img = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 0, 0);
        plot.draw(g2, area, null, null, null);
        g2.dispose();
        assertNotNull(plot.getDataset());
    }

    // ---------- getDataRange ----------

    @Test
    public void testGetDataRange() {
        Range r = plot.getDataRange(rangeAxis);
        assertNotNull(r);
        assertTrue(r.getUpperBound() >= 4.0);
    }

    @Test
    public void testGetDataRangeUnrelatedAxis() {
        NumberAxis unrelated = new NumberAxis("Unrelated");
        Range r = plot.getDataRange(unrelated);
        assertNull(r);
    }

    // ---------- weight ----------

    @Test
    public void testWeight() {
        plot.setWeight(3);
        assertEquals(3, plot.getWeight());
    }

    // ---------- fixed spaces ----------

    @Test
    public void testFixedDomainAxisSpace() {
        AxisSpace space = new AxisSpace();
        plot.setFixedDomainAxisSpace(space);
        assertSame(space, plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testFixedRangeAxisSpace() {
        AxisSpace space = new AxisSpace();
        plot.setFixedRangeAxisSpace(space);
        assertSame(space, plot.getFixedRangeAxisSpace());
    }

    // ---------- categories ----------

    @Test
    public void testGetCategories() {
        List cats = plot.getCategories();
        assertNotNull(cats);
        assertEquals(2, cats.size());
    }

    @Test
    public void testGetCategoriesNullDataset() {
        CategoryPlot p = new CategoryPlot();
        assertNull(p.getCategories());
    }

    @Test
    public void testGetCategoriesForAxis() {
        List cats = plot.getCategoriesForAxis(plot.getDomainAxis(0));
        assertNotNull(cats);
        assertEquals(2, cats.size());
    }

    @Test
    public void testGetCategoriesForAxisNotMapped() {
        CategoryAxis other = new CategoryAxis("Other");
        List cats = plot.getCategoriesForAxis(other);
        assertNotNull(cats);
        assertTrue(cats.isEmpty());
    }

    // ---------- drawSharedDomainAxis ----------

    @Test
    public void testDrawSharedDomainAxis() {
        assertFalse(plot.getDrawSharedDomainAxis());
        plot.setDrawSharedDomainAxis(true);
        assertTrue(plot.getDrawSharedDomainAxis());
    }

    // ---------- zoomable ----------

    @Test
    public void testIsDomainZoomable() {
        assertFalse(plot.isDomainZoomable());
    }

    @Test
    public void testIsRangeZoomable() {
        assertTrue(plot.isRangeZoomable());
    }

    @Test
    public void testZoomDomainAxesNoOp() {
        plot.zoomDomainAxes(0.5, null, null);
        plot.zoomDomainAxes(0.2, 0.8, null, null);
        plot.zoomDomainAxes(0.5, null, null, true);
        // no exceptions thrown, domain axis unaffected
        assertNotNull(plot.getDomainAxis());
    }

    @Test
    public void testZoomRangeAxesFactor() {
        plot.getRangeAxis().setRange(0.0, 10.0);
        plot.zoomRangeAxes(0.5, (PlotRenderingInfo) null, (Point2D) null);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesFactorWithAnchor() {
        plot.getRangeAxis().setRange(0.0, 10.0);
        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        Point2D source = new Point2D.Double(50, 50);
        plot.zoomRangeAxes(0.5, info, source, true);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesPercent() {
        plot.getRangeAxis().setRange(0.0, 10.0);
        plot.zoomRangeAxes(0.2, 0.8, null, null);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    // ---------- anchor value ----------

    @Test
    public void testAnchorValue() {
        plot.setAnchorValue(3.5);
        assertEquals(3.5, plot.getAnchorValue(), 0.0001);
    }

    @Test
    public void testAnchorValueNoNotify() {
        plot.setAnchorValue(4.5, false);
        assertEquals(4.5, plot.getAnchorValue(), 0.0001);
    }

    // ---------- equals ----------

    @Test
    public void testEqualsSameInstance() {
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsDifferentOrientation() {
        CategoryPlot other = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        other.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(plot.equals(other));
    }

    // ---------- clone ----------

    @Test
    public void testClone() throws Exception {
        CategoryPlot clone = (CategoryPlot) plot.clone();
        assertNotSame(plot, clone);
        assertEquals(plot.getOrientation(), clone.getOrientation());
        assertNotSame(plot.getDomainAxis(), clone.getDomainAxis());
        assertNotSame(plot.getRangeAxis(), clone.getRangeAxis());
    }

    // ---------- serialization ----------

    @Test
    public void testSerialization() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(plot);
        oos.close();

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(in);
        CategoryPlot restored = (CategoryPlot) ois.readObject();
        ois.close();

        assertNotNull(restored);
        assertEquals(plot.getOrientation(), restored.getOrientation());
        assertEquals(plot.getDomainGridlinePaint(),
                restored.getDomainGridlinePaint());
    }
}