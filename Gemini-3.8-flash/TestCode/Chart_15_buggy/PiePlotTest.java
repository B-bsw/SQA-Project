package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.PieToolTipGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.urls.PieURLGenerator;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.UnitType;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetChangeListener;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.junit.Assert;
import org.junit.Test;

public class PiePlotTest {

    private static class RecordingPlotChangeListener implements PlotChangeListener {
        private int eventCount = 0;
        private PlotChangeEvent lastEvent;

        public void plotChanged(PlotChangeEvent event) {
            this.eventCount++;
            this.lastEvent = event;
        }

        public int getEventCount() {
            return this.eventCount;
        }

        public PlotChangeEvent getLastEvent() {
            return this.lastEvent;
        }
    }

    private static class MockPieURLGenerator implements PieURLGenerator, PublicCloneable {
        private String prefix;

        public MockPieURLGenerator(String prefix) {
            this.prefix = prefix;
        }

        public String generateURL(PieDataset dataset, Comparable key, int pieIndex) {
            return this.prefix + "?section=" + String.valueOf(key) + "&pie=" + pieIndex;
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MockPieURLGenerator)) {
                return false;
            }
            MockPieURLGenerator that = (MockPieURLGenerator) obj;
            if (this.prefix == null) {
                return that.prefix == null;
            }
            return this.prefix.equals(that.prefix);
        }
    }

    private static class MockPieToolTipGenerator implements PieToolTipGenerator {
        public String generateToolTip(PieDataset dataset, Comparable key) {
            return "Tip:" + String.valueOf(key);
        }

        public boolean equals(Object obj) {
            return (obj instanceof MockPieToolTipGenerator);
        }
    }

    @Test
    public void testConstructor_default_shouldInitializeProperly() {
        PiePlot plot = new PiePlot();
        Assert.assertNull(plot.getDataset());
        Assert.assertEquals(0, plot.getPieIndex());
        Assert.assertEquals(PiePlot.DEFAULT_INTERIOR_GAP, plot.getInteriorGap(), 0.000001);
        Assert.assertTrue(plot.isCircular());
        Assert.assertEquals(PiePlot.DEFAULT_START_ANGLE, plot.getStartAngle(), 0.000001);
        Assert.assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        Assert.assertEquals(PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW, plot.getMinimumArcAngleToDraw(), 0.000001);
        Assert.assertTrue(plot.getSectionOutlinesVisible());
        Assert.assertEquals(Color.gray, plot.getBaseSectionPaint());
        Assert.assertEquals(Color.gray, plot.getShadowPaint());
        Assert.assertEquals(4.0, plot.getShadowXOffset(), 0.000001);
        Assert.assertEquals(4.0, plot.getShadowYOffset(), 0.000001);
        Assert.assertFalse(plot.getSimpleLabels());
        Assert.assertTrue(plot.getLabelLinksVisible());
        Assert.assertFalse(plot.getIgnoreNullValues());
        Assert.assertFalse(plot.getIgnoreZeroValues());
        Assert.assertNotNull(plot.getLabelGenerator());
        Assert.assertNotNull(plot.getLegendLabelGenerator());
        Assert.assertEquals(Plot.DEFAULT_LEGEND_ITEM_CIRCLE, plot.getLegendItemShape());
    }

    @Test
    public void testConstructor_withDataset_shouldAttachListener() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        PiePlot plot = new PiePlot(dataset);
        Assert.assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDataset_givenNewDataset_shouldUpdateAndNotify() {
        PiePlot plot = new PiePlot();
        DefaultPieDataset ds1 = new DefaultPieDataset();
        ds1.setValue("Section1", 10.0);
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDataset(ds1);
        Assert.assertSame(ds1, plot.getDataset());
        Assert.assertTrue(listener.getEventCount() > 0);

        DefaultPieDataset ds2 = new DefaultPieDataset();
        ds2.setValue("Section2", 20.0);
        plot.setDataset(ds2);
        Assert.assertSame(ds2, plot.getDataset());

        plot.setDataset(null);
        Assert.assertNull(plot.getDataset());
    }

    @Test
    public void testSetPieIndex_givenValue_shouldUpdate() {
        PiePlot plot = new PiePlot();
        plot.setPieIndex(3);
        Assert.assertEquals(3, plot.getPieIndex());
    }

    @Test
    public void testSetStartAngle_givenValue_shouldUpdateAndNotify() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setStartAngle(180.0);
        Assert.assertEquals(180.0, plot.getStartAngle(), 0.000001);
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void testSetDirection_givenValidRotation_shouldUpdateAndNotify() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setDirection(Rotation.ANTICLOCKWISE);
        Assert.assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDirection_givenNull_shouldThrowException() {
        PiePlot plot = new PiePlot();
        plot.setDirection(null);
    }

    @Test
    public void testSetInteriorGap_givenValidValue_shouldUpdateAndNotify() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setInteriorGap(0.25);
        Assert.assertEquals(0.25, plot.getInteriorGap(), 0.000001);
        Assert.assertEquals(1, listener.getEventCount());

        plot.setInteriorGap(0.25);
        Assert.assertEquals(1, listener.getEventCount());

        plot.setInteriorGap(0.0);
        Assert.assertEquals(0.0, plot.getInteriorGap(), 0.000001);

        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP);
        Assert.assertEquals(PiePlot.MAX_INTERIOR_GAP, plot.getInteriorGap(), 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_givenNegative_shouldThrowException() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_givenAboveMax_shouldThrowException() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(0.40001);
    }

    @Test
    public void testSetCircular_shouldUpdateAndNotifyOptionally() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setCircular(false);
        Assert.assertFalse(plot.isCircular());
        Assert.assertEquals(1, listener.getEventCount());

        plot.setCircular(true, false);
        Assert.assertTrue(plot.isCircular());
        Assert.assertEquals(1, listener.getEventCount());

        plot.setCircular(false, true);
        Assert.assertFalse(plot.isCircular());
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test
    public void testSetIgnoreNullValues_shouldUpdateAndNotify() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setIgnoreNullValues(true);
        Assert.assertTrue(plot.getIgnoreNullValues());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void testSetIgnoreZeroValues_shouldUpdateAndNotify() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setIgnoreZeroValues(true);
        Assert.assertTrue(plot.getIgnoreZeroValues());
        Assert.assertEquals(1, listener.getEventCount());
    }

    @Test
    public void testSectionPaint_lookupAndOverrides() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        Assert.assertNull(plot.getSectionPaint("Key1"));
        Assert.assertEquals(Color.gray, plot.lookupSectionPaint("Key1"));

        plot.setSectionPaint("Key1", Color.red);
        Assert.assertEquals(Color.red, plot.getSectionPaint("Key1"));
        Assert.assertEquals(Color.red, plot.lookupSectionPaint("Key1"));
        Assert.assertEquals(1, listener.getEventCount());

        plot.setBaseSectionPaint(Color.blue);
        Assert.assertEquals(Color.blue, plot.getBaseSectionPaint());
        Assert.assertEquals(Color.blue, plot.lookupSectionPaint("UnknownKey"));
        Assert.assertEquals(2, listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionPaint_givenNull_shouldThrowException() {
        PiePlot plot = new PiePlot();
        plot.setBaseSectionPaint(null);
    }

    @Test
    public void testLookupSectionPaint_withAutoPopulate() {
        PiePlot plot = new PiePlot();
        DefaultDrawingSupplier supplier = new DefaultDrawingSupplier();
        plot.setDrawingSupplier(supplier);

        Paint p = plot.lookupSectionPaint("KeyAuto", true);
        Assert.assertNotNull(p);
        Assert.assertEquals(p, plot.getSectionPaint("KeyAuto"));

        plot.setDrawingSupplier(null);
        Paint p2 = plot.lookupSectionPaint("KeyNoDS", true);
        Assert.assertEquals(plot.getBaseSectionPaint(), p2);
    }

    @Test
    public void testSectionOutlinePaint_lookupAndOverrides() {
        PiePlot plot = new PiePlot();
        RecordingPlotChangeListener listener = new RecordingPlotChangeListener();
        plot.addChangeListener(listener);

        Assert.assertNull(plot.getSectionOutlinePaint("Key1"));
        Assert.assertEquals(Plot.DEFAULT_OUTLINE_PAINT, plot.lookupSectionOutlinePaint("Key1"));

        plot.setSectionOutlinePaint("Key1", Color.yellow);
        Assert.assertEquals(Color.yellow, plot.getSectionOutlinePaint("Key1"));
        Assert.assertEquals(Color.yellow, plot.lookupSectionOutlinePaint("Key1"));