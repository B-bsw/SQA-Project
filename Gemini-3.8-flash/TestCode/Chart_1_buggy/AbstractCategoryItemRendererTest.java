package org.jfree.chart.renderer.category;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.ui.TextAnchor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractCategoryItemRendererTest {

    private static class ConcreteCategoryItemRenderer extends AbstractCategoryItemRenderer {
        private static final long serialVersionUID = 1L;

        public void drawItem(Graphics2D g2, CategoryItemRendererState state,
                Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis,
                ValueAxis rangeAxis, CategoryDataset dataset, int row, int column,
                int pass) {
        }
    }

    private static class TestRendererListener implements RendererChangeListener {
        private int changeCount = 0;

        public void rendererChanged(RendererChangeEvent event) {
            this.changeCount++;
        }

        public int getChangeCount() {
            return this.changeCount;
        }

        public void reset() {
            this.changeCount = 0;
        }
    }

    private static class TestCategoryAnnotation implements CategoryAnnotation, Cloneable, Serializable {
        private static final long serialVersionUID = 1L;
        private boolean drawn = false;

        public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea,
                CategoryAxis domainAxis, ValueAxis rangeAxis, int datasetIndex,
                PlotRenderingInfo info) {
            this.drawn = true;
        }

        public boolean isDrawn() {
            return this.drawn;
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    private static class NonCloneableLabelGenerator implements CategoryItemLabelGenerator, Serializable {
        private static final long serialVersionUID = 1L;

        public String generateRowLabel(CategoryDataset dataset, int row) {
            return "row";
        }

        public String generateColumnLabel(CategoryDataset dataset, int column) {
            return "col";
        }

        public String generateLabel(CategoryDataset dataset, int row, int column) {
            return "label";
        }
    }

    private static class NonCloneableToolTipGenerator implements CategoryToolTipGenerator, Serializable {
        private static final long serialVersionUID = 1L;

        public String generateToolTip(CategoryDataset dataset, int row, int column) {
            return "tip";
        }
    }

    private static class NonCloneableURLGenerator implements CategoryURLGenerator, Serializable {
        private static final long serialVersionUID = 1L;

        public String generateURL(CategoryDataset dataset, int series, int category) {
            return "url";
        }
    }

    private ConcreteCategoryItemRenderer renderer;
    private Graphics2D g2;
    private Rectangle2D dataArea;

    @Before
    public void setUp() {
        this.renderer = new ConcreteCategoryItemRenderer();
        BufferedImage image = new BufferedImage(300, 200, BufferedImage.TYPE_INT_ARGB);
        this.g2 = image.createGraphics();
        this.dataArea = new Rectangle2D.Double(10.0, 10.0, 280.0, 180.0);
    }

    @Test
    public void getPassCount_default_shouldReturnOne() {
        Assert.assertEquals(1, this.renderer.getPassCount());
    }

    @Test
    public void setPlot_givenValidPlot_shouldStorePlot() {
        CategoryPlot plot = new CategoryPlot();
        this.renderer.setPlot(plot);
        Assert.assertSame(plot, this.renderer.getPlot());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPlot_givenNull_shouldThrowException() {
        this.renderer.setPlot(null);
    }

    @Test
    public void getItemLabelGenerator_givenSeriesSpecificAndFallback_shouldReturnExpected() {
        CategoryItemLabelGenerator gen0 = new StandardCategoryItemLabelGenerator();
        CategoryItemLabelGenerator baseGen = new StandardCategoryItemLabelGenerator();

        this.renderer.setSeriesItemLabelGenerator(0, gen0);
        this.renderer.setBaseItemLabelGenerator(baseGen);

        Assert.assertSame(gen0, this.renderer.getItemLabelGenerator(0, 0, false));
        Assert.assertSame(baseGen, this.renderer.getItemLabelGenerator(1, 0, false));
        Assert.assertSame(gen0, this.renderer.getSeriesItemLabelGenerator(0));
        Assert.assertNull(this.renderer.getSeriesItemLabelGenerator(1));
    }

    @Test
    public void setSeriesItemLabelGenerator_notifyFlag_shouldNotifyAccordingly() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator(), false);
        Assert.assertEquals(0, listener.getChangeCount());

        this.renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator(), true);
        Assert.assertEquals(1, listener.getChangeCount());

        this.renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        Assert.assertEquals(2, listener.getChangeCount());
    }

    @Test
    public void setBaseItemLabelGenerator_notifyFlag_shouldNotifyAccordingly() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator(), false);
        Assert.assertEquals(0, listener.getChangeCount());

        this.renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator(), true);
        Assert.assertEquals(1, listener.getChangeCount());

        this.renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        Assert.assertEquals(2, listener.getChangeCount());
    }

    @Test
    public void getToolTipGenerator_givenSeriesSpecificAndFallback_shouldReturnExpected() {
        CategoryToolTipGenerator gen0 = new StandardCategoryToolTipGenerator();
        CategoryToolTipGenerator baseGen = new StandardCategoryToolTipGenerator();

        this.renderer.setSeriesToolTipGenerator(0, gen0);
        this.renderer.setBaseToolTipGenerator(baseGen);

        Assert.assertSame(gen0, this.renderer.getToolTipGenerator(0, 0, false));
        Assert.assertSame(baseGen, this.renderer.getToolTipGenerator(1, 0, false));
        Assert.assertSame(gen0, this.renderer.getSeriesToolTipGenerator(0));
        Assert.assertNull(this.renderer.getSeriesToolTipGenerator(1));
    }

    @Test
    public void setSeriesToolTipGenerator_notifyFlag_shouldNotifyAccordingly() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator(), false);
        Assert.assertEquals(0, listener.getChangeCount());

        this.renderer.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator(), true);
        Assert.assertEquals(1, listener.getChangeCount());

        this.renderer.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        Assert.assertEquals(2, listener.getChangeCount());
    }

    @Test
    public void setBaseToolTipGenerator_notifyFlag_shouldNotifyAccordingly() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator(), false);
        Assert.assertEquals(0, listener.getChangeCount());

        this.renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator(), true);
        Assert.assertEquals(1, listener.getChangeCount());

        this.renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        Assert.assertEquals(2, listener.getChangeCount());
    }

    @Test
    public void getURLGenerator_givenSeriesSpecificAndFallback_shouldReturnExpected() {
        CategoryURLGenerator gen0 = new StandardCategoryURLGenerator();
        CategoryURLGenerator baseGen = new StandardCategoryURLGenerator();

        this.renderer.setSeriesURLGenerator(0, gen0);
        this.renderer.setBaseURLGenerator(baseGen);

        Assert.assertSame(gen0, this.renderer.getURLGenerator(0, 0, false));
        Assert.assertSame(baseGen, this.renderer.getURLGenerator(1, 0, false));
        Assert.assertSame(gen0, this.renderer.getSeriesURLGenerator(0));
        Assert.assertNull(this.renderer.getSeriesURLGenerator(1));
    }

    @Test
    public void setSeriesURLGenerator_notifyFlag_shouldNotifyAccordingly() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setSeriesURLGenerator(0, new StandardCategoryURLGenerator(), false);
        Assert.assertEquals(0, listener.getChangeCount());

        this.renderer.setSeriesURLGenerator(0, new StandardCategoryURLGenerator(), true);
        Assert.assertEquals(1, listener.getChangeCount());

        this.renderer.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        Assert.assertEquals(2, listener.getChangeCount());
    }

    @Test
    public void setBaseURLGenerator_notifyFlag_shouldNotifyAccordingly() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        this.renderer.setBaseURLGenerator(new StandardCategoryURLGenerator(), false);
        Assert.assertEquals(0, listener.getChangeCount());

        this.renderer.setBaseURLGenerator(new StandardCategoryURLGenerator(), true);
        Assert.assertEquals(1, listener.getChangeCount());

        this.renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());
        Assert.assertEquals(2, listener.getChangeCount());
    }

    @Test
    public void addAnnotation_defaultLayer_shouldAddToForeground() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        TestCategoryAnnotation annotation = new TestCategoryAnnotation();
        this.renderer.addAnnotation(annotation);

        Assert.assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void addAnnotation_backgroundLayer_shouldAddToBackground() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        TestCategoryAnnotation annotation = new TestCategoryAnnotation();
        this.renderer.addAnnotation(annotation, Layer.BACKGROUND);

        Assert.assertEquals(1, listener.getChangeCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAnnotation_nullAnnotation_shouldThrowException() {
        this.renderer.addAnnotation(null);
    }

    @Test
    public void addAnnotation_unknownLayer_shouldThrowRuntimeException() {
        Layer unknownLayer = new Layer("UNKNOWN") {};
        try {
            this.renderer.addAnnotation(new TestCategoryAnnotation(), unknownLayer);
            Assert.fail("Expected RuntimeException");
        }
        catch (RuntimeException ex) {
            Assert.assertEquals("Unknown layer.", ex.getMessage());
        }
    }

    @Test
    public void removeAnnotation_givenPresentInForegroundOnly_shouldReturnFalseDueToBitwiseAnd() {
        TestCategoryAnnotation a1 = new TestCategoryAnnotation();
        this.renderer.addAnnotation(a1, Layer.FOREGROUND);

        boolean removed = this.renderer.removeAnnotation(a1);
        Assert.assertFalse(removed);
    }

    @Test
    public void removeAnnotation_givenPresentInBothLayers_shouldReturnTrue() {
        TestCategoryAnnotation a1 = new TestCategoryAnnotation();
        this.renderer.addAnnotation(a1, Layer.FOREGROUND);
        this.renderer.addAnnotation(a1, Layer.BACKGROUND);

        boolean removed = this.renderer.removeAnnotation(a1);
        Assert.assertTrue(removed);
    }

    @Test
    public void removeAnnotations_givenAnnotations_shouldClearAllAndNotify() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addAnnotation(new TestCategoryAnnotation(), Layer.FOREGROUND);
        this.renderer.addAnnotation(new TestCategoryAnnotation(), Layer.BACKGROUND);

        this.renderer.addChangeListener(listener);
        this.renderer.removeAnnotations();

        Assert.assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void setLegendItemLabelGenerator_validAndNull_shouldWorkAndThrow() {
        CategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        this.renderer.setLegendItemLabelGenerator(gen);
        Assert.assertSame(gen, this.renderer.getLegendItemLabelGenerator());

        try {
            this.renderer.setLegendItemLabelGenerator(null);
            Assert.fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException ex) {
            Assert.assertEquals("Null 'generator' argument.", ex.getMessage());
        }
    }

    @Test
    public void setLegendItemToolTipGenerator_givenValidGenerator_shouldSetAndFireEvent() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        CategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        this.renderer.setLegendItemToolTipGenerator(gen);

        Assert.assertSame(gen, this.renderer.getLegendItemToolTipGenerator());
        Assert.assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void setLegendItemURLGenerator_givenValidGenerator_shouldSetAndFireEvent() {
        TestRendererListener listener = new TestRendererListener();
        this.renderer.addChangeListener(listener);

        CategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        this.renderer.setLegendItemURLGenerator(gen);

        Assert.assertSame(gen, this.renderer.getLegendItemURLGenerator());
        Assert.assertEquals(1, listener.getChangeCount());
    }

    @Test
    public void initialise_nullDataset_shouldResetRowAndColumnCount() {
        CategoryPlot plot = new CategoryPlot();
        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());

        CategoryItemRendererState state = this.renderer.initialise(this.g2, this.dataArea, plot, null, info);

        Assert.assertNotNull(state);
        Assert.assertEquals(0, this.renderer.getRowCount());
        Assert.assertEquals(0, this.renderer.getColumnCount());
        Assert.assertSame(plot, this.renderer.getPlot());
    }

    @Test
    public void initialise_withDataset_shouldPopulateRowAndColumnCountAndState() {
        CategoryPlot plot = new CategoryPlot();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R0", "C0");
        dataset.addValue(2.0, "R0", "C1");
        dataset.addValue(3.0, "R1", "C0");
        dataset.addValue(4.0, "R1", "C1");

        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        CategoryItemRendererState state = this.renderer.initialise(this.g2, this.dataArea, plot, dataset, info);

        Assert.assertNotNull(state);
        Assert.assertEquals(2, this.renderer.getRowCount());
        Assert.assertEquals(2, this.renderer.getColumnCount());
        Assert.assertEquals(2, state.getVisibleSeriesArray().length);
        Assert.assertEquals(0, state.getVisibleSeriesArray()[0]);
        Assert.assertEquals(1, state.getVisibleSeriesArray()[1]);
    }

    @Test
    public void initialise_withInvisibleSeries_stateShouldExcludeInvisible() {
        CategoryPlot plot = new CategoryPlot();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R0", "C0");
        dataset.addValue(2.0, "R1", "C0");

        this.renderer.setSeriesVisible(0, Boolean.FALSE);

        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());
        CategoryItemRendererState state = this.renderer.initialise(this.g2, this.dataArea, plot, dataset, info);

        Assert.assertEquals(1, state.getVisibleSeriesArray().length);
        Assert.assertEquals(1, state.getVisibleSeriesArray()[0]);
    }

    @Test
    public void findRangeBounds_givenDataset_shouldRespectVisibleSeriesOnlyFlag() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R0", "C0");
        dataset.addValue(100.0, "R1", "C0");

        Assert.assertNull(this.renderer.findRangeBounds(null));

        Range allRange = this.renderer.findRangeBounds(dataset);
        Assert.assertEquals(10.0, allRange.getLowerBound(), 0.0001);
        Assert.assertEquals(100.0, allRange.getUpperBound(), 0.0001);

        this.renderer.setDataBoundsIncludesVisibleSeriesOnly(true);
        this.renderer.setSeriesVisible(1, Boolean.FALSE);

        Range visibleOnlyRange = this.renderer.findRangeBounds(dataset);
        Assert.assertEquals(10.0, visibleOnlyRange.getLowerBound(), 0.0001);
        Assert.assertEquals(10.0, visibleOnlyRange.getUpperBound(), 0.0001);
    }

    @Test
    public void getItemMiddle_givenValidInputs_shouldDelegateToAxis() {
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R0", "C0");
        dataset.addValue(20.0, "R0", "C1");

        double middle = this.renderer.getItemMiddle("R0", "C0", dataset, domainAxis,
                this.dataArea, RectangleEdge.BOTTOM);
        Assert.assertTrue(middle >= this.dataArea.getMinX() && middle <= this.dataArea.getMaxX());
    }

    @Test
    public void drawBackgroundAndOutline_shouldDelegateToPlot() {
        CategoryPlot plot = new CategoryPlot();
        this.renderer.drawBackground(this.g2, plot, this.dataArea);
        this.renderer.drawOutline(this.g2, plot, this.dataArea);
    }

    @Test
    public void drawDomainLine_horizontalAndVertical_shouldDrawWithoutError() {
        CategoryPlot plot = new CategoryPlot();

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.renderer.drawDomainLine(this.g2, plot, this.dataArea, 50.0, Color.RED, new BasicStroke(1.0f));

        plot.setOrientation(PlotOrientation.VERTICAL);
        this.renderer.drawDomainLine(this.g2, plot, this.dataArea, 50.0, Color.BLUE, new BasicStroke(1.0f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void drawDomainLine_nullPaint_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        this.renderer.drawDomainLine(this.g2, plot, this.dataArea, 50.0, null, new BasicStroke(1.0f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void drawDomainLine_nullStroke_shouldThrowException() {
        CategoryPlot plot = new CategoryPlot();
        this.renderer.drawDomainLine(this.g2, plot, this.dataArea, 50.0, Color.BLACK, null);
    }

    @Test
    public void drawRangeLine_inRangeAndOutOfRange_shouldBehaveProperly() {
        CategoryPlot plot = new CategoryPlot();
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);

        // Out of range: does nothing
        this.renderer.drawRangeLine(this.g2, plot, axis, this.dataArea, 150.0, Color.RED, new BasicStroke(1.0f));

        // In range - Horizontal
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.renderer.drawRangeLine(this.g2, plot, axis, this.dataArea, 50.0, Color.RED, new BasicStroke(1.0f));

        // In range - Vertical
        plot.setOrientation(PlotOrientation.VERTICAL);
        this.renderer.drawRangeLine(this.g2, plot, axis, this.dataArea, 50.0, Color.BLUE, new BasicStroke(1.0f));
    }

    @Test
    public void drawDomainMarker_drawAsLineAndArea_bothOrientations() {
        CategoryAxis axis = new CategoryAxis("Domain");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R0", "C0");
        dataset.addValue(20.0, "R0", "C1");

        CategoryPlot plot = new CategoryPlot(dataset, axis, new NumberAxis("Value"), this.renderer);

        CategoryMarker lineMarker = new CategoryMarker("C0", Color.GREEN, new BasicStroke(1.0f));
        lineMarker.setDrawAsLine(true);
        lineMarker.setLabel("LineMarker");

        CategoryMarker areaMarker = new CategoryMarker("C1", Color.YELLOW, new BasicStroke(1.0f));
        areaMarker.setDrawAsLine(false);
        areaMarker.setLabel("AreaMarker");

        // Horizontal
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.renderer.drawDomainMarker(this.g2, plot, axis, lineMarker, this.dataArea);
        this.renderer.drawDomainMarker(this.g2, plot, axis, areaMarker, this.dataArea);

        // Vertical
        plot.setOrientation(PlotOrientation.VERTICAL);
        this.renderer.drawDomainMarker(this.g2, plot, axis, lineMarker, this.dataArea);
        this.renderer.drawDomainMarker(this.g2, plot, axis, areaMarker, this.dataArea);

        // Unknown column
        CategoryMarker unknownMarker = new CategoryMarker("C_UNKNOWN", Color.BLACK, new BasicStroke(1.0f));
        this.renderer.drawDomainMarker(this.g2, plot, axis, unknownMarker, this.dataArea);
    }

    @Test
    public void drawRangeMarker_valueMarker_bothOrientationsAndOutOfRange() {
        CategoryPlot plot = new CategoryPlot();
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);

        ValueMarker marker = new ValueMarker(50.0, Color.MAGENTA, new BasicStroke(1.2f));
        marker.setLabel("Mid");

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.renderer.drawRangeMarker(this.g2, plot, axis, marker, this.dataArea);

        plot.setOrientation(PlotOrientation.VERTICAL);
        this.renderer.drawRangeMarker(this.g2, plot, axis, marker, this.dataArea);

        ValueMarker outMarker = new ValueMarker(200.0);
        this.renderer.drawRangeMarker(this.g2, plot, axis, outMarker, this.dataArea);
    }

    @Test
    public void drawRangeMarker_intervalMarker_bothOrientationsAndGradient() {
        CategoryPlot plot = new CategoryPlot();
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);

        IntervalMarker marker = new IntervalMarker(20.0, 80.0, Color.CYAN, new BasicStroke(1.0f),
                Color.BLACK, new BasicStroke(1.0f), 0.5f);
        marker.setLabel("Interval");

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.renderer.drawRangeMarker(this.g2, plot, axis, marker, this.dataArea);

        plot.setOrientation(PlotOrientation.VERTICAL);
        this.renderer.drawRangeMarker(this.g2, plot, axis, marker, this.dataArea);

        // Test with GradientPaint and GradientPaintTransformer
        GradientPaint gp = new GradientPaint(0.0f, 0.0f, Color.RED, 10.0f, 10.0f, Color.BLUE);
        IntervalMarker gradientMarker = new IntervalMarker(30.0, 70.0, gp, new BasicStroke(1.0f),
                Color.DARK_GRAY, new BasicStroke(1.0f), 0.8f);
        gradientMarker.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL));
        this.renderer.drawRangeMarker(this.g2, plot, axis, gradientMarker, this.dataArea);

        // Out of range interval
        IntervalMarker outMarker = new IntervalMarker(200.0, 300.0);
        this.renderer.drawRangeMarker(this.g2, plot, axis, outMarker, this.dataArea);
    }

    @Test
    public void getLegendItem_variousConditions_shouldReturnExpected() {
        // Plot is null
        Assert.assertNull(this.renderer.getLegendItem(0, 0));

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R0", "C0");
        dataset.addValue(2.0, "R1", "C0");

        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Domain"), new NumberAxis("Range"), this.renderer);
        this.renderer.setPlot(plot);

        // Invisible series
        this.renderer.setSeriesVisible(0, Boolean.FALSE);
        Assert.assertNull(this.renderer.getLegendItem(0, 0));

        // Invisible in legend
        this.renderer.setSeriesVisible(0, Boolean.TRUE);
        this.renderer.setSeriesVisibleInLegend(0, Boolean.FALSE);
        Assert.assertNull(this.renderer.getLegendItem(0, 0));

        // Visible in legend with tooltip and url generators
        this.renderer.setSeriesVisibleInLegend(0, Boolean.TRUE);
        this.renderer.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("Tip: {0}"));
        this.renderer.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator("http://url/{0}"));

        LegendItem item = this.renderer.getLegendItem(0, 0);
        Assert.assertNotNull(item);
        Assert.assertEquals("R0", item.getLabel());
        Assert.assertEquals("Tip: R0", item.getToolTipText());
        Assert.assertEquals("http://url/R0", item.getURLText());
    }

    @Test
    public void getLegendItems_variousConditions_shouldReturnCollection() {
        // Null plot
        LegendItemCollection coll = this.renderer.getLegendItems();
        Assert.assertNotNull(coll);
        Assert.assertEquals(0, coll.getItemCount());

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R0", "C0");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("D"), new NumberAxis("R"), this.renderer);
        this.renderer.setPlot(plot);

        // The current source logic returns empty collection if dataset != null
        LegendItemCollection resultColl = this.renderer.getLegendItems();
        Assert.assertNotNull(resultColl);
        Assert.assertEquals(0, resultColl.getItemCount());
    }

    @Test
    public void equalsAndHashCode_givenVariousProperties_shouldDifferentiate() {
        ConcreteCategoryItemRenderer r1 = new ConcreteCategoryItemRenderer();
        ConcreteCategoryItemRenderer r2 = new ConcreteCategoryItemRenderer();

        Assert.assertTrue(r1.equals(r1));
        Assert.assertFalse(r1.equals(null));
        Assert.assertFalse(r1.equals("SomeString"));
        Assert.assertTrue(r1.equals(r2));
        Assert.assertEquals(r1.hashCode(), r2.hashCode());

        // itemLabelGeneratorList
        r1.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        Assert.assertTrue(r1.equals(r2));

        // baseItemLabelGenerator
        r1.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        Assert.assertTrue(r1.equals(r2));

        // toolTipGeneratorList
        r1.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        Assert.assertTrue(r1.equals(r2));

        // baseToolTipGenerator
        r1.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        Assert.assertTrue(r1.equals(r2));

        // urlGeneratorList
        r1.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        Assert.assertTrue(r1.equals(r2));

        // baseURLGenerator
        r1.setBaseURLGenerator(new StandardCategoryURLGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setBaseURLGenerator(new StandardCategoryURLGenerator());
        Assert.assertTrue(r1.equals(r2));

        // legendItemLabelGenerator
        r1.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator("label1"));
        Assert.assertFalse(r1.equals(r2));
        r2.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator("label1"));
        Assert.assertTrue(r1.equals(r2));

        // legendItemToolTipGenerator
        r1.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("tt1"));
        Assert.assertFalse(r1.equals(r2));
        r2.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("tt1"));
        Assert.assertTrue(r1.equals(r2));

        // legendItemURLGenerator
        r1.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator("url1"));
        Assert.assertFalse(r1.equals(r2));
        r2.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator("url1"));
        Assert.assertTrue(r1.equals(r2));

        // backgroundAnnotations
        TestCategoryAnnotation a1 = new TestCategoryAnnotation();
        r1.addAnnotation(a1, Layer.BACKGROUND);
        Assert.assertFalse(r1.equals(r2));
        r2.addAnnotation(a1, Layer.BACKGROUND);
        Assert.assertTrue(r1.equals(r2));

        // foregroundAnnotations
        TestCategoryAnnotation a2 = new TestCategoryAnnotation();
        r1.addAnnotation(a2, Layer.FOREGROUND);
        Assert.assertFalse(r1.equals(r2));
        r2.addAnnotation(a2, Layer.FOREGROUND);
        Assert.assertTrue(r1.equals(r2));
    }

    @Test
    public void getDrawingSupplier_nullAndNonNullPlot_shouldReturnExpected() {
        Assert.assertNull(this.renderer.getDrawingSupplier());

        CategoryPlot plot = new CategoryPlot();
        DrawingSupplier supplier = new DefaultDrawingSupplier();
        plot.setDrawingSupplier(supplier);
        this.renderer.setPlot(plot);

        Assert.assertSame(supplier, this.renderer.getDrawingSupplier());
    }

    @Test
    public void updateCrosshairValues_orientationNull_shouldThrowException() {
        try {
            this.renderer.updateCrosshairValues(new CategoryCrosshairState(), "R0", "C0", 1.0, 0, 10.0, 10.0, null);
            Assert.fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException ex) {
            Assert.assertEquals("Null 'orientation' argument.", ex.getMessage());
        }
    }

    @Test
    public void updateCrosshairValues_lockedAndUnlocked_shouldUpdateCorrectly() {
        CategoryPlot plot = new CategoryPlot();
        this.renderer.setPlot(plot);

        CategoryCrosshairState state = new CategoryCrosshairState();

        plot.setRangeCrosshairLockedOnData(true);
        this.renderer.updateCrosshairValues(state, "R0", "C0", 5.0, 0, 15.0, 25.0, PlotOrientation.VERTICAL);

        plot.setRangeCrosshairLockedOnData(false);
        this.renderer.updateCrosshairValues(state, "R0", "C0", 5.0, 0, 15.0, 25.0, PlotOrientation.VERTICAL);

        // Null crosshairState: no-op without exception
        this.renderer.updateCrosshairValues(null, "R0", "C0", 5.0, 0, 15.0, 25.0, PlotOrientation.VERTICAL);
    }

    @Test
    public void drawItemLabel_positiveAndNegative_shouldDrawProperly() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R0", "C0");

        this.renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        this.renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        this.renderer.setBaseNegativeItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.INSIDE1, TextAnchor.BOTTOM_CENTER));

        // positive
        this.renderer.drawItemLabel(this.g2, PlotOrientation.VERTICAL, dataset, 0, 0, false, 50.0, 50.0, false);
        // negative
        this.renderer.drawItemLabel(this.g2, PlotOrientation.VERTICAL, dataset, 0, 0, false, 50.0, 50.0, true);

        // generator null -> nothing drawn
        this.renderer.setBaseItemLabelGenerator(null);
        this.renderer.drawItemLabel(this.g2, PlotOrientation.VERTICAL, dataset, 0, 0, false, 50.0, 50.0, false);
    }

    @Test
    public void drawAnnotations_foregroundBackgroundAndUnknown_shouldBehaveAccordingly() {
        CategoryPlot plot = new CategoryPlot();
        this.renderer.setPlot(plot);

        TestCategoryAnnotation fgAnn = new TestCategoryAnnotation();
        TestCategoryAnnotation bgAnn = new TestCategoryAnnotation();

        this.renderer.addAnnotation(fgAnn, Layer.FOREGROUND);
        this.renderer.addAnnotation(bgAnn, Layer.BACKGROUND);

        CategoryAxis domainAxis = new CategoryAxis("D");
        ValueAxis rangeAxis = new NumberAxis("R");
        PlotRenderingInfo info = new PlotRenderingInfo(new ChartRenderingInfo());

        this.renderer.drawAnnotations(this.g2, this.dataArea, domainAxis, rangeAxis, Layer.FOREGROUND, info);
        Assert.assertTrue(fgAnn.isDrawn());
        Assert.assertFalse(bgAnn.isDrawn());

        this.renderer.drawAnnotations(this.g2, this.dataArea, domainAxis, rangeAxis, Layer.BACKGROUND, info);
        Assert.assertTrue(bgAnn.isDrawn());

        try {
            Layer unknown = new Layer("OTHER") {};
            this.renderer.drawAnnotations(this.g2, this.dataArea, domainAxis, rangeAxis, unknown, info);
            Assert.fail("Expected RuntimeException for unknown layer");
        }
        catch (RuntimeException ex) {
            Assert.assertEquals("Unknown layer.", ex.getMessage());
        }
    }

    @Test
    public void clone_successAndFailureBranches() throws Exception {
        this.renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        this.renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        this.renderer.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        this.renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        this.renderer.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        this.renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());

        ConcreteCategoryItemRenderer cloned = (ConcreteCategoryItemRenderer) this.renderer.clone();
        Assert.assertNotSame(this.renderer, cloned);
        Assert.assertEquals(this.renderer, cloned);

        // Fail clone when baseItemLabelGenerator is not PublicCloneable
        ConcreteCategoryItemRenderer rLabelFail = new ConcreteCategoryItemRenderer();
        rLabelFail.setBaseItemLabelGenerator(new NonCloneableLabelGenerator());
        try {
            rLabelFail.clone();
            Assert.fail("Expected CloneNotSupportedException");
        }
        catch (CloneNotSupportedException ex) {
            Assert.assertEquals("ItemLabelGenerator not cloneable.", ex.getMessage());
        }

        // Fail clone when baseToolTipGenerator is not PublicCloneable
        ConcreteCategoryItemRenderer rTipFail = new ConcreteCategoryItemRenderer();
        rTipFail.setBaseToolTipGenerator(new NonCloneableToolTipGenerator());
        try {
            rTipFail.clone();
            Assert.fail("Expected CloneNotSupportedException");
        }
        catch (CloneNotSupportedException ex) {
            Assert.assertEquals("Base tool tip generator not cloneable.", ex.getMessage());
        }

        // Fail clone when baseURLGenerator is not PublicCloneable
        ConcreteCategoryItemRenderer rUrlFail = new ConcreteCategoryItemRenderer();
        rUrlFail.setBaseURLGenerator(new NonCloneableURLGenerator());
        try {
            rUrlFail.clone();
            Assert.fail("Expected CloneNotSupportedException");
        }
        catch (CloneNotSupportedException ex) {
            Assert.assertEquals("Base item URL generator not cloneable.", ex.getMessage());
        }
    }

    @Test
    public void getDomainAxisAndGetRangeAxis_shouldRetrieveFromPlot() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("D");
        ValueAxis rangeAxis = new NumberAxis("R");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setDataset(dataset);

        CategoryAxis retrievedDomain = this.renderer.getDomainAxis(plot, dataset);
        Assert.assertSame(domainAxis, retrievedDomain);

        ValueAxis retrievedRange = this.renderer.getRangeAxis(plot, 0);
        Assert.assertSame(rangeAxis, retrievedRange);
    }

    @Test
    public void addEntity_withAndWithoutNullHotspot_shouldCreateAndAddEntity() {
        EntityCollection entities = new StandardEntityCollection();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R0", "C0");

        CategoryPlot plot = new CategoryPlot();
        this.renderer.setPlot(plot);

        this.renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        this.renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());

        // With explicit hotspot
        Rectangle2D hotspot = new Rectangle2D.Double(0.0, 0.0, 10.0, 10.0);
        this.renderer.addEntity(entities, hotspot, dataset, 0, 0, false);
        Assert.assertEquals(1, entities.getEntityCount());

        // Null hotspot in horizontal orientation
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        this.renderer.addEntity(entities, null, dataset, 0, 0, false, 20.0, 30.0);
        Assert.assertEquals(2, entities.getEntityCount());

        // Null hotspot in vertical orientation
        plot.setOrientation(PlotOrientation.VERTICAL);
        this.renderer.addEntity(entities, null, dataset, 0, 0, false, 20.0, 30.0);
        Assert.assertEquals(3, entities.getEntityCount());

        // getItemCreateEntity returns false
        this.renderer.setBaseCreateEntities(false);
        this.renderer.addEntity(entities, hotspot, dataset, 0, 0, false);
        Assert.assertEquals(3, entities.getEntityCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEntity_nullHotspotSingleArg_shouldThrowException() {
        EntityCollection entities = new StandardEntityCollection();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        this.renderer.addEntity(entities, null, dataset, 0, 0, false);
    }

    @Test(expected = RuntimeException.class)
    public void createHotSpotShape_alwaysThrowsNotImplemented() {
        this.renderer.createHotSpotShape(this.g2, this.dataArea, new CategoryPlot(),
                new CategoryAxis(), new NumberAxis(), new DefaultCategoryDataset(),
                0, 0, false, null);
    }

    @Test
    public void createHotSpotBoundsAndHitTest_variousValues_shouldCalculateBoundsAndHit() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("D");
        ValueAxis rangeAxis = new NumberAxis("R");
        rangeAxis.setRange(0.0, 100.0);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(50.0, "R0", "C0");
        dataset.addValue(null, "R0", "C1");

        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setDataset(dataset);

        // Non-null value
        Rectangle2D bounds = this.renderer.createHotSpotBounds(this.g2, this.dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null, null);
        Assert.assertNotNull(bounds);
        Assert.assertEquals(4.0, bounds.getWidth(), 0.0001);
        Assert.assertEquals(4.0, bounds.getHeight(), 0.0001);

        double centerX = bounds.getCenterX();
        double centerY = bounds.getCenterY();
        Assert.assertTrue(this.renderer.hitTest(centerX, centerY, this.g2, this.dataArea,
                plot, domainAxis, rangeAxis, dataset, 0, 0, false, null));
        Assert.assertFalse(this.renderer.hitTest(centerX + 100.0, centerY + 100.0, this.g2,
                this.dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, false, null));

        // Null value in dataset
        Rectangle2D nullBounds = this.renderer.createHotSpotBounds(this.g2, this.dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 1, false, null, null);
        Assert.assertNull(nullBounds);
        Assert.assertFalse(this.renderer.hitTest(centerX, centerY, this.g2, this.dataArea,
                plot, domainAxis, rangeAxis, dataset, 0, 1, false, null));
    }

    @Test
    public void serialization_shouldSerializeAndDeserializeCorrectly() throws Exception {
        this.renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        this.renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        this.renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(this.renderer);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ConcreteCategoryItemRenderer deserialized = (ConcreteCategoryItemRenderer) in.readObject();
        in.close();

        Assert.assertEquals(this.renderer, deserialized);
    }
}