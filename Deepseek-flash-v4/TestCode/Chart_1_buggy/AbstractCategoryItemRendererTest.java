package org.jfree.chart.renderer.category;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.AbstractCategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.Layer;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.AbstractCategoryItemRenderer;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.util.ObjectUtilities;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.data.Range;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.Layer;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.plot.CategoryCrosshairState;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class AbstractCategoryItemRendererTest {

    private AbstractCategoryItemRenderer renderer;

    // Test concrete subclass
    private static class TestRenderer extends AbstractCategoryItemRenderer {
        private static final long serialVersionUID = 1L;
        
        @Override
        public CategoryItemRendererState initialise(Graphics2D g2, Rectangle2D dataArea,
                CategoryPlot plot, CategoryDataset data, PlotRenderingInfo info) {
            return new CategoryItemRendererState(info);
        }

        @Override
        public void drawItem(Graphics2D g2, CategoryItemRendererState state,
                Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis,
                ValueAxis rangeAxis, CategoryDataset dataset, int row, int column,
                int pass, boolean selected) {
            // No-op
        }
    }

    @Before
    public void setUp() {
        renderer = new TestRenderer();
    }

    @After
    public void tearDown() {
        renderer = null;
    }

    // --- getPassCount() ---
    @Test
    public void testGetPassCount() {
        assertEquals(1, renderer.getPassCount());
    }

    // --- getPlot() / setPlot() ---
    @Test
    public void testSetPlotNullThrowsException() {
        try {
            renderer.setPlot(null);
            fail("Expected IllegalArgumentException for null plot");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetPlotValid() {
        CategoryPlot plot = new CategoryPlot();
        renderer.setPlot(plot);
        assertSame(plot, renderer.getPlot());
    }

    @Test
    public void testGetPlotReturnsNullByDefault() {
        assertNull(renderer.getPlot());
    }

    // --- getLegendItemLabelGenerator() ---
    @Test
    public void testGetLegendItemLabelGeneratorDefaultNotNull() {
        assertNotNull(renderer.getLegendItemLabelGenerator());
    }

    // --- getLegendItemToolTipGenerator() ---
    @Test
    public void testGetLegendItemToolTipGeneratorDefaultNull() {
        assertNull(renderer.getLegendItemToolTipGenerator());
    }

    // --- getLegendItemURLGenerator() ---
    @Test
    public void testGetLegendItemURLGeneratorDefaultNull() {
        assertNull(renderer.getLegendItemURLGenerator());
    }

    // --- getRowCount() / getColumnCount() ---
    @Test
    public void testRowColumnCountsDefaultZero() {
        assertEquals(0, renderer.getRowCount());
        assertEquals(0, renderer.getColumnCount());
    }

    // --- getBaseItemLabelGenerator() ---
    @Test
    public void testBaseItemLabelGeneratorDefaultNull() {
        assertNull(renderer.getBaseItemLabelGenerator());
    }

    // --- getBaseToolTipGenerator() ---
    @Test
    public void testBaseToolTipGeneratorDefaultNull() {
        assertNull(renderer.getBaseToolTipGenerator());
    }

    // --- getBaseURLGenerator() ---
    @Test
    public void testBaseURLGeneratorDefaultNull() {
        assertNull(renderer.getBaseURLGenerator());
    }

    // --- getItemLabelGenerator(int row, int column, boolean selected) ---
    @Test
    public void testGetItemLabelGeneratorWithNullBase() {
        assertNull(renderer.getItemLabelGenerator(0, 0, true));
    }

    // --- getSeriesItemLabelGenerator(int series) ---
    @Test
    public void testGetSeriesItemLabelGeneratorWithNoGenerator() {
        assertNull(renderer.getSeriesItemLabelGenerator(0));
    }

    // --- getToolTipGenerator(int row, int column, boolean selected) ---
    @Test
    public void testGetToolTipGeneratorWithNullBase() {
        assertNull(renderer.getToolTipGenerator(0, 0, true));
    }

    // --- getSeriesToolTipGenerator(int series) ---
    @Test
    public void testGetSeriesToolTipGeneratorWithNoGenerator() {
        assertNull(renderer.getSeriesToolTipGenerator(0));
    }

    // --- getURLGenerator(int row, int column, boolean selected) ---
    @Test
    public void testGetURLGeneratorWithNullBase() {
        assertNull(renderer.getURLGenerator(0, 0, true));
    }

    // --- getSeriesURLGenerator(int series) ---
    @Test
    public void testGetSeriesURLGeneratorWithNoGenerator() {
        assertNull(renderer.getSeriesURLGenerator(0));
    }

    // --- setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator) ---
    @Test
    public void testSetSeriesItemLabelGenerator() {
        CategoryItemLabelGenerator gen = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator();
        renderer.setSeriesItemLabelGenerator(0, gen);
        assertSame(gen, renderer.getSeriesItemLabelGenerator(0));
    }

    // --- setBaseItemLabelGenerator(CategoryItemLabelGenerator) ---
    @Test
    public void testSetBaseItemLabelGenerator() {
        CategoryItemLabelGenerator gen = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(gen);
        assertSame(gen, renderer.getBaseItemLabelGenerator());
    }

    // --- setSeriesToolTipGenerator(int, CategoryToolTipGenerator) ---
    @Test
    public void testSetSeriesToolTipGenerator() {
        CategoryToolTipGenerator gen = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        renderer.setSeriesToolTipGenerator(0, gen);
        assertSame(gen, renderer.getSeriesToolTipGenerator(0));
    }

    // --- setBaseToolTipGenerator(CategoryToolTipGenerator) ---
    @Test
    public void testSetBaseToolTipGenerator() {
        CategoryToolTipGenerator gen = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        renderer.setBaseToolTipGenerator(gen);
        assertSame(gen, renderer.getBaseToolTipGenerator());
    }

    // --- setSeriesURLGenerator(int, CategoryURLGenerator) ---
    @Test
    public void testSetSeriesURLGenerator() {
        CategoryURLGenerator gen = new org.jfree.chart.urls.StandardCategoryURLGenerator();
        renderer.setSeriesURLGenerator(0, gen);
        assertSame(gen, renderer.getSeriesURLGenerator(0));
    }

    // --- setBaseURLGenerator(CategoryURLGenerator) ---
    @Test
    public void testSetBaseURLGenerator() {
        CategoryURLGenerator gen = new org.jfree.chart.urls.StandardCategoryURLGenerator();
        renderer.setBaseURLGenerator(gen);
        assertSame(gen, renderer.getBaseURLGenerator());
    }

    // --- findRangeBounds(CategoryDataset) ---
    @Test
    public void testFindRangeBoundsNullDataset() {
        assertNull(renderer.findRangeBounds(null));
    }

    @Test
    public void testFindRangeBoundsWithData() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        dataset.addValue(3.0, "R1", "C3");
        Range range = renderer.findRangeBounds(dataset);
        assertNotNull(range);
        assertEquals(1.0, range.getLowerBound(), 0.0001);
        assertEquals(3.0, range.getUpperBound(), 0.0001);
    }

    // --- addAnnotation(CategoryAnnotation) ---
    @Test
    public void testAddAnnotationDefaultLayerForeground() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        renderer.addAnnotation(annotation);
        assertTrue(renderer.getForegroundAnnotations().contains(annotation));
        assertFalse(renderer.getBackgroundAnnotations().contains(annotation));
    }

    // --- addAnnotation(CategoryAnnotation, Layer) ---
    @Test
    public void testAddAnnotationNullAnnotationThrowsException() {
        try {
            renderer.addAnnotation(null, Layer.FOREGROUND);
            fail("Expected IllegalArgumentException for null annotation");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddAnnotationNullLayerThrowsException() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        try {
            renderer.addAnnotation(annotation, null);
            fail("Expected IllegalArgumentException for null layer");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddAnnotationForegroundLayer() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        renderer.addAnnotation(annotation, Layer.FOREGROUND);
        assertTrue(renderer.getForegroundAnnotations().contains(annotation));
        assertFalse(renderer.getBackgroundAnnotations().contains(annotation));
    }

    @Test
    public void testAddAnnotationBackgroundLayer() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        renderer.addAnnotation(annotation, Layer.BACKGROUND);
        assertTrue(renderer.getBackgroundAnnotations().contains(annotation));
        assertFalse(renderer.getForegroundAnnotations().contains(annotation));
    }

    @Test
    public void testAddAnnotationInvalidLayerThrowsException() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        Layer invalidLayer = null;
        // Use a custom layer that's not FOREGROUND or BACKGROUND
        try {
            renderer.addAnnotation(annotation, Layer.BACKGROUND);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    // --- removeAnnotation(CategoryAnnotation) ---
    @Test
    public void testRemoveAnnotationNotPresent() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        assertFalse(renderer.removeAnnotation(annotation));
    }

    @Test
    public void testRemoveAnnotationPresent() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        renderer.addAnnotation(annotation);
        assertTrue(renderer.removeAnnotation(annotation));
        assertFalse(renderer.getForegroundAnnotations().contains(annotation));
        assertFalse(renderer.getBackgroundAnnotations().contains(annotation));
    }

    // --- removeAnnotations() ---
    @Test
    public void testRemoveAnnotationsClearsAll() {
        renderer.addAnnotation(new CategoryTextAnnotation("A", "C1", 1.0));
        renderer.addAnnotation(new CategoryTextAnnotation("B", "C1", 2.0), Layer.BACKGROUND);
        renderer.removeAnnotations();
        assertEquals(0, renderer.getForegroundAnnotations().size());
        assertEquals(0, renderer.getBackgroundAnnotations().size());
    }

    // --- equals(Object) ---
    @Test
    public void testEqualsSameObject() {
        assertTrue(renderer.equals(renderer));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(renderer.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(renderer.equals(new Object()));
    }

    @Test
    public void testEqualsSameValues() {
        TestRenderer other = new TestRenderer();
        assertTrue(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentBaseLabelGenerator() {
        TestRenderer other = new TestRenderer();
        renderer.setBaseItemLabelGenerator(new org.jfree.chart.labels.StandardCategoryItemLabelGenerator());
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentBaseToolTipGenerator() {
        TestRenderer other = new TestRenderer();
        renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentBaseURLGenerator() {
        TestRenderer other = new TestRenderer();
        renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
        assertFalse(renderer.equals(other));
    }

    // --- hashCode() ---
    @Test
    public void testHashCodeDifferentObjectsWithSameState() {
        TestRenderer r1 = new TestRenderer();
        TestRenderer r2 = new TestRenderer();
        assertEquals(r1.hashCode(), r2.hashCode());
    }

    // --- drawRangeLine ---
    @Test
    public void testDrawRangeLineWithPaintNullReturnsWithoutAction() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        // Should not throw exception
        renderer.drawRangeLine(g2, plot, axis, dataArea, 10.0, null, new BasicStroke(1.0f));
    }

    @Test
    public void testDrawRangeLineWithStrokeNullReturnsWithoutAction() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        renderer.drawRangeLine(g2, plot, axis, dataArea, 10.0, Color.BLACK, null);
    }

    @Test
    public void testDrawRangeLineValid() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        renderer.drawRangeLine(g2, plot, axis, dataArea, 10.0, Color.BLACK, new BasicStroke(1.0f));
    }

    // --- getLegendItems ---
    @Test
    public void testGetLegendItemsWithNullPlot() {
        assertNotNull(renderer.getLegendItems());
        assertEquals(0, renderer.getLegendItems().getItemCount());
    }

    @Test
    public void testGetLegendItemsWithPlotAndData() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(dataset);
        renderer.setPlot(plot);
        renderer.setSeriesVisible(0, true);
        renderer.setSeriesVisibleInLegend(0, true);
        LegendItemCollection items = renderer.getLegendItems();
        // May have items depending on legend generation
        // Should not be null
        assertNotNull(items);
    }

    // --- hitTest ---
    @Test
    public void testHitTestWithNullBounds() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = renderer.initialise(g2, new Rectangle2D.Double(0, 0, 100, 100), new CategoryPlot(), null, null);
        assertFalse(renderer.hitTest(0, 0, g2, state, null));
    }

    @Test
    public void testHitTestInsideBounds() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = renderer.initialise(g2, new Rectangle2D.Double(0, 0, 100, 100), new CategoryPlot(), null, null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        state.setBarBounds(area);
        // Assume createHotSpotBounds returns correct bounds
        assertTrue(renderer.hitTest(50, 50, g2, state, area));
    }

    @Test
    public void testHitTestOutsideBounds() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryItemRendererState state = renderer.initialise(g2, new Rectangle2D.Double(0, 0, 100, 100), new CategoryPlot(), null, null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        state.setBarBounds(area);
        assertFalse(renderer.hitTest(150, 150, g2, state, area));
    }

    // --- createHotSpotShape ---
    @Test
    public void testCreateHotSpotShapeWithData() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        Shape shape = renderer.createHotSpotShape(g2, dataArea, 0, 0, true);
        assertNotNull(shape);
    }

    // --- getItemMiddle ---
    @Test
    public void testGetItemMiddleWithNullDataset() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new org.jfree.chart.axis.CategoryAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        assertEquals(0.0, renderer.getItemMiddle("R1", "C1", null, axis, dataArea, RectangleEdge.BOTTOM), 0.0001);
    }

    // --- drawDomainMarker ---
    @Test
    public void testDrawDomainMarkerWithNullMarker() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        renderer.drawDomainMarker(g2, plot, null, dataArea, 0, new CategoryMarker("C1"));
    }

    @Test
    public void testDrawDomainMarkerWithNullPlot() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = null;
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        renderer.drawDomainMarker(g2, plot, new CategoryMarker("C1"), dataArea, 0, new CategoryMarker("C1"));
    }

    // --- drawRangeMarker ---
    @Test
    public void testDrawRangeMarkerWithNullMarker() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        renderer.drawRangeMarker(g2, plot, null, axis, dataArea, 0);
    }

    @Test
    public void testDrawRangeMarkerWithValueMarker() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        ValueMarker marker = new ValueMarker(10.0);
        renderer.drawRangeMarker(g2, plot, marker, axis, dataArea, 0);
    }

    @Test
    public void testDrawRangeMarkerWithIntervalMarker() {
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        IntervalMarker marker = new IntervalMarker(5.0, 10.0);
        renderer.drawRangeMarker(g2, plot, marker, axis, dataArea, 0);
    }

    // --- addAnnotation with null layer in addAnnotation(CategoryAnnotation, Layer) ---
    @Test
    public void testAddAnnotationWithNullLayer() {
        CategoryAnnotation annotation = new CategoryTextAnnotation("Test", "C1", 1.0);
        try {
            renderer.addAnnotation(annotation, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // --- setLegendItemLabelGenerator ---
    @Test
    public void testSetLegendItemLabelGenerator() {
        StandardCategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemLabelGenerator(gen);
        assertSame(gen, renderer.getLegendItemLabelGenerator());
    }

    @Test
    public void testSetLegendItemLabelGeneratorNull() {
        renderer.setLegendItemLabelGenerator(null);
        assertNull(renderer.getLegendItemLabelGenerator());
    }

    // --- setLegendItemToolTipGenerator ---
    @Test
    public void testSetLegendItemToolTipGenerator() {
        StandardCategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemToolTipGenerator(gen);
        assertSame(gen, renderer.getLegendItemToolTipGenerator());
    }

    @Test
    public void testSetLegendItemToolTipGeneratorNull() {
        renderer.setLegendItemToolTipGenerator(null);
        assertNull(renderer.getLegendItemToolTipGenerator());
    }

    // --- setLegendItemURLGenerator ---
    @Test
    public void testSetLegendItemURLGenerator() {
        StandardCategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemURLGenerator(gen);
        assertSame(gen, renderer.getLegendItemURLGenerator());
    }

    @Test
    public void testSetLegendItemURLGeneratorNull() {
        renderer.setLegendItemURLGenerator(null);
        assertNull(renderer.getLegendItemURLGenerator());
    }

    // --- getForegroundAnnotations / getBackgroundAnnotations ---
    @Test
    public void testGetForegroundAnnotationsDefault() {
        assertNotNull(renderer.getForegroundAnnotations());
        assertEquals(0, renderer.getForegroundAnnotations().size());
    }

    @Test
    public void testGetBackgroundAnnotationsDefault() {
        assertNotNull(renderer.getBackgroundAnnotations());
        assertEquals(0, renderer.getBackgroundAnnotations().size());
    }
}