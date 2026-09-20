package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.lang.String str7 = valueMarker5.getLabel();
        valueMarker5.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getLabelPaint();
        valueMarker5.setPaint(paint12);
        valueMarker2.setOutlinePaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setValue((double) (short) 0);
        java.awt.Stroke stroke19 = valueMarker16.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint12, stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker22.getLabelOffset();
        float float24 = valueMarker22.getAlpha();
        java.awt.Font font25 = valueMarker22.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker22.getLabelOffset();
        valueMarker20.setLabelOffset(rectangleInsets26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker22", valueMarker11.equals(valueMarker22) ? valueMarker11.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint4 = valueMarker3.getPaint();
        java.awt.Paint paint5 = valueMarker3.getPaint();
        valueMarker3.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker3.getLabelTextAnchor();
        java.awt.Font font9 = valueMarker3.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker3.removeChangeListener(markerChangeListener10);
        float float12 = valueMarker3.getAlpha();
        valueMarker3.setLabel("hi!");
        java.awt.Stroke stroke15 = valueMarker3.getStroke();
        java.awt.Paint paint16 = valueMarker3.getLabelPaint();
        valueMarker1.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        java.awt.Font font22 = valueMarker19.getLabelFont();
        valueMarker19.setValue((double) (short) 0);
        valueMarker19.setValue((double) (byte) 10);
        java.awt.Paint paint27 = valueMarker19.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker29.getLabelAnchor();
        java.awt.Stroke stroke33 = valueMarker29.getStroke();
        java.awt.Paint paint34 = valueMarker29.getLabelPaint();
        double double35 = valueMarker29.getValue();
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        valueMarker19.setPaint(paint36);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker39.getLabelOffset();
        java.awt.Paint paint41 = valueMarker39.getLabelPaint();
        java.awt.Paint paint42 = valueMarker39.getLabelPaint();
        boolean boolean43 = valueMarker19.equals((java.lang.Object) paint42);
        valueMarker1.setOutlinePaint(paint42);
        java.awt.Stroke stroke45 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = valueMarker48.getLabelAnchor();
        java.awt.Paint paint50 = valueMarker48.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = valueMarker48.getLabelAnchor();
        java.awt.Stroke stroke52 = valueMarker48.getStroke();
        java.awt.Paint paint53 = valueMarker48.getOutlinePaint();
        java.awt.Paint paint54 = valueMarker48.getLabelPaint();
        java.lang.String str55 = valueMarker48.getLabel();
        java.awt.Paint paint56 = valueMarker48.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        float float59 = valueMarker58.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint62 = valueMarker61.getPaint();
        java.awt.Paint paint63 = valueMarker61.getPaint();
        valueMarker61.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = valueMarker61.getLabelOffset();
        java.awt.Font font67 = valueMarker61.getLabelFont();
        java.lang.String str68 = valueMarker61.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener71 = null;
        valueMarker70.addChangeListener(markerChangeListener71);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener73 = null;
        valueMarker70.addChangeListener(markerChangeListener73);
        valueMarker70.setValue((double) 1L);
        java.awt.Font font77 = valueMarker70.getLabelFont();
        java.awt.Stroke stroke78 = valueMarker70.getStroke();
        java.awt.Stroke stroke79 = valueMarker70.getStroke();
        valueMarker61.setOutlineStroke(stroke79);
        valueMarker58.setOutlineStroke(stroke79);
        org.jfree.chart.plot.ValueMarker valueMarker82 = new org.jfree.chart.plot.ValueMarker((double) '#', paint56, stroke79);
        valueMarker1.setOutlineStroke(stroke79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker29 and valueMarker48", valueMarker29.equals(valueMarker48) ? valueMarker29.hashCode() == valueMarker48.hashCode() : true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker14.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker12.setOutlineStroke(stroke18);
        java.awt.Stroke stroke20 = valueMarker12.getOutlineStroke();
        java.lang.String str21 = valueMarker12.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker23.addChangeListener(markerChangeListener24);
        java.lang.String str26 = valueMarker23.getLabel();
        java.awt.Paint paint27 = valueMarker23.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setValue((double) (short) 0);
        java.awt.Paint paint32 = null;
        valueMarker29.setOutlinePaint(paint32);
        java.awt.Paint paint34 = valueMarker29.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = valueMarker29.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker29.getLabelTextAnchor();
        valueMarker23.setLabelTextAnchor(textAnchor36);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker23.getLabelOffsetType();
        valueMarker12.setLabelOffsetType(lengthAdjustmentType38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker12.addChangeListener(markerChangeListener40);
        java.awt.Paint paint42 = valueMarker12.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint42);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint46 = valueMarker45.getPaint();
        java.awt.Paint paint47 = valueMarker45.getPaint();
        valueMarker45.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor50 = valueMarker45.getLabelTextAnchor();
        java.awt.Font font51 = valueMarker45.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker45.removeChangeListener(markerChangeListener52);
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = valueMarker55.getLabelOffset();
        float float57 = valueMarker55.getAlpha();
        java.awt.Paint paint58 = valueMarker55.getOutlinePaint();
        java.awt.Stroke stroke59 = valueMarker55.getOutlineStroke();
        valueMarker45.setOutlineStroke(stroke59);
        java.awt.Font font61 = valueMarker45.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor62 = valueMarker45.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker23 and valueMarker55", valueMarker23.equals(valueMarker55) ? valueMarker23.hashCode() == valueMarker55.hashCode() : true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.lang.String str16 = valueMarker13.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker13.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker13.notifyListeners(markerChangeEvent18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker13.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker13.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker13.notifyListeners(markerChangeEvent22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker13.getLabelOffset();
        java.awt.Stroke stroke25 = valueMarker13.getStroke();
        valueMarker1.setStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker13", valueMarker5.equals(valueMarker13) ? valueMarker5.hashCode() == valueMarker13.hashCode() : true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker5.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker5.getLabelFont();
        double double9 = valueMarker5.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        java.awt.Paint paint13 = valueMarker11.getPaint();
        valueMarker11.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker11.getLabelTextAnchor();
        java.awt.Font font17 = valueMarker11.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker11.removeChangeListener(markerChangeListener18);
        float float20 = valueMarker11.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker11.getLabelOffsetType();
        valueMarker5.setLabelOffsetType(lengthAdjustmentType21);
        java.awt.Stroke stroke23 = valueMarker5.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke23);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getLabelPaint();
        java.awt.Paint paint29 = valueMarker27.getLabelPaint();
        java.awt.Stroke stroke30 = valueMarker27.getStroke();
        valueMarker1.setOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker27", valueMarker5.equals(valueMarker27) ? valueMarker5.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker2.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker10.getLabelOffset();
        float float12 = valueMarker10.getAlpha();
        java.awt.Paint paint13 = valueMarker10.getOutlinePaint();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint8, stroke14);
        valueMarker15.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker19.getPaint();
        valueMarker15.setPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker19", valueMarker10.equals(valueMarker19) ? valueMarker10.hashCode() == valueMarker19.hashCode() : true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 0, paint3, stroke9);
        java.lang.String str11 = valueMarker10.getLabel();
        float float12 = valueMarker10.getAlpha();
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.awt.Paint paint14 = valueMarker10.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker10.notifyListeners(markerChangeEvent15);
        float float17 = valueMarker10.getAlpha();
        java.lang.String str18 = valueMarker10.getLabel();
        java.lang.Object obj19 = valueMarker10.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker10.addChangeListener(markerChangeListener20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and obj19", valueMarker10.equals(obj19) ? valueMarker10.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker11.getLabelOffset();
        float float13 = valueMarker11.getAlpha();
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        java.awt.Stroke stroke15 = valueMarker11.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke15);
        java.awt.Font font17 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker20.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker20.getStroke();
        java.awt.Paint paint25 = valueMarker20.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker33.getLabelOffset();
        boolean boolean35 = valueMarker27.equals((java.lang.Object) rectangleInsets34);
        valueMarker20.setLabelOffset(rectangleInsets34);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker20.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker20.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker27", valueMarker1.equals(valueMarker27) ? valueMarker1.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker3.removeChangeListener(markerChangeListener4);
        java.awt.Stroke stroke6 = valueMarker3.getOutlineStroke();
        boolean boolean7 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker9.addChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint14 = valueMarker13.getLabelPaint();
        java.awt.Paint paint15 = valueMarker13.getLabelPaint();
        valueMarker9.setOutlinePaint(paint15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor19);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker9.getLabelTextAnchor();
        java.awt.Paint paint22 = valueMarker9.getLabelPaint();
        java.awt.Paint paint23 = valueMarker9.getPaint();
        valueMarker1.setPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker3 and valueMarker18", valueMarker3.equals(valueMarker18) ? valueMarker3.hashCode() == valueMarker18.hashCode() : true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker2.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker2.notifyListeners(markerChangeEvent8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker2.addChangeListener(markerChangeListener10);
        java.awt.Paint paint12 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.lang.String str16 = valueMarker14.getLabel();
        valueMarker14.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        valueMarker14.setPaint(paint21);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker14.notifyListeners(markerChangeEvent23);
        java.awt.Stroke stroke25 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint12, stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker20", valueMarker2.equals(valueMarker20) ? valueMarker2.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker7.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker7.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker14.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker12.setOutlineStroke(stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint10, stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.awt.Paint paint24 = valueMarker22.getPaint();
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker22.getLabelTextAnchor();
        java.awt.Font font28 = valueMarker22.getLabelFont();
        valueMarker20.setLabelFont(font28);
        valueMarker1.setLabelFont(font28);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker1.removeChangeListener(markerChangeListener31);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker1.notifyListeners(markerChangeEvent33);
        java.awt.Paint paint35 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker37.addChangeListener(markerChangeListener38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker37.addChangeListener(markerChangeListener40);
        java.awt.Font font42 = valueMarker37.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker37.getLabelOffset();
        double double44 = valueMarker37.getValue();
        java.awt.Paint paint45 = valueMarker37.getPaint();
        valueMarker1.setPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker37", valueMarker7.equals(valueMarker37) ? valueMarker7.hashCode() == valueMarker37.hashCode() : true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        float float10 = valueMarker1.getAlpha();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        java.awt.Font font15 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker21.getLabelAnchor();
        java.awt.Paint paint23 = valueMarker21.getLabelPaint();
        valueMarker17.setPaint(paint23);
        double double25 = valueMarker17.getValue();
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker17.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        java.awt.Paint paint33 = valueMarker28.getLabelPaint();
        double double34 = valueMarker28.getValue();
        java.awt.Stroke stroke35 = null;
        valueMarker28.setOutlineStroke(stroke35);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker38.addChangeListener(markerChangeListener39);
        java.lang.String str41 = valueMarker38.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = valueMarker38.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker38.getLabelOffsetType();
        java.awt.Stroke stroke44 = valueMarker38.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType45 = valueMarker38.getLabelOffsetType();
        valueMarker28.setLabelOffsetType(lengthAdjustmentType45);
        java.lang.Object obj47 = valueMarker28.clone();
        valueMarker28.setAlpha((float) 1);
        java.awt.Font font50 = valueMarker28.getLabelFont();
        valueMarker17.setLabelFont(font50);
        boolean boolean52 = valueMarker1.equals((java.lang.Object) valueMarker17);
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker54.setValue((double) (short) 0);
        java.awt.Paint paint57 = null;
        valueMarker54.setOutlinePaint(paint57);
        java.awt.Paint paint59 = valueMarker54.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets60 = valueMarker54.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor61 = valueMarker54.getLabelTextAnchor();
        java.lang.Object obj62 = valueMarker54.clone();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener65 = null;
        valueMarker64.addChangeListener(markerChangeListener65);
        java.awt.Font font67 = valueMarker64.getLabelFont();
        valueMarker64.setValue((double) (short) 0);
        valueMarker64.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener72 = null;
        valueMarker64.removeChangeListener(markerChangeListener72);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener74 = null;
        valueMarker64.removeChangeListener(markerChangeListener74);
        float float76 = valueMarker64.getAlpha();
        java.awt.Paint paint77 = valueMarker64.getOutlinePaint();
        valueMarker54.setLabelPaint(paint77);
        valueMarker1.setLabelPaint(paint77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker21 and valueMarker64", valueMarker21.equals(valueMarker64) ? valueMarker21.hashCode() == valueMarker64.hashCode() : true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        java.lang.String str16 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker18.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker18.getLabelFont();
        double double22 = valueMarker18.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint25 = valueMarker24.getPaint();
        java.awt.Paint paint26 = valueMarker24.getPaint();
        valueMarker24.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker24.getLabelTextAnchor();
        java.awt.Font font30 = valueMarker24.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker24.removeChangeListener(markerChangeListener31);
        float float33 = valueMarker24.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker24.getLabelOffsetType();
        valueMarker18.setLabelOffsetType(lengthAdjustmentType34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker39.getLabelAnchor();
        java.awt.Paint paint41 = valueMarker39.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor42 = valueMarker39.getLabelAnchor();
        java.awt.Stroke stroke43 = valueMarker39.getStroke();
        valueMarker37.setOutlineStroke(stroke43);
        java.awt.Paint paint45 = valueMarker37.getPaint();
        valueMarker18.setLabelPaint(paint45);
        valueMarker1.setLabelPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker18", valueMarker1.equals(valueMarker18) ? valueMarker1.hashCode() == valueMarker18.hashCode() : true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker12.getLabelAnchor();
        java.awt.Stroke stroke16 = valueMarker12.getStroke();
        java.awt.Paint paint17 = valueMarker12.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        java.awt.Font font22 = valueMarker19.getLabelFont();
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        valueMarker12.setOutlineStroke(stroke23);
        java.lang.String str25 = valueMarker12.getLabel();
        java.awt.Paint paint26 = valueMarker12.getPaint();
        valueMarker1.setOutlinePaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker8 and valueMarker12", valueMarker8.equals(valueMarker12) ? valueMarker8.hashCode() == valueMarker12.hashCode() : true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker14.setOutlineStroke(stroke21);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint30 = valueMarker29.getPaint();
        java.lang.String str31 = valueMarker29.getLabel();
        valueMarker29.setValue((double) 100);
        valueMarker29.setValue((double) 1.0f);
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = valueMarker44.getLabelOffset();
        boolean boolean46 = valueMarker38.equals((java.lang.Object) rectangleInsets45);
        java.awt.Stroke stroke47 = valueMarker38.getOutlineStroke();
        valueMarker29.setStroke(stroke47);
        valueMarker1.setStroke(stroke47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker44", valueMarker1.equals(valueMarker44) ? valueMarker1.hashCode() == valueMarker44.hashCode() : true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setValue((double) (short) 0);
        java.awt.Paint paint15 = null;
        valueMarker12.setOutlinePaint(paint15);
        boolean boolean17 = valueMarker1.equals((java.lang.Object) paint15);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker19.getLabelTextAnchor();
        valueMarker19.setLabel("hi!");
        valueMarker19.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker26.addChangeListener(markerChangeListener27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint31 = valueMarker30.getLabelPaint();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        valueMarker26.setOutlinePaint(paint32);
        java.awt.Paint paint34 = valueMarker26.getOutlinePaint();
        java.awt.Stroke stroke35 = valueMarker26.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setValue((double) (short) 0);
        java.awt.Paint paint40 = null;
        valueMarker37.setOutlinePaint(paint40);
        boolean boolean42 = valueMarker26.equals((java.lang.Object) paint40);
        java.awt.Paint paint43 = valueMarker26.getLabelPaint();
        valueMarker19.setLabelPaint(paint43);
        valueMarker1.setLabelPaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker26", valueMarker1.equals(valueMarker26) ? valueMarker1.hashCode() == valueMarker26.hashCode() : true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.awt.Paint paint15 = valueMarker12.getLabelPaint();
        valueMarker1.setOutlinePaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker12", valueMarker5.equals(valueMarker12) ? valueMarker5.hashCode() == valueMarker12.hashCode() : true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.lang.String str16 = valueMarker13.getLabel();
        java.awt.Paint paint17 = valueMarker13.getPaint();
        valueMarker1.setLabelPaint(paint17);
        java.lang.Object obj19 = valueMarker1.clone();
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj19", valueMarker1.equals(obj19) ? valueMarker1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker1.getLabelFont();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        float float13 = valueMarker1.getAlpha();
        java.awt.Font font14 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker16.getLabelTextAnchor();
        valueMarker16.setLabel("hi!");
        valueMarker16.setValue((double) 0.8f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker16.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker25.getLabelOffset();
        float float27 = valueMarker25.getAlpha();
        java.awt.Paint paint28 = valueMarker25.getOutlinePaint();
        java.awt.Paint paint29 = valueMarker25.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker25.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker25", valueMarker5.equals(valueMarker25) ? valueMarker5.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getLabelPaint();
        java.awt.Paint paint17 = valueMarker15.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker15.getLabelTextAnchor();
        java.awt.Paint paint19 = valueMarker15.getLabelPaint();
        valueMarker1.setLabelPaint(paint19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker22.getLabelFont();
        valueMarker22.setValue((double) (short) 0);
        valueMarker22.setValue((double) (byte) 10);
        java.awt.Paint paint30 = valueMarker22.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        java.awt.Paint paint37 = valueMarker32.getLabelPaint();
        double double38 = valueMarker32.getValue();
        java.awt.Paint paint39 = valueMarker32.getLabelPaint();
        valueMarker22.setPaint(paint39);
        valueMarker1.setLabelPaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker32", valueMarker4.equals(valueMarker32) ? valueMarker4.hashCode() == valueMarker32.hashCode() : true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = null;
        valueMarker1.setOutlinePaint(paint5);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str11 = valueMarker10.getLabel();
        java.awt.Paint paint12 = valueMarker10.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        valueMarker15.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker15.getLabelTextAnchor();
        java.awt.Font font21 = valueMarker15.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker15.removeChangeListener(markerChangeListener22);
        valueMarker15.setValue((double) (short) 1);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker15.removeChangeListener(markerChangeListener26);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setValue((double) (short) 0);
        java.awt.Paint paint32 = valueMarker29.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint35 = valueMarker34.getPaint();
        java.awt.Paint paint36 = valueMarker34.getPaint();
        valueMarker34.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker34.getLabelOffset();
        valueMarker29.setLabelOffset(rectangleInsets39);
        valueMarker15.setLabelOffset(rectangleInsets39);
        java.awt.Font font42 = valueMarker15.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint45 = valueMarker44.getLabelPaint();
        java.awt.Paint paint46 = valueMarker44.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = valueMarker48.getLabelAnchor();
        java.awt.Paint paint50 = valueMarker48.getLabelPaint();
        valueMarker44.setPaint(paint50);
        double double52 = valueMarker44.getValue();
        org.jfree.chart.text.TextAnchor textAnchor53 = valueMarker44.getLabelTextAnchor();
        valueMarker44.setValue((double) 1L);
        org.jfree.chart.text.TextAnchor textAnchor56 = valueMarker44.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor57 = valueMarker44.getLabelTextAnchor();
        valueMarker15.setLabelTextAnchor(textAnchor57);
        valueMarker1.setLabelTextAnchor(textAnchor57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker34", valueMarker1.equals(valueMarker34) ? valueMarker1.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        double double5 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        java.awt.Paint paint9 = valueMarker7.getPaint();
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker7.removeChangeListener(markerChangeListener12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor14);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker18.addChangeListener(markerChangeListener19);
        java.awt.Paint paint21 = valueMarker18.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker25.getLabelAnchor();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker25.getLabelAnchor();
        java.awt.Stroke stroke29 = valueMarker25.getStroke();
        valueMarker23.setOutlineStroke(stroke29);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint21, stroke29);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint34 = valueMarker33.getPaint();
        java.awt.Paint paint35 = valueMarker33.getPaint();
        valueMarker33.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker33.getLabelTextAnchor();
        java.awt.Font font39 = valueMarker33.getLabelFont();
        valueMarker31.setLabelFont(font39);
        java.awt.Paint paint41 = valueMarker31.getPaint();
        java.awt.Stroke stroke42 = valueMarker31.getStroke();
        valueMarker1.setOutlineStroke(stroke42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker18", valueMarker1.equals(valueMarker18) ? valueMarker1.hashCode() == valueMarker18.hashCode() : true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str8 = valueMarker7.getLabel();
        java.awt.Paint paint9 = valueMarker7.getLabelPaint();
        valueMarker1.setOutlinePaint(paint9);
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker14.addChangeListener(markerChangeListener15);
        java.awt.Paint paint17 = valueMarker14.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker21.getLabelAnchor();
        java.awt.Paint paint23 = valueMarker21.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker21.getLabelAnchor();
        java.awt.Stroke stroke25 = valueMarker21.getStroke();
        valueMarker19.setOutlineStroke(stroke25);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint17, stroke25);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint30 = valueMarker29.getPaint();
        java.awt.Paint paint31 = valueMarker29.getPaint();
        valueMarker29.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker29.getLabelTextAnchor();
        java.awt.Font font35 = valueMarker29.getLabelFont();
        valueMarker27.setLabelFont(font35);
        java.awt.Paint paint37 = valueMarker27.getPaint();
        java.awt.Stroke stroke38 = valueMarker27.getStroke();
        java.awt.Font font39 = valueMarker27.getLabelFont();
        valueMarker1.setLabelFont(font39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker14", valueMarker7.equals(valueMarker14) ? valueMarker7.hashCode() == valueMarker14.hashCode() : true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker2.setOutlineStroke(stroke8);
        java.awt.Paint paint10 = valueMarker2.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker2.getLabelAnchor();
        boolean boolean13 = valueMarker2.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker15.getLabelOffset();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        java.awt.Stroke stroke18 = valueMarker15.getStroke();
        java.lang.String str19 = valueMarker15.getLabel();
        java.awt.Paint paint20 = valueMarker15.getOutlinePaint();
        valueMarker2.setPaint(paint20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setValue((double) (short) 0);
        java.awt.Paint paint26 = null;
        valueMarker23.setOutlinePaint(paint26);
        java.awt.Paint paint28 = valueMarker23.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        valueMarker30.setOutlineStroke(stroke36);
        java.awt.Stroke stroke38 = valueMarker30.getOutlineStroke();
        valueMarker23.setStroke(stroke38);
        java.awt.Paint paint40 = null;
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker43.addChangeListener(markerChangeListener44);
        java.awt.Paint paint46 = valueMarker43.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = valueMarker50.getLabelAnchor();
        java.awt.Paint paint52 = valueMarker50.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = valueMarker50.getLabelAnchor();
        java.awt.Stroke stroke54 = valueMarker50.getStroke();
        valueMarker48.setOutlineStroke(stroke54);
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint46, stroke54);
        valueMarker56.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = valueMarker56.getLabelOffset();
        float float60 = valueMarker56.getAlpha();
        valueMarker56.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint65 = valueMarker64.getPaint();
        java.awt.Paint paint66 = valueMarker64.getPaint();
        valueMarker64.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor69 = valueMarker64.getLabelTextAnchor();
        java.awt.Font font70 = valueMarker64.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener71 = null;
        valueMarker64.removeChangeListener(markerChangeListener71);
        float float73 = valueMarker64.getAlpha();
        java.awt.Stroke stroke74 = valueMarker64.getStroke();
        valueMarker56.setOutlineStroke(stroke74);
        org.jfree.chart.plot.ValueMarker valueMarker77 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint20, stroke38, paint40, stroke74, (float) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker30", valueMarker2.equals(valueMarker30) ? valueMarker2.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        float float2 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker4.addChangeListener(markerChangeListener5);
        java.awt.Font font7 = valueMarker4.getLabelFont();
        valueMarker4.setValue((double) (short) 0);
        valueMarker4.setValue((double) (byte) 10);
        float float12 = valueMarker4.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        java.awt.Paint paint18 = valueMarker14.getLabelPaint();
        valueMarker4.setOutlinePaint(paint18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker4.removeChangeListener(markerChangeListener20);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker4.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker14", valueMarker1.equals(valueMarker14) ? valueMarker1.hashCode() == valueMarker14.hashCode() : true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        float float3 = valueMarker1.getAlpha();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.lang.Object obj8 = null;
        boolean boolean9 = valueMarker1.equals(obj8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker11.getLabelOffset();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        double double14 = valueMarker11.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker11.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker19.getLabelAnchor();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        valueMarker17.setOutlineStroke(stroke23);
        java.awt.Stroke stroke25 = valueMarker17.getOutlineStroke();
        java.lang.String str26 = valueMarker17.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker17.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker17.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker17.getLabelTextAnchor();
        boolean boolean30 = valueMarker11.equals((java.lang.Object) textAnchor29);
        valueMarker1.setLabelTextAnchor(textAnchor29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker11", valueMarker1.equals(valueMarker11) ? valueMarker1.hashCode() == valueMarker11.hashCode() : true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker13.getLabelAnchor();
        java.awt.Paint paint15 = valueMarker13.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker13.getLabelAnchor();
        java.awt.Stroke stroke17 = valueMarker13.getStroke();
        java.awt.Paint paint18 = valueMarker13.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        boolean boolean28 = valueMarker20.equals((java.lang.Object) rectangleInsets27);
        valueMarker13.setLabelOffset(rectangleInsets27);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker13.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker13.getLabelOffsetType();
        java.awt.Paint paint33 = valueMarker13.getPaint();
        valueMarker1.setPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker20", valueMarker1.equals(valueMarker20) ? valueMarker1.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        float float3 = valueMarker1.getAlpha();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        java.awt.Paint paint11 = valueMarker9.getPaint();
        valueMarker9.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker9.getLabelOffset();
        java.awt.Font font15 = valueMarker9.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker9.notifyListeners(markerChangeEvent16);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        java.awt.Paint paint22 = valueMarker21.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint29 = valueMarker28.getLabelPaint();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        valueMarker24.setOutlinePaint(paint30);
        java.lang.String str32 = valueMarker24.getLabel();
        java.awt.Paint paint33 = valueMarker24.getOutlinePaint();
        java.awt.Stroke stroke34 = valueMarker24.getStroke();
        java.awt.Font font35 = valueMarker24.getLabelFont();
        valueMarker21.setLabelFont(font35);
        valueMarker1.setLabelFont(font35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker28", valueMarker1.equals(valueMarker28) ? valueMarker1.hashCode() == valueMarker28.hashCode() : true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        java.lang.String str8 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        valueMarker10.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        valueMarker10.setLabelAnchor(rectangleAnchor20);
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker24.getLabelFont();
        valueMarker24.setValue((double) (short) 0);
        java.awt.Paint paint30 = valueMarker24.getPaint();
        valueMarker1.setOutlinePaint(paint30);
        java.lang.Object obj32 = valueMarker1.clone();
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj32", valueMarker1.equals(obj32) ? valueMarker1.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker14.addChangeListener(markerChangeListener15);
        java.lang.String str17 = valueMarker14.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker14.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker14.getLabelOffsetType();
        java.awt.Stroke stroke20 = valueMarker14.getOutlineStroke();
        valueMarker12.setOutlineStroke(stroke20);
        boolean boolean22 = valueMarker1.equals((java.lang.Object) valueMarker12);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint25 = valueMarker24.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker27.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker36.getLabelAnchor();
        java.awt.Paint paint38 = valueMarker36.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker36.getLabelAnchor();
        java.awt.Stroke stroke40 = valueMarker36.getStroke();
        valueMarker34.setOutlineStroke(stroke40);
        java.awt.Stroke stroke42 = valueMarker34.getOutlineStroke();
        valueMarker27.setStroke(stroke42);
        valueMarker24.setOutlineStroke(stroke42);
        java.awt.Font font45 = valueMarker24.getLabelFont();
        valueMarker1.setLabelFont(font45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker27", valueMarker1.equals(valueMarker27) ? valueMarker1.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.lang.Object obj8 = valueMarker1.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj8", valueMarker1.equals(obj8) ? valueMarker1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getLabelPaint();
        valueMarker22.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker28.addChangeListener(markerChangeListener29);
        java.awt.Paint paint31 = valueMarker28.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        java.awt.Paint paint37 = valueMarker35.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker35.getLabelAnchor();
        java.awt.Stroke stroke39 = valueMarker35.getStroke();
        valueMarker33.setOutlineStroke(stroke39);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint31, stroke39);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint44 = valueMarker43.getPaint();
        java.awt.Paint paint45 = valueMarker43.getPaint();
        valueMarker43.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor48 = valueMarker43.getLabelTextAnchor();
        java.awt.Font font49 = valueMarker43.getLabelFont();
        valueMarker41.setLabelFont(font49);
        valueMarker22.setLabelFont(font49);
        valueMarker1.setLabelFont(font49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker35", valueMarker5.equals(valueMarker35) ? valueMarker5.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker8.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        java.lang.String str15 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker1.notifyListeners(markerChangeEvent17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker20.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        java.awt.Paint paint25 = valueMarker23.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker27.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker27.getLabelAnchor();
        valueMarker23.setLabelAnchor(rectangleAnchor33);
        valueMarker20.setLabelAnchor(rectangleAnchor33);
        java.awt.Paint paint36 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker20.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker23", valueMarker1.equals(valueMarker23) ? valueMarker1.hashCode() == valueMarker23.hashCode() : true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        java.lang.String str8 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        valueMarker10.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        valueMarker10.setLabelAnchor(rectangleAnchor20);
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker24.getLabelFont();
        valueMarker24.setValue((double) (short) 0);
        java.awt.Paint paint30 = valueMarker24.getPaint();
        valueMarker1.setOutlinePaint(paint30);
        java.lang.Object obj32 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setValue((double) (short) 0);
        java.awt.Paint paint37 = null;
        valueMarker34.setOutlinePaint(paint37);
        java.awt.Paint paint39 = valueMarker34.getOutlinePaint();
        java.lang.String str40 = valueMarker34.getLabel();
        java.awt.Stroke stroke41 = valueMarker34.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker43.addChangeListener(markerChangeListener44);
        java.awt.Font font46 = valueMarker43.getLabelFont();
        valueMarker43.setValue((double) (short) 0);
        valueMarker43.setValue((double) (byte) 10);
        valueMarker43.setAlpha((float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = valueMarker43.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor54 = valueMarker43.getLabelAnchor();
        valueMarker34.setLabelAnchor(rectangleAnchor54);
        valueMarker1.setLabelAnchor(rectangleAnchor54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj32", valueMarker1.equals(obj32) ? valueMarker1.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker11.getLabelAnchor();
        java.awt.Stroke stroke15 = valueMarker11.getStroke();
        valueMarker9.setOutlineStroke(stroke15);
        java.awt.Paint paint17 = valueMarker9.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker9.getLabelAnchor();
        boolean boolean20 = valueMarker9.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.lang.String str24 = valueMarker22.getLabel();
        valueMarker22.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint29 = valueMarker28.getLabelPaint();
        valueMarker22.setPaint(paint29);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker22.notifyListeners(markerChangeEvent31);
        java.awt.Stroke stroke33 = valueMarker22.getStroke();
        valueMarker9.setOutlineStroke(stroke33);
        valueMarker1.setStroke(stroke33);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker37.addChangeListener(markerChangeListener38);
        java.awt.Font font40 = valueMarker37.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = valueMarker37.getLabelOffset();
        java.awt.Paint paint42 = valueMarker37.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker37.removeChangeListener(markerChangeListener43);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType45 = valueMarker37.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker28 and valueMarker37", valueMarker28.equals(valueMarker37) ? valueMarker28.hashCode() == valueMarker37.hashCode() : true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke21 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker25.addChangeListener(markerChangeListener26);
        java.awt.Font font28 = valueMarker25.getLabelFont();
        valueMarker25.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker32.addChangeListener(markerChangeListener33);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker32.addChangeListener(markerChangeListener35);
        java.awt.Font font37 = valueMarker32.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = valueMarker32.getLabelOffset();
        valueMarker25.setLabelOffset(rectangleInsets38);
        valueMarker23.setLabelOffset(rectangleInsets38);
        java.awt.Stroke stroke41 = valueMarker23.getOutlineStroke();
        double double42 = valueMarker23.getValue();
        java.awt.Paint paint43 = valueMarker23.getLabelPaint();
        valueMarker1.setPaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker14 and valueMarker32", valueMarker14.equals(valueMarker32) ? valueMarker14.hashCode() == valueMarker32.hashCode() : true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) 1.0f);
        valueMarker1.setValue((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj7", valueMarker1.equals(obj7) ? valueMarker1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setAlpha((float) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        java.lang.String str18 = valueMarker15.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker15.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        java.awt.Stroke stroke21 = valueMarker15.getOutlineStroke();
        valueMarker13.setOutlineStroke(stroke21);
        valueMarker1.setOutlineStroke(stroke21);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker25.addChangeListener(markerChangeListener26);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker25.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str32 = valueMarker31.getLabel();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        valueMarker25.setOutlinePaint(paint33);
        java.awt.Stroke stroke35 = valueMarker25.getStroke();
        boolean boolean36 = valueMarker1.equals((java.lang.Object) stroke35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker15 and valueMarker31", valueMarker15.equals(valueMarker31) ? valueMarker15.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        valueMarker1.setPaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.awt.Paint paint16 = valueMarker13.getLabelPaint();
        java.awt.Stroke stroke17 = valueMarker13.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker13.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker20.getLabelOffset();
        valueMarker13.setLabelOffset(rectangleInsets25);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker13.getLabelOffsetType();
        java.awt.Paint paint28 = valueMarker13.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker13.notifyListeners(markerChangeEvent29);
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker13.getLabelTextAnchor();
        java.awt.Font font32 = valueMarker13.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker13.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType33);
        java.awt.Font font35 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker38.addChangeListener(markerChangeListener39);
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint43 = valueMarker42.getLabelPaint();
        java.awt.Paint paint44 = valueMarker42.getLabelPaint();
        valueMarker38.setOutlinePaint(paint44);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker38.addChangeListener(markerChangeListener46);
        java.awt.Font font48 = valueMarker38.getLabelFont();
        java.awt.Font font49 = valueMarker38.getLabelFont();
        valueMarker1.setLabelFont(font49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker13 and valueMarker42", valueMarker13.equals(valueMarker42) ? valueMarker13.hashCode() == valueMarker42.hashCode() : true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker7.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker7.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker14.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker12.setOutlineStroke(stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint10, stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.awt.Paint paint24 = valueMarker22.getPaint();
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker22.getLabelTextAnchor();
        java.awt.Font font28 = valueMarker22.getLabelFont();
        valueMarker20.setLabelFont(font28);
        valueMarker1.setLabelFont(font28);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint36 = valueMarker35.getPaint();
        java.awt.Paint paint37 = valueMarker35.getPaint();
        valueMarker35.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker35.getLabelTextAnchor();
        java.awt.Font font41 = valueMarker35.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker35.removeChangeListener(markerChangeListener42);
        float float44 = valueMarker35.getAlpha();
        valueMarker35.setLabel("hi!");
        java.awt.Stroke stroke47 = valueMarker35.getStroke();
        java.awt.Paint paint48 = valueMarker35.getLabelPaint();
        valueMarker33.setOutlinePaint(paint48);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker51.addChangeListener(markerChangeListener52);
        java.awt.Font font54 = valueMarker51.getLabelFont();
        valueMarker51.setValue((double) (short) 0);
        valueMarker51.setValue((double) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = valueMarker51.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener62 = null;
        valueMarker61.addChangeListener(markerChangeListener62);
        java.awt.Paint paint64 = valueMarker61.getLabelPaint();
        boolean boolean66 = valueMarker61.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType67 = valueMarker61.getLabelOffsetType();
        java.awt.Stroke stroke68 = valueMarker61.getOutlineStroke();
        valueMarker51.setOutlineStroke(stroke68);
        org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker(0.0d, paint48, stroke68);
        valueMarker1.setOutlineStroke(stroke68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker35", valueMarker1.equals(valueMarker35) ? valueMarker1.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker13.getLabelAnchor();
        java.awt.Paint paint15 = valueMarker13.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker13.getLabelAnchor();
        java.awt.Stroke stroke17 = valueMarker13.getStroke();
        valueMarker10.setOutlineStroke(stroke17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        valueMarker10.setLabelPaint(paint21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker10.addChangeListener(markerChangeListener23);
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker10.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker20", valueMarker1.equals(valueMarker20) ? valueMarker1.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint5 = valueMarker4.getPaint();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker8.getLabelAnchor();
        valueMarker4.setLabelAnchor(rectangleAnchor14);
        valueMarker1.setLabelAnchor(rectangleAnchor14);
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker19.getLabelPaint();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        valueMarker1.setStroke(stroke23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker19", valueMarker4.equals(valueMarker19) ? valueMarker4.hashCode() == valueMarker19.hashCode() : true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker11.getLabelOffset();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint15 = valueMarker11.getLabelPaint();
        java.awt.Stroke stroke16 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke16);
        java.awt.Font font18 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.lang.String str25 = valueMarker22.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker22.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        java.awt.Font font28 = valueMarker22.getLabelFont();
        valueMarker1.setLabelFont(font28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker22", valueMarker11.equals(valueMarker22) ? valueMarker11.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor8);
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        float float11 = valueMarker1.getAlpha();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        java.awt.Paint paint20 = valueMarker18.getLabelPaint();
        valueMarker14.setPaint(paint20);
        double double22 = valueMarker14.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker14.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker25.getLabelOffset();
        float float27 = valueMarker25.getAlpha();
        java.awt.Paint paint28 = valueMarker25.getOutlinePaint();
        java.awt.Stroke stroke29 = valueMarker25.getOutlineStroke();
        java.awt.Font font30 = valueMarker25.getLabelFont();
        java.awt.Paint paint31 = valueMarker25.getOutlinePaint();
        java.awt.Paint paint32 = valueMarker25.getLabelPaint();
        valueMarker14.setOutlinePaint(paint32);
        valueMarker1.setPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker18", valueMarker5.equals(valueMarker18) ? valueMarker5.hashCode() == valueMarker18.hashCode() : true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getLabelPaint();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker15.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        java.awt.Paint paint20 = valueMarker18.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker18.getLabelAnchor();
        java.awt.Stroke stroke22 = valueMarker18.getStroke();
        valueMarker15.setOutlineStroke(stroke22);
        valueMarker11.setStroke(stroke22);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker11.addChangeListener(markerChangeListener25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker11.getLabelAnchor();
        java.awt.Stroke stroke28 = valueMarker11.getStroke();
        valueMarker1.setStroke(stroke28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker15", valueMarker1.equals(valueMarker15) ? valueMarker1.hashCode() == valueMarker15.hashCode() : true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(100.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        float float3 = valueMarker1.getAlpha();
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker6.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker6.getLabelFont();
        double double12 = valueMarker6.getValue();
        java.lang.String str13 = valueMarker6.getLabel();
        java.awt.Stroke stroke14 = valueMarker6.getOutlineStroke();
        valueMarker1.setStroke(stroke14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker6", valueMarker1.equals(valueMarker6) ? valueMarker1.hashCode() == valueMarker6.hashCode() : true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker7.addChangeListener(markerChangeListener8);
        java.lang.String str10 = valueMarker7.getLabel();
        java.awt.Paint paint11 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint11);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        java.lang.String str14 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker16.getLabelAnchor();
        java.awt.Stroke stroke20 = valueMarker16.getStroke();
        java.awt.Paint paint21 = valueMarker16.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker16.getLabelPaint();
        java.lang.String str23 = valueMarker16.getLabel();
        java.awt.Paint paint24 = valueMarker16.getOutlinePaint();
        java.awt.Stroke stroke25 = valueMarker16.getStroke();
        valueMarker1.setStroke(stroke25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint29 = valueMarker28.getPaint();
        java.awt.Paint paint30 = valueMarker28.getPaint();
        valueMarker28.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker28.getLabelOffset();
        java.awt.Font font34 = valueMarker28.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker28.notifyListeners(markerChangeEvent35);
        java.awt.Paint paint37 = valueMarker28.getLabelPaint();
        valueMarker1.setLabelPaint(paint37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker16", valueMarker1.equals(valueMarker16) ? valueMarker1.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint4 = valueMarker3.getPaint();
        java.lang.String str5 = valueMarker3.getLabel();
        valueMarker3.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker3.setPaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        java.awt.Paint paint15 = valueMarker13.getPaint();
        valueMarker13.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker13.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        java.awt.Paint paint24 = valueMarker22.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker22.getLabelAnchor();
        java.awt.Stroke stroke26 = valueMarker22.getStroke();
        valueMarker20.setOutlineStroke(stroke26);
        java.awt.Stroke stroke28 = valueMarker20.getOutlineStroke();
        valueMarker13.setStroke(stroke28);
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker13.getLabelTextAnchor();
        java.awt.Stroke stroke31 = valueMarker13.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 0, paint10, stroke31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker34.addChangeListener(markerChangeListener35);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        java.awt.Stroke stroke39 = valueMarker34.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (short) 1, paint10, stroke39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker9 and valueMarker34", valueMarker9.equals(valueMarker34) ? valueMarker9.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        double double7 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker9.addChangeListener(markerChangeListener10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        valueMarker9.setValue((double) 1L);
        java.awt.Font font16 = valueMarker9.getLabelFont();
        java.awt.Stroke stroke17 = valueMarker9.getStroke();
        java.awt.Stroke stroke18 = valueMarker9.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker24.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker27.getLabelAnchor();
        java.awt.Paint paint29 = valueMarker27.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker27.getLabelAnchor();
        java.awt.Stroke stroke31 = valueMarker27.getStroke();
        valueMarker24.setOutlineStroke(stroke31);
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker24.getLabelTextAnchor();
        valueMarker20.setLabelTextAnchor(textAnchor33);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker20.notifyListeners(markerChangeEvent35);
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker20.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker20.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor38);
        valueMarker1.setLabelAnchor(rectangleAnchor38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker27", valueMarker1.equals(valueMarker27) ? valueMarker1.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        java.lang.String str8 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        valueMarker10.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        valueMarker10.setLabelAnchor(rectangleAnchor20);
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker24.getLabelFont();
        valueMarker24.setValue((double) (short) 0);
        java.awt.Paint paint30 = valueMarker24.getPaint();
        valueMarker1.setOutlinePaint(paint30);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker33.addChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker33.getLabelFont();
        float float37 = valueMarker33.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker33.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor39 = valueMarker33.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker14 and valueMarker33", valueMarker14.equals(valueMarker33) ? valueMarker14.hashCode() == valueMarker33.hashCode() : true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setValue((double) (short) 0);
        java.awt.Paint paint14 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker19.getLabelAnchor();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        valueMarker16.setOutlineStroke(stroke23);
        java.awt.Font font25 = valueMarker16.getLabelFont();
        java.awt.Font font26 = valueMarker16.getLabelFont();
        java.awt.Stroke stroke27 = valueMarker16.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint30 = valueMarker29.getPaint();
        java.awt.Paint paint31 = valueMarker29.getPaint();
        valueMarker29.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker29.getLabelTextAnchor();
        java.awt.Font font35 = valueMarker29.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker29.removeChangeListener(markerChangeListener36);
        java.awt.Font font38 = valueMarker29.getLabelFont();
        java.awt.Stroke stroke39 = valueMarker29.getOutlineStroke();
        java.awt.Paint paint40 = valueMarker29.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker42.getLabelOffset();
        java.awt.Paint paint44 = valueMarker42.getLabelPaint();
        valueMarker42.setLabel("hi!");
        java.awt.Stroke stroke47 = valueMarker42.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) ' ', paint14, stroke27, paint40, stroke47, (float) (byte) 0);
        valueMarker1.setOutlineStroke(stroke27);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener53 = null;
        valueMarker52.addChangeListener(markerChangeListener53);
        java.awt.Font font55 = valueMarker52.getLabelFont();
        valueMarker52.setValue((double) (short) 0);
        valueMarker52.setValue((double) (byte) 10);
        java.awt.Stroke stroke60 = valueMarker52.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = valueMarker62.getLabelOffset();
        java.awt.Paint paint64 = valueMarker62.getLabelPaint();
        java.awt.Paint paint65 = valueMarker62.getOutlinePaint();
        java.awt.Paint paint66 = valueMarker62.getLabelPaint();
        java.awt.Stroke stroke67 = valueMarker62.getStroke();
        valueMarker52.setOutlineStroke(stroke67);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener69 = null;
        valueMarker52.addChangeListener(markerChangeListener69);
        java.awt.Stroke stroke71 = valueMarker52.getStroke();
        boolean boolean72 = valueMarker1.equals((java.lang.Object) stroke71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker19 and valueMarker52", valueMarker19.equals(valueMarker52) ? valueMarker19.hashCode() == valueMarker52.hashCode() : true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getPaint();
        java.awt.Paint paint19 = valueMarker17.getPaint();
        valueMarker17.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker17.getLabelTextAnchor();
        java.awt.Font font23 = valueMarker17.getLabelFont();
        valueMarker15.setLabelFont(font23);
        java.awt.Paint paint25 = valueMarker15.getPaint();
        java.awt.Stroke stroke26 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        java.awt.Paint paint33 = valueMarker28.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker28.removeChangeListener(markerChangeListener34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker37.addChangeListener(markerChangeListener38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker37.addChangeListener(markerChangeListener40);
        java.awt.Font font42 = valueMarker37.getLabelFont();
        double double43 = valueMarker37.getValue();
        java.lang.String str44 = valueMarker37.getLabel();
        java.awt.Stroke stroke45 = valueMarker37.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker37.getLabelOffset();
        java.awt.Paint paint47 = valueMarker37.getLabelPaint();
        valueMarker28.setPaint(paint47);
        java.awt.Stroke stroke49 = valueMarker28.getOutlineStroke();
        java.awt.Stroke stroke50 = valueMarker28.getStroke();
        valueMarker15.setOutlineStroke(stroke50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker37", valueMarker2.equals(valueMarker37) ? valueMarker2.hashCode() == valueMarker37.hashCode() : true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        double double7 = valueMarker1.getValue();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        java.awt.Paint paint13 = valueMarker11.getPaint();
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker11.removeChangeListener(markerChangeListener16);
        boolean boolean18 = valueMarker1.equals((java.lang.Object) valueMarker11);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj20 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj20", valueMarker1.equals(obj20) ? valueMarker1.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker12.getLabelFont();
        valueMarker12.setValue((double) (short) 0);
        valueMarker12.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker21.getLabelOffset();
        java.awt.Paint paint23 = valueMarker21.getPaint();
        valueMarker12.setLabelPaint(paint23);
        java.awt.Stroke stroke25 = valueMarker12.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 'a', paint10, stroke25);
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker30.addChangeListener(markerChangeListener31);
        java.awt.Font font33 = valueMarker30.getLabelFont();
        valueMarker30.setValue((double) (short) 0);
        valueMarker30.setValue((double) (byte) 10);
        valueMarker30.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = valueMarker43.getLabelAnchor();
        java.awt.Paint paint45 = valueMarker43.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker43.getLabelAnchor();
        java.awt.Stroke stroke47 = valueMarker43.getStroke();
        valueMarker41.setOutlineStroke(stroke47);
        java.awt.Stroke stroke49 = valueMarker41.getOutlineStroke();
        java.lang.String str50 = valueMarker41.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener53 = null;
        valueMarker52.addChangeListener(markerChangeListener53);
        java.lang.String str55 = valueMarker52.getLabel();
        java.awt.Paint paint56 = valueMarker52.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker58.setValue((double) (short) 0);
        java.awt.Paint paint61 = null;
        valueMarker58.setOutlinePaint(paint61);
        java.awt.Paint paint63 = valueMarker58.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = valueMarker58.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor65 = valueMarker58.getLabelTextAnchor();
        valueMarker52.setLabelTextAnchor(textAnchor65);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType67 = valueMarker52.getLabelOffsetType();
        valueMarker41.setLabelOffsetType(lengthAdjustmentType67);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener69 = null;
        valueMarker41.addChangeListener(markerChangeListener69);
        java.awt.Paint paint71 = valueMarker41.getOutlinePaint();
        valueMarker30.setOutlinePaint(paint71);
        valueMarker1.setOutlinePaint(paint71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker41", valueMarker1.equals(valueMarker41) ? valueMarker1.hashCode() == valueMarker41.hashCode() : true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker15.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker15.notifyListeners(markerChangeEvent21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        float float26 = valueMarker24.getAlpha();
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker34.getLabelAnchor();
        java.awt.Paint paint36 = valueMarker34.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker34.getLabelAnchor();
        java.awt.Stroke stroke38 = valueMarker34.getStroke();
        valueMarker31.setOutlineStroke(stroke38);
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker31.getLabelTextAnchor();
        java.awt.Paint paint41 = valueMarker31.getPaint();
        java.awt.Font font42 = valueMarker31.getLabelFont();
        java.lang.String str43 = valueMarker31.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = valueMarker31.getLabelAnchor();
        valueMarker24.setLabelAnchor(rectangleAnchor44);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker24.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker24", valueMarker2.equals(valueMarker24) ? valueMarker2.hashCode() == valueMarker24.hashCode() : true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        java.lang.String str19 = valueMarker16.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker16.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker16.getLabelOffsetType();
        java.awt.Stroke stroke22 = valueMarker16.getOutlineStroke();
        valueMarker14.setOutlineStroke(stroke22);
        java.awt.Paint paint24 = valueMarker14.getLabelPaint();
        valueMarker1.setPaint(paint24);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker27.getLabelAnchor();
        java.awt.Paint paint29 = valueMarker27.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker27.getLabelAnchor();
        java.awt.Stroke stroke31 = valueMarker27.getStroke();
        java.awt.Paint paint32 = valueMarker27.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker34.addChangeListener(markerChangeListener35);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        java.awt.Font font39 = valueMarker34.getLabelFont();
        valueMarker27.setLabelFont(font39);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker27.getLabelAnchor();
        float float42 = valueMarker27.getAlpha();
        java.awt.Paint paint43 = valueMarker27.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint46 = valueMarker45.getPaint();
        java.lang.String str47 = valueMarker45.getLabel();
        valueMarker45.setValue((double) 100);
        valueMarker45.setValue((double) 1.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType52 = valueMarker45.getLabelOffsetType();
        valueMarker27.setLabelOffsetType(lengthAdjustmentType52);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker16 and valueMarker34", valueMarker16.equals(valueMarker34) ? valueMarker16.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker2.getLabelFont();
        valueMarker2.setValue((double) (short) 0);
        valueMarker2.setValue((double) (byte) 10);
        java.awt.Stroke stroke10 = valueMarker2.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        java.awt.Paint paint14 = valueMarker12.getPaint();
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker12.getLabelTextAnchor();
        java.awt.Font font18 = valueMarker12.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker12.removeChangeListener(markerChangeListener19);
        valueMarker12.setValue((double) (short) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker12.getLabelOffsetType();
        valueMarker12.setValue((double) '#');
        java.awt.Paint paint26 = valueMarker12.getPaint();
        valueMarker2.setLabelPaint(paint26);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker32.addChangeListener(markerChangeListener33);
        java.lang.String str35 = valueMarker32.getLabel();
        java.awt.Paint paint36 = valueMarker32.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker38.getLabelTextAnchor();
        valueMarker32.setLabelTextAnchor(textAnchor43);
        valueMarker29.setLabelTextAnchor(textAnchor43);
        float float46 = valueMarker29.getAlpha();
        java.awt.Stroke stroke47 = valueMarker29.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = valueMarker49.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = valueMarker52.getLabelAnchor();
        java.awt.Paint paint54 = valueMarker52.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = valueMarker52.getLabelAnchor();
        java.awt.Stroke stroke56 = valueMarker52.getStroke();
        valueMarker49.setOutlineStroke(stroke56);
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint60 = valueMarker59.getPaint();
        valueMarker49.setLabelPaint(paint60);
        valueMarker49.setValue((double) (short) -1);
        valueMarker49.setValue((double) (short) -1);
        java.awt.Paint paint66 = valueMarker49.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor69 = valueMarker68.getLabelAnchor();
        float float70 = valueMarker68.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker72 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint73 = valueMarker72.getPaint();
        java.lang.String str74 = valueMarker72.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener75 = null;
        valueMarker72.removeChangeListener(markerChangeListener75);
        java.awt.Paint paint77 = valueMarker72.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint80 = valueMarker79.getPaint();
        java.awt.Paint paint81 = valueMarker79.getPaint();
        valueMarker79.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor84 = valueMarker79.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker86 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker88 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor89 = valueMarker88.getLabelAnchor();
        java.awt.Paint paint90 = valueMarker88.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor91 = valueMarker88.getLabelAnchor();
        java.awt.Stroke stroke92 = valueMarker88.getStroke();
        valueMarker86.setOutlineStroke(stroke92);
        java.awt.Stroke stroke94 = valueMarker86.getOutlineStroke();
        valueMarker79.setStroke(stroke94);
        valueMarker72.setStroke(stroke94);
        valueMarker68.setStroke(stroke94);
        org.jfree.chart.plot.ValueMarker valueMarker99 = new org.jfree.chart.plot.ValueMarker((double) '#', paint26, stroke47, paint66, stroke94, (float) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker29 and valueMarker52", valueMarker29.equals(valueMarker52) ? valueMarker29.hashCode() == valueMarker52.hashCode() : true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker7.getLabelAnchor();
        java.awt.Paint paint9 = valueMarker7.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker7.getLabelAnchor();
        java.awt.Stroke stroke11 = valueMarker7.getStroke();
        valueMarker5.setOutlineStroke(stroke11);
        java.awt.Stroke stroke13 = valueMarker5.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker5.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType14);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getLabelPaint();
        valueMarker19.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker25.addChangeListener(markerChangeListener26);
        java.awt.Paint paint28 = valueMarker25.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        valueMarker30.setOutlineStroke(stroke36);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint28, stroke36);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint41 = valueMarker40.getPaint();
        java.awt.Paint paint42 = valueMarker40.getPaint();
        valueMarker40.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor45 = valueMarker40.getLabelTextAnchor();
        java.awt.Font font46 = valueMarker40.getLabelFont();
        valueMarker38.setLabelFont(font46);
        valueMarker19.setLabelFont(font46);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        valueMarker19.notifyListeners(markerChangeEvent49);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint53 = valueMarker52.getPaint();
        java.lang.String str54 = valueMarker52.getLabel();
        valueMarker52.setValue((double) 100);
        valueMarker52.setValue((double) 1.0f);
        valueMarker52.setLabel("hi!");
        java.awt.Stroke stroke61 = valueMarker52.getOutlineStroke();
        valueMarker19.setOutlineStroke(stroke61);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = valueMarker19.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker30", valueMarker5.equals(valueMarker30) ? valueMarker5.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        float float10 = valueMarker1.getAlpha();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        java.awt.Font font15 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker1.getLabelOffset();
        java.awt.Font font17 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.awt.Paint paint21 = valueMarker19.getPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker19.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        valueMarker26.setOutlineStroke(stroke32);
        java.awt.Stroke stroke34 = valueMarker26.getOutlineStroke();
        valueMarker19.setStroke(stroke34);
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker19.getLabelTextAnchor();
        java.awt.Stroke stroke37 = valueMarker19.getStroke();
        java.awt.Paint paint38 = valueMarker19.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker40.addChangeListener(markerChangeListener41);
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint45 = valueMarker44.getLabelPaint();
        java.awt.Paint paint46 = valueMarker44.getLabelPaint();
        valueMarker40.setOutlinePaint(paint46);
        java.lang.String str48 = valueMarker40.getLabel();
        java.awt.Paint paint49 = valueMarker40.getLabelPaint();
        valueMarker19.setOutlinePaint(paint49);
        valueMarker1.setOutlinePaint(paint49);
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker53.addChangeListener(markerChangeListener54);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener56 = null;
        valueMarker53.addChangeListener(markerChangeListener56);
        java.awt.Font font58 = valueMarker53.getLabelFont();
        double double59 = valueMarker53.getValue();
        java.lang.String str60 = valueMarker53.getLabel();
        java.awt.Stroke stroke61 = valueMarker53.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = valueMarker53.getLabelOffset();
        java.awt.Paint paint63 = valueMarker53.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType64 = valueMarker53.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker44 and valueMarker53", valueMarker44.equals(valueMarker53) ? valueMarker44.hashCode() == valueMarker53.hashCode() : true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        double double7 = valueMarker1.getValue();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        java.awt.Paint paint13 = valueMarker11.getPaint();
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker11.removeChangeListener(markerChangeListener16);
        boolean boolean18 = valueMarker1.equals((java.lang.Object) valueMarker11);
        java.lang.Object obj19 = valueMarker1.clone();
        java.lang.Class<?> wildcardClass20 = valueMarker1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj19", valueMarker1.equals(obj19) ? valueMarker1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setValue((double) (short) 0);
        java.awt.Paint paint24 = valueMarker21.getPaint();
        valueMarker1.setLabelPaint(paint24);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke27 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker1.removeChangeListener(markerChangeListener28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        java.awt.Paint paint35 = valueMarker33.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker33.getLabelAnchor();
        java.awt.Stroke stroke37 = valueMarker33.getStroke();
        valueMarker31.setOutlineStroke(stroke37);
        java.awt.Stroke stroke39 = valueMarker31.getOutlineStroke();
        java.lang.String str40 = valueMarker31.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker31.removeChangeListener(markerChangeListener41);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker31.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker21 and valueMarker31", valueMarker21.equals(valueMarker31) ? valueMarker21.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setPaint(paint7);
        double double9 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker12.getLabelAnchor();
        java.awt.Stroke stroke16 = valueMarker12.getStroke();
        java.awt.Paint paint17 = valueMarker12.getLabelPaint();
        double double18 = valueMarker12.getValue();
        java.awt.Stroke stroke19 = null;
        valueMarker12.setOutlineStroke(stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.lang.String str25 = valueMarker22.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker22.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        java.awt.Stroke stroke28 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker22.getLabelOffsetType();
        valueMarker12.setLabelOffsetType(lengthAdjustmentType29);
        java.lang.Object obj31 = valueMarker12.clone();
        valueMarker12.setAlpha((float) 1);
        java.awt.Font font34 = valueMarker12.getLabelFont();
        valueMarker1.setLabelFont(font34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker38.getLabelOffset();
        java.awt.Font font44 = valueMarker38.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        valueMarker38.notifyListeners(markerChangeEvent45);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType47 = valueMarker38.getLabelOffsetType();
        valueMarker38.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker53.addChangeListener(markerChangeListener54);
        java.lang.String str56 = valueMarker53.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = valueMarker53.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType58 = valueMarker53.getLabelOffsetType();
        java.awt.Stroke stroke59 = valueMarker53.getOutlineStroke();
        valueMarker51.setOutlineStroke(stroke59);
        java.awt.Paint paint61 = valueMarker51.getLabelPaint();
        valueMarker38.setPaint(paint61);
        valueMarker1.setLabelPaint(paint61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker22 and valueMarker53", valueMarker22.equals(valueMarker53) ? valueMarker22.hashCode() == valueMarker53.hashCode() : true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker11.addChangeListener(markerChangeListener12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        java.awt.Font font16 = valueMarker11.getLabelFont();
        double double17 = valueMarker11.getValue();
        java.lang.String str18 = valueMarker11.getLabel();
        java.awt.Stroke stroke19 = valueMarker11.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker11.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker11.getLabelOffsetType();
        boolean boolean22 = valueMarker1.equals((java.lang.Object) lengthAdjustmentType21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker11", valueMarker1.equals(valueMarker11) ? valueMarker1.hashCode() == valueMarker11.hashCode() : true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker(0.0d);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker26.addChangeListener(markerChangeListener27);
        java.awt.Paint paint29 = valueMarker26.getLabelPaint();
        java.awt.Stroke stroke30 = valueMarker26.getStroke();
        valueMarker23.setStroke(stroke30);
        valueMarker1.setStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker26", valueMarker1.equals(valueMarker26) ? valueMarker1.hashCode() == valueMarker26.hashCode() : true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker2.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker10.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str17 = valueMarker16.getLabel();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        valueMarker10.setOutlinePaint(paint18);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker24.getLabelAnchor();
        java.awt.Paint paint26 = valueMarker24.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker24.getLabelAnchor();
        java.awt.Stroke stroke28 = valueMarker24.getStroke();
        valueMarker22.setOutlineStroke(stroke28);
        java.awt.Stroke stroke30 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker22.getLabelOffsetType();
        float float32 = valueMarker22.getAlpha();
        java.awt.Paint paint33 = valueMarker22.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint36 = valueMarker35.getPaint();
        java.awt.Paint paint37 = valueMarker35.getPaint();
        valueMarker35.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker35.getLabelTextAnchor();
        java.awt.Font font41 = valueMarker35.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker35.removeChangeListener(markerChangeListener42);
        float float44 = valueMarker35.getAlpha();
        valueMarker35.setLabel("hi!");
        java.awt.Stroke stroke47 = valueMarker35.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker(0.0d, paint33, stroke47);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 100, paint18, stroke47);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker51.addChangeListener(markerChangeListener52);
        java.awt.Font font54 = valueMarker51.getLabelFont();
        valueMarker51.setValue((double) (short) 0);
        valueMarker51.setValue((double) (byte) 10);
        valueMarker51.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener63 = null;
        valueMarker62.addChangeListener(markerChangeListener63);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener65 = null;
        valueMarker62.addChangeListener(markerChangeListener65);
        java.awt.Font font67 = valueMarker62.getLabelFont();
        double double68 = valueMarker62.getValue();
        java.lang.String str69 = valueMarker62.getLabel();
        java.awt.Stroke stroke70 = valueMarker62.getOutlineStroke();
        valueMarker51.setOutlineStroke(stroke70);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType72 = valueMarker51.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker74 = new org.jfree.chart.plot.ValueMarker(10.0d);
        java.awt.Paint paint75 = valueMarker74.getPaint();
        boolean boolean76 = valueMarker51.equals((java.lang.Object) paint75);
        org.jfree.chart.plot.ValueMarker valueMarker78 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor79 = valueMarker78.getLabelAnchor();
        java.awt.Paint paint80 = valueMarker78.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor81 = valueMarker78.getLabelAnchor();
        java.awt.Stroke stroke82 = valueMarker78.getStroke();
        java.awt.Paint paint83 = valueMarker78.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker85 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener86 = null;
        valueMarker85.addChangeListener(markerChangeListener86);
        java.awt.Font font88 = valueMarker85.getLabelFont();
        java.awt.Stroke stroke89 = valueMarker85.getOutlineStroke();
        valueMarker78.setOutlineStroke(stroke89);
        org.jfree.chart.plot.ValueMarker valueMarker92 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint7, stroke47, paint75, stroke89, (float) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker24", valueMarker2.equals(valueMarker24) ? valueMarker2.hashCode() == valueMarker24.hashCode() : true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj16 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj16", valueMarker1.equals(obj16) ? valueMarker1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        valueMarker1.setStroke(stroke12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint25 = valueMarker24.getLabelPaint();
        java.awt.Paint paint26 = valueMarker24.getLabelPaint();
        valueMarker20.setOutlinePaint(paint26);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker20.addChangeListener(markerChangeListener28);
        java.awt.Paint paint30 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker20.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker20.getLabelOffsetType();
        java.awt.Stroke stroke33 = valueMarker20.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker24", valueMarker1.equals(valueMarker24) ? valueMarker1.hashCode() == valueMarker24.hashCode() : true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker2.getLabelFont();
        valueMarker2.setValue((double) (short) 0);
        valueMarker2.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker11.getLabelAnchor();
        java.awt.Stroke stroke15 = valueMarker11.getStroke();
        java.awt.Paint paint16 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker11.getLabelPaint();
        java.awt.Paint paint18 = valueMarker11.getOutlinePaint();
        boolean boolean19 = valueMarker2.equals((java.lang.Object) paint18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker21.getLabelOffset();
        java.awt.Paint paint23 = valueMarker21.getPaint();
        java.awt.Stroke stroke24 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint18, stroke24);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker27.getLabelAnchor();
        java.awt.Paint paint29 = valueMarker27.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker31.addChangeListener(markerChangeListener32);
        java.awt.Font font34 = valueMarker31.getLabelFont();
        double double35 = valueMarker31.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint38 = valueMarker37.getPaint();
        java.awt.Paint paint39 = valueMarker37.getPaint();
        valueMarker37.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker37.getLabelTextAnchor();
        java.awt.Font font43 = valueMarker37.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker37.removeChangeListener(markerChangeListener44);
        float float46 = valueMarker37.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType47 = valueMarker37.getLabelOffsetType();
        valueMarker31.setLabelOffsetType(lengthAdjustmentType47);
        java.awt.Stroke stroke49 = valueMarker31.getOutlineStroke();
        valueMarker27.setOutlineStroke(stroke49);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = valueMarker27.getLabelAnchor();
        valueMarker25.setLabelAnchor(rectangleAnchor51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker27", valueMarker11.equals(valueMarker27) ? valueMarker11.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker8.setOutlineStroke(stroke14);
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font19 = valueMarker1.getLabelFont();
        valueMarker1.setValue(0.0d);
        java.awt.Font font22 = valueMarker1.getLabelFont();
        java.awt.Paint paint23 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker25.getLabelOffset();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        java.awt.Paint paint28 = valueMarker25.getLabelPaint();
        valueMarker25.setAlpha((float) (short) 1);
        valueMarker25.setValue((double) '#');
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker34.addChangeListener(markerChangeListener35);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getLabelPaint();
        java.awt.Paint paint40 = valueMarker38.getLabelPaint();
        valueMarker34.setOutlinePaint(paint40);
        java.lang.String str42 = valueMarker34.getLabel();
        java.awt.Paint paint43 = valueMarker34.getOutlinePaint();
        valueMarker25.setLabelPaint(paint43);
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint47 = valueMarker46.getPaint();
        java.awt.Paint paint48 = valueMarker46.getPaint();
        valueMarker46.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor51 = valueMarker46.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = valueMarker55.getLabelAnchor();
        java.awt.Paint paint57 = valueMarker55.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor58 = valueMarker55.getLabelAnchor();
        java.awt.Stroke stroke59 = valueMarker55.getStroke();
        valueMarker53.setOutlineStroke(stroke59);
        java.awt.Stroke stroke61 = valueMarker53.getOutlineStroke();
        valueMarker46.setStroke(stroke61);
        org.jfree.chart.text.TextAnchor textAnchor63 = valueMarker46.getLabelTextAnchor();
        java.awt.Font font64 = valueMarker46.getLabelFont();
        valueMarker46.setValue(0.0d);
        java.awt.Font font67 = valueMarker46.getLabelFont();
        valueMarker25.setLabelFont(font67);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor69 = valueMarker25.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker46", valueMarker1.equals(valueMarker46) ? valueMarker1.hashCode() == valueMarker46.hashCode() : true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker6.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker6.getLabelFont();
        double double12 = valueMarker6.getValue();
        java.lang.String str13 = valueMarker6.getLabel();
        java.awt.Stroke stroke14 = valueMarker6.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker6.getLabelOffset();
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor18);
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker22.getLabelFont();
        valueMarker22.setValue((double) (short) 0);
        java.awt.Paint paint28 = valueMarker22.getPaint();
        valueMarker22.setLabel("hi!");
        double double31 = valueMarker22.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint34 = valueMarker33.getPaint();
        java.awt.Paint paint35 = valueMarker33.getPaint();
        valueMarker33.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker33.getLabelTextAnchor();
        java.awt.Font font39 = valueMarker33.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker33.removeChangeListener(markerChangeListener40);
        float float42 = valueMarker33.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker33.getLabelOffsetType();
        valueMarker22.setLabelOffsetType(lengthAdjustmentType43);
        java.awt.Paint paint45 = valueMarker22.getLabelPaint();
        valueMarker1.setLabelPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker6 and valueMarker33", valueMarker6.equals(valueMarker33) ? valueMarker6.hashCode() == valueMarker33.hashCode() : true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha(0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker10.getLabelOffset();
        float float12 = valueMarker10.getAlpha();
        java.awt.Paint paint13 = valueMarker10.getOutlinePaint();
        double double14 = valueMarker10.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        java.awt.Paint paint25 = valueMarker23.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker23.getLabelAnchor();
        java.awt.Stroke stroke27 = valueMarker23.getStroke();
        valueMarker20.setOutlineStroke(stroke27);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0, paint18, stroke27);
        valueMarker10.setPaint(paint18);
        valueMarker1.setLabelPaint(paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker17", valueMarker1.equals(valueMarker17) ? valueMarker1.hashCode() == valueMarker17.hashCode() : true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        valueMarker1.setValue((double) (short) 1);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setValue((double) (short) 0);
        java.awt.Paint paint18 = valueMarker15.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker20.getLabelOffset();
        valueMarker15.setLabelOffset(rectangleInsets25);
        valueMarker1.setLabelOffset(rectangleInsets25);
        java.awt.Font font28 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint31 = valueMarker30.getLabelPaint();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker34.getLabelAnchor();
        java.awt.Paint paint36 = valueMarker34.getLabelPaint();
        valueMarker30.setPaint(paint36);
        double double38 = valueMarker30.getValue();
        org.jfree.chart.text.TextAnchor textAnchor39 = valueMarker30.getLabelTextAnchor();
        valueMarker30.setValue((double) 1L);
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker30.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker30.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor43);
        valueMarker1.setAlpha((float) (byte) 1);
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = valueMarker48.getLabelAnchor();
        java.awt.Paint paint50 = valueMarker48.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = valueMarker48.getLabelAnchor();
        java.awt.Stroke stroke52 = valueMarker48.getStroke();
        java.awt.Paint paint53 = valueMarker48.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint56 = valueMarker55.getPaint();
        java.awt.Paint paint57 = valueMarker55.getPaint();
        valueMarker55.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = valueMarker61.getLabelOffset();
        boolean boolean63 = valueMarker55.equals((java.lang.Object) rectangleInsets62);
        valueMarker48.setLabelOffset(rectangleInsets62);
        java.awt.Paint paint65 = valueMarker48.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = valueMarker48.getLabelOffset();
        java.lang.Object obj67 = valueMarker48.clone();
        valueMarker48.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent70 = null;
        valueMarker48.notifyListeners(markerChangeEvent70);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType72 = valueMarker48.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker20 and valueMarker55", valueMarker20.equals(valueMarker55) ? valueMarker20.hashCode() == valueMarker55.hashCode() : true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker20.getLabelPaint();
        double double24 = valueMarker20.getValue();
        double double25 = valueMarker20.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker27.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint31 = valueMarker30.getPaint();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint35 = valueMarker34.getPaint();
        java.awt.Paint paint36 = valueMarker34.getPaint();
        valueMarker34.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor39 = valueMarker34.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker34.getLabelAnchor();
        valueMarker30.setLabelAnchor(rectangleAnchor40);
        valueMarker27.setLabelAnchor(rectangleAnchor40);
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker44.setValue((double) (short) 0);
        java.awt.Paint paint47 = null;
        valueMarker44.setOutlinePaint(paint47);
        java.awt.Paint paint49 = valueMarker44.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = valueMarker44.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor51 = valueMarker44.getLabelTextAnchor();
        valueMarker27.setLabelTextAnchor(textAnchor51);
        java.awt.Paint paint53 = valueMarker27.getOutlinePaint();
        valueMarker20.setLabelPaint(paint53);
        java.awt.Stroke stroke55 = valueMarker20.getOutlineStroke();
        boolean boolean56 = valueMarker1.equals((java.lang.Object) valueMarker20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker27", valueMarker1.equals(valueMarker27) ? valueMarker1.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker2.getLabelFont();
        valueMarker2.setValue((double) (short) 0);
        valueMarker2.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker11.getLabelOffset();
        java.awt.Paint paint13 = valueMarker11.getPaint();
        valueMarker2.setLabelPaint(paint13);
        java.awt.Paint paint15 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getPaint();
        java.awt.Paint paint19 = valueMarker17.getPaint();
        valueMarker17.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker17.getLabelTextAnchor();
        java.awt.Font font23 = valueMarker17.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker17.removeChangeListener(markerChangeListener24);
        valueMarker17.setValue((double) (short) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker17.getLabelOffsetType();
        java.awt.Stroke stroke29 = valueMarker17.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint15, stroke29);
        java.lang.Object obj31 = valueMarker30.clone();
        java.awt.Stroke stroke32 = valueMarker30.getStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker30 and obj31", valueMarker30.equals(obj31) ? valueMarker30.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj16 = valueMarker1.clone();
        java.lang.String str17 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj16", valueMarker1.equals(obj16) ? valueMarker1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        valueMarker1.setLabel("hi!");
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker19.getLabelAnchor();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        valueMarker17.setOutlineStroke(stroke23);
        java.awt.Paint paint25 = valueMarker17.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker17.getLabelAnchor();
        boolean boolean28 = valueMarker17.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker17.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker19", valueMarker4.equals(valueMarker19) ? valueMarker4.hashCode() == valueMarker19.hashCode() : true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setPaint(paint7);
        double double9 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker14.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker12.setOutlineStroke(stroke18);
        java.awt.Paint paint20 = valueMarker12.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker12.getLabelAnchor();
        boolean boolean23 = valueMarker12.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker12.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker14", valueMarker5.equals(valueMarker14) ? valueMarker5.hashCode() == valueMarker14.hashCode() : true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        java.lang.Object obj16 = valueMarker15.clone();
        float float17 = valueMarker15.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker15 and obj16", valueMarker15.equals(obj16) ? valueMarker15.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker(0.0d);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker6.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker6.getLabelFont();
        double double12 = valueMarker6.getValue();
        java.lang.String str13 = valueMarker6.getLabel();
        java.awt.Stroke stroke14 = valueMarker6.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker6.getLabelOffset();
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker6.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker6.notifyListeners(markerChangeEvent19);
        java.awt.Stroke stroke21 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        java.awt.Paint paint25 = valueMarker23.getLabelPaint();
        java.awt.Stroke stroke26 = valueMarker23.getOutlineStroke();
        java.awt.Stroke stroke27 = valueMarker23.getStroke();
        valueMarker6.setOutlineStroke(stroke27);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10, paint4, stroke27);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker29.notifyListeners(markerChangeEvent30);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setValue((double) (short) 0);
        java.awt.Paint paint36 = null;
        valueMarker33.setOutlinePaint(paint36);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker40.getLabelAnchor();
        java.awt.Paint paint42 = valueMarker40.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker44.addChangeListener(markerChangeListener45);
        java.awt.Font font47 = valueMarker44.getLabelFont();
        valueMarker44.setValue((double) (short) 0);
        valueMarker44.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = valueMarker53.getLabelOffset();
        java.awt.Paint paint55 = valueMarker53.getPaint();
        valueMarker44.setLabelPaint(paint55);
        java.awt.Stroke stroke57 = valueMarker44.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 'a', paint42, stroke57);
        valueMarker33.setLabelPaint(paint42);
        org.jfree.chart.util.RectangleInsets rectangleInsets60 = valueMarker33.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = valueMarker33.getLabelOffset();
        valueMarker29.setLabelOffset(rectangleInsets61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker23 and valueMarker40", valueMarker23.equals(valueMarker40) ? valueMarker23.hashCode() == valueMarker40.hashCode() : true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        java.lang.String str12 = valueMarker5.getLabel();
        java.awt.Paint paint13 = valueMarker5.getOutlinePaint();
        valueMarker1.setPaint(paint13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker16.getLabelFont();
        double double22 = valueMarker16.getValue();
        java.lang.String str23 = valueMarker16.getLabel();
        boolean boolean24 = valueMarker1.equals((java.lang.Object) valueMarker16);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint27 = valueMarker26.getLabelPaint();
        valueMarker26.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        java.awt.Paint paint35 = valueMarker33.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker33.getLabelAnchor();
        java.awt.Stroke stroke37 = valueMarker33.getStroke();
        valueMarker31.setOutlineStroke(stroke37);
        java.awt.Stroke stroke39 = valueMarker31.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker31.getLabelOffsetType();
        valueMarker26.setLabelOffsetType(lengthAdjustmentType40);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        valueMarker26.notifyListeners(markerChangeEvent42);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType45 = valueMarker26.getLabelOffsetType();
        java.awt.Paint paint46 = valueMarker26.getPaint();
        valueMarker16.setLabelPaint(paint46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker33", valueMarker5.equals(valueMarker33) ? valueMarker5.hashCode() == valueMarker33.hashCode() : true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj7", valueMarker1.equals(obj7) ? valueMarker1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha((float) (short) 1);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        java.awt.Font font14 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker8.removeChangeListener(markerChangeListener15);
        valueMarker8.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        java.lang.String str23 = valueMarker20.getLabel();
        java.awt.Paint paint24 = valueMarker20.getPaint();
        valueMarker8.setLabelPaint(paint24);
        valueMarker8.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint30 = valueMarker29.getPaint();
        java.awt.Paint paint31 = valueMarker29.getPaint();
        valueMarker29.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker29.getLabelTextAnchor();
        java.awt.Font font35 = valueMarker29.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker29.removeChangeListener(markerChangeListener36);
        float float38 = valueMarker29.getAlpha();
        java.awt.Paint paint39 = valueMarker29.getOutlinePaint();
        boolean boolean40 = valueMarker8.equals((java.lang.Object) paint39);
        valueMarker1.setPaint(paint39);
        java.lang.Object obj42 = valueMarker1.clone();
        java.awt.Paint paint43 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj42", valueMarker1.equals(obj42) ? valueMarker1.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        valueMarker1.setLabel("hi!");
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint17 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (-1));
        valueMarker19.setAlpha(0.0f);
        java.lang.Object obj22 = valueMarker19.clone();
        boolean boolean23 = valueMarker1.equals((java.lang.Object) valueMarker19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker19 and obj22", valueMarker19.equals(obj22) ? valueMarker19.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        java.awt.Paint paint22 = valueMarker15.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker24.getLabelPaint();
        java.awt.Stroke stroke28 = valueMarker24.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker24.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint32 = valueMarker31.getPaint();
        java.awt.Paint paint33 = valueMarker31.getPaint();
        valueMarker31.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = valueMarker31.getLabelOffset();
        valueMarker24.setLabelOffset(rectangleInsets36);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker24.getLabelOffsetType();
        java.awt.Paint paint39 = valueMarker24.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        valueMarker24.notifyListeners(markerChangeEvent40);
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker24.getLabelTextAnchor();
        java.awt.Stroke stroke43 = valueMarker24.getStroke();
        java.awt.Paint paint44 = valueMarker24.getLabelPaint();
        valueMarker15.setOutlinePaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker24", valueMarker2.equals(valueMarker24) ? valueMarker2.hashCode() == valueMarker24.hashCode() : true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        java.lang.Object obj9 = valueMarker1.clone();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj9", valueMarker1.equals(obj9) ? valueMarker1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor8);
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        float float11 = valueMarker1.getAlpha();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        java.awt.Paint paint20 = valueMarker18.getLabelPaint();
        valueMarker14.setPaint(paint20);
        double double22 = valueMarker14.getValue();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker25.getLabelAnchor();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker25.getLabelAnchor();
        java.awt.Stroke stroke29 = valueMarker25.getStroke();
        java.awt.Paint paint30 = valueMarker25.getLabelPaint();
        double double31 = valueMarker25.getValue();
        java.awt.Stroke stroke32 = null;
        valueMarker25.setOutlineStroke(stroke32);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker35.addChangeListener(markerChangeListener36);
        java.lang.String str38 = valueMarker35.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker35.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker35.getLabelOffsetType();
        java.awt.Stroke stroke41 = valueMarker35.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType42 = valueMarker35.getLabelOffsetType();
        valueMarker25.setLabelOffsetType(lengthAdjustmentType42);
        java.lang.Object obj44 = valueMarker25.clone();
        valueMarker25.setAlpha((float) 1);
        java.awt.Font font47 = valueMarker25.getLabelFont();
        valueMarker14.setLabelFont(font47);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = valueMarker14.getLabelOffset();
        boolean boolean50 = valueMarker1.equals((java.lang.Object) rectangleInsets49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker35", valueMarker1.equals(valueMarker35) ? valueMarker1.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        float float10 = valueMarker1.getAlpha();
        java.lang.Object obj11 = valueMarker1.clone();
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj11", valueMarker1.equals(obj11) ? valueMarker1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        java.awt.Paint paint14 = valueMarker9.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        java.awt.Font font19 = valueMarker16.getLabelFont();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        valueMarker9.setOutlineStroke(stroke20);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker16", valueMarker1.equals(valueMarker16) ? valueMarker1.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker2.getLabelOffset();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        valueMarker2.setAlpha((float) (short) 1);
        valueMarker2.setValue((double) '#');
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker11.addChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getLabelPaint();
        java.awt.Paint paint17 = valueMarker15.getLabelPaint();
        valueMarker11.setOutlinePaint(paint17);
        java.lang.String str19 = valueMarker11.getLabel();
        java.awt.Paint paint20 = valueMarker11.getOutlinePaint();
        valueMarker2.setLabelPaint(paint20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker27.getLabelAnchor();
        java.awt.Paint paint29 = valueMarker27.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker27.getLabelAnchor();
        java.awt.Stroke stroke31 = valueMarker27.getStroke();
        java.awt.Paint paint32 = valueMarker27.getOutlinePaint();
        java.awt.Paint paint33 = valueMarker27.getLabelPaint();
        valueMarker23.setOutlinePaint(paint33);
        valueMarker23.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker38.addChangeListener(markerChangeListener39);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker38.addChangeListener(markerChangeListener41);
        java.awt.Font font43 = valueMarker38.getLabelFont();
        double double44 = valueMarker38.getValue();
        java.lang.String str45 = valueMarker38.getLabel();
        java.awt.Stroke stroke46 = valueMarker38.getOutlineStroke();
        java.awt.Stroke stroke47 = valueMarker38.getStroke();
        boolean boolean48 = valueMarker23.equals((java.lang.Object) stroke47);
        valueMarker23.setAlpha(1.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = valueMarker23.getLabelOffset();
        java.awt.Paint paint52 = valueMarker23.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor53 = valueMarker23.getLabelTextAnchor();
        double double54 = valueMarker23.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        valueMarker23.notifyListeners(markerChangeEvent55);
        java.awt.Stroke stroke57 = valueMarker23.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint20, stroke57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker15 and valueMarker38", valueMarker15.equals(valueMarker38) ? valueMarker15.hashCode() == valueMarker38.hashCode() : true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker8.setOutlineStroke(stroke14);
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker23.addChangeListener(markerChangeListener24);
        java.lang.String str26 = valueMarker23.getLabel();
        java.awt.Paint paint27 = valueMarker23.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint30 = valueMarker29.getPaint();
        java.awt.Paint paint31 = valueMarker29.getPaint();
        valueMarker29.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker29.getLabelTextAnchor();
        valueMarker23.setLabelTextAnchor(textAnchor34);
        valueMarker20.setLabelTextAnchor(textAnchor34);
        valueMarker1.setLabelTextAnchor(textAnchor34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker29", valueMarker1.equals(valueMarker29) ? valueMarker1.hashCode() == valueMarker29.hashCode() : true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setValue((double) (short) 0);
        java.awt.Stroke stroke16 = valueMarker13.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker18.addChangeListener(markerChangeListener19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker18.addChangeListener(markerChangeListener21);
        java.awt.Font font23 = valueMarker18.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker18.getLabelOffset();
        java.lang.Object obj25 = null;
        boolean boolean26 = valueMarker18.equals(obj25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker18.getLabelAnchor();
        valueMarker13.setLabelAnchor(rectangleAnchor27);
        boolean boolean29 = valueMarker1.equals((java.lang.Object) rectangleAnchor27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker18", valueMarker1.equals(valueMarker18) ? valueMarker1.hashCode() == valueMarker18.hashCode() : true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        java.awt.Paint paint17 = valueMarker15.getLabelPaint();
        valueMarker13.setLabelPaint(paint17);
        valueMarker1.setLabelPaint(paint17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker15", valueMarker5.equals(valueMarker15) ? valueMarker5.hashCode() == valueMarker15.hashCode() : true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        java.awt.Font font14 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker8.removeChangeListener(markerChangeListener15);
        float float17 = valueMarker8.getAlpha();
        valueMarker8.setLabel("hi!");
        java.awt.Stroke stroke20 = valueMarker8.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker8.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker24.addChangeListener(markerChangeListener27);
        java.awt.Font font29 = valueMarker24.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker31.addChangeListener(markerChangeListener32);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint36 = valueMarker35.getLabelPaint();
        java.awt.Paint paint37 = valueMarker35.getLabelPaint();
        valueMarker31.setOutlinePaint(paint37);
        valueMarker24.setPaint(paint37);
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker24.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor40);
        java.lang.String str42 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint45 = valueMarker44.getPaint();
        java.awt.Paint paint46 = valueMarker44.getPaint();
        valueMarker44.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker44.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = valueMarker44.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor51 = valueMarker44.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor54 = valueMarker53.getLabelAnchor();
        java.awt.Paint paint55 = valueMarker53.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = valueMarker53.getLabelAnchor();
        java.awt.Stroke stroke57 = valueMarker53.getStroke();
        java.awt.Paint paint58 = valueMarker53.getLabelPaint();
        double double59 = valueMarker53.getValue();
        java.awt.Stroke stroke60 = null;
        valueMarker53.setOutlineStroke(stroke60);
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener64 = null;
        valueMarker63.addChangeListener(markerChangeListener64);
        java.lang.String str66 = valueMarker63.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = valueMarker63.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType68 = valueMarker63.getLabelOffsetType();
        java.awt.Stroke stroke69 = valueMarker63.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType70 = valueMarker63.getLabelOffsetType();
        valueMarker53.setLabelOffsetType(lengthAdjustmentType70);
        valueMarker44.setLabelOffsetType(lengthAdjustmentType70);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker35 and valueMarker63", valueMarker35.equals(valueMarker63) ? valueMarker35.hashCode() == valueMarker63.hashCode() : true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha((float) (short) 1);
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint11 = valueMarker10.getLabelPaint();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        float float13 = valueMarker10.getAlpha();
        java.awt.Paint paint14 = valueMarker10.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker16.getLabelAnchor();
        java.awt.Stroke stroke20 = valueMarker16.getStroke();
        java.awt.Paint paint21 = valueMarker16.getLabelPaint();
        double double22 = valueMarker16.getValue();
        valueMarker16.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint27 = valueMarker26.getPaint();
        java.awt.Paint paint28 = valueMarker26.getPaint();
        valueMarker26.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker26.removeChangeListener(markerChangeListener31);
        boolean boolean33 = valueMarker16.equals((java.lang.Object) valueMarker26);
        java.awt.Stroke stroke34 = valueMarker26.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint14, stroke34);
        valueMarker1.setLabelPaint(paint14);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint41 = valueMarker40.getLabelPaint();
        valueMarker38.setPaint(paint41);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker38.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker45.getLabelOffset();
        java.awt.Paint paint47 = valueMarker45.getPaint();
        valueMarker38.setOutlinePaint(paint47);
        valueMarker1.setPaint(paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker45", valueMarker10.equals(valueMarker45) ? valueMarker10.hashCode() == valueMarker45.hashCode() : true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        valueMarker2.setOutlineStroke(stroke9);
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker2.getLabelTextAnchor();
        java.awt.Font font12 = valueMarker2.getLabelFont();
        double double13 = valueMarker2.getValue();
        java.awt.Stroke stroke14 = valueMarker2.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        java.awt.Font font19 = valueMarker16.getLabelFont();
        valueMarker16.setValue((double) (short) 0);
        valueMarker16.setAlpha((float) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker16.removeChangeListener(markerChangeListener24);
        java.awt.Font font26 = valueMarker16.getLabelFont();
        java.awt.Paint paint27 = valueMarker16.getPaint();
        boolean boolean28 = valueMarker2.equals((java.lang.Object) paint27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint31 = valueMarker30.getPaint();
        java.awt.Paint paint32 = valueMarker30.getPaint();
        valueMarker30.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker30.getLabelTextAnchor();
        java.awt.Font font36 = valueMarker30.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker30.removeChangeListener(markerChangeListener37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = valueMarker40.getLabelOffset();
        float float42 = valueMarker40.getAlpha();
        java.awt.Paint paint43 = valueMarker40.getOutlinePaint();
        java.awt.Stroke stroke44 = valueMarker40.getOutlineStroke();
        valueMarker30.setOutlineStroke(stroke44);
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker47.addChangeListener(markerChangeListener48);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener50 = null;
        valueMarker47.addChangeListener(markerChangeListener50);
        java.awt.Font font52 = valueMarker47.getLabelFont();
        double double53 = valueMarker47.getValue();
        java.lang.String str54 = valueMarker47.getLabel();
        java.awt.Stroke stroke55 = valueMarker47.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = valueMarker47.getLabelOffset();
        valueMarker47.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor59 = valueMarker47.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent60 = null;
        valueMarker47.notifyListeners(markerChangeEvent60);
        java.awt.Stroke stroke62 = valueMarker47.getOutlineStroke();
        java.awt.Paint paint63 = valueMarker47.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor66 = valueMarker65.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor69 = valueMarker68.getLabelAnchor();
        java.awt.Paint paint70 = valueMarker68.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor71 = valueMarker68.getLabelAnchor();
        java.awt.Stroke stroke72 = valueMarker68.getStroke();
        valueMarker65.setOutlineStroke(stroke72);
        org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint76 = valueMarker75.getPaint();
        valueMarker65.setLabelPaint(paint76);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener78 = null;
        valueMarker65.addChangeListener(markerChangeListener78);
        java.awt.Stroke stroke80 = valueMarker65.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker82 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f), paint27, stroke44, paint63, stroke80, (float) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker68", valueMarker5.equals(valueMarker68) ? valueMarker5.hashCode() == valueMarker68.hashCode() : true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker15.getLabelOffsetType();
        java.lang.Object obj23 = valueMarker15.clone();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker15.getLabelAnchor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker15 and obj23", valueMarker15.equals(obj23) ? valueMarker15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        java.awt.Paint paint9 = valueMarker4.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker4.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker4.addChangeListener(markerChangeListener11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker4.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker4.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker4", valueMarker1.equals(valueMarker4) ? valueMarker1.hashCode() == valueMarker4.hashCode() : true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker8.setOutlineStroke(stroke14);
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        float float21 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker23.addChangeListener(markerChangeListener24);
        java.awt.Font font26 = valueMarker23.getLabelFont();
        valueMarker23.setValue((double) (short) 0);
        java.awt.Paint paint29 = valueMarker23.getPaint();
        valueMarker23.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker33.addChangeListener(markerChangeListener34);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker33.addChangeListener(markerChangeListener36);
        java.awt.Font font38 = valueMarker33.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker40.addChangeListener(markerChangeListener41);
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint45 = valueMarker44.getLabelPaint();
        java.awt.Paint paint46 = valueMarker44.getLabelPaint();
        valueMarker40.setOutlinePaint(paint46);
        valueMarker33.setPaint(paint46);
        valueMarker23.setLabelPaint(paint46);
        valueMarker1.setPaint(paint46);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint53 = valueMarker52.getPaint();
        java.awt.Paint paint54 = valueMarker52.getPaint();
        valueMarker52.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor57 = valueMarker52.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor58 = valueMarker52.getLabelAnchor();
        valueMarker52.setValue((double) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = valueMarker52.getLabelOffset();
        float float62 = valueMarker52.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint65 = valueMarker64.getLabelPaint();
        java.awt.Paint paint66 = valueMarker64.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor69 = valueMarker68.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor72 = valueMarker71.getLabelAnchor();
        java.awt.Paint paint73 = valueMarker71.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor74 = valueMarker71.getLabelAnchor();
        java.awt.Stroke stroke75 = valueMarker71.getStroke();
        valueMarker68.setOutlineStroke(stroke75);
        valueMarker64.setStroke(stroke75);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener78 = null;
        valueMarker64.addChangeListener(markerChangeListener78);
        java.awt.Paint paint80 = valueMarker64.getLabelPaint();
        valueMarker52.setPaint(paint80);
        valueMarker1.setOutlinePaint(paint80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker71", valueMarker10.equals(valueMarker71) ? valueMarker10.hashCode() == valueMarker71.hashCode() : true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint4 = valueMarker3.getPaint();
        java.awt.Paint paint5 = valueMarker3.getPaint();
        valueMarker3.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker3.getLabelTextAnchor();
        java.awt.Font font9 = valueMarker3.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker3.removeChangeListener(markerChangeListener10);
        float float12 = valueMarker3.getAlpha();
        valueMarker3.setLabel("hi!");
        java.awt.Stroke stroke15 = valueMarker3.getStroke();
        java.awt.Paint paint16 = valueMarker3.getLabelPaint();
        valueMarker1.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        java.awt.Font font22 = valueMarker19.getLabelFont();
        valueMarker19.setValue((double) (short) 0);
        valueMarker19.setValue((double) (byte) 10);
        java.awt.Paint paint27 = valueMarker19.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker29.getLabelAnchor();
        java.awt.Stroke stroke33 = valueMarker29.getStroke();
        java.awt.Paint paint34 = valueMarker29.getLabelPaint();
        double double35 = valueMarker29.getValue();
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        valueMarker19.setPaint(paint36);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker39.getLabelOffset();
        java.awt.Paint paint41 = valueMarker39.getLabelPaint();
        java.awt.Paint paint42 = valueMarker39.getLabelPaint();
        boolean boolean43 = valueMarker19.equals((java.lang.Object) paint42);
        valueMarker1.setOutlinePaint(paint42);
        java.awt.Paint paint45 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint48 = valueMarker47.getPaint();
        java.awt.Paint paint49 = valueMarker47.getPaint();
        valueMarker47.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor52 = valueMarker47.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor57 = valueMarker56.getLabelAnchor();
        java.awt.Paint paint58 = valueMarker56.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor59 = valueMarker56.getLabelAnchor();
        java.awt.Stroke stroke60 = valueMarker56.getStroke();
        valueMarker54.setOutlineStroke(stroke60);
        java.awt.Stroke stroke62 = valueMarker54.getOutlineStroke();
        valueMarker47.setStroke(stroke62);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent64 = null;
        valueMarker47.notifyListeners(markerChangeEvent64);
        java.awt.Stroke stroke66 = valueMarker47.getOutlineStroke();
        boolean boolean67 = valueMarker1.equals((java.lang.Object) stroke66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker29 and valueMarker56", valueMarker29.equals(valueMarker56) ? valueMarker29.hashCode() == valueMarker56.hashCode() : true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 0, paint3, stroke9);
        java.awt.Paint paint11 = valueMarker10.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        valueMarker13.setOutlinePaint(paint19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        valueMarker13.setLabelAnchor(rectangleAnchor23);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker13.notifyListeners(markerChangeEvent25);
        java.awt.Stroke stroke27 = valueMarker13.getStroke();
        valueMarker10.setStroke(stroke27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker17", valueMarker2.equals(valueMarker17) ? valueMarker2.hashCode() == valueMarker17.hashCode() : true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        valueMarker1.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        java.lang.Object obj23 = valueMarker1.clone();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj23", valueMarker1.equals(obj23) ? valueMarker1.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        valueMarker1.setLabel("hi!");
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        valueMarker18.setLabelPaint(paint22);
        valueMarker1.setOutlinePaint(paint22);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker27.addChangeListener(markerChangeListener28);
        java.awt.Paint paint30 = valueMarker27.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker34.getLabelAnchor();
        java.awt.Paint paint36 = valueMarker34.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker34.getLabelAnchor();
        java.awt.Stroke stroke38 = valueMarker34.getStroke();
        valueMarker32.setOutlineStroke(stroke38);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint30, stroke38);
        valueMarker40.setLabel("hi!");
        float float43 = valueMarker40.getAlpha();
        float float44 = valueMarker40.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker40.addChangeListener(markerChangeListener45);
        java.awt.Paint paint47 = valueMarker40.getPaint();
        valueMarker1.setOutlinePaint(paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker34", valueMarker5.equals(valueMarker34) ? valueMarker5.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker6.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker6.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        valueMarker13.setOutlinePaint(paint19);
        valueMarker6.setPaint(paint19);
        valueMarker1.setOutlinePaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker13", valueMarker1.equals(valueMarker13) ? valueMarker1.hashCode() == valueMarker13.hashCode() : true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10);
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker7.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor8);
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.awt.Paint paint15 = valueMarker12.getLabelPaint();
        java.awt.Stroke stroke16 = valueMarker12.getStroke();
        valueMarker12.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        java.awt.Font font23 = valueMarker20.getLabelFont();
        valueMarker20.setValue((double) (short) 0);
        valueMarker20.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker29.getLabelAnchor();
        java.awt.Stroke stroke33 = valueMarker29.getStroke();
        java.awt.Paint paint34 = valueMarker29.getOutlinePaint();
        java.awt.Paint paint35 = valueMarker29.getLabelPaint();
        java.awt.Paint paint36 = valueMarker29.getOutlinePaint();
        boolean boolean37 = valueMarker20.equals((java.lang.Object) paint36);
        valueMarker12.setPaint(paint36);
        valueMarker1.setPaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker29", valueMarker7.equals(valueMarker29) ? valueMarker7.hashCode() == valueMarker29.hashCode() : true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        java.awt.Paint paint18 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        java.lang.String str23 = valueMarker20.getLabel();
        java.awt.Paint paint24 = valueMarker20.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker20.notifyListeners(markerChangeEvent25);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker20.removeChangeListener(markerChangeListener27);
        java.awt.Stroke stroke29 = valueMarker20.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker20.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker20", valueMarker1.equals(valueMarker20) ? valueMarker1.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        java.awt.Paint paint9 = valueMarker7.getPaint();
        valueMarker7.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker7.getLabelTextAnchor();
        java.awt.Font font13 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker16.getLabelPaint();
        java.awt.Stroke stroke20 = valueMarker16.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker16.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        java.awt.Paint paint25 = valueMarker23.getPaint();
        valueMarker23.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker23.getLabelOffset();
        valueMarker16.setLabelOffset(rectangleInsets28);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker16.getLabelOffsetType();
        java.awt.Paint paint31 = valueMarker16.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker16.notifyListeners(markerChangeEvent32);
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker16.getLabelTextAnchor();
        java.awt.Stroke stroke35 = valueMarker16.getStroke();
        java.awt.Paint paint36 = valueMarker16.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker16.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker16", valueMarker1.equals(valueMarker16) ? valueMarker1.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker2.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker10.getLabelOffset();
        float float12 = valueMarker10.getAlpha();
        java.awt.Paint paint13 = valueMarker10.getOutlinePaint();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint8, stroke14);
        valueMarker15.setLabel("hi!");
        double double18 = valueMarker15.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker20.getLabelTextAnchor();
        java.awt.Font font26 = valueMarker20.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker20.removeChangeListener(markerChangeListener27);
        float float29 = valueMarker20.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        java.awt.Paint paint37 = valueMarker32.getLabelPaint();
        double double38 = valueMarker32.getValue();
        java.awt.Stroke stroke39 = null;
        valueMarker32.setOutlineStroke(stroke39);
        java.awt.Paint paint41 = valueMarker32.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker32.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker32.getLabelOffset();
        valueMarker20.setLabelOffset(rectangleInsets43);
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = valueMarker46.getLabelOffset();
        java.awt.Paint paint48 = valueMarker46.getPaint();
        java.awt.Stroke stroke49 = valueMarker46.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor52 = valueMarker51.getLabelAnchor();
        java.awt.Paint paint53 = valueMarker51.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor54 = valueMarker51.getLabelAnchor();
        java.awt.Stroke stroke55 = valueMarker51.getStroke();
        java.awt.Paint paint56 = valueMarker51.getOutlinePaint();
        java.awt.Paint paint57 = valueMarker51.getLabelPaint();
        java.awt.Paint paint58 = valueMarker51.getOutlinePaint();
        valueMarker46.setLabelPaint(paint58);
        valueMarker20.setPaint(paint58);
        boolean boolean61 = valueMarker15.equals((java.lang.Object) valueMarker20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker51", valueMarker2.equals(valueMarker51) ? valueMarker2.hashCode() == valueMarker51.hashCode() : true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.lang.String str4 = valueMarker2.getLabel();
        valueMarker2.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getLabelPaint();
        valueMarker2.setPaint(paint9);
        java.awt.Font font11 = valueMarker2.getLabelFont();
        double double12 = valueMarker2.getValue();
        java.awt.Paint paint13 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getLabelPaint();
        valueMarker15.setLabel("hi!");
        valueMarker15.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.lang.String str25 = valueMarker22.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker22.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        valueMarker15.setLabelOffsetType(lengthAdjustmentType27);
        java.awt.Stroke stroke29 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint13, stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker8 and valueMarker22", valueMarker8.equals(valueMarker22) ? valueMarker8.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker9.addChangeListener(markerChangeListener10);
        java.awt.Font font12 = valueMarker9.getLabelFont();
        valueMarker9.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker16.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker16.getLabelOffset();
        valueMarker9.setLabelOffset(rectangleInsets22);
        valueMarker7.setLabelOffset(rectangleInsets22);
        java.awt.Stroke stroke25 = valueMarker7.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 100.0f, paint5, stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker16", valueMarker2.equals(valueMarker16) ? valueMarker2.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj3", valueMarker1.equals(obj3) ? valueMarker1.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 0, paint3, stroke9);
        java.lang.String str11 = valueMarker10.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker10.notifyListeners(markerChangeEvent12);
        java.lang.Object obj14 = valueMarker10.clone();
        valueMarker10.setValue((double) '#');
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker21.addChangeListener(markerChangeListener22);
        java.lang.String str24 = valueMarker21.getLabel();
        java.awt.Paint paint25 = valueMarker21.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker27.getLabelTextAnchor();
        valueMarker21.setLabelTextAnchor(textAnchor32);
        valueMarker18.setLabelTextAnchor(textAnchor32);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker18.addChangeListener(markerChangeListener35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker18.getLabelOffset();
        valueMarker10.setLabelOffset(rectangleInsets37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker21", valueMarker2.equals(valueMarker21) ? valueMarker2.hashCode() == valueMarker21.hashCode() : true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        float float18 = valueMarker15.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker15.removeChangeListener(markerChangeListener19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker24.getLabelAnchor();
        java.awt.Paint paint26 = valueMarker24.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker24.getLabelAnchor();
        java.awt.Stroke stroke28 = valueMarker24.getStroke();
        valueMarker22.setOutlineStroke(stroke28);
        java.awt.Stroke stroke30 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker22.getLabelOffsetType();
        float float32 = valueMarker22.getAlpha();
        java.awt.Paint paint33 = valueMarker22.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker35.addChangeListener(markerChangeListener36);
        java.awt.Font font38 = valueMarker35.getLabelFont();
        java.awt.Stroke stroke39 = valueMarker35.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker35.getLabelOffset();
        java.awt.Paint paint41 = valueMarker35.getPaint();
        valueMarker22.setOutlinePaint(paint41);
        valueMarker15.setPaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker35", valueMarker2.equals(valueMarker35) ? valueMarker2.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        valueMarker1.setOutlinePaint(paint15);
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setValue((double) (short) 0);
        java.awt.Paint paint27 = null;
        valueMarker24.setOutlinePaint(paint27);
        java.awt.Paint paint29 = valueMarker24.getOutlinePaint();
        java.lang.String str30 = valueMarker24.getLabel();
        java.awt.Stroke stroke31 = valueMarker24.getOutlineStroke();
        java.awt.Stroke stroke32 = valueMarker24.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke32);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker38.getLabelAnchor();
        java.awt.Paint paint40 = valueMarker38.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker38.getLabelAnchor();
        java.awt.Stroke stroke42 = valueMarker38.getStroke();
        valueMarker35.setOutlineStroke(stroke42);
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker35.getLabelTextAnchor();
        java.awt.Font font45 = valueMarker35.getLabelFont();
        valueMarker35.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = valueMarker49.getLabelOffset();
        java.awt.Paint paint51 = valueMarker49.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = valueMarker49.getLabelOffset();
        valueMarker35.setLabelOffset(rectangleInsets52);
        java.awt.Paint paint54 = valueMarker35.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        valueMarker35.notifyListeners(markerChangeEvent55);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType57 = valueMarker35.getLabelOffsetType();
        java.awt.Font font58 = valueMarker35.getLabelFont();
        valueMarker1.setLabelFont(font58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker38", valueMarker5.equals(valueMarker38) ? valueMarker5.hashCode() == valueMarker38.hashCode() : true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker14.setOutlineStroke(stroke21);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        java.awt.Paint paint26 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker31.getLabelAnchor();
        java.awt.Stroke stroke35 = valueMarker31.getStroke();
        valueMarker28.setOutlineStroke(stroke35);
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker28.getLabelTextAnchor();
        valueMarker28.setLabel("hi!");
        java.awt.Stroke stroke40 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker(100.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker42.getLabelOffset();
        valueMarker28.setLabelOffset(rectangleInsets43);
        java.awt.Stroke stroke45 = valueMarker28.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker42", valueMarker1.equals(valueMarker42) ? valueMarker1.hashCode() == valueMarker42.hashCode() : true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker14.setOutlineStroke(stroke21);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        double double26 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker1.notifyListeners(markerChangeEvent27);
        float float29 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint32 = valueMarker31.getPaint();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        java.awt.Font font34 = valueMarker31.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker31.removeChangeListener(markerChangeListener35);
        valueMarker31.setLabel("hi!");
        java.awt.Paint paint39 = valueMarker31.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker41.addChangeListener(markerChangeListener42);
        java.awt.Font font44 = valueMarker41.getLabelFont();
        float float45 = valueMarker41.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor46 = valueMarker41.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor47 = valueMarker41.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener50 = null;
        valueMarker49.addChangeListener(markerChangeListener50);
        java.lang.String str52 = valueMarker49.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = valueMarker49.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = valueMarker55.getLabelAnchor();
        java.awt.Paint paint57 = valueMarker55.getLabelPaint();
        valueMarker49.setOutlinePaint(paint57);
        java.awt.Font font59 = valueMarker49.getLabelFont();
        valueMarker41.setLabelFont(font59);
        valueMarker31.setLabelFont(font59);
        valueMarker1.setLabelFont(font59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker41", valueMarker1.equals(valueMarker41) ? valueMarker1.hashCode() == valueMarker41.hashCode() : true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint7 = valueMarker6.getLabelPaint();
        java.awt.Paint paint8 = valueMarker6.getLabelPaint();
        valueMarker2.setOutlinePaint(paint8);
        float float10 = valueMarker2.getAlpha();
        java.awt.Paint paint11 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        valueMarker13.setOutlinePaint(paint19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker13.addChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker13.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker13.getLabelOffset();
        java.awt.Stroke stroke25 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker27.getLabelTextAnchor();
        java.awt.Font font33 = valueMarker27.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker27.removeChangeListener(markerChangeListener34);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker27.addChangeListener(markerChangeListener36);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker39.addChangeListener(markerChangeListener40);
        java.lang.String str42 = valueMarker39.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker39.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = valueMarker39.getLabelOffsetType();
        java.awt.Font font45 = valueMarker39.getLabelFont();
        valueMarker27.setLabelFont(font45);
        java.awt.Paint paint47 = valueMarker27.getPaint();
        java.awt.Paint paint48 = valueMarker27.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint51 = valueMarker50.getLabelPaint();
        java.awt.Paint paint52 = valueMarker50.getLabelPaint();
        java.lang.String str53 = valueMarker50.getLabel();
        java.awt.Stroke stroke54 = valueMarker50.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint11, stroke25, paint48, stroke54, (float) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker13", valueMarker2.equals(valueMarker13) ? valueMarker2.hashCode() == valueMarker13.hashCode() : true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker2.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        java.awt.Paint paint11 = valueMarker9.getPaint();
        valueMarker9.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker9.getLabelOffset();
        valueMarker2.setLabelOffset(rectangleInsets14);
        java.lang.String str16 = valueMarker2.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker2.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker2.addChangeListener(markerChangeListener18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker21.getLabelOffset();
        java.awt.Paint paint23 = valueMarker21.getPaint();
        valueMarker2.setLabelPaint(paint23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        float float28 = valueMarker26.getAlpha();
        java.awt.Stroke stroke29 = valueMarker26.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str32 = valueMarker31.getLabel();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        java.awt.Paint paint37 = valueMarker35.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker35.getLabelAnchor();
        valueMarker31.setLabelAnchor(rectangleAnchor38);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str42 = valueMarker41.getLabel();
        java.awt.Paint paint43 = valueMarker41.getLabelPaint();
        valueMarker31.setPaint(paint43);
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        float float47 = valueMarker46.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint50 = valueMarker49.getPaint();
        java.awt.Paint paint51 = valueMarker49.getPaint();
        valueMarker49.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = valueMarker49.getLabelOffset();
        java.awt.Font font55 = valueMarker49.getLabelFont();
        java.lang.String str56 = valueMarker49.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker58.addChangeListener(markerChangeListener59);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener61 = null;
        valueMarker58.addChangeListener(markerChangeListener61);
        valueMarker58.setValue((double) 1L);
        java.awt.Font font65 = valueMarker58.getLabelFont();
        java.awt.Stroke stroke66 = valueMarker58.getStroke();
        java.awt.Stroke stroke67 = valueMarker58.getStroke();
        valueMarker49.setOutlineStroke(stroke67);
        valueMarker46.setOutlineStroke(stroke67);
        org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint23, stroke29, paint43, stroke67, (float) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker9 and valueMarker49", valueMarker9.equals(valueMarker49) ? valueMarker9.hashCode() == valueMarker49.hashCode() : true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.lang.Object obj8 = valueMarker1.clone();
        float float9 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj8", valueMarker1.equals(obj8) ? valueMarker1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        double double7 = valueMarker1.getValue();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        java.awt.Paint paint13 = valueMarker11.getPaint();
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker11.removeChangeListener(markerChangeListener16);
        boolean boolean18 = valueMarker1.equals((java.lang.Object) valueMarker11);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj20 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.awt.Paint paint24 = valueMarker22.getPaint();
        valueMarker22.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker22.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        valueMarker22.setLabelAnchor(rectangleAnchor30);
        valueMarker22.setValue((double) '#');
        java.awt.Paint paint34 = valueMarker22.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj20", valueMarker1.equals(obj20) ? valueMarker1.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker8.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint19 = valueMarker18.getLabelPaint();
        java.awt.Paint paint20 = valueMarker18.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        java.awt.Paint paint24 = valueMarker22.getLabelPaint();
        valueMarker18.setPaint(paint24);
        double double26 = valueMarker18.getValue();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker18.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker30.getLabelOffset();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        java.awt.Paint paint33 = valueMarker30.getOutlinePaint();
        valueMarker1.setPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker30", valueMarker1.equals(valueMarker30) ? valueMarker1.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker14.setOutlineStroke(stroke21);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        double double26 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker1.notifyListeners(markerChangeEvent27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint31 = valueMarker30.getPaint();
        java.awt.Paint paint32 = valueMarker30.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker34.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker37.getLabelAnchor();
        java.awt.Paint paint39 = valueMarker37.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker37.getLabelAnchor();
        java.awt.Stroke stroke41 = valueMarker37.getStroke();
        valueMarker34.setOutlineStroke(stroke41);
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker34.getLabelTextAnchor();
        valueMarker30.setLabelTextAnchor(textAnchor43);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        valueMarker30.notifyListeners(markerChangeEvent45);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent47 = null;
        valueMarker30.notifyListeners(markerChangeEvent47);
        valueMarker30.setLabel("");
        valueMarker30.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType53 = valueMarker30.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker14 and valueMarker34", valueMarker14.equals(valueMarker34) ? valueMarker14.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        java.awt.Stroke stroke15 = valueMarker1.getStroke();
        java.lang.String str16 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker20.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker20.getStroke();
        valueMarker18.setOutlineStroke(stroke24);
        java.awt.Paint paint26 = valueMarker18.getPaint();
        java.awt.Paint paint27 = valueMarker18.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker18.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker20", valueMarker10.equals(valueMarker20) ? valueMarker10.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker15.getLabelOffset();
        float float19 = valueMarker15.getAlpha();
        java.awt.Paint paint20 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker25.getLabelAnchor();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker25.getLabelAnchor();
        java.awt.Stroke stroke29 = valueMarker25.getStroke();
        valueMarker22.setOutlineStroke(stroke29);
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker22.getLabelTextAnchor();
        java.awt.Paint paint32 = valueMarker22.getPaint();
        java.awt.Font font33 = valueMarker22.getLabelFont();
        java.lang.String str34 = valueMarker22.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker22.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker9 and valueMarker25", valueMarker9.equals(valueMarker25) ? valueMarker9.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        double double7 = valueMarker1.getValue();
        java.awt.Stroke stroke8 = null;
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker11.addChangeListener(markerChangeListener12);
        java.lang.String str14 = valueMarker11.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker11.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker11.getLabelOffsetType();
        java.awt.Stroke stroke17 = valueMarker11.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker11.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint22 = valueMarker21.getPaint();
        java.awt.Paint paint23 = valueMarker21.getPaint();
        valueMarker21.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker21.getLabelTextAnchor();
        java.awt.Font font27 = valueMarker21.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker21.removeChangeListener(markerChangeListener28);
        float float30 = valueMarker21.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker21.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint35 = valueMarker34.getLabelPaint();
        valueMarker1.setOutlinePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker34", valueMarker11.equals(valueMarker34) ? valueMarker11.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        java.awt.Paint paint15 = valueMarker13.getPaint();
        valueMarker13.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker13.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker13.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker25.getLabelAnchor();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker25.getLabelAnchor();
        java.awt.Stroke stroke29 = valueMarker25.getStroke();
        valueMarker22.setOutlineStroke(stroke29);
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker22.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker22.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor32);
        double double34 = valueMarker9.getValue();
        java.awt.Paint paint35 = valueMarker9.getPaint();
        valueMarker1.setOutlinePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker9", valueMarker1.equals(valueMarker9) ? valueMarker1.hashCode() == valueMarker9.hashCode() : true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker2.getLabelFont();
        valueMarker2.setValue((double) (short) 0);
        valueMarker2.setValue((double) (byte) 10);
        java.awt.Paint paint10 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.awt.Paint paint15 = valueMarker12.getLabelPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0, paint10, stroke16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.awt.Paint paint21 = valueMarker19.getPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker19.getLabelTextAnchor();
        java.awt.Font font25 = valueMarker19.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker19.removeChangeListener(markerChangeListener26);
        valueMarker19.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker32.addChangeListener(markerChangeListener33);
        java.awt.Paint paint35 = valueMarker32.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker39.getLabelAnchor();
        java.awt.Paint paint41 = valueMarker39.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor42 = valueMarker39.getLabelAnchor();
        java.awt.Stroke stroke43 = valueMarker39.getStroke();
        valueMarker37.setOutlineStroke(stroke43);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint35, stroke43);
        valueMarker19.setOutlinePaint(paint35);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = valueMarker19.getLabelAnchor();
        valueMarker17.setLabelAnchor(rectangleAnchor47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker39", valueMarker2.equals(valueMarker39) ? valueMarker2.hashCode() == valueMarker39.hashCode() : true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker14.setOutlineStroke(stroke21);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        double double26 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker1.notifyListeners(markerChangeEvent27);
        float float29 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker5", valueMarker1.equals(valueMarker5) ? valueMarker1.hashCode() == valueMarker5.hashCode() : true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint7 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker11.addChangeListener(markerChangeListener12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        java.awt.Font font16 = valueMarker11.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker11.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.lang.String str22 = valueMarker20.getLabel();
        valueMarker20.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str27 = valueMarker26.getLabel();
        java.awt.Paint paint28 = valueMarker26.getLabelPaint();
        valueMarker20.setOutlinePaint(paint28);
        java.awt.Paint paint30 = valueMarker20.getOutlinePaint();
        valueMarker1.setLabelPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker26", valueMarker11.equals(valueMarker26) ? valueMarker11.hashCode() == valueMarker26.hashCode() : true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker2.setOutlineStroke(stroke8);
        java.awt.Paint paint10 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        valueMarker12.setLabelPaint(paint16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker12.addChangeListener(markerChangeListener18);
        float float20 = valueMarker12.getAlpha();
        java.awt.Stroke stroke21 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker(0.800000011920929d, paint10, stroke21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker12", valueMarker2.equals(valueMarker12) ? valueMarker2.hashCode() == valueMarker12.hashCode() : true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke17 = null;
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker21.getLabelOffset();
        java.awt.Paint paint23 = valueMarker21.getLabelPaint();
        java.awt.Paint paint24 = valueMarker21.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker26.addChangeListener(markerChangeListener27);
        java.lang.String str29 = valueMarker26.getLabel();
        java.awt.Paint paint30 = valueMarker26.getPaint();
        valueMarker21.setLabelPaint(paint30);
        java.lang.Object obj32 = valueMarker21.clone();
        boolean boolean33 = valueMarker1.equals((java.lang.Object) valueMarker21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker21 and obj32", valueMarker21.equals(obj32) ? valueMarker21.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        java.awt.Font font13 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker15.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        java.awt.Paint paint20 = valueMarker18.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker18.getLabelAnchor();
        java.awt.Stroke stroke22 = valueMarker18.getStroke();
        valueMarker15.setOutlineStroke(stroke22);
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker15.getLabelTextAnchor();
        java.awt.Font font25 = valueMarker15.getLabelFont();
        valueMarker15.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker29.getLabelOffset();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker29.getLabelOffset();
        valueMarker15.setLabelOffset(rectangleInsets32);
        java.awt.Paint paint34 = valueMarker15.getPaint();
        valueMarker1.setLabelPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker18", valueMarker4.equals(valueMarker18) ? valueMarker4.hashCode() == valueMarker18.hashCode() : true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        java.awt.Stroke stroke14 = valueMarker1.getStroke();
        java.lang.Object obj15 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getPaint();
        java.awt.Paint paint19 = valueMarker17.getPaint();
        valueMarker17.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker17.getLabelTextAnchor();
        java.awt.Font font23 = valueMarker17.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker17.removeChangeListener(markerChangeListener24);
        float float26 = valueMarker17.getAlpha();
        valueMarker17.setLabel("hi!");
        java.awt.Stroke stroke29 = valueMarker17.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker17.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker17.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj15", valueMarker1.equals(obj15) ? valueMarker1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        java.lang.String str13 = valueMarker1.getLabel();
        double double14 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint19 = valueMarker18.getPaint();
        java.awt.Paint paint20 = valueMarker18.getPaint();
        valueMarker18.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker18.getLabelTextAnchor();
        java.awt.Font font24 = valueMarker18.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker18.removeChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker18.getLabelFont();
        java.awt.Stroke stroke28 = valueMarker18.getOutlineStroke();
        java.lang.String str29 = valueMarker18.getLabel();
        java.awt.Paint paint30 = valueMarker18.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint34 = valueMarker33.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker36.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker39.getLabelAnchor();
        java.awt.Paint paint41 = valueMarker39.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor42 = valueMarker39.getLabelAnchor();
        java.awt.Stroke stroke43 = valueMarker39.getStroke();
        valueMarker36.setOutlineStroke(stroke43);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 0, paint34, stroke43);
        valueMarker45.setLabel("hi!");
        org.jfree.chart.text.TextAnchor textAnchor48 = valueMarker45.getLabelTextAnchor();
        java.awt.Stroke stroke49 = valueMarker45.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 1, paint30, stroke49);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setValue((double) (short) 0);
        java.awt.Paint paint55 = null;
        valueMarker52.setOutlinePaint(paint55);
        java.awt.Paint paint57 = valueMarker52.getOutlinePaint();
        java.lang.String str58 = valueMarker52.getLabel();
        java.awt.Stroke stroke59 = valueMarker52.getOutlineStroke();
        java.awt.Stroke stroke60 = valueMarker52.getOutlineStroke();
        valueMarker50.setOutlineStroke(stroke60);
        valueMarker1.setOutlineStroke(stroke60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker36", valueMarker1.equals(valueMarker36) ? valueMarker1.hashCode() == valueMarker36.hashCode() : true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker14.addChangeListener(markerChangeListener15);
        java.lang.String str17 = valueMarker14.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker14.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker14.getLabelOffsetType();
        java.awt.Stroke stroke20 = valueMarker14.getOutlineStroke();
        valueMarker12.setOutlineStroke(stroke20);
        boolean boolean22 = valueMarker1.equals((java.lang.Object) valueMarker12);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        float float26 = valueMarker24.getAlpha();
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        java.awt.Font font29 = valueMarker24.getLabelFont();
        java.awt.Paint paint30 = valueMarker24.getPaint();
        valueMarker12.setPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker14 and valueMarker24", valueMarker14.equals(valueMarker24) ? valueMarker14.hashCode() == valueMarker24.hashCode() : true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker3.addChangeListener(markerChangeListener4);
        java.lang.String str6 = valueMarker3.getLabel();
        java.awt.Paint paint7 = valueMarker3.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        java.awt.Paint paint11 = valueMarker9.getPaint();
        valueMarker9.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker9.getLabelTextAnchor();
        valueMarker3.setLabelTextAnchor(textAnchor14);
        valueMarker1.setLabelTextAnchor(textAnchor14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker3", valueMarker1.equals(valueMarker3) ? valueMarker1.hashCode() == valueMarker3.hashCode() : true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker3.getLabelAnchor();
        java.awt.Paint paint5 = valueMarker3.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker3.getLabelAnchor();
        java.awt.Stroke stroke7 = valueMarker3.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getLabelPaint();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        valueMarker12.setPaint(paint18);
        double double20 = valueMarker12.getValue();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker12.getLabelTextAnchor();
        java.awt.Paint paint22 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker24.getLabelPaint();
        java.awt.Stroke stroke28 = valueMarker24.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker24.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint32 = valueMarker31.getPaint();
        java.awt.Paint paint33 = valueMarker31.getPaint();
        valueMarker31.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = valueMarker31.getLabelOffset();
        valueMarker24.setLabelOffset(rectangleInsets36);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker24.getLabelOffsetType();
        java.awt.Paint paint39 = valueMarker24.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        valueMarker24.notifyListeners(markerChangeEvent40);
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker24.getLabelTextAnchor();
        java.awt.Stroke stroke43 = valueMarker24.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 1, paint22, stroke43);
        valueMarker1.setOutlineStroke(stroke43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker3 and valueMarker16", valueMarker3.equals(valueMarker16) ? valueMarker3.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        java.lang.String str8 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        valueMarker10.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        valueMarker10.setLabelAnchor(rectangleAnchor20);
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker24.getLabelFont();
        valueMarker24.setValue((double) (short) 0);
        java.awt.Paint paint30 = valueMarker24.getPaint();
        valueMarker1.setOutlinePaint(paint30);
        java.lang.Object obj32 = valueMarker1.clone();
        java.awt.Paint paint33 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj32", valueMarker1.equals(obj32) ? valueMarker1.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        valueMarker1.setLabelPaint(paint12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        java.awt.Stroke stroke16 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker19.getLabelPaint();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        valueMarker19.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker27.addChangeListener(markerChangeListener28);
        java.awt.Font font30 = valueMarker27.getLabelFont();
        valueMarker27.setValue((double) (short) 0);
        valueMarker27.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker36.getLabelAnchor();
        java.awt.Paint paint38 = valueMarker36.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker36.getLabelAnchor();
        java.awt.Stroke stroke40 = valueMarker36.getStroke();
        java.awt.Paint paint41 = valueMarker36.getOutlinePaint();
        java.awt.Paint paint42 = valueMarker36.getLabelPaint();
        java.awt.Paint paint43 = valueMarker36.getOutlinePaint();
        boolean boolean44 = valueMarker27.equals((java.lang.Object) paint43);
        valueMarker19.setPaint(paint43);
        valueMarker1.setLabelPaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker36", valueMarker4.equals(valueMarker36) ? valueMarker4.hashCode() == valueMarker36.hashCode() : true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker2.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        double double8 = valueMarker2.getValue();
        java.awt.Stroke stroke9 = null;
        valueMarker2.setOutlineStroke(stroke9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker12.getLabelFont();
        valueMarker12.setValue((double) (short) 0);
        valueMarker12.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker21.getLabelOffset();
        java.awt.Paint paint23 = valueMarker21.getPaint();
        valueMarker12.setLabelPaint(paint23);
        java.awt.Paint paint25 = valueMarker12.getLabelPaint();
        valueMarker2.setOutlinePaint(paint25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        java.awt.Paint paint33 = valueMarker28.getLabelPaint();
        double double34 = valueMarker28.getValue();
        valueMarker28.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker38.removeChangeListener(markerChangeListener43);
        boolean boolean45 = valueMarker28.equals((java.lang.Object) valueMarker38);
        java.awt.Stroke stroke46 = valueMarker38.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str49 = valueMarker48.getLabel();
        java.awt.Paint paint50 = valueMarker48.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = valueMarker52.getLabelAnchor();
        java.awt.Paint paint54 = valueMarker52.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = valueMarker52.getLabelAnchor();
        valueMarker48.setLabelAnchor(rectangleAnchor55);
        java.awt.Paint paint57 = valueMarker48.getLabelPaint();
        float float58 = valueMarker48.getAlpha();
        java.awt.Paint paint59 = valueMarker48.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor62 = valueMarker61.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor65 = valueMarker64.getLabelAnchor();
        java.awt.Paint paint66 = valueMarker64.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor67 = valueMarker64.getLabelAnchor();
        java.awt.Stroke stroke68 = valueMarker64.getStroke();
        valueMarker61.setOutlineStroke(stroke68);
        org.jfree.chart.text.TextAnchor textAnchor70 = valueMarker61.getLabelTextAnchor();
        valueMarker61.setLabel("hi!");
        java.awt.Stroke stroke73 = valueMarker61.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint25, stroke46, paint59, stroke73, (float) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker21 and valueMarker48", valueMarker21.equals(valueMarker48) ? valueMarker21.hashCode() == valueMarker48.hashCode() : true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        double double8 = valueMarker1.getValue();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker14.addChangeListener(markerChangeListener15);
        java.awt.Paint paint17 = valueMarker14.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker21.getLabelAnchor();
        java.awt.Paint paint23 = valueMarker21.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker21.getLabelAnchor();
        java.awt.Stroke stroke25 = valueMarker21.getStroke();
        valueMarker19.setOutlineStroke(stroke25);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint17, stroke25);
        java.awt.Font font28 = valueMarker27.getLabelFont();
        valueMarker1.setLabelFont(font28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker14", valueMarker1.equals(valueMarker14) ? valueMarker1.hashCode() == valueMarker14.hashCode() : true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker15.getLabelOffset();
        float float19 = valueMarker15.getAlpha();
        java.awt.Paint paint20 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker22.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker22.getLabelFont();
        double double28 = valueMarker22.getValue();
        java.lang.String str29 = valueMarker22.getLabel();
        java.awt.Stroke stroke30 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker22.getLabelOffset();
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker22.getLabelTextAnchor();
        valueMarker22.setValue((double) 10);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker38.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker45.getLabelAnchor();
        valueMarker38.setLabelAnchor(rectangleAnchor46);
        valueMarker38.setValue((double) '#');
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker51.addChangeListener(markerChangeListener52);
        java.awt.Font font54 = valueMarker51.getLabelFont();
        java.awt.Paint paint55 = valueMarker51.getLabelPaint();
        java.awt.Paint paint56 = valueMarker51.getPaint();
        valueMarker38.setPaint(paint56);
        java.awt.Font font58 = valueMarker38.getLabelFont();
        boolean boolean59 = valueMarker22.equals((java.lang.Object) font58);
        valueMarker15.setLabelFont(font58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker51", valueMarker2.equals(valueMarker51) ? valueMarker2.hashCode() == valueMarker51.hashCode() : true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker9.addChangeListener(markerChangeListener10);
        java.awt.Paint paint12 = valueMarker9.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker16.getLabelAnchor();
        java.awt.Stroke stroke20 = valueMarker16.getStroke();
        valueMarker14.setOutlineStroke(stroke20);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint12, stroke20);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint25 = valueMarker24.getPaint();
        java.awt.Paint paint26 = valueMarker24.getPaint();
        valueMarker24.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker24.getLabelTextAnchor();
        java.awt.Font font30 = valueMarker24.getLabelFont();
        valueMarker22.setLabelFont(font30);
        java.awt.Paint paint32 = valueMarker22.getPaint();
        java.awt.Stroke stroke33 = valueMarker22.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker22.addChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker22.getLabelFont();
        valueMarker1.setLabelFont(font36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker9", valueMarker1.equals(valueMarker9) ? valueMarker1.hashCode() == valueMarker9.hashCode() : true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker2.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker10.getLabelOffset();
        float float12 = valueMarker10.getAlpha();
        java.awt.Paint paint13 = valueMarker10.getOutlinePaint();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint8, stroke14);
        valueMarker15.setLabel("hi!");
        java.lang.Object obj18 = valueMarker15.clone();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setValue((double) (short) 0);
        java.awt.Paint paint23 = null;
        valueMarker20.setOutlinePaint(paint23);
        java.awt.Paint paint25 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker20.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker20.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker29.getLabelOffset();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        valueMarker20.setOutlinePaint(paint31);
        valueMarker15.setPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker29", valueMarker10.equals(valueMarker29) ? valueMarker10.hashCode() == valueMarker29.hashCode() : true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        float float10 = valueMarker8.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        java.lang.String str14 = valueMarker12.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.removeChangeListener(markerChangeListener15);
        java.awt.Paint paint17 = valueMarker12.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.awt.Paint paint21 = valueMarker19.getPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker19.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        valueMarker26.setOutlineStroke(stroke32);
        java.awt.Stroke stroke34 = valueMarker26.getOutlineStroke();
        valueMarker19.setStroke(stroke34);
        valueMarker12.setStroke(stroke34);
        valueMarker8.setStroke(stroke34);
        valueMarker1.setOutlineStroke(stroke34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker12", valueMarker1.equals(valueMarker12) ? valueMarker1.hashCode() == valueMarker12.hashCode() : true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.addChangeListener(markerChangeListener17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker20.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker20.getStroke();
        java.awt.Paint paint25 = valueMarker20.getOutlinePaint();
        java.awt.Stroke stroke26 = valueMarker20.getStroke();
        valueMarker1.setOutlineStroke(stroke26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker8 and valueMarker20", valueMarker8.equals(valueMarker20) ? valueMarker8.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker15.getLabelOffsetType();
        java.lang.Object obj23 = valueMarker15.clone();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker15.getLabelTextAnchor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker15 and obj23", valueMarker15.equals(obj23) ? valueMarker15.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        valueMarker1.setOutlinePaint(paint15);
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint25 = valueMarker24.getPaint();
        java.awt.Paint paint26 = valueMarker24.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker31.getLabelAnchor();
        java.awt.Stroke stroke35 = valueMarker31.getStroke();
        valueMarker28.setOutlineStroke(stroke35);
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker28.getLabelTextAnchor();
        valueMarker24.setLabelTextAnchor(textAnchor37);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        valueMarker24.notifyListeners(markerChangeEvent39);
        java.awt.Paint paint41 = valueMarker24.getOutlinePaint();
        valueMarker1.setLabelPaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker31", valueMarker5.equals(valueMarker31) ? valueMarker5.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        java.awt.Font font17 = valueMarker12.getLabelFont();
        double double18 = valueMarker12.getValue();
        java.lang.String str19 = valueMarker12.getLabel();
        java.awt.Stroke stroke20 = valueMarker12.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        java.awt.Paint paint25 = valueMarker23.getPaint();
        valueMarker23.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker23.getLabelTextAnchor();
        java.awt.Font font29 = valueMarker23.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker23.removeChangeListener(markerChangeListener30);
        valueMarker23.setValue((double) (short) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker23.getLabelOffsetType();
        java.awt.Stroke stroke35 = valueMarker23.getStroke();
        valueMarker1.setOutlineStroke(stroke35);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker1.getLabelAnchor();
        java.lang.Object obj38 = valueMarker1.clone();
        java.awt.Paint paint39 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj38", valueMarker1.equals(obj38) ? valueMarker1.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha((float) (short) 1);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        java.awt.Font font14 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker8.removeChangeListener(markerChangeListener15);
        valueMarker8.setValue((double) (short) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setValue((double) (short) 0);
        java.awt.Paint paint24 = null;
        valueMarker21.setOutlinePaint(paint24);
        java.awt.Paint paint26 = valueMarker21.getOutlinePaint();
        java.lang.String str27 = valueMarker21.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint31 = valueMarker30.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        java.awt.Paint paint35 = valueMarker33.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker33.getLabelAnchor();
        java.awt.Stroke stroke37 = valueMarker33.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 0, paint31, stroke37);
        valueMarker21.setLabelPaint(paint31);
        valueMarker8.setLabelPaint(paint31);
        boolean boolean41 = valueMarker1.equals((java.lang.Object) paint31);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker43.addChangeListener(markerChangeListener44);
        java.awt.Font font46 = valueMarker43.getLabelFont();
        java.awt.Stroke stroke47 = valueMarker43.getOutlineStroke();
        valueMarker43.setValue((double) 10);
        java.awt.Font font50 = valueMarker43.getLabelFont();
        valueMarker1.setLabelFont(font50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker33 and valueMarker43", valueMarker33.equals(valueMarker43) ? valueMarker33.hashCode() == valueMarker43.hashCode() : true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        double double7 = valueMarker1.getValue();
        java.lang.String str8 = valueMarker1.getLabel();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        java.awt.Font font17 = valueMarker14.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker14.removeChangeListener(markerChangeListener18);
        valueMarker14.setLabel("hi!");
        java.awt.Paint paint22 = valueMarker14.getOutlinePaint();
        valueMarker1.setPaint(paint22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker25.getLabelOffset();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        java.awt.Paint paint28 = valueMarker25.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker30.addChangeListener(markerChangeListener31);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker30.addChangeListener(markerChangeListener33);
        java.awt.Font font35 = valueMarker30.getLabelFont();
        double double36 = valueMarker30.getValue();
        java.lang.String str37 = valueMarker30.getLabel();
        java.awt.Stroke stroke38 = valueMarker30.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker30.getLabelOffset();
        valueMarker30.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker30.getLabelTextAnchor();
        valueMarker25.setLabelTextAnchor(textAnchor42);
        valueMarker1.setLabelTextAnchor(textAnchor42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker25", valueMarker1.equals(valueMarker25) ? valueMarker1.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker1.getLabelPaint();
        java.lang.Object obj13 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        valueMarker15.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker15.getLabelOffset();
        java.awt.Font font21 = valueMarker15.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker15.getLabelOffsetType();
        java.awt.Font font23 = valueMarker15.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker15.removeChangeListener(markerChangeListener24);
        boolean boolean26 = valueMarker1.equals((java.lang.Object) valueMarker15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj13", valueMarker1.equals(obj13) ? valueMarker1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setValue((double) (short) 0);
        java.awt.Paint paint24 = valueMarker21.getPaint();
        valueMarker1.setLabelPaint(paint24);
        java.awt.Stroke stroke26 = null;
        valueMarker1.setOutlineStroke(stroke26);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker29.addChangeListener(markerChangeListener30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker29.addChangeListener(markerChangeListener32);
        java.awt.Font font34 = valueMarker29.getLabelFont();
        double double35 = valueMarker29.getValue();
        java.lang.String str36 = valueMarker29.getLabel();
        java.awt.Stroke stroke37 = valueMarker29.getOutlineStroke();
        java.awt.Stroke stroke38 = valueMarker29.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker40.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = valueMarker43.getLabelAnchor();
        java.awt.Paint paint45 = valueMarker43.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker43.getLabelAnchor();
        java.awt.Stroke stroke47 = valueMarker43.getStroke();
        valueMarker40.setOutlineStroke(stroke47);
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker40.getLabelTextAnchor();
        java.awt.Font font50 = valueMarker40.getLabelFont();
        valueMarker40.setAlpha(0.0f);
        java.awt.Stroke stroke53 = valueMarker40.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor54 = valueMarker40.getLabelAnchor();
        valueMarker29.setLabelAnchor(rectangleAnchor54);
        valueMarker1.setLabelAnchor(rectangleAnchor54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker14 and valueMarker29", valueMarker14.equals(valueMarker29) ? valueMarker14.hashCode() == valueMarker29.hashCode() : true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker8.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets13);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker1.notifyListeners(markerChangeEvent17);
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke20 = valueMarker1.getStroke();
        java.awt.Paint paint21 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker8", valueMarker1.equals(valueMarker8) ? valueMarker1.hashCode() == valueMarker8.hashCode() : true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker7.getLabelAnchor();
        java.awt.Paint paint9 = valueMarker7.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker7.getLabelAnchor();
        java.awt.Stroke stroke11 = valueMarker7.getStroke();
        valueMarker4.setOutlineStroke(stroke11);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker4.getLabelTextAnchor();
        java.awt.Font font14 = valueMarker4.getLabelFont();
        valueMarker4.setAlpha(0.0f);
        java.awt.Stroke stroke17 = valueMarker4.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.removeChangeListener(markerChangeListener19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker22.notifyListeners(markerChangeEvent23);
        java.lang.String str25 = valueMarker22.getLabel();
        java.awt.Stroke stroke26 = valueMarker22.getStroke();
        valueMarker1.setOutlineStroke(stroke26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker22", valueMarker1.equals(valueMarker22) ? valueMarker1.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker8.addChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getLabelPaint();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        valueMarker8.setOutlinePaint(paint14);
        java.awt.Paint paint16 = valueMarker8.getOutlinePaint();
        java.awt.Stroke stroke17 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setValue((double) (short) 0);
        java.awt.Paint paint22 = null;
        valueMarker19.setOutlinePaint(paint22);
        boolean boolean24 = valueMarker8.equals((java.lang.Object) paint22);
        java.awt.Paint paint25 = valueMarker8.getLabelPaint();
        valueMarker1.setLabelPaint(paint25);
        java.awt.Paint paint27 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker30.addChangeListener(markerChangeListener31);
        java.awt.Font font33 = valueMarker30.getLabelFont();
        float float34 = valueMarker30.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker30.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker30.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker38.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker45.getLabelAnchor();
        valueMarker38.setLabelAnchor(rectangleAnchor46);
        valueMarker30.setLabelAnchor(rectangleAnchor46);
        java.awt.Stroke stroke49 = valueMarker30.getStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = valueMarker30.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker12 and valueMarker30", valueMarker12.equals(valueMarker30) ? valueMarker12.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker4.addChangeListener(markerChangeListener5);
        java.lang.String str7 = valueMarker4.getLabel();
        java.awt.Paint paint8 = valueMarker4.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint11 = valueMarker10.getPaint();
        java.awt.Paint paint12 = valueMarker10.getPaint();
        valueMarker10.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker10.getLabelTextAnchor();
        valueMarker4.setLabelTextAnchor(textAnchor15);
        valueMarker1.setLabelTextAnchor(textAnchor15);
        float float18 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker22.getLabelFont();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        valueMarker1.setStroke(stroke26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker22", valueMarker4.equals(valueMarker22) ? valueMarker4.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker15.setOutlineStroke(stroke21);
        java.awt.Stroke stroke23 = valueMarker15.getOutlineStroke();
        valueMarker8.setStroke(stroke23);
        valueMarker1.setStroke(stroke23);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker27.addChangeListener(markerChangeListener28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint32 = valueMarker31.getLabelPaint();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        valueMarker27.setOutlinePaint(paint33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker36.getLabelAnchor();
        valueMarker27.setLabelAnchor(rectangleAnchor37);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        valueMarker27.notifyListeners(markerChangeEvent39);
        java.awt.Stroke stroke41 = valueMarker27.getStroke();
        java.lang.String str42 = valueMarker27.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker27.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker31", valueMarker1.equals(valueMarker31) ? valueMarker1.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj7", valueMarker1.equals(obj7) ? valueMarker1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker8.addChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getLabelPaint();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        valueMarker8.setOutlinePaint(paint14);
        java.awt.Paint paint16 = valueMarker8.getOutlinePaint();
        java.awt.Stroke stroke17 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setValue((double) (short) 0);
        java.awt.Paint paint22 = null;
        valueMarker19.setOutlinePaint(paint22);
        boolean boolean24 = valueMarker8.equals((java.lang.Object) paint22);
        java.awt.Paint paint25 = valueMarker8.getLabelPaint();
        valueMarker1.setLabelPaint(paint25);
        java.awt.Paint paint27 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker1.getLabelAnchor();
        java.lang.Object obj29 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint33 = valueMarker32.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        java.awt.Paint paint37 = valueMarker35.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker35.getLabelAnchor();
        java.awt.Stroke stroke39 = valueMarker35.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 0, paint33, stroke39);
        java.lang.String str41 = valueMarker40.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        valueMarker40.notifyListeners(markerChangeEvent42);
        java.awt.Font font44 = valueMarker40.getLabelFont();
        valueMarker1.setLabelFont(font44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj29", valueMarker1.equals(obj29) ? valueMarker1.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setValue((double) (short) 0);
        java.awt.Paint paint11 = valueMarker8.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.awt.Font font16 = valueMarker13.getLabelFont();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker(0.0d, paint11, stroke17);
        valueMarker1.setPaint(paint11);
        java.lang.String str20 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        java.awt.Paint paint24 = valueMarker22.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker22.getLabelAnchor();
        java.awt.Stroke stroke26 = valueMarker22.getStroke();
        java.awt.Paint paint27 = valueMarker22.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker22.removeChangeListener(markerChangeListener28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker31.addChangeListener(markerChangeListener32);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.addChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker31.getLabelFont();
        double double37 = valueMarker31.getValue();
        java.lang.String str38 = valueMarker31.getLabel();
        java.awt.Stroke stroke39 = valueMarker31.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker31.getLabelOffset();
        java.awt.Paint paint41 = valueMarker31.getLabelPaint();
        valueMarker22.setPaint(paint41);
        java.awt.Paint paint43 = valueMarker22.getOutlinePaint();
        valueMarker1.setLabelPaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker13 and valueMarker31", valueMarker13.equals(valueMarker31) ? valueMarker13.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        java.lang.Object obj18 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj18", valueMarker1.equals(obj18) ? valueMarker1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setValue((double) (short) 0);
        java.awt.Paint paint11 = valueMarker8.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.awt.Font font16 = valueMarker13.getLabelFont();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker(0.0d, paint11, stroke17);
        valueMarker1.setPaint(paint11);
        java.lang.String str20 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker24.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker31.getLabelAnchor();
        java.awt.Stroke stroke35 = valueMarker31.getStroke();
        valueMarker29.setOutlineStroke(stroke35);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint27, stroke35);
        valueMarker37.setLabel("hi!");
        float float40 = valueMarker37.getAlpha();
        float float41 = valueMarker37.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker37.addChangeListener(markerChangeListener42);
        java.awt.Paint paint44 = valueMarker37.getPaint();
        valueMarker1.setLabelPaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker31", valueMarker1.equals(valueMarker31) ? valueMarker1.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) 1.0f);
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker15.getLabelAnchor();
        java.awt.Paint paint17 = valueMarker15.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker15.getLabelAnchor();
        java.awt.Stroke stroke19 = valueMarker15.getStroke();
        valueMarker12.setOutlineStroke(stroke19);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker12.getLabelTextAnchor();
        java.awt.Font font22 = valueMarker12.getLabelFont();
        valueMarker12.setAlpha(0.0f);
        java.awt.Stroke stroke25 = valueMarker12.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker12.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor26);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        valueMarker29.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint34 = valueMarker33.getPaint();
        java.awt.Paint paint35 = valueMarker33.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint38 = valueMarker37.getPaint();
        java.awt.Paint paint39 = valueMarker37.getPaint();
        valueMarker37.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker37.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker37.getLabelAnchor();
        valueMarker33.setLabelAnchor(rectangleAnchor43);
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = valueMarker46.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = valueMarker49.getLabelAnchor();
        java.awt.Paint paint51 = valueMarker49.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor52 = valueMarker49.getLabelAnchor();
        java.awt.Stroke stroke53 = valueMarker49.getStroke();
        valueMarker46.setOutlineStroke(stroke53);
        org.jfree.chart.text.TextAnchor textAnchor55 = valueMarker46.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = valueMarker46.getLabelAnchor();
        valueMarker33.setLabelAnchor(rectangleAnchor56);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor58 = valueMarker33.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor59 = valueMarker33.getLabelAnchor();
        valueMarker29.setLabelAnchor(rectangleAnchor59);
        boolean boolean61 = valueMarker1.equals((java.lang.Object) rectangleAnchor59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and valueMarker33", obj7.equals(valueMarker33) ? obj7.hashCode() == valueMarker33.hashCode() : true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        float float9 = valueMarker1.getAlpha();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        float float14 = valueMarker12.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        java.lang.String str18 = valueMarker16.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.removeChangeListener(markerChangeListener19);
        java.awt.Paint paint21 = valueMarker16.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        java.awt.Paint paint25 = valueMarker23.getPaint();
        valueMarker23.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker23.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        valueMarker30.setOutlineStroke(stroke36);
        java.awt.Stroke stroke38 = valueMarker30.getOutlineStroke();
        valueMarker23.setStroke(stroke38);
        valueMarker16.setStroke(stroke38);
        valueMarker12.setStroke(stroke38);
        valueMarker1.setOutlineStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker16", valueMarker5.equals(valueMarker16) ? valueMarker5.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str3 = valueMarker2.getLabel();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker2.getLabelOffsetType();
        java.awt.Paint paint6 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        java.awt.Stroke stroke11 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f), paint6, stroke11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Paint paint16 = valueMarker14.getPaint();
        valueMarker14.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker14.getLabelTextAnchor();
        java.awt.Font font20 = valueMarker14.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker14.removeChangeListener(markerChangeListener21);
        float float23 = valueMarker14.getAlpha();
        valueMarker14.setLabel("hi!");
        java.awt.Stroke stroke26 = valueMarker14.getStroke();
        java.awt.Paint paint27 = valueMarker14.getLabelPaint();
        java.awt.Font font28 = valueMarker14.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker14.getLabelOffset();
        java.awt.Font font30 = valueMarker14.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint33 = valueMarker32.getPaint();
        java.awt.Paint paint34 = valueMarker32.getPaint();
        valueMarker32.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker32.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor42 = valueMarker41.getLabelAnchor();
        java.awt.Paint paint43 = valueMarker41.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = valueMarker41.getLabelAnchor();
        java.awt.Stroke stroke45 = valueMarker41.getStroke();
        valueMarker39.setOutlineStroke(stroke45);
        java.awt.Stroke stroke47 = valueMarker39.getOutlineStroke();
        valueMarker32.setStroke(stroke47);
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker32.getLabelTextAnchor();
        java.awt.Stroke stroke50 = valueMarker32.getStroke();
        java.awt.Paint paint51 = valueMarker32.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker53.addChangeListener(markerChangeListener54);
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint58 = valueMarker57.getLabelPaint();
        java.awt.Paint paint59 = valueMarker57.getLabelPaint();
        valueMarker53.setOutlinePaint(paint59);
        java.lang.String str61 = valueMarker53.getLabel();
        java.awt.Paint paint62 = valueMarker53.getLabelPaint();
        valueMarker32.setOutlinePaint(paint62);
        valueMarker14.setOutlinePaint(paint62);
        valueMarker12.setLabelPaint(paint62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker57", valueMarker2.equals(valueMarker57) ? valueMarker2.hashCode() == valueMarker57.hashCode() : true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.awt.Paint paint16 = valueMarker13.getLabelPaint();
        java.awt.Stroke stroke17 = valueMarker13.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker13.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker20.getLabelOffset();
        valueMarker13.setLabelOffset(rectangleInsets25);
        java.lang.String str27 = valueMarker13.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker13.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker13.notifyListeners(markerChangeEvent29);
        java.awt.Stroke stroke31 = valueMarker13.getOutlineStroke();
        valueMarker1.setStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker20", valueMarker1.equals(valueMarker20) ? valueMarker1.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker3.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker3.getLabelFont();
        valueMarker3.setValue((double) (short) 0);
        valueMarker3.setValue((double) (byte) 10);
        java.awt.Paint paint11 = valueMarker3.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.awt.Paint paint16 = valueMarker13.getLabelPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 0, paint11, stroke17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker20.getLabelTextAnchor();
        java.awt.Font font26 = valueMarker20.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker20.removeChangeListener(markerChangeListener27);
        float float29 = valueMarker20.getAlpha();
        valueMarker20.setLabel("hi!");
        java.awt.Stroke stroke32 = valueMarker20.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker34.addChangeListener(markerChangeListener35);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        java.awt.Font font39 = valueMarker34.getLabelFont();
        valueMarker20.setLabelFont(font39);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker20.removeChangeListener(markerChangeListener41);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker20.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint46 = valueMarker45.getPaint();
        java.awt.Paint paint47 = valueMarker45.getPaint();
        valueMarker45.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor50 = valueMarker45.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = valueMarker54.getLabelAnchor();
        java.awt.Paint paint56 = valueMarker54.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor57 = valueMarker54.getLabelAnchor();
        java.awt.Stroke stroke58 = valueMarker54.getStroke();
        valueMarker52.setOutlineStroke(stroke58);
        java.awt.Stroke stroke60 = valueMarker52.getOutlineStroke();
        valueMarker45.setStroke(stroke60);
        org.jfree.chart.text.TextAnchor textAnchor62 = valueMarker45.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker64.setValue((double) (short) 0);
        java.awt.Paint paint67 = null;
        valueMarker64.setOutlinePaint(paint67);
        java.awt.Paint paint69 = valueMarker64.getOutlinePaint();
        java.lang.String str70 = valueMarker64.getLabel();
        java.awt.Stroke stroke71 = valueMarker64.getOutlineStroke();
        java.awt.Stroke stroke72 = valueMarker64.getOutlineStroke();
        valueMarker45.setOutlineStroke(stroke72);
        valueMarker20.setStroke(stroke72);
        org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker(52.0d, paint11, stroke72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker3 and valueMarker54", valueMarker3.equals(valueMarker54) ? valueMarker3.hashCode() == valueMarker54.hashCode() : true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        java.awt.Font font19 = valueMarker16.getLabelFont();
        valueMarker16.setValue((double) (short) 0);
        valueMarker16.setValue((double) (byte) 10);
        java.awt.Stroke stroke24 = valueMarker16.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        java.awt.Paint paint28 = valueMarker26.getLabelPaint();
        java.awt.Paint paint29 = valueMarker26.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker26.getLabelPaint();
        java.awt.Stroke stroke31 = valueMarker26.getStroke();
        valueMarker16.setOutlineStroke(stroke31);
        java.awt.Font font33 = valueMarker16.getLabelFont();
        java.awt.Paint paint34 = valueMarker16.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker16.notifyListeners(markerChangeEvent35);
        java.awt.Stroke stroke37 = valueMarker16.getOutlineStroke();
        valueMarker1.setStroke(stroke37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker16", valueMarker4.equals(valueMarker16) ? valueMarker4.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(10.0d);
        java.lang.Object obj2 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj2", valueMarker1.equals(obj2) ? valueMarker1.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint11 = valueMarker10.getPaint();
        java.awt.Paint paint12 = valueMarker10.getPaint();
        valueMarker10.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker10.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker19.getLabelAnchor();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        valueMarker17.setOutlineStroke(stroke23);
        java.awt.Stroke stroke25 = valueMarker17.getOutlineStroke();
        valueMarker10.setStroke(stroke25);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker10.getLabelTextAnchor();
        java.awt.Stroke stroke28 = valueMarker10.getStroke();
        java.awt.Paint paint29 = valueMarker10.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker(1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        java.awt.Paint paint35 = valueMarker33.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker33.getLabelAnchor();
        java.awt.Stroke stroke37 = valueMarker33.getStroke();
        java.awt.Paint paint38 = valueMarker33.getLabelPaint();
        double double39 = valueMarker33.getValue();
        java.awt.Stroke stroke40 = null;
        valueMarker33.setOutlineStroke(stroke40);
        java.awt.Paint paint42 = valueMarker33.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker33.getLabelTextAnchor();
        valueMarker31.setLabelTextAnchor(textAnchor43);
        java.awt.Paint paint45 = valueMarker31.getOutlinePaint();
        valueMarker10.setOutlinePaint(paint45);
        valueMarker1.setOutlinePaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker17", valueMarker1.equals(valueMarker17) ? valueMarker1.hashCode() == valueMarker17.hashCode() : true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        double double7 = valueMarker1.getValue();
        java.lang.String str8 = valueMarker1.getLabel();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        java.awt.Paint paint20 = valueMarker18.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker18.getLabelAnchor();
        java.awt.Stroke stroke22 = valueMarker18.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 0, paint16, stroke22);
        java.lang.String str24 = valueMarker23.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker23.notifyListeners(markerChangeEvent25);
        java.awt.Stroke stroke27 = valueMarker23.getStroke();
        valueMarker1.setOutlineStroke(stroke27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker15", valueMarker1.equals(valueMarker15) ? valueMarker1.hashCode() == valueMarker15.hashCode() : true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint7 = valueMarker6.getPaint();
        java.lang.String str8 = valueMarker6.getLabel();
        valueMarker6.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str13 = valueMarker12.getLabel();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        valueMarker6.setOutlinePaint(paint14);
        java.awt.Stroke stroke16 = valueMarker6.getStroke();
        valueMarker1.setStroke(stroke16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker12", valueMarker1.equals(valueMarker12) ? valueMarker1.hashCode() == valueMarker12.hashCode() : true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker12.getLabelFont();
        valueMarker12.setValue((double) (short) 0);
        valueMarker12.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker12.removeChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker12.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        java.awt.Font font27 = valueMarker24.getLabelFont();
        valueMarker24.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker31.addChangeListener(markerChangeListener32);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.addChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker31.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker31.getLabelOffset();
        valueMarker24.setLabelOffset(rectangleInsets37);
        valueMarker12.setLabelOffset(rectangleInsets37);
        valueMarker1.setLabelOffset(rectangleInsets37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker12", valueMarker1.equals(valueMarker12) ? valueMarker1.hashCode() == valueMarker12.hashCode() : true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        valueMarker1.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        float float24 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker27.addChangeListener(markerChangeListener28);
        java.awt.Paint paint30 = valueMarker27.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker34.getLabelAnchor();
        java.awt.Paint paint36 = valueMarker34.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker34.getLabelAnchor();
        java.awt.Stroke stroke38 = valueMarker34.getStroke();
        valueMarker32.setOutlineStroke(stroke38);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint30, stroke38);
        valueMarker40.setLabel("hi!");
        float float43 = valueMarker40.getAlpha();
        float float44 = valueMarker40.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker40.addChangeListener(markerChangeListener45);
        java.awt.Paint paint47 = valueMarker40.getOutlinePaint();
        valueMarker1.setLabelPaint(paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker34", valueMarker1.equals(valueMarker34) ? valueMarker1.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str8 = valueMarker7.getLabel();
        java.awt.Paint paint9 = valueMarker7.getLabelPaint();
        valueMarker1.setOutlinePaint(paint9);
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        java.awt.Paint paint15 = valueMarker13.getPaint();
        valueMarker13.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker13.getLabelTextAnchor();
        java.awt.Font font19 = valueMarker13.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker13.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker22.getLabelOffset();
        boolean boolean25 = valueMarker22.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker29.getLabelAnchor();
        java.awt.Stroke stroke33 = valueMarker29.getStroke();
        valueMarker27.setOutlineStroke(stroke33);
        java.awt.Stroke stroke35 = valueMarker27.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType36 = valueMarker27.getLabelOffsetType();
        valueMarker22.setLabelOffsetType(lengthAdjustmentType36);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker22.getLabelAnchor();
        valueMarker13.setLabelAnchor(rectangleAnchor38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker13.removeChangeListener(markerChangeListener40);
        java.lang.String str42 = valueMarker13.getLabel();
        float float43 = valueMarker13.getAlpha();
        java.awt.Font font44 = valueMarker13.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType45 = valueMarker13.getLabelOffsetType();
        boolean boolean46 = valueMarker1.equals((java.lang.Object) lengthAdjustmentType45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker22", valueMarker7.equals(valueMarker22) ? valueMarker7.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        java.lang.String str5 = valueMarker2.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker7.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker7.setOutlineStroke(stroke14);
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker7.getLabelTextAnchor();
        valueMarker7.setLabel("hi!");
        java.awt.Stroke stroke19 = valueMarker7.getOutlineStroke();
        java.awt.Paint paint20 = valueMarker7.getLabelPaint();
        valueMarker2.setOutlinePaint(paint20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker26.getLabelAnchor();
        java.awt.Paint paint28 = valueMarker26.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker26.getLabelAnchor();
        java.awt.Stroke stroke30 = valueMarker26.getStroke();
        valueMarker23.setOutlineStroke(stroke30);
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker23.getLabelTextAnchor();
        java.awt.Paint paint33 = valueMarker23.getPaint();
        java.awt.Font font34 = valueMarker23.getLabelFont();
        java.lang.String str35 = valueMarker23.getLabel();
        double double36 = valueMarker23.getValue();
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker23.getLabelTextAnchor();
        java.awt.Stroke stroke38 = valueMarker23.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint41 = valueMarker40.getPaint();
        java.awt.Paint paint42 = valueMarker40.getPaint();
        valueMarker40.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = valueMarker40.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor48 = valueMarker47.getLabelAnchor();
        valueMarker40.setLabelAnchor(rectangleAnchor48);
        valueMarker40.setValue((double) '#');
        java.awt.Stroke stroke52 = valueMarker40.getOutlineStroke();
        java.awt.Paint paint53 = valueMarker40.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor57 = valueMarker56.getLabelAnchor();
        java.awt.Paint paint58 = valueMarker56.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor59 = valueMarker56.getLabelAnchor();
        java.awt.Stroke stroke60 = valueMarker56.getStroke();
        java.awt.Paint paint61 = valueMarker56.getOutlinePaint();
        java.awt.Paint paint62 = valueMarker56.getLabelPaint();
        java.lang.String str63 = valueMarker56.getLabel();
        java.awt.Paint paint64 = valueMarker56.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker66 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        float float67 = valueMarker66.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker69 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint70 = valueMarker69.getPaint();
        java.awt.Paint paint71 = valueMarker69.getPaint();
        valueMarker69.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets74 = valueMarker69.getLabelOffset();
        java.awt.Font font75 = valueMarker69.getLabelFont();
        java.lang.String str76 = valueMarker69.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker78 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener79 = null;
        valueMarker78.addChangeListener(markerChangeListener79);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener81 = null;
        valueMarker78.addChangeListener(markerChangeListener81);
        valueMarker78.setValue((double) 1L);
        java.awt.Font font85 = valueMarker78.getLabelFont();
        java.awt.Stroke stroke86 = valueMarker78.getStroke();
        java.awt.Stroke stroke87 = valueMarker78.getStroke();
        valueMarker69.setOutlineStroke(stroke87);
        valueMarker66.setOutlineStroke(stroke87);
        org.jfree.chart.plot.ValueMarker valueMarker90 = new org.jfree.chart.plot.ValueMarker((double) '#', paint64, stroke87);
        org.jfree.chart.plot.ValueMarker valueMarker92 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint20, stroke38, paint53, stroke87, 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker26", valueMarker10.equals(valueMarker26) ? valueMarker10.hashCode() == valueMarker26.hashCode() : true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        java.awt.Font font16 = valueMarker15.getLabelFont();
        float float17 = valueMarker15.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.awt.Paint paint21 = valueMarker19.getPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker19.getLabelTextAnchor();
        java.awt.Font font25 = valueMarker19.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker19.removeChangeListener(markerChangeListener26);
        float float28 = valueMarker19.getAlpha();
        valueMarker19.setLabel("hi!");
        java.awt.Stroke stroke31 = valueMarker19.getStroke();
        java.awt.Paint paint32 = valueMarker19.getLabelPaint();
        java.awt.Font font33 = valueMarker19.getLabelFont();
        valueMarker15.setLabelFont(font33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker36.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker39.getLabelAnchor();
        java.awt.Paint paint41 = valueMarker39.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor42 = valueMarker39.getLabelAnchor();
        java.awt.Stroke stroke43 = valueMarker39.getStroke();
        valueMarker36.setOutlineStroke(stroke43);
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint47 = valueMarker46.getPaint();
        valueMarker36.setLabelPaint(paint47);
        valueMarker36.setValue((double) (-1));
        java.awt.Stroke stroke51 = valueMarker36.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        valueMarker36.notifyListeners(markerChangeEvent52);
        java.awt.Paint paint54 = valueMarker36.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = valueMarker36.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = valueMarker36.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker46", valueMarker2.equals(valueMarker46) ? valueMarker2.hashCode() == valueMarker46.hashCode() : true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        valueMarker1.setPaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.awt.Paint paint16 = valueMarker13.getLabelPaint();
        java.awt.Stroke stroke17 = valueMarker13.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker13.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker20.getLabelOffset();
        valueMarker13.setLabelOffset(rectangleInsets25);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker13.getLabelOffsetType();
        java.awt.Paint paint28 = valueMarker13.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker13.notifyListeners(markerChangeEvent29);
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker13.getLabelTextAnchor();
        java.awt.Font font32 = valueMarker13.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker13.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType33);
        java.awt.Font font35 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker38.getLabelAnchor();
        java.awt.Paint paint40 = valueMarker38.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker38.getLabelAnchor();
        java.awt.Stroke stroke42 = valueMarker38.getStroke();
        java.awt.Paint paint43 = valueMarker38.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint46 = valueMarker45.getPaint();
        java.awt.Paint paint47 = valueMarker45.getPaint();
        valueMarker45.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = valueMarker51.getLabelOffset();
        boolean boolean53 = valueMarker45.equals((java.lang.Object) rectangleInsets52);
        valueMarker38.setLabelOffset(rectangleInsets52);
        java.awt.Paint paint55 = valueMarker38.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = valueMarker38.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor57 = valueMarker38.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener58 = null;
        valueMarker38.removeChangeListener(markerChangeListener58);
        java.awt.Stroke stroke60 = valueMarker38.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker8 and valueMarker38", valueMarker8.equals(valueMarker38) ? valueMarker8.hashCode() == valueMarker38.hashCode() : true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.lang.String str16 = valueMarker13.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker13.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker13.getLabelOffsetType();
        java.awt.Font font19 = valueMarker13.getLabelFont();
        valueMarker1.setLabelFont(font19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker23.addChangeListener(markerChangeListener24);
        java.lang.String str26 = valueMarker23.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker23.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker23.getLabelOffsetType();
        java.awt.Font font29 = valueMarker23.getLabelFont();
        java.awt.Paint paint30 = valueMarker23.getPaint();
        valueMarker1.setPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker13 and valueMarker23", valueMarker13.equals(valueMarker23) ? valueMarker13.hashCode() == valueMarker23.hashCode() : true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker14.addChangeListener(markerChangeListener15);
        java.lang.String str17 = valueMarker14.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker14.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker14.getLabelOffsetType();
        java.awt.Stroke stroke20 = valueMarker14.getOutlineStroke();
        valueMarker12.setOutlineStroke(stroke20);
        boolean boolean22 = valueMarker1.equals((java.lang.Object) valueMarker12);
        java.lang.String str23 = valueMarker12.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint26 = valueMarker25.getLabelPaint();
        valueMarker25.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        valueMarker30.setOutlineStroke(stroke36);
        java.awt.Stroke stroke38 = valueMarker30.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker30.getLabelOffsetType();
        valueMarker25.setLabelOffsetType(lengthAdjustmentType39);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker25.notifyListeners(markerChangeEvent41);
        valueMarker25.setAlpha((float) 0L);
        java.awt.Stroke stroke45 = valueMarker25.getOutlineStroke();
        java.awt.Font font46 = valueMarker25.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener47 = null;
        valueMarker25.removeChangeListener(markerChangeListener47);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType49 = valueMarker25.getLabelOffsetType();
        valueMarker12.setLabelOffsetType(lengthAdjustmentType49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker12 and valueMarker30", valueMarker12.equals(valueMarker30) ? valueMarker12.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        double double5 = valueMarker1.getValue();
        java.lang.Object obj6 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker15.setOutlineStroke(stroke21);
        java.awt.Stroke stroke23 = valueMarker15.getOutlineStroke();
        valueMarker8.setStroke(stroke23);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker8.notifyListeners(markerChangeEvent25);
        java.awt.Stroke stroke27 = valueMarker8.getOutlineStroke();
        java.awt.Paint paint28 = valueMarker8.getPaint();
        valueMarker1.setOutlinePaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj6", valueMarker1.equals(obj6) ? valueMarker1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker10.getLabelFont();
        double double16 = valueMarker10.getValue();
        java.lang.String str17 = valueMarker10.getLabel();
        java.awt.Stroke stroke18 = valueMarker10.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker10.getLabelOffset();
        java.awt.Paint paint20 = valueMarker10.getLabelPaint();
        valueMarker1.setPaint(paint20);
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font23 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker26.addChangeListener(markerChangeListener27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint31 = valueMarker30.getLabelPaint();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        valueMarker26.setOutlinePaint(paint32);
        java.awt.Paint paint34 = valueMarker26.getOutlinePaint();
        java.awt.Stroke stroke35 = valueMarker26.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker30", valueMarker10.equals(valueMarker30) ? valueMarker10.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker6.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker6.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker6.getLabelOffset();
        java.lang.Object obj13 = null;
        boolean boolean14 = valueMarker6.equals(obj13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker6.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker20.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker20.getStroke();
        java.awt.Paint paint25 = valueMarker20.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker33.getLabelOffset();
        boolean boolean35 = valueMarker27.equals((java.lang.Object) rectangleInsets34);
        valueMarker20.setLabelOffset(rectangleInsets34);
        java.awt.Paint paint37 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = valueMarker20.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor39 = valueMarker20.getLabelTextAnchor();
        valueMarker18.setLabelTextAnchor(textAnchor39);
        valueMarker1.setLabelTextAnchor(textAnchor39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker6 and valueMarker33", valueMarker6.equals(valueMarker33) ? valueMarker6.hashCode() == valueMarker33.hashCode() : true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        valueMarker1.setAlpha(0.0f);
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker17.addChangeListener(markerChangeListener18);
        java.lang.String str20 = valueMarker17.getLabel();
        java.awt.Font font21 = valueMarker17.getLabelFont();
        valueMarker1.setLabelFont(font21);
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker28.getLabelOffset();
        boolean boolean31 = valueMarker28.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        java.awt.Paint paint37 = valueMarker35.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker35.getLabelAnchor();
        java.awt.Stroke stroke39 = valueMarker35.getStroke();
        valueMarker33.setOutlineStroke(stroke39);
        java.awt.Stroke stroke41 = valueMarker33.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType42 = valueMarker33.getLabelOffsetType();
        valueMarker28.setLabelOffsetType(lengthAdjustmentType42);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint45 = valueMarker28.getLabelPaint();
        valueMarker1.setLabelPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker35", valueMarker4.equals(valueMarker35) ? valueMarker4.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker3.getLabelAnchor();
        java.awt.Paint paint5 = valueMarker3.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker3.getLabelAnchor();
        java.awt.Stroke stroke7 = valueMarker3.getStroke();
        java.awt.Paint paint8 = valueMarker3.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker3.removeChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        java.awt.Font font17 = valueMarker12.getLabelFont();
        double double18 = valueMarker12.getValue();
        java.lang.String str19 = valueMarker12.getLabel();
        java.awt.Stroke stroke20 = valueMarker12.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker12.getLabelOffset();
        java.awt.Paint paint22 = valueMarker12.getLabelPaint();
        valueMarker3.setPaint(paint22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint26 = valueMarker25.getPaint();
        java.awt.Paint paint27 = valueMarker25.getPaint();
        valueMarker25.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint32 = valueMarker31.getLabelPaint();
        valueMarker25.setPaint(paint32);
        valueMarker3.setOutlinePaint(paint32);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setValue((double) (short) 0);
        java.awt.Paint paint39 = null;
        valueMarker36.setOutlinePaint(paint39);
        java.awt.Paint paint41 = valueMarker36.getOutlinePaint();
        java.lang.String str42 = valueMarker36.getLabel();
        java.awt.Stroke stroke43 = valueMarker36.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = valueMarker36.getLabelOffsetType();
        java.awt.Stroke stroke45 = valueMarker36.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 100, paint32, stroke45);
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener49 = null;
        valueMarker48.addChangeListener(markerChangeListener49);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint53 = valueMarker52.getLabelPaint();
        java.awt.Paint paint54 = valueMarker52.getLabelPaint();
        valueMarker48.setOutlinePaint(paint54);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener56 = null;
        valueMarker48.addChangeListener(markerChangeListener56);
        java.awt.Paint paint58 = valueMarker48.getOutlinePaint();
        java.awt.Paint paint59 = valueMarker48.getPaint();
        java.awt.Font font60 = valueMarker48.getLabelFont();
        java.awt.Stroke stroke61 = valueMarker48.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((-1.0d), paint32, stroke61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker12 and valueMarker52", valueMarker12.equals(valueMarker52) ? valueMarker12.hashCode() == valueMarker52.hashCode() : true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker17.removeChangeListener(markerChangeListener18);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker17.getLabelOffsetType();
        java.awt.Paint paint21 = valueMarker17.getOutlinePaint();
        valueMarker15.setLabelPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker9 and valueMarker17", valueMarker9.equals(valueMarker17) ? valueMarker9.hashCode() == valueMarker17.hashCode() : true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        valueMarker1.setValue(1.0d);
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("hi!");
        java.awt.Font font24 = valueMarker1.getLabelFont();
        java.awt.Paint paint25 = valueMarker1.getPaint();
        java.awt.Stroke stroke26 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint30 = valueMarker29.getPaint();
        java.awt.Paint paint31 = valueMarker29.getPaint();
        valueMarker29.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker29.getLabelTextAnchor();
        java.awt.Font font35 = valueMarker29.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker29.removeChangeListener(markerChangeListener36);
        java.awt.Font font38 = valueMarker29.getLabelFont();
        java.awt.Stroke stroke39 = valueMarker29.getOutlineStroke();
        java.awt.Paint paint40 = valueMarker29.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker44.addChangeListener(markerChangeListener45);
        java.lang.String str47 = valueMarker44.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = valueMarker44.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType49 = valueMarker44.getLabelOffsetType();
        java.awt.Stroke stroke50 = valueMarker44.getOutlineStroke();
        valueMarker42.setOutlineStroke(stroke50);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 100, paint40, stroke50);
        java.awt.Font font53 = valueMarker52.getLabelFont();
        valueMarker1.setLabelFont(font53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker8 and valueMarker29", valueMarker8.equals(valueMarker29) ? valueMarker8.hashCode() == valueMarker29.hashCode() : true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        java.awt.Font font16 = valueMarker13.getLabelFont();
        valueMarker13.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker20.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker20.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker20.getLabelOffset();
        valueMarker13.setLabelOffset(rectangleInsets26);
        valueMarker1.setLabelOffset(rectangleInsets26);
        double double29 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint32 = valueMarker31.getPaint();
        java.lang.String str33 = valueMarker31.getLabel();
        valueMarker31.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint38 = valueMarker37.getLabelPaint();
        valueMarker31.setPaint(paint38);
        java.awt.Font font40 = valueMarker31.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = valueMarker31.getLabelOffset();
        boolean boolean42 = valueMarker1.equals((java.lang.Object) valueMarker31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker20 and valueMarker37", valueMarker20.equals(valueMarker37) ? valueMarker20.hashCode() == valueMarker37.hashCode() : true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setPaint(paint7);
        double double9 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker12.getLabelAnchor();
        java.awt.Stroke stroke16 = valueMarker12.getStroke();
        java.awt.Paint paint17 = valueMarker12.getLabelPaint();
        double double18 = valueMarker12.getValue();
        java.awt.Stroke stroke19 = null;
        valueMarker12.setOutlineStroke(stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.lang.String str25 = valueMarker22.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker22.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        java.awt.Stroke stroke28 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker22.getLabelOffsetType();
        valueMarker12.setLabelOffsetType(lengthAdjustmentType29);
        java.lang.Object obj31 = valueMarker12.clone();
        valueMarker12.setAlpha((float) 1);
        java.awt.Font font34 = valueMarker12.getLabelFont();
        valueMarker1.setLabelFont(font34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker37.addChangeListener(markerChangeListener38);
        java.awt.Paint paint40 = valueMarker37.getLabelPaint();
        valueMarker1.setLabelPaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker22 and valueMarker37", valueMarker22.equals(valueMarker37) ? valueMarker22.hashCode() == valueMarker37.hashCode() : true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        float float3 = valueMarker1.getAlpha();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        java.awt.Paint paint9 = valueMarker7.getPaint();
        valueMarker7.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        valueMarker15.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker15.getLabelTextAnchor();
        java.awt.Font font21 = valueMarker15.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker15.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        boolean boolean27 = valueMarker24.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker31.getLabelAnchor();
        java.awt.Stroke stroke35 = valueMarker31.getStroke();
        valueMarker29.setOutlineStroke(stroke35);
        java.awt.Stroke stroke37 = valueMarker29.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker29.getLabelOffsetType();
        valueMarker24.setLabelOffsetType(lengthAdjustmentType38);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker24.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor40);
        boolean boolean42 = valueMarker1.equals((java.lang.Object) rectangleAnchor40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker24", valueMarker1.equals(valueMarker24) ? valueMarker1.hashCode() == valueMarker24.hashCode() : true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha((float) (short) 1);
        valueMarker1.setValue((double) '#');
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker11.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint19 = valueMarker18.getPaint();
        java.awt.Paint paint20 = valueMarker18.getPaint();
        valueMarker18.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker18.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker18.getLabelAnchor();
        valueMarker14.setLabelAnchor(rectangleAnchor24);
        valueMarker11.setLabelAnchor(rectangleAnchor24);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setValue((double) (short) 0);
        java.awt.Paint paint31 = null;
        valueMarker28.setOutlinePaint(paint31);
        java.awt.Paint paint33 = valueMarker28.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker28.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker28.getLabelTextAnchor();
        valueMarker11.setLabelTextAnchor(textAnchor35);
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker11.getLabelTextAnchor();
        boolean boolean38 = valueMarker1.equals((java.lang.Object) valueMarker11);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker41.addChangeListener(markerChangeListener42);
        java.awt.Font font44 = valueMarker41.getLabelFont();
        java.awt.Paint paint45 = valueMarker41.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = valueMarker49.getLabelAnchor();
        java.awt.Paint paint51 = valueMarker49.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor52 = valueMarker49.getLabelAnchor();
        java.awt.Stroke stroke53 = valueMarker49.getStroke();
        valueMarker47.setOutlineStroke(stroke53);
        java.awt.Stroke stroke55 = valueMarker47.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 100, paint45, stroke55);
        valueMarker11.setOutlinePaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker14 and valueMarker41", valueMarker14.equals(valueMarker41) ? valueMarker14.hashCode() == valueMarker41.hashCode() : true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker(0.0d);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker6.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker6.getLabelFont();
        double double12 = valueMarker6.getValue();
        java.lang.String str13 = valueMarker6.getLabel();
        java.awt.Stroke stroke14 = valueMarker6.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker6.getLabelOffset();
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker6.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker6.notifyListeners(markerChangeEvent19);
        java.awt.Stroke stroke21 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        java.awt.Paint paint25 = valueMarker23.getLabelPaint();
        java.awt.Stroke stroke26 = valueMarker23.getOutlineStroke();
        java.awt.Stroke stroke27 = valueMarker23.getStroke();
        valueMarker6.setOutlineStroke(stroke27);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10, paint4, stroke27);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker29.notifyListeners(markerChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker29.getLabelOffset();
        java.awt.Stroke stroke33 = valueMarker29.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint36 = valueMarker35.getLabelPaint();
        java.awt.Paint paint37 = valueMarker35.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker39.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker42.getLabelAnchor();
        java.awt.Paint paint44 = valueMarker42.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = valueMarker42.getLabelAnchor();
        java.awt.Stroke stroke46 = valueMarker42.getStroke();
        valueMarker39.setOutlineStroke(stroke46);
        valueMarker35.setStroke(stroke46);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener49 = null;
        valueMarker35.addChangeListener(markerChangeListener49);
        java.awt.Paint paint51 = valueMarker35.getLabelPaint();
        valueMarker29.setPaint(paint51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker23 and valueMarker42", valueMarker23.equals(valueMarker42) ? valueMarker23.hashCode() == valueMarker42.hashCode() : true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        double double5 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        java.awt.Paint paint9 = valueMarker7.getPaint();
        valueMarker7.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker7.getLabelTextAnchor();
        java.awt.Font font13 = valueMarker7.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker7.removeChangeListener(markerChangeListener14);
        float float16 = valueMarker7.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker7.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        boolean boolean22 = valueMarker1.equals((java.lang.Object) paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker20", valueMarker1.equals(valueMarker20) ? valueMarker1.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        java.awt.Paint paint25 = valueMarker23.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker23.getLabelAnchor();
        java.awt.Stroke stroke27 = valueMarker23.getStroke();
        java.awt.Paint paint28 = valueMarker23.getOutlinePaint();
        java.awt.Paint paint29 = valueMarker23.getLabelPaint();
        valueMarker19.setOutlinePaint(paint29);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint33 = valueMarker32.getLabelPaint();
        valueMarker19.setOutlinePaint(paint33);
        java.awt.Paint paint35 = valueMarker19.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        valueMarker19.notifyListeners(markerChangeEvent36);
        java.awt.Stroke stroke38 = valueMarker19.getStroke();
        valueMarker1.setOutlineStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker23", valueMarker5.equals(valueMarker23) ? valueMarker5.hashCode() == valueMarker23.hashCode() : true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker15.setOutlineStroke(stroke21);
        java.awt.Stroke stroke23 = valueMarker15.getOutlineStroke();
        valueMarker8.setStroke(stroke23);
        valueMarker1.setStroke(stroke23);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker1.setOutlinePaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker27", valueMarker1.equals(valueMarker27) ? valueMarker1.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker10.getLabelPaint();
        boolean boolean15 = valueMarker10.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker10.getLabelOffsetType();
        boolean boolean17 = valueMarker1.equals((java.lang.Object) valueMarker10);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker19.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker19.removeChangeListener(markerChangeListener21);
        java.lang.String str23 = valueMarker19.getLabel();
        java.awt.Paint paint24 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker19.getLabelOffset();
        valueMarker10.setLabelOffset(rectangleInsets25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker28.addChangeListener(markerChangeListener29);
        java.lang.String str31 = valueMarker28.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker28.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker34.getLabelAnchor();
        java.awt.Paint paint36 = valueMarker34.getLabelPaint();
        valueMarker28.setOutlinePaint(paint36);
        java.awt.Font font38 = valueMarker28.getLabelFont();
        valueMarker10.setLabelFont(font38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker19 and valueMarker34", valueMarker19.equals(valueMarker34) ? valueMarker19.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.lang.String str7 = valueMarker5.getLabel();
        valueMarker5.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getLabelPaint();
        valueMarker5.setPaint(paint12);
        valueMarker2.setOutlinePaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setValue((double) (short) 0);
        java.awt.Stroke stroke19 = valueMarker16.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint12, stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.awt.Paint paint24 = valueMarker22.getPaint();
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker22.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker22.getLabelAnchor();
        valueMarker22.setValue((double) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker22.getLabelOffset();
        valueMarker20.setLabelOffset(rectangleInsets31);
        java.lang.String str33 = valueMarker20.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint37 = valueMarker36.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint40 = valueMarker39.getPaint();
        java.lang.String str41 = valueMarker39.getLabel();
        valueMarker39.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint46 = valueMarker45.getLabelPaint();
        valueMarker39.setPaint(paint46);
        valueMarker36.setOutlinePaint(paint46);
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker50.setValue((double) (short) 0);
        java.awt.Stroke stroke53 = valueMarker50.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint46, stroke53);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        valueMarker54.notifyListeners(markerChangeEvent55);
        java.lang.String str57 = valueMarker54.getLabel();
        java.awt.Paint paint58 = valueMarker54.getOutlinePaint();
        valueMarker20.setOutlinePaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker36", valueMarker2.equals(valueMarker36) ? valueMarker2.hashCode() == valueMarker36.hashCode() : true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker6.addChangeListener(markerChangeListener7);
        java.lang.String str9 = valueMarker6.getLabel();
        java.awt.Paint paint10 = valueMarker6.getPaint();
        valueMarker1.setLabelPaint(paint10);
        java.lang.Object obj12 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker14.setOutlineStroke(stroke21);
        java.awt.Font font23 = valueMarker14.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker14.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj12", valueMarker1.equals(obj12) ? valueMarker1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint5 = valueMarker4.getPaint();
        java.lang.String str6 = valueMarker4.getLabel();
        valueMarker4.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint11 = valueMarker10.getLabelPaint();
        valueMarker4.setPaint(paint11);
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker1.getLabelOffset();
        float float16 = valueMarker1.getAlpha();
        java.awt.Stroke stroke17 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str20 = valueMarker19.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker22.getLabelFont();
        valueMarker22.setValue((double) (short) 0);
        valueMarker22.setValue((double) (byte) 10);
        java.awt.Stroke stroke30 = valueMarker22.getStroke();
        valueMarker19.setStroke(stroke30);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint34 = valueMarker33.getPaint();
        java.awt.Paint paint35 = valueMarker33.getPaint();
        valueMarker33.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = valueMarker33.getLabelOffset();
        java.awt.Font font39 = valueMarker33.getLabelFont();
        java.lang.String str40 = valueMarker33.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker42.addChangeListener(markerChangeListener43);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker42.addChangeListener(markerChangeListener45);
        valueMarker42.setValue((double) 1L);
        java.awt.Font font49 = valueMarker42.getLabelFont();
        java.awt.Stroke stroke50 = valueMarker42.getStroke();
        java.awt.Stroke stroke51 = valueMarker42.getStroke();
        valueMarker33.setOutlineStroke(stroke51);
        valueMarker19.setStroke(stroke51);
        valueMarker1.setStroke(stroke51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker19", valueMarker10.equals(valueMarker19) ? valueMarker10.hashCode() == valueMarker19.hashCode() : true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        double double7 = valueMarker1.getValue();
        java.lang.String str8 = valueMarker1.getLabel();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        java.awt.Font font17 = valueMarker14.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker14.removeChangeListener(markerChangeListener18);
        valueMarker14.setLabel("hi!");
        java.awt.Paint paint22 = valueMarker14.getOutlinePaint();
        valueMarker1.setPaint(paint22);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint27 = valueMarker26.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        valueMarker29.setOutlineStroke(stroke36);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 0, paint27, stroke36);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker38.removeChangeListener(markerChangeListener40);
        java.awt.Paint paint42 = valueMarker38.getPaint();
        float float43 = valueMarker38.getAlpha();
        java.awt.Stroke stroke44 = valueMarker38.getStroke();
        valueMarker1.setStroke(stroke44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker26", valueMarker1.equals(valueMarker26) ? valueMarker1.hashCode() == valueMarker26.hashCode() : true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker3.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker3.getLabelFont();
        valueMarker3.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker10.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker10.getLabelOffset();
        valueMarker3.setLabelOffset(rectangleInsets16);
        double double18 = valueMarker3.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        java.awt.Font font23 = valueMarker20.getLabelFont();
        valueMarker20.setValue((double) (short) 0);
        valueMarker20.setValue((double) (byte) 10);
        java.awt.Paint paint28 = valueMarker20.getOutlinePaint();
        valueMarker3.setLabelPaint(paint28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker31.getLabelAnchor();
        java.awt.Stroke stroke35 = valueMarker31.getStroke();
        java.awt.Paint paint36 = valueMarker31.getLabelPaint();
        double double37 = valueMarker31.getValue();
        valueMarker31.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint42 = valueMarker41.getPaint();
        java.awt.Paint paint43 = valueMarker41.getPaint();
        valueMarker41.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker41.removeChangeListener(markerChangeListener46);
        boolean boolean48 = valueMarker31.equals((java.lang.Object) valueMarker41);
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint51 = valueMarker50.getPaint();
        java.lang.String str52 = valueMarker50.getLabel();
        valueMarker50.setValue((double) 100);
        valueMarker50.setValue((double) 1.0f);
        valueMarker50.setLabel("hi!");
        java.awt.Stroke stroke59 = valueMarker50.getOutlineStroke();
        valueMarker31.setStroke(stroke59);
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint28, stroke59);
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint65 = valueMarker64.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint68 = valueMarker67.getPaint();
        java.lang.String str69 = valueMarker67.getLabel();
        valueMarker67.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker73 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint74 = valueMarker73.getLabelPaint();
        valueMarker67.setPaint(paint74);
        valueMarker64.setOutlinePaint(paint74);
        org.jfree.chart.plot.ValueMarker valueMarker78 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker78.setValue((double) (short) 0);
        java.awt.Stroke stroke81 = valueMarker78.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker82 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint74, stroke81);
        org.jfree.chart.plot.ValueMarker valueMarker83 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint28, stroke81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker73", valueMarker10.equals(valueMarker73) ? valueMarker10.hashCode() == valueMarker73.hashCode() : true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint11 = valueMarker10.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint14 = valueMarker13.getPaint();
        java.lang.String str15 = valueMarker13.getLabel();
        valueMarker13.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getLabelPaint();
        valueMarker13.setPaint(paint20);
        valueMarker10.setOutlinePaint(paint20);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker10.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker10.getLabelPaint();
        java.awt.Paint paint25 = valueMarker10.getLabelPaint();
        valueMarker1.setOutlinePaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker10", valueMarker1.equals(valueMarker10) ? valueMarker1.hashCode() == valueMarker10.hashCode() : true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker7.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker7.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker14.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker12.setOutlineStroke(stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint10, stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.awt.Paint paint24 = valueMarker22.getPaint();
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker22.getLabelTextAnchor();
        java.awt.Font font28 = valueMarker22.getLabelFont();
        valueMarker20.setLabelFont(font28);
        valueMarker1.setLabelFont(font28);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker1.getLabelOffset();
        valueMarker1.setValue((double) (short) 1);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker1.removeChangeListener(markerChangeListener34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker37.addChangeListener(markerChangeListener38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker37.addChangeListener(markerChangeListener40);
        java.awt.Paint paint42 = valueMarker37.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint45 = valueMarker44.getPaint();
        java.awt.Paint paint46 = valueMarker44.getPaint();
        valueMarker44.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker44.getLabelTextAnchor();
        java.awt.Font font50 = valueMarker44.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener51 = null;
        valueMarker44.removeChangeListener(markerChangeListener51);
        float float53 = valueMarker44.getAlpha();
        valueMarker44.setLabel("hi!");
        java.awt.Stroke stroke56 = valueMarker44.getStroke();
        java.awt.Paint paint57 = valueMarker44.getLabelPaint();
        valueMarker37.setLabelPaint(paint57);
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint61 = valueMarker60.getPaint();
        java.awt.Paint paint62 = valueMarker60.getPaint();
        valueMarker60.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor65 = valueMarker60.getLabelTextAnchor();
        java.awt.Font font66 = valueMarker60.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener67 = null;
        valueMarker60.removeChangeListener(markerChangeListener67);
        valueMarker60.setAlpha((float) (short) 0);
        java.awt.Paint paint71 = valueMarker60.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor72 = valueMarker60.getLabelTextAnchor();
        boolean boolean73 = valueMarker37.equals((java.lang.Object) textAnchor72);
        org.jfree.chart.util.RectangleInsets rectangleInsets74 = valueMarker37.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker37", valueMarker7.equals(valueMarker37) ? valueMarker7.hashCode() == valueMarker37.hashCode() : true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.awt.Paint paint4 = valueMarker2.getPaint();
        valueMarker2.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker2.getLabelOffset();
        java.awt.Font font8 = valueMarker2.getLabelFont();
        java.lang.String str9 = valueMarker2.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker11.addChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getLabelPaint();
        java.awt.Paint paint17 = valueMarker15.getLabelPaint();
        valueMarker11.setOutlinePaint(paint17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        valueMarker11.setLabelAnchor(rectangleAnchor21);
        valueMarker2.setLabelAnchor(rectangleAnchor21);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker25.addChangeListener(markerChangeListener26);
        java.awt.Font font28 = valueMarker25.getLabelFont();
        valueMarker25.setValue((double) (short) 0);
        java.awt.Paint paint31 = valueMarker25.getPaint();
        valueMarker2.setOutlinePaint(paint31);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker35.addChangeListener(markerChangeListener36);
        java.awt.Paint paint38 = valueMarker35.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker42.getLabelAnchor();
        java.awt.Paint paint44 = valueMarker42.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = valueMarker42.getLabelAnchor();
        java.awt.Stroke stroke46 = valueMarker42.getStroke();
        valueMarker40.setOutlineStroke(stroke46);
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint38, stroke46);
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint51 = valueMarker50.getPaint();
        java.awt.Paint paint52 = valueMarker50.getPaint();
        valueMarker50.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor55 = valueMarker50.getLabelTextAnchor();
        java.awt.Font font56 = valueMarker50.getLabelFont();
        valueMarker48.setLabelFont(font56);
        java.awt.Paint paint58 = valueMarker48.getPaint();
        java.awt.Stroke stroke59 = valueMarker48.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) 0L, paint31, stroke59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker50", valueMarker2.equals(valueMarker50) ? valueMarker2.hashCode() == valueMarker50.hashCode() : true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        boolean boolean16 = valueMarker8.equals((java.lang.Object) rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setValue((double) (short) 0);
        java.awt.Paint paint24 = valueMarker21.getPaint();
        valueMarker1.setLabelPaint(paint24);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke27 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint33 = valueMarker32.getPaint();
        java.awt.Paint paint34 = valueMarker32.getPaint();
        valueMarker32.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker32.getLabelTextAnchor();
        java.awt.Font font38 = valueMarker32.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker32.removeChangeListener(markerChangeListener39);
        float float41 = valueMarker32.getAlpha();
        valueMarker32.setLabel("hi!");
        java.awt.Stroke stroke44 = valueMarker32.getStroke();
        java.awt.Paint paint45 = valueMarker32.getLabelPaint();
        valueMarker30.setOutlinePaint(paint45);
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener49 = null;
        valueMarker48.addChangeListener(markerChangeListener49);
        java.awt.Font font51 = valueMarker48.getLabelFont();
        valueMarker48.setValue((double) (short) 0);
        valueMarker48.setValue((double) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = valueMarker48.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker58.addChangeListener(markerChangeListener59);
        java.awt.Paint paint61 = valueMarker58.getLabelPaint();
        boolean boolean63 = valueMarker58.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType64 = valueMarker58.getLabelOffsetType();
        java.awt.Stroke stroke65 = valueMarker58.getOutlineStroke();
        valueMarker48.setOutlineStroke(stroke65);
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker(0.0d, paint45, stroke65);
        valueMarker1.setLabelPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker48", valueMarker1.equals(valueMarker48) ? valueMarker1.hashCode() == valueMarker48.hashCode() : true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        java.awt.Font font13 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        valueMarker16.setOutlinePaint(paint22);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker16.addChangeListener(markerChangeListener24);
        java.awt.Paint paint26 = valueMarker16.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker16.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker16.getLabelOffsetType();
        java.awt.Stroke stroke29 = valueMarker16.getOutlineStroke();
        valueMarker1.setStroke(stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker16", valueMarker1.equals(valueMarker16) ? valueMarker1.hashCode() == valueMarker16.hashCode() : true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.lang.String str7 = valueMarker5.getLabel();
        valueMarker5.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getLabelPaint();
        valueMarker5.setPaint(paint12);
        valueMarker2.setOutlinePaint(paint12);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker2.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker2.getLabelPaint();
        java.awt.Paint paint17 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker19.getLabelAnchor();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        java.awt.Paint paint24 = valueMarker19.getLabelPaint();
        double double25 = valueMarker19.getValue();
        java.awt.Stroke stroke26 = null;
        valueMarker19.setOutlineStroke(stroke26);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker19.addChangeListener(markerChangeListener28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker31.addChangeListener(markerChangeListener32);
        java.lang.String str34 = valueMarker31.getLabel();
        java.awt.Font font35 = valueMarker31.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType36 = valueMarker31.getLabelOffsetType();
        java.awt.Stroke stroke37 = valueMarker31.getOutlineStroke();
        valueMarker19.setOutlineStroke(stroke37);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker(0.0d, paint17, stroke37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker31", valueMarker11.equals(valueMarker31) ? valueMarker11.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getPaint();
        java.awt.Paint paint19 = valueMarker17.getPaint();
        valueMarker17.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker17.getLabelTextAnchor();
        java.awt.Font font23 = valueMarker17.getLabelFont();
        valueMarker15.setLabelFont(font23);
        java.awt.Paint paint25 = valueMarker15.getPaint();
        java.awt.Stroke stroke26 = valueMarker15.getStroke();
        java.awt.Font font27 = valueMarker15.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker15.getLabelTextAnchor();
        java.awt.Paint paint29 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker31.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker34.getLabelAnchor();
        java.awt.Paint paint36 = valueMarker34.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker34.getLabelAnchor();
        java.awt.Stroke stroke38 = valueMarker34.getStroke();
        valueMarker31.setOutlineStroke(stroke38);
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker31.getLabelTextAnchor();
        valueMarker31.setLabel("hi!");
        java.awt.Stroke stroke43 = valueMarker31.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker(100.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker45.getLabelOffset();
        valueMarker31.setLabelOffset(rectangleInsets46);
        java.awt.Stroke stroke48 = valueMarker31.getOutlineStroke();
        boolean boolean49 = valueMarker15.equals((java.lang.Object) valueMarker31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker45", valueMarker2.equals(valueMarker45) ? valueMarker2.hashCode() == valueMarker45.hashCode() : true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker7.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker7.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker14.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker12.setOutlineStroke(stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint10, stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.awt.Paint paint24 = valueMarker22.getPaint();
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker22.getLabelTextAnchor();
        java.awt.Font font28 = valueMarker22.getLabelFont();
        valueMarker20.setLabelFont(font28);
        valueMarker1.setLabelFont(font28);
        float float31 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        java.awt.Paint paint35 = valueMarker33.getLabelPaint();
        java.lang.Object obj36 = valueMarker33.clone();
        boolean boolean37 = valueMarker1.equals((java.lang.Object) valueMarker33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker14 and valueMarker33", valueMarker14.equals(valueMarker33) ? valueMarker14.hashCode() == valueMarker33.hashCode() : true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke14 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        java.awt.Paint paint18 = valueMarker16.getPaint();
        valueMarker16.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker16.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        valueMarker16.setLabelAnchor(rectangleAnchor24);
        valueMarker16.setValue((double) '#');
        java.awt.Stroke stroke28 = valueMarker16.getOutlineStroke();
        java.awt.Paint paint29 = valueMarker16.getPaint();
        java.awt.Paint paint30 = valueMarker16.getPaint();
        valueMarker1.setOutlinePaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker5", valueMarker1.equals(valueMarker5) ? valueMarker1.hashCode() == valueMarker5.hashCode() : true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        float float3 = valueMarker1.getAlpha();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getPaint();
        java.lang.Object obj6 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker15.setOutlineStroke(stroke21);
        java.awt.Stroke stroke23 = valueMarker15.getOutlineStroke();
        valueMarker8.setStroke(stroke23);
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker8.getLabelTextAnchor();
        java.awt.Stroke stroke26 = valueMarker8.getStroke();
        java.awt.Font font27 = valueMarker8.getLabelFont();
        valueMarker1.setLabelFont(font27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj6", valueMarker1.equals(obj6) ? valueMarker1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        java.lang.String str5 = valueMarker1.getLabel();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker15.getLabelOffset();
        float float17 = valueMarker15.getAlpha();
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        java.awt.Font font20 = valueMarker15.getLabelFont();
        valueMarker10.setLabelFont(font20);
        valueMarker10.setLabel("hi!");
        boolean boolean24 = valueMarker1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker15", valueMarker1.equals(valueMarker15) ? valueMarker1.hashCode() == valueMarker15.hashCode() : true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        java.awt.Paint paint7 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setValue((double) (short) 0);
        java.awt.Paint paint12 = null;
        valueMarker9.setOutlinePaint(paint12);
        java.awt.Paint paint14 = valueMarker9.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker9.removeChangeListener(markerChangeListener15);
        java.lang.String str17 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.lang.String str21 = valueMarker19.getLabel();
        valueMarker19.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint26 = valueMarker25.getLabelPaint();
        valueMarker19.setPaint(paint26);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        valueMarker19.notifyListeners(markerChangeEvent28);
        java.awt.Stroke stroke30 = valueMarker19.getStroke();
        valueMarker9.setStroke(stroke30);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (-1L), paint7, stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker25", valueMarker2.equals(valueMarker25) ? valueMarker2.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker16.getLabelFont();
        double double22 = valueMarker16.getValue();
        java.lang.String str23 = valueMarker16.getLabel();
        java.awt.Stroke stroke24 = valueMarker16.getOutlineStroke();
        java.awt.Stroke stroke25 = valueMarker16.getStroke();
        boolean boolean26 = valueMarker1.equals((java.lang.Object) stroke25);
        valueMarker1.setAlpha(1.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker1.getLabelOffset();
        java.awt.Paint paint30 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker1.getLabelTextAnchor();
        double double32 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker34.addChangeListener(markerChangeListener35);
        java.awt.Font font37 = valueMarker34.getLabelFont();
        valueMarker34.setValue((double) (short) 0);
        valueMarker34.setValue((double) (byte) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = valueMarker34.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker44.addChangeListener(markerChangeListener45);
        java.awt.Paint paint47 = valueMarker44.getLabelPaint();
        boolean boolean49 = valueMarker44.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType50 = valueMarker44.getLabelOffsetType();
        java.awt.Stroke stroke51 = valueMarker44.getOutlineStroke();
        valueMarker34.setOutlineStroke(stroke51);
        valueMarker1.setOutlineStroke(stroke51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker34", valueMarker5.equals(valueMarker34) ? valueMarker5.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        java.lang.Object obj8 = null;
        boolean boolean9 = valueMarker1.equals(obj8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        double double11 = valueMarker1.getValue();
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        valueMarker16.setOutlinePaint(paint22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker25.getLabelAnchor();
        valueMarker16.setLabelAnchor(rectangleAnchor26);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        valueMarker16.notifyListeners(markerChangeEvent28);
        java.awt.Stroke stroke30 = valueMarker16.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker32.addChangeListener(markerChangeListener33);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker32.addChangeListener(markerChangeListener35);
        java.awt.Font font37 = valueMarker32.getLabelFont();
        double double38 = valueMarker32.getValue();
        java.lang.String str39 = valueMarker32.getLabel();
        java.awt.Stroke stroke40 = valueMarker32.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = valueMarker32.getLabelOffset();
        valueMarker32.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker32.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        valueMarker32.notifyListeners(markerChangeEvent45);
        boolean boolean47 = valueMarker16.equals((java.lang.Object) valueMarker32);
        java.lang.Object obj48 = valueMarker16.clone();
        boolean boolean49 = valueMarker1.equals((java.lang.Object) valueMarker16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker25", valueMarker1.equals(valueMarker25) ? valueMarker1.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.awt.Paint paint4 = valueMarker2.getPaint();
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.removeChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker11.getLabelOffset();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint15 = valueMarker11.getLabelPaint();
        java.awt.Stroke stroke16 = valueMarker11.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint9, stroke16);
        java.awt.Paint paint18 = valueMarker17.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker21.getLabelAnchor();
        java.awt.Paint paint23 = valueMarker21.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker21.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker21.getLabelAnchor();
        java.awt.Paint paint26 = valueMarker21.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker30.addChangeListener(markerChangeListener31);
        java.lang.String str33 = valueMarker30.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker30.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker30.getLabelOffsetType();
        java.awt.Stroke stroke36 = valueMarker30.getOutlineStroke();
        valueMarker28.setOutlineStroke(stroke36);
        valueMarker21.setOutlineStroke(stroke36);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker21.getLabelOffsetType();
        valueMarker17.setLabelOffsetType(lengthAdjustmentType39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker30", valueMarker11.equals(valueMarker30) ? valueMarker11.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker17.getStroke();
        valueMarker14.setOutlineStroke(stroke21);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor24);
        double double26 = valueMarker1.getValue();
        java.awt.Stroke stroke27 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker29.addChangeListener(markerChangeListener30);
        java.awt.Font font32 = valueMarker29.getLabelFont();
        valueMarker29.setValue((double) (short) 0);
        valueMarker29.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker29.removeChangeListener(markerChangeListener37);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker29.removeChangeListener(markerChangeListener39);
        float float41 = valueMarker29.getAlpha();
        java.awt.Paint paint42 = valueMarker29.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker44.addChangeListener(markerChangeListener45);
        java.awt.Font font47 = valueMarker44.getLabelFont();
        valueMarker44.setValue((double) (short) 0);
        valueMarker44.setValue((double) (byte) 10);
        valueMarker44.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener56 = null;
        valueMarker55.addChangeListener(markerChangeListener56);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener58 = null;
        valueMarker55.addChangeListener(markerChangeListener58);
        java.awt.Font font60 = valueMarker55.getLabelFont();
        double double61 = valueMarker55.getValue();
        java.lang.String str62 = valueMarker55.getLabel();
        java.awt.Stroke stroke63 = valueMarker55.getOutlineStroke();
        valueMarker44.setOutlineStroke(stroke63);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType65 = valueMarker44.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint68 = valueMarker67.getPaint();
        java.awt.Paint paint69 = valueMarker67.getPaint();
        valueMarker67.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets72 = valueMarker67.getLabelOffset();
        valueMarker44.setLabelOffset(rectangleInsets72);
        valueMarker29.setLabelOffset(rectangleInsets72);
        valueMarker1.setLabelOffset(rectangleInsets72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker55", valueMarker1.equals(valueMarker55) ? valueMarker1.hashCode() == valueMarker55.hashCode() : true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint7 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        double double10 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        java.awt.Paint paint14 = valueMarker12.getPaint();
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker12.getLabelTextAnchor();
        java.awt.Font font18 = valueMarker12.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker12.removeChangeListener(markerChangeListener19);
        float float21 = valueMarker12.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker12.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType22);
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker27.getLabelAnchor();
        java.awt.Paint paint29 = valueMarker27.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker31.addChangeListener(markerChangeListener32);
        java.awt.Font font34 = valueMarker31.getLabelFont();
        valueMarker31.setValue((double) (short) 0);
        valueMarker31.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = valueMarker40.getLabelOffset();
        java.awt.Paint paint42 = valueMarker40.getPaint();
        valueMarker31.setLabelPaint(paint42);
        java.awt.Stroke stroke44 = valueMarker31.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 'a', paint29, stroke44);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType46 = valueMarker45.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType46);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint50 = valueMarker49.getPaint();
        java.awt.Paint paint51 = valueMarker49.getPaint();
        valueMarker49.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = valueMarker49.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor57 = valueMarker56.getLabelAnchor();
        valueMarker49.setLabelAnchor(rectangleAnchor57);
        valueMarker49.setValue((double) '#');
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener63 = null;
        valueMarker62.addChangeListener(markerChangeListener63);
        java.awt.Font font65 = valueMarker62.getLabelFont();
        java.awt.Paint paint66 = valueMarker62.getLabelPaint();
        java.awt.Paint paint67 = valueMarker62.getPaint();
        valueMarker49.setPaint(paint67);
        java.awt.Font font69 = valueMarker49.getLabelFont();
        valueMarker1.setLabelFont(font69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker27 and valueMarker56", valueMarker27.equals(valueMarker56) ? valueMarker27.hashCode() == valueMarker56.hashCode() : true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        float float10 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker13.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker16.getLabelAnchor();
        java.awt.Stroke stroke20 = valueMarker16.getStroke();
        valueMarker13.setOutlineStroke(stroke20);
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker13.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor22);
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        valueMarker1.setValue((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str30 = valueMarker29.getLabel();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        java.awt.Paint paint32 = valueMarker29.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker36.getLabelAnchor();
        java.awt.Paint paint38 = valueMarker36.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker36.getLabelAnchor();
        java.awt.Stroke stroke40 = valueMarker36.getStroke();
        valueMarker34.setOutlineStroke(stroke40);
        java.awt.Stroke stroke42 = valueMarker34.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 1, paint32, stroke42);
        valueMarker1.setOutlineStroke(stroke42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker16 and valueMarker36", valueMarker16.equals(valueMarker36) ? valueMarker16.hashCode() == valueMarker36.hashCode() : true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker15.getLabelOffset();
        float float19 = valueMarker15.getAlpha();
        valueMarker15.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        java.awt.Paint paint25 = valueMarker23.getPaint();
        valueMarker23.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker23.getLabelTextAnchor();
        java.awt.Font font29 = valueMarker23.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker23.removeChangeListener(markerChangeListener30);
        float float32 = valueMarker23.getAlpha();
        java.awt.Stroke stroke33 = valueMarker23.getStroke();
        valueMarker15.setOutlineStroke(stroke33);
        valueMarker15.setAlpha(0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker38.getLabelTextAnchor();
        java.awt.Font font44 = valueMarker38.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker38.removeChangeListener(markerChangeListener45);
        valueMarker38.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker51.addChangeListener(markerChangeListener52);
        java.awt.Paint paint54 = valueMarker51.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor59 = valueMarker58.getLabelAnchor();
        java.awt.Paint paint60 = valueMarker58.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor61 = valueMarker58.getLabelAnchor();
        java.awt.Stroke stroke62 = valueMarker58.getStroke();
        valueMarker56.setOutlineStroke(stroke62);
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint54, stroke62);
        valueMarker38.setOutlinePaint(paint54);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor66 = valueMarker38.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker51", valueMarker2.equals(valueMarker51) ? valueMarker2.hashCode() == valueMarker51.hashCode() : true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        java.awt.Font font16 = valueMarker15.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker18.addChangeListener(markerChangeListener19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker18.addChangeListener(markerChangeListener21);
        java.awt.Font font23 = valueMarker18.getLabelFont();
        double double24 = valueMarker18.getValue();
        java.lang.String str25 = valueMarker18.getLabel();
        java.awt.Stroke stroke26 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        java.awt.Paint paint33 = valueMarker28.getOutlinePaint();
        java.awt.Paint paint34 = valueMarker28.getLabelPaint();
        valueMarker18.setOutlinePaint(paint34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker37.addChangeListener(markerChangeListener38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker37.addChangeListener(markerChangeListener40);
        valueMarker37.setValue((double) 1L);
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker37.getLabelTextAnchor();
        valueMarker18.setLabelTextAnchor(textAnchor44);
        valueMarker15.setLabelTextAnchor(textAnchor44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker9 and valueMarker28", valueMarker9.equals(valueMarker28) ? valueMarker9.hashCode() == valueMarker28.hashCode() : true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        float float4 = valueMarker1.getAlpha();
        java.awt.Font font5 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        java.lang.String str9 = valueMarker7.getLabel();
        valueMarker7.setValue((double) 100);
        valueMarker7.setValue((double) 1.0f);
        java.awt.Paint paint14 = valueMarker7.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        java.awt.Paint paint18 = valueMarker16.getPaint();
        valueMarker16.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker22.getLabelOffset();
        boolean boolean24 = valueMarker16.equals((java.lang.Object) rectangleInsets23);
        java.awt.Stroke stroke25 = valueMarker16.getOutlineStroke();
        valueMarker7.setStroke(stroke25);
        valueMarker1.setStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker22", valueMarker1.equals(valueMarker22) ? valueMarker1.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        float float10 = valueMarker1.getAlpha();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        java.awt.Font font20 = valueMarker15.getLabelFont();
        valueMarker1.setLabelFont(font20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.removeChangeListener(markerChangeListener22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.removeChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker29.addChangeListener(markerChangeListener30);
        java.awt.Paint paint32 = valueMarker29.getLabelPaint();
        boolean boolean34 = valueMarker29.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker29.getLabelOffsetType();
        boolean boolean36 = valueMarker1.equals((java.lang.Object) valueMarker29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker15 and valueMarker29", valueMarker15.equals(valueMarker29) ? valueMarker15.hashCode() == valueMarker29.hashCode() : true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 0, paint3, stroke9);
        java.lang.String str11 = valueMarker10.getLabel();
        float float12 = valueMarker10.getAlpha();
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.awt.Paint paint14 = valueMarker10.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker21.getLabelAnchor();
        java.awt.Paint paint23 = valueMarker21.getLabelPaint();
        valueMarker17.setPaint(paint23);
        valueMarker17.setAlpha(0.0f);
        java.awt.Paint paint27 = valueMarker17.getLabelPaint();
        boolean boolean28 = valueMarker10.equals((java.lang.Object) paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker21", valueMarker5.equals(valueMarker21) ? valueMarker5.hashCode() == valueMarker21.hashCode() : true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker2.setOutlineStroke(stroke8);
        java.awt.Stroke stroke10 = valueMarker2.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker2.getLabelOffsetType();
        float float12 = valueMarker2.getAlpha();
        java.awt.Paint paint13 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        valueMarker15.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker15.getLabelTextAnchor();
        java.awt.Font font21 = valueMarker15.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker15.removeChangeListener(markerChangeListener22);
        float float24 = valueMarker15.getAlpha();
        valueMarker15.setLabel("hi!");
        java.awt.Stroke stroke27 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker(0.0d, paint13, stroke27);
        java.lang.String str29 = valueMarker28.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint32 = valueMarker31.getLabelPaint();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        java.awt.Paint paint37 = valueMarker35.getLabelPaint();
        valueMarker31.setPaint(paint37);
        double double39 = valueMarker31.getValue();
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker31.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker42.getLabelAnchor();
        java.awt.Paint paint44 = valueMarker42.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = valueMarker42.getLabelAnchor();
        java.awt.Stroke stroke46 = valueMarker42.getStroke();
        java.awt.Paint paint47 = valueMarker42.getLabelPaint();
        double double48 = valueMarker42.getValue();
        java.awt.Stroke stroke49 = null;
        valueMarker42.setOutlineStroke(stroke49);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener53 = null;
        valueMarker52.addChangeListener(markerChangeListener53);
        java.lang.String str55 = valueMarker52.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = valueMarker52.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType57 = valueMarker52.getLabelOffsetType();
        java.awt.Stroke stroke58 = valueMarker52.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType59 = valueMarker52.getLabelOffsetType();
        valueMarker42.setLabelOffsetType(lengthAdjustmentType59);
        java.lang.Object obj61 = valueMarker42.clone();
        valueMarker42.setAlpha((float) 1);
        java.awt.Font font64 = valueMarker42.getLabelFont();
        valueMarker31.setLabelFont(font64);
        valueMarker28.setLabelFont(font64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker35", valueMarker4.equals(valueMarker35) ? valueMarker4.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        valueMarker1.setOutlinePaint(paint15);
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        java.awt.Paint paint24 = valueMarker22.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker22.getLabelAnchor();
        java.awt.Stroke stroke26 = valueMarker22.getStroke();
        java.awt.Paint paint27 = valueMarker22.getLabelPaint();
        double double28 = valueMarker22.getValue();
        java.awt.Paint paint29 = valueMarker22.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker31.getLabelOffset();
        float float33 = valueMarker31.getAlpha();
        java.awt.Paint paint34 = valueMarker31.getOutlinePaint();
        java.awt.Paint paint35 = valueMarker31.getPaint();
        valueMarker22.setPaint(paint35);
        valueMarker1.setPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker22", valueMarker5.equals(valueMarker22) ? valueMarker5.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker7.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint5, stroke13);
        valueMarker15.setLabel("hi!");
        valueMarker15.setLabel("hi!");
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker15.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker24.getLabelAnchor();
        java.awt.Paint paint26 = valueMarker24.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker24.getLabelAnchor();
        java.awt.Stroke stroke28 = valueMarker24.getStroke();
        valueMarker22.setOutlineStroke(stroke28);
        java.awt.Stroke stroke30 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker22.getLabelOffsetType();
        float float32 = valueMarker22.getAlpha();
        java.awt.Paint paint33 = valueMarker22.getOutlinePaint();
        java.awt.Paint paint34 = valueMarker22.getOutlinePaint();
        valueMarker15.setOutlinePaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker22", valueMarker7.equals(valueMarker22) ? valueMarker7.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker9.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        java.awt.Paint paint18 = valueMarker16.getPaint();
        valueMarker16.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker16.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker16.getLabelAnchor();
        valueMarker12.setLabelAnchor(rectangleAnchor22);
        valueMarker9.setLabelAnchor(rectangleAnchor22);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setValue((double) (short) 0);
        java.awt.Paint paint29 = null;
        valueMarker26.setOutlinePaint(paint29);
        java.awt.Paint paint31 = valueMarker26.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker26.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker26.getLabelTextAnchor();
        valueMarker9.setLabelTextAnchor(textAnchor33);
        valueMarker1.setLabelTextAnchor(textAnchor33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker26", valueMarker1.equals(valueMarker26) ? valueMarker1.hashCode() == valueMarker26.hashCode() : true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        double double5 = valueMarker1.getValue();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj8", valueMarker1.equals(obj8) ? valueMarker1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        double double7 = valueMarker1.getValue();
        java.lang.String str8 = valueMarker1.getLabel();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        java.awt.Paint paint14 = valueMarker12.getPaint();
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker12.getLabelTextAnchor();
        java.awt.Font font18 = valueMarker12.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker12.removeChangeListener(markerChangeListener19);
        valueMarker12.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker25.addChangeListener(markerChangeListener26);
        java.awt.Paint paint28 = valueMarker25.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker32.getLabelAnchor();
        java.awt.Paint paint34 = valueMarker32.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke36 = valueMarker32.getStroke();
        valueMarker30.setOutlineStroke(stroke36);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint28, stroke36);
        valueMarker12.setOutlinePaint(paint28);
        valueMarker1.setPaint(paint28);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker1.notifyListeners(markerChangeEvent41);
        java.awt.Font font43 = valueMarker1.getLabelFont();
        java.awt.Paint paint44 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener47 = null;
        valueMarker46.addChangeListener(markerChangeListener47);
        java.awt.Font font49 = valueMarker46.getLabelFont();
        valueMarker46.setValue((double) (short) 0);
        valueMarker46.setValue((double) (byte) 10);
        float float54 = valueMarker46.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = valueMarker56.getLabelOffset();
        java.awt.Paint paint58 = valueMarker56.getLabelPaint();
        java.awt.Paint paint59 = valueMarker56.getOutlinePaint();
        java.awt.Paint paint60 = valueMarker56.getLabelPaint();
        valueMarker46.setOutlinePaint(paint60);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener62 = null;
        valueMarker46.removeChangeListener(markerChangeListener62);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType64 = valueMarker46.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = valueMarker46.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint68 = valueMarker67.getPaint();
        java.awt.Paint paint69 = valueMarker67.getPaint();
        valueMarker67.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor72 = valueMarker67.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor73 = valueMarker67.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor74 = valueMarker67.getLabelTextAnchor();
        valueMarker46.setLabelTextAnchor(textAnchor74);
        valueMarker1.setLabelTextAnchor(textAnchor74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker25 and valueMarker56", valueMarker25.equals(valueMarker56) ? valueMarker25.hashCode() == valueMarker56.hashCode() : true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker4.addChangeListener(markerChangeListener5);
        java.lang.String str7 = valueMarker4.getLabel();
        java.awt.Paint paint8 = valueMarker4.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint11 = valueMarker10.getPaint();
        java.awt.Paint paint12 = valueMarker10.getPaint();
        valueMarker10.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker10.getLabelTextAnchor();
        valueMarker4.setLabelTextAnchor(textAnchor15);
        valueMarker1.setLabelTextAnchor(textAnchor15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker21.addChangeListener(markerChangeListener22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint26 = valueMarker25.getLabelPaint();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        valueMarker21.setOutlinePaint(paint27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker21.addChangeListener(markerChangeListener29);
        java.awt.Font font31 = valueMarker21.getLabelFont();
        java.awt.Font font32 = valueMarker21.getLabelFont();
        float float33 = valueMarker21.getAlpha();
        valueMarker21.setValue((double) (byte) 10);
        valueMarker21.setValue((double) 1L);
        java.awt.Stroke stroke38 = valueMarker21.getStroke();
        valueMarker1.setStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker25", valueMarker4.equals(valueMarker25) ? valueMarker4.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint22 = valueMarker21.getPaint();
        java.lang.String str23 = valueMarker21.getLabel();
        valueMarker21.setValue((double) 100);
        valueMarker21.setValue((double) 1.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker21.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType28);
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker31.getLabelTextAnchor();
        valueMarker31.setLabel("hi!");
        valueMarker31.setValue((double) 0.8f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker31.removeChangeListener(markerChangeListener37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker40.addChangeListener(markerChangeListener41);
        java.lang.String str43 = valueMarker40.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = valueMarker40.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType45 = valueMarker40.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker40.getLabelOffset();
        valueMarker31.setLabelOffset(rectangleInsets46);
        valueMarker1.setLabelOffset(rectangleInsets46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker40", valueMarker1.equals(valueMarker40) ? valueMarker1.hashCode() == valueMarker40.hashCode() : true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker7.getLabelAnchor();
        java.awt.Paint paint9 = valueMarker7.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.removeChangeListener(markerChangeListener10);
        java.awt.Paint paint12 = valueMarker7.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Paint paint16 = valueMarker14.getPaint();
        valueMarker14.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker14.getLabelAnchor();
        valueMarker7.setLabelAnchor(rectangleAnchor20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker14", valueMarker1.equals(valueMarker14) ? valueMarker1.hashCode() == valueMarker14.hashCode() : true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker8.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        java.awt.Paint paint19 = valueMarker17.getLabelPaint();
        java.lang.String str20 = valueMarker17.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint25 = valueMarker24.getPaint();
        java.awt.Paint paint26 = valueMarker24.getPaint();
        valueMarker24.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker24.getLabelTextAnchor();
        java.awt.Font font30 = valueMarker24.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker24.removeChangeListener(markerChangeListener31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = valueMarker34.getLabelOffset();
        float float36 = valueMarker34.getAlpha();
        java.awt.Paint paint37 = valueMarker34.getOutlinePaint();
        java.awt.Stroke stroke38 = valueMarker34.getOutlineStroke();
        valueMarker24.setOutlineStroke(stroke38);
        java.awt.Font font40 = valueMarker24.getLabelFont();
        valueMarker1.setLabelFont(font40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker8 and valueMarker24", valueMarker8.equals(valueMarker24) ? valueMarker8.hashCode() == valueMarker24.hashCode() : true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker2.getLabelFont();
        valueMarker2.setValue((double) (short) 0);
        valueMarker2.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker11.getLabelAnchor();
        java.awt.Stroke stroke15 = valueMarker11.getStroke();
        java.awt.Paint paint16 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker11.getLabelPaint();
        java.awt.Paint paint18 = valueMarker11.getOutlinePaint();
        boolean boolean19 = valueMarker2.equals((java.lang.Object) paint18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker21.getLabelOffset();
        java.awt.Paint paint23 = valueMarker21.getPaint();
        java.awt.Stroke stroke24 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint18, stroke24);
        java.lang.Object obj26 = valueMarker25.clone();
        double double27 = valueMarker25.getValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker25 and obj26", valueMarker25.equals(obj26) ? valueMarker25.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        java.awt.Font font11 = valueMarker5.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker5.removeChangeListener(markerChangeListener12);
        float float14 = valueMarker5.getAlpha();
        valueMarker5.setLabel("hi!");
        java.awt.Stroke stroke17 = valueMarker5.getStroke();
        java.awt.Paint paint18 = valueMarker5.getLabelPaint();
        valueMarker3.setOutlinePaint(paint18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setValue((double) (short) 0);
        java.awt.Paint paint24 = null;
        valueMarker21.setOutlinePaint(paint24);
        java.awt.Paint paint26 = valueMarker21.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker30.getLabelAnchor();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker30.getLabelAnchor();
        java.awt.Stroke stroke34 = valueMarker30.getStroke();
        valueMarker28.setOutlineStroke(stroke34);
        java.awt.Stroke stroke36 = valueMarker28.getOutlineStroke();
        valueMarker21.setStroke(stroke36);
        java.awt.Stroke stroke38 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker(0.0d, paint18, stroke38);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker41.addChangeListener(markerChangeListener42);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = valueMarker41.getLabelAnchor();
        java.lang.String str45 = valueMarker41.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker47.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor52 = valueMarker51.getLabelAnchor();
        java.awt.Paint paint53 = valueMarker51.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor54 = valueMarker51.getLabelAnchor();
        java.awt.Stroke stroke55 = valueMarker51.getStroke();
        java.awt.Paint paint56 = valueMarker51.getOutlinePaint();
        java.awt.Paint paint57 = valueMarker51.getLabelPaint();
        valueMarker47.setOutlinePaint(paint57);
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint61 = valueMarker60.getLabelPaint();
        valueMarker47.setOutlinePaint(paint61);
        java.awt.Stroke stroke63 = valueMarker47.getStroke();
        valueMarker41.setOutlineStroke(stroke63);
        org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100, paint18, stroke63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker3 and valueMarker47", valueMarker3.equals(valueMarker47) ? valueMarker3.hashCode() == valueMarker47.hashCode() : true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker8.addChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getLabelPaint();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        valueMarker8.setOutlinePaint(paint14);
        valueMarker1.setPaint(paint14);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker21.addChangeListener(markerChangeListener22);
        java.awt.Font font24 = valueMarker21.getLabelFont();
        valueMarker21.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker28.addChangeListener(markerChangeListener29);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker28.addChangeListener(markerChangeListener31);
        java.awt.Font font33 = valueMarker28.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker28.getLabelOffset();
        valueMarker21.setLabelOffset(rectangleInsets34);
        double double36 = valueMarker21.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker38.addChangeListener(markerChangeListener39);
        java.awt.Font font41 = valueMarker38.getLabelFont();
        valueMarker38.setValue((double) (short) 0);
        valueMarker38.setValue((double) (byte) 10);
        java.awt.Paint paint46 = valueMarker38.getOutlinePaint();
        valueMarker21.setLabelPaint(paint46);
        org.jfree.chart.text.TextAnchor textAnchor48 = valueMarker21.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker12 and valueMarker28", valueMarker12.equals(valueMarker28) ? valueMarker12.hashCode() == valueMarker28.hashCode() : true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 0, paint3, stroke12);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        java.lang.String str18 = valueMarker16.getLabel();
        valueMarker16.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getLabelPaint();
        valueMarker16.setPaint(paint23);
        java.awt.Font font25 = valueMarker16.getLabelFont();
        double double26 = valueMarker16.getValue();
        java.awt.Paint paint27 = valueMarker16.getPaint();
        java.awt.Paint paint28 = valueMarker16.getPaint();
        valueMarker14.setOutlinePaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker2 and valueMarker22", valueMarker2.equals(valueMarker22) ? valueMarker2.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker10.getLabelFont();
        double double16 = valueMarker10.getValue();
        java.lang.String str17 = valueMarker10.getLabel();
        java.awt.Stroke stroke18 = valueMarker10.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker10.getLabelOffset();
        java.awt.Paint paint20 = valueMarker10.getLabelPaint();
        valueMarker1.setPaint(paint20);
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker(1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker26.getLabelAnchor();
        java.awt.Paint paint28 = valueMarker26.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker26.getLabelAnchor();
        java.awt.Stroke stroke30 = valueMarker26.getStroke();
        java.awt.Paint paint31 = valueMarker26.getLabelPaint();
        double double32 = valueMarker26.getValue();
        java.awt.Stroke stroke33 = null;
        valueMarker26.setOutlineStroke(stroke33);
        java.awt.Paint paint35 = valueMarker26.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker26.getLabelTextAnchor();
        valueMarker24.setLabelTextAnchor(textAnchor36);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker(0.0d);
        java.awt.Paint paint40 = valueMarker39.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker42.addChangeListener(markerChangeListener43);
        java.awt.Paint paint45 = valueMarker42.getLabelPaint();
        java.awt.Stroke stroke46 = valueMarker42.getStroke();
        valueMarker39.setStroke(stroke46);
        valueMarker24.setOutlineStroke(stroke46);
        valueMarker1.setStroke(stroke46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker42", valueMarker10.equals(valueMarker42) ? valueMarker10.hashCode() == valueMarker42.hashCode() : true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getLabelPaint();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker1.getLabelFont();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        java.awt.Paint paint13 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        java.awt.Stroke stroke19 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker21.addChangeListener(markerChangeListener22);
        java.awt.Font font24 = valueMarker21.getLabelFont();
        float float25 = valueMarker21.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker21.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker21.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker21.getLabelTextAnchor();
        valueMarker16.setLabelTextAnchor(textAnchor28);
        valueMarker1.setLabelTextAnchor(textAnchor28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker21", valueMarker5.equals(valueMarker21) ? valueMarker5.hashCode() == valueMarker21.hashCode() : true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker5.setOutlineStroke(stroke12);
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.awt.Paint paint21 = valueMarker19.getPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker19.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        valueMarker26.setOutlineStroke(stroke32);
        java.awt.Stroke stroke34 = valueMarker26.getOutlineStroke();
        valueMarker19.setStroke(stroke34);
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker19.getLabelTextAnchor();
        java.awt.Stroke stroke37 = valueMarker19.getStroke();
        java.awt.Paint paint38 = valueMarker19.getLabelPaint();
        float float39 = valueMarker19.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker41.addChangeListener(markerChangeListener42);
        java.awt.Font font44 = valueMarker41.getLabelFont();
        valueMarker41.setValue((double) (short) 0);
        java.awt.Paint paint47 = valueMarker41.getPaint();
        valueMarker41.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker51.addChangeListener(markerChangeListener52);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker51.addChangeListener(markerChangeListener54);
        java.awt.Font font56 = valueMarker51.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker58.addChangeListener(markerChangeListener59);
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint63 = valueMarker62.getLabelPaint();
        java.awt.Paint paint64 = valueMarker62.getLabelPaint();
        valueMarker58.setOutlinePaint(paint64);
        valueMarker51.setPaint(paint64);
        valueMarker41.setLabelPaint(paint64);
        valueMarker19.setPaint(paint64);
        valueMarker1.setPaint(paint64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker51", valueMarker1.equals(valueMarker51) ? valueMarker1.hashCode() == valueMarker51.hashCode() : true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        double double5 = valueMarker1.getValue();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setValue((double) (short) 0);
        java.awt.Paint paint13 = null;
        valueMarker10.setOutlinePaint(paint13);
        java.awt.Paint paint15 = valueMarker10.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker19.getLabelAnchor();
        java.awt.Stroke stroke23 = valueMarker19.getStroke();
        valueMarker17.setOutlineStroke(stroke23);
        java.awt.Stroke stroke25 = valueMarker17.getOutlineStroke();
        valueMarker10.setStroke(stroke25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker28.getLabelOffset();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        java.awt.Paint paint32 = valueMarker28.getLabelPaint();
        java.awt.Stroke stroke33 = valueMarker28.getStroke();
        java.awt.Font font34 = valueMarker28.getLabelFont();
        java.awt.Paint paint35 = valueMarker28.getPaint();
        valueMarker10.setLabelPaint(paint35);
        valueMarker1.setPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj8", valueMarker1.equals(obj8) ? valueMarker1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        double double8 = valueMarker1.getValue();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        valueMarker13.setValue((double) (short) 0);
        java.awt.Font font18 = valueMarker13.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker20.getLabelOffset();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        java.awt.Paint paint23 = valueMarker20.getOutlinePaint();
        java.awt.Paint paint24 = valueMarker20.getLabelPaint();
        java.awt.Stroke stroke25 = valueMarker20.getStroke();
        java.awt.Font font26 = valueMarker20.getLabelFont();
        java.awt.Paint paint27 = valueMarker20.getOutlinePaint();
        java.awt.Stroke stroke28 = valueMarker20.getOutlineStroke();
        valueMarker13.setStroke(stroke28);
        java.awt.Paint paint30 = valueMarker13.getOutlinePaint();
        valueMarker1.setPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker20", valueMarker1.equals(valueMarker20) ? valueMarker1.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker2.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        java.awt.Paint paint11 = valueMarker9.getPaint();
        valueMarker9.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker9.getLabelOffset();
        valueMarker2.setLabelOffset(rectangleInsets14);
        java.lang.String str16 = valueMarker2.getLabel();
        java.lang.Object obj17 = valueMarker2.clone();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        java.awt.Paint paint25 = valueMarker23.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker23.getLabelAnchor();
        java.awt.Stroke stroke27 = valueMarker23.getStroke();
        java.awt.Paint paint28 = valueMarker23.getOutlinePaint();
        java.awt.Paint paint29 = valueMarker23.getLabelPaint();
        valueMarker19.setOutlinePaint(paint29);
        valueMarker2.setPaint(paint29);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setValue((double) (short) 0);
        java.awt.Paint paint37 = valueMarker34.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker39.addChangeListener(markerChangeListener40);
        java.awt.Font font42 = valueMarker39.getLabelFont();
        java.awt.Stroke stroke43 = valueMarker39.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker(0.0d, paint37, stroke43);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 0, paint29, stroke43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and valueMarker39", obj17.equals(valueMarker39) ? obj17.hashCode() == valueMarker39.hashCode() : true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setValue((double) (short) 0);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker2.getLabelTextAnchor();
        java.awt.Paint paint6 = valueMarker2.getLabelPaint();
        java.lang.String str7 = valueMarker2.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker9.addChangeListener(markerChangeListener10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        java.awt.Font font14 = valueMarker9.getLabelFont();
        double double15 = valueMarker9.getValue();
        java.lang.String str16 = valueMarker9.getLabel();
        java.awt.Stroke stroke17 = valueMarker9.getOutlineStroke();
        java.awt.Stroke stroke18 = valueMarker9.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker20.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker20.getLabelTextAnchor();
        java.awt.Font font26 = valueMarker20.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker20.removeChangeListener(markerChangeListener27);
        valueMarker20.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker33.addChangeListener(markerChangeListener34);
        java.awt.Paint paint36 = valueMarker33.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker40.getLabelAnchor();
        java.awt.Paint paint42 = valueMarker40.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker40.getLabelAnchor();
        java.awt.Stroke stroke44 = valueMarker40.getStroke();
        valueMarker38.setOutlineStroke(stroke44);
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint36, stroke44);
        valueMarker20.setOutlinePaint(paint36);
        valueMarker9.setPaint(paint36);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        valueMarker9.notifyListeners(markerChangeEvent49);
        java.awt.Font font51 = valueMarker9.getLabelFont();
        java.awt.Paint paint52 = valueMarker9.getOutlinePaint();
        valueMarker2.setLabelPaint(paint52);
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = valueMarker55.getLabelOffset();
        float float57 = valueMarker55.getAlpha();
        java.awt.Paint paint58 = valueMarker55.getOutlinePaint();
        java.awt.Stroke stroke59 = valueMarker55.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType60 = valueMarker55.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor63 = valueMarker62.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor66 = valueMarker65.getLabelAnchor();
        java.awt.Paint paint67 = valueMarker65.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor68 = valueMarker65.getLabelAnchor();
        java.awt.Stroke stroke69 = valueMarker65.getStroke();
        valueMarker62.setOutlineStroke(stroke69);
        org.jfree.chart.text.TextAnchor textAnchor71 = valueMarker62.getLabelTextAnchor();
        java.awt.Paint paint72 = valueMarker62.getPaint();
        java.awt.Font font73 = valueMarker62.getLabelFont();
        java.lang.String str74 = valueMarker62.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor75 = valueMarker62.getLabelAnchor();
        valueMarker55.setLabelAnchor(rectangleAnchor75);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor77 = valueMarker55.getLabelAnchor();
        java.awt.Stroke stroke78 = valueMarker55.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((double) '#', paint52, stroke78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker33 and valueMarker55", valueMarker33.equals(valueMarker55) ? valueMarker33.hashCode() == valueMarker55.hashCode() : true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker16.getLabelFont();
        double double22 = valueMarker16.getValue();
        java.lang.String str23 = valueMarker16.getLabel();
        java.awt.Stroke stroke24 = valueMarker16.getOutlineStroke();
        java.awt.Stroke stroke25 = valueMarker16.getStroke();
        boolean boolean26 = valueMarker1.equals((java.lang.Object) stroke25);
        valueMarker1.setAlpha(1.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker1.getLabelOffset();
        java.awt.Paint paint30 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker1.getLabelTextAnchor();
        double double32 = valueMarker1.getValue();
        java.awt.Font font33 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = valueMarker35.getLabelOffset();
        float float37 = valueMarker35.getAlpha();
        java.awt.Paint paint38 = valueMarker35.getOutlinePaint();
        java.awt.Stroke stroke39 = valueMarker35.getOutlineStroke();
        java.awt.Font font40 = valueMarker35.getLabelFont();
        java.awt.Paint paint41 = valueMarker35.getOutlinePaint();
        java.awt.Paint paint42 = valueMarker35.getLabelPaint();
        java.awt.Stroke stroke43 = valueMarker35.getStroke();
        valueMarker1.setStroke(stroke43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker16 and valueMarker35", valueMarker16.equals(valueMarker35) ? valueMarker16.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        java.awt.Paint paint11 = valueMarker9.getPaint();
        valueMarker9.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker9.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor17);
        valueMarker1.setLabelAnchor(rectangleAnchor17);
        java.lang.Object obj20 = valueMarker1.clone();
        java.lang.String str21 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj20", valueMarker1.equals(obj20) ? valueMarker1.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        valueMarker2.setOutlineStroke(stroke9);
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker2.getLabelTextAnchor();
        valueMarker2.setLabel("hi!");
        java.awt.Stroke stroke14 = valueMarker2.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getLabelPaint();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker16.getLabelTextAnchor();
        java.awt.Paint paint20 = valueMarker16.getLabelPaint();
        valueMarker2.setLabelPaint(paint20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker23.addChangeListener(markerChangeListener24);
        java.awt.Font font26 = valueMarker23.getLabelFont();
        valueMarker23.setValue((double) (short) 0);
        valueMarker23.setAlpha((float) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker23.removeChangeListener(markerChangeListener31);
        java.awt.Font font33 = valueMarker23.getLabelFont();
        java.awt.Paint paint34 = valueMarker23.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker36.addChangeListener(markerChangeListener37);
        java.awt.Font font39 = valueMarker36.getLabelFont();
        valueMarker36.setValue((double) (short) 0);
        valueMarker36.setValue((double) (byte) 10);
        java.awt.Paint paint44 = valueMarker36.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = valueMarker46.getLabelAnchor();
        java.awt.Paint paint48 = valueMarker46.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = valueMarker46.getLabelAnchor();
        java.awt.Stroke stroke50 = valueMarker46.getStroke();
        java.awt.Paint paint51 = valueMarker46.getLabelPaint();
        double double52 = valueMarker46.getValue();
        java.awt.Paint paint53 = valueMarker46.getLabelPaint();
        valueMarker36.setPaint(paint53);
        valueMarker23.setLabelPaint(paint53);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener56 = null;
        valueMarker23.addChangeListener(markerChangeListener56);
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener60 = null;
        valueMarker59.addChangeListener(markerChangeListener60);
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint64 = valueMarker63.getLabelPaint();
        java.awt.Paint paint65 = valueMarker63.getLabelPaint();
        valueMarker59.setOutlinePaint(paint65);
        java.lang.String str67 = valueMarker59.getLabel();
        java.awt.Paint paint68 = valueMarker59.getOutlinePaint();
        java.awt.Stroke stroke69 = valueMarker59.getStroke();
        valueMarker23.setOutlineStroke(stroke69);
        org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) 10, paint20, stroke69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker46", valueMarker5.equals(valueMarker46) ? valueMarker5.hashCode() == valueMarker46.hashCode() : true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker8.setOutlineStroke(stroke14);
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        java.lang.String str18 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker20.getLabelPaint();
        java.awt.Stroke stroke24 = valueMarker20.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker20.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        java.awt.Paint paint29 = valueMarker27.getPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker27.getLabelOffset();
        valueMarker20.setLabelOffset(rectangleInsets32);
        java.lang.String str34 = valueMarker20.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker20.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker27", valueMarker1.equals(valueMarker27) ? valueMarker1.hashCode() == valueMarker27.hashCode() : true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker3.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker3.getLabelFont();
        valueMarker3.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker10.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker10.getLabelOffset();
        valueMarker3.setLabelOffset(rectangleInsets16);
        valueMarker1.setLabelOffset(rectangleInsets16);
        java.awt.Stroke stroke19 = valueMarker1.getOutlineStroke();
        double double20 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker22.getLabelFont();
        float float26 = valueMarker22.getAlpha();
        valueMarker22.setValue((double) 0);
        valueMarker22.setValue((double) 100.0f);
        double double31 = valueMarker22.getValue();
        java.awt.Stroke stroke32 = valueMarker22.getOutlineStroke();
        valueMarker1.setStroke(stroke32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker22", valueMarker10.equals(valueMarker22) ? valueMarker10.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker8.setOutlineStroke(stroke14);
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint26 = valueMarker25.getPaint();
        java.awt.Paint paint27 = valueMarker25.getPaint();
        valueMarker25.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker25.getLabelTextAnchor();
        java.awt.Font font31 = valueMarker25.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker25.removeChangeListener(markerChangeListener32);
        java.awt.Font font34 = valueMarker25.getLabelFont();
        java.awt.Stroke stroke35 = valueMarker25.getOutlineStroke();
        java.lang.String str36 = valueMarker25.getLabel();
        java.awt.Paint paint37 = valueMarker25.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker39.addChangeListener(markerChangeListener40);
        java.lang.String str42 = valueMarker39.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker39.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        valueMarker39.notifyListeners(markerChangeEvent44);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker39.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = valueMarker39.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        valueMarker39.notifyListeners(markerChangeEvent48);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = valueMarker39.getLabelOffset();
        java.awt.Stroke stroke51 = valueMarker39.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint37, stroke51);
        valueMarker1.setPaint(paint37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker25", valueMarker1.equals(valueMarker25) ? valueMarker1.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setValue((double) (short) 0);
        java.awt.Paint paint9 = null;
        valueMarker6.setOutlinePaint(paint9);
        java.awt.Paint paint11 = valueMarker6.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker13.getLabelAnchor();
        java.awt.Paint paint15 = valueMarker13.getLabelPaint();
        valueMarker6.setPaint(paint15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker18.addChangeListener(markerChangeListener19);
        java.awt.Paint paint21 = valueMarker18.getLabelPaint();
        java.awt.Stroke stroke22 = valueMarker18.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker18.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint26 = valueMarker25.getPaint();
        java.awt.Paint paint27 = valueMarker25.getPaint();
        valueMarker25.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker25.getLabelOffset();
        valueMarker18.setLabelOffset(rectangleInsets30);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker18.getLabelOffsetType();
        java.awt.Paint paint33 = valueMarker18.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        valueMarker18.notifyListeners(markerChangeEvent34);
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker18.getLabelTextAnchor();
        java.awt.Font font37 = valueMarker18.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker18.getLabelOffsetType();
        valueMarker6.setLabelOffsetType(lengthAdjustmentType38);
        java.awt.Font font40 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker25", valueMarker1.equals(valueMarker25) ? valueMarker1.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        double double6 = valueMarker2.getValue();
        double double7 = valueMarker2.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker9.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        java.awt.Paint paint18 = valueMarker16.getPaint();
        valueMarker16.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker16.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker16.getLabelAnchor();
        valueMarker12.setLabelAnchor(rectangleAnchor22);
        valueMarker9.setLabelAnchor(rectangleAnchor22);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setValue((double) (short) 0);
        java.awt.Paint paint29 = null;
        valueMarker26.setOutlinePaint(paint29);
        java.awt.Paint paint31 = valueMarker26.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker26.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker26.getLabelTextAnchor();
        valueMarker9.setLabelTextAnchor(textAnchor33);
        java.awt.Paint paint35 = valueMarker9.getOutlinePaint();
        valueMarker2.setLabelPaint(paint35);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker40.getLabelAnchor();
        java.awt.Paint paint42 = valueMarker40.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker40.getLabelAnchor();
        java.awt.Stroke stroke44 = valueMarker40.getStroke();
        valueMarker38.setOutlineStroke(stroke44);
        java.awt.Stroke stroke46 = valueMarker38.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint35, stroke46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker9 and valueMarker40", valueMarker9.equals(valueMarker40) ? valueMarker9.hashCode() == valueMarker40.hashCode() : true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = null;
        valueMarker1.setOutlinePaint(paint5);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str11 = valueMarker10.getLabel();
        java.awt.Paint paint12 = valueMarker10.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        java.awt.Paint paint18 = valueMarker15.getLabelPaint();
        java.awt.Stroke stroke19 = valueMarker15.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker15.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker15", valueMarker10.equals(valueMarker15) ? valueMarker10.hashCode() == valueMarker15.hashCode() : true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker8.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker8.getStroke();
        valueMarker6.setOutlineStroke(stroke12);
        java.awt.Stroke stroke14 = valueMarker6.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker6.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker1.notifyListeners(markerChangeEvent17);
        valueMarker1.setAlpha((float) 0L);
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker26.addChangeListener(markerChangeListener27);
        java.awt.Paint paint29 = valueMarker26.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        java.awt.Paint paint35 = valueMarker33.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker33.getLabelAnchor();
        java.awt.Stroke stroke37 = valueMarker33.getStroke();
        valueMarker31.setOutlineStroke(stroke37);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint29, stroke37);
        valueMarker39.setValue((double) '#');
        java.awt.Paint paint42 = valueMarker39.getPaint();
        java.awt.Font font43 = valueMarker39.getLabelFont();
        java.lang.String str44 = valueMarker39.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = valueMarker39.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker39.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker6 and valueMarker31", valueMarker6.equals(valueMarker31) ? valueMarker6.hashCode() == valueMarker31.hashCode() : true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        valueMarker1.setLabelPaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        java.awt.Paint paint24 = valueMarker22.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker22.getLabelAnchor();
        java.awt.Stroke stroke26 = valueMarker22.getStroke();
        valueMarker19.setOutlineStroke(stroke26);
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker19.getLabelTextAnchor();
        valueMarker15.setLabelTextAnchor(textAnchor28);
        java.lang.String str30 = valueMarker15.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker15.removeChangeListener(markerChangeListener31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker34.addChangeListener(markerChangeListener35);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        java.awt.Font font39 = valueMarker34.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker34.getLabelOffset();
        double double41 = valueMarker34.getValue();
        java.awt.Paint paint42 = valueMarker34.getOutlinePaint();
        valueMarker15.setLabelPaint(paint42);
        java.awt.Stroke stroke44 = valueMarker15.getStroke();
        valueMarker1.setOutlineStroke(stroke44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker22", valueMarker4.equals(valueMarker22) ? valueMarker4.hashCode() == valueMarker22.hashCode() : true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        float float5 = valueMarker1.getAlpha();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.lang.String str15 = valueMarker12.getLabel();
        java.awt.Paint paint16 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint19 = valueMarker18.getPaint();
        java.awt.Paint paint20 = valueMarker18.getPaint();
        valueMarker18.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker18.getLabelTextAnchor();
        valueMarker12.setLabelTextAnchor(textAnchor23);
        valueMarker9.setLabelTextAnchor(textAnchor23);
        float float26 = valueMarker9.getAlpha();
        java.awt.Stroke stroke27 = valueMarker9.getStroke();
        valueMarker1.setOutlineStroke(stroke27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and obj7", valueMarker1.equals(obj7) ? valueMarker1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.awt.Paint paint4 = valueMarker2.getPaint();
        valueMarker2.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker2.getLabelTextAnchor();
        java.awt.Font font8 = valueMarker2.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker2.removeChangeListener(markerChangeListener9);
        valueMarker2.setAlpha((float) (short) 0);
        java.awt.Paint paint13 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        java.lang.String str18 = valueMarker15.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker15.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        java.lang.Object obj21 = valueMarker15.clone();
        valueMarker15.setValue((double) 1.0f);
        java.awt.Stroke stroke24 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10L, paint13, stroke24);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker27.addChangeListener(markerChangeListener28);
        java.awt.Font font30 = valueMarker27.getLabelFont();
        valueMarker27.setValue((double) (short) 0);
        valueMarker27.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker27.removeChangeListener(markerChangeListener35);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker27.getLabelOffsetType();
        float float38 = valueMarker27.getAlpha();
        java.lang.String str39 = valueMarker27.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker42.addChangeListener(markerChangeListener43);
        java.awt.Paint paint45 = valueMarker42.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = valueMarker49.getLabelAnchor();
        java.awt.Paint paint51 = valueMarker49.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor52 = valueMarker49.getLabelAnchor();
        java.awt.Stroke stroke53 = valueMarker49.getStroke();
        valueMarker47.setOutlineStroke(stroke53);
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint45, stroke53);
        valueMarker55.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener58 = null;
        valueMarker55.addChangeListener(markerChangeListener58);
        java.awt.Paint paint60 = valueMarker55.getLabelPaint();
        valueMarker27.setPaint(paint60);
        valueMarker25.setLabelPaint(paint60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj21 and valueMarker42", obj21.equals(valueMarker42) ? obj21.hashCode() == valueMarker42.hashCode() : true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker3.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker3.getLabelFont();
        valueMarker3.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker10.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker10.getLabelOffset();
        valueMarker3.setLabelOffset(rectangleInsets16);
        valueMarker1.setLabelOffset(rectangleInsets16);
        valueMarker1.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker23.addChangeListener(markerChangeListener24);
        java.awt.Paint paint26 = valueMarker23.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker30.getLabelAnchor();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker30.getLabelAnchor();
        java.awt.Stroke stroke34 = valueMarker30.getStroke();
        valueMarker28.setOutlineStroke(stroke34);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint26, stroke34);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getPaint();
        java.awt.Paint paint40 = valueMarker38.getPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker38.getLabelTextAnchor();
        java.awt.Font font44 = valueMarker38.getLabelFont();
        valueMarker36.setLabelFont(font44);
        java.awt.Paint paint46 = valueMarker36.getPaint();
        java.awt.Stroke stroke47 = valueMarker36.getStroke();
        java.awt.Font font48 = valueMarker36.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker36.getLabelTextAnchor();
        java.awt.Paint paint50 = valueMarker36.getOutlinePaint();
        valueMarker1.setPaint(paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker3 and valueMarker28", valueMarker3.equals(valueMarker28) ? valueMarker3.hashCode() == valueMarker28.hashCode() : true);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker8.setOutlineStroke(stroke14);
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 100);
        java.awt.Stroke stroke21 = valueMarker20.getOutlineStroke();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        valueMarker20.setLabel("");
        boolean boolean25 = valueMarker1.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker1 and valueMarker20", valueMarker1.equals(valueMarker20) ? valueMarker1.hashCode() == valueMarker20.hashCode() : true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint8 = valueMarker7.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0, paint8, stroke14);
        java.lang.String str16 = valueMarker15.getLabel();
        float float17 = valueMarker15.getAlpha();
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker15.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint24 = valueMarker23.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint27 = valueMarker26.getPaint();
        java.lang.String str28 = valueMarker26.getLabel();
        valueMarker26.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint33 = valueMarker32.getLabelPaint();
        valueMarker26.setPaint(paint33);
        valueMarker23.setOutlinePaint(paint33);
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker23.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker23.getLabelOffset();
        float float38 = valueMarker23.getAlpha();
        java.awt.Stroke stroke39 = valueMarker23.getOutlineStroke();
        valueMarker1.setStroke(stroke39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker32", valueMarker7.equals(valueMarker32) ? valueMarker7.hashCode() == valueMarker32.hashCode() : true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint8 = valueMarker7.getLabelPaint();
        valueMarker1.setPaint(paint8);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        double double13 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker15.getLabelOffset();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        java.awt.Stroke stroke18 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker20.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker20.getStroke();
        java.awt.Paint paint25 = valueMarker20.getOutlinePaint();
        java.awt.Paint paint26 = valueMarker20.getLabelPaint();
        java.awt.Paint paint27 = valueMarker20.getOutlinePaint();
        valueMarker15.setLabelPaint(paint27);
        boolean boolean29 = valueMarker1.equals((java.lang.Object) valueMarker15);
        java.lang.String str30 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint35 = valueMarker34.getPaint();
        java.awt.Paint paint36 = valueMarker34.getLabelPaint();
        valueMarker32.setLabelPaint(paint36);
        boolean boolean38 = valueMarker1.equals((java.lang.Object) valueMarker32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker34", valueMarker7.equals(valueMarker34) ? valueMarker7.hashCode() == valueMarker34.hashCode() : true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint4 = valueMarker3.getPaint();
        java.awt.Paint paint5 = valueMarker3.getPaint();
        valueMarker3.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker3.getLabelTextAnchor();
        java.awt.Font font9 = valueMarker3.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker3.removeChangeListener(markerChangeListener10);
        float float12 = valueMarker3.getAlpha();
        valueMarker3.setLabel("hi!");
        java.awt.Stroke stroke15 = valueMarker3.getStroke();
        java.awt.Paint paint16 = valueMarker3.getLabelPaint();
        valueMarker1.setOutlinePaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        java.awt.Font font22 = valueMarker19.getLabelFont();
        valueMarker19.setValue((double) (short) 0);
        valueMarker19.setValue((double) (byte) 10);
        java.awt.Paint paint27 = valueMarker19.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        java.awt.Paint paint31 = valueMarker29.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker29.getLabelAnchor();
        java.awt.Stroke stroke33 = valueMarker29.getStroke();
        java.awt.Paint paint34 = valueMarker29.getLabelPaint();
        double double35 = valueMarker29.getValue();
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        valueMarker19.setPaint(paint36);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker39.getLabelOffset();
        java.awt.Paint paint41 = valueMarker39.getLabelPaint();
        java.awt.Paint paint42 = valueMarker39.getLabelPaint();
        boolean boolean43 = valueMarker19.equals((java.lang.Object) paint42);
        valueMarker1.setOutlinePaint(paint42);
        java.awt.Stroke stroke45 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint48 = valueMarker47.getPaint();
        java.awt.Paint paint49 = valueMarker47.getPaint();
        valueMarker47.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = valueMarker47.getLabelOffset();
        java.awt.Font font53 = valueMarker47.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent54 = null;
        valueMarker47.notifyListeners(markerChangeEvent54);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType56 = valueMarker47.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener61 = null;
        valueMarker60.addChangeListener(markerChangeListener61);
        java.lang.String str63 = valueMarker60.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = valueMarker60.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType65 = valueMarker60.getLabelOffsetType();
        java.awt.Stroke stroke66 = valueMarker60.getOutlineStroke();
        valueMarker58.setOutlineStroke(stroke66);
        boolean boolean68 = valueMarker47.equals((java.lang.Object) valueMarker58);
        double double69 = valueMarker58.getValue();
        java.awt.Stroke stroke70 = valueMarker58.getStroke();
        valueMarker1.setStroke(stroke70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker39 and valueMarker60", valueMarker39.equals(valueMarker60) ? valueMarker39.hashCode() == valueMarker60.hashCode() : true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker10.getLabelFont();
        double double16 = valueMarker10.getValue();
        java.lang.String str17 = valueMarker10.getLabel();
        java.awt.Stroke stroke18 = valueMarker10.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker10.getLabelOffset();
        java.awt.Paint paint20 = valueMarker10.getLabelPaint();
        valueMarker1.setPaint(paint20);
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint25 = valueMarker24.getLabelPaint();
        valueMarker24.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker30.addChangeListener(markerChangeListener31);
        java.awt.Paint paint33 = valueMarker30.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker37.getLabelAnchor();
        java.awt.Paint paint39 = valueMarker37.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker37.getLabelAnchor();
        java.awt.Stroke stroke41 = valueMarker37.getStroke();
        valueMarker35.setOutlineStroke(stroke41);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint33, stroke41);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint46 = valueMarker45.getPaint();
        java.awt.Paint paint47 = valueMarker45.getPaint();
        valueMarker45.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor50 = valueMarker45.getLabelTextAnchor();
        java.awt.Font font51 = valueMarker45.getLabelFont();
        valueMarker43.setLabelFont(font51);
        valueMarker24.setLabelFont(font51);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker24.removeChangeListener(markerChangeListener54);
        java.lang.String str56 = valueMarker24.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor57 = valueMarker24.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker10 and valueMarker30", valueMarker10.equals(valueMarker30) ? valueMarker10.hashCode() == valueMarker30.hashCode() : true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker4.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker4.getStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        valueMarker1.setLabelPaint(paint12);
        valueMarker1.setValue((double) (short) -1);
        valueMarker1.setValue((double) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.lang.String str21 = valueMarker19.getLabel();
        valueMarker19.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str26 = valueMarker25.getLabel();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        valueMarker19.setOutlinePaint(paint27);
        java.awt.Paint paint29 = valueMarker19.getOutlinePaint();
        valueMarker1.setLabelPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker11 and valueMarker25", valueMarker11.equals(valueMarker25) ? valueMarker11.hashCode() == valueMarker25.hashCode() : true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke9 = valueMarker5.getStroke();
        java.awt.Paint paint10 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker5.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        valueMarker1.setOutlinePaint(paint15);
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        float float26 = valueMarker24.getAlpha();
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        java.awt.Font font29 = valueMarker24.getLabelFont();
        java.awt.Paint paint30 = valueMarker24.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker24.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker34.addChangeListener(markerChangeListener35);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint39 = valueMarker38.getLabelPaint();
        java.awt.Paint paint40 = valueMarker38.getLabelPaint();
        valueMarker34.setOutlinePaint(paint40);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker34.addChangeListener(markerChangeListener42);
        java.awt.Paint paint44 = valueMarker34.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = valueMarker34.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker34.addChangeListener(markerChangeListener46);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker(10.0d);
        java.awt.Paint paint50 = valueMarker49.getPaint();
        valueMarker34.setPaint(paint50);
        valueMarker1.setPaint(paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker49", valueMarker5.equals(valueMarker49) ? valueMarker5.hashCode() == valueMarker49.hashCode() : true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str8 = valueMarker7.getLabel();
        java.awt.Paint paint9 = valueMarker7.getLabelPaint();
        valueMarker1.setOutlinePaint(paint9);
        float float11 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker15.getLabelAnchor();
        java.awt.Paint paint17 = valueMarker15.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker15.getLabelAnchor();
        java.awt.Stroke stroke19 = valueMarker15.getStroke();
        java.awt.Paint paint20 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker22.getLabelFont();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        valueMarker15.setOutlineStroke(stroke26);
        java.lang.String str28 = valueMarker15.getLabel();
        java.awt.Paint paint29 = valueMarker15.getPaint();
        valueMarker1.setLabelPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker22", valueMarker7.equals(valueMarker22) ? valueMarker7.hashCode() == valueMarker22.hashCode() : true);
    }
}

