package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Before;
import org.junit.Test;

public class MultiplePiePlotTest {

    private MultiplePiePlot plot;

    @Before
    public void setUp() {
        plot = new MultiplePiePlot();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor() {
        assertNull(plot.getDataset());
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        assertEquals(0.0, plot.getLimit(), 0.0000001);
        assertEquals("Other", plot.getAggregatedItemsKey());
        assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
        assertNotNull(plot.getPieChart());
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    @Test
    public void testConstructorWithDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        MultiplePiePlot p = new MultiplePiePlot(dataset);
        assertSame(dataset, p.getDataset());
    }

    @Test
    public void testConstructorWithNullDataset() {
        MultiplePiePlot p = new MultiplePiePlot(null);
        assertNull(p.getDataset());
    }

    // ---------- getDataset / setDataset ----------

    @Test
    public void testSetDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() {
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testSetDatasetReplacesOld() {
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        dataset1.addValue(1.0, "Row1", "Col1");
        plot.setDataset(dataset1);
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.addValue(2.0, "Row2", "Col2");
        plot.setDataset(dataset2);
        assertSame(dataset2, plot.getDataset());
    }

    // ---------- getPieChart / setPieChart ----------

    @Test
    public void testGetPieChartNotNull() {
        assertNotNull(plot.getPieChart());
    }

    @Test
    public void testSetPieChart() {
        JFreeChart newChart = new JFreeChart(new PiePlot(null));
        plot.setPieChart(newChart);
        assertSame(newChart, plot.getPieChart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNull() {
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNotPiePlot() {
        JFreeChart chart = new JFreeChart(new XYPlot());
        plot.setPieChart(chart);
    }

    // ---------- getDataExtractOrder / setDataExtractOrder ----------

    @Test
    public void testSetDataExtractOrder() {
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrderNull() {
        plot.setDataExtractOrder(null);
    }

    // ---------- getLimit / setLimit ----------

    @Test
    public void testSetLimitNormal() {
        plot.setLimit(0.5);
        assertEquals(0.5, plot.getLimit(), 0.0000001);
    }

    @Test
    public void testSetLimitBoundaryZero() {
        plot.setLimit(0.0);
        assertEquals(0.0, plot.getLimit(), 0.0000001);
    }

    @Test
    public void testSetLimitNegative() {
        plot.setLimit(-1.0);
        assertEquals(-1.0, plot.getLimit(), 0.0000001);
    }

    // ---------- getAggregatedItemsKey / setAggregatedItemsKey ----------

    @Test
    public void testSetAggregatedItemsKey() {
        plot.setAggregatedItemsKey("Others");
        assertEquals("Others", plot.getAggregatedItemsKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKeyNull() {
        plot.setAggregatedItemsKey(null);
    }

    // ---------- getAggregatedItemsPaint / setAggregatedItemsPaint ----------

    @Test
    public void testSetAggregatedItemsPaint() {
        plot.setAggregatedItemsPaint(Color.RED);
        assertEquals(Color.RED, plot.getAggregatedItemsPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaintNull() {
        plot.setAggregatedItemsPaint(null);
    }

    // ---------- getPlotType ----------

    @Test
    public void testGetPlotType() {
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    // ---------- draw ----------

    @Test
    public void testDrawWithNullDataset() {
        BufferedImage image = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(g2, area, null, null, null);
        // No exception means drawNoDataMessage branch executed successfully
        assertNull(plot.getDataset());
    }

    @Test
    public void testDrawWithEmptyDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(g2, area, null, null, null);
        assertNotNull(plot.getDataset());
    }

    @Test
    public void testDrawByColumnMultiplePies() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(30.0, "Row1", "Col3");
        dataset.addValue(15.0, "Row2", "Col1");
        dataset.addValue(25.0, "Row2", "Col2");
        dataset.addValue(5.0, "Row2", "Col3");
        plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(g2, area, null, null, null);
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
    }

    @Test
    public void testDrawByRowMultiplePies() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(15.0, "Row2", "Col1");
        dataset.addValue(25.0, "Row2", "Col2");
        plot.setDataset(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        BufferedImage image = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(g2, area, null, null, null);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    @Test
    public void testDrawSinglePie() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null);
        assertEquals(1, dataset.getColumnCount());
    }

    @Test
    public void testDrawTallNarrowAreaSwap() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(100, 400,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 400);
        plot.draw(g2, area, null, null, null);
        assertEquals(2, dataset.getColumnCount());
    }

    @Test
    public void testDrawWithLimit() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(50.0, "Row1", "Col1");
        dataset.addValue(1.0, "Row1", "Col2");
        dataset.addValue(1.0, "Row1", "Col3");
        dataset.addValue(1.0, "Row1", "Col4");
        plot.setDataset(dataset);
        plot.setLimit(0.3);
        BufferedImage image = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(g2, area, null, null, null);
        assertEquals(0.3, plot.getLimit(), 0.0000001);
    }

    @Test
    public void testDrawWithRenderingInfo() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        ChartRenderingInfo info = new ChartRenderingInfo();
        PlotRenderingInfo prinfo = new PlotRenderingInfo(info);
        plot.draw(g2, area, null, null, prinfo);
        assertNotNull(info.getEntityCollection());
    }

    // ---------- getLegendItems ----------

    @Test
    public void testGetLegendItemsNullDataset() {
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsByColumn() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row2", "Col1");
        plot.setDataset(dataset);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsByRow() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        plot.setDataset(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsWithLimit() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row2", "Col1");
        plot.setDataset(dataset);
        plot.setLimit(0.5);
        LegendItemCollection items = plot.getLegendItems();
        // 2 keys + 1 aggregated item
        assertEquals(3, items.getItemCount());
    }

    // ---------- equals ----------

    @Test
    public void testEqualsSameInstance() {
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsIdenticalDefaultPlots() {
        MultiplePiePlot plot2 = new MultiplePiePlot();
        assertTrue(plot.equals(plot2));
        assertTrue(plot2.equals(plot));
    }

    @Test
    public void testEqualsDifferentDataExtractOrder() {
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(plot.equals(plot2));
    }

    @Test
    public void testEqualsDifferentLimit() {
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setLimit(0.5);
        assertFalse(plot.equals(plot2));
    }

    @Test
    public void testEqualsDifferentAggregatedItemsKey() {
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setAggregatedItemsKey("Different");
        assertFalse(plot.equals(plot2));
    }

    @Test
    public void testEqualsDifferentAggregatedItemsPaint() {
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setAggregatedItemsPaint(Color.RED);
        assertFalse(plot.equals(plot2));
    }

    @Test
    public void testEqualsDifferentPieChart() {
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot2.setPieChart(new JFreeChart(new PiePlot(null)));
        assertFalse(plot.equals(plot2));
    }

    // ---------- Serialization ----------

    @Test
    public void testSerialization() throws Exception {
        plot.setAggregatedItemsPaint(Color.BLUE);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(plot);
        out.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(
                baos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bais);
        MultiplePiePlot restored = (MultiplePiePlot) in.readObject();
        in.close();

        assertEquals(plot.getAggregatedItemsPaint(),
                restored.getAggregatedItemsPaint());
        assertEquals(plot.getAggregatedItemsKey(),
                restored.getAggregatedItemsKey());
        assertEquals(plot.getLimit(), restored.getLimit(), 0.0000001);
        assertEquals(plot.getDataExtractOrder(),
                restored.getDataExtractOrder());
    }
}