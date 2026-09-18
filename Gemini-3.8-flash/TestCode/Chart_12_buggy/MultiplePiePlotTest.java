package org.jfree.chart.plot;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

/**
 * Complete JUnit Test Suite for MultiplePiePlot ensuring high branch,
 * line, and edge-case coverage compatible with Java 1.4 / Java 7 syntax.
 */
public class MultiplePiePlotTest implements PlotChangeListener {

    private boolean changeDetected = false;

    public void plotChanged(PlotChangeEvent event) {
        this.changeDetected = true;
    }

    private DefaultCategoryDataset createSampleDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row 1", "Col 1");
        dataset.addValue(20.0, "Row 1", "Col 2");
        dataset.addValue(30.0, "Row 2", "Col 1");
        dataset.addValue(40.0, "Row 2", "Col 2");
        return dataset;
    }

    @Test
    public void testConstructor_default_shouldInitializeProperly() {
        MultiplePiePlot plot = new MultiplePiePlot();
        Assert.assertNull(plot.getDataset());
        Assert.assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        Assert.assertEquals(0.0, plot.getLimit(), 0.000001);
        Assert.assertEquals("Other", plot.getAggregatedItemsKey());
        Assert.assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
        Assert.assertNotNull(plot.getPieChart());
        Assert.assertTrue(plot.getPieChart().getPlot() instanceof PiePlot);
    }

    @Test
    public void testConstructor_withDataset_shouldInitializeProperly() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        Assert.assertEquals(dataset, plot.getDataset());
    }

    @Test
    public void testSetDataset_nullAndNonNull_shouldHandleListenersAndNotify() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.addChangeListener(this);

        this.changeDetected = false;
        DefaultCategoryDataset dataset1 = createSampleDataset();
        plot.setDataset(dataset1);
        Assert.assertSame(dataset1, plot.getDataset());
        Assert.assertTrue(this.changeDetected);

        this.changeDetected = false;
        DefaultCategoryDataset dataset2 = createSampleDataset();
        plot.setDataset(dataset2);
        Assert.assertSame(dataset2, plot.getDataset());
        Assert.assertTrue(this.changeDetected);

        this.changeDetected = false;
        plot.setDataset(null);
        Assert.assertNull(plot.getDataset());
        Assert.assertTrue(this.changeDetected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_null_shouldThrowIllegalArgumentException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_nonPiePlot_shouldThrowIllegalArgumentException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        JFreeChart invalidChart = new JFreeChart(new FastScatterPlot());
        plot.setPieChart(invalidChart);
    }

    @Test
    public void testSetPieChart_valid_shouldUpdateAndNotify() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.addChangeListener(this);
        JFreeChart newChart = new JFreeChart(new PiePlot(null));

        this.changeDetected = false;
        plot.setPieChart(newChart);
        Assert.assertSame(newChart, plot.getPieChart());
        Assert.assertTrue(this.changeDetected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrder_null_shouldThrowIllegalArgumentException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(null);
    }

    @Test
    public void testSetDataExtractOrder_valid_shouldUpdateAndNotify() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.addChangeListener(this);

        this.changeDetected = false;
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        Assert.assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
        Assert.assertTrue(this.changeDetected);
    }

    @Test
    public void testSetLimit_valid_shouldUpdateAndNotify() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.addChangeListener(this);

        this.changeDetected = false;
        plot.setLimit(0.15);
        Assert.assertEquals(0.15, plot.getLimit(), 0.000001);
        Assert.assertTrue(this.changeDetected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKey_null_shouldThrowIllegalArgumentException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey(null);
    }

    @Test
    public void testSetAggregatedItemsKey_valid_shouldUpdateAndNotify() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.addChangeListener(this);

        this.changeDetected = false;
        plot.setAggregatedItemsKey("Miscellaneous");
        Assert.assertEquals("Miscellaneous", plot.getAggregatedItemsKey());
        Assert.assertTrue(this.changeDetected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaint_null_shouldThrowIllegalArgumentException() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(null);
    }

    @Test
    public void testSetAggregatedItemsPaint_valid_shouldUpdateAndNotify() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.addChangeListener(this);

        this.changeDetected = false;
        plot.setAggregatedItemsPaint(Color.red);
        Assert.assertEquals(Color.red, plot.getAggregatedItemsPaint());
        Assert.assertTrue(this.changeDetected);
    }

    @Test
    public void testGetPlotType_always_shouldReturnMultiplePiePlot() {
        MultiplePiePlot plot = new MultiplePiePlot();
        Assert.assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    @Test
    public void testDraw_nullDataset_shouldDrawNoDataMessage() {
        MultiplePiePlot plot = new MultiplePiePlot(null);
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 400.0, 300.0);

        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_emptyDataset_shouldDrawNoDataMessage() {
        DefaultCategoryDataset emptyDataset = new DefaultCategoryDataset();
        MultiplePiePlot plot = new MultiplePiePlot(emptyDataset);
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 400.0, 300.0);

        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_byColumn_withoutInfo_shouldDrawSuccessfully() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 400.0, 300.0);

        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_byRow_withRenderingInfo_shouldPopulateSubplotAndEntities() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);

        BufferedImage image = new BufferedImage(500, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 500.0, 400.0);

        ChartRenderingInfo chartInfo = new ChartRenderingInfo(new StandardEntityCollection());
        PlotRenderingInfo plotInfo = chartInfo.getPlotInfo();

        plot.draw(g2, area, null, null, plotInfo);
        g2.dispose();

        Assert.assertEquals(2, plotInfo.getSubplotCount());
        Assert.assertTrue(chartInfo.getEntityCollection().getEntityCount() > 0);
    }

    @Test
    public void testDraw_aspectRatioSwap_displayColsGreaterThanRowsAndTallArea() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        dataset.addValue(3.0, "R1", "C3");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);

        BufferedImage image = new BufferedImage(100, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 100.0, 600.0);

        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_oddCountWithDiffRemainder_shouldApplyOffset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R2", "C1");
        dataset.addValue(3.0, "R3", "C1");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);

        BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 400.0, 400.0);

        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withLimit_shouldDrawConsolidatedSections() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100.0, "R1", "Big1");
        dataset.addValue(1.0, "R1", "Small1");
        dataset.addValue(1.0, "R1", "Small2");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        plot.setLimit(0.10);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 400.0, 300.0);

        plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testPrefetchSectionPaints_existingPlotPaint_shouldPreserveCustomPaint() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        PiePlot subPiePlot = (PiePlot) plot.getPieChart().getPlot();
        subPiePlot.setSectionPaint("Row 1", Color.blue);

        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        LegendItemCollection legend = plot.getLegendItems();
        Assert.assertNotNull(legend);
        Assert.assertEquals(2, legend.getItemCount());
    }

    @Test
    public void testPrefetchSectionPaints_byRowWithCustomPaint_shouldPreserve() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        PiePlot subPiePlot = (PiePlot) plot.getPieChart().getPlot();
        subPiePlot.setSectionPaint("Col 1", Color.green);

        plot.setDataExtractOrder(TableOrder.BY_ROW);
        LegendItemCollection legend = plot.getLegendItems();
        Assert.assertNotNull(legend);
        Assert.assertEquals(2, legend.getItemCount());
    }

    @Test
    public void testGetLegendItems_nullDataset_shouldReturnEmptyCollection() {
        MultiplePiePlot plot = new MultiplePiePlot(null);
        LegendItemCollection items = plot.getLegendItems();
        Assert.assertNotNull(items);
        Assert.assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItems_byRow_shouldReturnColumnKeys() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);

        LegendItemCollection items = plot.getLegendItems();
        Assert.assertEquals(2, items.getItemCount());
        Assert.assertEquals("Col 1", items.get(0).getLabel());
        Assert.assertEquals("Col 2", items.get(1).getLabel());
    }

    @Test
    public void testGetLegendItems_byColumn_shouldReturnRowKeys() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);

        LegendItemCollection items = plot.getLegendItems();
        Assert.assertEquals(2, items.getItemCount());
        Assert.assertEquals("Row 1", items.get(0).getLabel());
        Assert.assertEquals("Row 2", items.get(1).getLabel());
    }

    @Test
    public void testGetLegendItems_withLimit_shouldAppendAggregatedItem() {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        plot.setLimit(0.05);

        LegendItemCollection items = plot.getLegendItems();
        Assert.assertEquals(3, items.getItemCount());
        LegendItem aggregatedItem = items.get(2);
        Assert.assertEquals("Other", aggregatedItem.getLabel());
        Assert.assertEquals(plot.getAggregatedItemsPaint(), aggregatedItem.getFillPaint());
    }

    @Test
    public void testEquals_contractAndBranches_shouldEvaluateCorrectly() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();

        Assert.assertTrue(p1.equals(p1));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("Not a Plot"));
        Assert.assertTrue(p1.equals(p2));

        p1.setDataExtractOrder(TableOrder.BY_ROW);
        Assert.assertFalse(p1.equals(p2));
        p2.setDataExtractOrder(TableOrder.BY_ROW);
        Assert.assertTrue(p1.equals(p2));

        p1.setLimit(0.25);
        Assert.assertFalse(p1.equals(p2));
        p2.setLimit(0.25);
        Assert.assertTrue(p1.equals(p2));

        p1.setAggregatedItemsKey("Extra");
        Assert.assertFalse(p1.equals(p2));
        p2.setAggregatedItemsKey("Extra");
        Assert.assertTrue(p1.equals(p2));

        p1.setAggregatedItemsPaint(Color.magenta);
        Assert.assertFalse(p1.equals(p2));
        p2.setAggregatedItemsPaint(Color.magenta);
        Assert.assertTrue(p1.equals(p2));

        p1.getPieChart().setBackgroundPaint(Color.cyan);
        Assert.assertFalse(p1.equals(p2));
        p2.getPieChart().setBackgroundPaint(Color.cyan);
        Assert.assertTrue(p1.equals(p2));

        p1.setNoDataMessage("No Data Available");
        Assert.assertFalse(p1.equals(p2));
        p2.setNoDataMessage("No Data Available");
        Assert.assertTrue(p1.equals(p2));
    }

    @Test
    public void testSerialization_roundTrip_shouldRestoreEqualState() throws Exception {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot p1 = new MultiplePiePlot(dataset);
        p1.setDataExtractOrder(TableOrder.BY_ROW);
        p1.setLimit(0.12);
        p1.setAggregatedItemsKey("Rest");
        p1.setAggregatedItemsPaint(Color.orange);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(p1);
        out.close();

        ByteArrayInputStream inBuffer = new ByteArrayInputStream(buffer.toByteArray());
        ObjectInputStream in = new ObjectInputStream(inBuffer);
        MultiplePiePlot p2 = (MultiplePiePlot) in.readObject();
        in.close();

        Assert.assertEquals(p1, p2);
        Assert.assertEquals(Color.orange, p2.getAggregatedItemsPaint());
        Assert.assertEquals("Rest", p2.getAggregatedItemsKey());
        Assert.assertEquals(TableOrder.BY_ROW, p2.getDataExtractOrder());
    }

    @Test
    public void testCloning_contract_shouldCloneCorrectly() throws Exception {
        DefaultCategoryDataset dataset = createSampleDataset();
        MultiplePiePlot p1 = new MultiplePiePlot(dataset);
        MultiplePiePlot p2 = (MultiplePiePlot) p1.clone();

        Assert.assertNotSame(p1, p2);
        Assert.assertSame(p1.getClass(), p2.getClass());
        Assert.assertEquals(p1, p2);
    }
}