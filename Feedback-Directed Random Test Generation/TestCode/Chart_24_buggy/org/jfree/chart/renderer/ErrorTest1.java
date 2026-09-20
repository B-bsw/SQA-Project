package org.jfree.chart.renderer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) "hi!");
        java.lang.Object obj7 = grayPaintScale4.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale4", grayPaintScale2.equals(grayPaintScale4) ? grayPaintScale2.hashCode() == grayPaintScale4.hashCode() : true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        double double21 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass25 = grayPaintScale24.getClass();
        boolean boolean26 = grayPaintScale14.equals((java.lang.Object) grayPaintScale24);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double28 = grayPaintScale14.getUpperBound();
        boolean boolean30 = grayPaintScale14.equals((java.lang.Object) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double34 = grayPaintScale33.getLowerBound();
        boolean boolean36 = grayPaintScale33.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint38 = grayPaintScale33.getPaint((double) (short) 0);
        boolean boolean40 = grayPaintScale33.equals((java.lang.Object) 0.0d);
        double double41 = grayPaintScale33.getLowerBound();
        double double42 = grayPaintScale33.getLowerBound();
        double double43 = grayPaintScale33.getLowerBound();
        double double44 = grayPaintScale33.getLowerBound();
        double double45 = grayPaintScale33.getUpperBound();
        boolean boolean46 = grayPaintScale14.equals((java.lang.Object) double45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale33", grayPaintScale6.equals(grayPaintScale33) ? grayPaintScale6.hashCode() == grayPaintScale33.hashCode() : true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass19 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        double double20 = grayPaintScale10.getLowerBound();
        double double21 = grayPaintScale10.getUpperBound();
        java.lang.Object obj22 = grayPaintScale10.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double26 = grayPaintScale25.getLowerBound();
        boolean boolean28 = grayPaintScale25.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint30 = grayPaintScale25.getPaint((double) (short) 0);
        java.awt.Paint paint32 = grayPaintScale25.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean35 = grayPaintScale33.equals((java.lang.Object) "hi!");
        double double36 = grayPaintScale33.getLowerBound();
        java.awt.Paint paint38 = grayPaintScale33.getPaint((double) 0);
        boolean boolean39 = grayPaintScale25.equals((java.lang.Object) grayPaintScale33);
        java.awt.Paint paint41 = grayPaintScale33.getPaint((double) (byte) 1);
        double double42 = grayPaintScale33.getLowerBound();
        java.awt.Paint paint44 = grayPaintScale33.getPaint(0.0d);
        double double45 = grayPaintScale33.getLowerBound();
        boolean boolean46 = grayPaintScale10.equals((java.lang.Object) grayPaintScale33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale25", grayPaintScale2.equals(grayPaintScale25) ? grayPaintScale2.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) 0.0d);
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint(1.0d);
        boolean boolean18 = grayPaintScale6.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint20 = grayPaintScale6.getPaint((double) (byte) 0);
        double double21 = grayPaintScale6.getLowerBound();
        double double22 = grayPaintScale6.getLowerBound();
        double double23 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        double double12 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean18 = grayPaintScale15.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (short) 0);
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) "hi!");
        double double26 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) 0);
        boolean boolean29 = grayPaintScale15.equals((java.lang.Object) grayPaintScale23);
        java.awt.Paint paint31 = grayPaintScale23.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean35 = grayPaintScale23.equals((java.lang.Object) '#');
        boolean boolean36 = grayPaintScale9.equals((java.lang.Object) grayPaintScale23);
        java.awt.Paint paint38 = grayPaintScale9.getPaint((double) (-1.0f));
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        double double20 = grayPaintScale10.getLowerBound();
        double double21 = grayPaintScale10.getUpperBound();
        double double22 = grayPaintScale10.getLowerBound();
        java.lang.Object obj23 = grayPaintScale10.clone();
        java.lang.Object obj24 = grayPaintScale10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj23", grayPaintScale10.equals(obj23) ? grayPaintScale10.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 0);
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) grayPaintScale13);
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) 10.0f);
        double double22 = grayPaintScale13.getLowerBound();
        double double23 = grayPaintScale13.getLowerBound();
        double double24 = grayPaintScale13.getUpperBound();
        double double25 = grayPaintScale13.getLowerBound();
        double double26 = grayPaintScale13.getUpperBound();
        double double27 = grayPaintScale13.getLowerBound();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) "hi!");
        double double32 = grayPaintScale29.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean36 = grayPaintScale29.equals((java.lang.Object) 0.0d);
        java.lang.Object obj37 = grayPaintScale29.clone();
        boolean boolean38 = grayPaintScale2.equals((java.lang.Object) grayPaintScale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale35", grayPaintScale5.equals(grayPaintScale35) ? grayPaintScale5.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 1.0f);
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) 0);
        double double20 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) 10L);
        boolean boolean23 = grayPaintScale10.equals((java.lang.Object) grayPaintScale17);
        java.lang.Object obj24 = grayPaintScale17.clone();
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale10", grayPaintScale0.equals(grayPaintScale10) ? grayPaintScale0.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        double double12 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean16 = grayPaintScale7.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass17 = grayPaintScale7.getClass();
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) 1L);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        java.awt.Paint paint20 = grayPaintScale8.getPaint((double) (-1L));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 35.0d);
        java.lang.Object obj24 = grayPaintScale23.clone();
        boolean boolean25 = grayPaintScale8.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale23 and obj24", grayPaintScale23.equals(obj24) ? grayPaintScale23.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale3.equals(obj11);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double14 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale3.getPaint((double) 0L);
        double double17 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double21 = grayPaintScale20.getLowerBound();
        boolean boolean23 = grayPaintScale20.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) (short) 0);
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) "hi!");
        double double31 = grayPaintScale28.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) 0);
        boolean boolean34 = grayPaintScale20.equals((java.lang.Object) grayPaintScale28);
        boolean boolean36 = grayPaintScale20.equals((java.lang.Object) (byte) 1);
        double double37 = grayPaintScale20.getLowerBound();
        double double38 = grayPaintScale20.getLowerBound();
        java.lang.Object obj39 = grayPaintScale20.clone();
        boolean boolean40 = grayPaintScale3.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale28", grayPaintScale3.equals(grayPaintScale28) ? grayPaintScale3.hashCode() == grayPaintScale28.hashCode() : true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 10L);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass18 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getLowerBound();
        double double6 = grayPaintScale4.getUpperBound();
        double double7 = grayPaintScale4.getLowerBound();
        double double8 = grayPaintScale4.getLowerBound();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) double8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj10 = grayPaintScale3.clone();
        double double11 = grayPaintScale3.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj10", grayPaintScale3.equals(obj10) ? grayPaintScale3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean20 = grayPaintScale13.equals((java.lang.Object) 0.0d);
        double double21 = grayPaintScale13.getUpperBound();
        double double22 = grayPaintScale13.getLowerBound();
        double double23 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale13.getPaint(0.0d);
        java.lang.Object obj26 = null;
        boolean boolean27 = grayPaintScale13.equals(obj26);
        java.awt.Paint paint29 = grayPaintScale13.getPaint((double) 1L);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale19", grayPaintScale2.equals(grayPaintScale19) ? grayPaintScale2.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) 0.0d);
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint(1.0d);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.awt.Paint paint20 = grayPaintScale7.getPaint((double) 0L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) 1.0f);
        double double24 = grayPaintScale21.getLowerBound();
        java.lang.Class<?> wildcardClass25 = grayPaintScale21.getClass();
        boolean boolean26 = grayPaintScale7.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale21", grayPaintScale7.equals(grayPaintScale21) ? grayPaintScale7.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) paint15);
        double double17 = grayPaintScale9.getLowerBound();
        boolean boolean19 = grayPaintScale9.equals((java.lang.Object) 100.0f);
        double double20 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean24 = grayPaintScale9.equals((java.lang.Object) 0);
        java.awt.Paint paint26 = grayPaintScale9.getPaint((double) (short) 0);
        java.lang.Object obj27 = grayPaintScale9.clone();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj27", grayPaintScale9.equals(obj27) ? grayPaintScale9.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) 0.0f);
        double double10 = grayPaintScale0.getLowerBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale14.getPaint(0.0d);
        java.awt.Paint paint20 = grayPaintScale14.getPaint((double) (short) 1);
        java.lang.Object obj21 = grayPaintScale14.clone();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0.0f);
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        double double14 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint(0.0d);
        boolean boolean17 = grayPaintScale6.equals((java.lang.Object) grayPaintScale13);
        double double18 = grayPaintScale13.getUpperBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) double18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass11 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.awt.Paint paint33 = grayPaintScale2.getPaint((double) 10);
        double double34 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj37 = grayPaintScale2.clone();
        double double38 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj37", grayPaintScale2.equals(obj37) ? grayPaintScale2.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) (short) 1);
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        java.lang.Object obj20 = grayPaintScale10.clone();
        double double21 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj20", grayPaintScale10.equals(obj20) ? grayPaintScale10.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = grayPaintScale0.clone();
        double double7 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean34 = grayPaintScale32.equals((java.lang.Object) "hi!");
        java.awt.Paint paint36 = grayPaintScale32.getPaint((double) 1);
        double double37 = grayPaintScale32.getUpperBound();
        double double38 = grayPaintScale32.getLowerBound();
        double double39 = grayPaintScale32.getLowerBound();
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale21 and grayPaintScale32", grayPaintScale21.equals(grayPaintScale32) ? grayPaintScale21.hashCode() == grayPaintScale32.hashCode() : true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) (short) 0);
        java.lang.Object obj14 = grayPaintScale0.clone();
        double double15 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj14", grayPaintScale0.equals(obj14) ? grayPaintScale0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getLowerBound();
        double double14 = grayPaintScale7.getUpperBound();
        java.lang.Class<?> wildcardClass15 = grayPaintScale7.getClass();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 0.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getLowerBound();
        double double21 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean24 = grayPaintScale22.equals((java.lang.Object) "hi!");
        double double25 = grayPaintScale22.getLowerBound();
        double double26 = grayPaintScale22.getUpperBound();
        double double27 = grayPaintScale22.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double31 = grayPaintScale30.getLowerBound();
        boolean boolean32 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale22", grayPaintScale10.equals(grayPaintScale22) ? grayPaintScale10.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 0);
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) grayPaintScale13);
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) 10.0f);
        double double22 = grayPaintScale13.getLowerBound();
        double double23 = grayPaintScale13.getLowerBound();
        double double24 = grayPaintScale13.getUpperBound();
        double double25 = grayPaintScale13.getLowerBound();
        double double26 = grayPaintScale13.getUpperBound();
        double double27 = grayPaintScale13.getLowerBound();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double32 = grayPaintScale31.getLowerBound();
        boolean boolean34 = grayPaintScale31.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint36 = grayPaintScale31.getPaint((double) (short) 0);
        java.awt.Paint paint38 = grayPaintScale31.getPaint((double) 0.0f);
        java.lang.Object obj39 = grayPaintScale31.clone();
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale31", grayPaintScale5.equals(grayPaintScale31) ? grayPaintScale5.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 100);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint(0.0d);
        java.awt.Paint paint23 = grayPaintScale18.getPaint((double) 1L);
        boolean boolean24 = grayPaintScale10.equals((java.lang.Object) paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale18", grayPaintScale10.equals(grayPaintScale18) ? grayPaintScale10.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        double double12 = grayPaintScale3.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getUpperBound();
        boolean boolean19 = grayPaintScale14.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = grayPaintScale14.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale14", grayPaintScale3.equals(grayPaintScale14) ? grayPaintScale3.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0L);
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj17 = grayPaintScale2.clone();
        double double18 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        double double10 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) "hi!");
        double double14 = grayPaintScale11.getUpperBound();
        double double15 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale11.getPaint((double) (byte) 1);
        java.lang.Object obj18 = grayPaintScale11.clone();
        boolean boolean19 = grayPaintScale0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale11", grayPaintScale0.equals(grayPaintScale11) ? grayPaintScale0.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) "hi!");
        double double7 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale4.getPaint(0.0d);
        double double10 = grayPaintScale4.getUpperBound();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale4.equals(obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale4.equals(obj13);
        java.lang.Object obj15 = grayPaintScale4.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and obj15", grayPaintScale4.equals(obj15) ? grayPaintScale4.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        java.lang.Object obj2 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 1);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj2", grayPaintScale0.equals(obj2) ? grayPaintScale0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) true);
        java.lang.Object obj22 = grayPaintScale2.clone();
        double double23 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj22", grayPaintScale2.equals(obj22) ? grayPaintScale2.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (short) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Object obj11 = null;
        boolean boolean12 = grayPaintScale0.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) 0);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) grayPaintScale17);
        boolean boolean25 = grayPaintScale9.equals((java.lang.Object) (byte) 1);
        double double26 = grayPaintScale9.getLowerBound();
        double double27 = grayPaintScale9.getLowerBound();
        double double28 = grayPaintScale9.getLowerBound();
        double double29 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale9.getPaint((double) (-1.0f));
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 0.0f);
        double double16 = grayPaintScale13.getUpperBound();
        java.lang.Object obj17 = grayPaintScale13.clone();
        boolean boolean18 = grayPaintScale0.equals(obj17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        double double7 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale3.getPaint((double) (byte) 1);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double11 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (byte) 100);
        boolean boolean20 = grayPaintScale14.equals((java.lang.Object) (byte) 100);
        double double21 = grayPaintScale14.getLowerBound();
        double double22 = grayPaintScale14.getUpperBound();
        double double23 = grayPaintScale14.getUpperBound();
        double double24 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) "hi!");
        double double31 = grayPaintScale28.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) 0);
        boolean boolean34 = grayPaintScale27.equals((java.lang.Object) paint33);
        double double35 = grayPaintScale27.getLowerBound();
        boolean boolean37 = grayPaintScale27.equals((java.lang.Object) 100.0f);
        boolean boolean38 = grayPaintScale14.equals((java.lang.Object) grayPaintScale27);
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale27", grayPaintScale2.equals(grayPaintScale27) ? grayPaintScale2.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        double double11 = grayPaintScale0.getLowerBound();
        double double12 = grayPaintScale0.getUpperBound();
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Object obj11 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) (byte) 100);
        java.lang.Object obj11 = grayPaintScale10.clone();
        boolean boolean12 = grayPaintScale0.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj11", grayPaintScale10.equals(obj11) ? grayPaintScale10.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getUpperBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj8 = grayPaintScale2.clone();
        double double9 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) "hi!");
        double double7 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale4.getPaint((double) 0);
        double double10 = grayPaintScale4.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 0);
        double double16 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 10L);
        java.lang.Class<?> wildcardClass19 = paint18.getClass();
        boolean boolean20 = grayPaintScale4.equals((java.lang.Object) wildcardClass19);
        java.awt.Paint paint22 = grayPaintScale4.getPaint(1.0d);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        double double17 = grayPaintScale2.getLowerBound();
        double double18 = grayPaintScale2.getLowerBound();
        double double19 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale2.getPaint(10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean27 = grayPaintScale25.equals((java.lang.Object) "hi!");
        double double28 = grayPaintScale25.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean32 = grayPaintScale25.equals((java.lang.Object) 0.0d);
        double double33 = grayPaintScale25.getUpperBound();
        boolean boolean35 = grayPaintScale25.equals((java.lang.Object) 10.0d);
        double double36 = grayPaintScale25.getUpperBound();
        double double37 = grayPaintScale25.getUpperBound();
        double double38 = grayPaintScale25.getUpperBound();
        boolean boolean39 = grayPaintScale24.equals((java.lang.Object) double38);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        boolean boolean46 = grayPaintScale42.equals((java.lang.Object) '4');
        boolean boolean47 = grayPaintScale24.equals((java.lang.Object) grayPaintScale42);
        java.awt.Paint paint49 = grayPaintScale42.getPaint(0.0d);
        boolean boolean50 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale25", grayPaintScale3.equals(grayPaintScale25) ? grayPaintScale3.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double10 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale9.getPaint((double) (short) -1);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (short) -1);
        java.lang.Object obj15 = grayPaintScale9.clone();
        boolean boolean16 = grayPaintScale0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale9.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = grayPaintScale9.clone();
        boolean boolean16 = grayPaintScale0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        double double6 = grayPaintScale5.getUpperBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale2.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj7", grayPaintScale5.equals(obj7) ? grayPaintScale5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        boolean boolean22 = grayPaintScale14.equals((java.lang.Object) 10.0f);
        double double23 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.lang.Class<?> wildcardClass31 = grayPaintScale30.getClass();
        boolean boolean32 = grayPaintScale14.equals((java.lang.Object) grayPaintScale30);
        java.lang.Class<?> wildcardClass33 = grayPaintScale14.getClass();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) wildcardClass33);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean37 = grayPaintScale35.equals((java.lang.Object) 1.0f);
        double double38 = grayPaintScale35.getUpperBound();
        java.lang.Object obj39 = grayPaintScale35.clone();
        boolean boolean40 = grayPaintScale2.equals((java.lang.Object) grayPaintScale35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and grayPaintScale35", grayPaintScale14.equals(grayPaintScale35) ? grayPaintScale14.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) 1L);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        double double19 = grayPaintScale0.getUpperBound();
        java.lang.Object obj20 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj20", grayPaintScale0.equals(obj20) ? grayPaintScale0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale0.equals(obj7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) 0);
        double double14 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) 10L);
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0L);
        double double19 = grayPaintScale11.getLowerBound();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint28 = grayPaintScale26.getPaint((double) (byte) 100);
        boolean boolean29 = grayPaintScale23.equals((java.lang.Object) (byte) 100);
        double double30 = grayPaintScale23.getLowerBound();
        double double31 = grayPaintScale23.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double35 = grayPaintScale34.getLowerBound();
        boolean boolean37 = grayPaintScale34.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint39 = grayPaintScale34.getPaint((double) (short) 0);
        java.awt.Paint paint41 = grayPaintScale34.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean44 = grayPaintScale42.equals((java.lang.Object) "hi!");
        double double45 = grayPaintScale42.getLowerBound();
        java.awt.Paint paint47 = grayPaintScale42.getPaint((double) 0);
        boolean boolean48 = grayPaintScale34.equals((java.lang.Object) grayPaintScale42);
        boolean boolean50 = grayPaintScale34.equals((java.lang.Object) (byte) 1);
        double double51 = grayPaintScale34.getUpperBound();
        boolean boolean52 = grayPaintScale23.equals((java.lang.Object) double51);
        boolean boolean53 = grayPaintScale11.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale42", grayPaintScale0.equals(grayPaintScale42) ? grayPaintScale0.hashCode() == grayPaintScale42.hashCode() : true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double10 = grayPaintScale9.getLowerBound();
        double double11 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale9.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean21 = grayPaintScale14.equals((java.lang.Object) 0.0d);
        double double22 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale14.getPaint(1.0d);
        boolean boolean25 = grayPaintScale9.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint27 = grayPaintScale14.getPaint((double) 0L);
        double double28 = grayPaintScale14.getUpperBound();
        double double29 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale14.getPaint((double) (byte) 0);
        java.lang.Class<?> wildcardClass32 = grayPaintScale14.getClass();
        boolean boolean33 = grayPaintScale0.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        double double19 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale10.getPaint((double) (short) 0);
        java.awt.Paint paint23 = grayPaintScale10.getPaint((double) 0);
        java.lang.Object obj24 = grayPaintScale10.clone();
        java.lang.Object obj25 = grayPaintScale10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj24", grayPaintScale10.equals(obj24) ? grayPaintScale10.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale0.equals(obj13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 1);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale17", grayPaintScale0.equals(grayPaintScale17) ? grayPaintScale0.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) (short) 0);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) "hi!");
        double double18 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) 0);
        boolean boolean21 = grayPaintScale7.equals((java.lang.Object) grayPaintScale15);
        double double22 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale15.getPaint((double) 0L);
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) 1.0f);
        double double13 = grayPaintScale10.getLowerBound();
        double double14 = grayPaintScale10.getLowerBound();
        double double15 = grayPaintScale10.getLowerBound();
        double double16 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale10.getPaint(1.0d);
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale10", grayPaintScale3.equals(grayPaintScale10) ? grayPaintScale3.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (short) 0);
        boolean boolean15 = grayPaintScale4.equals((java.lang.Object) grayPaintScale9);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        double double22 = grayPaintScale16.getUpperBound();
        double double23 = grayPaintScale16.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double27 = grayPaintScale26.getLowerBound();
        boolean boolean29 = grayPaintScale26.equals((java.lang.Object) (short) -1);
        double double30 = grayPaintScale26.getLowerBound();
        boolean boolean31 = grayPaintScale16.equals((java.lang.Object) grayPaintScale26);
        java.lang.Object obj32 = grayPaintScale16.clone();
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale16", grayPaintScale3.equals(grayPaintScale16) ? grayPaintScale3.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass14 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) 0L);
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 0);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) paint12);
        double double14 = grayPaintScale6.getLowerBound();
        boolean boolean16 = grayPaintScale6.equals((java.lang.Object) 100.0f);
        double double17 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) 0);
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj12 = grayPaintScale0.clone();
        double double13 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        double double7 = grayPaintScale6.getUpperBound();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) double7);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        double double19 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale10.getPaint(0.0d);
        java.lang.Object obj22 = grayPaintScale10.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) "hi!");
        double double26 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) 0);
        double double29 = grayPaintScale23.getUpperBound();
        double double30 = grayPaintScale23.getUpperBound();
        double double31 = grayPaintScale23.getUpperBound();
        java.awt.Paint paint33 = grayPaintScale23.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double37 = grayPaintScale36.getLowerBound();
        double double38 = grayPaintScale36.getLowerBound();
        boolean boolean39 = grayPaintScale23.equals((java.lang.Object) grayPaintScale36);
        double double40 = grayPaintScale36.getLowerBound();
        double double41 = grayPaintScale36.getLowerBound();
        boolean boolean42 = grayPaintScale10.equals((java.lang.Object) grayPaintScale36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj22", grayPaintScale10.equals(obj22) ? grayPaintScale10.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) (byte) 100);
        double double13 = grayPaintScale12.getLowerBound();
        java.lang.Object obj14 = grayPaintScale12.clone();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and obj14", grayPaintScale12.equals(obj14) ? grayPaintScale12.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getLowerBound();
        java.lang.Object obj19 = grayPaintScale10.clone();
        double double20 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj19", grayPaintScale10.equals(obj19) ? grayPaintScale10.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double17 = grayPaintScale16.getLowerBound();
        boolean boolean19 = grayPaintScale16.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) (short) 0);
        java.awt.Paint paint23 = grayPaintScale16.getPaint((double) 0);
        double double24 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale16.getPaint((double) (short) 0);
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale16", grayPaintScale6.equals(grayPaintScale16) ? grayPaintScale6.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) 0.0d);
        double double14 = grayPaintScale6.getUpperBound();
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = grayPaintScale6.equals(obj15);
        double double17 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean21 = grayPaintScale6.equals((java.lang.Object) grayPaintScale20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double25 = grayPaintScale24.getUpperBound();
        boolean boolean26 = grayPaintScale6.equals((java.lang.Object) double25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double30 = grayPaintScale29.getLowerBound();
        boolean boolean31 = grayPaintScale6.equals((java.lang.Object) grayPaintScale29);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double35 = grayPaintScale34.getLowerBound();
        boolean boolean36 = grayPaintScale6.equals((java.lang.Object) grayPaintScale34);
        java.lang.Object obj37 = grayPaintScale34.clone();
        boolean boolean38 = grayPaintScale0.equals(obj37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint3 = grayPaintScale0.getPaint(0.0d);
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.lang.Class<?> wildcardClass8 = grayPaintScale7.getClass();
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) wildcardClass8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        double double13 = grayPaintScale12.getUpperBound();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) double13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) "hi!");
        double double18 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean22 = grayPaintScale15.equals((java.lang.Object) 0.0d);
        double double23 = grayPaintScale15.getUpperBound();
        java.lang.Object obj24 = grayPaintScale15.clone();
        boolean boolean25 = grayPaintScale0.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) grayPaintScale11);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj17 = grayPaintScale11.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj17", grayPaintScale11.equals(obj17) ? grayPaintScale11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(52.0d, 97.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) (short) -1);
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) (short) -1);
        double double14 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double19 = grayPaintScale18.getLowerBound();
        double double20 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale18.getPaint(0.0d);
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double24 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        double double26 = grayPaintScale25.getUpperBound();
        double double27 = grayPaintScale25.getLowerBound();
        double double28 = grayPaintScale25.getUpperBound();
        double double29 = grayPaintScale25.getLowerBound();
        boolean boolean30 = grayPaintScale0.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale25", grayPaintScale0.equals(grayPaintScale25) ? grayPaintScale0.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) -1);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double12 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale11.getPaint((double) (-1L));
        java.lang.Class<?> wildcardClass15 = grayPaintScale11.getClass();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale11", grayPaintScale2.equals(grayPaintScale11) ? grayPaintScale2.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) '4');
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale13.equals((java.lang.Object) paint19);
        double double21 = grayPaintScale13.getLowerBound();
        boolean boolean23 = grayPaintScale13.equals((java.lang.Object) 100.0f);
        double double24 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean28 = grayPaintScale13.equals((java.lang.Object) 0);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale13", grayPaintScale2.equals(grayPaintScale13) ? grayPaintScale2.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) "hi!");
        java.awt.Paint paint9 = grayPaintScale5.getPaint((double) 1);
        double double10 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        double double15 = grayPaintScale5.getUpperBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) double15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) (byte) 100);
        boolean boolean25 = grayPaintScale19.equals((java.lang.Object) (byte) 100);
        double double26 = grayPaintScale19.getLowerBound();
        double double27 = grayPaintScale19.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double31 = grayPaintScale30.getLowerBound();
        boolean boolean33 = grayPaintScale30.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) (short) 0);
        java.awt.Paint paint37 = grayPaintScale30.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean40 = grayPaintScale38.equals((java.lang.Object) "hi!");
        double double41 = grayPaintScale38.getLowerBound();
        java.awt.Paint paint43 = grayPaintScale38.getPaint((double) 0);
        boolean boolean44 = grayPaintScale30.equals((java.lang.Object) grayPaintScale38);
        boolean boolean46 = grayPaintScale30.equals((java.lang.Object) (byte) 1);
        double double47 = grayPaintScale30.getUpperBound();
        boolean boolean48 = grayPaintScale19.equals((java.lang.Object) double47);
        java.awt.Paint paint50 = grayPaintScale19.getPaint((double) 10);
        java.lang.Object obj51 = grayPaintScale19.clone();
        boolean boolean52 = grayPaintScale2.equals(obj51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale30", grayPaintScale2.equals(grayPaintScale30) ? grayPaintScale2.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale0.equals(obj7);
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale0.equals(obj9);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getUpperBound();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) double13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale11", grayPaintScale0.equals(grayPaintScale11) ? grayPaintScale0.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (short) 0);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        java.awt.Paint paint7 = grayPaintScale3.getPaint((double) 1);
        double double8 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean12 = grayPaintScale3.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass13 = grayPaintScale3.getClass();
        boolean boolean14 = grayPaintScale0.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale3", grayPaintScale0.equals(grayPaintScale3) ? grayPaintScale0.hashCode() == grayPaintScale3.hashCode() : true);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (short) 100);
        boolean boolean11 = grayPaintScale5.equals((java.lang.Object) ' ');
        double double12 = grayPaintScale5.getLowerBound();
        double double13 = grayPaintScale5.getUpperBound();
        double double14 = grayPaintScale5.getLowerBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100.0f);
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale18", grayPaintScale10.equals(grayPaintScale18) ? grayPaintScale10.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 35.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) 1L);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        java.awt.Paint paint23 = grayPaintScale19.getPaint((double) 1);
        double double24 = grayPaintScale19.getUpperBound();
        double double25 = grayPaintScale19.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale19.getPaint((double) 1L);
        java.lang.Object obj28 = grayPaintScale19.clone();
        boolean boolean29 = grayPaintScale8.equals(obj28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale19", grayPaintScale0.equals(grayPaintScale19) ? grayPaintScale0.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 10L);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale16.getPaint(0.0d);
        java.awt.Paint paint22 = grayPaintScale16.getPaint((double) (short) 1);
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and grayPaintScale16", grayPaintScale7.equals(grayPaintScale16) ? grayPaintScale7.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) paint15);
        java.lang.Class<?> wildcardClass17 = grayPaintScale9.getClass();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) wildcardClass17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double22 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale21.getPaint((double) (short) -1);
        double double25 = grayPaintScale21.getLowerBound();
        java.lang.Object obj26 = grayPaintScale21.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale21 and obj26", grayPaintScale21.equals(obj26) ? grayPaintScale21.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) 0);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 0.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double19 = grayPaintScale18.getUpperBound();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) double19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double24 = grayPaintScale23.getLowerBound();
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) grayPaintScale23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double29 = grayPaintScale28.getLowerBound();
        boolean boolean30 = grayPaintScale0.equals((java.lang.Object) grayPaintScale28);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale();
        double double32 = grayPaintScale31.getUpperBound();
        double double33 = grayPaintScale31.getUpperBound();
        java.lang.Object obj34 = grayPaintScale31.clone();
        boolean boolean35 = grayPaintScale0.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale31", grayPaintScale0.equals(grayPaintScale31) ? grayPaintScale0.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.awt.Paint paint33 = grayPaintScale2.getPaint((double) 10);
        double double34 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale2.getPaint((double) '4');
        java.lang.Object obj37 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj37", grayPaintScale2.equals(obj37) ? grayPaintScale2.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double23 = grayPaintScale22.getLowerBound();
        boolean boolean25 = grayPaintScale22.equals((java.lang.Object) (short) -1);
        double double26 = grayPaintScale22.getUpperBound();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) double26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale22", grayPaintScale2.equals(grayPaintScale22) ? grayPaintScale2.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) 1L);
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean23 = grayPaintScale16.equals((java.lang.Object) 0.0d);
        double double24 = grayPaintScale16.getUpperBound();
        double double25 = grayPaintScale16.getLowerBound();
        double double26 = grayPaintScale16.getUpperBound();
        java.awt.Paint paint28 = grayPaintScale16.getPaint(0.0d);
        java.lang.Object obj29 = null;
        boolean boolean30 = grayPaintScale16.equals(obj29);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale16", grayPaintScale3.equals(grayPaintScale16) ? grayPaintScale3.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) (short) -1);
        double double14 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj16 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass17 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj16", grayPaintScale0.equals(obj16) ? grayPaintScale0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) -1);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0);
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) double11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) (short) -1);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        double double19 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        double double23 = grayPaintScale22.getLowerBound();
        double double24 = grayPaintScale22.getLowerBound();
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) grayPaintScale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale22", grayPaintScale6.equals(grayPaintScale22) ? grayPaintScale6.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.awt.Paint paint11 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale0.clone();
        double double12 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale0.equals(obj7);
        java.lang.Object obj9 = null;
        boolean boolean10 = grayPaintScale0.equals(obj9);
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.awt.Paint paint13 = grayPaintScale0.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) 0.0d);
        double double14 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint16 = grayPaintScale6.getPaint(1.0d);
        java.awt.Paint paint18 = grayPaintScale6.getPaint((double) (byte) 1);
        java.lang.Object obj19 = grayPaintScale6.clone();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj19", grayPaintScale6.equals(obj19) ? grayPaintScale6.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) (short) 1);
        double double10 = grayPaintScale0.getUpperBound();
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.awt.Paint paint13 = grayPaintScale0.getPaint(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        double double11 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getUpperBound();
        double double18 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale14.getPaint((double) (byte) 1);
        java.lang.Object obj21 = grayPaintScale14.clone();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 0);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) paint12);
        double double14 = grayPaintScale6.getLowerBound();
        boolean boolean16 = grayPaintScale6.equals((java.lang.Object) 100.0f);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) boolean16);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double21 = grayPaintScale20.getLowerBound();
        boolean boolean23 = grayPaintScale20.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) (short) 0);
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) "hi!");
        double double31 = grayPaintScale28.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) 0);
        boolean boolean34 = grayPaintScale20.equals((java.lang.Object) grayPaintScale28);
        boolean boolean36 = grayPaintScale28.equals((java.lang.Object) 10.0f);
        double double37 = grayPaintScale28.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale40 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        boolean boolean41 = grayPaintScale28.equals((java.lang.Object) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale44 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.lang.Class<?> wildcardClass45 = grayPaintScale44.getClass();
        boolean boolean46 = grayPaintScale28.equals((java.lang.Object) grayPaintScale44);
        boolean boolean47 = grayPaintScale2.equals((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale40", grayPaintScale2.equals(grayPaintScale40) ? grayPaintScale2.hashCode() == grayPaintScale40.hashCode() : true);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 10);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) "hi!");
        double double7 = grayPaintScale4.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean11 = grayPaintScale4.equals((java.lang.Object) 0.0d);
        double double12 = grayPaintScale4.getUpperBound();
        boolean boolean14 = grayPaintScale4.equals((java.lang.Object) 10.0d);
        double double15 = grayPaintScale4.getUpperBound();
        double double16 = grayPaintScale4.getUpperBound();
        double double17 = grayPaintScale4.getUpperBound();
        double double18 = grayPaintScale4.getLowerBound();
        boolean boolean19 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double23 = grayPaintScale22.getLowerBound();
        boolean boolean25 = grayPaintScale22.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (short) 0);
        java.awt.Paint paint29 = grayPaintScale22.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) "hi!");
        double double33 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) 0);
        boolean boolean36 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        double double37 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale22.getPaint((-1.0d));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double43 = grayPaintScale42.getUpperBound();
        double double44 = grayPaintScale42.getUpperBound();
        java.lang.Class<?> wildcardClass45 = grayPaintScale42.getClass();
        boolean boolean46 = grayPaintScale22.equals((java.lang.Object) grayPaintScale42);
        boolean boolean47 = grayPaintScale2.equals((java.lang.Object) grayPaintScale42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale4 and grayPaintScale30", grayPaintScale4.equals(grayPaintScale30) ? grayPaintScale4.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) (short) -1);
        double double14 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj16 = grayPaintScale10.clone();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj16", grayPaintScale10.equals(obj16) ? grayPaintScale10.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (short) 10);
        java.lang.Object obj7 = grayPaintScale6.clone();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj7", grayPaintScale6.equals(obj7) ? grayPaintScale6.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100L);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Object obj7 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double8 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (byte) 100);
        boolean boolean17 = grayPaintScale11.equals((java.lang.Object) (byte) 100);
        double double18 = grayPaintScale11.getLowerBound();
        double double19 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double23 = grayPaintScale22.getLowerBound();
        boolean boolean25 = grayPaintScale22.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (short) 0);
        java.awt.Paint paint29 = grayPaintScale22.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) "hi!");
        double double33 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) 0);
        boolean boolean36 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        boolean boolean38 = grayPaintScale22.equals((java.lang.Object) (byte) 1);
        double double39 = grayPaintScale22.getUpperBound();
        boolean boolean40 = grayPaintScale11.equals((java.lang.Object) double39);
        boolean boolean41 = grayPaintScale7.equals((java.lang.Object) grayPaintScale11);
        double double42 = grayPaintScale7.getUpperBound();
        java.lang.Class<?> wildcardClass43 = grayPaintScale7.getClass();
        boolean boolean44 = grayPaintScale2.equals((java.lang.Object) wildcardClass43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 52.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) 0.0f);
        double double15 = grayPaintScale12.getUpperBound();
        double double16 = grayPaintScale12.getUpperBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 1L);
        java.lang.Object obj12 = grayPaintScale2.clone();
        double double13 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        java.lang.Object obj11 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.awt.Paint paint14 = grayPaintScale12.getPaint(35.0d);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double16 = grayPaintScale2.getUpperBound();
        java.lang.Object obj17 = grayPaintScale2.clone();
        double double18 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        java.lang.Object obj10 = grayPaintScale9.clone();
        boolean boolean11 = grayPaintScale0.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) ' ');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getLowerBound();
        double double6 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint(0.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getUpperBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        java.lang.Object obj1 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj1", grayPaintScale0.equals(obj1) ? grayPaintScale0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double12 = grayPaintScale11.getLowerBound();
        boolean boolean14 = grayPaintScale11.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (short) 0);
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        double double22 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) 0);
        boolean boolean25 = grayPaintScale11.equals((java.lang.Object) grayPaintScale19);
        boolean boolean27 = grayPaintScale19.equals((java.lang.Object) 10.0f);
        double double28 = grayPaintScale19.getLowerBound();
        double double29 = grayPaintScale19.getLowerBound();
        double double30 = grayPaintScale19.getUpperBound();
        double double31 = grayPaintScale19.getLowerBound();
        double double32 = grayPaintScale19.getUpperBound();
        double double33 = grayPaintScale19.getLowerBound();
        boolean boolean34 = grayPaintScale8.equals((java.lang.Object) grayPaintScale19);
        boolean boolean35 = grayPaintScale0.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale19", grayPaintScale0.equals(grayPaintScale19) ? grayPaintScale0.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.awt.Paint paint15 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 10L);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0L);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) paint14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (byte) 100);
        boolean boolean15 = grayPaintScale9.equals((java.lang.Object) (byte) 100);
        double double16 = grayPaintScale9.getLowerBound();
        double double17 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double21 = grayPaintScale20.getLowerBound();
        boolean boolean23 = grayPaintScale20.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) (short) 0);
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) "hi!");
        double double31 = grayPaintScale28.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) 0);
        boolean boolean34 = grayPaintScale20.equals((java.lang.Object) grayPaintScale28);
        boolean boolean36 = grayPaintScale20.equals((java.lang.Object) (byte) 1);
        double double37 = grayPaintScale20.getUpperBound();
        boolean boolean38 = grayPaintScale9.equals((java.lang.Object) double37);
        java.awt.Paint paint40 = grayPaintScale9.getPaint((double) 10);
        double double41 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint43 = grayPaintScale9.getPaint((double) '4');
        java.lang.Object obj44 = grayPaintScale9.clone();
        boolean boolean45 = grayPaintScale2.equals(obj44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale9", grayPaintScale2.equals(grayPaintScale9) ? grayPaintScale2.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale2.equals(obj12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 'a');
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        double double18 = grayPaintScale16.getLowerBound();
        java.lang.Object obj19 = grayPaintScale16.clone();
        java.lang.Object obj20 = null;
        boolean boolean21 = grayPaintScale16.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj19", grayPaintScale16.equals(obj19) ? grayPaintScale16.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint(0.0d);
        double double9 = grayPaintScale3.getLowerBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj11 = grayPaintScale3.clone();
        double double12 = grayPaintScale3.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj11", grayPaintScale3.equals(obj11) ? grayPaintScale3.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint10 = grayPaintScale8.getPaint((double) (byte) 100);
        boolean boolean11 = grayPaintScale5.equals((java.lang.Object) (byte) 100);
        double double12 = grayPaintScale5.getLowerBound();
        double double13 = grayPaintScale5.getUpperBound();
        double double14 = grayPaintScale5.getUpperBound();
        double double15 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        double double22 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) 0);
        boolean boolean25 = grayPaintScale18.equals((java.lang.Object) paint24);
        double double26 = grayPaintScale18.getLowerBound();
        boolean boolean28 = grayPaintScale18.equals((java.lang.Object) 100.0f);
        boolean boolean29 = grayPaintScale5.equals((java.lang.Object) grayPaintScale18);
        double double30 = grayPaintScale5.getLowerBound();
        java.lang.Object obj31 = grayPaintScale5.clone();
        boolean boolean32 = grayPaintScale2.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale5", grayPaintScale2.equals(grayPaintScale5) ? grayPaintScale2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) 0);
        double double17 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getUpperBound();
        double double20 = grayPaintScale18.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        boolean boolean24 = grayPaintScale18.equals((java.lang.Object) 10L);
        java.lang.Object obj25 = grayPaintScale18.clone();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale18", grayPaintScale3.equals(grayPaintScale18) ? grayPaintScale3.hashCode() == grayPaintScale18.hashCode() : true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) "hi!");
        double double8 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) 0);
        double double11 = grayPaintScale5.getUpperBound();
        double double12 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean18 = grayPaintScale15.equals((java.lang.Object) (short) -1);
        double double19 = grayPaintScale15.getLowerBound();
        boolean boolean20 = grayPaintScale5.equals((java.lang.Object) grayPaintScale15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double24 = grayPaintScale23.getLowerBound();
        double double25 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale23.getPaint(0.0d);
        boolean boolean28 = grayPaintScale5.equals((java.lang.Object) 0.0d);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.lang.Object obj32 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 'a');
        double double36 = grayPaintScale35.getLowerBound();
        double double37 = grayPaintScale35.getLowerBound();
        double double38 = grayPaintScale35.getLowerBound();
        boolean boolean39 = grayPaintScale2.equals((java.lang.Object) grayPaintScale35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj32", grayPaintScale2.equals(obj32) ? grayPaintScale2.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getLowerBound();
        double double6 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint(0.0d);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getUpperBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        double double12 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (short) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint18 = grayPaintScale16.getPaint((double) (byte) 100);
        boolean boolean19 = grayPaintScale13.equals((java.lang.Object) (byte) 100);
        double double20 = grayPaintScale13.getLowerBound();
        double double21 = grayPaintScale13.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double25 = grayPaintScale24.getLowerBound();
        boolean boolean27 = grayPaintScale24.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) (short) 0);
        java.awt.Paint paint31 = grayPaintScale24.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean34 = grayPaintScale32.equals((java.lang.Object) "hi!");
        double double35 = grayPaintScale32.getLowerBound();
        java.awt.Paint paint37 = grayPaintScale32.getPaint((double) 0);
        boolean boolean38 = grayPaintScale24.equals((java.lang.Object) grayPaintScale32);
        boolean boolean40 = grayPaintScale24.equals((java.lang.Object) (byte) 1);
        double double41 = grayPaintScale24.getUpperBound();
        boolean boolean42 = grayPaintScale13.equals((java.lang.Object) double41);
        java.awt.Paint paint44 = grayPaintScale13.getPaint((double) 10);
        double double45 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint47 = grayPaintScale13.getPaint((double) '4');
        java.lang.Object obj48 = grayPaintScale13.clone();
        boolean boolean49 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj48", grayPaintScale13.equals(obj48) ? grayPaintScale13.hashCode() == obj48.hashCode() : true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double11 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale10.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        double double15 = grayPaintScale14.getLowerBound();
        double double16 = grayPaintScale14.getLowerBound();
        double double17 = grayPaintScale14.getUpperBound();
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) grayPaintScale14);
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = grayPaintScale14.equals(obj19);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale10", grayPaintScale2.equals(grayPaintScale10) ? grayPaintScale2.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) 10.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getUpperBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale13", grayPaintScale6.equals(grayPaintScale13) ? grayPaintScale6.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) ' ');
        java.awt.Paint paint15 = grayPaintScale0.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getUpperBound();
        java.lang.Object obj20 = null;
        boolean boolean21 = grayPaintScale16.equals(obj20);
        double double22 = grayPaintScale16.getUpperBound();
        double double23 = grayPaintScale16.getUpperBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale16.getClass();
        boolean boolean25 = grayPaintScale0.equals((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale16", grayPaintScale0.equals(grayPaintScale16) ? grayPaintScale0.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 1);
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.awt.Paint paint13 = grayPaintScale0.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        boolean boolean4 = grayPaintScale0.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.awt.Paint paint7 = grayPaintScale0.getPaint((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double12 = grayPaintScale11.getLowerBound();
        boolean boolean14 = grayPaintScale11.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint16 = grayPaintScale11.getPaint((double) (short) 0);
        java.awt.Paint paint18 = grayPaintScale11.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        double double22 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) 0);
        boolean boolean25 = grayPaintScale11.equals((java.lang.Object) grayPaintScale19);
        double double26 = grayPaintScale19.getLowerBound();
        double double27 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale19.getPaint((double) (short) 1);
        java.lang.Object obj30 = grayPaintScale19.clone();
        boolean boolean31 = grayPaintScale0.equals(obj30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale19", grayPaintScale0.equals(grayPaintScale19) ? grayPaintScale0.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) (byte) 1);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        double double6 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getUpperBound();
        java.lang.Object obj13 = grayPaintScale0.clone();
        double double14 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 10L);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        java.lang.Object obj9 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) (byte) 10);
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        double double11 = grayPaintScale9.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double15 = grayPaintScale14.getLowerBound();
        boolean boolean17 = grayPaintScale14.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) (short) 0);
        boolean boolean21 = grayPaintScale14.equals((java.lang.Object) 0.0d);
        double double22 = grayPaintScale14.getLowerBound();
        double double23 = grayPaintScale14.getUpperBound();
        java.lang.Object obj24 = grayPaintScale14.clone();
        boolean boolean25 = grayPaintScale9.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj24", grayPaintScale14.equals(obj24) ? grayPaintScale14.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) true);
        java.lang.Object obj22 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj22", grayPaintScale2.equals(obj22) ? grayPaintScale2.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double6 = grayPaintScale5.getUpperBound();
        java.lang.Class<?> wildcardClass7 = grayPaintScale5.getClass();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale5", grayPaintScale2.equals(grayPaintScale5) ? grayPaintScale2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        double double19 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale10.getPaint(0.0d);
        double double22 = grayPaintScale10.getLowerBound();
        java.lang.Object obj23 = grayPaintScale10.clone();
        java.lang.Object obj24 = grayPaintScale10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj23", grayPaintScale10.equals(obj23) ? grayPaintScale10.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getUpperBound();
        java.lang.Object obj12 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj12", grayPaintScale0.equals(obj12) ? grayPaintScale0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) 0);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) grayPaintScale17);
        boolean boolean25 = grayPaintScale9.equals((java.lang.Object) (byte) 1);
        double double26 = grayPaintScale9.getLowerBound();
        boolean boolean28 = grayPaintScale9.equals((java.lang.Object) true);
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale17", grayPaintScale0.equals(grayPaintScale17) ? grayPaintScale0.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) 0.0f);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean29 = grayPaintScale27.equals((java.lang.Object) "hi!");
        java.awt.Paint paint31 = grayPaintScale27.getPaint((double) 1);
        java.awt.Paint paint33 = grayPaintScale27.getPaint(0.0d);
        boolean boolean34 = grayPaintScale26.equals((java.lang.Object) 0.0d);
        double double35 = grayPaintScale26.getUpperBound();
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and grayPaintScale27", grayPaintScale14.equals(grayPaintScale27) ? grayPaintScale14.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale0.equals(obj8);
        java.lang.Object obj10 = grayPaintScale0.clone();
        double double11 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getUpperBound();
        double double12 = grayPaintScale0.getUpperBound();
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) 0);
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) grayPaintScale6);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        double double15 = grayPaintScale5.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) double15);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        boolean boolean22 = grayPaintScale8.equals((java.lang.Object) grayPaintScale16);
        java.awt.Paint paint24 = grayPaintScale16.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean28 = grayPaintScale16.equals((java.lang.Object) '#');
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj30 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj30", grayPaintScale2.equals(obj30) ? grayPaintScale2.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale9.getPaint((double) (byte) 1);
        double double16 = grayPaintScale9.getLowerBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 10, 100.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.awt.Paint paint15 = grayPaintScale2.getPaint((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 0);
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) grayPaintScale13);
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) 10.0f);
        double double22 = grayPaintScale13.getLowerBound();
        double double23 = grayPaintScale13.getLowerBound();
        double double24 = grayPaintScale13.getUpperBound();
        double double25 = grayPaintScale13.getLowerBound();
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) double25);
        java.lang.Object obj27 = grayPaintScale2.clone();
        double double28 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj27", grayPaintScale2.equals(obj27) ? grayPaintScale2.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) 'a');
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale6.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) "hi!");
        double double14 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean18 = grayPaintScale11.equals((java.lang.Object) 0.0d);
        double double19 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint21 = grayPaintScale11.getPaint(1.0d);
        boolean boolean22 = grayPaintScale6.equals((java.lang.Object) grayPaintScale11);
        java.awt.Paint paint24 = grayPaintScale11.getPaint((double) 0L);
        double double25 = grayPaintScale11.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale11.getPaint(1.0d);
        java.awt.Paint paint29 = grayPaintScale11.getPaint(1.0d);
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        double double20 = grayPaintScale10.getUpperBound();
        double double21 = grayPaintScale10.getLowerBound();
        double double22 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (short) 1);
        double double26 = grayPaintScale25.getLowerBound();
        double double27 = grayPaintScale25.getLowerBound();
        boolean boolean28 = grayPaintScale10.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale25", grayPaintScale10.equals(grayPaintScale25) ? grayPaintScale10.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale2.getPaint((double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double15 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint17 = grayPaintScale14.getPaint((double) (short) -1);
        double double18 = grayPaintScale14.getLowerBound();
        double double19 = grayPaintScale14.getUpperBound();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) double19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double24 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale23.getPaint((double) (-1L));
        java.awt.Paint paint28 = grayPaintScale23.getPaint((double) 1.0f);
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and grayPaintScale23", grayPaintScale14.equals(grayPaintScale23) ? grayPaintScale14.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) 100);
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) (byte) 100);
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean20 = grayPaintScale17.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) (short) 0);
        java.awt.Paint paint24 = grayPaintScale17.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean27 = grayPaintScale25.equals((java.lang.Object) "hi!");
        double double28 = grayPaintScale25.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale25.getPaint((double) 0);
        boolean boolean31 = grayPaintScale17.equals((java.lang.Object) grayPaintScale25);
        boolean boolean33 = grayPaintScale17.equals((java.lang.Object) (byte) 1);
        double double34 = grayPaintScale17.getUpperBound();
        boolean boolean35 = grayPaintScale6.equals((java.lang.Object) double34);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint38 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double42 = grayPaintScale41.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double46 = grayPaintScale45.getLowerBound();
        boolean boolean48 = grayPaintScale45.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint50 = grayPaintScale45.getPaint((double) (short) 0);
        java.awt.Paint paint52 = grayPaintScale45.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale53 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean55 = grayPaintScale53.equals((java.lang.Object) "hi!");
        double double56 = grayPaintScale53.getLowerBound();
        java.awt.Paint paint58 = grayPaintScale53.getPaint((double) 0);
        boolean boolean59 = grayPaintScale45.equals((java.lang.Object) grayPaintScale53);
        double double60 = grayPaintScale53.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale63 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass64 = grayPaintScale63.getClass();
        boolean boolean65 = grayPaintScale53.equals((java.lang.Object) grayPaintScale63);
        boolean boolean66 = grayPaintScale41.equals((java.lang.Object) grayPaintScale53);
        double double67 = grayPaintScale53.getUpperBound();
        boolean boolean68 = grayPaintScale2.equals((java.lang.Object) grayPaintScale53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and grayPaintScale45", grayPaintScale17.equals(grayPaintScale45) ? grayPaintScale17.hashCode() == grayPaintScale45.hashCode() : true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) ' ');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        java.lang.Object obj19 = grayPaintScale10.clone();
        java.lang.Object obj20 = grayPaintScale10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj19", grayPaintScale10.equals(obj19) ? grayPaintScale10.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getUpperBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (short) 0);
        java.lang.Object obj7 = null;
        boolean boolean8 = grayPaintScale0.equals(obj7);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) 0.0d);
        double double17 = grayPaintScale9.getUpperBound();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = grayPaintScale9.equals(obj18);
        double double20 = grayPaintScale9.getUpperBound();
        double double21 = grayPaintScale9.getUpperBound();
        java.lang.Object obj22 = grayPaintScale9.clone();
        boolean boolean23 = grayPaintScale0.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) 100);
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) (byte) 100);
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean20 = grayPaintScale17.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) (short) 0);
        java.awt.Paint paint24 = grayPaintScale17.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean27 = grayPaintScale25.equals((java.lang.Object) "hi!");
        double double28 = grayPaintScale25.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale25.getPaint((double) 0);
        boolean boolean31 = grayPaintScale17.equals((java.lang.Object) grayPaintScale25);
        boolean boolean33 = grayPaintScale17.equals((java.lang.Object) (byte) 1);
        double double34 = grayPaintScale17.getUpperBound();
        boolean boolean35 = grayPaintScale6.equals((java.lang.Object) double34);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint38 = grayPaintScale2.getPaint((double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        double double42 = grayPaintScale41.getUpperBound();
        double double43 = grayPaintScale41.getUpperBound();
        java.awt.Paint paint45 = grayPaintScale41.getPaint((double) '#');
        boolean boolean46 = grayPaintScale2.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale41", grayPaintScale2.equals(grayPaintScale41) ? grayPaintScale2.hashCode() == grayPaintScale41.hashCode() : true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        java.awt.Paint paint22 = grayPaintScale14.getPaint((double) 0.0f);
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double27 = grayPaintScale26.getLowerBound();
        double double28 = grayPaintScale26.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale26.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean33 = grayPaintScale31.equals((java.lang.Object) "hi!");
        double double34 = grayPaintScale31.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean38 = grayPaintScale31.equals((java.lang.Object) 0.0d);
        double double39 = grayPaintScale31.getUpperBound();
        java.awt.Paint paint41 = grayPaintScale31.getPaint(1.0d);
        boolean boolean42 = grayPaintScale26.equals((java.lang.Object) grayPaintScale31);
        java.awt.Paint paint44 = grayPaintScale31.getPaint((double) 0L);
        boolean boolean45 = grayPaintScale2.equals((java.lang.Object) paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale37", grayPaintScale6.equals(grayPaintScale37) ? grayPaintScale6.hashCode() == grayPaintScale37.hashCode() : true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        java.lang.Object obj5 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.lang.Object obj8 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        java.lang.Object obj14 = null;
        boolean boolean15 = grayPaintScale11.equals(obj14);
        double double16 = grayPaintScale11.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (byte) 100);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        double double13 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 0);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) 0);
        double double20 = grayPaintScale2.getUpperBound();
        java.lang.Object obj21 = grayPaintScale2.clone();
        double double22 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        double double13 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 0);
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale2.equals(obj18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) 0);
        double double26 = grayPaintScale20.getUpperBound();
        double double27 = grayPaintScale20.getUpperBound();
        double double28 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale20.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double34 = grayPaintScale33.getLowerBound();
        double double35 = grayPaintScale33.getLowerBound();
        boolean boolean36 = grayPaintScale20.equals((java.lang.Object) grayPaintScale33);
        double double37 = grayPaintScale33.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale33.getPaint((double) (byte) -1);
        java.lang.Object obj40 = grayPaintScale33.clone();
        boolean boolean41 = grayPaintScale2.equals((java.lang.Object) grayPaintScale33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale20", grayPaintScale3.equals(grayPaintScale20) ? grayPaintScale3.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        double double12 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean18 = grayPaintScale15.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (short) 0);
        java.awt.Paint paint22 = grayPaintScale15.getPaint((double) 0.0f);
        boolean boolean24 = grayPaintScale15.equals((java.lang.Object) 1L);
        boolean boolean25 = grayPaintScale7.equals((java.lang.Object) grayPaintScale15);
        double double26 = grayPaintScale7.getUpperBound();
        java.lang.Object obj27 = grayPaintScale7.clone();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) 0);
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 0);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) paint14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale5", grayPaintScale2.equals(grayPaintScale5) ? grayPaintScale2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) 0.0d);
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint(1.0d);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = grayPaintScale6.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale6.equals((java.lang.Object) double16);
        double double18 = grayPaintScale6.getLowerBound();
        java.lang.Object obj19 = grayPaintScale6.clone();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj19", grayPaintScale6.equals(obj19) ? grayPaintScale6.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) (short) 0);
        java.awt.Paint paint14 = grayPaintScale7.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) "hi!");
        double double18 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) 0);
        boolean boolean21 = grayPaintScale7.equals((java.lang.Object) grayPaintScale15);
        boolean boolean23 = grayPaintScale7.equals((java.lang.Object) (byte) 1);
        double double24 = grayPaintScale7.getLowerBound();
        boolean boolean26 = grayPaintScale7.equals((java.lang.Object) true);
        double double27 = grayPaintScale7.getLowerBound();
        java.lang.Object obj28 = grayPaintScale7.clone();
        boolean boolean29 = grayPaintScale2.equals(obj28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) (short) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) ' ');
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 0.0d);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getUpperBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getLowerBound();
        java.lang.Object obj13 = grayPaintScale9.clone();
        boolean boolean14 = grayPaintScale0.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        double double20 = grayPaintScale10.getLowerBound();
        double double21 = grayPaintScale10.getUpperBound();
        double double22 = grayPaintScale10.getLowerBound();
        java.lang.Object obj23 = grayPaintScale10.clone();
        double double24 = grayPaintScale10.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj23", grayPaintScale10.equals(obj23) ? grayPaintScale10.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double10 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        double double28 = grayPaintScale21.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass32 = grayPaintScale31.getClass();
        boolean boolean33 = grayPaintScale21.equals((java.lang.Object) grayPaintScale31);
        boolean boolean34 = grayPaintScale9.equals((java.lang.Object) grayPaintScale21);
        double double35 = grayPaintScale21.getUpperBound();
        java.lang.Class<?> wildcardClass36 = grayPaintScale21.getClass();
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) grayPaintScale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) 0.0d);
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint(1.0d);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass20 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint9 = grayPaintScale7.getPaint((double) 0);
        double double10 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale7.getPaint((double) 10L);
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj14 = grayPaintScale7.clone();
        java.lang.Object obj15 = grayPaintScale7.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (byte) 100);
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) (-1L));
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) "hi!");
        double double14 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean18 = grayPaintScale11.equals((java.lang.Object) 0.0d);
        double double19 = grayPaintScale11.getUpperBound();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = grayPaintScale11.equals(obj20);
        double double22 = grayPaintScale11.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean26 = grayPaintScale11.equals((java.lang.Object) grayPaintScale25);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double30 = grayPaintScale29.getUpperBound();
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) double30);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double35 = grayPaintScale34.getLowerBound();
        boolean boolean36 = grayPaintScale11.equals((java.lang.Object) grayPaintScale34);
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) grayPaintScale34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        double double6 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.awt.Paint paint11 = grayPaintScale9.getPaint(35.0d);
        java.awt.Paint paint13 = grayPaintScale9.getPaint((double) (byte) 0);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        java.lang.Object obj15 = grayPaintScale9.clone();
        java.lang.Object obj16 = grayPaintScale9.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj15", grayPaintScale9.equals(obj15) ? grayPaintScale9.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double20 = grayPaintScale19.getLowerBound();
        boolean boolean22 = grayPaintScale19.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint24 = grayPaintScale19.getPaint((double) (short) 0);
        java.awt.Paint paint26 = grayPaintScale19.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean29 = grayPaintScale27.equals((java.lang.Object) "hi!");
        double double30 = grayPaintScale27.getLowerBound();
        java.awt.Paint paint32 = grayPaintScale27.getPaint((double) 0);
        boolean boolean33 = grayPaintScale19.equals((java.lang.Object) grayPaintScale27);
        boolean boolean35 = grayPaintScale19.equals((java.lang.Object) (byte) 1);
        double double36 = grayPaintScale19.getLowerBound();
        boolean boolean38 = grayPaintScale19.equals((java.lang.Object) true);
        double double39 = grayPaintScale19.getLowerBound();
        java.lang.Object obj40 = grayPaintScale19.clone();
        boolean boolean41 = grayPaintScale10.equals(obj40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale19", grayPaintScale2.equals(grayPaintScale19) ? grayPaintScale2.hashCode() == grayPaintScale19.hashCode() : true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = grayPaintScale6.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale6.equals((java.lang.Object) double16);
        double double18 = grayPaintScale6.getLowerBound();
        java.lang.Object obj19 = grayPaintScale6.clone();
        double double20 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj19", grayPaintScale6.equals(obj19) ? grayPaintScale6.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getLowerBound();
        double double12 = grayPaintScale0.getLowerBound();
        double double13 = grayPaintScale0.getLowerBound();
        double double14 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean17 = grayPaintScale15.equals((java.lang.Object) "hi!");
        double double18 = grayPaintScale15.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean22 = grayPaintScale15.equals((java.lang.Object) 0.0d);
        double double23 = grayPaintScale15.getUpperBound();
        java.awt.Paint paint25 = grayPaintScale15.getPaint(1.0d);
        java.awt.Paint paint27 = grayPaintScale15.getPaint((double) (byte) 1);
        java.lang.Class<?> wildcardClass28 = paint27.getClass();
        boolean boolean29 = grayPaintScale0.equals((java.lang.Object) paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale15", grayPaintScale0.equals(grayPaintScale15) ? grayPaintScale0.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj9 = grayPaintScale2.clone();
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getLowerBound();
        double double21 = grayPaintScale2.getLowerBound();
        double double22 = grayPaintScale2.getLowerBound();
        double double23 = grayPaintScale2.getLowerBound();
        java.lang.Object obj24 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj24", grayPaintScale2.equals(obj24) ? grayPaintScale2.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getUpperBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double14 = grayPaintScale13.getUpperBound();
        java.lang.Object obj15 = grayPaintScale13.clone();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj15", grayPaintScale13.equals(obj15) ? grayPaintScale13.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        boolean boolean17 = grayPaintScale8.equals((java.lang.Object) 1L);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        double double19 = grayPaintScale8.getLowerBound();
        java.lang.Object obj20 = grayPaintScale8.clone();
        java.lang.Object obj21 = grayPaintScale8.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj20", grayPaintScale8.equals(obj20) ? grayPaintScale8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint((double) (short) 1);
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 100);
        double double14 = grayPaintScale13.getUpperBound();
        double double15 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 1);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        java.lang.Object obj20 = grayPaintScale10.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj20", grayPaintScale10.equals(obj20) ? grayPaintScale10.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        double double13 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean24 = grayPaintScale17.equals((java.lang.Object) 0.0d);
        java.lang.Object obj25 = null;
        boolean boolean26 = grayPaintScale17.equals(obj25);
        boolean boolean27 = grayPaintScale16.equals((java.lang.Object) grayPaintScale17);
        double double28 = grayPaintScale17.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale17.getPaint((double) 0L);
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale17", grayPaintScale3.equals(grayPaintScale17) ? grayPaintScale3.hashCode() == grayPaintScale17.hashCode() : true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) grayPaintScale11);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj17 = grayPaintScale11.clone();
        double double18 = grayPaintScale11.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj17", grayPaintScale11.equals(obj17) ? grayPaintScale11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getLowerBound();
        double double21 = grayPaintScale2.getLowerBound();
        double double22 = grayPaintScale2.getLowerBound();
        double double23 = grayPaintScale2.getLowerBound();
        double double24 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        double double26 = grayPaintScale25.getLowerBound();
        double double27 = grayPaintScale25.getUpperBound();
        double double28 = grayPaintScale25.getLowerBound();
        double double29 = grayPaintScale25.getUpperBound();
        double double30 = grayPaintScale25.getLowerBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale25", grayPaintScale10.equals(grayPaintScale25) ? grayPaintScale10.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double11 = grayPaintScale10.getLowerBound();
        boolean boolean13 = grayPaintScale10.equals((java.lang.Object) (short) -1);
        double double14 = grayPaintScale10.getLowerBound();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj16 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getUpperBound();
        double double21 = grayPaintScale17.getLowerBound();
        boolean boolean23 = grayPaintScale17.equals((java.lang.Object) (short) 10);
        double double24 = grayPaintScale17.getLowerBound();
        java.lang.Object obj25 = grayPaintScale17.clone();
        boolean boolean26 = grayPaintScale0.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj16", grayPaintScale0.equals(obj16) ? grayPaintScale0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        java.lang.Object obj10 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) "hi!");
        double double14 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale11.getPaint(0.0d);
        double double17 = grayPaintScale11.getUpperBound();
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale11.equals(obj18);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint24 = grayPaintScale22.getPaint((double) 0);
        double double25 = grayPaintScale22.getUpperBound();
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) 10L);
        java.awt.Paint paint29 = grayPaintScale22.getPaint((double) 0L);
        double double30 = grayPaintScale22.getLowerBound();
        boolean boolean31 = grayPaintScale11.equals((java.lang.Object) grayPaintScale22);
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getLowerBound();
        java.lang.Object obj19 = grayPaintScale10.clone();
        double double20 = grayPaintScale10.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj19", grayPaintScale10.equals(obj19) ? grayPaintScale10.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getLowerBound();
        java.lang.Object obj19 = grayPaintScale10.clone();
        java.lang.Class<?> wildcardClass20 = grayPaintScale10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj19", grayPaintScale10.equals(obj19) ? grayPaintScale10.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.awt.Paint paint33 = grayPaintScale2.getPaint((double) 10);
        double double34 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double38 = grayPaintScale37.getLowerBound();
        boolean boolean40 = grayPaintScale37.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint42 = grayPaintScale37.getPaint((double) (short) 0);
        boolean boolean43 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale37", grayPaintScale13.equals(grayPaintScale37) ? grayPaintScale13.hashCode() == grayPaintScale37.hashCode() : true);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass7 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint24 = grayPaintScale20.getPaint((double) (byte) 1);
        boolean boolean25 = grayPaintScale13.equals((java.lang.Object) grayPaintScale20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double29 = grayPaintScale28.getLowerBound();
        boolean boolean31 = grayPaintScale28.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) (short) 0);
        java.awt.Paint paint35 = grayPaintScale28.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean38 = grayPaintScale36.equals((java.lang.Object) "hi!");
        double double39 = grayPaintScale36.getLowerBound();
        java.awt.Paint paint41 = grayPaintScale36.getPaint((double) 0);
        boolean boolean42 = grayPaintScale28.equals((java.lang.Object) grayPaintScale36);
        boolean boolean44 = grayPaintScale28.equals((java.lang.Object) (byte) 1);
        double double45 = grayPaintScale28.getLowerBound();
        boolean boolean47 = grayPaintScale28.equals((java.lang.Object) true);
        double double48 = grayPaintScale28.getLowerBound();
        boolean boolean49 = grayPaintScale20.equals((java.lang.Object) grayPaintScale28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale36", grayPaintScale0.equals(grayPaintScale36) ? grayPaintScale0.hashCode() == grayPaintScale36.hashCode() : true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, 1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) 0);
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) grayPaintScale6);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        double double15 = grayPaintScale5.getLowerBound();
        java.lang.Object obj16 = grayPaintScale5.clone();
        boolean boolean17 = grayPaintScale2.equals(obj16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) 0, (double) 'a');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale();
        double double9 = grayPaintScale8.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale8.getPaint(0.0d);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (byte) 0);
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) grayPaintScale8);
        java.lang.Object obj15 = grayPaintScale8.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale8 and obj15", grayPaintScale8.equals(obj15) ? grayPaintScale8.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale13.getUpperBound();
        double double18 = grayPaintScale13.getLowerBound();
        java.lang.Object obj19 = grayPaintScale13.clone();
        java.lang.Class<?> wildcardClass20 = grayPaintScale13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj19", grayPaintScale13.equals(obj19) ? grayPaintScale13.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        double double21 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass25 = grayPaintScale24.getClass();
        boolean boolean26 = grayPaintScale14.equals((java.lang.Object) grayPaintScale24);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double28 = grayPaintScale14.getUpperBound();
        boolean boolean30 = grayPaintScale14.equals((java.lang.Object) (short) 0);
        java.lang.Object obj31 = grayPaintScale14.clone();
        double double32 = grayPaintScale14.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj31", grayPaintScale14.equals(obj31) ? grayPaintScale14.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getLowerBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) -1);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0);
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        double double17 = grayPaintScale13.getUpperBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.awt.Paint paint21 = grayPaintScale2.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) 100);
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) (byte) 100);
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double18 = grayPaintScale17.getLowerBound();
        boolean boolean20 = grayPaintScale17.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) (short) 0);
        java.awt.Paint paint24 = grayPaintScale17.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean27 = grayPaintScale25.equals((java.lang.Object) "hi!");
        double double28 = grayPaintScale25.getLowerBound();
        java.awt.Paint paint30 = grayPaintScale25.getPaint((double) 0);
        boolean boolean31 = grayPaintScale17.equals((java.lang.Object) grayPaintScale25);
        boolean boolean33 = grayPaintScale17.equals((java.lang.Object) (byte) 1);
        double double34 = grayPaintScale17.getUpperBound();
        boolean boolean35 = grayPaintScale6.equals((java.lang.Object) double34);
        boolean boolean36 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj37 = grayPaintScale6.clone();
        double double38 = grayPaintScale6.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj37", grayPaintScale6.equals(obj37) ? grayPaintScale6.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.lang.Object obj5 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        boolean boolean15 = grayPaintScale8.equals((java.lang.Object) 0.0d);
        double double16 = grayPaintScale8.getLowerBound();
        double double17 = grayPaintScale8.getLowerBound();
        double double18 = grayPaintScale8.getUpperBound();
        double double19 = grayPaintScale8.getLowerBound();
        boolean boolean20 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj5", grayPaintScale0.equals(obj5) ? grayPaintScale0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean9 = grayPaintScale0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj10 = grayPaintScale0.clone();
        double double11 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) "hi!");
        double double21 = grayPaintScale18.getUpperBound();
        double double22 = grayPaintScale18.getLowerBound();
        double double23 = grayPaintScale18.getUpperBound();
        double double24 = grayPaintScale18.getUpperBound();
        double double25 = grayPaintScale18.getUpperBound();
        java.lang.Object obj26 = grayPaintScale18.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.awt.Paint paint33 = grayPaintScale2.getPaint((double) 10);
        double double34 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint36 = grayPaintScale2.getPaint((double) 'a');
        double double37 = grayPaintScale2.getUpperBound();
        double double38 = grayPaintScale2.getLowerBound();
        java.lang.Object obj39 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass40 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj39", grayPaintScale2.equals(obj39) ? grayPaintScale2.hashCode() == obj39.hashCode() : true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale13.getPaint((double) (byte) -1);
        java.lang.Object obj20 = grayPaintScale13.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj20", grayPaintScale13.equals(obj20) ? grayPaintScale13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.lang.Class<?> wildcardClass10 = grayPaintScale9.getClass();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) wildcardClass10);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double13 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        double double20 = grayPaintScale14.getUpperBound();
        double double21 = grayPaintScale14.getUpperBound();
        double double22 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale14.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double28 = grayPaintScale27.getLowerBound();
        double double29 = grayPaintScale27.getLowerBound();
        boolean boolean30 = grayPaintScale14.equals((java.lang.Object) grayPaintScale27);
        double double31 = grayPaintScale27.getLowerBound();
        double double32 = grayPaintScale27.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint37 = grayPaintScale35.getPaint((double) (short) 0);
        java.lang.Class<?> wildcardClass38 = paint37.getClass();
        boolean boolean39 = grayPaintScale27.equals((java.lang.Object) paint37);
        java.awt.Paint paint41 = grayPaintScale27.getPaint((double) (short) 0);
        java.lang.Object obj42 = grayPaintScale27.clone();
        boolean boolean43 = grayPaintScale6.equals(obj42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale27", grayPaintScale6.equals(grayPaintScale27) ? grayPaintScale6.hashCode() == grayPaintScale27.hashCode() : true);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getUpperBound();
        double double5 = grayPaintScale3.getLowerBound();
        double double6 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint(0.0d);
        java.lang.Object obj9 = grayPaintScale3.clone();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj9", grayPaintScale3.equals(obj9) ? grayPaintScale3.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale9.getPaint(0.0d);
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) "hi!");
        java.awt.Paint paint9 = grayPaintScale5.getPaint((double) 1);
        double double10 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean14 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        double double15 = grayPaintScale5.getUpperBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) double15);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        double double6 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) (byte) 100);
        boolean boolean15 = grayPaintScale9.equals((java.lang.Object) (byte) 100);
        double double16 = grayPaintScale9.getLowerBound();
        double double17 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double21 = grayPaintScale20.getLowerBound();
        boolean boolean23 = grayPaintScale20.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint25 = grayPaintScale20.getPaint((double) (short) 0);
        java.awt.Paint paint27 = grayPaintScale20.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean30 = grayPaintScale28.equals((java.lang.Object) "hi!");
        double double31 = grayPaintScale28.getLowerBound();
        java.awt.Paint paint33 = grayPaintScale28.getPaint((double) 0);
        boolean boolean34 = grayPaintScale20.equals((java.lang.Object) grayPaintScale28);
        boolean boolean36 = grayPaintScale20.equals((java.lang.Object) (byte) 1);
        double double37 = grayPaintScale20.getUpperBound();
        boolean boolean38 = grayPaintScale9.equals((java.lang.Object) double37);
        boolean boolean39 = grayPaintScale5.equals((java.lang.Object) grayPaintScale9);
        double double40 = grayPaintScale5.getUpperBound();
        java.lang.Class<?> wildcardClass41 = grayPaintScale5.getClass();
        boolean boolean42 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale45 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 10);
        double double46 = grayPaintScale45.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale47 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean49 = grayPaintScale47.equals((java.lang.Object) "hi!");
        double double50 = grayPaintScale47.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale53 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean54 = grayPaintScale47.equals((java.lang.Object) 0.0d);
        double double55 = grayPaintScale47.getUpperBound();
        boolean boolean57 = grayPaintScale47.equals((java.lang.Object) 10.0d);
        double double58 = grayPaintScale47.getUpperBound();
        double double59 = grayPaintScale47.getUpperBound();
        double double60 = grayPaintScale47.getUpperBound();
        double double61 = grayPaintScale47.getLowerBound();
        boolean boolean62 = grayPaintScale45.equals((java.lang.Object) grayPaintScale47);
        boolean boolean63 = grayPaintScale5.equals((java.lang.Object) boolean62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale20 and grayPaintScale53", grayPaintScale20.equals(grayPaintScale53) ? grayPaintScale20.hashCode() == grayPaintScale53.hashCode() : true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(1.0d);
        java.lang.Object obj11 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        double double13 = grayPaintScale12.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale12.getPaint(0.0d);
        boolean boolean17 = grayPaintScale12.equals((java.lang.Object) 0.0f);
        boolean boolean18 = grayPaintScale0.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        double double17 = grayPaintScale13.getUpperBound();
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) double17);
        java.lang.Object obj19 = grayPaintScale2.clone();
        java.lang.Object obj20 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getLowerBound();
        double double21 = grayPaintScale2.getLowerBound();
        double double22 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj25 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale0.getPaint(1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getUpperBound();
        double double14 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale10.getPaint((double) (byte) 1);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale10.getPaint(0.0d);
        java.awt.Paint paint22 = grayPaintScale10.getPaint((double) 0);
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale10", grayPaintScale0.equals(grayPaintScale10) ? grayPaintScale0.hashCode() == grayPaintScale10.hashCode() : true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) '4');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        java.awt.Paint paint7 = grayPaintScale3.getPaint((double) 1);
        double double8 = grayPaintScale3.getUpperBound();
        double double9 = grayPaintScale3.getLowerBound();
        double double10 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint12 = grayPaintScale3.getPaint((double) (short) 1);
        double double13 = grayPaintScale3.getUpperBound();
        java.lang.Object obj14 = grayPaintScale3.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj14", grayPaintScale3.equals(obj14) ? grayPaintScale3.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, 0.0d);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) -1);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0);
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) double11);
        java.lang.Object obj13 = grayPaintScale0.clone();
        double double14 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getLowerBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        boolean boolean5 = grayPaintScale0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0L);
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        double double19 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint((double) (-1));
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.awt.Paint paint16 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale5.getPaint(0.0d);
        double double10 = grayPaintScale5.getUpperBound();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.lang.Object obj12 = grayPaintScale5.clone();
        java.lang.Object obj13 = grayPaintScale5.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj12", grayPaintScale5.equals(obj12) ? grayPaintScale5.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getUpperBound();
        java.lang.Object obj20 = grayPaintScale2.clone();
        double double21 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj20", grayPaintScale2.equals(obj20) ? grayPaintScale2.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double13 = grayPaintScale12.getUpperBound();
        double double14 = grayPaintScale12.getUpperBound();
        java.lang.Object obj15 = grayPaintScale12.clone();
        boolean boolean16 = grayPaintScale3.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale12", grayPaintScale2.equals(grayPaintScale12) ? grayPaintScale2.hashCode() == grayPaintScale12.hashCode() : true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj13 = grayPaintScale2.clone();
        java.lang.Object obj14 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) 0.0d);
        java.lang.Object obj17 = null;
        boolean boolean18 = grayPaintScale9.equals(obj17);
        double double19 = grayPaintScale9.getLowerBound();
        java.lang.Object obj20 = grayPaintScale9.clone();
        boolean boolean21 = grayPaintScale0.equals((java.lang.Object) grayPaintScale9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale9", grayPaintScale0.equals(grayPaintScale9) ? grayPaintScale0.hashCode() == grayPaintScale9.hashCode() : true);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale0.equals(obj8);
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean23 = grayPaintScale16.equals((java.lang.Object) 0.0d);
        double double24 = grayPaintScale16.getUpperBound();
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = grayPaintScale16.equals(obj25);
        double double27 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale16.getPaint((double) (short) 0);
        boolean boolean31 = grayPaintScale16.equals((java.lang.Object) 0L);
        double double32 = grayPaintScale16.getLowerBound();
        boolean boolean33 = grayPaintScale13.equals((java.lang.Object) double32);
        boolean boolean34 = grayPaintScale0.equals((java.lang.Object) double32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.lang.Class<?> wildcardClass10 = grayPaintScale9.getClass();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) wildcardClass10);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj13 = grayPaintScale6.clone();
        double double14 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj13", grayPaintScale6.equals(obj13) ? grayPaintScale6.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.awt.Paint paint11 = grayPaintScale0.getPaint((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        java.lang.Object obj10 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        boolean boolean13 = grayPaintScale6.equals((java.lang.Object) 0.0d);
        double double14 = grayPaintScale6.getLowerBound();
        double double15 = grayPaintScale6.getLowerBound();
        double double16 = grayPaintScale6.getUpperBound();
        double double17 = grayPaintScale6.getLowerBound();
        double double18 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) 1.0f);
        double double22 = grayPaintScale19.getLowerBound();
        double double23 = grayPaintScale19.getLowerBound();
        double double24 = grayPaintScale19.getLowerBound();
        double double25 = grayPaintScale19.getLowerBound();
        boolean boolean26 = grayPaintScale6.equals((java.lang.Object) grayPaintScale19);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean16 = grayPaintScale9.equals((java.lang.Object) 0.0d);
        double double17 = grayPaintScale9.getUpperBound();
        boolean boolean19 = grayPaintScale9.equals((java.lang.Object) 10.0d);
        double double20 = grayPaintScale9.getUpperBound();
        double double21 = grayPaintScale9.getUpperBound();
        double double22 = grayPaintScale9.getUpperBound();
        boolean boolean23 = grayPaintScale8.equals((java.lang.Object) double22);
        java.awt.Paint paint25 = grayPaintScale8.getPaint((double) 10L);
        java.awt.Paint paint27 = grayPaintScale8.getPaint(100.0d);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale2.equals(obj12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 'a');
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        double double18 = grayPaintScale16.getLowerBound();
        java.lang.Object obj19 = grayPaintScale16.clone();
        double double20 = grayPaintScale16.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and obj19", grayPaintScale16.equals(obj19) ? grayPaintScale16.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double8 = grayPaintScale7.getUpperBound();
        double double9 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0.0f);
        double double7 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint15 = grayPaintScale13.getPaint((double) (byte) 100);
        boolean boolean16 = grayPaintScale10.equals((java.lang.Object) (byte) 100);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getUpperBound();
        double double19 = grayPaintScale10.getUpperBound();
        double double20 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean26 = grayPaintScale24.equals((java.lang.Object) "hi!");
        double double27 = grayPaintScale24.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale24.getPaint((double) 0);
        boolean boolean30 = grayPaintScale23.equals((java.lang.Object) paint29);
        double double31 = grayPaintScale23.getLowerBound();
        boolean boolean33 = grayPaintScale23.equals((java.lang.Object) 100.0f);
        boolean boolean34 = grayPaintScale10.equals((java.lang.Object) grayPaintScale23);
        double double35 = grayPaintScale10.getLowerBound();
        java.lang.Object obj36 = grayPaintScale10.clone();
        boolean boolean37 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj36", grayPaintScale10.equals(obj36) ? grayPaintScale10.hashCode() == obj36.hashCode() : true);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getUpperBound();
        double double10 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) (short) 10);
        double double13 = grayPaintScale6.getLowerBound();
        java.lang.Object obj14 = grayPaintScale6.clone();
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 1, 35.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean6 = grayPaintScale4.equals((java.lang.Object) "hi!");
        double double7 = grayPaintScale4.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean11 = grayPaintScale4.equals((java.lang.Object) 0.0d);
        double double12 = grayPaintScale4.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale4.getPaint(1.0d);
        java.lang.Object obj15 = grayPaintScale4.clone();
        boolean boolean16 = grayPaintScale2.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        double double21 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass25 = grayPaintScale24.getClass();
        boolean boolean26 = grayPaintScale14.equals((java.lang.Object) grayPaintScale24);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double28 = grayPaintScale14.getUpperBound();
        boolean boolean30 = grayPaintScale14.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint32 = grayPaintScale14.getPaint((double) (short) 0);
        double double33 = grayPaintScale14.getLowerBound();
        java.lang.Object obj34 = grayPaintScale14.clone();
        java.lang.Class<?> wildcardClass35 = grayPaintScale14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj34", grayPaintScale14.equals(obj34) ? grayPaintScale14.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        double double19 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale10.getPaint(0.0d);
        double double22 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint24 = grayPaintScale10.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean27 = grayPaintScale25.equals((java.lang.Object) "hi!");
        java.awt.Paint paint29 = grayPaintScale25.getPaint((double) 1);
        double double30 = grayPaintScale25.getUpperBound();
        double double31 = grayPaintScale25.getLowerBound();
        double double32 = grayPaintScale25.getUpperBound();
        java.lang.Class<?> wildcardClass33 = grayPaintScale25.getClass();
        boolean boolean34 = grayPaintScale10.equals((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale25", grayPaintScale10.equals(grayPaintScale25) ? grayPaintScale10.hashCode() == grayPaintScale25.hashCode() : true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) ' ', (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) (byte) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 0);
        boolean boolean19 = grayPaintScale12.equals((java.lang.Object) grayPaintScale13);
        double double20 = grayPaintScale12.getLowerBound();
        double double21 = grayPaintScale12.getLowerBound();
        double double22 = grayPaintScale12.getLowerBound();
        java.lang.Object obj23 = grayPaintScale12.clone();
        boolean boolean24 = grayPaintScale3.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale13", grayPaintScale3.equals(grayPaintScale13) ? grayPaintScale3.hashCode() == grayPaintScale13.hashCode() : true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        double double4 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale3.getPaint(0.0d);
        double double7 = grayPaintScale3.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.lang.Class<?> wildcardClass11 = grayPaintScale10.getClass();
        boolean boolean12 = grayPaintScale3.equals((java.lang.Object) wildcardClass11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale3.equals((java.lang.Object) double16);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) boolean17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 'a');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        double double12 = grayPaintScale7.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        double double11 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 10);
        java.lang.Object obj15 = grayPaintScale14.clone();
        boolean boolean16 = grayPaintScale8.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj15", grayPaintScale14.equals(obj15) ? grayPaintScale14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) (byte) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) '#');
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double20 = grayPaintScale19.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale19.getPaint((double) (short) -1);
        double double23 = grayPaintScale19.getLowerBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale19.getClass();
        boolean boolean25 = grayPaintScale10.equals((java.lang.Object) wildcardClass24);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        double double27 = grayPaintScale26.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale26.getPaint(0.0d);
        double double30 = grayPaintScale26.getLowerBound();
        boolean boolean31 = grayPaintScale10.equals((java.lang.Object) double30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale26", grayPaintScale10.equals(grayPaintScale26) ? grayPaintScale10.hashCode() == grayPaintScale26.hashCode() : true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) 100);
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) (byte) 100);
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getUpperBound();
        double double15 = grayPaintScale6.getLowerBound();
        double double16 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getLowerBound();
        double double21 = grayPaintScale17.getUpperBound();
        boolean boolean22 = grayPaintScale6.equals((java.lang.Object) double21);
        double double23 = grayPaintScale6.getUpperBound();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.awt.Paint paint26 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj27 = grayPaintScale2.clone();
        java.awt.Paint paint29 = grayPaintScale2.getPaint((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj27", grayPaintScale2.equals(obj27) ? grayPaintScale2.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double16 = grayPaintScale15.getLowerBound();
        double double17 = grayPaintScale15.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale15.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) 0.0d);
        double double28 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale20.getPaint(1.0d);
        boolean boolean31 = grayPaintScale15.equals((java.lang.Object) grayPaintScale20);
        boolean boolean32 = grayPaintScale0.equals((java.lang.Object) grayPaintScale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale20", grayPaintScale0.equals(grayPaintScale20) ? grayPaintScale0.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale4 = new org.jfree.chart.renderer.GrayPaintScale();
        double double5 = grayPaintScale4.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale4.getPaint(0.0d);
        java.awt.Paint paint9 = grayPaintScale4.getPaint((double) 1L);
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getLowerBound();
        double double10 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint12 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale0.equals(obj13);
        java.awt.Paint paint16 = grayPaintScale0.getPaint((double) 1L);
        java.lang.Object obj17 = grayPaintScale0.clone();
        java.awt.Paint paint19 = grayPaintScale0.getPaint((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj17", grayPaintScale0.equals(obj17) ? grayPaintScale0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 10);
        double double15 = grayPaintScale14.getLowerBound();
        java.lang.Object obj16 = grayPaintScale14.clone();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj16", grayPaintScale14.equals(obj16) ? grayPaintScale14.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        java.lang.Object obj11 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) 'a', (double) 100.0f);
        boolean boolean20 = grayPaintScale14.equals((java.lang.Object) 100.0f);
        double double21 = grayPaintScale14.getLowerBound();
        java.lang.Class<?> wildcardClass22 = grayPaintScale14.getClass();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj11", grayPaintScale2.equals(obj11) ? grayPaintScale2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        double double7 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.lang.Object obj32 = grayPaintScale2.clone();
        double double33 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj32", grayPaintScale2.equals(obj32) ? grayPaintScale2.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        double double9 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        boolean boolean13 = grayPaintScale0.equals((java.lang.Object) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint(0.0d);
        double double20 = grayPaintScale14.getUpperBound();
        java.lang.Object obj21 = null;
        boolean boolean22 = grayPaintScale14.equals(obj21);
        java.lang.Object obj23 = null;
        boolean boolean24 = grayPaintScale14.equals(obj23);
        double double25 = grayPaintScale14.getLowerBound();
        boolean boolean26 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale14", grayPaintScale0.equals(grayPaintScale14) ? grayPaintScale0.hashCode() == grayPaintScale14.hashCode() : true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getLowerBound();
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) 0);
        boolean boolean12 = grayPaintScale5.equals((java.lang.Object) grayPaintScale6);
        double double13 = grayPaintScale5.getLowerBound();
        double double14 = grayPaintScale5.getLowerBound();
        double double15 = grayPaintScale5.getLowerBound();
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) double15);
        double double17 = grayPaintScale2.getLowerBound();
        java.lang.Object obj18 = grayPaintScale2.clone();
        java.lang.Object obj19 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        double double20 = grayPaintScale10.getUpperBound();
        double double21 = grayPaintScale10.getLowerBound();
        double double22 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) (short) 10);
        java.lang.Object obj26 = grayPaintScale25.clone();
        boolean boolean27 = grayPaintScale10.equals((java.lang.Object) grayPaintScale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale25 and obj26", grayPaintScale25.equals(obj26) ? grayPaintScale25.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) '4');
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) (byte) 100);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) 100L);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) paint17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale15", grayPaintScale5.equals(grayPaintScale15) ? grayPaintScale5.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        double double8 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) (byte) 100);
        double double14 = grayPaintScale11.getUpperBound();
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) double14);
        java.lang.Object obj16 = grayPaintScale2.clone();
        double double17 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj16", grayPaintScale2.equals(obj16) ? grayPaintScale2.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) (byte) 1);
        double double19 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale10.getPaint((double) (short) 0);
        java.awt.Paint paint23 = grayPaintScale10.getPaint((double) 0);
        java.lang.Object obj24 = grayPaintScale10.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj24", grayPaintScale10.equals(obj24) ? grayPaintScale10.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getUpperBound();
        double double12 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        boolean boolean22 = grayPaintScale15.equals((java.lang.Object) paint21);
        double double23 = grayPaintScale15.getLowerBound();
        boolean boolean25 = grayPaintScale15.equals((java.lang.Object) 100.0f);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale15);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double30 = grayPaintScale29.getLowerBound();
        boolean boolean32 = grayPaintScale29.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint34 = grayPaintScale29.getPaint((double) (short) 0);
        java.awt.Paint paint36 = grayPaintScale29.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean39 = grayPaintScale37.equals((java.lang.Object) "hi!");
        double double40 = grayPaintScale37.getLowerBound();
        java.awt.Paint paint42 = grayPaintScale37.getPaint((double) 0);
        boolean boolean43 = grayPaintScale29.equals((java.lang.Object) grayPaintScale37);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale46 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double47 = grayPaintScale46.getLowerBound();
        java.awt.Paint paint49 = grayPaintScale46.getPaint((double) (short) -1);
        double double50 = grayPaintScale46.getLowerBound();
        java.lang.Class<?> wildcardClass51 = grayPaintScale46.getClass();
        boolean boolean52 = grayPaintScale37.equals((java.lang.Object) wildcardClass51);
        boolean boolean53 = grayPaintScale15.equals((java.lang.Object) grayPaintScale37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and grayPaintScale37", grayPaintScale16.equals(grayPaintScale37) ? grayPaintScale16.hashCode() == grayPaintScale37.hashCode() : true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 10.0f, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale2.equals(obj4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (byte) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 100L);
        double double5 = grayPaintScale2.getLowerBound();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) 0.0d);
        double double18 = grayPaintScale10.getUpperBound();
        boolean boolean20 = grayPaintScale10.equals((java.lang.Object) 10.0d);
        double double21 = grayPaintScale10.getUpperBound();
        double double22 = grayPaintScale10.getUpperBound();
        double double23 = grayPaintScale10.getUpperBound();
        boolean boolean24 = grayPaintScale9.equals((java.lang.Object) double23);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        boolean boolean31 = grayPaintScale27.equals((java.lang.Object) '4');
        boolean boolean32 = grayPaintScale9.equals((java.lang.Object) grayPaintScale27);
        java.awt.Paint paint34 = grayPaintScale27.getPaint(0.0d);
        boolean boolean35 = grayPaintScale2.equals((java.lang.Object) grayPaintScale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getLowerBound();
        double double21 = grayPaintScale2.getLowerBound();
        double double22 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint24 = grayPaintScale2.getPaint((double) (-1.0f));
        java.lang.Object obj25 = grayPaintScale2.clone();
        double double26 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj25", grayPaintScale2.equals(obj25) ? grayPaintScale2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) (short) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) (short) 0);
        double double13 = grayPaintScale2.getLowerBound();
        double double14 = grayPaintScale2.getUpperBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        double double13 = grayPaintScale2.getUpperBound();
        double double14 = grayPaintScale2.getUpperBound();
        java.lang.Object obj15 = grayPaintScale2.clone();
        java.lang.Object obj16 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) true);
        double double22 = grayPaintScale2.getLowerBound();
        java.lang.Object obj23 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        double double27 = grayPaintScale26.getUpperBound();
        double double28 = grayPaintScale26.getUpperBound();
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double6 = grayPaintScale5.getLowerBound();
        double double7 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale5.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) 0.0d);
        double double18 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale10.getPaint(1.0d);
        boolean boolean21 = grayPaintScale5.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint23 = grayPaintScale10.getPaint((double) 0L);
        double double24 = grayPaintScale10.getUpperBound();
        double double25 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint27 = grayPaintScale10.getPaint((double) (byte) 0);
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) paint27);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double32 = grayPaintScale31.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale35 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale38 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.lang.Class<?> wildcardClass39 = grayPaintScale38.getClass();
        boolean boolean40 = grayPaintScale35.equals((java.lang.Object) wildcardClass39);
        boolean boolean41 = grayPaintScale31.equals((java.lang.Object) grayPaintScale35);
        java.lang.Object obj42 = grayPaintScale35.clone();
        boolean boolean43 = grayPaintScale2.equals((java.lang.Object) grayPaintScale35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and grayPaintScale35", grayPaintScale5.equals(grayPaintScale35) ? grayPaintScale5.hashCode() == grayPaintScale35.hashCode() : true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint((double) (byte) 0);
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) (byte) 0);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        double double12 = grayPaintScale6.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint17 = grayPaintScale15.getPaint((double) (byte) 100);
        double double18 = grayPaintScale15.getUpperBound();
        boolean boolean19 = grayPaintScale6.equals((java.lang.Object) double18);
        double double20 = grayPaintScale6.getLowerBound();
        java.lang.Class<?> wildcardClass21 = grayPaintScale6.getClass();
        boolean boolean22 = grayPaintScale2.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale6", grayPaintScale2.equals(grayPaintScale6) ? grayPaintScale2.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        double double13 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) 0);
        java.awt.Paint paint19 = grayPaintScale2.getPaint((double) (short) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean22 = grayPaintScale20.equals((java.lang.Object) "hi!");
        double double23 = grayPaintScale20.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) 0.0d);
        double double28 = grayPaintScale20.getUpperBound();
        java.awt.Paint paint30 = grayPaintScale20.getPaint(1.0d);
        java.lang.Object obj31 = grayPaintScale20.clone();
        boolean boolean32 = grayPaintScale2.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale20", grayPaintScale3.equals(grayPaintScale20) ? grayPaintScale3.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) (byte) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        double double9 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint14 = grayPaintScale12.getPaint((double) 0);
        double double15 = grayPaintScale12.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) 10L);
        java.lang.Class<?> wildcardClass18 = paint17.getClass();
        boolean boolean19 = grayPaintScale3.equals((java.lang.Object) wildcardClass18);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) boolean19);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double24 = grayPaintScale23.getLowerBound();
        boolean boolean26 = grayPaintScale23.equals((java.lang.Object) (short) -1);
        double double27 = grayPaintScale23.getLowerBound();
        java.awt.Paint paint29 = grayPaintScale23.getPaint((double) (-1));
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) "hi!");
        double double33 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) 0);
        double double36 = grayPaintScale30.getUpperBound();
        double double37 = grayPaintScale30.getUpperBound();
        double double38 = grayPaintScale30.getUpperBound();
        double double39 = grayPaintScale30.getLowerBound();
        boolean boolean40 = grayPaintScale23.equals((java.lang.Object) grayPaintScale30);
        boolean boolean41 = grayPaintScale2.equals((java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and grayPaintScale30", grayPaintScale3.equals(grayPaintScale30) ? grayPaintScale3.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        double double11 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        double double16 = grayPaintScale14.getLowerBound();
        java.lang.Object obj17 = grayPaintScale14.clone();
        double double18 = grayPaintScale14.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj17", grayPaintScale14.equals(obj17) ? grayPaintScale14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        double double14 = grayPaintScale8.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint19 = grayPaintScale17.getPaint((double) (byte) 100);
        double double20 = grayPaintScale17.getUpperBound();
        boolean boolean21 = grayPaintScale8.equals((java.lang.Object) double20);
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) double20);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double26 = grayPaintScale25.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double30 = grayPaintScale29.getLowerBound();
        boolean boolean32 = grayPaintScale29.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint34 = grayPaintScale29.getPaint((double) (short) 0);
        java.awt.Paint paint36 = grayPaintScale29.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale37 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean39 = grayPaintScale37.equals((java.lang.Object) "hi!");
        double double40 = grayPaintScale37.getLowerBound();
        java.awt.Paint paint42 = grayPaintScale37.getPaint((double) 0);
        boolean boolean43 = grayPaintScale29.equals((java.lang.Object) grayPaintScale37);
        double double44 = grayPaintScale37.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale47 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass48 = grayPaintScale47.getClass();
        boolean boolean49 = grayPaintScale37.equals((java.lang.Object) grayPaintScale47);
        boolean boolean50 = grayPaintScale25.equals((java.lang.Object) grayPaintScale37);
        double double51 = grayPaintScale37.getUpperBound();
        boolean boolean53 = grayPaintScale37.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint55 = grayPaintScale37.getPaint((double) (short) 0);
        double double56 = grayPaintScale37.getLowerBound();
        java.lang.Object obj57 = grayPaintScale37.clone();
        boolean boolean58 = grayPaintScale0.equals((java.lang.Object) grayPaintScale37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale37", grayPaintScale0.equals(grayPaintScale37) ? grayPaintScale0.hashCode() == grayPaintScale37.hashCode() : true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        double double12 = grayPaintScale2.getLowerBound();
        double double13 = grayPaintScale2.getUpperBound();
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0);
        double double10 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) "hi!");
        double double14 = grayPaintScale11.getUpperBound();
        java.lang.Object obj15 = null;
        boolean boolean16 = grayPaintScale11.equals(obj15);
        double double17 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double21 = grayPaintScale20.getLowerBound();
        double double22 = grayPaintScale20.getLowerBound();
        double double23 = grayPaintScale20.getUpperBound();
        boolean boolean24 = grayPaintScale11.equals((java.lang.Object) double23);
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) double23);
        java.lang.Object obj26 = grayPaintScale2.clone();
        java.lang.Object obj27 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj26", grayPaintScale2.equals(obj26) ? grayPaintScale2.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint4 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(0.0d);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) 0);
        double double13 = grayPaintScale0.getLowerBound();
        java.lang.Object obj14 = grayPaintScale0.clone();
        double double15 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj14", grayPaintScale0.equals(obj14) ? grayPaintScale0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale13.getLowerBound();
        double double18 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '#');
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) (short) 0);
        java.lang.Class<?> wildcardClass24 = paint23.getClass();
        boolean boolean25 = grayPaintScale13.equals((java.lang.Object) paint23);
        double double26 = grayPaintScale13.getLowerBound();
        java.lang.Object obj27 = grayPaintScale13.clone();
        java.awt.Paint paint29 = grayPaintScale13.getPaint((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj27", grayPaintScale13.equals(obj27) ? grayPaintScale13.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale1 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean3 = grayPaintScale1.equals((java.lang.Object) "hi!");
        double double4 = grayPaintScale1.getUpperBound();
        double double5 = grayPaintScale1.getLowerBound();
        java.awt.Paint paint7 = grayPaintScale1.getPaint((double) (byte) 1);
        boolean boolean8 = grayPaintScale0.equals((java.lang.Object) grayPaintScale1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale1", grayPaintScale0.equals(grayPaintScale1) ? grayPaintScale0.hashCode() == grayPaintScale1.hashCode() : true);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = grayPaintScale6.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale6.equals((java.lang.Object) double16);
        double double18 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double22 = grayPaintScale21.getLowerBound();
        boolean boolean24 = grayPaintScale21.equals((java.lang.Object) (short) -1);
        double double25 = grayPaintScale21.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale28 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) "hi!");
        double double32 = grayPaintScale29.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale29.getPaint((double) 0);
        boolean boolean35 = grayPaintScale28.equals((java.lang.Object) paint34);
        java.lang.Class<?> wildcardClass36 = grayPaintScale28.getClass();
        boolean boolean37 = grayPaintScale21.equals((java.lang.Object) wildcardClass36);
        boolean boolean38 = grayPaintScale6.equals((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale29", grayPaintScale6.equals(grayPaintScale29) ? grayPaintScale6.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) '#');
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double8 = grayPaintScale7.getLowerBound();
        double double9 = grayPaintScale7.getLowerBound();
        java.lang.Object obj10 = grayPaintScale7.clone();
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = grayPaintScale0.equals(obj9);
        java.lang.Object obj11 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) 'a');
        double double17 = grayPaintScale14.getLowerBound();
        double double18 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean21 = grayPaintScale19.equals((java.lang.Object) "hi!");
        java.awt.Paint paint23 = grayPaintScale19.getPaint((double) 1);
        double double24 = grayPaintScale19.getUpperBound();
        boolean boolean25 = grayPaintScale14.equals((java.lang.Object) double24);
        java.lang.Object obj26 = grayPaintScale14.clone();
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) grayPaintScale14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean14 = grayPaintScale12.equals((java.lang.Object) "hi!");
        double double15 = grayPaintScale12.getLowerBound();
        double double16 = grayPaintScale12.getUpperBound();
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale20.equals((java.lang.Object) grayPaintScale21);
        double double28 = grayPaintScale20.getLowerBound();
        double double29 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale20.getPaint((double) 0L);
        java.lang.Class<?> wildcardClass32 = grayPaintScale20.getClass();
        boolean boolean33 = grayPaintScale12.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale12 and grayPaintScale21", grayPaintScale12.equals(grayPaintScale21) ? grayPaintScale12.hashCode() == grayPaintScale21.hashCode() : true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        java.awt.Paint paint18 = grayPaintScale2.getPaint((double) (byte) 1);
        java.lang.Object obj19 = grayPaintScale2.clone();
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale0.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) 10L, (double) ' ');
        java.lang.Object obj10 = grayPaintScale9.clone();
        boolean boolean11 = grayPaintScale0.equals(obj10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and obj10", grayPaintScale9.equals(obj10) ? grayPaintScale9.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double14 = grayPaintScale13.getUpperBound();
        double double15 = grayPaintScale13.getUpperBound();
        boolean boolean17 = grayPaintScale13.equals((java.lang.Object) (-1));
        double double18 = grayPaintScale13.getLowerBound();
        double double19 = grayPaintScale13.getLowerBound();
        java.lang.Object obj20 = grayPaintScale13.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj20", grayPaintScale13.equals(obj20) ? grayPaintScale13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(10.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double8 = grayPaintScale7.getLowerBound();
        boolean boolean10 = grayPaintScale7.equals((java.lang.Object) (short) -1);
        double double11 = grayPaintScale7.getLowerBound();
        double double12 = grayPaintScale7.getLowerBound();
        double double13 = grayPaintScale7.getLowerBound();
        java.lang.Object obj14 = grayPaintScale7.clone();
        boolean boolean15 = grayPaintScale2.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj14", grayPaintScale7.equals(obj14) ? grayPaintScale7.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        double double11 = grayPaintScale3.getUpperBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(1.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = grayPaintScale2.getPaint((double) (byte) 0);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        boolean boolean11 = grayPaintScale0.equals((java.lang.Object) grayPaintScale5);
        double double12 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale5.getPaint((double) (short) 0);
        java.lang.Object obj15 = grayPaintScale5.clone();
        double double16 = grayPaintScale5.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale5 and obj15", grayPaintScale5.equals(obj15) ? grayPaintScale5.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getLowerBound();
        boolean boolean7 = grayPaintScale2.equals((java.lang.Object) 100L);
        double double8 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint13 = grayPaintScale11.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        java.awt.Paint paint18 = grayPaintScale14.getPaint((double) 1);
        double double19 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        boolean boolean23 = grayPaintScale14.equals((java.lang.Object) (short) -1);
        double double24 = grayPaintScale14.getUpperBound();
        boolean boolean25 = grayPaintScale11.equals((java.lang.Object) double24);
        java.lang.Object obj26 = grayPaintScale11.clone();
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj26", grayPaintScale11.equals(obj26) ? grayPaintScale11.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) (byte) 100);
        boolean boolean12 = grayPaintScale6.equals((java.lang.Object) (byte) 100);
        double double13 = grayPaintScale6.getLowerBound();
        double double14 = grayPaintScale6.getUpperBound();
        double double15 = grayPaintScale6.getLowerBound();
        double double16 = grayPaintScale6.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getLowerBound();
        double double21 = grayPaintScale17.getUpperBound();
        boolean boolean22 = grayPaintScale6.equals((java.lang.Object) double21);
        double double23 = grayPaintScale6.getUpperBound();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double25 = grayPaintScale6.getLowerBound();
        java.lang.Object obj26 = grayPaintScale6.clone();
        java.awt.Paint paint28 = grayPaintScale6.getPaint(10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj26", grayPaintScale6.equals(obj26) ? grayPaintScale6.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale10.equals((java.lang.Object) 10.0f);
        double double19 = grayPaintScale10.getLowerBound();
        java.lang.Object obj20 = grayPaintScale10.clone();
        java.lang.Object obj21 = grayPaintScale10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj20", grayPaintScale10.equals(obj20) ? grayPaintScale10.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale9.getPaint(0.0d);
        java.lang.Class<?> wildcardClass15 = paint14.getClass();
        boolean boolean16 = grayPaintScale6.equals((java.lang.Object) wildcardClass15);
        boolean boolean17 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale();
        double double20 = grayPaintScale19.getUpperBound();
        double double21 = grayPaintScale19.getUpperBound();
        java.lang.Object obj22 = grayPaintScale19.clone();
        boolean boolean23 = grayPaintScale2.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj18", grayPaintScale2.equals(obj18) ? grayPaintScale2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        double double21 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass25 = grayPaintScale24.getClass();
        boolean boolean26 = grayPaintScale14.equals((java.lang.Object) grayPaintScale24);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double28 = grayPaintScale14.getUpperBound();
        boolean boolean30 = grayPaintScale14.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint32 = grayPaintScale14.getPaint((double) (short) 0);
        double double33 = grayPaintScale14.getLowerBound();
        java.lang.Object obj34 = grayPaintScale14.clone();
        double double35 = grayPaintScale14.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj34", grayPaintScale14.equals(obj34) ? grayPaintScale14.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 1.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass5 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        double double4 = grayPaintScale0.getUpperBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean10 = grayPaintScale0.equals((java.lang.Object) grayPaintScale8);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 10, (double) 100L);
        java.lang.Class<?> wildcardClass17 = grayPaintScale16.getClass();
        boolean boolean18 = grayPaintScale13.equals((java.lang.Object) wildcardClass17);
        boolean boolean19 = grayPaintScale0.equals((java.lang.Object) wildcardClass17);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10);
        java.awt.Paint paint24 = grayPaintScale22.getPaint(0.0d);
        java.awt.Paint paint26 = grayPaintScale22.getPaint((double) 1);
        boolean boolean27 = grayPaintScale0.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale22", grayPaintScale13.equals(grayPaintScale22) ? grayPaintScale13.hashCode() == grayPaintScale22.hashCode() : true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.lang.Object obj32 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj32", grayPaintScale2.equals(obj32) ? grayPaintScale2.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (short) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint12 = grayPaintScale10.getPaint((double) (byte) 100);
        boolean boolean13 = grayPaintScale7.equals((java.lang.Object) (byte) 100);
        double double14 = grayPaintScale7.getLowerBound();
        double double15 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double19 = grayPaintScale18.getLowerBound();
        boolean boolean21 = grayPaintScale18.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint23 = grayPaintScale18.getPaint((double) (short) 0);
        java.awt.Paint paint25 = grayPaintScale18.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean28 = grayPaintScale26.equals((java.lang.Object) "hi!");
        double double29 = grayPaintScale26.getLowerBound();
        java.awt.Paint paint31 = grayPaintScale26.getPaint((double) 0);
        boolean boolean32 = grayPaintScale18.equals((java.lang.Object) grayPaintScale26);
        boolean boolean34 = grayPaintScale18.equals((java.lang.Object) (byte) 1);
        double double35 = grayPaintScale18.getUpperBound();
        boolean boolean36 = grayPaintScale7.equals((java.lang.Object) double35);
        java.awt.Paint paint38 = grayPaintScale7.getPaint((double) 10);
        double double39 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint41 = grayPaintScale7.getPaint((double) 'a');
        double double42 = grayPaintScale7.getUpperBound();
        java.lang.Class<?> wildcardClass43 = grayPaintScale7.getClass();
        boolean boolean44 = grayPaintScale2.equals((java.lang.Object) wildcardClass43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale7", grayPaintScale2.equals(grayPaintScale7) ? grayPaintScale2.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        double double10 = grayPaintScale2.getLowerBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = null;
        boolean boolean13 = grayPaintScale2.equals(obj12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        double double9 = grayPaintScale0.getUpperBound();
        java.lang.Object obj10 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) "hi!");
        double double14 = grayPaintScale11.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale11.getPaint(0.0d);
        double double17 = grayPaintScale11.getUpperBound();
        java.lang.Object obj18 = null;
        boolean boolean19 = grayPaintScale11.equals(obj18);
        java.lang.Object obj20 = null;
        boolean boolean21 = grayPaintScale11.equals(obj20);
        double double22 = grayPaintScale11.getLowerBound();
        java.lang.Class<?> wildcardClass23 = grayPaintScale11.getClass();
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) grayPaintScale11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj10", grayPaintScale0.equals(obj10) ? grayPaintScale0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0);
        double double5 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) 10L);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0L);
        java.lang.Object obj10 = null;
        boolean boolean11 = grayPaintScale2.equals(obj10);
        java.awt.Paint paint13 = grayPaintScale2.getPaint(0.0d);
        java.lang.Object obj14 = grayPaintScale2.clone();
        double double15 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        java.lang.Object obj3 = grayPaintScale0.clone();
        double double4 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj3", grayPaintScale0.equals(obj3) ? grayPaintScale0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint11 = grayPaintScale9.getPaint((double) 0);
        double double12 = grayPaintScale9.getUpperBound();
        double double13 = grayPaintScale9.getUpperBound();
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) grayPaintScale9);
        double double15 = grayPaintScale2.getUpperBound();
        double double16 = grayPaintScale2.getLowerBound();
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass18 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint20 = grayPaintScale10.getPaint((double) (short) 1);
        java.lang.Object obj21 = grayPaintScale10.clone();
        double double22 = grayPaintScale10.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj21", grayPaintScale10.equals(obj21) ? grayPaintScale10.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0);
        double double10 = grayPaintScale2.getUpperBound();
        double double11 = grayPaintScale2.getUpperBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        java.lang.Object obj13 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        double double6 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        double double12 = grayPaintScale7.getUpperBound();
        double double13 = grayPaintScale7.getLowerBound();
        double double14 = grayPaintScale7.getLowerBound();
        double double15 = grayPaintScale7.getUpperBound();
        double double16 = grayPaintScale7.getLowerBound();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale7", grayPaintScale0.equals(grayPaintScale7) ? grayPaintScale0.hashCode() == grayPaintScale7.hashCode() : true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        boolean boolean22 = grayPaintScale6.equals((java.lang.Object) (byte) 1);
        double double23 = grayPaintScale6.getUpperBound();
        boolean boolean24 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double28 = grayPaintScale27.getLowerBound();
        double double29 = grayPaintScale27.getLowerBound();
        double double30 = grayPaintScale27.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double34 = grayPaintScale33.getLowerBound();
        boolean boolean36 = grayPaintScale33.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint38 = grayPaintScale33.getPaint((double) (short) 0);
        java.awt.Paint paint40 = grayPaintScale33.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean43 = grayPaintScale41.equals((java.lang.Object) "hi!");
        double double44 = grayPaintScale41.getLowerBound();
        java.awt.Paint paint46 = grayPaintScale41.getPaint((double) 0);
        boolean boolean47 = grayPaintScale33.equals((java.lang.Object) grayPaintScale41);
        java.awt.Paint paint49 = grayPaintScale41.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale52 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean53 = grayPaintScale41.equals((java.lang.Object) '#');
        boolean boolean54 = grayPaintScale27.equals((java.lang.Object) grayPaintScale41);
        double double55 = grayPaintScale41.getUpperBound();
        boolean boolean56 = grayPaintScale2.equals((java.lang.Object) double55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and grayPaintScale33", grayPaintScale6.equals(grayPaintScale33) ? grayPaintScale6.hashCode() == grayPaintScale33.hashCode() : true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) 0);
        double double13 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double17 = grayPaintScale16.getLowerBound();
        double double18 = grayPaintScale16.getLowerBound();
        double double19 = grayPaintScale16.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double23 = grayPaintScale22.getLowerBound();
        boolean boolean25 = grayPaintScale22.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (short) 0);
        java.awt.Paint paint29 = grayPaintScale22.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) "hi!");
        double double33 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) 0);
        boolean boolean36 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        java.awt.Paint paint38 = grayPaintScale30.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean42 = grayPaintScale30.equals((java.lang.Object) '#');
        boolean boolean43 = grayPaintScale16.equals((java.lang.Object) grayPaintScale30);
        java.lang.Object obj44 = grayPaintScale16.clone();
        boolean boolean45 = grayPaintScale0.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale30", grayPaintScale0.equals(grayPaintScale30) ? grayPaintScale0.hashCode() == grayPaintScale30.hashCode() : true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        boolean boolean22 = grayPaintScale8.equals((java.lang.Object) grayPaintScale16);
        java.awt.Paint paint24 = grayPaintScale16.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean28 = grayPaintScale16.equals((java.lang.Object) '#');
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        double double30 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale31 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean33 = grayPaintScale31.equals((java.lang.Object) "hi!");
        java.awt.Paint paint35 = grayPaintScale31.getPaint((double) 1);
        double double36 = grayPaintScale31.getUpperBound();
        double double37 = grayPaintScale31.getLowerBound();
        double double38 = grayPaintScale31.getLowerBound();
        double double39 = grayPaintScale31.getLowerBound();
        double double40 = grayPaintScale31.getUpperBound();
        boolean boolean41 = grayPaintScale2.equals((java.lang.Object) grayPaintScale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale16 and grayPaintScale31", grayPaintScale16.equals(grayPaintScale31) ? grayPaintScale16.hashCode() == grayPaintScale31.hashCode() : true);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(1.0d);
        java.lang.Object obj11 = grayPaintScale0.clone();
        java.lang.Object obj12 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj11", grayPaintScale0.equals(obj11) ? grayPaintScale0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        double double21 = grayPaintScale14.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass25 = grayPaintScale24.getClass();
        boolean boolean26 = grayPaintScale14.equals((java.lang.Object) grayPaintScale24);
        boolean boolean27 = grayPaintScale2.equals((java.lang.Object) grayPaintScale14);
        double double28 = grayPaintScale14.getUpperBound();
        boolean boolean30 = grayPaintScale14.equals((java.lang.Object) (short) 0);
        java.awt.Paint paint32 = grayPaintScale14.getPaint((double) (short) 0);
        java.lang.Object obj33 = grayPaintScale14.clone();
        double double34 = grayPaintScale14.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj33", grayPaintScale14.equals(obj33) ? grayPaintScale14.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.awt.Paint paint18 = grayPaintScale10.getPaint((double) 0.0f);
        double double19 = grayPaintScale10.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale23 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean25 = grayPaintScale23.equals((java.lang.Object) "hi!");
        java.awt.Paint paint27 = grayPaintScale23.getPaint((double) 1);
        java.awt.Paint paint29 = grayPaintScale23.getPaint(0.0d);
        boolean boolean30 = grayPaintScale22.equals((java.lang.Object) 0.0d);
        double double31 = grayPaintScale22.getUpperBound();
        java.lang.Class<?> wildcardClass32 = grayPaintScale22.getClass();
        boolean boolean33 = grayPaintScale10.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and grayPaintScale23", grayPaintScale10.equals(grayPaintScale23) ? grayPaintScale10.hashCode() == grayPaintScale23.hashCode() : true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale2.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale2.getPaint((-1.0d));
        java.lang.Object obj20 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj20", grayPaintScale2.equals(obj20) ? grayPaintScale2.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        double double8 = grayPaintScale0.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint(0.0d);
        double double9 = grayPaintScale3.getLowerBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        java.lang.Object obj11 = grayPaintScale3.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale3 and obj11", grayPaintScale3.equals(obj11) ? grayPaintScale3.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 100.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double13 = grayPaintScale12.getLowerBound();
        boolean boolean15 = grayPaintScale12.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint17 = grayPaintScale12.getPaint((double) (short) 0);
        boolean boolean19 = grayPaintScale12.equals((java.lang.Object) 0.0d);
        double double20 = grayPaintScale12.getLowerBound();
        double double21 = grayPaintScale12.getLowerBound();
        double double22 = grayPaintScale12.getUpperBound();
        double double23 = grayPaintScale12.getLowerBound();
        double double24 = grayPaintScale12.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale25 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean27 = grayPaintScale25.equals((java.lang.Object) 1.0f);
        double double28 = grayPaintScale25.getLowerBound();
        double double29 = grayPaintScale25.getLowerBound();
        double double30 = grayPaintScale25.getLowerBound();
        double double31 = grayPaintScale25.getLowerBound();
        boolean boolean32 = grayPaintScale12.equals((java.lang.Object) grayPaintScale25);
        double double33 = grayPaintScale12.getLowerBound();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) double33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        double double17 = grayPaintScale10.getLowerBound();
        double double18 = grayPaintScale10.getLowerBound();
        java.lang.Object obj19 = grayPaintScale10.clone();
        java.awt.Paint paint21 = grayPaintScale10.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale10 and obj19", grayPaintScale10.equals(obj19) ? grayPaintScale10.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getLowerBound();
        double double7 = grayPaintScale0.getLowerBound();
        double double8 = grayPaintScale0.getLowerBound();
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale13.getLowerBound();
        double double18 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) (byte) 10);
        java.awt.Paint paint23 = grayPaintScale21.getPaint((double) 0.0f);
        double double24 = grayPaintScale21.getLowerBound();
        double double25 = grayPaintScale21.getUpperBound();
        boolean boolean26 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        java.lang.Object obj27 = grayPaintScale13.clone();
        double double28 = grayPaintScale13.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj27", grayPaintScale13.equals(obj27) ? grayPaintScale13.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean11 = grayPaintScale9.equals((java.lang.Object) "hi!");
        double double12 = grayPaintScale9.getLowerBound();
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) 0);
        double double15 = grayPaintScale9.getUpperBound();
        java.lang.Class<?> wildcardClass16 = grayPaintScale9.getClass();
        boolean boolean17 = grayPaintScale0.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean7 = grayPaintScale5.equals((java.lang.Object) "hi!");
        double double8 = grayPaintScale5.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) 0);
        double double11 = grayPaintScale5.getUpperBound();
        java.lang.Class<?> wildcardClass12 = grayPaintScale5.getClass();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) 'a');
        double double5 = grayPaintScale2.getLowerBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        java.awt.Paint paint11 = grayPaintScale7.getPaint((double) 1);
        double double12 = grayPaintScale7.getUpperBound();
        boolean boolean13 = grayPaintScale2.equals((java.lang.Object) double12);
        java.lang.Object obj14 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass15 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj14", grayPaintScale2.equals(obj14) ? grayPaintScale2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(1.0d);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (byte) 1);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getLowerBound();
        java.lang.Object obj6 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale19 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.awt.Paint paint21 = grayPaintScale19.getPaint(35.0d);
        boolean boolean22 = grayPaintScale9.equals((java.lang.Object) grayPaintScale19);
        boolean boolean23 = grayPaintScale0.equals((java.lang.Object) grayPaintScale19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) 1.0f);
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = grayPaintScale0.clone();
        double double5 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj4", grayPaintScale0.equals(obj4) ? grayPaintScale0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 0);
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) grayPaintScale13);
        java.lang.Object obj20 = grayPaintScale13.clone();
        boolean boolean21 = grayPaintScale2.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and obj20", grayPaintScale13.equals(obj20) ? grayPaintScale13.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 100.0f);
        java.awt.Paint paint7 = grayPaintScale5.getPaint((double) (byte) 100);
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) (byte) 100);
        double double9 = grayPaintScale2.getLowerBound();
        double double10 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double14 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale13.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) (short) 0);
        java.awt.Paint paint20 = grayPaintScale13.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale21 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean23 = grayPaintScale21.equals((java.lang.Object) "hi!");
        double double24 = grayPaintScale21.getLowerBound();
        java.awt.Paint paint26 = grayPaintScale21.getPaint((double) 0);
        boolean boolean27 = grayPaintScale13.equals((java.lang.Object) grayPaintScale21);
        boolean boolean29 = grayPaintScale13.equals((java.lang.Object) (byte) 1);
        double double30 = grayPaintScale13.getUpperBound();
        boolean boolean31 = grayPaintScale2.equals((java.lang.Object) double30);
        java.awt.Paint paint33 = grayPaintScale2.getPaint((double) 10);
        double double34 = grayPaintScale2.getUpperBound();
        double double35 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean38 = grayPaintScale36.equals((java.lang.Object) "hi!");
        double double39 = grayPaintScale36.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean43 = grayPaintScale36.equals((java.lang.Object) 0.0d);
        double double44 = grayPaintScale36.getUpperBound();
        boolean boolean46 = grayPaintScale36.equals((java.lang.Object) 10.0d);
        java.lang.Object obj47 = grayPaintScale36.clone();
        boolean boolean48 = grayPaintScale2.equals(obj47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale42", grayPaintScale13.equals(grayPaintScale42) ? grayPaintScale13.hashCode() == grayPaintScale42.hashCode() : true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean7 = grayPaintScale0.equals((java.lang.Object) 0.0d);
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint(1.0d);
        java.awt.Paint paint12 = grayPaintScale0.getPaint((double) (byte) 1);
        java.lang.Object obj13 = null;
        boolean boolean14 = grayPaintScale0.equals(obj13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) (short) -1);
        double double20 = grayPaintScale17.getLowerBound();
        java.lang.Object obj21 = grayPaintScale17.clone();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) grayPaintScale17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale17 and obj21", grayPaintScale17.equals(obj21) ? grayPaintScale17.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 0.0f);
        boolean boolean17 = grayPaintScale11.equals((java.lang.Object) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        double double19 = grayPaintScale18.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale18.getPaint(0.0d);
        boolean boolean22 = grayPaintScale11.equals((java.lang.Object) grayPaintScale18);
        double double23 = grayPaintScale18.getUpperBound();
        boolean boolean24 = grayPaintScale0.equals((java.lang.Object) double23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getUpperBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) 0.0d);
        double double18 = grayPaintScale10.getUpperBound();
        java.awt.Paint paint20 = grayPaintScale10.getPaint(1.0d);
        java.awt.Paint paint22 = grayPaintScale10.getPaint((double) (byte) 1);
        double double23 = grayPaintScale10.getUpperBound();
        java.lang.Object obj24 = grayPaintScale10.clone();
        boolean boolean25 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getUpperBound();
        double double8 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint10 = grayPaintScale0.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        double double15 = grayPaintScale13.getLowerBound();
        boolean boolean16 = grayPaintScale0.equals((java.lang.Object) grayPaintScale13);
        double double17 = grayPaintScale13.getLowerBound();
        double double18 = grayPaintScale13.getUpperBound();
        double double19 = grayPaintScale13.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale20 = new org.jfree.chart.renderer.GrayPaintScale();
        double double21 = grayPaintScale20.getLowerBound();
        java.awt.Paint paint23 = grayPaintScale20.getPaint(0.0d);
        double double24 = grayPaintScale20.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        java.lang.Class<?> wildcardClass28 = grayPaintScale27.getClass();
        boolean boolean29 = grayPaintScale20.equals((java.lang.Object) wildcardClass28);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 0);
        double double33 = grayPaintScale32.getUpperBound();
        boolean boolean34 = grayPaintScale20.equals((java.lang.Object) double33);
        double double35 = grayPaintScale20.getLowerBound();
        boolean boolean36 = grayPaintScale13.equals((java.lang.Object) grayPaintScale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale20", grayPaintScale0.equals(grayPaintScale20) ? grayPaintScale0.hashCode() == grayPaintScale20.hashCode() : true);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (short) 100);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getLowerBound();
        java.lang.Object obj7 = grayPaintScale2.clone();
        java.lang.Object obj8 = null;
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) paint8);
        double double10 = grayPaintScale2.getLowerBound();
        boolean boolean12 = grayPaintScale2.equals((java.lang.Object) 100.0f);
        java.lang.Object obj13 = grayPaintScale2.clone();
        double double14 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj13", grayPaintScale2.equals(obj13) ? grayPaintScale2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 1.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double8 = grayPaintScale7.getLowerBound();
        java.awt.Paint paint10 = grayPaintScale7.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        double double12 = grayPaintScale11.getLowerBound();
        double double13 = grayPaintScale11.getLowerBound();
        double double14 = grayPaintScale11.getUpperBound();
        boolean boolean15 = grayPaintScale7.equals((java.lang.Object) grayPaintScale11);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale11);
        java.lang.Object obj17 = grayPaintScale11.clone();
        double double18 = grayPaintScale11.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale11 and obj17", grayPaintScale11.equals(obj17) ? grayPaintScale11.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getLowerBound();
        double double3 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj6 = grayPaintScale0.clone();
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj6", grayPaintScale0.equals(obj6) ? grayPaintScale0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        double double1 = grayPaintScale0.getUpperBound();
        double double2 = grayPaintScale0.getUpperBound();
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        double double5 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean8 = grayPaintScale6.equals((java.lang.Object) "hi!");
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean11 = grayPaintScale6.equals((java.lang.Object) (-1.0d));
        double double12 = grayPaintScale6.getUpperBound();
        java.awt.Paint paint14 = grayPaintScale6.getPaint((double) (byte) 1);
        boolean boolean15 = grayPaintScale0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale6", grayPaintScale0.equals(grayPaintScale6) ? grayPaintScale0.hashCode() == grayPaintScale6.hashCode() : true);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) '4');
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale2.getPaint((double) 0.0f);
        java.awt.Paint paint10 = grayPaintScale2.getPaint((double) (short) 10);
        java.awt.Paint paint12 = grayPaintScale2.getPaint((double) (short) -1);
        java.awt.Paint paint14 = grayPaintScale2.getPaint((double) (byte) 10);
        java.lang.Object obj15 = grayPaintScale2.clone();
        double double16 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint8 = grayPaintScale6.getPaint((double) (short) -1);
        java.awt.Paint paint10 = grayPaintScale6.getPaint((double) 0);
        double double11 = grayPaintScale6.getLowerBound();
        boolean boolean12 = grayPaintScale0.equals((java.lang.Object) double11);
        java.lang.Object obj13 = grayPaintScale0.clone();
        java.lang.Object obj14 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj13", grayPaintScale0.equals(obj13) ? grayPaintScale0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean10 = grayPaintScale3.equals((java.lang.Object) 0.0d);
        boolean boolean11 = grayPaintScale2.equals((java.lang.Object) 0.0d);
        double double12 = grayPaintScale2.getUpperBound();
        double double13 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double17 = grayPaintScale16.getUpperBound();
        double double18 = grayPaintScale16.getLowerBound();
        java.lang.Object obj19 = grayPaintScale16.clone();
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale9 and grayPaintScale16", grayPaintScale9.equals(grayPaintScale16) ? grayPaintScale9.hashCode() == grayPaintScale16.hashCode() : true);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        double double6 = grayPaintScale5.getUpperBound();
        java.lang.Object obj7 = grayPaintScale5.clone();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale5", grayPaintScale2.equals(grayPaintScale5) ? grayPaintScale2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        double double11 = grayPaintScale2.getLowerBound();
        java.lang.Object obj12 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 0);
        double double19 = grayPaintScale13.getUpperBound();
        double double20 = grayPaintScale13.getUpperBound();
        double double21 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint23 = grayPaintScale13.getPaint((double) (byte) 0);
        double double24 = grayPaintScale13.getUpperBound();
        java.awt.Paint paint26 = grayPaintScale13.getPaint(0.0d);
        double double27 = grayPaintScale13.getLowerBound();
        double double28 = grayPaintScale13.getUpperBound();
        double double29 = grayPaintScale13.getLowerBound();
        boolean boolean30 = grayPaintScale2.equals((java.lang.Object) double29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj12", grayPaintScale2.equals(obj12) ? grayPaintScale2.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getLowerBound();
        double double8 = grayPaintScale2.getLowerBound();
        java.lang.Object obj9 = grayPaintScale2.clone();
        double double10 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj9", grayPaintScale2.equals(obj9) ? grayPaintScale2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) true);
        double double22 = grayPaintScale2.getLowerBound();
        java.lang.Object obj23 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj23", grayPaintScale2.equals(obj23) ? grayPaintScale2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), (double) 100L);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        boolean boolean9 = grayPaintScale5.equals((java.lang.Object) '4');
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale5);
        double double11 = grayPaintScale5.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint16 = grayPaintScale14.getPaint((double) 0);
        double double17 = grayPaintScale14.getUpperBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 10L);
        java.awt.Paint paint21 = grayPaintScale14.getPaint((double) 0L);
        double double22 = grayPaintScale14.getLowerBound();
        java.lang.Object obj23 = grayPaintScale14.clone();
        boolean boolean24 = grayPaintScale5.equals(obj23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale14 and obj23", grayPaintScale14.equals(obj23) ? grayPaintScale14.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0, 35.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getUpperBound();
        double double7 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint9 = grayPaintScale3.getPaint((double) (byte) 1);
        double double10 = grayPaintScale3.getLowerBound();
        double double11 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint13 = grayPaintScale3.getPaint(0.0d);
        boolean boolean14 = grayPaintScale2.equals((java.lang.Object) paint13);
        java.lang.Object obj15 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double19 = grayPaintScale18.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale22 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double23 = grayPaintScale22.getLowerBound();
        boolean boolean25 = grayPaintScale22.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint27 = grayPaintScale22.getPaint((double) (short) 0);
        java.awt.Paint paint29 = grayPaintScale22.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean32 = grayPaintScale30.equals((java.lang.Object) "hi!");
        double double33 = grayPaintScale30.getLowerBound();
        java.awt.Paint paint35 = grayPaintScale30.getPaint((double) 0);
        boolean boolean36 = grayPaintScale22.equals((java.lang.Object) grayPaintScale30);
        double double37 = grayPaintScale30.getLowerBound();
        double double38 = grayPaintScale30.getLowerBound();
        double double39 = grayPaintScale30.getUpperBound();
        boolean boolean40 = grayPaintScale18.equals((java.lang.Object) double39);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale43 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, 1.0d);
        double double44 = grayPaintScale43.getLowerBound();
        boolean boolean45 = grayPaintScale18.equals((java.lang.Object) grayPaintScale43);
        boolean boolean46 = grayPaintScale2.equals((java.lang.Object) grayPaintScale43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj15", grayPaintScale2.equals(obj15) ? grayPaintScale2.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        java.lang.Object obj6 = grayPaintScale2.clone();
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj6", grayPaintScale2.equals(obj6) ? grayPaintScale2.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) true);
        java.lang.Object obj22 = grayPaintScale2.clone();
        double double23 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj22", grayPaintScale2.equals(obj22) ? grayPaintScale2.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean9 = grayPaintScale2.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale7 and obj8", grayPaintScale7.equals(obj8) ? grayPaintScale7.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 0.0f, (double) 10.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.lang.Object obj5 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.lang.Object obj3 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 100);
        java.lang.Class<?> wildcardClass7 = grayPaintScale6.getClass();
        boolean boolean8 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        double double4 = grayPaintScale0.getLowerBound();
        boolean boolean6 = grayPaintScale0.equals((java.lang.Object) (short) 10);
        double double7 = grayPaintScale0.getLowerBound();
        java.lang.Object obj8 = grayPaintScale0.clone();
        double double9 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj8", grayPaintScale0.equals(obj8) ? grayPaintScale0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 10.0f);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        double double6 = grayPaintScale2.getLowerBound();
        double double7 = grayPaintScale2.getUpperBound();
        java.lang.Object obj8 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass9 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj8", grayPaintScale2.equals(obj8) ? grayPaintScale2.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getUpperBound();
        java.lang.Object obj4 = null;
        boolean boolean5 = grayPaintScale0.equals(obj4);
        double double6 = grayPaintScale0.getUpperBound();
        java.awt.Paint paint8 = grayPaintScale0.getPaint(0.0d);
        java.lang.Object obj9 = grayPaintScale0.clone();
        double double10 = grayPaintScale0.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj9", grayPaintScale0.equals(obj9) ? grayPaintScale0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        java.awt.Paint paint4 = grayPaintScale0.getPaint((double) 1);
        double double5 = grayPaintScale0.getUpperBound();
        double double6 = grayPaintScale0.getUpperBound();
        double double7 = grayPaintScale0.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale11 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean13 = grayPaintScale11.equals((java.lang.Object) "hi!");
        double double14 = grayPaintScale11.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean18 = grayPaintScale11.equals((java.lang.Object) 0.0d);
        boolean boolean19 = grayPaintScale10.equals((java.lang.Object) 0.0d);
        double double20 = grayPaintScale10.getUpperBound();
        double double21 = grayPaintScale10.getUpperBound();
        boolean boolean22 = grayPaintScale0.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and grayPaintScale11", grayPaintScale0.equals(grayPaintScale11) ? grayPaintScale0.hashCode() == grayPaintScale11.hashCode() : true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale3 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean5 = grayPaintScale3.equals((java.lang.Object) "hi!");
        double double6 = grayPaintScale3.getLowerBound();
        java.awt.Paint paint8 = grayPaintScale3.getPaint((double) 0);
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale3);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, 52.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double16 = grayPaintScale15.getLowerBound();
        boolean boolean18 = grayPaintScale15.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint20 = grayPaintScale15.getPaint((double) (short) 0);
        boolean boolean22 = grayPaintScale15.equals((java.lang.Object) 0.0d);
        double double23 = grayPaintScale15.getLowerBound();
        java.lang.Class<?> wildcardClass24 = grayPaintScale15.getClass();
        boolean boolean25 = grayPaintScale12.equals((java.lang.Object) wildcardClass24);
        boolean boolean26 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale15", grayPaintScale2.equals(grayPaintScale15) ? grayPaintScale2.hashCode() == grayPaintScale15.hashCode() : true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 1.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double6 = grayPaintScale5.getLowerBound();
        boolean boolean8 = grayPaintScale5.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint10 = grayPaintScale5.getPaint((double) (short) 0);
        java.awt.Paint paint12 = grayPaintScale5.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean15 = grayPaintScale13.equals((java.lang.Object) "hi!");
        double double16 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint18 = grayPaintScale13.getPaint((double) 0);
        boolean boolean19 = grayPaintScale5.equals((java.lang.Object) grayPaintScale13);
        boolean boolean21 = grayPaintScale13.equals((java.lang.Object) 10.0f);
        double double22 = grayPaintScale13.getLowerBound();
        double double23 = grayPaintScale13.getLowerBound();
        double double24 = grayPaintScale13.getUpperBound();
        double double25 = grayPaintScale13.getLowerBound();
        double double26 = grayPaintScale13.getUpperBound();
        double double27 = grayPaintScale13.getLowerBound();
        boolean boolean28 = grayPaintScale2.equals((java.lang.Object) grayPaintScale13);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale29 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean31 = grayPaintScale29.equals((java.lang.Object) "hi!");
        double double32 = grayPaintScale29.getLowerBound();
        java.awt.Paint paint34 = grayPaintScale29.getPaint((double) 0);
        double double35 = grayPaintScale29.getUpperBound();
        double double36 = grayPaintScale29.getUpperBound();
        double double37 = grayPaintScale29.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale29.getPaint((double) (byte) 0);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale42 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double43 = grayPaintScale42.getLowerBound();
        double double44 = grayPaintScale42.getLowerBound();
        boolean boolean45 = grayPaintScale29.equals((java.lang.Object) grayPaintScale42);
        double double46 = grayPaintScale42.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale49 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) '#');
        boolean boolean51 = grayPaintScale49.equals((java.lang.Object) 0.0d);
        java.awt.Paint paint53 = grayPaintScale49.getPaint((double) (byte) 1);
        boolean boolean54 = grayPaintScale42.equals((java.lang.Object) grayPaintScale49);
        boolean boolean55 = grayPaintScale13.equals((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale13 and grayPaintScale29", grayPaintScale13.equals(grayPaintScale29) ? grayPaintScale13.hashCode() == grayPaintScale29.hashCode() : true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.awt.Paint paint14 = grayPaintScale12.getPaint(35.0d);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double16 = grayPaintScale2.getUpperBound();
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale2.getPaint((double) (short) -1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale();
        double double7 = grayPaintScale6.getLowerBound();
        double double8 = grayPaintScale6.getLowerBound();
        double double9 = grayPaintScale6.getUpperBound();
        boolean boolean10 = grayPaintScale2.equals((java.lang.Object) grayPaintScale6);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = grayPaintScale6.equals(obj11);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale15 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) (byte) 0);
        double double16 = grayPaintScale15.getUpperBound();
        boolean boolean17 = grayPaintScale6.equals((java.lang.Object) double16);
        double double18 = grayPaintScale6.getLowerBound();
        java.lang.Object obj19 = grayPaintScale6.clone();
        double double20 = grayPaintScale6.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale6 and obj19", grayPaintScale6.equals(obj19) ? grayPaintScale6.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        double double5 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        boolean boolean22 = grayPaintScale8.equals((java.lang.Object) grayPaintScale16);
        java.awt.Paint paint24 = grayPaintScale16.getPaint((double) (byte) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale((double) '#', (double) 100);
        boolean boolean28 = grayPaintScale16.equals((java.lang.Object) '#');
        boolean boolean29 = grayPaintScale2.equals((java.lang.Object) grayPaintScale16);
        java.lang.Object obj30 = grayPaintScale16.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale33 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint35 = grayPaintScale33.getPaint((double) 0);
        double double36 = grayPaintScale33.getUpperBound();
        java.awt.Paint paint38 = grayPaintScale33.getPaint((double) 10L);
        boolean boolean39 = grayPaintScale16.equals((java.lang.Object) paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale33", grayPaintScale2.equals(grayPaintScale33) ? grayPaintScale2.hashCode() == grayPaintScale33.hashCode() : true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        double double8 = grayPaintScale2.getUpperBound();
        double double9 = grayPaintScale2.getLowerBound();
        java.lang.Object obj10 = grayPaintScale2.clone();
        double double11 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj10", grayPaintScale2.equals(obj10) ? grayPaintScale2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        double double19 = grayPaintScale2.getLowerBound();
        double double20 = grayPaintScale2.getLowerBound();
        java.lang.Object obj21 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass22 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj21", grayPaintScale2.equals(obj21) ? grayPaintScale2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double3 = grayPaintScale2.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale6 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double7 = grayPaintScale6.getLowerBound();
        boolean boolean9 = grayPaintScale6.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint11 = grayPaintScale6.getPaint((double) (short) 0);
        java.awt.Paint paint13 = grayPaintScale6.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale14 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean16 = grayPaintScale14.equals((java.lang.Object) "hi!");
        double double17 = grayPaintScale14.getLowerBound();
        java.awt.Paint paint19 = grayPaintScale14.getPaint((double) 0);
        boolean boolean20 = grayPaintScale6.equals((java.lang.Object) grayPaintScale14);
        boolean boolean22 = grayPaintScale14.equals((java.lang.Object) 10.0f);
        double double23 = grayPaintScale14.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale26 = new org.jfree.chart.renderer.GrayPaintScale((double) 1, (double) '#');
        boolean boolean27 = grayPaintScale14.equals((java.lang.Object) 1);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale30 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.lang.Class<?> wildcardClass31 = grayPaintScale30.getClass();
        boolean boolean32 = grayPaintScale14.equals((java.lang.Object) grayPaintScale30);
        java.lang.Class<?> wildcardClass33 = grayPaintScale14.getClass();
        boolean boolean34 = grayPaintScale2.equals((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj35", grayPaintScale2.equals(obj35) ? grayPaintScale2.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getLowerBound();
        java.awt.Paint paint15 = grayPaintScale10.getPaint((double) 0);
        boolean boolean16 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        java.lang.Object obj17 = grayPaintScale2.clone();
        java.lang.Object obj18 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) 0, (double) 10);
        boolean boolean4 = grayPaintScale2.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Object obj6 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        boolean boolean6 = grayPaintScale2.equals((java.lang.Object) (-1));
        java.lang.Object obj7 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double14 = grayPaintScale13.getLowerBound();
        java.awt.Paint paint16 = grayPaintScale13.getPaint((double) (short) -1);
        double double17 = grayPaintScale13.getLowerBound();
        java.lang.Class<?> wildcardClass18 = grayPaintScale13.getClass();
        boolean boolean19 = grayPaintScale10.equals((java.lang.Object) wildcardClass18);
        boolean boolean20 = grayPaintScale2.equals((java.lang.Object) grayPaintScale10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj7", grayPaintScale2.equals(obj7) ? grayPaintScale2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 10);
        double double3 = grayPaintScale2.getLowerBound();
        double double4 = grayPaintScale2.getLowerBound();
        java.awt.Paint paint6 = grayPaintScale2.getPaint(0.0d);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean9 = grayPaintScale7.equals((java.lang.Object) "hi!");
        double double10 = grayPaintScale7.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale13 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean14 = grayPaintScale7.equals((java.lang.Object) 0.0d);
        double double15 = grayPaintScale7.getUpperBound();
        java.awt.Paint paint17 = grayPaintScale7.getPaint(1.0d);
        boolean boolean18 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        java.lang.Object obj19 = grayPaintScale2.clone();
        double double20 = grayPaintScale2.getLowerBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj19", grayPaintScale2.equals(obj19) ? grayPaintScale2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale0 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean2 = grayPaintScale0.equals((java.lang.Object) "hi!");
        double double3 = grayPaintScale0.getLowerBound();
        java.awt.Paint paint5 = grayPaintScale0.getPaint((double) 0);
        double double6 = grayPaintScale0.getUpperBound();
        java.lang.Object obj7 = grayPaintScale0.clone();
        java.lang.Object obj8 = grayPaintScale0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale0 and obj7", grayPaintScale0.equals(obj7) ? grayPaintScale0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double3 = grayPaintScale2.getLowerBound();
        boolean boolean5 = grayPaintScale2.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint7 = grayPaintScale2.getPaint((double) (short) 0);
        java.awt.Paint paint9 = grayPaintScale2.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale12 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) '4');
        java.awt.Paint paint14 = grayPaintScale12.getPaint(35.0d);
        boolean boolean15 = grayPaintScale2.equals((java.lang.Object) grayPaintScale12);
        double double16 = grayPaintScale2.getUpperBound();
        java.lang.Object obj17 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale18 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean20 = grayPaintScale18.equals((java.lang.Object) "hi!");
        double double21 = grayPaintScale18.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale24 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean25 = grayPaintScale18.equals((java.lang.Object) 0.0d);
        double double26 = grayPaintScale18.getUpperBound();
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = grayPaintScale18.equals(obj27);
        double double29 = grayPaintScale18.getLowerBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale32 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100.0f);
        boolean boolean33 = grayPaintScale18.equals((java.lang.Object) grayPaintScale32);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale36 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) '4');
        double double37 = grayPaintScale36.getUpperBound();
        boolean boolean38 = grayPaintScale18.equals((java.lang.Object) double37);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale41 = new org.jfree.chart.renderer.GrayPaintScale((double) 0L, (double) 10);
        double double42 = grayPaintScale41.getLowerBound();
        boolean boolean43 = grayPaintScale18.equals((java.lang.Object) grayPaintScale41);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale46 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double47 = grayPaintScale46.getLowerBound();
        boolean boolean48 = grayPaintScale18.equals((java.lang.Object) grayPaintScale46);
        java.lang.Object obj49 = grayPaintScale18.clone();
        boolean boolean50 = grayPaintScale2.equals(obj49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj17", grayPaintScale2.equals(obj17) ? grayPaintScale2.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, (double) (short) 10);
        java.lang.Object obj3 = grayPaintScale2.clone();
        double double4 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 0.0f);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        java.awt.Paint paint6 = grayPaintScale2.getPaint((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), 0.0d);
        java.lang.Object obj3 = grayPaintScale2.clone();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj3", grayPaintScale2.equals(obj3) ? grayPaintScale2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(97.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        double double5 = grayPaintScale2.getUpperBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) 'a');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) 1.0f, 10.0d);
        double double6 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double10 = grayPaintScale9.getLowerBound();
        boolean boolean12 = grayPaintScale9.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint14 = grayPaintScale9.getPaint((double) (short) 0);
        java.awt.Paint paint16 = grayPaintScale9.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale17 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean19 = grayPaintScale17.equals((java.lang.Object) "hi!");
        double double20 = grayPaintScale17.getLowerBound();
        java.awt.Paint paint22 = grayPaintScale17.getPaint((double) 0);
        boolean boolean23 = grayPaintScale9.equals((java.lang.Object) grayPaintScale17);
        double double24 = grayPaintScale17.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale27 = new org.jfree.chart.renderer.GrayPaintScale(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass28 = grayPaintScale27.getClass();
        boolean boolean29 = grayPaintScale17.equals((java.lang.Object) grayPaintScale27);
        boolean boolean30 = grayPaintScale5.equals((java.lang.Object) grayPaintScale17);
        java.lang.Object obj31 = null;
        boolean boolean32 = grayPaintScale17.equals(obj31);
        boolean boolean33 = grayPaintScale2.equals((java.lang.Object) boolean32);
        java.lang.Object obj34 = grayPaintScale2.clone();
        java.awt.Paint paint36 = grayPaintScale2.getPaint((double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj34", grayPaintScale2.equals(obj34) ? grayPaintScale2.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1L), (double) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale5 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1), (double) (short) 100);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale8 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        double double9 = grayPaintScale8.getLowerBound();
        boolean boolean11 = grayPaintScale8.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint13 = grayPaintScale8.getPaint((double) (short) 0);
        java.awt.Paint paint15 = grayPaintScale8.getPaint((double) 0.0f);
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean18 = grayPaintScale16.equals((java.lang.Object) "hi!");
        double double19 = grayPaintScale16.getLowerBound();
        java.awt.Paint paint21 = grayPaintScale16.getPaint((double) 0);
        boolean boolean22 = grayPaintScale8.equals((java.lang.Object) grayPaintScale16);
        boolean boolean24 = grayPaintScale8.equals((java.lang.Object) (byte) 1);
        double double25 = grayPaintScale8.getLowerBound();
        boolean boolean27 = grayPaintScale8.equals((java.lang.Object) (byte) 10);
        java.awt.Paint paint29 = grayPaintScale8.getPaint((double) (byte) 0);
        boolean boolean30 = grayPaintScale5.equals((java.lang.Object) (byte) 0);
        double double31 = grayPaintScale5.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale34 = new org.jfree.chart.renderer.GrayPaintScale((double) (short) -1, (double) 10L);
        java.awt.Paint paint36 = grayPaintScale34.getPaint((double) 0);
        double double37 = grayPaintScale34.getUpperBound();
        java.awt.Paint paint39 = grayPaintScale34.getPaint((double) 10L);
        java.awt.Paint paint41 = grayPaintScale34.getPaint((double) 0L);
        java.awt.Paint paint43 = grayPaintScale34.getPaint((double) 10.0f);
        boolean boolean44 = grayPaintScale5.equals((java.lang.Object) paint43);
        boolean boolean45 = grayPaintScale2.equals((java.lang.Object) paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale5", grayPaintScale2.equals(grayPaintScale5) ? grayPaintScale2.hashCode() == grayPaintScale5.hashCode() : true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale(1.0d, (double) (byte) 100);
        double double3 = grayPaintScale2.getUpperBound();
        double double4 = grayPaintScale2.getUpperBound();
        java.lang.Object obj5 = grayPaintScale2.clone();
        java.lang.Class<?> wildcardClass6 = grayPaintScale2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj5", grayPaintScale2.equals(obj5) ? grayPaintScale2.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((double) 1L, (double) 10.0f);
        double double3 = grayPaintScale2.getLowerBound();
        java.lang.Object obj4 = grayPaintScale2.clone();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale7 = new org.jfree.chart.renderer.GrayPaintScale((double) (byte) -1, (double) 1);
        java.lang.Object obj8 = grayPaintScale7.clone();
        boolean boolean9 = grayPaintScale2.equals((java.lang.Object) grayPaintScale7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and obj4", grayPaintScale2.equals(obj4) ? grayPaintScale2.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale2 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        java.awt.Paint paint4 = grayPaintScale2.getPaint((double) 0.0f);
        double double5 = grayPaintScale2.getUpperBound();
        double double6 = grayPaintScale2.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale9 = new org.jfree.chart.renderer.GrayPaintScale((double) (-1.0f), (double) ' ');
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale10 = new org.jfree.chart.renderer.GrayPaintScale();
        boolean boolean12 = grayPaintScale10.equals((java.lang.Object) "hi!");
        double double13 = grayPaintScale10.getUpperBound();
        org.jfree.chart.renderer.GrayPaintScale grayPaintScale16 = new org.jfree.chart.renderer.GrayPaintScale((-1.0d), 0.0d);
        boolean boolean17 = grayPaintScale10.equals((java.lang.Object) 0.0d);
        boolean boolean18 = grayPaintScale9.equals((java.lang.Object) 0.0d);
        boolean boolean20 = grayPaintScale9.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = grayPaintScale2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on grayPaintScale2 and grayPaintScale16", grayPaintScale2.equals(grayPaintScale16) ? grayPaintScale2.hashCode() == grayPaintScale16.hashCode() : true);
    }
}

