package org.jfree.chart.plot;

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
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setPaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        java.lang.String str18 = valueMarker15.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker15.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker15.notifyListeners(markerChangeEvent20);
        boolean boolean22 = valueMarker13.equals((java.lang.Object) markerChangeEvent20);
        java.lang.Class<?> wildcardClass23 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setAlpha((float) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker12.getLabelOffset();
        java.awt.Paint paint14 = valueMarker12.getLabelPaint();
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker12.getPaint();
        boolean boolean17 = valueMarker1.equals((java.lang.Object) paint16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker3.removeChangeListener(markerChangeListener18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker3.getLabelTextAnchor();
        java.awt.Font font21 = valueMarker3.getLabelFont();
        valueMarker1.setLabelFont(font21);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        valueMarker1.setValue((double) 1L);
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        java.awt.Font font13 = valueMarker10.getLabelFont();
        valueMarker10.setValue((double) (short) 0);
        java.awt.Paint paint16 = valueMarker10.getPaint();
        valueMarker1.setPaint(paint16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        valueMarker1.setValue(1.0d);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker12.getLabelOffsetType();
        double double14 = valueMarker12.getValue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        java.awt.Paint paint11 = valueMarker9.getPaint();
        valueMarker9.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker9.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor17);
        valueMarker9.setValue((double) '#');
        java.awt.Stroke stroke21 = valueMarker9.getOutlineStroke();
        java.awt.Paint paint22 = valueMarker9.getPaint();
        valueMarker1.setOutlinePaint(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke9 = null;
        valueMarker1.setOutlineStroke(stroke9);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker7.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker7.getLabelPaint();
        double double11 = valueMarker7.getValue();
        java.awt.Paint paint12 = valueMarker7.getLabelPaint();
        valueMarker1.setPaint(paint12);
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        float float6 = valueMarker1.getAlpha();
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
        java.awt.Stroke stroke20 = valueMarker8.getStroke();
        valueMarker1.setStroke(stroke20);
        float float22 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker2.getLabelOffset();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker2.getLabelOffset();
        java.awt.Paint paint6 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint9 = valueMarker8.getPaint();
        java.awt.Paint paint10 = valueMarker8.getPaint();
        valueMarker8.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker8.getLabelOffset();
        java.awt.Font font14 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker8.notifyListeners(markerChangeEvent15);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker8.getLabelOffsetType();
        valueMarker8.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker21.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker24.getLabelAnchor();
        java.awt.Paint paint26 = valueMarker24.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker24.getLabelAnchor();
        java.awt.Stroke stroke28 = valueMarker24.getStroke();
        valueMarker21.setOutlineStroke(stroke28);
        java.awt.Font font30 = valueMarker21.getLabelFont();
        boolean boolean31 = valueMarker8.equals((java.lang.Object) font30);
        java.awt.Paint paint32 = valueMarker8.getPaint();
        java.awt.Stroke stroke33 = valueMarker8.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 0.8f, paint6, stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 100.0f);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.awt.Paint paint27 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke29 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha(0.8f);
        java.lang.String str9 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 0.8f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Font font18 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker3.addChangeListener(markerChangeListener4);
        java.lang.String str6 = valueMarker3.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker3.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        java.awt.Stroke stroke9 = valueMarker3.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint14 = valueMarker13.getLabelPaint();
        valueMarker1.setOutlinePaint(paint14);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (-1));
        java.awt.Paint paint20 = valueMarker19.getPaint();
        valueMarker1.setLabelPaint(paint20);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        float float4 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        java.awt.Paint paint4 = valueMarker2.getPaint();
        valueMarker2.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker2.getLabelTextAnchor();
        java.awt.Font font8 = valueMarker2.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker2.removeChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker2.getLabelFont();
        java.awt.Paint paint12 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Paint paint16 = valueMarker14.getPaint();
        valueMarker14.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker14.getLabelTextAnchor();
        java.awt.Font font20 = valueMarker14.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker14.removeChangeListener(markerChangeListener21);
        java.awt.Font font23 = valueMarker14.getLabelFont();
        java.awt.Stroke stroke24 = valueMarker14.getOutlineStroke();
        java.lang.String str25 = valueMarker14.getLabel();
        java.awt.Paint paint26 = valueMarker14.getPaint();
        java.awt.Stroke stroke27 = valueMarker14.getStroke();
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
        valueMarker43.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker43.getLabelOffset();
        float float47 = valueMarker43.getAlpha();
        valueMarker43.setLabel("hi!");
        java.awt.Paint paint50 = valueMarker43.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = valueMarker52.getLabelOffset();
        float float54 = valueMarker52.getAlpha();
        java.awt.Paint paint55 = valueMarker52.getOutlinePaint();
        java.awt.Stroke stroke56 = valueMarker52.getOutlineStroke();
        java.awt.Font font57 = valueMarker52.getLabelFont();
        java.awt.Paint paint58 = valueMarker52.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker(10.0d);
        java.awt.Stroke stroke61 = valueMarker60.getOutlineStroke();
        valueMarker52.setOutlineStroke(stroke61);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint12, stroke27, paint50, stroke61, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleAnchor40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(rectangleInsets53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.8f + "'", float54 == 0.8f);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(font57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(stroke61);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        valueMarker1.setValue((double) 1.0f);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker11.getLabelOffset();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        java.awt.Paint paint14 = valueMarker11.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker16.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker16.getLabelFont();
        double double22 = valueMarker16.getValue();
        java.lang.String str23 = valueMarker16.getLabel();
        java.awt.Stroke stroke24 = valueMarker16.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker16.getLabelOffset();
        valueMarker16.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker16.getLabelTextAnchor();
        valueMarker11.setLabelTextAnchor(textAnchor28);
        java.awt.Stroke stroke30 = valueMarker11.getOutlineStroke();
        java.awt.Stroke stroke31 = valueMarker11.getOutlineStroke();
        valueMarker1.setStroke(stroke31);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker20.addChangeListener(markerChangeListener21);
        java.awt.Font font23 = valueMarker20.getLabelFont();
        valueMarker20.setValue((double) (short) 0);
        valueMarker20.setValue((double) (byte) 10);
        valueMarker20.setAlpha((float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker20.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker20.getLabelAnchor();
        java.lang.Class<?> wildcardClass32 = valueMarker20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray33 = valueMarker1.getListeners((java.lang.Class) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 0L);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint7 = valueMarker6.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 0, paint7, stroke13);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker20.getLabelAnchor();
        java.awt.Paint paint22 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker20.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker20.getStroke();
        java.awt.Paint paint25 = valueMarker20.getLabelPaint();
        double double26 = valueMarker20.getValue();
        java.awt.Stroke stroke27 = null;
        valueMarker20.setOutlineStroke(stroke27);
        java.awt.Paint paint29 = valueMarker20.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker20.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint35 = valueMarker34.getLabelPaint();
        valueMarker32.setPaint(paint35);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker32.removeChangeListener(markerChangeListener37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker40.addChangeListener(markerChangeListener41);
        java.lang.String str43 = valueMarker40.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = valueMarker40.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType45 = valueMarker40.getLabelOffsetType();
        java.awt.Stroke stroke46 = valueMarker40.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType47 = valueMarker40.getLabelOffsetType();
        valueMarker32.setLabelOffsetType(lengthAdjustmentType47);
        float float49 = valueMarker32.getAlpha();
        java.awt.Paint paint50 = valueMarker32.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = valueMarker54.getLabelAnchor();
        java.awt.Paint paint56 = valueMarker54.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor57 = valueMarker54.getLabelAnchor();
        java.awt.Stroke stroke58 = valueMarker54.getStroke();
        valueMarker52.setOutlineStroke(stroke58);
        java.awt.Stroke stroke60 = valueMarker52.getStroke();
        valueMarker32.setOutlineStroke(stroke60);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 0L, paint3, stroke18, paint30, stroke60, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(lengthAdjustmentType45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(lengthAdjustmentType47);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.8f + "'", float49 == 0.8f);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(rectangleAnchor55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(rectangleAnchor57);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNotNull(stroke60);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker5.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        double double9 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        float float17 = valueMarker1.getAlpha();
        java.lang.Class<?> wildcardClass18 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        double double3 = valueMarker1.getValue();
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor5);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker5.addChangeListener(markerChangeListener6);
        java.lang.String str8 = valueMarker5.getLabel();
        java.awt.Paint paint9 = valueMarker5.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        java.awt.Paint paint13 = valueMarker11.getPaint();
        valueMarker11.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker11.getLabelTextAnchor();
        valueMarker5.setLabelTextAnchor(textAnchor16);
        valueMarker2.setLabelTextAnchor(textAnchor16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker2.removeChangeListener(markerChangeListener19);
        java.awt.Paint paint21 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker23.getLabelOffset();
        java.awt.Paint paint25 = valueMarker23.getPaint();
        java.awt.Stroke stroke26 = valueMarker23.getStroke();
        double double27 = valueMarker23.getValue();
        java.awt.Paint paint28 = valueMarker23.getOutlinePaint();
        valueMarker23.setLabel("hi!");
        java.awt.Stroke stroke31 = valueMarker23.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker33.addChangeListener(markerChangeListener34);
        java.awt.Font font36 = valueMarker33.getLabelFont();
        valueMarker33.setValue((double) (short) 0);
        valueMarker33.setValue((double) (byte) 10);
        java.awt.Stroke stroke41 = valueMarker33.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint44 = valueMarker43.getPaint();
        java.awt.Paint paint45 = valueMarker43.getPaint();
        valueMarker43.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor48 = valueMarker43.getLabelTextAnchor();
        java.awt.Font font49 = valueMarker43.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener50 = null;
        valueMarker43.removeChangeListener(markerChangeListener50);
        valueMarker43.setValue((double) (short) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType54 = valueMarker43.getLabelOffsetType();
        valueMarker43.setValue((double) '#');
        java.awt.Paint paint57 = valueMarker43.getPaint();
        valueMarker33.setLabelPaint(paint57);
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener61 = null;
        valueMarker60.addChangeListener(markerChangeListener61);
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint65 = valueMarker64.getLabelPaint();
        java.awt.Paint paint66 = valueMarker64.getLabelPaint();
        valueMarker60.setOutlinePaint(paint66);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener68 = null;
        valueMarker60.addChangeListener(markerChangeListener68);
        java.awt.Paint paint70 = valueMarker60.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = valueMarker60.getLabelOffset();
        java.awt.Stroke stroke72 = valueMarker60.getOutlineStroke();
        valueMarker60.setAlpha((float) (short) 1);
        java.awt.Stroke stroke75 = valueMarker60.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker77 = new org.jfree.chart.plot.ValueMarker(1.0d, paint21, stroke31, paint57, stroke75, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(textAnchor48);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(lengthAdjustmentType54);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(rectangleInsets71);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertNotNull(stroke75);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker3.getLabelAnchor();
        java.awt.Paint paint5 = valueMarker3.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker3.getLabelAnchor();
        java.awt.Stroke stroke7 = valueMarker3.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        java.lang.String str9 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker14.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker11.setOutlineStroke(stroke18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker11.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor20);
        valueMarker1.setValue((double) 'a');
        valueMarker1.setValue(0.0d);
        java.awt.Stroke stroke26 = valueMarker1.getStroke();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker4.addChangeListener(markerChangeListener5);
        java.awt.Font font7 = valueMarker4.getLabelFont();
        valueMarker4.setValue((double) (short) 0);
        valueMarker4.setValue((double) (byte) 10);
        java.awt.Stroke stroke12 = valueMarker4.getStroke();
        valueMarker1.setStroke(stroke12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker17.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        java.lang.String str22 = valueMarker20.getLabel();
        valueMarker20.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint27 = valueMarker26.getLabelPaint();
        valueMarker20.setPaint(paint27);
        valueMarker17.setOutlinePaint(paint27);
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker17.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker17.getLabelOffset();
        java.lang.Class<?> wildcardClass32 = rectangleInsets31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray33 = valueMarker1.getListeners((java.lang.Class) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.util.RectangleInsets; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.util.RectangleInsets; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker(0.0d);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str6 = valueMarker5.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker8.addChangeListener(markerChangeListener9);
        java.awt.Font font11 = valueMarker8.getLabelFont();
        valueMarker8.setValue((double) (short) 0);
        valueMarker8.setValue((double) (byte) 10);
        java.awt.Stroke stroke16 = valueMarker8.getStroke();
        valueMarker5.setStroke(stroke16);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker(1.0d, paint3, stroke16);
        java.awt.Stroke stroke19 = valueMarker18.getStroke();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        float float9 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker11.getLabelOffset();
        java.awt.Paint paint13 = valueMarker11.getLabelPaint();
        java.awt.Paint paint14 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint15 = valueMarker11.getLabelPaint();
        valueMarker1.setOutlinePaint(paint15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        java.awt.Paint paint24 = valueMarker22.getPaint();
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker22.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker22.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker22.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor29);
        valueMarker1.setValue((double) (-1));
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(textAnchor29);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        java.lang.String str4 = valueMarker1.getLabel();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker7.setPaint(paint10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker7.removeChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        java.lang.String str18 = valueMarker15.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker15.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        java.awt.Stroke stroke21 = valueMarker15.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker15.getLabelOffsetType();
        valueMarker7.setLabelOffsetType(lengthAdjustmentType22);
        float float24 = valueMarker7.getAlpha();
        java.awt.Paint paint25 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint25);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.awt.Font font14 = valueMarker11.getLabelFont();
        valueMarker11.setValue((double) (short) 0);
        valueMarker11.setAlpha((float) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker20.getLabelOffset();
        java.awt.Paint paint22 = valueMarker20.getPaint();
        valueMarker11.setLabelPaint(paint22);
        java.awt.Paint paint24 = valueMarker11.getLabelPaint();
        valueMarker1.setOutlinePaint(paint24);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker27.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker30.getLabelAnchor();
        java.awt.Paint paint32 = valueMarker30.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker30.getLabelAnchor();
        java.awt.Stroke stroke34 = valueMarker30.getStroke();
        valueMarker27.setOutlineStroke(stroke34);
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker27.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker27.getLabelAnchor();
        boolean boolean38 = valueMarker1.equals((java.lang.Object) valueMarker27);
        valueMarker27.setValue((-1.0d));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType41 = valueMarker27.getLabelOffsetType();
        java.awt.Paint paint42 = valueMarker27.getOutlinePaint();
        java.awt.Font font43 = valueMarker27.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(textAnchor36);
        org.junit.Assert.assertNotNull(rectangleAnchor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(font43);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker3.getLabelAnchor();
        java.awt.Paint paint5 = valueMarker3.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker3.getLabelAnchor();
        java.awt.Stroke stroke7 = valueMarker3.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        boolean boolean12 = valueMarker1.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setAlpha(0.0f);
        java.awt.Paint paint16 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker5.addChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker5.addChangeListener(markerChangeListener8);
        java.awt.Font font10 = valueMarker5.getLabelFont();
        double double11 = valueMarker5.getValue();
        java.lang.String str12 = valueMarker5.getLabel();
        java.awt.Stroke stroke13 = valueMarker5.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker5.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets14);
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(textAnchor16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.lang.String str7 = valueMarker1.getLabel();
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
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker31.getLabelOffset();
        java.awt.Paint paint33 = valueMarker31.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker31.getLabelOffset();
        valueMarker10.setLabelOffset(rectangleInsets34);
        valueMarker1.setLabelOffset(rectangleInsets34);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.awt.Paint paint15 = valueMarker14.getPaint();
        float float16 = valueMarker14.getAlpha();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.awt.Paint paint34 = valueMarker1.getPaint();
        java.awt.Paint paint35 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        double double7 = valueMarker1.getValue();
        java.awt.Stroke stroke8 = null;
        valueMarker1.setOutlineStroke(stroke8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        double double7 = valueMarker1.getValue();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker15.getLabelAnchor();
        java.awt.Paint paint17 = valueMarker15.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker15.getLabelAnchor();
        java.awt.Stroke stroke19 = valueMarker15.getStroke();
        valueMarker13.setOutlineStroke(stroke19);
        java.awt.Stroke stroke21 = valueMarker13.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker13.getLabelOffsetType();
        float float23 = valueMarker13.getAlpha();
        java.awt.Paint paint24 = valueMarker13.getOutlinePaint();
        java.awt.Paint paint25 = valueMarker13.getLabelPaint();
        valueMarker1.setPaint(paint25);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        boolean boolean6 = valueMarker1.equals((java.lang.Object) 0.0f);
        java.lang.String str7 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        double double5 = valueMarker1.getValue();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(textAnchor7);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        valueMarker1.setAlpha((float) (short) 0);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker8.getLabelTextAnchor();
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
        valueMarker8.setLabelOffset(rectangleInsets20);
        valueMarker1.setLabelOffset(rectangleInsets20);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        valueMarker1.setAlpha((float) (short) 0);
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
        valueMarker1.setOutlinePaint(paint17);
        float float29 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke32 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        float float19 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) ' ');
        float float22 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        valueMarker15.setValue((double) 1L);
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker15.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor22);
        java.lang.Object obj24 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        float float5 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) 100.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.lang.String str7 = valueMarker1.getLabel();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        java.awt.Font font13 = valueMarker10.getLabelFont();
        valueMarker10.setValue((double) (short) 0);
        valueMarker10.setValue((double) (byte) 10);
        valueMarker10.setAlpha((float) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker10.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker10.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor21);
        valueMarker1.setValue((double) (-1L));
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        float float14 = valueMarker1.getAlpha();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        java.lang.Class<?> wildcardClass16 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        valueMarker25.setLabel("");
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha((float) (byte) 0);
        java.lang.Object obj8 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        valueMarker1.setValue((double) 1.0f);
        valueMarker1.setLabel("hi!");
        double double10 = valueMarker1.getValue();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha(0.8f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        double double12 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.lang.String str4 = valueMarker1.getLabel();
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.addChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        java.awt.Font font18 = valueMarker13.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker13.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker13.getLabelAnchor();
        java.lang.Class<?> wildcardClass21 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray22 = valueMarker1.getListeners((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        double double26 = valueMarker1.getValue();
        java.awt.Font font27 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker15.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker15.getLabelOffset();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.lang.String str12 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.lang.String str3 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        valueMarker1.setValue((double) 1.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        float float9 = valueMarker1.getAlpha();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        valueMarker10.setValue((double) 0.8f);
        java.lang.String str16 = valueMarker10.getLabel();
        double double17 = valueMarker10.getValue();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.800000011920929d + "'", double17 == 0.800000011920929d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker2.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker2.getStroke();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        java.lang.String str9 = valueMarker2.getLabel();
        java.awt.Paint paint10 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        float float13 = valueMarker12.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        java.awt.Paint paint17 = valueMarker15.getPaint();
        valueMarker15.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker15.getLabelOffset();
        java.awt.Font font21 = valueMarker15.getLabelFont();
        java.lang.String str22 = valueMarker15.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker24.addChangeListener(markerChangeListener25);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker24.addChangeListener(markerChangeListener27);
        valueMarker24.setValue((double) 1L);
        java.awt.Font font31 = valueMarker24.getLabelFont();
        java.awt.Stroke stroke32 = valueMarker24.getStroke();
        java.awt.Stroke stroke33 = valueMarker24.getStroke();
        valueMarker15.setOutlineStroke(stroke33);
        valueMarker12.setOutlineStroke(stroke33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) '#', paint10, stroke33);
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker36.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(textAnchor37);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setValue((double) (short) 0);
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker10.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker10.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker10.getStroke();
        valueMarker8.setOutlineStroke(stroke14);
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker19.getLabelOffset();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker19.getLabelPaint();
        java.awt.Stroke stroke24 = valueMarker19.getStroke();
        java.awt.Font font25 = valueMarker19.getLabelFont();
        java.awt.Paint paint26 = valueMarker19.getPaint();
        valueMarker1.setLabelPaint(paint26);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker1.addChangeListener(markerChangeListener28);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker6.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker9.getLabelAnchor();
        java.awt.Stroke stroke13 = valueMarker9.getStroke();
        valueMarker6.setOutlineStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        valueMarker6.setLabelPaint(paint17);
        valueMarker6.setValue((double) (-1));
        java.awt.Stroke stroke21 = valueMarker6.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker6.notifyListeners(markerChangeEvent22);
        java.awt.Paint paint24 = valueMarker6.getOutlinePaint();
        valueMarker1.setLabelPaint(paint24);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker9.addChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint14 = valueMarker13.getLabelPaint();
        java.awt.Paint paint15 = valueMarker13.getLabelPaint();
        valueMarker9.setOutlinePaint(paint15);
        java.awt.Paint paint17 = valueMarker9.getOutlinePaint();
        java.awt.Stroke stroke18 = valueMarker9.getOutlineStroke();
        boolean boolean19 = valueMarker1.equals((java.lang.Object) valueMarker9);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint22 = valueMarker21.getLabelPaint();
        java.awt.Paint paint23 = valueMarker21.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker25.getLabelAnchor();
        java.awt.Paint paint27 = valueMarker25.getLabelPaint();
        valueMarker21.setPaint(paint27);
        double double29 = valueMarker21.getValue();
        java.awt.Paint paint30 = valueMarker21.getPaint();
        java.awt.Stroke stroke31 = valueMarker21.getOutlineStroke();
        boolean boolean32 = valueMarker9.equals((java.lang.Object) valueMarker21);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) -1);
        float float9 = valueMarker8.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker8.addChangeListener(markerChangeListener10);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker8.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) (byte) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setValue((double) (short) 0);
        java.awt.Paint paint21 = null;
        valueMarker18.setOutlinePaint(paint21);
        java.awt.Paint paint23 = valueMarker18.getLabelPaint();
        java.awt.Paint paint24 = valueMarker18.getOutlinePaint();
        java.awt.Stroke stroke25 = valueMarker18.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker18.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor26);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        java.awt.Paint paint25 = valueMarker23.getPaint();
        valueMarker23.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker23.getLabelOffset();
        java.awt.Font font29 = valueMarker23.getLabelFont();
        java.lang.String str30 = valueMarker23.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker32.addChangeListener(markerChangeListener33);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker32.addChangeListener(markerChangeListener35);
        valueMarker32.setValue((double) 1L);
        java.awt.Font font39 = valueMarker32.getLabelFont();
        java.awt.Stroke stroke40 = valueMarker32.getStroke();
        java.awt.Stroke stroke41 = valueMarker32.getStroke();
        valueMarker23.setOutlineStroke(stroke41);
        valueMarker1.setStroke(stroke41);
        java.lang.String str44 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        double double7 = valueMarker1.getValue();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker12.addChangeListener(markerChangeListener13);
        java.awt.Paint paint15 = valueMarker12.getLabelPaint();
        java.awt.Stroke stroke16 = valueMarker12.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker12.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        java.awt.Paint paint21 = valueMarker19.getPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker19.getLabelOffset();
        valueMarker12.setLabelOffset(rectangleInsets24);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker12.getLabelOffsetType();
        java.awt.Paint paint27 = valueMarker12.getLabelPaint();
        valueMarker1.setOutlinePaint(paint27);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker5.addChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker5.addChangeListener(markerChangeListener8);
        java.awt.Font font10 = valueMarker5.getLabelFont();
        double double11 = valueMarker5.getValue();
        java.lang.String str12 = valueMarker5.getLabel();
        java.awt.Stroke stroke13 = valueMarker5.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker5.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets14);
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        float float3 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        java.awt.Paint paint7 = valueMarker5.getPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker5.getLabelTextAnchor();
        java.awt.Font font11 = valueMarker5.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker5.removeChangeListener(markerChangeListener12);
        valueMarker5.setAlpha((float) (short) 0);
        java.awt.Paint paint16 = valueMarker5.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor17);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8f + "'", float3 == 0.8f);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(textAnchor17);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.String str3 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        valueMarker1.setAlpha((float) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker10.addChangeListener(markerChangeListener11);
        java.awt.Font font13 = valueMarker10.getLabelFont();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.lang.Object obj21 = valueMarker1.clone();
        valueMarker1.setValue((double) (-1.0f));
        java.awt.Paint paint24 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker2.getLabelOffset();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        java.awt.Paint paint5 = valueMarker2.getLabelPaint();
        valueMarker2.setAlpha((float) (short) 1);
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint12 = valueMarker11.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.lang.String str16 = valueMarker14.getLabel();
        valueMarker14.setValue((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        valueMarker14.setPaint(paint21);
        valueMarker11.setOutlinePaint(paint21);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setValue((double) (short) 0);
        java.awt.Stroke stroke28 = valueMarker25.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint21, stroke28);
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
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker45.addChangeListener(markerChangeListener46);
        java.awt.Font font48 = valueMarker45.getLabelFont();
        valueMarker45.setValue((double) (short) 0);
        valueMarker45.setValue((double) (byte) 10);
        java.awt.Stroke stroke53 = valueMarker45.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = valueMarker55.getLabelOffset();
        java.awt.Paint paint57 = valueMarker55.getLabelPaint();
        java.awt.Paint paint58 = valueMarker55.getOutlinePaint();
        java.awt.Paint paint59 = valueMarker55.getLabelPaint();
        java.awt.Stroke stroke60 = valueMarker55.getStroke();
        valueMarker45.setOutlineStroke(stroke60);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 100.0f, paint8, stroke28, paint42, stroke60, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(rectangleInsets56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(stroke60);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setValue((double) (short) 0);
        java.awt.Paint paint19 = null;
        valueMarker16.setOutlinePaint(paint19);
        java.awt.Paint paint21 = valueMarker16.getOutlinePaint();
        java.lang.String str22 = valueMarker16.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Paint paint26 = valueMarker25.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker28.getLabelAnchor();
        java.awt.Stroke stroke32 = valueMarker28.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 0, paint26, stroke32);
        valueMarker16.setLabelPaint(paint26);
        valueMarker3.setOutlinePaint(paint26);
        java.awt.Paint paint36 = valueMarker3.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker3.getLabelOffset();
        boolean boolean38 = valueMarker1.equals((java.lang.Object) valueMarker3);
        float float39 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        java.awt.Font font4 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (short) 0);
        valueMarker1.setValue((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        double double12 = valueMarker1.getValue();
        valueMarker1.setAlpha(0.8f);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }
}

