package org.jfree.chart.plot;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.PieToolTipGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.urls.PieURLGenerator;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.UnitType;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class PiePlotTest {

    private static class TestListener implements PlotChangeListener {
        int count = 0;
        public void plotChanged(PlotChangeEvent event) {
            count++;
        }
    }

    private Graphics2D createGraphics() {
        BufferedImage img = new BufferedImage(300, 300,
                BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }

    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", new Double(10.0));
        dataset.setValue("B", new Double(20.0));
        dataset.setValue("C", new Double(30.0));
        return dataset;
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        PiePlot plot = new PiePlot();
        assertNull(plot.getDataset());
        assertEquals(0, plot.getPieIndex());
        assertEquals(PiePlot.DEFAULT_INTERIOR_GAP, plot.getInteriorGap(), 0.0000001);
        assertTrue(plot.isCircular());
        assertEquals(PiePlot.DEFAULT_START_ANGLE, plot.getStartAngle(), 0.0000001);
        assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        assertFalse(plot.getIgnoreNullValues());
        assertFalse(plot.getIgnoreZeroValues());
        assertTrue(plot.getSectionOutlinesVisible());
        assertTrue(plot.getLabelLinksVisible());
        assertFalse(plot.getSimpleLabels());
        assertEquals(PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW,
                plot.getMinimumArcAngleToDraw(), 0.0000000001);
    }

    @Test
    public void testConstructorWithDataset() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        assertSame(dataset, plot.getDataset());
    }

    // ---------------------------------------------------------------
    // dataset
    // ---------------------------------------------------------------

    @Test
    public void testSetDataset() {
        PiePlot plot = new PiePlot();
        DefaultPieDataset dataset = createDataset();
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() {
        PiePlot plot = new PiePlot(createDataset());
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    // ---------------------------------------------------------------
    // pieIndex
    // ---------------------------------------------------------------

    @Test
    public void testGetSetPieIndex() {
        PiePlot plot = new PiePlot();
        plot.setPieIndex(5);
        assertEquals(5, plot.getPieIndex());
    }

    // ---------------------------------------------------------------
    // startAngle
    // ---------------------------------------------------------------

    @Test
    public void testGetSetStartAngle() {
        PiePlot plot = new PiePlot();
        TestListener listener = new TestListener();
        plot.addChangeListener(listener);
        plot.setStartAngle(45.0);
        assertEquals(45.0, plot.getStartAngle(), 0.0000001);
        assertEquals(1, listener.count);
    }

    // ---------------------------------------------------------------
    // direction
    // ---------------------------------------------------------------

    @Test
    public void testGetSetDirection() {
        PiePlot plot = new PiePlot();
        plot.setDirection(Rotation.ANTICLOCKWISE);
        assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDirectionNull() {
        PiePlot plot = new PiePlot();
        plot.setDirection(null);
    }

    // ---------------------------------------------------------------
    // interiorGap
    // ---------------------------------------------------------------

    @Test
    public void testGetSetInteriorGapBoundaries() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(0.0);
        assertEquals(0.0, plot.getInteriorGap(), 0.0000001);
        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP);
        assertEquals(PiePlot.MAX_INTERIOR_GAP, plot.getInteriorGap(),
                0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGapTooLow() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGapTooHigh() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP + 0.01);
    }

    @Test
    public void testSetInteriorGapSameValueNoNotify() {
        PiePlot plot = new PiePlot();
        TestListener listener = new TestListener();
        plot.addChangeListener(listener);
        plot.setInteriorGap(plot.getInteriorGap());
        assertEquals(0, listener.count);
    }

    // ---------------------------------------------------------------
    // circular
    // ---------------------------------------------------------------

    @Test
    public void testSetCircularOneArg() {
        PiePlot plot = new PiePlot();
        TestListener listener = new TestListener();
        plot.addChangeListener(listener);
        plot.setCircular(false);
        assertFalse(plot.isCircular());
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetCircularTwoArgsNoNotify() {
        PiePlot plot = new PiePlot();
        TestListener listener = new TestListener();
        plot.addChangeListener(listener);
        plot.setCircular(false, false);
        assertFalse(plot.isCircular());
        assertEquals(0, listener.count);
    }

    // ---------------------------------------------------------------
    // ignore null/zero values
    // ---------------------------------------------------------------

    @Test
    public void testGetSetIgnoreNullValues() {
        PiePlot plot = new PiePlot();
        plot.setIgnoreNullValues(true);
        assertTrue(plot.getIgnoreNullValues());
    }

    @Test
    public void testGetSetIgnoreZeroValues() {
        PiePlot plot = new PiePlot();
        plot.setIgnoreZeroValues(true);
        assertTrue(plot.getIgnoreZeroValues());
    }

    // ---------------------------------------------------------------
    // lookupSectionPaint / getSectionKey (protected)
    // ---------------------------------------------------------------

    @Test
    public void testLookupSectionPaintDirect() {
        PiePlot plot = new PiePlot(createDataset());
        plot.setSectionPaint("A", Color.RED);
        assertEquals(Color.RED, plot.lookupSectionPaint("A"));
    }

    @Test
    public void testLookupSectionPaintFallbackToBase() {
        PiePlot plot = new PiePlot(createDataset());
        assertEquals(plot.getBaseSectionPaint(),
                plot.lookupSectionPaint("Z"));
    }

    @Test
    public void testLookupSectionPaintAutoPopulateNoSupplier() {
        PiePlot plot = new PiePlot(createDataset());
        Paint result = plot.lookupSectionPaint("Z", true);
        assertNotNull(result);
    }

    @Test
    public void testGetSectionKeyNullDataset() {
        PiePlot plot = new PiePlot();
        Comparable key = plot.getSectionKey(0);
        assertEquals(new Integer(0), key);
    }

    @Test
    public void testGetSectionKeyValid() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        Comparable key = plot.getSectionKey(0);
        assertEquals("A", key);
    }

    @Test
    public void testGetSectionKeyOutOfRange() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        Comparable key = plot.getSectionKey(99);
        assertEquals(new Integer(99), key);
    }

    // ---------------------------------------------------------------
    // section paint
    // ---------------------------------------------------------------

    @Test
    public void testGetSetSectionPaint() {
        PiePlot plot = new PiePlot();
        plot.setSectionPaint("A", Color.BLUE);
        assertEquals(Color.BLUE, plot.getSectionPaint("A"));
    }

    @Test
    public void testGetSetBaseSectionPaint() {
        PiePlot plot = new PiePlot();
        plot.setBaseSectionPaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getBaseSectionPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionPaintNull() {
        PiePlot plot = new PiePlot();
        plot.setBaseSectionPaint(null);
    }

    // ---------------------------------------------------------------
    // section outlines visible
    // ---------------------------------------------------------------

    @Test
    public void testGetSetSectionOutlinesVisible() {
        PiePlot plot = new PiePlot();
        plot.setSectionOutlinesVisible(false);
        assertFalse(plot.getSectionOutlinesVisible());
    }

    // ---------------------------------------------------------------
    // section outline paint
    // ---------------------------------------------------------------

    @Test
    public void testLookupSectionOutlinePaint() {
        PiePlot plot = new PiePlot(createDataset());
        plot.setSectionOutlinePaint("A", Color.MAGENTA);
        assertEquals(Color.MAGENTA, plot.lookupSectionOutlinePaint("A"));
        assertEquals(plot.getBaseSectionOutlinePaint(),
                plot.lookupSectionOutlinePaint("Z"));
        assertNotNull(plot.lookupSectionOutlinePaint("Z", true));
    }

    @Test
    public void testGetSetSectionOutlinePaint() {
        PiePlot plot = new PiePlot();
        plot.setSectionOutlinePaint("A", Color.CYAN);
        assertEquals(Color.CYAN, plot.getSectionOutlinePaint("A"));
    }

    @Test
    public void testGetSetBaseSectionOutlinePaint() {
        PiePlot plot = new PiePlot();
        plot.setBaseSectionOutlinePaint(Color.YELLOW);
        assertEquals(Color.YELLOW, plot.getBaseSectionOutlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlinePaintNull() {
        PiePlot plot = new PiePlot();
        plot.setBaseSectionOutlinePaint(null);
    }

    // ---------------------------------------------------------------
    // section outline stroke
    // ---------------------------------------------------------------

    @Test
    public void testLookupSectionOutlineStroke() {
        PiePlot plot = new PiePlot(createDataset());
        BasicStroke stroke = new BasicStroke(2.0f);
        plot.setSectionOutlineStroke("A", stroke);
        assertEquals(stroke, plot.lookupSectionOutlineStroke("A"));
        assertEquals(plot.getBaseSectionOutlineStroke(),
                plot.lookupSectionOutlineStroke("Z"));
        assertNotNull(plot.lookupSectionOutlineStroke("Z", true));
    }

    @Test
    public void testGetSetSectionOutlineStroke() {
        PiePlot plot = new PiePlot();
        BasicStroke stroke = new BasicStroke(3.0f);
        plot.setSectionOutlineStroke("A", stroke);
        assertEquals(stroke, plot.getSectionOutlineStroke("A"));
    }

    @Test
    public void testGetSetBaseSectionOutlineStroke() {
        PiePlot plot = new PiePlot();
        BasicStroke stroke = new BasicStroke(4.0f);
        plot.setBaseSectionOutlineStroke(stroke);
        assertEquals(stroke, plot.getBaseSectionOutlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlineStrokeNull() {
        PiePlot plot = new PiePlot();
        plot.setBaseSectionOutlineStroke(null);
    }

    // ---------------------------------------------------------------
    // shadow
    // ---------------------------------------------------------------

    @Test
    public void testGetSetShadowPaint() {
        PiePlot plot = new PiePlot();
        plot.setShadowPaint(Color.LIGHT_GRAY);
        assertEquals(Color.LIGHT_GRAY, plot.getShadowPaint());
    }

    @Test
    public void testGetSetShadowXOffset() {
        PiePlot plot = new PiePlot();
        plot.setShadowXOffset(10.0);
        assertEquals(10.0, plot.getShadowXOffset(), 0.0000001);
    }

    @Test
    public void testGetSetShadowYOffset() {
        PiePlot plot = new PiePlot();
        plot.setShadowYOffset(12.0);
        assertEquals(12.0, plot.getShadowYOffset(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // explode percent
    // ---------------------------------------------------------------

    @Test
    public void testGetSetExplodePercent() {
        PiePlot plot = new PiePlot();
        plot.setExplodePercent("A", 0.3);
        assertEquals(0.3, plot.getExplodePercent("A"), 0.0000001);
        assertEquals(0.0, plot.getExplodePercent("NOTHING"), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetExplodePercentNullKey() {
        PiePlot plot = new PiePlot();
        plot.setExplodePercent(null, 0.5);
    }

    @Test
    public void testGetMaximumExplodePercent() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        assertEquals(0.0, plot.getMaximumExplodePercent(), 0.0000001);
        plot.setExplodePercent("A", 0.2);
        plot.setExplodePercent("B", 0.5);
        assertEquals(0.5, plot.getMaximumExplodePercent(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // label generator
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLabelGenerator() {
        PiePlot plot = new PiePlot();
        StandardPieSectionLabelGenerator gen =
                new StandardPieSectionLabelGenerator();
        plot.setLabelGenerator(gen);
        assertSame(gen, plot.getLabelGenerator());
    }

    @Test
    public void testSetLabelGeneratorNull() {
        PiePlot plot = new PiePlot();
        plot.setLabelGenerator(null);
        assertNull(plot.getLabelGenerator());
    }

    // ---------------------------------------------------------------
    // label gap / max label width
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLabelGap() {
        PiePlot plot = new PiePlot();
        plot.setLabelGap(0.05);
        assertEquals(0.05, plot.getLabelGap(), 0.0000001);
    }

    @Test
    public void testGetSetMaximumLabelWidth() {
        PiePlot plot = new PiePlot();
        plot.setMaximumLabelWidth(0.25);
        assertEquals(0.25, plot.getMaximumLabelWidth(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // label links
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLabelLinksVisible() {
        PiePlot plot = new PiePlot();
        plot.setLabelLinksVisible(false);
        assertFalse(plot.getLabelLinksVisible());
    }

    @Test
    public void testGetSetLabelLinkMargin() {
        PiePlot plot = new PiePlot();
        plot.setLabelLinkMargin(0.1);
        assertEquals(0.1, plot.getLabelLinkMargin(), 0.0000001);
    }

    @Test
    public void testGetSetLabelLinkPaint() {
        PiePlot plot = new PiePlot();
        plot.setLabelLinkPaint(Color.PINK);
        assertEquals(Color.PINK, plot.getLabelLinkPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkPaintNull() {
        PiePlot plot = new PiePlot();
        plot.setLabelLinkPaint(null);
    }

    @Test
    public void testGetSetLabelLinkStroke() {
        PiePlot plot = new PiePlot();
        BasicStroke stroke = new BasicStroke(1.5f);
        plot.setLabelLinkStroke(stroke);
        assertEquals(stroke, plot.getLabelLinkStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkStrokeNull() {
        PiePlot plot = new PiePlot();
        plot.setLabelLinkStroke(null);
    }

    // ---------------------------------------------------------------
    // label font / paint
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLabelFont() {
        PiePlot plot = new PiePlot();
        Font font = new Font("Serif", Font.BOLD, 12);
        plot.setLabelFont(font);
        assertEquals(font, plot.getLabelFont());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFontNull() {
        PiePlot plot = new PiePlot();
        plot.setLabelFont(null);
    }

    @Test
    public void testGetSetLabelPaint() {
        PiePlot plot = new PiePlot();
        plot.setLabelPaint(Color.ORANGE);
        assertEquals(Color.ORANGE, plot.getLabelPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaintNull() {
        PiePlot plot = new PiePlot();
        plot.setLabelPaint(null);
    }

    // ---------------------------------------------------------------
    // label background/outline/shadow paint
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLabelBackgroundPaint() {
        PiePlot plot = new PiePlot();
        plot.setLabelBackgroundPaint(Color.WHITE);
        assertEquals(Color.WHITE, plot.getLabelBackgroundPaint());
        plot.setLabelBackgroundPaint(null);
        assertNull(plot.getLabelBackgroundPaint());
    }

    @Test
    public void testGetSetLabelOutlinePaint() {
        PiePlot plot = new PiePlot();
        plot.setLabelOutlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getLabelOutlinePaint());
        plot.setLabelOutlinePaint(null);
        assertNull(plot.getLabelOutlinePaint());
    }

    @Test
    public void testGetSetLabelOutlineStroke() {
        PiePlot plot = new PiePlot();
        BasicStroke stroke = new BasicStroke(2.5f);
        plot.setLabelOutlineStroke(stroke);
        assertEquals(stroke, plot.getLabelOutlineStroke());
        plot.setLabelOutlineStroke(null);
        assertNull(plot.getLabelOutlineStroke());
    }

    @Test
    public void testGetSetLabelShadowPaint() {
        PiePlot plot = new PiePlot();
        plot.setLabelShadowPaint(Color.DARK_GRAY);
        assertEquals(Color.DARK_GRAY, plot.getLabelShadowPaint());
        plot.setLabelShadowPaint(null);
        assertNull(plot.getLabelShadowPaint());
    }

    // ---------------------------------------------------------------
    // label padding
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLabelPadding() {
        PiePlot plot = new PiePlot();
        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        plot.setLabelPadding(insets);
        assertEquals(insets, plot.getLabelPadding());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaddingNull() {
        PiePlot plot = new PiePlot();
        plot.setLabelPadding(null);
    }

    // ---------------------------------------------------------------
    // simple labels
    // ---------------------------------------------------------------

    @Test
    public void testGetSetSimpleLabels() {
        PiePlot plot = new PiePlot();
        plot.setSimpleLabels(true);
        assertTrue(plot.getSimpleLabels());
    }

    @Test
    public void testGetSetSimpleLabelOffset() {
        PiePlot plot = new PiePlot();
        RectangleInsets offset = new RectangleInsets(UnitType.RELATIVE,
                0.1, 0.1, 0.1, 0.1);
        plot.setSimpleLabelOffset(offset);
        assertEquals(offset, plot.getSimpleLabelOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSimpleLabelOffsetNull() {
        PiePlot plot = new PiePlot();
        plot.setSimpleLabelOffset(null);
    }

    // ---------------------------------------------------------------
    // label distributor
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLabelDistributor() {
        PiePlot plot = new PiePlot();
        AbstractPieLabelDistributor dist = new PieLabelDistributor(3);
        plot.setLabelDistributor(dist);
        assertSame(dist, plot.getLabelDistributor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelDistributorNull() {
        PiePlot plot = new PiePlot();
        plot.setLabelDistributor(null);
    }

    // ---------------------------------------------------------------
    // tooltip / url generator
    // ---------------------------------------------------------------

    @Test
    public void testGetSetToolTipGenerator() {
        PiePlot plot = new PiePlot();
        PieToolTipGenerator gen = new PieToolTipGenerator() {
            public String generateToolTip(PieDataset dataset,
                    Comparable key) {
                return "tip";
            }
        };
        plot.setToolTipGenerator(gen);
        assertSame(gen, plot.getToolTipGenerator());
    }

    @Test
    public void testGetSetURLGenerator() {
        PiePlot plot = new PiePlot();
        PieURLGenerator gen = new PieURLGenerator() {
            public String generateURL(PieDataset dataset, Comparable key,
                    int pieIndex) {
                return "url";
            }
        };
        plot.setURLGenerator(gen);
        assertSame(gen, plot.getURLGenerator());
    }

    // ---------------------------------------------------------------
    // minimum arc angle to draw
    // ---------------------------------------------------------------

    @Test
    public void testGetSetMinimumArcAngleToDraw() {
        PiePlot plot = new PiePlot();
        plot.setMinimumArcAngleToDraw(0.5);
        assertEquals(0.5, plot.getMinimumArcAngleToDraw(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // legend item shape
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLegendItemShape() {
        PiePlot plot = new PiePlot();
        Shape shape = new Ellipse2D.Double(0, 0, 5, 5);
        plot.setLegendItemShape(shape);
        assertEquals(shape, plot.getLegendItemShape());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemShapeNull() {
        PiePlot plot = new PiePlot();
        plot.setLegendItemShape(null);
    }

    // ---------------------------------------------------------------
    // legend label generator / tooltip / url
    // ---------------------------------------------------------------

    @Test
    public void testGetSetLegendLabelGenerator() {
        PiePlot plot = new PiePlot();
        StandardPieSectionLabelGenerator gen =
                new StandardPieSectionLabelGenerator();
        plot.setLegendLabelGenerator(gen);
        assertSame(gen, plot.getLegendLabelGenerator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendLabelGeneratorNull() {
        PiePlot plot = new PiePlot();
        plot.setLegendLabelGenerator(null);
    }

    @Test
    public void testGetSetLegendLabelToolTipGenerator() {
        PiePlot plot = new PiePlot();
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator();
        plot.setLegendLabelToolTipGenerator(gen);
        assertSame(gen, plot.getLegendLabelToolTipGenerator());
    }

    @Test
    public void testGetSetLegendLabelURLGenerator() {
        PiePlot plot = new PiePlot();
        PieURLGenerator gen = new PieURLGenerator() {
            public String generateURL(PieDataset dataset, Comparable key,
                    int pieIndex) {
                return "legendurl";
            }
        };
        plot.setLegendLabelURLGenerator(gen);
        assertSame(gen, plot.getLegendLabelURLGenerator());
    }

    // ---------------------------------------------------------------
    // initialise
    // ---------------------------------------------------------------

    @Test
    public void testInitialise() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        PiePlotState state = plot.initialise(g2, area, plot, null, null);
        assertEquals(2, state.getPassesRequired());
        assertEquals(60.0, state.getTotal(), 0.0000001);
        assertEquals(90.0, state.getLatestAngle(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // draw
    // ---------------------------------------------------------------

    @Test
    public void testDrawWithData() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null);
        // no exception means success; verify state unaffected externally
        assertNotNull(plot.getDataset());
    }

    @Test
    public void testDrawWithSimpleLabels() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        plot.setSimpleLabels(true);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null);
        assertTrue(plot.getSimpleLabels());
    }

    @Test
    public void testDrawWithEmptyDataset() {
        PiePlot plot = new PiePlot(new DefaultPieDataset());
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null);
        assertNotNull(plot.getDataset());
    }

    @Test
    public void testDrawWithNullDataset() {
        PiePlot plot = new PiePlot(null);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testDrawWithNullAndZeroValues() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", new Double(30.0));
        dataset.setValue("B", new Double(0.0));
        dataset.setValue("C", null);
        PiePlot plot = new PiePlot(dataset);
        plot.setIgnoreNullValues(true);
        plot.setIgnoreZeroValues(true);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null);
        assertTrue(plot.getIgnoreNullValues());
        assertTrue(plot.getIgnoreZeroValues());
    }

    // ---------------------------------------------------------------
    // drawItem (protected) direct tests
    // ---------------------------------------------------------------

    @Test
    public void testDrawItemClockwiseUpdatesAngle() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        plot.setDirection(Rotation.CLOCKWISE);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        PiePlotState state = plot.initialise(g2, area, plot, null, null);
        Rectangle2D pieArea = new Rectangle2D.Double(10, 10, 100, 100);
        state.setPieArea(pieArea);
        state.setExplodedPieArea(pieArea);
        state.setPieCenterX(pieArea.getCenterX());
        state.setPieCenterY(pieArea.getCenterY());
        state.setPieWRadius(50);
        state.setPieHRadius(50);

        plot.drawItem(g2, 0, pieArea, state, 0);
        plot.drawItem(g2, 0, pieArea, state, 1);

        // value=10, total=60 => angle change = 10/60*360=60, clockwise reduces
        assertEquals(30.0, state.getLatestAngle(), 0.001);
    }

    @Test
    public void testDrawItemAnticlockwiseUpdatesAngle() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        plot.setDirection(Rotation.ANTICLOCKWISE);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        PiePlotState state = plot.initialise(g2, area, plot, null, null);
        Rectangle2D pieArea = new Rectangle2D.Double(10, 10, 100, 100);
        state.setPieArea(pieArea);
        state.setExplodedPieArea(pieArea);
        state.setPieCenterX(pieArea.getCenterX());
        state.setPieCenterY(pieArea.getCenterY());
        state.setPieWRadius(50);
        state.setPieHRadius(50);

        plot.drawItem(g2, 0, pieArea, state, 0);
        plot.drawItem(g2, 0, pieArea, state, 1);

        assertEquals(150.0, state.getLatestAngle(), 0.001);
    }

    @Test
    public void testDrawItemBelowMinimumArcAngle() {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        plot.setMinimumArcAngleToDraw(1000.0);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        PiePlotState state = plot.initialise(g2, area, plot, null, null);
        Rectangle2D pieArea = new Rectangle2D.Double(10, 10, 100, 100);
        state.setPieArea(pieArea);
        state.setExplodedPieArea(pieArea);
        state.setPieCenterX(pieArea.getCenterX());
        state.setPieCenterY(pieArea.getCenterY());
        state.setPieWRadius(50);
        state.setPieHRadius(50);

        plot.drawItem(g2, 0, pieArea, state, 1);
        // angle still updated even though not drawn
        assertEquals(30.0, state.getLatestAngle(), 0.001);
    }

    @Test
    public void testDrawItemWithNullValue() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", null);
        PiePlot plot = new PiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        PiePlotState state = plot.initialise(g2, area, plot, null, null);
        Rectangle2D pieArea = new Rectangle2D.Double(10, 10, 100, 100);
        state.setPieArea(pieArea);
        state.setExplodedPieArea(pieArea);
        state.setPieCenterX(pieArea.getCenterX());
        state.setPieCenterY(pieArea.getCenterY());
        state.setPieWRadius(50);
        state.setPieHRadius(50);
        double before = state.getLatestAngle();
        plot.drawItem(g2, 0, pieArea, state, 1);
        assertEquals(before, state.getLatestAngle(), 0.001);
    }

    // ---------------------------------------------------------------
    // getArcBounds (protected)
    // ---------------------------------------------------------------

    @Test
    public void testGetArcBoundsNoExplode() {
        PiePlot plot = new PiePlot();
        Rectangle2D unexploded = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D exploded = new Rectangle2D.Double(-10, -10, 120, 120);
        Rectangle2D result = plot.getArcBounds(unexploded, exploded, 0, 90,
                0.0);
        assertEquals(unexploded, result);
    }

    @Test
    public void testGetArcBoundsWithExplode() {
        PiePlot plot = new PiePlot();
        Rectangle2D unexploded = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D exploded = new Rectangle2D.Double(-10, -10, 120, 120);
        Rectangle2D result = plot.getArcBounds(unexploded, exploded, 0, 90,
                0.5);
        assertNotNull(result);
        assertEquals(unexploded.getWidth(), result.getWidth(), 0.001);
        assertEquals(unexploded.getHeight(), result.getHeight(), 0.001);
    }

    // ---------------------------------------------------------------
    // getLegendItems
    // ---------------------------------------------------------------

    @Test
    public void testGetLegendItemsNullDataset() {
        PiePlot plot = new PiePlot();
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsWithData() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", new Double(10.0));
        dataset.setValue("B", new Double(0.0));
        dataset.setValue("C", null);
        dataset.setValue("D", new Double(-5.0));
        PiePlot plot = new PiePlot(dataset);
        // default: ignoreNullValues=false, ignoreZeroValues=false
        LegendItemCollection items = plot.getLegendItems();
        // A included (positive), B included (zero, not ignored),
        // C included (null, not ignored), D excluded (negative)
        assertEquals(3, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsIgnoreNullAndZero() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", new Double(10.0));
        dataset.setValue("B", new Double(0.0));
        dataset.setValue("C", null);
        PiePlot plot = new PiePlot(dataset);
        plot.setIgnoreNullValues(true);
        plot.setIgnoreZeroValues(true);
        LegendItemCollection items = plot.getLegendItems();
        assertEquals(1, items.getItemCount());
        LegendItem item = items.get(0);
        assertEquals("A", item.getSeriesKey());
    }

    // ---------------------------------------------------------------
    // getPlotType
    // ---------------------------------------------------------------

    @Test
    public void testGetPlotType() {
        PiePlot plot = new PiePlot();
        String type = plot.getPlotType();
        assertNotNull(type);
        assertTrue(type.length() > 0);
    }

    // ---------------------------------------------------------------
    // equals
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        PiePlot plot = new PiePlot();
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentType() {
        PiePlot plot = new PiePlot();
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsTwoDefaultInstances() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));
    }

    @Test
    public void testEqualsDifferentPieIndex() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setPieIndex(9);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentInteriorGap() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setInteriorGap(0.2);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentCircular() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setCircular(false);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentStartAngle() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setStartAngle(10.0);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentDirection() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setDirection(Rotation.ANTICLOCKWISE);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentIgnoreZero() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setIgnoreZeroValues(true);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentIgnoreNull() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setIgnoreNullValues(true);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentSectionOutlinesVisible() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setSectionOutlinesVisible(false);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentSimpleLabels() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setSimpleLabels(true);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentLabelLinksVisible() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setLabelLinksVisible(false);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testEqualsDifferentMinimumArcAngle() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        plot2.setMinimumArcAngleToDraw(5.0);
        assertFalse(plot1.equals(plot2));
    }

    // ---------------------------------------------------------------
    // clone
    // ---------------------------------------------------------------

    @Test
    public void testClone() throws Exception {
        DefaultPieDataset dataset = createDataset();
        PiePlot plot = new PiePlot(dataset);
        PiePlot clone = (PiePlot) plot.clone();
        assertNotSame(plot, clone);
        assertEquals(plot, clone);

        // modifying clone's legend item shape should not affect original
        clone.setLegendItemShape(new Ellipse2D.Double(1, 1, 2, 2));
        assertFalse(plot.getLegendItemShape().equals(
                clone.getLegendItemShape()));
    }

    // ---------------------------------------------------------------
    // serialization
    // ---------------------------------------------------------------

    @Test
    public void testSerialization() throws Exception {
        PiePlot plot = new PiePlot();
        plot.setBaseSectionPaint(Color.RED);
        plot.setShadowPaint(Color.BLUE);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(plot);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(out.toByteArray()));
        PiePlot restored = (PiePlot) ois.readObject();
        ois.close();

        assertEquals(plot, restored);
        assertEquals(Color.RED, restored.getBaseSectionPaint());
        assertEquals(Color.BLUE, restored.getShadowPaint());
    }
}